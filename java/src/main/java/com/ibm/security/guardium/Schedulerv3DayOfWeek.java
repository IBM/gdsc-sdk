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
 * DayOfWeek is which day of the week.
 */
@JsonAdapter(Schedulerv3DayOfWeek.Adapter.class)
public enum Schedulerv3DayOfWeek {
  
  UNDEFINED_DAY("UNDEFINED_DAY"),
  
  SUNDAY("SUNDAY"),
  
  MONDAY("MONDAY"),
  
  TUESDAY("TUESDAY"),
  
  WEDNESDAY("WEDNESDAY"),
  
  THURSDAY("THURSDAY"),
  
  FRIDAY("FRIDAY"),
  
  SATURDAY("SATURDAY");

  private String value;

  Schedulerv3DayOfWeek(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Schedulerv3DayOfWeek fromValue(String value) {
    for (Schedulerv3DayOfWeek b : Schedulerv3DayOfWeek.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Schedulerv3DayOfWeek> {
    @Override
    public void write(final JsonWriter jsonWriter, final Schedulerv3DayOfWeek enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Schedulerv3DayOfWeek read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Schedulerv3DayOfWeek.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Schedulerv3DayOfWeek.fromValue(value);
  }
}

