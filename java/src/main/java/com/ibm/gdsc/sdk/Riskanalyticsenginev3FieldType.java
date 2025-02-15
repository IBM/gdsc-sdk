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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Field type - available types.
 */
@JsonAdapter(Riskanalyticsenginev3FieldType.Adapter.class)
public enum Riskanalyticsenginev3FieldType {
  
  UNDEFINED_TYPE("UNDEFINED_TYPE"),
  
  STRING("STRING"),
  
  INTEGER("INTEGER"),
  
  FLOAT("FLOAT"),
  
  DATE("DATE"),
  
  BOOLEAN("BOOLEAN"),
  
  DATE_UTC("DATE_UTC");

  private String value;

  Riskanalyticsenginev3FieldType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Riskanalyticsenginev3FieldType fromValue(String value) {
    for (Riskanalyticsenginev3FieldType b : Riskanalyticsenginev3FieldType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Riskanalyticsenginev3FieldType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Riskanalyticsenginev3FieldType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Riskanalyticsenginev3FieldType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Riskanalyticsenginev3FieldType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Riskanalyticsenginev3FieldType.fromValue(value);
  }
}

