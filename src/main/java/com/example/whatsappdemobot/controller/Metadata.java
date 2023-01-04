package com.example.whatsappdemobot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"display_phone_number",
"phone_number_id"
})
@Generated("jsonschema2pojo")
public class Metadata {

@JsonProperty("display_phone_number")
private String displayPhoneNumber;
@JsonProperty("phone_number_id")
private String phoneNumberId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("display_phone_number")
public String getDisplayPhoneNumber() {
return displayPhoneNumber;
}

@JsonProperty("display_phone_number")
public void setDisplayPhoneNumber(String displayPhoneNumber) {
this.displayPhoneNumber = displayPhoneNumber;
}

@JsonProperty("phone_number_id")
public String getPhoneNumberId() {
return phoneNumberId;
}

@JsonProperty("phone_number_id")
public void setPhoneNumberId(String phoneNumberId) {
this.phoneNumberId = phoneNumberId;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
