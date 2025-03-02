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

import com.ibm.security.JSON;

/**
 * Guardiumconnectorv3ConfigureCollectorExportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3ConfigureCollectorExportRequest {
  public static final String SERIALIZED_NAME_CENTRAL_MANAGER_ID = "central_manager_id";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER_ID)
  private String centralManagerId;

  public static final String SERIALIZED_NAME_COLLECTORS = "collectors";
  @SerializedName(SERIALIZED_NAME_COLLECTORS)
  private List<String> collectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public Guardiumconnectorv3ConfigureCollectorExportRequest() {
  }

  public Guardiumconnectorv3ConfigureCollectorExportRequest centralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
    return this;
  }

   /**
   * Central Manager ID.
   * @return centralManagerId
  **/
  @javax.annotation.Nullable
  public String getCentralManagerId() {
    return centralManagerId;
  }

  public void setCentralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
  }


  public Guardiumconnectorv3ConfigureCollectorExportRequest collectors(List<String> collectors) {
    this.collectors = collectors;
    return this;
  }

  public Guardiumconnectorv3ConfigureCollectorExportRequest addCollectorsItem(String collectorsItem) {
    if (this.collectors == null) {
      this.collectors = new ArrayList<>();
    }
    this.collectors.add(collectorsItem);
    return this;
  }

   /**
   * List of collectors.
   * @return collectors
  **/
  @javax.annotation.Nullable
  public List<String> getCollectors() {
    return collectors;
  }

  public void setCollectors(List<String> collectors) {
    this.collectors = collectors;
  }


  public Guardiumconnectorv3ConfigureCollectorExportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date for export.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3ConfigureCollectorExportRequest guardiumconnectorv3ConfigureCollectorExportRequest = (Guardiumconnectorv3ConfigureCollectorExportRequest) o;
    return Objects.equals(this.centralManagerId, guardiumconnectorv3ConfigureCollectorExportRequest.centralManagerId) &&
        Objects.equals(this.collectors, guardiumconnectorv3ConfigureCollectorExportRequest.collectors) &&
        Objects.equals(this.startDate, guardiumconnectorv3ConfigureCollectorExportRequest.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralManagerId, collectors, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3ConfigureCollectorExportRequest {\n");
    sb.append("    centralManagerId: ").append(toIndentedString(centralManagerId)).append("\n");
    sb.append("    collectors: ").append(toIndentedString(collectors)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("central_manager_id");
    openapiFields.add("collectors");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3ConfigureCollectorExportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3ConfigureCollectorExportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3ConfigureCollectorExportRequest is not found in the empty JSON string", Guardiumconnectorv3ConfigureCollectorExportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3ConfigureCollectorExportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3ConfigureCollectorExportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("central_manager_id") != null && !jsonObj.get("central_manager_id").isJsonNull()) && !jsonObj.get("central_manager_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("collectors") != null && !jsonObj.get("collectors").isJsonNull() && !jsonObj.get("collectors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectors` to be an array in the JSON string but got `%s`", jsonObj.get("collectors").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3ConfigureCollectorExportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3ConfigureCollectorExportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3ConfigureCollectorExportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3ConfigureCollectorExportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3ConfigureCollectorExportRequest>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3ConfigureCollectorExportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3ConfigureCollectorExportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3ConfigureCollectorExportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3ConfigureCollectorExportRequest
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3ConfigureCollectorExportRequest
  */
  public static Guardiumconnectorv3ConfigureCollectorExportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3ConfigureCollectorExportRequest.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3ConfigureCollectorExportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

