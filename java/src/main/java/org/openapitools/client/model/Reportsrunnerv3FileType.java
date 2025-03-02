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
 * FileType - available export file types.
 */
@JsonAdapter(Reportsrunnerv3FileType.Adapter.class)
public enum Reportsrunnerv3FileType {
  
  UNDEFINED_FILE_TYPE("UNDEFINED_FILE_TYPE"),
  
  CSV("CSV"),
  
  PDF("PDF");

  private String value;

  Reportsrunnerv3FileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsrunnerv3FileType fromValue(String value) {
    for (Reportsrunnerv3FileType b : Reportsrunnerv3FileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsrunnerv3FileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsrunnerv3FileType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsrunnerv3FileType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsrunnerv3FileType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsrunnerv3FileType.fromValue(value);
  }
}

