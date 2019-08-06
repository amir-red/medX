package com.med.med.service.APIService;

import com.med.med.domain.models.Brand.BrandModel;
import com.med.med.domain.models.CustomerModel;
import reactor.core.publisher.Mono;

public interface APIService {

    Mono<CustomerModel> getCustomer(String vertileId);

    Mono<BrandModel> getBrandByBrandId(String brandId);

    Mono<String> getCustomerString(String vertileId);
}
