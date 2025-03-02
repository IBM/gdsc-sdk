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
 * Lead type - possible lead types.
 */
@JsonAdapter(Riskanalyticsenginev3LeadType.Adapter.class)
public enum Riskanalyticsenginev3LeadType {
  
  UNDEFINED_LEAD_TYPE("UNDEFINED_LEAD_TYPE"),
  
  VIOLATION("VIOLATION"),
  
  OUTLIER("OUTLIER"),
  
  ACTIVITY("ACTIVITY"),
  
  EXCEPTION("EXCEPTION"),
  
  RISK("RISK"),
  
  ANOMALY("ANOMALY");

  private String value;

  Riskanalyticsenginev3LeadType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Riskanalyticsenginev3LeadType fromValue(String value) {
    for (Riskanalyticsenginev3LeadType b : Riskanalyticsenginev3LeadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Riskanalyticsenginev3LeadType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Riskanalyticsenginev3LeadType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Riskanalyticsenginev3LeadType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Riskanalyticsenginev3LeadType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Riskanalyticsenginev3LeadType.fromValue(value);
  }
}

