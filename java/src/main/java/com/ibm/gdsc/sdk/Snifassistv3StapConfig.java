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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.gdsc.JSON;

/**
 * StapConfig defines the message structure for STAP configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Snifassistv3StapConfig {
  public static final String SERIALIZED_NAME_CRC = "crc";
  @SerializedName(SERIALIZED_NAME_CRC)
  private Long crc;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private byte[] data;

  public Snifassistv3StapConfig() {
  }

  public Snifassistv3StapConfig crc(Long crc) {
    this.crc = crc;
    return this;
  }

   /**
   * CRC value of STAP configuration.
   * @return crc
  **/
  @javax.annotation.Nullable
  public Long getCrc() {
    return crc;
  }

  public void setCrc(Long crc) {
    this.crc = crc;
  }


  public Snifassistv3StapConfig data(byte[] data) {
    this.data = data;
    return this;
  }

   /**
   * Configuration data field.
   * @return data
  **/
  @javax.annotation.Nullable
  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snifassistv3StapConfig snifassistv3StapConfig = (Snifassistv3StapConfig) o;
    return Objects.equals(this.crc, snifassistv3StapConfig.crc) &&
        Arrays.equals(this.data, snifassistv3StapConfig.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crc, Arrays.hashCode(data));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snifassistv3StapConfig {\n");
    sb.append("    crc: ").append(toIndentedString(crc)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("crc");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Snifassistv3StapConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Snifassistv3StapConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Snifassistv3StapConfig is not found in the empty JSON string", Snifassistv3StapConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Snifassistv3StapConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Snifassistv3StapConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Snifassistv3StapConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Snifassistv3StapConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Snifassistv3StapConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Snifassistv3StapConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<Snifassistv3StapConfig>() {
           @Override
           public void write(JsonWriter out, Snifassistv3StapConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Snifassistv3StapConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Snifassistv3StapConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Snifassistv3StapConfig
  * @throws IOException if the JSON string is invalid with respect to Snifassistv3StapConfig
  */
  public static Snifassistv3StapConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Snifassistv3StapConfig.class);
  }

 /**
  * Convert an instance of Snifassistv3StapConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

