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
import com.ibm.gdsc.sdk.Workflowv3Comment;
import com.ibm.gdsc.sdk.Workflowv3Entity;
import com.ibm.gdsc.sdk.Workflowv3Origin;
import com.ibm.gdsc.sdk.Workflowv3Priority;
import com.ibm.gdsc.sdk.Workflowv3Status;
import com.ibm.gdsc.sdk.Workflowv3Task;
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

import com.ibm.gdsc.JSON;

/**
 * Top-level task (case).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3Case {
  public static final String SERIALIZED_NAME_ALT_ID = "alt_id";
  @SerializedName(SERIALIZED_NAME_ALT_ID)
  private String altId;

  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<String> artifacts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
  private List<Workflowv3Entity> assignments = new ArrayList<>();

  public static final String SERIALIZED_NAME_CASE_ID = "case_id";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private String caseId;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<Workflowv3Comment> comments = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_DUE = "date_due";
  @SerializedName(SERIALIZED_NAME_DATE_DUE)
  private OffsetDateTime dateDue;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FULL_ACCESS = "full_access";
  @SerializedName(SERIALIZED_NAME_FULL_ACCESS)
  private Boolean fullAccess;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private Workflowv3Origin origin;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Workflowv3Priority priority = Workflowv3Priority.UNDEFINED_PRIORITY;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Workflowv3Status status = Workflowv3Status.UNDEFINED_STATUS;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<Workflowv3Task> tasks = new ArrayList<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Workflowv3Case() {
  }

  public Workflowv3Case altId(String altId) {
    this.altId = altId;
    return this;
  }

   /**
   * Alternate Unique ID.
   * @return altId
  **/
  @javax.annotation.Nullable
  public String getAltId() {
    return altId;
  }

  public void setAltId(String altId) {
    this.altId = altId;
  }


  public Workflowv3Case artifacts(List<String> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public Workflowv3Case addArtifactsItem(String artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Array of artifact URLs, i.e. a URL to a report result.
   * @return artifacts
  **/
  @javax.annotation.Nullable
  public List<String> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<String> artifacts) {
    this.artifacts = artifacts;
  }


  public Workflowv3Case assignments(List<Workflowv3Entity> assignments) {
    this.assignments = assignments;
    return this;
  }

  public Workflowv3Case addAssignmentsItem(Workflowv3Entity assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Entities that the case is assigned to.
   * @return assignments
  **/
  @javax.annotation.Nullable
  public List<Workflowv3Entity> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<Workflowv3Entity> assignments) {
    this.assignments = assignments;
  }


  public Workflowv3Case caseId(String caseId) {
    this.caseId = caseId;
    return this;
  }

   /**
   * Unique ID.
   * @return caseId
  **/
  @javax.annotation.Nullable
  public String getCaseId() {
    return caseId;
  }

  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  public Workflowv3Case comments(List<Workflowv3Comment> comments) {
    this.comments = comments;
    return this;
  }

  public Workflowv3Case addCommentsItem(Workflowv3Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments - who, when, what.
   * @return comments
  **/
  @javax.annotation.Nullable
  public List<Workflowv3Comment> getComments() {
    return comments;
  }

  public void setComments(List<Workflowv3Comment> comments) {
    this.comments = comments;
  }


  public Workflowv3Case dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date created (Scheduled job queue time).
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public Workflowv3Case dateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
    return this;
  }

   /**
   * Date due (Scheduled job next run).
   * @return dateDue
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateDue() {
    return dateDue;
  }

  public void setDateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
  }


  public Workflowv3Case dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Date of last update.
   * @return dateModified
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public Workflowv3Case description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Multiline description of the case.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Workflowv3Case fullAccess(Boolean fullAccess) {
    this.fullAccess = fullAccess;
    return this;
  }

   /**
   * Access level.
   * @return fullAccess
  **/
  @javax.annotation.Nullable
  public Boolean getFullAccess() {
    return fullAccess;
  }

  public void setFullAccess(Boolean fullAccess) {
    this.fullAccess = fullAccess;
  }


  public Workflowv3Case origin(Workflowv3Origin origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  public Workflowv3Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Workflowv3Origin origin) {
    this.origin = origin;
  }


  public Workflowv3Case priority(Workflowv3Priority priority) {
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


  public Workflowv3Case status(Workflowv3Status status) {
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


  public Workflowv3Case tasks(List<Workflowv3Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Workflowv3Case addTasksItem(Workflowv3Task tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Sub-tasks that the current user has access to.
   * @return tasks
  **/
  @javax.annotation.Nullable
  public List<Workflowv3Task> getTasks() {
    return tasks;
  }

  public void setTasks(List<Workflowv3Task> tasks) {
    this.tasks = tasks;
  }


  public Workflowv3Case title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Case title (subject).
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3Case workflowv3Case = (Workflowv3Case) o;
    return Objects.equals(this.altId, workflowv3Case.altId) &&
        Objects.equals(this.artifacts, workflowv3Case.artifacts) &&
        Objects.equals(this.assignments, workflowv3Case.assignments) &&
        Objects.equals(this.caseId, workflowv3Case.caseId) &&
        Objects.equals(this.comments, workflowv3Case.comments) &&
        Objects.equals(this.dateCreated, workflowv3Case.dateCreated) &&
        Objects.equals(this.dateDue, workflowv3Case.dateDue) &&
        Objects.equals(this.dateModified, workflowv3Case.dateModified) &&
        Objects.equals(this.description, workflowv3Case.description) &&
        Objects.equals(this.fullAccess, workflowv3Case.fullAccess) &&
        Objects.equals(this.origin, workflowv3Case.origin) &&
        Objects.equals(this.priority, workflowv3Case.priority) &&
        Objects.equals(this.status, workflowv3Case.status) &&
        Objects.equals(this.tasks, workflowv3Case.tasks) &&
        Objects.equals(this.title, workflowv3Case.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altId, artifacts, assignments, caseId, comments, dateCreated, dateDue, dateModified, description, fullAccess, origin, priority, status, tasks, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3Case {\n");
    sb.append("    altId: ").append(toIndentedString(altId)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullAccess: ").append(toIndentedString(fullAccess)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("alt_id");
    openapiFields.add("artifacts");
    openapiFields.add("assignments");
    openapiFields.add("case_id");
    openapiFields.add("comments");
    openapiFields.add("date_created");
    openapiFields.add("date_due");
    openapiFields.add("date_modified");
    openapiFields.add("description");
    openapiFields.add("full_access");
    openapiFields.add("origin");
    openapiFields.add("priority");
    openapiFields.add("status");
    openapiFields.add("tasks");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3Case
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3Case.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3Case is not found in the empty JSON string", Workflowv3Case.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3Case.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3Case` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alt_id") != null && !jsonObj.get("alt_id").isJsonNull()) && !jsonObj.get("alt_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alt_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alt_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("artifacts") != null && !jsonObj.get("artifacts").isJsonNull() && !jsonObj.get("artifacts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifacts` to be an array in the JSON string but got `%s`", jsonObj.get("artifacts").toString()));
      }
      if (jsonObj.get("assignments") != null && !jsonObj.get("assignments").isJsonNull()) {
        JsonArray jsonArrayassignments = jsonObj.getAsJsonArray("assignments");
        if (jsonArrayassignments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("assignments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `assignments` to be an array in the JSON string but got `%s`", jsonObj.get("assignments").toString()));
          }

          // validate the optional field `assignments` (array)
          for (int i = 0; i < jsonArrayassignments.size(); i++) {
            Workflowv3Entity.validateJsonElement(jsonArrayassignments.get(i));
          };
        }
      }
      if ((jsonObj.get("case_id") != null && !jsonObj.get("case_id").isJsonNull()) && !jsonObj.get("case_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `case_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("case_id").toString()));
      }
      if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) {
        JsonArray jsonArraycomments = jsonObj.getAsJsonArray("comments");
        if (jsonArraycomments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("comments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be an array in the JSON string but got `%s`", jsonObj.get("comments").toString()));
          }

          // validate the optional field `comments` (array)
          for (int i = 0; i < jsonArraycomments.size(); i++) {
            Workflowv3Comment.validateJsonElement(jsonArraycomments.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `origin`
      if (jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) {
        Workflowv3Origin.validateJsonElement(jsonObj.get("origin"));
      }
      // validate the optional field `priority`
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) {
        Workflowv3Priority.validateJsonElement(jsonObj.get("priority"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Workflowv3Status.validateJsonElement(jsonObj.get("status"));
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
            Workflowv3Task.validateJsonElement(jsonArraytasks.get(i));
          };
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3Case.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3Case' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3Case> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3Case.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3Case>() {
           @Override
           public void write(JsonWriter out, Workflowv3Case value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3Case read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3Case given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3Case
  * @throws IOException if the JSON string is invalid with respect to Workflowv3Case
  */
  public static Workflowv3Case fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3Case.class);
  }

 /**
  * Convert an instance of Workflowv3Case to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

