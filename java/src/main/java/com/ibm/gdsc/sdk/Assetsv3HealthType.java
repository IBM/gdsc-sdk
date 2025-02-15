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
 * HealthType : Assets Health types.   - UNSPECIFIED: Unspecified Health types.  - HEALTHY: Healthy Health types.  - UNKNOWN: Unknown Health types.  - UNHEALTHY_MINOR: Unhealthy Minor Health types.  - UNHEALTHY_MAJOR: Unhealthy major Health types.
 */
@JsonAdapter(Assetsv3HealthType.Adapter.class)
public enum Assetsv3HealthType {
  
  UNSPECIFIED("UNSPECIFIED"),
  
  HEALTHY("HEALTHY"),
  
  UNKNOWN("UNKNOWN"),
  
  UNHEALTHY_MINOR("UNHEALTHY_MINOR"),
  
  UNHEALTHY_MAJOR("UNHEALTHY_MAJOR");

  private String value;

  Assetsv3HealthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Assetsv3HealthType fromValue(String value) {
    for (Assetsv3HealthType b : Assetsv3HealthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Assetsv3HealthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Assetsv3HealthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Assetsv3HealthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Assetsv3HealthType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Assetsv3HealthType.fromValue(value);
  }
}

