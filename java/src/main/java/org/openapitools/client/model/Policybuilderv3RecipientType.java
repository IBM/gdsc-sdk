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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * For email receivers either use user name or email address.   - EMAIL: External user will receive email only  - USER: Insights user will receive notification and email  - ROLE: Insights role will receive notification only  - TICKET: Assign any work to an external ticketing service such as ServiceNow or IBM Resilient  - SYSLOG: Syslog type for notification  - SNMP: SNMP type for notification  - SLACK: SLACK alert type for notification  - TEAMS: TEAMS (Microsoft teams) alert type for notification
 */
@JsonAdapter(Policybuilderv3RecipientType.Adapter.class)
public enum Policybuilderv3RecipientType {
  
  UNDEFINED_RECTYPE("UNDEFINED_RECTYPE"),
  
  EMAIL("EMAIL"),
  
  USER("USER"),
  
  ROLE("ROLE"),
  
  TICKET("TICKET"),
  
  SYSLOG("SYSLOG"),
  
  SNMP("SNMP"),
  
  SLACK("SLACK"),
  
  TEAMS("TEAMS");

  private String value;

  Policybuilderv3RecipientType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Policybuilderv3RecipientType fromValue(String value) {
    for (Policybuilderv3RecipientType b : Policybuilderv3RecipientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Policybuilderv3RecipientType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Policybuilderv3RecipientType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Policybuilderv3RecipientType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Policybuilderv3RecipientType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Policybuilderv3RecipientType.fromValue(value);
  }
}

