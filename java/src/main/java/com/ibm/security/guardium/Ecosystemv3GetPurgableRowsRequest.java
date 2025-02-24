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

import com.ibm.security.JSON;

/**
 * Requires hot retention period and hot retention period unit.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Ecosystemv3GetPurgableRowsRequest {
  public static final String SERIALIZED_NAME_HOT_RETENTION_PERIOD = "hot_retention_period";
  @SerializedName(SERIALIZED_NAME_HOT_RETENTION_PERIOD)
  private String hotRetentionPeriod;

  public static final String SERIALIZED_NAME_HOT_RETENTION_PERIOD_UNIT = "hot_retention_period_unit";
  @SerializedName(SERIALIZED_NAME_HOT_RETENTION_PERIOD_UNIT)
  private String hotRetentionPeriodUnit;

  public Ecosystemv3GetPurgableRowsRequest() {
  }

  public Ecosystemv3GetPurgableRowsRequest hotRetentionPeriod(String hotRetentionPeriod) {
    this.hotRetentionPeriod = hotRetentionPeriod;
    return this;
  }

   /**
   * Return number of rows created at this time or later (&gt;&#x3D;).
   * @return hotRetentionPeriod
  **/
  @javax.annotation.Nullable
  public String getHotRetentionPeriod() {
    return hotRetentionPeriod;
  }

  public void setHotRetentionPeriod(String hotRetentionPeriod) {
    this.hotRetentionPeriod = hotRetentionPeriod;
  }


  public Ecosystemv3GetPurgableRowsRequest hotRetentionPeriodUnit(String hotRetentionPeriodUnit) {
    this.hotRetentionPeriodUnit = hotRetentionPeriodUnit;
    return this;
  }

   /**
   * Return number of rows created before this time (&lt;).
   * @return hotRetentionPeriodUnit
  **/
  @javax.annotation.Nullable
  public String getHotRetentionPeriodUnit() {
    return hotRetentionPeriodUnit;
  }

  public void setHotRetentionPeriodUnit(String hotRetentionPeriodUnit) {
    this.hotRetentionPeriodUnit = hotRetentionPeriodUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecosystemv3GetPurgableRowsRequest ecosystemv3GetPurgableRowsRequest = (Ecosystemv3GetPurgableRowsRequest) o;
    return Objects.equals(this.hotRetentionPeriod, ecosystemv3GetPurgableRowsRequest.hotRetentionPeriod) &&
        Objects.equals(this.hotRetentionPeriodUnit, ecosystemv3GetPurgableRowsRequest.hotRetentionPeriodUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotRetentionPeriod, hotRetentionPeriodUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecosystemv3GetPurgableRowsRequest {\n");
    sb.append("    hotRetentionPeriod: ").append(toIndentedString(hotRetentionPeriod)).append("\n");
    sb.append("    hotRetentionPeriodUnit: ").append(toIndentedString(hotRetentionPeriodUnit)).append("\n");
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
    openapiFields.add("hot_retention_period");
    openapiFields.add("hot_retention_period_unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Ecosystemv3GetPurgableRowsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Ecosystemv3GetPurgableRowsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ecosystemv3GetPurgableRowsRequest is not found in the empty JSON string", Ecosystemv3GetPurgableRowsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Ecosystemv3GetPurgableRowsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Ecosystemv3GetPurgableRowsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hot_retention_period") != null && !jsonObj.get("hot_retention_period").isJsonNull()) && !jsonObj.get("hot_retention_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hot_retention_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hot_retention_period").toString()));
      }
      if ((jsonObj.get("hot_retention_period_unit") != null && !jsonObj.get("hot_retention_period_unit").isJsonNull()) && !jsonObj.get("hot_retention_period_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hot_retention_period_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hot_retention_period_unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ecosystemv3GetPurgableRowsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ecosystemv3GetPurgableRowsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ecosystemv3GetPurgableRowsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ecosystemv3GetPurgableRowsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Ecosystemv3GetPurgableRowsRequest>() {
           @Override
           public void write(JsonWriter out, Ecosystemv3GetPurgableRowsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Ecosystemv3GetPurgableRowsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Ecosystemv3GetPurgableRowsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ecosystemv3GetPurgableRowsRequest
  * @throws IOException if the JSON string is invalid with respect to Ecosystemv3GetPurgableRowsRequest
  */
  public static Ecosystemv3GetPurgableRowsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ecosystemv3GetPurgableRowsRequest.class);
  }

 /**
  * Convert an instance of Ecosystemv3GetPurgableRowsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

