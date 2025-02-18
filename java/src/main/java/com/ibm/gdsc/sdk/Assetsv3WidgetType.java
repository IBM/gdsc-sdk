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
 * WidgetType -  Widget types for asset overview.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets.
 */
@JsonAdapter(Assetsv3WidgetType.Adapter.class)
public enum Assetsv3WidgetType {
  
  ALL("ALL"),
  
  CLASSIFICATION("CLASSIFICATION"),
  
  TAG("TAG"),
  
  RESOURCE("RESOURCE");

  private String value;

  Assetsv3WidgetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Assetsv3WidgetType fromValue(String value) {
    for (Assetsv3WidgetType b : Assetsv3WidgetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Assetsv3WidgetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Assetsv3WidgetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Assetsv3WidgetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Assetsv3WidgetType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Assetsv3WidgetType.fromValue(value);
  }
}

