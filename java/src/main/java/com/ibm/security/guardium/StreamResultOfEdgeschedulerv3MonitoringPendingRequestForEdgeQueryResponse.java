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
import com.ibm.security.guardium.Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse;
import com.ibm.security.guardium.RuntimeStreamError;
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
 * StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private RuntimeStreamError error;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse result;

  public StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse() {
  }

  public StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse error(RuntimeStreamError error) {
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


  public StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse result(Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse getResult() {
    return result;
  }

  public void setResult(Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse result) {
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
    StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse streamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse = (StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse) o;
    return Objects.equals(this.error, streamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.error) &&
        Objects.equals(this.result, streamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse is not found in the empty JSON string", StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        RuntimeStreamError.validateJsonElement(jsonObj.get("error"));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.validateJsonElement(jsonObj.get("result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse>() {
           @Override
           public void write(JsonWriter out, StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse
  * @throws IOException if the JSON string is invalid with respect to StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse
  */
  public static StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.class);
  }

 /**
  * Convert an instance of StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

