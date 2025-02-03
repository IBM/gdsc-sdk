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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ProtobufAny;

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
 * RuntimeStreamError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class RuntimeStreamError {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<ProtobufAny> details = new ArrayList<>();

  public static final String SERIALIZED_NAME_GRPC_CODE = "grpc_code";
  @SerializedName(SERIALIZED_NAME_GRPC_CODE)
  private Integer grpcCode;

  public static final String SERIALIZED_NAME_HTTP_CODE = "http_code";
  @SerializedName(SERIALIZED_NAME_HTTP_CODE)
  private Integer httpCode;

  public static final String SERIALIZED_NAME_HTTP_STATUS = "http_status";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private String httpStatus;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public RuntimeStreamError() {
  }

  public RuntimeStreamError details(List<ProtobufAny> details) {
    this.details = details;
    return this;
  }

  public RuntimeStreamError addDetailsItem(ProtobufAny detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public List<ProtobufAny> getDetails() {
    return details;
  }

  public void setDetails(List<ProtobufAny> details) {
    this.details = details;
  }


  public RuntimeStreamError grpcCode(Integer grpcCode) {
    this.grpcCode = grpcCode;
    return this;
  }

   /**
   * Get grpcCode
   * @return grpcCode
  **/
  @javax.annotation.Nullable
  public Integer getGrpcCode() {
    return grpcCode;
  }

  public void setGrpcCode(Integer grpcCode) {
    this.grpcCode = grpcCode;
  }


  public RuntimeStreamError httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @javax.annotation.Nullable
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }


  public RuntimeStreamError httpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Get httpStatus
   * @return httpStatus
  **/
  @javax.annotation.Nullable
  public String getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }


  public RuntimeStreamError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeStreamError runtimeStreamError = (RuntimeStreamError) o;
    return Objects.equals(this.details, runtimeStreamError.details) &&
        Objects.equals(this.grpcCode, runtimeStreamError.grpcCode) &&
        Objects.equals(this.httpCode, runtimeStreamError.httpCode) &&
        Objects.equals(this.httpStatus, runtimeStreamError.httpStatus) &&
        Objects.equals(this.message, runtimeStreamError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, grpcCode, httpCode, httpStatus, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeStreamError {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    grpcCode: ").append(toIndentedString(grpcCode)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("grpc_code");
    openapiFields.add("http_code");
    openapiFields.add("http_status");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RuntimeStreamError
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuntimeStreamError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuntimeStreamError is not found in the empty JSON string", RuntimeStreamError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuntimeStreamError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuntimeStreamError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
        if (jsonArraydetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
          }

          // validate the optional field `details` (array)
          for (int i = 0; i < jsonArraydetails.size(); i++) {
            ProtobufAny.validateJsonElement(jsonArraydetails.get(i));
          };
        }
      }
      if ((jsonObj.get("http_status") != null && !jsonObj.get("http_status").isJsonNull()) && !jsonObj.get("http_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `http_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("http_status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuntimeStreamError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuntimeStreamError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuntimeStreamError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuntimeStreamError.class));

       return (TypeAdapter<T>) new TypeAdapter<RuntimeStreamError>() {
           @Override
           public void write(JsonWriter out, RuntimeStreamError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuntimeStreamError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RuntimeStreamError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuntimeStreamError
  * @throws IOException if the JSON string is invalid with respect to RuntimeStreamError
  */
  public static RuntimeStreamError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuntimeStreamError.class);
  }

 /**
  * Convert an instance of RuntimeStreamError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

