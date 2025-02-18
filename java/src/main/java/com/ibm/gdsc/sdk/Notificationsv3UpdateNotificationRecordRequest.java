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
import com.ibm.gdsc.sdk.Notificationsv3NotificationSeverity;
import com.ibm.gdsc.sdk.Notificationsv3NotificationState;
import com.ibm.gdsc.sdk.Notificationsv3TemplateProperty;
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
 * A request to update a specific notification with the specified fields. The ID field is required, all other fields are optional. Specified fields will be used to included in the persisted NotificationRecord.  If no fields are specified then the  notification record update is not performed.  If the ID is not specified an error is returned.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Notificationsv3UpdateNotificationRecordRequest {
  public static final String SERIALIZED_NAME_NOTIFICATION_ID = "notification_id";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ID)
  private List<String> notificationId = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Notificationsv3NotificationSeverity severity = Notificationsv3NotificationSeverity.UNDEFINED;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Notificationsv3NotificationState state = Notificationsv3NotificationState.UNREAD;

  public static final String SERIALIZED_NAME_TEMPLATE_DATA = "template_data";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DATA)
  private List<Notificationsv3TemplateProperty> templateData = new ArrayList<>();

  public Notificationsv3UpdateNotificationRecordRequest() {
  }

  public Notificationsv3UpdateNotificationRecordRequest notificationId(List<String> notificationId) {
    this.notificationId = notificationId;
    return this;
  }

  public Notificationsv3UpdateNotificationRecordRequest addNotificationIdItem(String notificationIdItem) {
    if (this.notificationId == null) {
      this.notificationId = new ArrayList<>();
    }
    this.notificationId.add(notificationIdItem);
    return this;
  }

   /**
   * Unique IDs for notifications; required for update.
   * @return notificationId
  **/
  @javax.annotation.Nullable
  public List<String> getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(List<String> notificationId) {
    this.notificationId = notificationId;
  }


  public Notificationsv3UpdateNotificationRecordRequest severity(Notificationsv3NotificationSeverity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  public Notificationsv3NotificationSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(Notificationsv3NotificationSeverity severity) {
    this.severity = severity;
  }


  public Notificationsv3UpdateNotificationRecordRequest state(Notificationsv3NotificationState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public Notificationsv3NotificationState getState() {
    return state;
  }

  public void setState(Notificationsv3NotificationState state) {
    this.state = state;
  }


  public Notificationsv3UpdateNotificationRecordRequest templateData(List<Notificationsv3TemplateProperty> templateData) {
    this.templateData = templateData;
    return this;
  }

  public Notificationsv3UpdateNotificationRecordRequest addTemplateDataItem(Notificationsv3TemplateProperty templateDataItem) {
    if (this.templateData == null) {
      this.templateData = new ArrayList<>();
    }
    this.templateData.add(templateDataItem);
    return this;
  }

   /**
   * Not required for update.
   * @return templateData
  **/
  @javax.annotation.Nullable
  public List<Notificationsv3TemplateProperty> getTemplateData() {
    return templateData;
  }

  public void setTemplateData(List<Notificationsv3TemplateProperty> templateData) {
    this.templateData = templateData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsv3UpdateNotificationRecordRequest notificationsv3UpdateNotificationRecordRequest = (Notificationsv3UpdateNotificationRecordRequest) o;
    return Objects.equals(this.notificationId, notificationsv3UpdateNotificationRecordRequest.notificationId) &&
        Objects.equals(this.severity, notificationsv3UpdateNotificationRecordRequest.severity) &&
        Objects.equals(this.state, notificationsv3UpdateNotificationRecordRequest.state) &&
        Objects.equals(this.templateData, notificationsv3UpdateNotificationRecordRequest.templateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationId, severity, state, templateData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsv3UpdateNotificationRecordRequest {\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
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
    openapiFields.add("notification_id");
    openapiFields.add("severity");
    openapiFields.add("state");
    openapiFields.add("template_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notificationsv3UpdateNotificationRecordRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notificationsv3UpdateNotificationRecordRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notificationsv3UpdateNotificationRecordRequest is not found in the empty JSON string", Notificationsv3UpdateNotificationRecordRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Notificationsv3UpdateNotificationRecordRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notificationsv3UpdateNotificationRecordRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("notification_id") != null && !jsonObj.get("notification_id").isJsonNull() && !jsonObj.get("notification_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notification_id` to be an array in the JSON string but got `%s`", jsonObj.get("notification_id").toString()));
      }
      // validate the optional field `severity`
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) {
        Notificationsv3NotificationSeverity.validateJsonElement(jsonObj.get("severity"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        Notificationsv3NotificationState.validateJsonElement(jsonObj.get("state"));
      }
      if (jsonObj.get("template_data") != null && !jsonObj.get("template_data").isJsonNull()) {
        JsonArray jsonArraytemplateData = jsonObj.getAsJsonArray("template_data");
        if (jsonArraytemplateData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("template_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `template_data` to be an array in the JSON string but got `%s`", jsonObj.get("template_data").toString()));
          }

          // validate the optional field `template_data` (array)
          for (int i = 0; i < jsonArraytemplateData.size(); i++) {
            Notificationsv3TemplateProperty.validateJsonElement(jsonArraytemplateData.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notificationsv3UpdateNotificationRecordRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notificationsv3UpdateNotificationRecordRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notificationsv3UpdateNotificationRecordRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notificationsv3UpdateNotificationRecordRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Notificationsv3UpdateNotificationRecordRequest>() {
           @Override
           public void write(JsonWriter out, Notificationsv3UpdateNotificationRecordRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notificationsv3UpdateNotificationRecordRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notificationsv3UpdateNotificationRecordRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notificationsv3UpdateNotificationRecordRequest
  * @throws IOException if the JSON string is invalid with respect to Notificationsv3UpdateNotificationRecordRequest
  */
  public static Notificationsv3UpdateNotificationRecordRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notificationsv3UpdateNotificationRecordRequest.class);
  }

 /**
  * Convert an instance of Notificationsv3UpdateNotificationRecordRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

