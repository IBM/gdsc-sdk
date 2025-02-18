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
 * AssetView - Types of view for displaying assets list .   - DB: Asset View type based on db  - Host: Asset View type based on host
 */
@JsonAdapter(Assetsv3AssetView.Adapter.class)
public enum Assetsv3AssetView {
  
  DB("DB"),
  
  HOST("Host");

  private String value;

  Assetsv3AssetView(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Assetsv3AssetView fromValue(String value) {
    for (Assetsv3AssetView b : Assetsv3AssetView.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Assetsv3AssetView> {
    @Override
    public void write(final JsonWriter jsonWriter, final Assetsv3AssetView enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Assetsv3AssetView read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Assetsv3AssetView.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Assetsv3AssetView.fromValue(value);
  }
}

