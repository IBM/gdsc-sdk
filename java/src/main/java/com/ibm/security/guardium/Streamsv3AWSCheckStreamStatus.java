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
 * AWSCheckStreamStatus defines status code for AWS stream check result.
 */
@JsonAdapter(Streamsv3AWSCheckStreamStatus.Adapter.class)
public enum Streamsv3AWSCheckStreamStatus {
  
  OK("STREAM_OK"),
  
  AUTHENTICATION_FAILED("STREAM_AUTHENTICATION_FAILED"),
  
  NOT_FOUND("STREAM_NOT_FOUND");

  private String value;

  Streamsv3AWSCheckStreamStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Streamsv3AWSCheckStreamStatus fromValue(String value) {
    for (Streamsv3AWSCheckStreamStatus b : Streamsv3AWSCheckStreamStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Streamsv3AWSCheckStreamStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final Streamsv3AWSCheckStreamStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Streamsv3AWSCheckStreamStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Streamsv3AWSCheckStreamStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Streamsv3AWSCheckStreamStatus.fromValue(value);
  }
}

