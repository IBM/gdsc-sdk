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
 * DateRangeType - available date range types.
 */
@JsonAdapter(Reportsv3DateRangeType.Adapter.class)
public enum Reportsv3DateRangeType {
  
  UNDEFINED_DATE_RANGE_TYPE("UNDEFINED_DATE_RANGE_TYPE"),
  
  LAST_3_H("LAST_3_H"),
  
  LAST_24_H("LAST_24_H"),
  
  YESTERDAY("YESTERDAY"),
  
  PREVIOUS_1_W("PREVIOUS_1_W"),
  
  LAST_7_D("LAST_7_D"),
  
  LAST_30_D("LAST_30_D"),
  
  LAST_90_D("LAST_90_D"),
  
  CUSTOM("CUSTOM"),
  
  CUSTOM_RELATIVE("CUSTOM_RELATIVE");

  private String value;

  Reportsv3DateRangeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3DateRangeType fromValue(String value) {
    for (Reportsv3DateRangeType b : Reportsv3DateRangeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3DateRangeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3DateRangeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3DateRangeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3DateRangeType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3DateRangeType.fromValue(value);
  }
}

