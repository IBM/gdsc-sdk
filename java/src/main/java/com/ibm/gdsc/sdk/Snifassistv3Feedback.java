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
import com.ibm.gdsc.sdk.Snifassistv3FeedbackStatus;
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
 * Feedback defines the message structure for sniffer feedback.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-11T14:56:28.892451Z[UTC]", comments = "Generator version: 7.6.0")
public class Snifassistv3Feedback {
  public static final String SERIALIZED_NAME_BATCH_NUM = "batch_num";
  @SerializedName(SERIALIZED_NAME_BATCH_NUM)
  private String batchNum;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Snifassistv3FeedbackStatus status = Snifassistv3FeedbackStatus.SUCCEEDED;

  public Snifassistv3Feedback() {
  }

  public Snifassistv3Feedback batchNum(String batchNum) {
    this.batchNum = batchNum;
    return this;
  }

   /**
   * Specify batch number uniquely associated with a policy or group update message.
   * @return batchNum
  **/
  @javax.annotation.Nullable
  public String getBatchNum() {
    return batchNum;
  }

  public void setBatchNum(String batchNum) {
    this.batchNum = batchNum;
  }


  public Snifassistv3Feedback message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Description of the status.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public Snifassistv3Feedback status(Snifassistv3FeedbackStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Snifassistv3FeedbackStatus getStatus() {
    return status;
  }

  public void setStatus(Snifassistv3FeedbackStatus status) {
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
    Snifassistv3Feedback snifassistv3Feedback = (Snifassistv3Feedback) o;
    return Objects.equals(this.batchNum, snifassistv3Feedback.batchNum) &&
        Objects.equals(this.message, snifassistv3Feedback.message) &&
        Objects.equals(this.status, snifassistv3Feedback.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNum, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snifassistv3Feedback {\n");
    sb.append("    batchNum: ").append(toIndentedString(batchNum)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("batch_num");
    openapiFields.add("message");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Snifassistv3Feedback
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Snifassistv3Feedback.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Snifassistv3Feedback is not found in the empty JSON string", Snifassistv3Feedback.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Snifassistv3Feedback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Snifassistv3Feedback` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("batch_num") != null && !jsonObj.get("batch_num").isJsonNull()) && !jsonObj.get("batch_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_num").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Snifassistv3FeedbackStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Snifassistv3Feedback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Snifassistv3Feedback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Snifassistv3Feedback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Snifassistv3Feedback.class));

       return (TypeAdapter<T>) new TypeAdapter<Snifassistv3Feedback>() {
           @Override
           public void write(JsonWriter out, Snifassistv3Feedback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Snifassistv3Feedback read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Snifassistv3Feedback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Snifassistv3Feedback
  * @throws IOException if the JSON string is invalid with respect to Snifassistv3Feedback
  */
  public static Snifassistv3Feedback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Snifassistv3Feedback.class);
  }

 /**
  * Convert an instance of Snifassistv3Feedback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

