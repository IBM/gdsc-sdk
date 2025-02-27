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
 * SyncStatus type.
 */
@JsonAdapter(Policybuilderv3SyncStatusType.Adapter.class)
public enum Policybuilderv3SyncStatusType {
  
  NO_SYNC_STATUS("NO_SYNC_STATUS"),
  
  WAITING("WAITING"),
  
  ERROR("ERROR"),
  
  PROCESSING("PROCESSING"),
  
  COMPLETED("COMPLETED");

  private String value;

  Policybuilderv3SyncStatusType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Policybuilderv3SyncStatusType fromValue(String value) {
    for (Policybuilderv3SyncStatusType b : Policybuilderv3SyncStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Policybuilderv3SyncStatusType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Policybuilderv3SyncStatusType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Policybuilderv3SyncStatusType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Policybuilderv3SyncStatusType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Policybuilderv3SyncStatusType.fromValue(value);
  }
}

