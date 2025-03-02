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
 * Origin denotes the data source for the template.
 */
@JsonAdapter(Templatesv3Origin.Adapter.class)
public enum Templatesv3Origin {
  
  UNDEFINED_ORIGIN("UNDEFINED_ORIGIN"),
  
  GENERAL_NOTIFICATION("GENERAL_NOTIFICATION"),
  
  ANOMALY_NOTIFICATION("ANOMALY_NOTIFICATION"),
  
  DATAMART_NOTIFICATION("DATAMART_NOTIFICATION"),
  
  FETCH_NOTIFICATION("FETCH_NOTIFICATION"),
  
  POLICY_ALERT_NOTIFICATION("POLICY_ALERT_NOTIFICATION"),
  
  RECOMMENDATION_NOTIFICATION("RECOMMENDATION_NOTIFICATION"),
  
  REPORTS_NOTIFICATION("REPORTS_NOTIFICATION"),
  
  SCHEDULED_REPORT_NOTIFICATION("SCHEDULED_REPORT_NOTIFICATION"),
  
  SCHEDULED_AUDIT_NOTIFICATION("SCHEDULED_AUDIT_NOTIFICATION"),
  
  WELCOME_NOTIFICATION("WELCOME_NOTIFICATION"),
  
  EMAIL_HEADER_AND_FOOTER("EMAIL_HEADER_AND_FOOTER"),
  
  RISK_NOTIFICATION("RISK_NOTIFICATION"),
  
  SCHEDULED_JOB_SUMMARY("SCHEDULED_JOB_SUMMARY"),
  
  INCIDENT_NOTIFICATION("INCIDENT_NOTIFICATION"),
  
  MAINTENANCE_NOTIFICATION("MAINTENANCE_NOTIFICATION"),
  
  QSPM_RISK("QSPM_RISK"),
  
  POLICY_IMPORT_NOTIFICATION("POLICY_IMPORT_NOTIFICATION");

  private String value;

  Templatesv3Origin(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Templatesv3Origin fromValue(String value) {
    for (Templatesv3Origin b : Templatesv3Origin.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Templatesv3Origin> {
    @Override
    public void write(final JsonWriter jsonWriter, final Templatesv3Origin enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Templatesv3Origin read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Templatesv3Origin.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Templatesv3Origin.fromValue(value);
  }
}

