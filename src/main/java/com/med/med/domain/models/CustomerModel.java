package com.med.med.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerModel {

    @JsonProperty("first_name")
    private String first_name;

    @JsonProperty("last_name")
    private String last_name;

    @JsonProperty("username")
    private String username;

    @JsonProperty("presta_info")
    private float presta_info;

    @JsonProperty("subscribed")
    private boolean subscribed;

    @JsonProperty("deleted")
    private boolean deleted;

    @JsonProperty("sync_in_Progress")
    private boolean sync_in_progress;

    @JsonProperty("email")
    private String email;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private PositionModel position;

    @JsonProperty("brandId")
    private String brandId;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getPresta_info() {
        return presta_info;
    }

    public void setPresta_info(float presta_info) {
        this.presta_info = presta_info;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isSync_in_progress() {
        return sync_in_progress;
    }

    public void setSync_in_progress(boolean sync_in_progress) {
        this.sync_in_progress = sync_in_progress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PositionModel getPosition() {
        return position;
    }

    public void setPosition(PositionModel position) {
        this.position = position;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
}
