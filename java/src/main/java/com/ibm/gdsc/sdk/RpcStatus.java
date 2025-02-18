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
import com.ibm.gdsc.sdk.ProtobufAny;
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
 * - Simple to use and understand for most users - Flexible enough to meet unexpected needs  # Overview  The &#x60;Status&#x60; message contains three pieces of data: error code, error message, and error details. The error code should be an enum value of [google.rpc.Code][google.rpc.Code], but it may accept additional error codes if needed.  The error message should be a developer-facing English message that helps developers *understand* and *resolve* the error. If a localized user-facing error message is needed, put the localized message in the error details or localize it in the client. The optional error details may contain arbitrary information about the error. There is a predefined set of error detail types in the package &#x60;google.rpc&#x60; that can be used for common error conditions.  # Language mapping  The &#x60;Status&#x60; message is the logical representation of the error model, but it is not necessarily the actual wire format. When the &#x60;Status&#x60; message is exposed in different client libraries and different wire protocols, it can be mapped differently. For example, it will likely be mapped to some exceptions in Java, but more likely mapped to some error codes in C.  # Other uses  The error model and the &#x60;Status&#x60; message can be used in a variety of environments, either with or without APIs, to provide a consistent developer experience across different environments.  Example uses of this error model include:  - Partial errors. If a service needs to return partial errors to the client,     it may embed the &#x60;Status&#x60; in the normal response to indicate the partial     errors.  - Workflow errors. A typical workflow has multiple steps. Each step may     have a &#x60;Status&#x60; message for error reporting.  - Batch operations. If a client uses batch request and batch response, the     &#x60;Status&#x60; message should be used directly inside batch response, one for     each error sub-response.  - Asynchronous operations. If an API call embeds asynchronous operation     results in its response, the status of those operations should be     represented directly using the &#x60;Status&#x60; message.  - Logging. If some API errors are stored in logs, the message &#x60;Status&#x60; could     be used directly after any stripping needed for security/privacy reasons.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class RpcStatus {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<ProtobufAny> details = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public RpcStatus() {
  }

  public RpcStatus code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].
   * @return code
  **/
  @javax.annotation.Nullable
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  public RpcStatus details(List<ProtobufAny> details) {
    this.details = details;
    return this;
  }

  public RpcStatus addDetailsItem(ProtobufAny detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * A list of messages that carry the error details.  There is a common set of message types for APIs to use.
   * @return details
  **/
  @javax.annotation.Nullable
  public List<ProtobufAny> getDetails() {
    return details;
  }

  public void setDetails(List<ProtobufAny> details) {
    this.details = details;
  }


  public RpcStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.
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
    RpcStatus rpcStatus = (RpcStatus) o;
    return Objects.equals(this.code, rpcStatus.code) &&
        Objects.equals(this.details, rpcStatus.details) &&
        Objects.equals(this.message, rpcStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcStatus {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("details");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RpcStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RpcStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RpcStatus is not found in the empty JSON string", RpcStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RpcStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RpcStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RpcStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RpcStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RpcStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RpcStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<RpcStatus>() {
           @Override
           public void write(JsonWriter out, RpcStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RpcStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RpcStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RpcStatus
  * @throws IOException if the JSON string is invalid with respect to RpcStatus
  */
  public static RpcStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RpcStatus.class);
  }

 /**
  * Convert an instance of RpcStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

