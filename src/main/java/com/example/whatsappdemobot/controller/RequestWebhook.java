package com.example.whatsappdemobot.controller;

import java.util.HashMap;
import java.util.List;
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
"object",
"entry"
})
@Generated("jsonschema2pojo")
public class RequestWebhook {
	
	@JsonProperty("object")
	private String object;
	@JsonProperty("entry")
	private List<Entry> entry = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("object")
	public String getObject() {
		return object;
	}
	
	@JsonProperty("object")
	public void setObject(String object) {
		this.object = object;
	}
	
	@JsonProperty("entry")
	public List<Entry> getEntry() {
		return entry;
	}
	
	@JsonProperty("entry")
	public void setEntry(List<Entry> entry) {
		this.entry = entry;
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
