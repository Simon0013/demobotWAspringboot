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
"messaging_product",
"metadata",
"contacts",
"messages"
})
@Generated("jsonschema2pojo")
public class Value {

@JsonProperty("messaging_product")
private String messagingProduct;
@JsonProperty("metadata")
private Metadata metadata;
@JsonProperty("contacts")
private List<Contact> contacts = null;
@JsonProperty("messages")
private List<Message> messages = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("messaging_product")
public String getMessagingProduct() {
return messagingProduct;
}

@JsonProperty("messaging_product")
public void setMessagingProduct(String messagingProduct) {
this.messagingProduct = messagingProduct;
}

@JsonProperty("metadata")
public Metadata getMetadata() {
return metadata;
}

@JsonProperty("metadata")
public void setMetadata(Metadata metadata) {
this.metadata = metadata;
}

@JsonProperty("contacts")
public List<Contact> getContacts() {
return contacts;
}

@JsonProperty("contacts")
public void setContacts(List<Contact> contacts) {
this.contacts = contacts;
}

@JsonProperty("messages")
public List<Message> getMessages() {
return messages;
}

@JsonProperty("messages")
public void setMessages(List<Message> messages) {
this.messages = messages;
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