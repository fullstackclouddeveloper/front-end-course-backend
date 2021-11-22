package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("street_address")
    private String streetAddress;

    @JsonProperty("street_address2")
    private String streetAddress2;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zipcode")
    private String zipcode;
}
