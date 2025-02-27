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
 * ParameterType - available parameter types.
 */
@JsonAdapter(Reportsv3ParameterType.Adapter.class)
public enum Reportsv3ParameterType {
  
  UNDEFINED_PARAM_TYPE("UNDEFINED_PARAM_TYPE"),
  
  FREE_TEXT("FREE_TEXT"),
  
  PARAMETER("PARAMETER"),
  
  ATTRIBUTE("ATTRIBUTE");

  private String value;

  Reportsv3ParameterType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3ParameterType fromValue(String value) {
    for (Reportsv3ParameterType b : Reportsv3ParameterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3ParameterType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3ParameterType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3ParameterType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3ParameterType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3ParameterType.fromValue(value);
  }
}

