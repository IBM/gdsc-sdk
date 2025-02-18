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
 * DateRangeUnit - available unit types for custom-relative.
 */
@JsonAdapter(Reportsv3DateRangeUnit.Adapter.class)
public enum Reportsv3DateRangeUnit {
  
  UNDEFINED_UINT_TYPE("UNDEFINED_UINT_TYPE"),
  
  YEAR("YEAR"),
  
  MONTH("MONTH"),
  
  WEEK("WEEK"),
  
  DAY("DAY"),
  
  HOUR("HOUR"),
  
  MINUTE("MINUTE");

  private String value;

  Reportsv3DateRangeUnit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3DateRangeUnit fromValue(String value) {
    for (Reportsv3DateRangeUnit b : Reportsv3DateRangeUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3DateRangeUnit> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3DateRangeUnit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3DateRangeUnit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3DateRangeUnit.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3DateRangeUnit.fromValue(value);
  }
}

