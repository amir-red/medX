package com.med.med.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.med.med.domain.Customer;
import com.med.med.domain.models.Brand.BrandModel;
import com.med.med.domain.models.CustomerModel;
import com.med.med.exception.customer.CustomerDuplicateEntryException;
import com.med.med.service.APIService.APIService;
import com.med.med.service.CustomerService;
import com.med.med.utilities.Ping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

import java.io.IOException;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;


@RestController
@RequestMapping("/api/v1/")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @Autowired
    private APIService apiService;




    /*
    * URL: /api/v1/vertile/{vertileId}
    * Method: GET
    * @Param vertileId:String
    * */

    @GetMapping(value = "vertile/{vertileId}")
    public ResponseEntity addvertileId(@PathVariable String vertileId)  throws CustomerDuplicateEntryException {
        Customer customer = new Customer();
        customer.setVertileId(vertileId);
        return customerService.addvertile(customer);
    }

    /**
     * Post WebClient.retrieve() example
     * @param todo
     * @return
     */
    @GetMapping("/Customers/{vertileId}")
    public Mono<CustomerModel> getCustomerByVertileId(@PathVariable String vertileId){

        Ping ping = new Ping();
        Mono<CustomerModel> customerModel = apiService
                .getCustomer(vertileId)
                .doOnNext(res -> {
                    System.out.println("doOnNext: ---> Frist");
                    Mono<BrandModel> brand = apiService.
                            getBrandByBrandId(res.getBrandId());
                            brand.subscribe(b ->{
                                System.out.println("doOnNext: ---> second");
                                ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
                                String json = null;
                                try {
                                    json = mapper.writeValueAsString(b);
                                } catch (JsonProcessingException e) {
                                    e.printStackTrace();
                                }
                                System.out.println(json);

                                try {
                                    System.out.println(ping.getStatus(b.getPrestashopInfo().getPRESTASHOP_BASE_URL(),b.getPrestashopInfo().getPRESTASHOP_USERNAME_KEY()));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            });

                })
                .doOnError(err -> System.out.println("Outer Errorrrrrrrrrrr"));;

        //Mono<BrandModel> brand = customerModel.flatMap(cutomer -> apiService.getBrandByBrandId(cutomer.getBrandId()));


        return customerModel;
    }

    private void getBrandByBrandId(String brandId){

    }

    @GetMapping("/Customer/{vertileId}")
    public Mono<String> getCustomerBySVertileId(@PathVariable String vertileId) {

        Mono<String> customer = apiService.getCustomerString(vertileId);

        return customer;
    }

    /*
     * URL: /api/v1/prestaShop/{vertileId}
     * Method: GET
     * @Param vertileId:String
     * */
    @GetMapping(value = "prestaShop/{vertileId}/{prestaShopId}")
    public ResponseEntity addprestaShopId(@PathVariable String vertileId, @PathVariable  String prestaShopId)  throws CustomerDuplicateEntryException {
        return customerService.addprestaShopId(vertileId,prestaShopId);
    }
}
