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
 * This defines sniffer feedback status code.   - SUCCEEDED: Succeeded.  - FAILED: Failed.
 */
@JsonAdapter(Snifassistv3FeedbackStatus.Adapter.class)
public enum Snifassistv3FeedbackStatus {
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED");

  private String value;

  Snifassistv3FeedbackStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Snifassistv3FeedbackStatus fromValue(String value) {
    for (Snifassistv3FeedbackStatus b : Snifassistv3FeedbackStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Snifassistv3FeedbackStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final Snifassistv3FeedbackStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Snifassistv3FeedbackStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Snifassistv3FeedbackStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Snifassistv3FeedbackStatus.fromValue(value);
  }
}

