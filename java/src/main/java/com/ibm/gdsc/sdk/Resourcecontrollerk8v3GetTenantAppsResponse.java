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
import com.ibm.gdsc.sdk.Resourcecontrollerk8v3App;
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
 * Resourcecontrollerk8v3GetTenantAppsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-11T14:56:28.892451Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3GetTenantAppsResponse {
  public static final String SERIALIZED_NAME_APPS = "apps";
  @SerializedName(SERIALIZED_NAME_APPS)
  private List<Resourcecontrollerk8v3App> apps = new ArrayList<>();

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_TENANT_UUID = "tenant_uuid";
  @SerializedName(SERIALIZED_NAME_TENANT_UUID)
  private String tenantUuid;

  public Resourcecontrollerk8v3GetTenantAppsResponse() {
  }

  public Resourcecontrollerk8v3GetTenantAppsResponse apps(List<Resourcecontrollerk8v3App> apps) {
    this.apps = apps;
    return this;
  }

  public Resourcecontrollerk8v3GetTenantAppsResponse addAppsItem(Resourcecontrollerk8v3App appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * The apps for the tenant.
   * @return apps
  **/
  @javax.annotation.Nullable
  public List<Resourcecontrollerk8v3App> getApps() {
    return apps;
  }

  public void setApps(List<Resourcecontrollerk8v3App> apps) {
    this.apps = apps;
  }


  public Resourcecontrollerk8v3GetTenantAppsResponse tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The internal ID of the tenant the apps are for.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public Resourcecontrollerk8v3GetTenantAppsResponse tenantUuid(String tenantUuid) {
    this.tenantUuid = tenantUuid;
    return this;
  }

   /**
   * The uuid of the tenant to get jobs for.
   * @return tenantUuid
  **/
  @javax.annotation.Nullable
  public String getTenantUuid() {
    return tenantUuid;
  }

  public void setTenantUuid(String tenantUuid) {
    this.tenantUuid = tenantUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3GetTenantAppsResponse resourcecontrollerk8v3GetTenantAppsResponse = (Resourcecontrollerk8v3GetTenantAppsResponse) o;
    return Objects.equals(this.apps, resourcecontrollerk8v3GetTenantAppsResponse.apps) &&
        Objects.equals(this.tenantId, resourcecontrollerk8v3GetTenantAppsResponse.tenantId) &&
        Objects.equals(this.tenantUuid, resourcecontrollerk8v3GetTenantAppsResponse.tenantUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, tenantId, tenantUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3GetTenantAppsResponse {\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
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
    openapiFields.add("apps");
    openapiFields.add("tenant_id");
    openapiFields.add("tenant_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3GetTenantAppsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3GetTenantAppsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3GetTenantAppsResponse is not found in the empty JSON string", Resourcecontrollerk8v3GetTenantAppsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3GetTenantAppsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3GetTenantAppsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("apps") != null && !jsonObj.get("apps").isJsonNull()) {
        JsonArray jsonArrayapps = jsonObj.getAsJsonArray("apps");
        if (jsonArrayapps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("apps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `apps` to be an array in the JSON string but got `%s`", jsonObj.get("apps").toString()));
          }

          // validate the optional field `apps` (array)
          for (int i = 0; i < jsonArrayapps.size(); i++) {
            Resourcecontrollerk8v3App.validateJsonElement(jsonArrayapps.get(i));
          };
        }
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if ((jsonObj.get("tenant_uuid") != null && !jsonObj.get("tenant_uuid").isJsonNull()) && !jsonObj.get("tenant_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3GetTenantAppsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3GetTenantAppsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3GetTenantAppsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3GetTenantAppsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3GetTenantAppsResponse>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3GetTenantAppsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3GetTenantAppsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3GetTenantAppsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3GetTenantAppsResponse
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3GetTenantAppsResponse
  */
  public static Resourcecontrollerk8v3GetTenantAppsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3GetTenantAppsResponse.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3GetTenantAppsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

