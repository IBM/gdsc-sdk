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
import com.ibm.gdsc.sdk.Schedulerv3AuditType;
import com.ibm.gdsc.sdk.Schedulerv3NotificationType;
import com.ibm.gdsc.sdk.Schedulerv3Recipient;
import com.ibm.gdsc.sdk.Schedulerv3Retention;
import com.ibm.gdsc.sdk.Schedulerv3ScheduledTask;
import com.ibm.gdsc.sdk.Schedulerv3Scheduler;
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
 * CreateScheduledJobRequest message for Post v3/schedules api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3CreateScheduledJobRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_INTERNAL_AUDIT = "internal_audit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_AUDIT)
  private Schedulerv3AuditType internalAudit = Schedulerv3AuditType.UNDEFINED_TYPE;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private Schedulerv3NotificationType notification = Schedulerv3NotificationType.UNDEFINED_NOTIFICATION;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private Schedulerv3Recipient recipient;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<Schedulerv3Recipient> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_RETENTION = "retention";
  @SerializedName(SERIALIZED_NAME_RETENTION)
  private Schedulerv3Retention retention;

  public static final String SERIALIZED_NAME_SCHEDULER = "scheduler";
  @SerializedName(SERIALIZED_NAME_SCHEDULER)
  private Schedulerv3Scheduler scheduler;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<Schedulerv3ScheduledTask> tasks = new ArrayList<>();

  public Schedulerv3CreateScheduledJobRequest() {
  }

  public Schedulerv3CreateScheduledJobRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Optional: Description for the scheduledJob.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Schedulerv3CreateScheduledJobRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Optional: Enable or disable.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Schedulerv3CreateScheduledJobRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Optional: The instructions for the recipient.
   * @return instructions
  **/
  @javax.annotation.Nullable
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public Schedulerv3CreateScheduledJobRequest internalAudit(Schedulerv3AuditType internalAudit) {
    this.internalAudit = internalAudit;
    return this;
  }

   /**
   * Get internalAudit
   * @return internalAudit
  **/
  @javax.annotation.Nullable
  public Schedulerv3AuditType getInternalAudit() {
    return internalAudit;
  }

  public void setInternalAudit(Schedulerv3AuditType internalAudit) {
    this.internalAudit = internalAudit;
  }


  public Schedulerv3CreateScheduledJobRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the schedule.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Schedulerv3CreateScheduledJobRequest notification(Schedulerv3NotificationType notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @javax.annotation.Nullable
  public Schedulerv3NotificationType getNotification() {
    return notification;
  }

  public void setNotification(Schedulerv3NotificationType notification) {
    this.notification = notification;
  }


  public Schedulerv3CreateScheduledJobRequest origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public Schedulerv3CreateScheduledJobRequest recipient(Schedulerv3Recipient recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  public Schedulerv3Recipient getRecipient() {
    return recipient;
  }

  public void setRecipient(Schedulerv3Recipient recipient) {
    this.recipient = recipient;
  }


  public Schedulerv3CreateScheduledJobRequest recipients(List<Schedulerv3Recipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Schedulerv3CreateScheduledJobRequest addRecipientsItem(Schedulerv3Recipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3Recipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Schedulerv3Recipient> recipients) {
    this.recipients = recipients;
  }


  public Schedulerv3CreateScheduledJobRequest retention(Schedulerv3Retention retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Get retention
   * @return retention
  **/
  @javax.annotation.Nullable
  public Schedulerv3Retention getRetention() {
    return retention;
  }

  public void setRetention(Schedulerv3Retention retention) {
    this.retention = retention;
  }


  public Schedulerv3CreateScheduledJobRequest scheduler(Schedulerv3Scheduler scheduler) {
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Get scheduler
   * @return scheduler
  **/
  @javax.annotation.Nullable
  public Schedulerv3Scheduler getScheduler() {
    return scheduler;
  }

  public void setScheduler(Schedulerv3Scheduler scheduler) {
    this.scheduler = scheduler;
  }


  public Schedulerv3CreateScheduledJobRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Schedulerv3CreateScheduledJobRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Optional: Tags to use.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Schedulerv3CreateScheduledJobRequest tasks(List<Schedulerv3ScheduledTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Schedulerv3CreateScheduledJobRequest addTasksItem(Schedulerv3ScheduledTask tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3ScheduledTask> getTasks() {
    return tasks;
  }

  public void setTasks(List<Schedulerv3ScheduledTask> tasks) {
    this.tasks = tasks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3CreateScheduledJobRequest schedulerv3CreateScheduledJobRequest = (Schedulerv3CreateScheduledJobRequest) o;
    return Objects.equals(this.description, schedulerv3CreateScheduledJobRequest.description) &&
        Objects.equals(this.enabled, schedulerv3CreateScheduledJobRequest.enabled) &&
        Objects.equals(this.instructions, schedulerv3CreateScheduledJobRequest.instructions) &&
        Objects.equals(this.internalAudit, schedulerv3CreateScheduledJobRequest.internalAudit) &&
        Objects.equals(this.name, schedulerv3CreateScheduledJobRequest.name) &&
        Objects.equals(this.notification, schedulerv3CreateScheduledJobRequest.notification) &&
        Objects.equals(this.origin, schedulerv3CreateScheduledJobRequest.origin) &&
        Objects.equals(this.recipient, schedulerv3CreateScheduledJobRequest.recipient) &&
        Objects.equals(this.recipients, schedulerv3CreateScheduledJobRequest.recipients) &&
        Objects.equals(this.retention, schedulerv3CreateScheduledJobRequest.retention) &&
        Objects.equals(this.scheduler, schedulerv3CreateScheduledJobRequest.scheduler) &&
        Objects.equals(this.tags, schedulerv3CreateScheduledJobRequest.tags) &&
        Objects.equals(this.tasks, schedulerv3CreateScheduledJobRequest.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, instructions, internalAudit, name, notification, origin, recipient, recipients, retention, scheduler, tags, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3CreateScheduledJobRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    internalAudit: ").append(toIndentedString(internalAudit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("enabled");
    openapiFields.add("instructions");
    openapiFields.add("internal_audit");
    openapiFields.add("name");
    openapiFields.add("notification");
    openapiFields.add("origin");
    openapiFields.add("recipient");
    openapiFields.add("recipients");
    openapiFields.add("retention");
    openapiFields.add("scheduler");
    openapiFields.add("tags");
    openapiFields.add("tasks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3CreateScheduledJobRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3CreateScheduledJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3CreateScheduledJobRequest is not found in the empty JSON string", Schedulerv3CreateScheduledJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3CreateScheduledJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3CreateScheduledJobRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull()) && !jsonObj.get("instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      // validate the optional field `internal_audit`
      if (jsonObj.get("internal_audit") != null && !jsonObj.get("internal_audit").isJsonNull()) {
        Schedulerv3AuditType.validateJsonElement(jsonObj.get("internal_audit"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `notification`
      if (jsonObj.get("notification") != null && !jsonObj.get("notification").isJsonNull()) {
        Schedulerv3NotificationType.validateJsonElement(jsonObj.get("notification"));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      // validate the optional field `recipient`
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) {
        Schedulerv3Recipient.validateJsonElement(jsonObj.get("recipient"));
      }
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonNull()) {
        JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
        if (jsonArrayrecipients != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recipients").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
          }

          // validate the optional field `recipients` (array)
          for (int i = 0; i < jsonArrayrecipients.size(); i++) {
            Schedulerv3Recipient.validateJsonElement(jsonArrayrecipients.get(i));
          };
        }
      }
      // validate the optional field `retention`
      if (jsonObj.get("retention") != null && !jsonObj.get("retention").isJsonNull()) {
        Schedulerv3Retention.validateJsonElement(jsonObj.get("retention"));
      }
      // validate the optional field `scheduler`
      if (jsonObj.get("scheduler") != null && !jsonObj.get("scheduler").isJsonNull()) {
        Schedulerv3Scheduler.validateJsonElement(jsonObj.get("scheduler"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("tasks") != null && !jsonObj.get("tasks").isJsonNull()) {
        JsonArray jsonArraytasks = jsonObj.getAsJsonArray("tasks");
        if (jsonArraytasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tasks` to be an array in the JSON string but got `%s`", jsonObj.get("tasks").toString()));
          }

          // validate the optional field `tasks` (array)
          for (int i = 0; i < jsonArraytasks.size(); i++) {
            Schedulerv3ScheduledTask.validateJsonElement(jsonArraytasks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3CreateScheduledJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3CreateScheduledJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3CreateScheduledJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3CreateScheduledJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3CreateScheduledJobRequest>() {
           @Override
           public void write(JsonWriter out, Schedulerv3CreateScheduledJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3CreateScheduledJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3CreateScheduledJobRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3CreateScheduledJobRequest
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3CreateScheduledJobRequest
  */
  public static Schedulerv3CreateScheduledJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3CreateScheduledJobRequest.class);
  }

 /**
  * Convert an instance of Schedulerv3CreateScheduledJobRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

