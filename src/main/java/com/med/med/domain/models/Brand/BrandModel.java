package com.med.med.domain.models.Brand;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.med.med.domain.models.EShopModel;
import com.med.med.domain.models.PrestaShopModel;

public class BrandModel {

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("website")
    private String website;

    @JsonProperty("eshopinfo")
    private EShopModel eshopInfo;

    @JsonProperty("prestashopInfo")
    private PrestaShopModel prestashopInfo;

    @JsonProperty("appId")
    private String appId;

    @JsonProperty("webId")
    private String webId;


    @JsonProperty("aboutDescription")
    private String aboutDescription;

    @JsonProperty("brand_image")
    private String brand_image;

    @JsonProperty("menu_pro_plugin")
    private boolean menu_pro_plugin;

    @JsonProperty("feedback_plugin")
    private boolean feedback_plugin;

    @JsonProperty("id")
    private String id;

    @JsonProperty("brandManagerId")
    private String brandManagerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public EShopModel getEshopInfo() {
        return eshopInfo;
    }

    public void setEshopInfo(EShopModel eshopInfo) {
        this.eshopInfo = eshopInfo;
    }

    public PrestaShopModel getPrestashopInfo() {
        return prestashopInfo;
    }

    public void setPrestashopInfo(PrestaShopModel prestashopInfo) {
        this.prestashopInfo = prestashopInfo;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getWebId() {
        return webId;
    }

    public void setWebId(String webId) {
        this.webId = webId;
    }

    public String getAboutDescription() {
        return aboutDescription;
    }

    public void setAboutDescription(String aboutDescription) {
        this.aboutDescription = aboutDescription;
    }

    public String getBrand_image() {
        return brand_image;
    }

    public void setBrand_image(String brand_image) {
        this.brand_image = brand_image;
    }

    public boolean isMenu_pro_plugin() {
        return menu_pro_plugin;
    }

    public void setMenu_pro_plugin(boolean menu_pro_plugin) {
        this.menu_pro_plugin = menu_pro_plugin;
    }

    public boolean isFeedback_plugin() {
        return feedback_plugin;
    }

    public void setFeedback_plugin(boolean feedback_plugin) {
        this.feedback_plugin = feedback_plugin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandManagerId() {
        return brandManagerId;
    }

    public void setBrandManagerId(String brandManagerId) {
        this.brandManagerId = brandManagerId;
    }
}
