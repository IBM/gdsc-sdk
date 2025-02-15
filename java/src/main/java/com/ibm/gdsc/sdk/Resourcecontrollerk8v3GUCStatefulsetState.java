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
 * Gets or Sets resourcecontrollerk8v3GUCStatefulsetState
 */
@JsonAdapter(Resourcecontrollerk8v3GUCStatefulsetState.Adapter.class)
public enum Resourcecontrollerk8v3GUCStatefulsetState {
  
  READY("READY"),
  
  MISSING_RESOURCE("MISSING_RESOURCE"),
  
  UNKNOWN_ERROR("UNKNOWN_ERROR");

  private String value;

  Resourcecontrollerk8v3GUCStatefulsetState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Resourcecontrollerk8v3GUCStatefulsetState fromValue(String value) {
    for (Resourcecontrollerk8v3GUCStatefulsetState b : Resourcecontrollerk8v3GUCStatefulsetState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Resourcecontrollerk8v3GUCStatefulsetState> {
    @Override
    public void write(final JsonWriter jsonWriter, final Resourcecontrollerk8v3GUCStatefulsetState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Resourcecontrollerk8v3GUCStatefulsetState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Resourcecontrollerk8v3GUCStatefulsetState.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Resourcecontrollerk8v3GUCStatefulsetState.fromValue(value);
  }
}

