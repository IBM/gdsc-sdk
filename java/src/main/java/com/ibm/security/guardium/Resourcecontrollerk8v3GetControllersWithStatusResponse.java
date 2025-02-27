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
import com.ibm.security.guardium.Resourcecontrollerk8v3Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Resourcecontrollerk8v3GetControllersWithStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3GetControllersWithStatusResponse {
  public static final String SERIALIZED_NAME_CONTROLLERS = "controllers";
  @SerializedName(SERIALIZED_NAME_CONTROLLERS)
  private List<Resourcecontrollerk8v3Controller> controllers = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS_COUNT = "status_count";
  @SerializedName(SERIALIZED_NAME_STATUS_COUNT)
  private Map<String, String> statusCount = new HashMap<>();

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public Resourcecontrollerk8v3GetControllersWithStatusResponse() {
  }

  public Resourcecontrollerk8v3GetControllersWithStatusResponse controllers(List<Resourcecontrollerk8v3Controller> controllers) {
    this.controllers = controllers;
    return this;
  }

  public Resourcecontrollerk8v3GetControllersWithStatusResponse addControllersItem(Resourcecontrollerk8v3Controller controllersItem) {
    if (this.controllers == null) {
      this.controllers = new ArrayList<>();
    }
    this.controllers.add(controllersItem);
    return this;
  }

   /**
   * The controllers for the tenant.
   * @return controllers
  **/
  @javax.annotation.Nullable
  public List<Resourcecontrollerk8v3Controller> getControllers() {
    return controllers;
  }

  public void setControllers(List<Resourcecontrollerk8v3Controller> controllers) {
    this.controllers = controllers;
  }


  public Resourcecontrollerk8v3GetControllersWithStatusResponse statusCount(Map<String, String> statusCount) {
    this.statusCount = statusCount;
    return this;
  }

  public Resourcecontrollerk8v3GetControllersWithStatusResponse putStatusCountItem(String key, String statusCountItem) {
    if (this.statusCount == null) {
      this.statusCount = new HashMap<>();
    }
    this.statusCount.put(key, statusCountItem);
    return this;
  }

   /**
   * Get statusCount
   * @return statusCount
  **/
  @javax.annotation.Nullable
  public Map<String, String> getStatusCount() {
    return statusCount;
  }

  public void setStatusCount(Map<String, String> statusCount) {
    this.statusCount = statusCount;
  }


  public Resourcecontrollerk8v3GetControllersWithStatusResponse tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The internal ID of the tenant the controllers are for.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3GetControllersWithStatusResponse resourcecontrollerk8v3GetControllersWithStatusResponse = (Resourcecontrollerk8v3GetControllersWithStatusResponse) o;
    return Objects.equals(this.controllers, resourcecontrollerk8v3GetControllersWithStatusResponse.controllers) &&
        Objects.equals(this.statusCount, resourcecontrollerk8v3GetControllersWithStatusResponse.statusCount) &&
        Objects.equals(this.tenantId, resourcecontrollerk8v3GetControllersWithStatusResponse.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllers, statusCount, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3GetControllersWithStatusResponse {\n");
    sb.append("    controllers: ").append(toIndentedString(controllers)).append("\n");
    sb.append("    statusCount: ").append(toIndentedString(statusCount)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("controllers");
    openapiFields.add("status_count");
    openapiFields.add("tenant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3GetControllersWithStatusResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3GetControllersWithStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3GetControllersWithStatusResponse is not found in the empty JSON string", Resourcecontrollerk8v3GetControllersWithStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3GetControllersWithStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3GetControllersWithStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("controllers") != null && !jsonObj.get("controllers").isJsonNull()) {
        JsonArray jsonArraycontrollers = jsonObj.getAsJsonArray("controllers");
        if (jsonArraycontrollers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("controllers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `controllers` to be an array in the JSON string but got `%s`", jsonObj.get("controllers").toString()));
          }

          // validate the optional field `controllers` (array)
          for (int i = 0; i < jsonArraycontrollers.size(); i++) {
            Resourcecontrollerk8v3Controller.validateJsonElement(jsonArraycontrollers.get(i));
          };
        }
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3GetControllersWithStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3GetControllersWithStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3GetControllersWithStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3GetControllersWithStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3GetControllersWithStatusResponse>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3GetControllersWithStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3GetControllersWithStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3GetControllersWithStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3GetControllersWithStatusResponse
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3GetControllersWithStatusResponse
  */
  public static Resourcecontrollerk8v3GetControllersWithStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3GetControllersWithStatusResponse.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3GetControllersWithStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

