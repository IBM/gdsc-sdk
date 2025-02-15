/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
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
 * This defines STAP operation.   - STAP_REINITIALIZE_BUFFER: STAP operation to reinitialize buffer.  - STAP_CONSOLE_MESSAGE: STAP operation to run a console command.
 */
@JsonAdapter(Connectionsv3StapOperation.Adapter.class)
public enum Connectionsv3StapOperation {
  
  REINITIALIZE_BUFFER("STAP_REINITIALIZE_BUFFER"),
  
  CONSOLE_MESSAGE("STAP_CONSOLE_MESSAGE");

  private String value;

  Connectionsv3StapOperation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Connectionsv3StapOperation fromValue(String value) {
    for (Connectionsv3StapOperation b : Connectionsv3StapOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Connectionsv3StapOperation> {
    @Override
    public void write(final JsonWriter jsonWriter, final Connectionsv3StapOperation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Connectionsv3StapOperation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Connectionsv3StapOperation.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Connectionsv3StapOperation.fromValue(value);
  }
}

