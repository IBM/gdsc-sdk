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
 * Gets or Sets reportsv3VariantRuleCondition
 */
@JsonAdapter(Reportsv3VariantRuleCondition.Adapter.class)
public enum Reportsv3VariantRuleCondition {
  
  UNDEFINED_VARIANT_ACTION_IF("UNDEFINED_VARIANT_ACTION_IF"),
  
  BEGINS_WITH("BEGINS_WITH"),
  
  DOES_NOT_BEGIN_WITH("DOES_NOT_BEGIN_WITH"),
  
  ENDS_WITH("ENDS_WITH"),
  
  DOES_NOT_END_WITH("DOES_NOT_END_WITH"),
  
  CONTAINS("CONTAINS"),
  
  DOES_NOT_CONTAIN("DOES_NOT_CONTAIN"),
  
  MATCHES_REGEX("MATCHES_REGEX"),
  
  DOES_NOT_MATCH_REGEX("DOES_NOT_MATCH_REGEX");

  private String value;

  Reportsv3VariantRuleCondition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Reportsv3VariantRuleCondition fromValue(String value) {
    for (Reportsv3VariantRuleCondition b : Reportsv3VariantRuleCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Reportsv3VariantRuleCondition> {
    @Override
    public void write(final JsonWriter jsonWriter, final Reportsv3VariantRuleCondition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Reportsv3VariantRuleCondition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Reportsv3VariantRuleCondition.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Reportsv3VariantRuleCondition.fromValue(value);
  }
}

