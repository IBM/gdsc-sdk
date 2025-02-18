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
 * Order type.
 */
@JsonAdapter(Ecosystemv3OrderType.Adapter.class)
public enum Ecosystemv3OrderType {
  
  NONE("NONE"),
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  Ecosystemv3OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Ecosystemv3OrderType fromValue(String value) {
    for (Ecosystemv3OrderType b : Ecosystemv3OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Ecosystemv3OrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Ecosystemv3OrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Ecosystemv3OrderType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Ecosystemv3OrderType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Ecosystemv3OrderType.fromValue(value);
  }
}

