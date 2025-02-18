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
 * OrderBy - order by options.
 */
@JsonAdapter(Reportsv3OrderBy.Adapter.class)
public enum Reportsv3OrderBy {
  
  UNDEFINED_ORDER_BY("UNDEFINED_ORDER_BY"),
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  Reportsv3OrderBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3OrderBy fromValue(String value) {
    for (Reportsv3OrderBy b : Reportsv3OrderBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3OrderBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3OrderBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3OrderBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3OrderBy.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3OrderBy.fromValue(value);
  }
}

