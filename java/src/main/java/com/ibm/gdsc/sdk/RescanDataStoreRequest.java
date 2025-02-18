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
 * RescanDataStoreRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class RescanDataStoreRequest {
  public static final String SERIALIZED_NAME_DATA_STORE_ID = "dataStoreId";
  @SerializedName(SERIALIZED_NAME_DATA_STORE_ID)
  private String dataStoreId;

  public RescanDataStoreRequest() {
  }

  public RescanDataStoreRequest dataStoreId(String dataStoreId) {
    this.dataStoreId = dataStoreId;
    return this;
  }

   /**
   * Get dataStoreId
   * @return dataStoreId
  **/
  @javax.annotation.Nonnull
  public String getDataStoreId() {
    return dataStoreId;
  }

  public void setDataStoreId(String dataStoreId) {
    this.dataStoreId = dataStoreId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RescanDataStoreRequest rescanDataStoreRequest = (RescanDataStoreRequest) o;
    return Objects.equals(this.dataStoreId, rescanDataStoreRequest.dataStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStoreId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RescanDataStoreRequest {\n");
    sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
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
    openapiFields.add("dataStoreId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dataStoreId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RescanDataStoreRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RescanDataStoreRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RescanDataStoreRequest is not found in the empty JSON string", RescanDataStoreRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RescanDataStoreRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RescanDataStoreRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RescanDataStoreRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dataStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStoreId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RescanDataStoreRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RescanDataStoreRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RescanDataStoreRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RescanDataStoreRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RescanDataStoreRequest>() {
           @Override
           public void write(JsonWriter out, RescanDataStoreRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RescanDataStoreRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RescanDataStoreRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RescanDataStoreRequest
  * @throws IOException if the JSON string is invalid with respect to RescanDataStoreRequest
  */
  public static RescanDataStoreRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RescanDataStoreRequest.class);
  }

 /**
  * Convert an instance of RescanDataStoreRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

