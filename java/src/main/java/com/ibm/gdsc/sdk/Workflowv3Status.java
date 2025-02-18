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
 * Case or task status.   - UNDEFINED_STATUS: Undefined.  - NEW: New case or task.  - UNDER_REVIEW: Case or task is under review.  - COMPLETE: Case or task is complete.  - READY_FOR_REVIEW: Case or task is Ready for review.  - PENDING: Pending
 */
@JsonAdapter(Workflowv3Status.Adapter.class)
public enum Workflowv3Status {
  
  UNDEFINED_STATUS("UNDEFINED_STATUS"),
  
  NEW("NEW"),
  
  UNDER_REVIEW("UNDER_REVIEW"),
  
  COMPLETE("COMPLETE"),
  
  READY_FOR_REVIEW("READY_FOR_REVIEW"),
  
  PENDING("PENDING");

  private String value;

  Workflowv3Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Workflowv3Status fromValue(String value) {
    for (Workflowv3Status b : Workflowv3Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Workflowv3Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final Workflowv3Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Workflowv3Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Workflowv3Status.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Workflowv3Status.fromValue(value);
  }
}

