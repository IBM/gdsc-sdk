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
 * Gets or Sets reportsv3VariantRuleType
 */
@JsonAdapter(Reportsv3VariantRuleType.Adapter.class)
public enum Reportsv3VariantRuleType {
  
  UNDEFINED_VARIANT_RULE_TYPE("UNDEFINED_VARIANT_RULE_TYPE"),
  
  SPLIT_EXTRACT("SPLIT_EXTRACT"),
  
  ALTERNATIVE("ALTERNATIVE"),
  
  TO_LOWERCASE("TO_LOWERCASE"),
  
  TO_UPPERCASE("TO_UPPERCASE");

  private String value;

  Reportsv3VariantRuleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3VariantRuleType fromValue(String value) {
    for (Reportsv3VariantRuleType b : Reportsv3VariantRuleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3VariantRuleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3VariantRuleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3VariantRuleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3VariantRuleType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3VariantRuleType.fromValue(value);
  }
}

