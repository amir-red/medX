package com.med.med.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    private long id;

    @Column(unique = true, name = "presta_shop_id")
    @XmlElement
    private String prestaShopAddressId;

    @Column(unique = true, name = "eshop_address_id")
    @XmlElement
    private String eshopAddressId;

    @OneToOne
    private Customer customer;

    public InvoiceAddress(){

    }
    public InvoiceAddress(String prestaShopAddressId,String eshopAddressId){
        super();
        this.prestaShopAddressId = prestaShopAddressId;
        this.eshopAddressId = eshopAddressId;
        this.customer = customer;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrestaShopAddressId() {
        return prestaShopAddressId;
    }

    public void setPrestaShopAddressId(String prestaShopAddressId) {
        this.prestaShopAddressId = prestaShopAddressId;
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
