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


package com.ibm.gdsc.sdk.models;

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

import com.ibm.gdsc.sdk.JSON;

/**
 * Datamartprocessorv3DMExtractionLogsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Datamartprocessorv3DMExtractionLogsResponse {
  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "response_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private String responseCode;

  public Datamartprocessorv3DMExtractionLogsResponse() {
  }

  public Datamartprocessorv3DMExtractionLogsResponse response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Response message for GDP.
   * @return response
  **/
  @javax.annotation.Nullable
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  public Datamartprocessorv3DMExtractionLogsResponse responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Translatable response code or empty string if there is no response.
   * @return responseCode
  **/
  @javax.annotation.Nullable
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datamartprocessorv3DMExtractionLogsResponse datamartprocessorv3DMExtractionLogsResponse = (Datamartprocessorv3DMExtractionLogsResponse) o;
    return Objects.equals(this.response, datamartprocessorv3DMExtractionLogsResponse.response) &&
        Objects.equals(this.responseCode, datamartprocessorv3DMExtractionLogsResponse.responseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, responseCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datamartprocessorv3DMExtractionLogsResponse {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
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
    openapiFields.add("response");
    openapiFields.add("response_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Datamartprocessorv3DMExtractionLogsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Datamartprocessorv3DMExtractionLogsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Datamartprocessorv3DMExtractionLogsResponse is not found in the empty JSON string", Datamartprocessorv3DMExtractionLogsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Datamartprocessorv3DMExtractionLogsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Datamartprocessorv3DMExtractionLogsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("response") != null && !jsonObj.get("response").isJsonNull()) && !jsonObj.get("response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
      if ((jsonObj.get("response_code") != null && !jsonObj.get("response_code").isJsonNull()) && !jsonObj.get("response_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Datamartprocessorv3DMExtractionLogsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Datamartprocessorv3DMExtractionLogsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Datamartprocessorv3DMExtractionLogsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Datamartprocessorv3DMExtractionLogsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Datamartprocessorv3DMExtractionLogsResponse>() {
           @Override
           public void write(JsonWriter out, Datamartprocessorv3DMExtractionLogsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Datamartprocessorv3DMExtractionLogsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Datamartprocessorv3DMExtractionLogsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Datamartprocessorv3DMExtractionLogsResponse
  * @throws IOException if the JSON string is invalid with respect to Datamartprocessorv3DMExtractionLogsResponse
  */
  public static Datamartprocessorv3DMExtractionLogsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Datamartprocessorv3DMExtractionLogsResponse.class);
  }

 /**
  * Convert an instance of Datamartprocessorv3DMExtractionLogsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

