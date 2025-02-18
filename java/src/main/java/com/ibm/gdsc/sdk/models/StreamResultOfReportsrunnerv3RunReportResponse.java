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
import com.ibm.gdsc.sdk.models.Reportsrunnerv3RunReportResponse;
import com.ibm.gdsc.sdk.models.RuntimeStreamError;
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
 * StreamResultOfReportsrunnerv3RunReportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class StreamResultOfReportsrunnerv3RunReportResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private RuntimeStreamError error;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Reportsrunnerv3RunReportResponse result;

  public StreamResultOfReportsrunnerv3RunReportResponse() {
  }

  public StreamResultOfReportsrunnerv3RunReportResponse error(RuntimeStreamError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public RuntimeStreamError getError() {
    return error;
  }

  public void setError(RuntimeStreamError error) {
    this.error = error;
  }


  public StreamResultOfReportsrunnerv3RunReportResponse result(Reportsrunnerv3RunReportResponse result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public Reportsrunnerv3RunReportResponse getResult() {
    return result;
  }

  public void setResult(Reportsrunnerv3RunReportResponse result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamResultOfReportsrunnerv3RunReportResponse streamResultOfReportsrunnerv3RunReportResponse = (StreamResultOfReportsrunnerv3RunReportResponse) o;
    return Objects.equals(this.error, streamResultOfReportsrunnerv3RunReportResponse.error) &&
        Objects.equals(this.result, streamResultOfReportsrunnerv3RunReportResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfReportsrunnerv3RunReportResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamResultOfReportsrunnerv3RunReportResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamResultOfReportsrunnerv3RunReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamResultOfReportsrunnerv3RunReportResponse is not found in the empty JSON string", StreamResultOfReportsrunnerv3RunReportResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamResultOfReportsrunnerv3RunReportResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamResultOfReportsrunnerv3RunReportResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        RuntimeStreamError.validateJsonElement(jsonObj.get("error"));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        Reportsrunnerv3RunReportResponse.validateJsonElement(jsonObj.get("result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamResultOfReportsrunnerv3RunReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamResultOfReportsrunnerv3RunReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamResultOfReportsrunnerv3RunReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamResultOfReportsrunnerv3RunReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamResultOfReportsrunnerv3RunReportResponse>() {
           @Override
           public void write(JsonWriter out, StreamResultOfReportsrunnerv3RunReportResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamResultOfReportsrunnerv3RunReportResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamResultOfReportsrunnerv3RunReportResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamResultOfReportsrunnerv3RunReportResponse
  * @throws IOException if the JSON string is invalid with respect to StreamResultOfReportsrunnerv3RunReportResponse
  */
  public static StreamResultOfReportsrunnerv3RunReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamResultOfReportsrunnerv3RunReportResponse.class);
  }

 /**
  * Convert an instance of StreamResultOfReportsrunnerv3RunReportResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

