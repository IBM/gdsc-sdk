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
import com.ibm.gdsc.sdk.Guardiumconnectorv3ActionNotifications;
import com.ibm.gdsc.sdk.Guardiumconnectorv3ActionParameter;
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
 * Guardiumconnectorv3Action
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3Action {
  public static final String SERIALIZED_NAME_ACTION_CODE = "action_code";
  @SerializedName(SERIALIZED_NAME_ACTION_CODE)
  private Integer actionCode;

  public static final String SERIALIZED_NAME_ACTION_NAME = "action_name";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<Guardiumconnectorv3ActionNotifications> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Guardiumconnectorv3ActionParameter> parameters = new ArrayList<>();

  public Guardiumconnectorv3Action() {
  }

  public Guardiumconnectorv3Action actionCode(Integer actionCode) {
    this.actionCode = actionCode;
    return this;
  }

   /**
   * Get actionCode
   * @return actionCode
  **/
  @javax.annotation.Nullable
  public Integer getActionCode() {
    return actionCode;
  }

  public void setActionCode(Integer actionCode) {
    this.actionCode = actionCode;
  }


  public Guardiumconnectorv3Action actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

   /**
   * Get actionName
   * @return actionName
  **/
  @javax.annotation.Nullable
  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public Guardiumconnectorv3Action notifications(List<Guardiumconnectorv3ActionNotifications> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Guardiumconnectorv3Action addNotificationsItem(Guardiumconnectorv3ActionNotifications notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3ActionNotifications> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<Guardiumconnectorv3ActionNotifications> notifications) {
    this.notifications = notifications;
  }


  public Guardiumconnectorv3Action parameters(List<Guardiumconnectorv3ActionParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Guardiumconnectorv3Action addParametersItem(Guardiumconnectorv3ActionParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3ActionParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Guardiumconnectorv3ActionParameter> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3Action guardiumconnectorv3Action = (Guardiumconnectorv3Action) o;
    return Objects.equals(this.actionCode, guardiumconnectorv3Action.actionCode) &&
        Objects.equals(this.actionName, guardiumconnectorv3Action.actionName) &&
        Objects.equals(this.notifications, guardiumconnectorv3Action.notifications) &&
        Objects.equals(this.parameters, guardiumconnectorv3Action.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCode, actionName, notifications, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3Action {\n");
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("action_code");
    openapiFields.add("action_name");
    openapiFields.add("notifications");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3Action
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3Action.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3Action is not found in the empty JSON string", Guardiumconnectorv3Action.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3Action.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3Action` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action_name") != null && !jsonObj.get("action_name").isJsonNull()) && !jsonObj.get("action_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_name").toString()));
      }
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        JsonArray jsonArraynotifications = jsonObj.getAsJsonArray("notifications");
        if (jsonArraynotifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
          }

          // validate the optional field `notifications` (array)
          for (int i = 0; i < jsonArraynotifications.size(); i++) {
            Guardiumconnectorv3ActionNotifications.validateJsonElement(jsonArraynotifications.get(i));
          };
        }
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            Guardiumconnectorv3ActionParameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3Action.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3Action' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3Action> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3Action.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3Action>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3Action value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3Action read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3Action given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3Action
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3Action
  */
  public static Guardiumconnectorv3Action fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3Action.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3Action to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

