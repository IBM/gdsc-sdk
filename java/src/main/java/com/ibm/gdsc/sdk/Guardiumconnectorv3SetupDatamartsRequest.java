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
import com.ibm.gdsc.sdk.Guardiumconnectorv3DatamartExecutionMode;
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
 * Guardiumconnectorv3SetupDatamartsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3SetupDatamartsRequest {
  public static final String SERIALIZED_NAME_CENTRAL_MANAGER_ID = "central_manager_id";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER_ID)
  private String centralManagerId;

  public static final String SERIALIZED_NAME_DATAMARTS = "datamarts";
  @SerializedName(SERIALIZED_NAME_DATAMARTS)
  private List<Guardiumconnectorv3DatamartExecutionMode> datamarts = new ArrayList<>();

  public Guardiumconnectorv3SetupDatamartsRequest() {
  }

  public Guardiumconnectorv3SetupDatamartsRequest centralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
    return this;
  }

   /**
   * Get centralManagerId
   * @return centralManagerId
  **/
  @javax.annotation.Nullable
  public String getCentralManagerId() {
    return centralManagerId;
  }

  public void setCentralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
  }


  public Guardiumconnectorv3SetupDatamartsRequest datamarts(List<Guardiumconnectorv3DatamartExecutionMode> datamarts) {
    this.datamarts = datamarts;
    return this;
  }

  public Guardiumconnectorv3SetupDatamartsRequest addDatamartsItem(Guardiumconnectorv3DatamartExecutionMode datamartsItem) {
    if (this.datamarts == null) {
      this.datamarts = new ArrayList<>();
    }
    this.datamarts.add(datamartsItem);
    return this;
  }

   /**
   * Get datamarts
   * @return datamarts
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3DatamartExecutionMode> getDatamarts() {
    return datamarts;
  }

  public void setDatamarts(List<Guardiumconnectorv3DatamartExecutionMode> datamarts) {
    this.datamarts = datamarts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3SetupDatamartsRequest guardiumconnectorv3SetupDatamartsRequest = (Guardiumconnectorv3SetupDatamartsRequest) o;
    return Objects.equals(this.centralManagerId, guardiumconnectorv3SetupDatamartsRequest.centralManagerId) &&
        Objects.equals(this.datamarts, guardiumconnectorv3SetupDatamartsRequest.datamarts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralManagerId, datamarts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3SetupDatamartsRequest {\n");
    sb.append("    centralManagerId: ").append(toIndentedString(centralManagerId)).append("\n");
    sb.append("    datamarts: ").append(toIndentedString(datamarts)).append("\n");
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
    openapiFields.add("datamarts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3SetupDatamartsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3SetupDatamartsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3SetupDatamartsRequest is not found in the empty JSON string", Guardiumconnectorv3SetupDatamartsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3SetupDatamartsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3SetupDatamartsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("central_manager_id") != null && !jsonObj.get("central_manager_id").isJsonNull()) && !jsonObj.get("central_manager_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager_id").toString()));
      }
      if (jsonObj.get("datamarts") != null && !jsonObj.get("datamarts").isJsonNull()) {
        JsonArray jsonArraydatamarts = jsonObj.getAsJsonArray("datamarts");
        if (jsonArraydatamarts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("datamarts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `datamarts` to be an array in the JSON string but got `%s`", jsonObj.get("datamarts").toString()));
          }

          // validate the optional field `datamarts` (array)
          for (int i = 0; i < jsonArraydatamarts.size(); i++) {
            Guardiumconnectorv3DatamartExecutionMode.validateJsonElement(jsonArraydatamarts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3SetupDatamartsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3SetupDatamartsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3SetupDatamartsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3SetupDatamartsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3SetupDatamartsRequest>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3SetupDatamartsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3SetupDatamartsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3SetupDatamartsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3SetupDatamartsRequest
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3SetupDatamartsRequest
  */
  public static Guardiumconnectorv3SetupDatamartsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3SetupDatamartsRequest.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3SetupDatamartsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

