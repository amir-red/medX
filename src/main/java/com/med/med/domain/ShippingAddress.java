package com.med.med.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class ShippingAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(unique = true, name = "presta_shop_id")
    private String prestaShopId;

    @Column(unique = true, name = "eshop_address_id")
    private String eshopAddressId;

    @OneToOne
    private Customer customer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrestaShopId() {
        return prestaShopId;
    }

    public void setPrestaShopId(String prestaShopId) {
        this.prestaShopId = prestaShopId;
    }

    public String getEshopAddressId() {
        return eshopAddressId;
    }

    public void setEshopAddressId(String eshopAddressId) {
        this.eshopAddressId = eshopAddressId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
