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
 * Connectivity status (connectivity); after ping to UC service on openShift + checks on its health.   - UC_OK: n/n nodes are alive.  - UC_INITIALIZING: Just created, waiting till next refresh.  - UC_FAILURE: n out of n pods/nodes are failing; status text should detail (mem? storage?).  - UC_UNKNOWN: All other errors.
 */
@JsonAdapter(Universalconnectormanagerv3ConnectivityState.Adapter.class)
public enum Universalconnectormanagerv3ConnectivityState {
  
  OK("UC_OK"),
  
  INITIALIZING("UC_INITIALIZING"),
  
  FAILURE("UC_FAILURE"),
  
  UNKNOWN("UC_UNKNOWN");

  private String value;

  Universalconnectormanagerv3ConnectivityState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Universalconnectormanagerv3ConnectivityState fromValue(String value) {
    for (Universalconnectormanagerv3ConnectivityState b : Universalconnectormanagerv3ConnectivityState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Universalconnectormanagerv3ConnectivityState> {
    @Override
    public void write(final JsonWriter jsonWriter, final Universalconnectormanagerv3ConnectivityState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Universalconnectormanagerv3ConnectivityState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Universalconnectormanagerv3ConnectivityState.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Universalconnectormanagerv3ConnectivityState.fromValue(value);
  }
}

