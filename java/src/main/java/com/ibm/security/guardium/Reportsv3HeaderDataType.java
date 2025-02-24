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


package com.ibm.security.guardium;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * HeaderDataType - available report header types.
 */
@JsonAdapter(Reportsv3HeaderDataType.Adapter.class)
public enum Reportsv3HeaderDataType {
  
  UNDEFINED_REPORT_HEADER_TYPE("UNDEFINED_REPORT_HEADER_TYPE"),
  
  TABLE_HEADER("TABLE_HEADER"),
  
  COUNT_ALL("COUNT_ALL"),
  
  LITERAL("LITERAL");

  private String value;

  Reportsv3HeaderDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3HeaderDataType fromValue(String value) {
    for (Reportsv3HeaderDataType b : Reportsv3HeaderDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3HeaderDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3HeaderDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3HeaderDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3HeaderDataType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3HeaderDataType.fromValue(value);
  }
}

