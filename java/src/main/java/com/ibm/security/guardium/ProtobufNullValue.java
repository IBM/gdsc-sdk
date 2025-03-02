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
 * &#x60;NullValue&#x60; is a singleton enumeration to represent the null value for the &#x60;Value&#x60; type union.   The JSON representation for &#x60;NullValue&#x60; is JSON &#x60;null&#x60;.   - NULL_VALUE: Null value.
 */
@JsonAdapter(ProtobufNullValue.Adapter.class)
public enum ProtobufNullValue {
  
  NULL_VALUE("NULL_VALUE");

  private String value;

  ProtobufNullValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProtobufNullValue fromValue(String value) {
    for (ProtobufNullValue b : ProtobufNullValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProtobufNullValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProtobufNullValue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProtobufNullValue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProtobufNullValue.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ProtobufNullValue.fromValue(value);
  }
}

