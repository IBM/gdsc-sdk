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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Notificationsv3NotificationSeverity;
import org.openapitools.client.model.Notificationsv3NotificationState;

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
 * A notifications record indicates who, what, when, where, and why something happened and presents it  to the user in a meaningful way.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Notificationsv3NotificationRecord {
  public static final String SERIALIZED_NAME_CREATION_TIME = "creation_time";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_EVENT_END_TIME = "event_end_time";
  @SerializedName(SERIALIZED_NAME_EVENT_END_TIME)
  private OffsetDateTime eventEndTime;

  public static final String SERIALIZED_NAME_EVENT_START_TIME = "event_start_time";
  @SerializedName(SERIALIZED_NAME_EVENT_START_TIME)
  private OffsetDateTime eventStartTime;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_ORIGIN_DATA = "origin_data";
  @SerializedName(SERIALIZED_NAME_ORIGIN_DATA)
  private String originData;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Notificationsv3NotificationSeverity severity = Notificationsv3NotificationSeverity.UNDEFINED;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Notificationsv3NotificationState state = Notificationsv3NotificationState.UNREAD;

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private String style;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public Notificationsv3NotificationRecord() {
  }

  public Notificationsv3NotificationRecord creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The time the notification record was created (when).
   * @return creationTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public Notificationsv3NotificationRecord eventEndTime(OffsetDateTime eventEndTime) {
    this.eventEndTime = eventEndTime;
    return this;
  }

   /**
   * The time the associated event(s) completed.
   * @return eventEndTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventEndTime() {
    return eventEndTime;
  }

  public void setEventEndTime(OffsetDateTime eventEndTime) {
    this.eventEndTime = eventEndTime;
  }


  public Notificationsv3NotificationRecord eventStartTime(OffsetDateTime eventStartTime) {
    this.eventStartTime = eventStartTime;
    return this;
  }

   /**
   * The time the associated event(s) were initiated.
   * @return eventStartTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventStartTime() {
    return eventStartTime;
  }

  public void setEventStartTime(OffsetDateTime eventStartTime) {
    this.eventStartTime = eventStartTime;
  }


  public Notificationsv3NotificationRecord href(String href) {
    this.href = href;
    return this;
  }

   /**
   * URL for details of the notification.
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public Notificationsv3NotificationRecord id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID for notification, \&quot;\&quot; for new records, required for update.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Notificationsv3NotificationRecord origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Source of the notification (Predictive Analytics, Outlier Analytics, Analytic Preferences Changed, User Administration, etc).
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public Notificationsv3NotificationRecord originData(String originData) {
    this.originData = originData;
    return this;
  }

   /**
   * Data specifically related to the origin (an ID or description needed for further action).
   * @return originData
  **/
  @javax.annotation.Nullable
  public String getOriginData() {
    return originData;
  }

  public void setOriginData(String originData) {
    this.originData = originData;
  }


  public Notificationsv3NotificationRecord severity(Notificationsv3NotificationSeverity severity) {
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


  public Notificationsv3NotificationRecord state(Notificationsv3NotificationState state) {
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


  public Notificationsv3NotificationRecord style(String style) {
    this.style = style;
    return this;
  }

   /**
   * For future use: \&quot;\&quot;, info, error, criticalAnalysis, normalAnalysis, infoAnalysis.
   * @return style
  **/
  @javax.annotation.Nullable
  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }


  public Notificationsv3NotificationRecord tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The unique id for the Tenant the notification is associated with.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public Notificationsv3NotificationRecord text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Detailed description of the notification in HTML format (to be embedded in HTML container).
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public Notificationsv3NotificationRecord title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Brief title used to quickly describe the notification.
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Notificationsv3NotificationRecord transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * For future use: batches of events that are related to each other may be grouped together when shown to the user.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public Notificationsv3NotificationRecord type(String type) {
    this.type = type;
    return this;
  }

   /**
   * For future use: type will be used to determine how and when a user is notified of an event.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Notificationsv3NotificationRecord userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user unique ID in tenant user db of the user that requested the operation (who).
   * @return userId
  **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsv3NotificationRecord notificationsv3NotificationRecord = (Notificationsv3NotificationRecord) o;
    return Objects.equals(this.creationTime, notificationsv3NotificationRecord.creationTime) &&
        Objects.equals(this.eventEndTime, notificationsv3NotificationRecord.eventEndTime) &&
        Objects.equals(this.eventStartTime, notificationsv3NotificationRecord.eventStartTime) &&
        Objects.equals(this.href, notificationsv3NotificationRecord.href) &&
        Objects.equals(this.id, notificationsv3NotificationRecord.id) &&
        Objects.equals(this.origin, notificationsv3NotificationRecord.origin) &&
        Objects.equals(this.originData, notificationsv3NotificationRecord.originData) &&
        Objects.equals(this.severity, notificationsv3NotificationRecord.severity) &&
        Objects.equals(this.state, notificationsv3NotificationRecord.state) &&
        Objects.equals(this.style, notificationsv3NotificationRecord.style) &&
        Objects.equals(this.tenantId, notificationsv3NotificationRecord.tenantId) &&
        Objects.equals(this.text, notificationsv3NotificationRecord.text) &&
        Objects.equals(this.title, notificationsv3NotificationRecord.title) &&
        Objects.equals(this.transactionId, notificationsv3NotificationRecord.transactionId) &&
        Objects.equals(this.type, notificationsv3NotificationRecord.type) &&
        Objects.equals(this.userId, notificationsv3NotificationRecord.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, eventEndTime, eventStartTime, href, id, origin, originData, severity, state, style, tenantId, text, title, transactionId, type, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsv3NotificationRecord {\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    eventEndTime: ").append(toIndentedString(eventEndTime)).append("\n");
    sb.append("    eventStartTime: ").append(toIndentedString(eventStartTime)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originData: ").append(toIndentedString(originData)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("creation_time");
    openapiFields.add("event_end_time");
    openapiFields.add("event_start_time");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("origin");
    openapiFields.add("origin_data");
    openapiFields.add("severity");
    openapiFields.add("state");
    openapiFields.add("style");
    openapiFields.add("tenant_id");
    openapiFields.add("text");
    openapiFields.add("title");
    openapiFields.add("transaction_id");
    openapiFields.add("type");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notificationsv3NotificationRecord
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notificationsv3NotificationRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notificationsv3NotificationRecord is not found in the empty JSON string", Notificationsv3NotificationRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Notificationsv3NotificationRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notificationsv3NotificationRecord` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("origin_data") != null && !jsonObj.get("origin_data").isJsonNull()) && !jsonObj.get("origin_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_data").toString()));
      }
      // validate the optional field `severity`
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) {
        Notificationsv3NotificationSeverity.validateJsonElement(jsonObj.get("severity"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        Notificationsv3NotificationState.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) && !jsonObj.get("style").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `style` to be a primitive type in the JSON string but got `%s`", jsonObj.get("style").toString()));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("transaction_id") != null && !jsonObj.get("transaction_id").isJsonNull()) && !jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notificationsv3NotificationRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notificationsv3NotificationRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notificationsv3NotificationRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notificationsv3NotificationRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<Notificationsv3NotificationRecord>() {
           @Override
           public void write(JsonWriter out, Notificationsv3NotificationRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notificationsv3NotificationRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notificationsv3NotificationRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notificationsv3NotificationRecord
  * @throws IOException if the JSON string is invalid with respect to Notificationsv3NotificationRecord
  */
  public static Notificationsv3NotificationRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notificationsv3NotificationRecord.class);
  }

 /**
  * Convert an instance of Notificationsv3NotificationRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

