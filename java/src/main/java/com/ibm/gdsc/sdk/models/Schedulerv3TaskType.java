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
 * Gets or Sets schedulerv3TaskType
 */
@JsonAdapter(Schedulerv3TaskType.Adapter.class)
public enum Schedulerv3TaskType {
  
  UNDEFINED_JOBTYPE("UNDEFINED_JOBTYPE"),
  
  REPORT("REPORT"),
  
  DATA_IMPORT("DATA_IMPORT"),
  
  GROUP_IMPORT("GROUP_IMPORT"),
  
  CLASSIFIER("CLASSIFIER"),
  
  VULNERABILITY_ASSESSMENT("VULNERABILITY_ASSESSMENT"),
  
  VULNERABILITY_ROLLUP("VULNERABILITY_ROLLUP"),
  
  DATA_EXPORT("DATA_EXPORT"),
  
  ALIAS_REPOPULATE("ALIAS_REPOPULATE"),
  
  WORKFLOW_CREATE("WORKFLOW_CREATE"),
  
  EVENT("EVENT");

  private String value;

  Schedulerv3TaskType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Schedulerv3TaskType fromValue(String value) {
    for (Schedulerv3TaskType b : Schedulerv3TaskType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Schedulerv3TaskType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Schedulerv3TaskType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Schedulerv3TaskType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Schedulerv3TaskType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Schedulerv3TaskType.fromValue(value);
  }
}

