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
 * How to match the filter field.   - IGNORE: Ignore the filter field and remove from the query (needed for Swagger).  - EQUALS: Document value equals filter value.  - NOT_EQUALS: Document value does not equal filter value.  - GREATER_THAN: Document value is greater than filter value.  - LESS_THAN: Document value is greater than filter value.  - ANY_VALUE: Document value can be any value.
 */
@JsonAdapter(Workflowv3FilterOperator.Adapter.class)
public enum Workflowv3FilterOperator {
  
  IGNORE("IGNORE"),
  
  EQUALS("EQUALS"),
  
  NOT_EQUALS("NOT_EQUALS"),
  
  GREATER_THAN("GREATER_THAN"),
  
  LESS_THAN("LESS_THAN"),
  
  ANY_VALUE("ANY_VALUE");

  private String value;

  Workflowv3FilterOperator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Workflowv3FilterOperator fromValue(String value) {
    for (Workflowv3FilterOperator b : Workflowv3FilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Workflowv3FilterOperator> {
    @Override
    public void write(final JsonWriter jsonWriter, final Workflowv3FilterOperator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Workflowv3FilterOperator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Workflowv3FilterOperator.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Workflowv3FilterOperator.fromValue(value);
  }
}

