package com.hackathon.phoneatm.api;

/**
 * Created by sandz on 6/18/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserAcceptedPayment {


    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("accepted_user")
    @Expose
    private Integer acceptedUser;
    @SerializedName("accepted_on")
    @Expose
    private String acceptedOn;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount The amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return The acceptedUser
     */
    public Integer getAcceptedUser() {
        return acceptedUser;
    }

    /**
     * @param acceptedUser The accepted_user
     */
    public void setAcceptedUser(Integer acceptedUser) {
        this.acceptedUser = acceptedUser;
    }

    /**
     * @return The acceptedOn
     */
    public String getAcceptedOn() {
        return acceptedOn;
    }

    /**
     * @param acceptedOn The accepted_on
     */
    public void setAcceptedOn(String acceptedOn) {
        this.acceptedOn = acceptedOn;
    }

}
