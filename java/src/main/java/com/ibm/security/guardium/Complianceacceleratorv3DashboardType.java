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
 * Dashboard type enums.
 */
@JsonAdapter(Complianceacceleratorv3DashboardType.Adapter.class)
public enum Complianceacceleratorv3DashboardType {
  
  UNDEFINED_DASH("UNDEFINED_DASH"),
  
  CCPA_REPORTS_DASH("CCPA_REPORTS_DASH"),
  
  SECURITY_REPORTS_DASH("SECURITY_REPORTS_DASH"),
  
  GDPR_REPORTS_DASH("GDPR_REPORTS_DASH"),
  
  CCPA_WORKSPACE_DASH("CCPA_WORKSPACE_DASH"),
  
  GDPR_WORKSPACE_DASH("GDPR_WORKSPACE_DASH"),
  
  SOX_WORKSPACE_DASH("SOX_WORKSPACE_DASH"),
  
  HIPAA_WORKSPACE_DASH("HIPAA_WORKSPACE_DASH"),
  
  PCI_WORKSPACE_DASH("PCI_WORKSPACE_DASH"),
  
  SOX_REPORTS_DASH("SOX_REPORTS_DASH"),
  
  HIPAA_REPORTS_DASH("HIPAA_REPORTS_DASH"),
  
  PCI_REPORTS_DASH("PCI_REPORTS_DASH");

  private String value;

  Complianceacceleratorv3DashboardType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Complianceacceleratorv3DashboardType fromValue(String value) {
    for (Complianceacceleratorv3DashboardType b : Complianceacceleratorv3DashboardType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Complianceacceleratorv3DashboardType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Complianceacceleratorv3DashboardType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Complianceacceleratorv3DashboardType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Complianceacceleratorv3DashboardType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Complianceacceleratorv3DashboardType.fromValue(value);
  }
}

