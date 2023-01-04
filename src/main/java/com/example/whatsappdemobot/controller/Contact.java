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
"profile",
"wa_id"
})
@Generated("jsonschema2pojo")
public class Contact {

@JsonProperty("profile")
private Profile profile;
@JsonProperty("wa_id")
private String waId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("profile")
public Profile getProfile() {
return profile;
}

@JsonProperty("profile")
public void setProfile(Profile profile) {
this.profile = profile;
}

@JsonProperty("wa_id")
public String getWaId() {
return waId;
}

@JsonProperty("wa_id")
public void setWaId(String waId) {
this.waId = waId;
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