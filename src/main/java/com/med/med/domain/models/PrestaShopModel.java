package com.med.med.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrestaShopModel {

    @JsonProperty("PRESTASHOP_BASE_URL")
    private String PRESTASHOP_BASE_URL;

    @JsonProperty("PRESTASHOP_USERNAME_KEY")
    private String PRESTASHOP_USERNAME_KEY;

    public String getPRESTASHOP_BASE_URL() {
        return PRESTASHOP_BASE_URL;
    }

    public void setPRESTASHOP_BASE_URL(String PRESTASHOP_BASE_URL) {
        this.PRESTASHOP_BASE_URL = PRESTASHOP_BASE_URL;
    }

    public String getPRESTASHOP_USERNAME_KEY() {
        return PRESTASHOP_USERNAME_KEY;
    }

    public void setPRESTASHOP_USERNAME_KEY(String PRESTASHOP_USERNAME_KEY) {
        this.PRESTASHOP_USERNAME_KEY = PRESTASHOP_USERNAME_KEY;
    }
}
