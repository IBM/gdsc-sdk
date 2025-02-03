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
 * - LEVEL_UNKNOWN: no info about risk/criticality involved  - LEVEL_NONE: no risk/criticality involed  - LEVEL_LOW: low risk/criticality involed  - LEVEL_MEDIUM: medium risk/criticality involed  - LEVEL_HIGH: high risk/criticality involed  - LEVEL_CRITICAL: critical risk/criticality involed
 */
@JsonAdapter(Assetsv3Level.Adapter.class)
public enum Assetsv3Level {
  
  UNKNOWN("LEVEL_UNKNOWN"),
  
  NONE("LEVEL_NONE"),
  
  LOW("LEVEL_LOW"),
  
  MEDIUM("LEVEL_MEDIUM"),
  
  HIGH("LEVEL_HIGH"),
  
  CRITICAL("LEVEL_CRITICAL");

  private String value;

  Assetsv3Level(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Assetsv3Level fromValue(String value) {
    for (Assetsv3Level b : Assetsv3Level.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Assetsv3Level> {
    @Override
    public void write(final JsonWriter jsonWriter, final Assetsv3Level enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Assetsv3Level read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Assetsv3Level.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Assetsv3Level.fromValue(value);
  }
}

