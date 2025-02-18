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
 * OptionType - available option types.
 */
@JsonAdapter(Reportsv3OptionType.Adapter.class)
public enum Reportsv3OptionType {
  
  UNDEFINED_OPTION_TYPE("UNDEFINED_OPTION_TYPE"),
  
  AND("AND"),
  
  OR("OR");

  private String value;

  Reportsv3OptionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3OptionType fromValue(String value) {
    for (Reportsv3OptionType b : Reportsv3OptionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3OptionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3OptionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3OptionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3OptionType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3OptionType.fromValue(value);
  }
}

