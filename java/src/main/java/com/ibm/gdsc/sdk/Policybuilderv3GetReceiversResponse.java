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
import com.ibm.gdsc.sdk.Policybuilderv3ActionNotificationObject;
import com.ibm.gdsc.sdk.Policybuilderv3StatusResponseBase;
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
 * Response message that gives back the reciever information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3GetReceiversResponse {
  public static final String SERIALIZED_NAME_ACTION_NOTIFICATION_OBJECT = "action_notification_object";
  @SerializedName(SERIALIZED_NAME_ACTION_NOTIFICATION_OBJECT)
  private List<Policybuilderv3ActionNotificationObject> actionNotificationObject = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Policybuilderv3StatusResponseBase status;

  public Policybuilderv3GetReceiversResponse() {
  }

  public Policybuilderv3GetReceiversResponse actionNotificationObject(List<Policybuilderv3ActionNotificationObject> actionNotificationObject) {
    this.actionNotificationObject = actionNotificationObject;
    return this;
  }

  public Policybuilderv3GetReceiversResponse addActionNotificationObjectItem(Policybuilderv3ActionNotificationObject actionNotificationObjectItem) {
    if (this.actionNotificationObject == null) {
      this.actionNotificationObject = new ArrayList<>();
    }
    this.actionNotificationObject.add(actionNotificationObjectItem);
    return this;
  }

   /**
   * Action Notification Objects.
   * @return actionNotificationObject
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3ActionNotificationObject> getActionNotificationObject() {
    return actionNotificationObject;
  }

  public void setActionNotificationObject(List<Policybuilderv3ActionNotificationObject> actionNotificationObject) {
    this.actionNotificationObject = actionNotificationObject;
  }


  public Policybuilderv3GetReceiversResponse status(Policybuilderv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Policybuilderv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Policybuilderv3StatusResponseBase status) {
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
    Policybuilderv3GetReceiversResponse policybuilderv3GetReceiversResponse = (Policybuilderv3GetReceiversResponse) o;
    return Objects.equals(this.actionNotificationObject, policybuilderv3GetReceiversResponse.actionNotificationObject) &&
        Objects.equals(this.status, policybuilderv3GetReceiversResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionNotificationObject, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3GetReceiversResponse {\n");
    sb.append("    actionNotificationObject: ").append(toIndentedString(actionNotificationObject)).append("\n");
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
    openapiFields.add("action_notification_object");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3GetReceiversResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3GetReceiversResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3GetReceiversResponse is not found in the empty JSON string", Policybuilderv3GetReceiversResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3GetReceiversResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3GetReceiversResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("action_notification_object") != null && !jsonObj.get("action_notification_object").isJsonNull()) {
        JsonArray jsonArrayactionNotificationObject = jsonObj.getAsJsonArray("action_notification_object");
        if (jsonArrayactionNotificationObject != null) {
          // ensure the json data is an array
          if (!jsonObj.get("action_notification_object").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `action_notification_object` to be an array in the JSON string but got `%s`", jsonObj.get("action_notification_object").toString()));
          }

          // validate the optional field `action_notification_object` (array)
          for (int i = 0; i < jsonArrayactionNotificationObject.size(); i++) {
            Policybuilderv3ActionNotificationObject.validateJsonElement(jsonArrayactionNotificationObject.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Policybuilderv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3GetReceiversResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3GetReceiversResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3GetReceiversResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3GetReceiversResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3GetReceiversResponse>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3GetReceiversResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3GetReceiversResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3GetReceiversResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3GetReceiversResponse
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3GetReceiversResponse
  */
  public static Policybuilderv3GetReceiversResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3GetReceiversResponse.class);
  }

 /**
  * Convert an instance of Policybuilderv3GetReceiversResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

