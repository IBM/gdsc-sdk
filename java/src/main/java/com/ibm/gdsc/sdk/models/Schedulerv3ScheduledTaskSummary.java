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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Schedulerv3AuditType;
import com.ibm.gdsc.sdk.models.Schedulerv3TaskType;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * ScheduledTaskSummary returns enough details for list view.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Schedulerv3ScheduledTaskSummary {
  public static final String SERIALIZED_NAME_AUDIT_TYPE = "audit_type";
  @SerializedName(SERIALIZED_NAME_AUDIT_TYPE)
  private Schedulerv3AuditType auditType = Schedulerv3AuditType.UNDEFINED_TYPE;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_REPORT_NAME = "report_name";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_SCHEDULED_TASK_ID = "scheduled_task_id";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_TASK_ID)
  private String scheduledTaskId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Schedulerv3TaskType type = Schedulerv3TaskType.UNDEFINED_JOBTYPE;

  public Schedulerv3ScheduledTaskSummary() {
  }

  public Schedulerv3ScheduledTaskSummary auditType(Schedulerv3AuditType auditType) {
    this.auditType = auditType;
    return this;
  }

   /**
   * Get auditType
   * @return auditType
  **/
  @javax.annotation.Nullable
  public Schedulerv3AuditType getAuditType() {
    return auditType;
  }

  public void setAuditType(Schedulerv3AuditType auditType) {
    this.auditType = auditType;
  }


  public Schedulerv3ScheduledTaskSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Task name (usually the same as the report name).
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Schedulerv3ScheduledTaskSummary reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Get reportId
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Schedulerv3ScheduledTaskSummary reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @javax.annotation.Nullable
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public Schedulerv3ScheduledTaskSummary scheduledTaskId(String scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
    return this;
  }

   /**
   * Id for the task.
   * @return scheduledTaskId
  **/
  @javax.annotation.Nullable
  public String getScheduledTaskId() {
    return scheduledTaskId;
  }

  public void setScheduledTaskId(String scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
  }


  public Schedulerv3ScheduledTaskSummary type(Schedulerv3TaskType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Schedulerv3TaskType getType() {
    return type;
  }

  public void setType(Schedulerv3TaskType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3ScheduledTaskSummary schedulerv3ScheduledTaskSummary = (Schedulerv3ScheduledTaskSummary) o;
    return Objects.equals(this.auditType, schedulerv3ScheduledTaskSummary.auditType) &&
        Objects.equals(this.name, schedulerv3ScheduledTaskSummary.name) &&
        Objects.equals(this.reportId, schedulerv3ScheduledTaskSummary.reportId) &&
        Objects.equals(this.reportName, schedulerv3ScheduledTaskSummary.reportName) &&
        Objects.equals(this.scheduledTaskId, schedulerv3ScheduledTaskSummary.scheduledTaskId) &&
        Objects.equals(this.type, schedulerv3ScheduledTaskSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditType, name, reportId, reportName, scheduledTaskId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3ScheduledTaskSummary {\n");
    sb.append("    auditType: ").append(toIndentedString(auditType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    scheduledTaskId: ").append(toIndentedString(scheduledTaskId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("audit_type");
    openapiFields.add("name");
    openapiFields.add("report_id");
    openapiFields.add("report_name");
    openapiFields.add("scheduled_task_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3ScheduledTaskSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3ScheduledTaskSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3ScheduledTaskSummary is not found in the empty JSON string", Schedulerv3ScheduledTaskSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3ScheduledTaskSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3ScheduledTaskSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `audit_type`
      if (jsonObj.get("audit_type") != null && !jsonObj.get("audit_type").isJsonNull()) {
        Schedulerv3AuditType.validateJsonElement(jsonObj.get("audit_type"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      if ((jsonObj.get("report_name") != null && !jsonObj.get("report_name").isJsonNull()) && !jsonObj.get("report_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_name").toString()));
      }
      if ((jsonObj.get("scheduled_task_id") != null && !jsonObj.get("scheduled_task_id").isJsonNull()) && !jsonObj.get("scheduled_task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduled_task_id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Schedulerv3TaskType.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3ScheduledTaskSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3ScheduledTaskSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3ScheduledTaskSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3ScheduledTaskSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3ScheduledTaskSummary>() {
           @Override
           public void write(JsonWriter out, Schedulerv3ScheduledTaskSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3ScheduledTaskSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3ScheduledTaskSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3ScheduledTaskSummary
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3ScheduledTaskSummary
  */
  public static Schedulerv3ScheduledTaskSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3ScheduledTaskSummary.class);
  }

 /**
  * Convert an instance of Schedulerv3ScheduledTaskSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

