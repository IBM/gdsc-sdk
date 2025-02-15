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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Policybuilderv3TargetReceiver;
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
 * Notification object for action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3ActionNotificationObject {
  public static final String SERIALIZED_NAME_ACTION_ID = "action_id";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private String actionId;

  public static final String SERIALIZED_NAME_RECEIVERS = "receivers";
  @SerializedName(SERIALIZED_NAME_RECEIVERS)
  private List<Policybuilderv3TargetReceiver> receivers = new ArrayList<>();

  public Policybuilderv3ActionNotificationObject() {
  }

  public Policybuilderv3ActionNotificationObject actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Action id.
   * @return actionId
  **/
  @javax.annotation.Nullable
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  public Policybuilderv3ActionNotificationObject receivers(List<Policybuilderv3TargetReceiver> receivers) {
    this.receivers = receivers;
    return this;
  }

  public Policybuilderv3ActionNotificationObject addReceiversItem(Policybuilderv3TargetReceiver receiversItem) {
    if (this.receivers == null) {
      this.receivers = new ArrayList<>();
    }
    this.receivers.add(receiversItem);
    return this;
  }

   /**
   * Receiver object.
   * @return receivers
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3TargetReceiver> getReceivers() {
    return receivers;
  }

  public void setReceivers(List<Policybuilderv3TargetReceiver> receivers) {
    this.receivers = receivers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3ActionNotificationObject policybuilderv3ActionNotificationObject = (Policybuilderv3ActionNotificationObject) o;
    return Objects.equals(this.actionId, policybuilderv3ActionNotificationObject.actionId) &&
        Objects.equals(this.receivers, policybuilderv3ActionNotificationObject.receivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, receivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3ActionNotificationObject {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    receivers: ").append(toIndentedString(receivers)).append("\n");
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
    openapiFields.add("action_id");
    openapiFields.add("receivers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3ActionNotificationObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3ActionNotificationObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3ActionNotificationObject is not found in the empty JSON string", Policybuilderv3ActionNotificationObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3ActionNotificationObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3ActionNotificationObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action_id") != null && !jsonObj.get("action_id").isJsonNull()) && !jsonObj.get("action_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_id").toString()));
      }
      if (jsonObj.get("receivers") != null && !jsonObj.get("receivers").isJsonNull()) {
        JsonArray jsonArrayreceivers = jsonObj.getAsJsonArray("receivers");
        if (jsonArrayreceivers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("receivers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `receivers` to be an array in the JSON string but got `%s`", jsonObj.get("receivers").toString()));
          }

          // validate the optional field `receivers` (array)
          for (int i = 0; i < jsonArrayreceivers.size(); i++) {
            Policybuilderv3TargetReceiver.validateJsonElement(jsonArrayreceivers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3ActionNotificationObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3ActionNotificationObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3ActionNotificationObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3ActionNotificationObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3ActionNotificationObject>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3ActionNotificationObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3ActionNotificationObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3ActionNotificationObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3ActionNotificationObject
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3ActionNotificationObject
  */
  public static Policybuilderv3ActionNotificationObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3ActionNotificationObject.class);
  }

 /**
  * Convert an instance of Policybuilderv3ActionNotificationObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

