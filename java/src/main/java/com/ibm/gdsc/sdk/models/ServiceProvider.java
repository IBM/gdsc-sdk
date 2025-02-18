/*
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * service providers identifier
 */
@JsonAdapter(ServiceProvider.Adapter.class)
public enum ServiceProvider {
  
  AWS("aws"),
  
  GCP("gcp"),
  
  AZURE("azure"),
  
  GOOGLE_WORKSPACE("google-workspace"),
  
  SLACK("slack"),
  
  OFFICE365("office365"),
  
  ATLASSIAN_JIRA("atlassian-jira"),
  
  ATLASSIAN_CONFLUENCE("atlassian-confluence"),
  
  SALESFORCE("salesforce");

  private String value;

  ServiceProvider(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServiceProvider fromValue(String value) {
    for (ServiceProvider b : ServiceProvider.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ServiceProvider> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServiceProvider enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServiceProvider read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ServiceProvider.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ServiceProvider.fromValue(value);
  }
}

