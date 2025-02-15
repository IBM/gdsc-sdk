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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Guardiumconnectorv3CollectorConfig;
import com.ibm.gdsc.sdk.Guardiumconnectorv3StatusResponseBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Retrieves Collector configurations.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3GetCollectorsConfigResponse {
  public static final String SERIALIZED_NAME_COLLECTORS_CONFIG = "collectors_config";
  @SerializedName(SERIALIZED_NAME_COLLECTORS_CONFIG)
  private List<Guardiumconnectorv3CollectorConfig> collectorsConfig = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Guardiumconnectorv3StatusResponseBase status;

  public Guardiumconnectorv3GetCollectorsConfigResponse() {
  }

  public Guardiumconnectorv3GetCollectorsConfigResponse collectorsConfig(List<Guardiumconnectorv3CollectorConfig> collectorsConfig) {
    this.collectorsConfig = collectorsConfig;
    return this;
  }

  public Guardiumconnectorv3GetCollectorsConfigResponse addCollectorsConfigItem(Guardiumconnectorv3CollectorConfig collectorsConfigItem) {
    if (this.collectorsConfig == null) {
      this.collectorsConfig = new ArrayList<>();
    }
    this.collectorsConfig.add(collectorsConfigItem);
    return this;
  }

   /**
   * list of collectors.
   * @return collectorsConfig
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3CollectorConfig> getCollectorsConfig() {
    return collectorsConfig;
  }

  public void setCollectorsConfig(List<Guardiumconnectorv3CollectorConfig> collectorsConfig) {
    this.collectorsConfig = collectorsConfig;
  }


  public Guardiumconnectorv3GetCollectorsConfigResponse status(Guardiumconnectorv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Guardiumconnectorv3StatusResponseBase status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3GetCollectorsConfigResponse guardiumconnectorv3GetCollectorsConfigResponse = (Guardiumconnectorv3GetCollectorsConfigResponse) o;
    return Objects.equals(this.collectorsConfig, guardiumconnectorv3GetCollectorsConfigResponse.collectorsConfig) &&
        Objects.equals(this.status, guardiumconnectorv3GetCollectorsConfigResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectorsConfig, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3GetCollectorsConfigResponse {\n");
    sb.append("    collectorsConfig: ").append(toIndentedString(collectorsConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("collectors_config");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3GetCollectorsConfigResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3GetCollectorsConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3GetCollectorsConfigResponse is not found in the empty JSON string", Guardiumconnectorv3GetCollectorsConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3GetCollectorsConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3GetCollectorsConfigResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("collectors_config") != null && !jsonObj.get("collectors_config").isJsonNull()) {
        JsonArray jsonArraycollectorsConfig = jsonObj.getAsJsonArray("collectors_config");
        if (jsonArraycollectorsConfig != null) {
          // ensure the json data is an array
          if (!jsonObj.get("collectors_config").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `collectors_config` to be an array in the JSON string but got `%s`", jsonObj.get("collectors_config").toString()));
          }

          // validate the optional field `collectors_config` (array)
          for (int i = 0; i < jsonArraycollectorsConfig.size(); i++) {
            Guardiumconnectorv3CollectorConfig.validateJsonElement(jsonArraycollectorsConfig.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Guardiumconnectorv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3GetCollectorsConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3GetCollectorsConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3GetCollectorsConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3GetCollectorsConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3GetCollectorsConfigResponse>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3GetCollectorsConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3GetCollectorsConfigResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3GetCollectorsConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3GetCollectorsConfigResponse
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3GetCollectorsConfigResponse
  */
  public static Guardiumconnectorv3GetCollectorsConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3GetCollectorsConfigResponse.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3GetCollectorsConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

