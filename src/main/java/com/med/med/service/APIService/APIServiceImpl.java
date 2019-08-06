package com.med.med.service.APIService;

import com.med.med.domain.Customer;
import com.med.med.domain.models.Brand.BrandModel;
import com.med.med.domain.models.CustomerModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

import static java.nio.charset.StandardCharsets.UTF_8;

@Service
public class APIServiceImpl implements APIService {

    private WebClient webClient;

    @PostConstruct
    public void init(){
        webClient = WebClient.builder().baseUrl("http://173.249.18.184:7878/api/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Mono<CustomerModel> getCustomer(String vertileId) {

        return webClient.get().uri("/Customers/"+vertileId)
                .header("Authorization", "Basic " + Base64Utils
                        .encodeToString(("accesstoken :rdlVliaVtPN0MmHXW2w44IGQq0jNCU1TCEq0HPpF4sYdHzCK6shSJXhAkx91kNau" ).getBytes(UTF_8)))
                .retrieve()
                .bodyToMono(CustomerModel.class);
    }

    @Override
    public Mono<BrandModel> getBrandByBrandId(String brandId) {
        return webClient.get().uri("/Brands/"+brandId)
                .header("Authorization", "Basic " + Base64Utils
                        .encodeToString(("accesstoken :rdlVliaVtPN0MmHXW2w44IGQq0jNCU1TCEq0HPpF4sYdHzCK6shSJXhAkx91kNau" ).getBytes(UTF_8)))
                .retrieve()
                .bodyToMono(BrandModel.class);
    }

    @Override
    public Mono<String> getCustomerString(String vertileId) {

        return webClient.get().uri("/Customers/"+vertileId)
                .header("Authorization", "Basic " + Base64Utils
                        .encodeToString(("accesstoken :rdlVliaVtPN0MmHXW2w44IGQq0jNCU1TCEq0HPpF4sYdHzCK6shSJXhAkx91kNau" ).getBytes(UTF_8)))
                .retrieve()
                .bodyToMono(String.class);
    }
}
