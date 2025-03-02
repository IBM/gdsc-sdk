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


package com.ibm.security.guardium;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.security.guardium.Workflowv3FilterColumn;
import com.ibm.security.guardium.Workflowv3FilterOperator;
import com.ibm.security.guardium.Workflowv3Priority;
import com.ibm.security.guardium.Workflowv3Status;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.ibm.security.JSON;

/**
 * Filter - to find specific Cases.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3Filter {
  public static final String SERIALIZED_NAME_ASSIGNED_TO_ME = "assigned_to_me";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TO_ME)
  private Boolean assignedToMe;

  public static final String SERIALIZED_NAME_ASSIGNED_TO_MY_ROLES = "assigned_to_my_roles";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TO_MY_ROLES)
  private Boolean assignedToMyRoles;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_CREATED_OPERATOR = "date_created_operator";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED_OPERATOR)
  private Workflowv3FilterOperator dateCreatedOperator = Workflowv3FilterOperator.IGNORE;

  public static final String SERIALIZED_NAME_DATE_DUE = "date_due";
  @SerializedName(SERIALIZED_NAME_DATE_DUE)
  private OffsetDateTime dateDue;

  public static final String SERIALIZED_NAME_DATE_DUE_OPERATOR = "date_due_operator";
  @SerializedName(SERIALIZED_NAME_DATE_DUE_OPERATOR)
  private Workflowv3FilterOperator dateDueOperator = Workflowv3FilterOperator.IGNORE;

  public static final String SERIALIZED_NAME_FILTER_COLUMNS = "filter_columns";
  @SerializedName(SERIALIZED_NAME_FILTER_COLUMNS)
  private List<Workflowv3FilterColumn> filterColumns = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Workflowv3Priority priority = Workflowv3Priority.UNDEFINED_PRIORITY;

  public static final String SERIALIZED_NAME_PRIORITY_OPERATOR = "priority_operator";
  @SerializedName(SERIALIZED_NAME_PRIORITY_OPERATOR)
  private Workflowv3FilterOperator priorityOperator = Workflowv3FilterOperator.IGNORE;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_SCHEDULED_JOB_ID = "scheduled_job_id";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_JOB_ID)
  private List<String> scheduledJobId = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEDULED_TASK_ID = "scheduled_task_id";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_TASK_ID)
  private List<String> scheduledTaskId = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Workflowv3Status status = Workflowv3Status.UNDEFINED_STATUS;

  public static final String SERIALIZED_NAME_STATUS_OPERATOR = "status_operator";
  @SerializedName(SERIALIZED_NAME_STATUS_OPERATOR)
  private Workflowv3FilterOperator statusOperator = Workflowv3FilterOperator.IGNORE;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public Workflowv3Filter() {
  }

  public Workflowv3Filter assignedToMe(Boolean assignedToMe) {
    this.assignedToMe = assignedToMe;
    return this;
  }

   /**
   * Optional: Cases and tasks that are assigned to Me.
   * @return assignedToMe
  **/
  @javax.annotation.Nullable
  public Boolean getAssignedToMe() {
    return assignedToMe;
  }

  public void setAssignedToMe(Boolean assignedToMe) {
    this.assignedToMe = assignedToMe;
  }


  public Workflowv3Filter assignedToMyRoles(Boolean assignedToMyRoles) {
    this.assignedToMyRoles = assignedToMyRoles;
    return this;
  }

   /**
   * Optional: Cases and tasks that are assigned to My Roles.
   * @return assignedToMyRoles
  **/
  @javax.annotation.Nullable
  public Boolean getAssignedToMyRoles() {
    return assignedToMyRoles;
  }

  public void setAssignedToMyRoles(Boolean assignedToMyRoles) {
    this.assignedToMyRoles = assignedToMyRoles;
  }


  public Workflowv3Filter dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Optional: where Date Created meets criteria.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public Workflowv3Filter dateCreatedOperator(Workflowv3FilterOperator dateCreatedOperator) {
    this.dateCreatedOperator = dateCreatedOperator;
    return this;
  }

   /**
   * Get dateCreatedOperator
   * @return dateCreatedOperator
  **/
  @javax.annotation.Nullable
  public Workflowv3FilterOperator getDateCreatedOperator() {
    return dateCreatedOperator;
  }

  public void setDateCreatedOperator(Workflowv3FilterOperator dateCreatedOperator) {
    this.dateCreatedOperator = dateCreatedOperator;
  }


  public Workflowv3Filter dateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
    return this;
  }

   /**
   * Optional: where Date Due meets criteria.
   * @return dateDue
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateDue() {
    return dateDue;
  }

  public void setDateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
  }


  public Workflowv3Filter dateDueOperator(Workflowv3FilterOperator dateDueOperator) {
    this.dateDueOperator = dateDueOperator;
    return this;
  }

   /**
   * Get dateDueOperator
   * @return dateDueOperator
  **/
  @javax.annotation.Nullable
  public Workflowv3FilterOperator getDateDueOperator() {
    return dateDueOperator;
  }

  public void setDateDueOperator(Workflowv3FilterOperator dateDueOperator) {
    this.dateDueOperator = dateDueOperator;
  }


  public Workflowv3Filter filterColumns(List<Workflowv3FilterColumn> filterColumns) {
    this.filterColumns = filterColumns;
    return this;
  }

  public Workflowv3Filter addFilterColumnsItem(Workflowv3FilterColumn filterColumnsItem) {
    if (this.filterColumns == null) {
      this.filterColumns = new ArrayList<>();
    }
    this.filterColumns.add(filterColumnsItem);
    return this;
  }

   /**
   * Get filterColumns
   * @return filterColumns
  **/
  @javax.annotation.Nullable
  public List<Workflowv3FilterColumn> getFilterColumns() {
    return filterColumns;
  }

  public void setFilterColumns(List<Workflowv3FilterColumn> filterColumns) {
    this.filterColumns = filterColumns;
  }


  public Workflowv3Filter priority(Workflowv3Priority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  public Workflowv3Priority getPriority() {
    return priority;
  }

  public void setPriority(Workflowv3Priority priority) {
    this.priority = priority;
  }


  public Workflowv3Filter priorityOperator(Workflowv3FilterOperator priorityOperator) {
    this.priorityOperator = priorityOperator;
    return this;
  }

   /**
   * Get priorityOperator
   * @return priorityOperator
  **/
  @javax.annotation.Nullable
  public Workflowv3FilterOperator getPriorityOperator() {
    return priorityOperator;
  }

  public void setPriorityOperator(Workflowv3FilterOperator priorityOperator) {
    this.priorityOperator = priorityOperator;
  }


  public Workflowv3Filter reportId(String reportId) {
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


  public Workflowv3Filter scheduledJobId(List<String> scheduledJobId) {
    this.scheduledJobId = scheduledJobId;
    return this;
  }

  public Workflowv3Filter addScheduledJobIdItem(String scheduledJobIdItem) {
    if (this.scheduledJobId == null) {
      this.scheduledJobId = new ArrayList<>();
    }
    this.scheduledJobId.add(scheduledJobIdItem);
    return this;
  }

   /**
   * Get scheduledJobId
   * @return scheduledJobId
  **/
  @javax.annotation.Nullable
  public List<String> getScheduledJobId() {
    return scheduledJobId;
  }

  public void setScheduledJobId(List<String> scheduledJobId) {
    this.scheduledJobId = scheduledJobId;
  }


  public Workflowv3Filter scheduledTaskId(List<String> scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
    return this;
  }

  public Workflowv3Filter addScheduledTaskIdItem(String scheduledTaskIdItem) {
    if (this.scheduledTaskId == null) {
      this.scheduledTaskId = new ArrayList<>();
    }
    this.scheduledTaskId.add(scheduledTaskIdItem);
    return this;
  }

   /**
   * Get scheduledTaskId
   * @return scheduledTaskId
  **/
  @javax.annotation.Nullable
  public List<String> getScheduledTaskId() {
    return scheduledTaskId;
  }

  public void setScheduledTaskId(List<String> scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
  }


  public Workflowv3Filter status(Workflowv3Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Workflowv3Status getStatus() {
    return status;
  }

  public void setStatus(Workflowv3Status status) {
    this.status = status;
  }


  public Workflowv3Filter statusOperator(Workflowv3FilterOperator statusOperator) {
    this.statusOperator = statusOperator;
    return this;
  }

   /**
   * Get statusOperator
   * @return statusOperator
  **/
  @javax.annotation.Nullable
  public Workflowv3FilterOperator getStatusOperator() {
    return statusOperator;
  }

  public void setStatusOperator(Workflowv3FilterOperator statusOperator) {
    this.statusOperator = statusOperator;
  }


  public Workflowv3Filter tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Workflowv3Filter addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3Filter workflowv3Filter = (Workflowv3Filter) o;
    return Objects.equals(this.assignedToMe, workflowv3Filter.assignedToMe) &&
        Objects.equals(this.assignedToMyRoles, workflowv3Filter.assignedToMyRoles) &&
        Objects.equals(this.dateCreated, workflowv3Filter.dateCreated) &&
        Objects.equals(this.dateCreatedOperator, workflowv3Filter.dateCreatedOperator) &&
        Objects.equals(this.dateDue, workflowv3Filter.dateDue) &&
        Objects.equals(this.dateDueOperator, workflowv3Filter.dateDueOperator) &&
        Objects.equals(this.filterColumns, workflowv3Filter.filterColumns) &&
        Objects.equals(this.priority, workflowv3Filter.priority) &&
        Objects.equals(this.priorityOperator, workflowv3Filter.priorityOperator) &&
        Objects.equals(this.reportId, workflowv3Filter.reportId) &&
        Objects.equals(this.scheduledJobId, workflowv3Filter.scheduledJobId) &&
        Objects.equals(this.scheduledTaskId, workflowv3Filter.scheduledTaskId) &&
        Objects.equals(this.status, workflowv3Filter.status) &&
        Objects.equals(this.statusOperator, workflowv3Filter.statusOperator) &&
        Objects.equals(this.tags, workflowv3Filter.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedToMe, assignedToMyRoles, dateCreated, dateCreatedOperator, dateDue, dateDueOperator, filterColumns, priority, priorityOperator, reportId, scheduledJobId, scheduledTaskId, status, statusOperator, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3Filter {\n");
    sb.append("    assignedToMe: ").append(toIndentedString(assignedToMe)).append("\n");
    sb.append("    assignedToMyRoles: ").append(toIndentedString(assignedToMyRoles)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCreatedOperator: ").append(toIndentedString(dateCreatedOperator)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateDueOperator: ").append(toIndentedString(dateDueOperator)).append("\n");
    sb.append("    filterColumns: ").append(toIndentedString(filterColumns)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityOperator: ").append(toIndentedString(priorityOperator)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    scheduledJobId: ").append(toIndentedString(scheduledJobId)).append("\n");
    sb.append("    scheduledTaskId: ").append(toIndentedString(scheduledTaskId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusOperator: ").append(toIndentedString(statusOperator)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("assigned_to_me");
    openapiFields.add("assigned_to_my_roles");
    openapiFields.add("date_created");
    openapiFields.add("date_created_operator");
    openapiFields.add("date_due");
    openapiFields.add("date_due_operator");
    openapiFields.add("filter_columns");
    openapiFields.add("priority");
    openapiFields.add("priority_operator");
    openapiFields.add("report_id");
    openapiFields.add("scheduled_job_id");
    openapiFields.add("scheduled_task_id");
    openapiFields.add("status");
    openapiFields.add("status_operator");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3Filter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3Filter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3Filter is not found in the empty JSON string", Workflowv3Filter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3Filter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3Filter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `date_created_operator`
      if (jsonObj.get("date_created_operator") != null && !jsonObj.get("date_created_operator").isJsonNull()) {
        Workflowv3FilterOperator.validateJsonElement(jsonObj.get("date_created_operator"));
      }
      // validate the optional field `date_due_operator`
      if (jsonObj.get("date_due_operator") != null && !jsonObj.get("date_due_operator").isJsonNull()) {
        Workflowv3FilterOperator.validateJsonElement(jsonObj.get("date_due_operator"));
      }
      if (jsonObj.get("filter_columns") != null && !jsonObj.get("filter_columns").isJsonNull()) {
        JsonArray jsonArrayfilterColumns = jsonObj.getAsJsonArray("filter_columns");
        if (jsonArrayfilterColumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filter_columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filter_columns` to be an array in the JSON string but got `%s`", jsonObj.get("filter_columns").toString()));
          }

          // validate the optional field `filter_columns` (array)
          for (int i = 0; i < jsonArrayfilterColumns.size(); i++) {
            Workflowv3FilterColumn.validateJsonElement(jsonArrayfilterColumns.get(i));
          };
        }
      }
      // validate the optional field `priority`
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) {
        Workflowv3Priority.validateJsonElement(jsonObj.get("priority"));
      }
      // validate the optional field `priority_operator`
      if (jsonObj.get("priority_operator") != null && !jsonObj.get("priority_operator").isJsonNull()) {
        Workflowv3FilterOperator.validateJsonElement(jsonObj.get("priority_operator"));
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scheduled_job_id") != null && !jsonObj.get("scheduled_job_id").isJsonNull() && !jsonObj.get("scheduled_job_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_job_id` to be an array in the JSON string but got `%s`", jsonObj.get("scheduled_job_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scheduled_task_id") != null && !jsonObj.get("scheduled_task_id").isJsonNull() && !jsonObj.get("scheduled_task_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_task_id` to be an array in the JSON string but got `%s`", jsonObj.get("scheduled_task_id").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Workflowv3Status.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `status_operator`
      if (jsonObj.get("status_operator") != null && !jsonObj.get("status_operator").isJsonNull()) {
        Workflowv3FilterOperator.validateJsonElement(jsonObj.get("status_operator"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3Filter>() {
           @Override
           public void write(JsonWriter out, Workflowv3Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3Filter
  * @throws IOException if the JSON string is invalid with respect to Workflowv3Filter
  */
  public static Workflowv3Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3Filter.class);
  }

 /**
  * Convert an instance of Workflowv3Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

