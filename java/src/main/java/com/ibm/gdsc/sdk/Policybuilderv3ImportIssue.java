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
 * Gets or Sets policybuilderv3ImportIssue
 */
@JsonAdapter(Policybuilderv3ImportIssue.Adapter.class)
public enum Policybuilderv3ImportIssue {
  
  NO_IMPORT_ISSUE("NO_IMPORT_ISSUE"),
  
  INVALID_PARAMS("INVALID_PARAMS"),
  
  INVALID_ACTIONS("INVALID_ACTIONS"),
  
  INVALID_PARAMS_AND_ACTIONS("INVALID_PARAMS_AND_ACTIONS"),
  
  INVALID_RULE("INVALID_RULE"),
  
  INTERNAL_ERR("INTERNAL_ERR"),
  
  NO_RULES("NO_RULES"),
  
  COMMUNICATION_ERR("COMMUNICATION_ERR"),
  
  UNSUPPORTED_ACTION("UNSUPPORTED_ACTION"),
  
  UNSUPPORTED_PARAMS("UNSUPPORTED_PARAMS"),
  
  UNSUPPORTED_PARAMS_AND_ACTIONS("UNSUPPORTED_PARAMS_AND_ACTIONS");

  private String value;

  Policybuilderv3ImportIssue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Policybuilderv3ImportIssue fromValue(String value) {
    for (Policybuilderv3ImportIssue b : Policybuilderv3ImportIssue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Policybuilderv3ImportIssue> {
    @Override
    public void write(final JsonWriter jsonWriter, final Policybuilderv3ImportIssue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Policybuilderv3ImportIssue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Policybuilderv3ImportIssue.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Policybuilderv3ImportIssue.fromValue(value);
  }
}

