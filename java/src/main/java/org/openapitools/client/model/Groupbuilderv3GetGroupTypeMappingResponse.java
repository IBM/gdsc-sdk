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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Groupbuilderv3StatusResponseBase;

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

import org.openapitools.client.JSON;

/**
 * Response object for group types mapping.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3GetGroupTypeMappingResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Groupbuilderv3StatusResponseBase status;

  public static final String SERIALIZED_NAME_TYPE_MAP = "type_map";
  @SerializedName(SERIALIZED_NAME_TYPE_MAP)
  private Map<String, Integer> typeMap = new HashMap<>();

  public Groupbuilderv3GetGroupTypeMappingResponse() {
  }

  public Groupbuilderv3GetGroupTypeMappingResponse status(Groupbuilderv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Groupbuilderv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Groupbuilderv3StatusResponseBase status) {
    this.status = status;
  }


  public Groupbuilderv3GetGroupTypeMappingResponse typeMap(Map<String, Integer> typeMap) {
    this.typeMap = typeMap;
    return this;
  }

  public Groupbuilderv3GetGroupTypeMappingResponse putTypeMapItem(String key, Integer typeMapItem) {
    if (this.typeMap == null) {
      this.typeMap = new HashMap<>();
    }
    this.typeMap.put(key, typeMapItem);
    return this;
  }

   /**
   * Map of gdp to gi group type mapping objects.
   * @return typeMap
  **/
  @javax.annotation.Nullable
  public Map<String, Integer> getTypeMap() {
    return typeMap;
  }

  public void setTypeMap(Map<String, Integer> typeMap) {
    this.typeMap = typeMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groupbuilderv3GetGroupTypeMappingResponse groupbuilderv3GetGroupTypeMappingResponse = (Groupbuilderv3GetGroupTypeMappingResponse) o;
    return Objects.equals(this.status, groupbuilderv3GetGroupTypeMappingResponse.status) &&
        Objects.equals(this.typeMap, groupbuilderv3GetGroupTypeMappingResponse.typeMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, typeMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3GetGroupTypeMappingResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    typeMap: ").append(toIndentedString(typeMap)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("type_map");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3GetGroupTypeMappingResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3GetGroupTypeMappingResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3GetGroupTypeMappingResponse is not found in the empty JSON string", Groupbuilderv3GetGroupTypeMappingResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3GetGroupTypeMappingResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3GetGroupTypeMappingResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Groupbuilderv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3GetGroupTypeMappingResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3GetGroupTypeMappingResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3GetGroupTypeMappingResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3GetGroupTypeMappingResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3GetGroupTypeMappingResponse>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3GetGroupTypeMappingResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3GetGroupTypeMappingResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3GetGroupTypeMappingResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3GetGroupTypeMappingResponse
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3GetGroupTypeMappingResponse
  */
  public static Groupbuilderv3GetGroupTypeMappingResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3GetGroupTypeMappingResponse.class);
  }

 /**
  * Convert an instance of Groupbuilderv3GetGroupTypeMappingResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

