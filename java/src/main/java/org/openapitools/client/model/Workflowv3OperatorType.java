/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * OperatorType - available field operators.
 */
@JsonAdapter(Workflowv3OperatorType.Adapter.class)
public enum Workflowv3OperatorType {
  
  UNDEFINED_OPERATOR_TYPE("UNDEFINED_OPERATOR_TYPE"),
  
  EQUAL("EQUAL"),
  
  NOT_EQUAL("NOT_EQUAL"),
  
  LIKE("LIKE"),
  
  NOT_LIKE("NOT_LIKE");

  private String value;

  Workflowv3OperatorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Workflowv3OperatorType fromValue(String value) {
    for (Workflowv3OperatorType b : Workflowv3OperatorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Workflowv3OperatorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Workflowv3OperatorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Workflowv3OperatorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Workflowv3OperatorType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Workflowv3OperatorType.fromValue(value);
  }
}

