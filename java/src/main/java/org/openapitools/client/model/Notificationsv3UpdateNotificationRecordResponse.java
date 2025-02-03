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
import java.util.Arrays;
import org.openapitools.client.model.RpcStatus;

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
 * Contains the result of a request to update a notification record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Notificationsv3UpdateNotificationRecordResponse {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RpcStatus status;

  public Notificationsv3UpdateNotificationRecordResponse() {
  }

  public Notificationsv3UpdateNotificationRecordResponse result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Result is \&quot;\&quot; if an Notification record is persisted, otherwise an error is returned.
   * @return result
  **/
  @javax.annotation.Nullable
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public Notificationsv3UpdateNotificationRecordResponse status(RpcStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public RpcStatus getStatus() {
    return status;
  }

  public void setStatus(RpcStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsv3UpdateNotificationRecordResponse notificationsv3UpdateNotificationRecordResponse = (Notificationsv3UpdateNotificationRecordResponse) o;
    return Objects.equals(this.result, notificationsv3UpdateNotificationRecordResponse.result) &&
        Objects.equals(this.status, notificationsv3UpdateNotificationRecordResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsv3UpdateNotificationRecordResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("result");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notificationsv3UpdateNotificationRecordResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notificationsv3UpdateNotificationRecordResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notificationsv3UpdateNotificationRecordResponse is not found in the empty JSON string", Notificationsv3UpdateNotificationRecordResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Notificationsv3UpdateNotificationRecordResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notificationsv3UpdateNotificationRecordResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        RpcStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notificationsv3UpdateNotificationRecordResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notificationsv3UpdateNotificationRecordResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notificationsv3UpdateNotificationRecordResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notificationsv3UpdateNotificationRecordResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Notificationsv3UpdateNotificationRecordResponse>() {
           @Override
           public void write(JsonWriter out, Notificationsv3UpdateNotificationRecordResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notificationsv3UpdateNotificationRecordResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notificationsv3UpdateNotificationRecordResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notificationsv3UpdateNotificationRecordResponse
  * @throws IOException if the JSON string is invalid with respect to Notificationsv3UpdateNotificationRecordResponse
  */
  public static Notificationsv3UpdateNotificationRecordResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notificationsv3UpdateNotificationRecordResponse.class);
  }

 /**
  * Convert an instance of Notificationsv3UpdateNotificationRecordResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

