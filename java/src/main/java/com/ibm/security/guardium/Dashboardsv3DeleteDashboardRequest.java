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
 * DeleteDashboardRequest is the request for deleting a dashboard.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Dashboardsv3DeleteDashboardRequest {
  public static final String SERIALIZED_NAME_DASHBOARD_ID = "dashboard_id";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_ID)
  private String dashboardId;

  public Dashboardsv3DeleteDashboardRequest() {
  }

  public Dashboardsv3DeleteDashboardRequest dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * The id of the dashboard to be deleted.
   * @return dashboardId
  **/
  @javax.annotation.Nullable
  public String getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboardsv3DeleteDashboardRequest dashboardsv3DeleteDashboardRequest = (Dashboardsv3DeleteDashboardRequest) o;
    return Objects.equals(this.dashboardId, dashboardsv3DeleteDashboardRequest.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboardsv3DeleteDashboardRequest {\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
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
    openapiFields.add("dashboard_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dashboardsv3DeleteDashboardRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dashboardsv3DeleteDashboardRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboardsv3DeleteDashboardRequest is not found in the empty JSON string", Dashboardsv3DeleteDashboardRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dashboardsv3DeleteDashboardRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dashboardsv3DeleteDashboardRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dashboard_id") != null && !jsonObj.get("dashboard_id").isJsonNull()) && !jsonObj.get("dashboard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboard_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboardsv3DeleteDashboardRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboardsv3DeleteDashboardRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboardsv3DeleteDashboardRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboardsv3DeleteDashboardRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboardsv3DeleteDashboardRequest>() {
           @Override
           public void write(JsonWriter out, Dashboardsv3DeleteDashboardRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboardsv3DeleteDashboardRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dashboardsv3DeleteDashboardRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dashboardsv3DeleteDashboardRequest
  * @throws IOException if the JSON string is invalid with respect to Dashboardsv3DeleteDashboardRequest
  */
  public static Dashboardsv3DeleteDashboardRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboardsv3DeleteDashboardRequest.class);
  }

 /**
  * Convert an instance of Dashboardsv3DeleteDashboardRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

