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
 * Frequency is how often you want to run the job, by hour, daily, weekly or monthly.
 */
@JsonAdapter(Schedulerv3Frequency.Adapter.class)
public enum Schedulerv3Frequency {
  
  UNDEFINED_FREQUENCY("UNDEFINED_FREQUENCY"),
  
  HOURLY("HOURLY"),
  
  DAILY("DAILY"),
  
  WEEKLY("WEEKLY"),
  
  MONTHLY("MONTHLY");

  private String value;

  Schedulerv3Frequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Schedulerv3Frequency fromValue(String value) {
    for (Schedulerv3Frequency b : Schedulerv3Frequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Schedulerv3Frequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final Schedulerv3Frequency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Schedulerv3Frequency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Schedulerv3Frequency.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Schedulerv3Frequency.fromValue(value);
  }
}

