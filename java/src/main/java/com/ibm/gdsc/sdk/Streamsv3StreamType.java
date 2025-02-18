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
 * StreamType defines type of stream.
 */
@JsonAdapter(Streamsv3StreamType.Adapter.class)
public enum Streamsv3StreamType {
  
  AWS_KINESIS("AWS_KINESIS"),
  
  AZURE_EH("AZURE_EH");

  private String value;

  Streamsv3StreamType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Streamsv3StreamType fromValue(String value) {
    for (Streamsv3StreamType b : Streamsv3StreamType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Streamsv3StreamType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Streamsv3StreamType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Streamsv3StreamType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Streamsv3StreamType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Streamsv3StreamType.fromValue(value);
  }
}

