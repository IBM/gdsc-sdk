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
 * RecipientType is for email receivers either use user name or email address.
 */
@JsonAdapter(Schedulerv3RecipientType.Adapter.class)
public enum Schedulerv3RecipientType {
  
  UNDEFINED_RECTYPE("UNDEFINED_RECTYPE"),
  
  EMAIL("EMAIL"),
  
  USER("USER"),
  
  ROLE("ROLE"),
  
  TICKET("TICKET"),
  
  SYSLOG("SYSLOG"),
  
  SNMP("SNMP"),
  
  SFTP("SFTP"),
  
  SMB("SMB"),
  
  WEBHOOK("WEBHOOK"),
  
  DISTRIBUTION("DISTRIBUTION"),
  
  SLACK("SLACK"),
  
  TEAMS("TEAMS"),
  
  SMS("SMS"),
  
  GROUP("GROUP");

  private String value;

  Schedulerv3RecipientType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Schedulerv3RecipientType fromValue(String value) {
    for (Schedulerv3RecipientType b : Schedulerv3RecipientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Schedulerv3RecipientType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Schedulerv3RecipientType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Schedulerv3RecipientType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Schedulerv3RecipientType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Schedulerv3RecipientType.fromValue(value);
  }
}

