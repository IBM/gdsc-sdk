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
import com.ibm.gdsc.sdk.Schedulerv3ConfigurationItem;
import com.ibm.gdsc.sdk.Workflowv3Entity;
import com.ibm.gdsc.sdk.Workflowv3Priority;
import com.ibm.gdsc.sdk.Workflowv3Status;
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
 * Editable fields of a task.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3TaskEdit {
  public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
  private List<Workflowv3Entity> assignments = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DATE_DUE = "date_due";
  @SerializedName(SERIALIZED_NAME_DATE_DUE)
  private OffsetDateTime dateDue;

  public static final String SERIALIZED_NAME_DEPENDS_ON = "depends_on";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON)
  private List<String> dependsOn = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INVESTIGATION_LINKS = "investigation_links";
  @SerializedName(SERIALIZED_NAME_INVESTIGATION_LINKS)
  private List<Schedulerv3ConfigurationItem> investigationLinks = new ArrayList<>();

  public static final String SERIALIZED_NAME_JUSTIFICATION = "justification";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATION)
  private String justification;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Workflowv3Priority priority = Workflowv3Priority.UNDEFINED_PRIORITY;

  public static final String SERIALIZED_NAME_RESPONSE_TEMPLATE = "response_template";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TEMPLATE)
  private Schedulerv3ConfigurationItem responseTemplate;

  public static final String SERIALIZED_NAME_REVIEW_ACTION = "review_action";
  @SerializedName(SERIALIZED_NAME_REVIEW_ACTION)
  private String reviewAction;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Workflowv3Status status = Workflowv3Status.UNDEFINED_STATUS;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Workflowv3TaskEdit() {
  }

  public Workflowv3TaskEdit assignments(List<Workflowv3Entity> assignments) {
    this.assignments = assignments;
    return this;
  }

  public Workflowv3TaskEdit addAssignmentsItem(Workflowv3Entity assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Optional: Entities that the task is assigned to.
   * @return assignments
  **/
  @javax.annotation.Nullable
  public List<Workflowv3Entity> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<Workflowv3Entity> assignments) {
    this.assignments = assignments;
  }


  public Workflowv3TaskEdit comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Optional: Comment - this text will be added to the comments history.
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public Workflowv3TaskEdit dateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
    return this;
  }

   /**
   * Optional: Date due.
   * @return dateDue
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateDue() {
    return dateDue;
  }

  public void setDateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
  }


  public Workflowv3TaskEdit dependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Workflowv3TaskEdit addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

   /**
   * Optional: Task ID dependencies if sequential processing is needed.
   * @return dependsOn
  **/
  @javax.annotation.Nullable
  public List<String> getDependsOn() {
    return dependsOn;
  }

  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }


  public Workflowv3TaskEdit description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Optional: Multiline description of the task.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Workflowv3TaskEdit investigationLinks(List<Schedulerv3ConfigurationItem> investigationLinks) {
    this.investigationLinks = investigationLinks;
    return this;
  }

  public Workflowv3TaskEdit addInvestigationLinksItem(Schedulerv3ConfigurationItem investigationLinksItem) {
    if (this.investigationLinks == null) {
      this.investigationLinks = new ArrayList<>();
    }
    this.investigationLinks.add(investigationLinksItem);
    return this;
  }

   /**
   * Get investigationLinks
   * @return investigationLinks
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3ConfigurationItem> getInvestigationLinks() {
    return investigationLinks;
  }

  public void setInvestigationLinks(List<Schedulerv3ConfigurationItem> investigationLinks) {
    this.investigationLinks = investigationLinks;
  }


  public Workflowv3TaskEdit justification(String justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Optional: Justification - this text will be added to the respond justification.
   * @return justification
  **/
  @javax.annotation.Nullable
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }


  public Workflowv3TaskEdit priority(Workflowv3Priority priority) {
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


  public Workflowv3TaskEdit responseTemplate(Schedulerv3ConfigurationItem responseTemplate) {
    this.responseTemplate = responseTemplate;
    return this;
  }

   /**
   * Get responseTemplate
   * @return responseTemplate
  **/
  @javax.annotation.Nullable
  public Schedulerv3ConfigurationItem getResponseTemplate() {
    return responseTemplate;
  }

  public void setResponseTemplate(Schedulerv3ConfigurationItem responseTemplate) {
    this.responseTemplate = responseTemplate;
  }


  public Workflowv3TaskEdit reviewAction(String reviewAction) {
    this.reviewAction = reviewAction;
    return this;
  }

   /**
   * Optional: review action - this text will be added to the respond action.
   * @return reviewAction
  **/
  @javax.annotation.Nullable
  public String getReviewAction() {
    return reviewAction;
  }

  public void setReviewAction(String reviewAction) {
    this.reviewAction = reviewAction;
  }


  public Workflowv3TaskEdit status(Workflowv3Status status) {
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


  public Workflowv3TaskEdit tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Workflowv3TaskEdit addTagsItem(String tagsItem) {
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


  public Workflowv3TaskEdit taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public Workflowv3TaskEdit title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Optional: Task title (subject).
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
    Workflowv3TaskEdit workflowv3TaskEdit = (Workflowv3TaskEdit) o;
    return Objects.equals(this.assignments, workflowv3TaskEdit.assignments) &&
        Objects.equals(this.comment, workflowv3TaskEdit.comment) &&
        Objects.equals(this.dateDue, workflowv3TaskEdit.dateDue) &&
        Objects.equals(this.dependsOn, workflowv3TaskEdit.dependsOn) &&
        Objects.equals(this.description, workflowv3TaskEdit.description) &&
        Objects.equals(this.investigationLinks, workflowv3TaskEdit.investigationLinks) &&
        Objects.equals(this.justification, workflowv3TaskEdit.justification) &&
        Objects.equals(this.priority, workflowv3TaskEdit.priority) &&
        Objects.equals(this.responseTemplate, workflowv3TaskEdit.responseTemplate) &&
        Objects.equals(this.reviewAction, workflowv3TaskEdit.reviewAction) &&
        Objects.equals(this.status, workflowv3TaskEdit.status) &&
        Objects.equals(this.tags, workflowv3TaskEdit.tags) &&
        Objects.equals(this.taskId, workflowv3TaskEdit.taskId) &&
        Objects.equals(this.title, workflowv3TaskEdit.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments, comment, dateDue, dependsOn, description, investigationLinks, justification, priority, responseTemplate, reviewAction, status, tags, taskId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3TaskEdit {\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    investigationLinks: ").append(toIndentedString(investigationLinks)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    responseTemplate: ").append(toIndentedString(responseTemplate)).append("\n");
    sb.append("    reviewAction: ").append(toIndentedString(reviewAction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
    openapiFields.add("assignments");
    openapiFields.add("comment");
    openapiFields.add("date_due");
    openapiFields.add("depends_on");
    openapiFields.add("description");
    openapiFields.add("investigation_links");
    openapiFields.add("justification");
    openapiFields.add("priority");
    openapiFields.add("response_template");
    openapiFields.add("review_action");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("task_id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3TaskEdit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3TaskEdit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3TaskEdit is not found in the empty JSON string", Workflowv3TaskEdit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3TaskEdit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3TaskEdit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("depends_on") != null && !jsonObj.get("depends_on").isJsonNull() && !jsonObj.get("depends_on").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `depends_on` to be an array in the JSON string but got `%s`", jsonObj.get("depends_on").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("investigation_links") != null && !jsonObj.get("investigation_links").isJsonNull()) {
        JsonArray jsonArrayinvestigationLinks = jsonObj.getAsJsonArray("investigation_links");
        if (jsonArrayinvestigationLinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("investigation_links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `investigation_links` to be an array in the JSON string but got `%s`", jsonObj.get("investigation_links").toString()));
          }

          // validate the optional field `investigation_links` (array)
          for (int i = 0; i < jsonArrayinvestigationLinks.size(); i++) {
            Schedulerv3ConfigurationItem.validateJsonElement(jsonArrayinvestigationLinks.get(i));
          };
        }
      }
      if ((jsonObj.get("justification") != null && !jsonObj.get("justification").isJsonNull()) && !jsonObj.get("justification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `justification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("justification").toString()));
      }
      // validate the optional field `priority`
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) {
        Workflowv3Priority.validateJsonElement(jsonObj.get("priority"));
      }
      // validate the optional field `response_template`
      if (jsonObj.get("response_template") != null && !jsonObj.get("response_template").isJsonNull()) {
        Schedulerv3ConfigurationItem.validateJsonElement(jsonObj.get("response_template"));
      }
      if ((jsonObj.get("review_action") != null && !jsonObj.get("review_action").isJsonNull()) && !jsonObj.get("review_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_action").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Workflowv3Status.validateJsonElement(jsonObj.get("status"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("task_id") != null && !jsonObj.get("task_id").isJsonNull()) && !jsonObj.get("task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3TaskEdit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3TaskEdit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3TaskEdit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3TaskEdit.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3TaskEdit>() {
           @Override
           public void write(JsonWriter out, Workflowv3TaskEdit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3TaskEdit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3TaskEdit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3TaskEdit
  * @throws IOException if the JSON string is invalid with respect to Workflowv3TaskEdit
  */
  public static Workflowv3TaskEdit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3TaskEdit.class);
  }

 /**
  * Convert an instance of Workflowv3TaskEdit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

