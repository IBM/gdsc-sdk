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
import com.ibm.gdsc.sdk.Schedulerv3WorkflowType;
import com.ibm.gdsc.sdk.Workflowv3Comment;
import com.ibm.gdsc.sdk.Workflowv3Entity;
import com.ibm.gdsc.sdk.Workflowv3Priority;
import com.ibm.gdsc.sdk.Workflowv3ReportResult;
import com.ibm.gdsc.sdk.Workflowv3ReportRun;
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
 * Task (sub-task of a case).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3Task {
  public static final String SERIALIZED_NAME_ALT_ID = "alt_id";
  @SerializedName(SERIALIZED_NAME_ALT_ID)
  private String altId;

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

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Workflowv3Priority priority = Workflowv3Priority.UNDEFINED_PRIORITY;

  public static final String SERIALIZED_NAME_REPORT_RESULT = "report_result";
  @SerializedName(SERIALIZED_NAME_REPORT_RESULT)
  private Workflowv3ReportResult reportResult;

  public static final String SERIALIZED_NAME_RESPONSE_TEMPLATE = "response_template";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TEMPLATE)
  private Schedulerv3ConfigurationItem responseTemplate;

  public static final String SERIALIZED_NAME_REVIEW_ACTION = "review_action";
  @SerializedName(SERIALIZED_NAME_REVIEW_ACTION)
  private String reviewAction;

  public static final String SERIALIZED_NAME_RUN = "run";
  @SerializedName(SERIALIZED_NAME_RUN)
  private Workflowv3ReportRun run;

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

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "workflow_type";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
  private Schedulerv3WorkflowType workflowType = Schedulerv3WorkflowType.NONE;

  public Workflowv3Task() {
  }

  public Workflowv3Task altId(String altId) {
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


  public Workflowv3Task assignments(List<Workflowv3Entity> assignments) {
    this.assignments = assignments;
    return this;
  }

  public Workflowv3Task addAssignmentsItem(Workflowv3Entity assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Entities that the task is assigned to.
   * @return assignments
  **/
  @javax.annotation.Nullable
  public List<Workflowv3Entity> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<Workflowv3Entity> assignments) {
    this.assignments = assignments;
  }


  public Workflowv3Task caseId(String caseId) {
    this.caseId = caseId;
    return this;
  }

   /**
   * Parent case.
   * @return caseId
  **/
  @javax.annotation.Nullable
  public String getCaseId() {
    return caseId;
  }

  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  public Workflowv3Task comments(List<Workflowv3Comment> comments) {
    this.comments = comments;
    return this;
  }

  public Workflowv3Task addCommentsItem(Workflowv3Comment commentsItem) {
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


  public Workflowv3Task dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date created.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public Workflowv3Task dateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
    return this;
  }

   /**
   * Date due.
   * @return dateDue
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateDue() {
    return dateDue;
  }

  public void setDateDue(OffsetDateTime dateDue) {
    this.dateDue = dateDue;
  }


  public Workflowv3Task dateModified(OffsetDateTime dateModified) {
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


  public Workflowv3Task dependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Workflowv3Task addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

   /**
   * Task ID dependencies if sequential processing is needed.
   * @return dependsOn
  **/
  @javax.annotation.Nullable
  public List<String> getDependsOn() {
    return dependsOn;
  }

  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }


  public Workflowv3Task description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Multiline description of the task.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Workflowv3Task investigationLinks(List<Schedulerv3ConfigurationItem> investigationLinks) {
    this.investigationLinks = investigationLinks;
    return this;
  }

  public Workflowv3Task addInvestigationLinksItem(Schedulerv3ConfigurationItem investigationLinksItem) {
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


  public Workflowv3Task justification(String justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Get justification
   * @return justification
  **/
  @javax.annotation.Nullable
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }


  public Workflowv3Task number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public Workflowv3Task priority(Workflowv3Priority priority) {
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


  public Workflowv3Task reportResult(Workflowv3ReportResult reportResult) {
    this.reportResult = reportResult;
    return this;
  }

   /**
   * Get reportResult
   * @return reportResult
  **/
  @javax.annotation.Nullable
  public Workflowv3ReportResult getReportResult() {
    return reportResult;
  }

  public void setReportResult(Workflowv3ReportResult reportResult) {
    this.reportResult = reportResult;
  }


  public Workflowv3Task responseTemplate(Schedulerv3ConfigurationItem responseTemplate) {
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


  public Workflowv3Task reviewAction(String reviewAction) {
    this.reviewAction = reviewAction;
    return this;
  }

   /**
   * Get reviewAction
   * @return reviewAction
  **/
  @javax.annotation.Nullable
  public String getReviewAction() {
    return reviewAction;
  }

  public void setReviewAction(String reviewAction) {
    this.reviewAction = reviewAction;
  }


  public Workflowv3Task run(Workflowv3ReportRun run) {
    this.run = run;
    return this;
  }

   /**
   * Get run
   * @return run
  **/
  @javax.annotation.Nullable
  public Workflowv3ReportRun getRun() {
    return run;
  }

  public void setRun(Workflowv3ReportRun run) {
    this.run = run;
  }


  public Workflowv3Task status(Workflowv3Status status) {
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


  public Workflowv3Task tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Workflowv3Task addTagsItem(String tagsItem) {
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


  public Workflowv3Task taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Unique ID.
   * @return taskId
  **/
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public Workflowv3Task title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Task title (subject).
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Workflowv3Task workflowType(Schedulerv3WorkflowType workflowType) {
    this.workflowType = workflowType;
    return this;
  }

   /**
   * Get workflowType
   * @return workflowType
  **/
  @javax.annotation.Nullable
  public Schedulerv3WorkflowType getWorkflowType() {
    return workflowType;
  }

  public void setWorkflowType(Schedulerv3WorkflowType workflowType) {
    this.workflowType = workflowType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3Task workflowv3Task = (Workflowv3Task) o;
    return Objects.equals(this.altId, workflowv3Task.altId) &&
        Objects.equals(this.assignments, workflowv3Task.assignments) &&
        Objects.equals(this.caseId, workflowv3Task.caseId) &&
        Objects.equals(this.comments, workflowv3Task.comments) &&
        Objects.equals(this.dateCreated, workflowv3Task.dateCreated) &&
        Objects.equals(this.dateDue, workflowv3Task.dateDue) &&
        Objects.equals(this.dateModified, workflowv3Task.dateModified) &&
        Objects.equals(this.dependsOn, workflowv3Task.dependsOn) &&
        Objects.equals(this.description, workflowv3Task.description) &&
        Objects.equals(this.investigationLinks, workflowv3Task.investigationLinks) &&
        Objects.equals(this.justification, workflowv3Task.justification) &&
        Objects.equals(this.number, workflowv3Task.number) &&
        Objects.equals(this.priority, workflowv3Task.priority) &&
        Objects.equals(this.reportResult, workflowv3Task.reportResult) &&
        Objects.equals(this.responseTemplate, workflowv3Task.responseTemplate) &&
        Objects.equals(this.reviewAction, workflowv3Task.reviewAction) &&
        Objects.equals(this.run, workflowv3Task.run) &&
        Objects.equals(this.status, workflowv3Task.status) &&
        Objects.equals(this.tags, workflowv3Task.tags) &&
        Objects.equals(this.taskId, workflowv3Task.taskId) &&
        Objects.equals(this.title, workflowv3Task.title) &&
        Objects.equals(this.workflowType, workflowv3Task.workflowType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altId, assignments, caseId, comments, dateCreated, dateDue, dateModified, dependsOn, description, investigationLinks, justification, number, priority, reportResult, responseTemplate, reviewAction, run, status, tags, taskId, title, workflowType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3Task {\n");
    sb.append("    altId: ").append(toIndentedString(altId)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    investigationLinks: ").append(toIndentedString(investigationLinks)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    reportResult: ").append(toIndentedString(reportResult)).append("\n");
    sb.append("    responseTemplate: ").append(toIndentedString(responseTemplate)).append("\n");
    sb.append("    reviewAction: ").append(toIndentedString(reviewAction)).append("\n");
    sb.append("    run: ").append(toIndentedString(run)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
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
    openapiFields.add("assignments");
    openapiFields.add("case_id");
    openapiFields.add("comments");
    openapiFields.add("date_created");
    openapiFields.add("date_due");
    openapiFields.add("date_modified");
    openapiFields.add("depends_on");
    openapiFields.add("description");
    openapiFields.add("investigation_links");
    openapiFields.add("justification");
    openapiFields.add("number");
    openapiFields.add("priority");
    openapiFields.add("report_result");
    openapiFields.add("response_template");
    openapiFields.add("review_action");
    openapiFields.add("run");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("task_id");
    openapiFields.add("title");
    openapiFields.add("workflow_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3Task
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3Task.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3Task is not found in the empty JSON string", Workflowv3Task.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3Task.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3Task` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alt_id") != null && !jsonObj.get("alt_id").isJsonNull()) && !jsonObj.get("alt_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alt_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alt_id").toString()));
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
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // validate the optional field `priority`
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) {
        Workflowv3Priority.validateJsonElement(jsonObj.get("priority"));
      }
      // validate the optional field `report_result`
      if (jsonObj.get("report_result") != null && !jsonObj.get("report_result").isJsonNull()) {
        Workflowv3ReportResult.validateJsonElement(jsonObj.get("report_result"));
      }
      // validate the optional field `response_template`
      if (jsonObj.get("response_template") != null && !jsonObj.get("response_template").isJsonNull()) {
        Schedulerv3ConfigurationItem.validateJsonElement(jsonObj.get("response_template"));
      }
      if ((jsonObj.get("review_action") != null && !jsonObj.get("review_action").isJsonNull()) && !jsonObj.get("review_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_action").toString()));
      }
      // validate the optional field `run`
      if (jsonObj.get("run") != null && !jsonObj.get("run").isJsonNull()) {
        Workflowv3ReportRun.validateJsonElement(jsonObj.get("run"));
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
      // validate the optional field `workflow_type`
      if (jsonObj.get("workflow_type") != null && !jsonObj.get("workflow_type").isJsonNull()) {
        Schedulerv3WorkflowType.validateJsonElement(jsonObj.get("workflow_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3Task.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3Task' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3Task> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3Task.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3Task>() {
           @Override
           public void write(JsonWriter out, Workflowv3Task value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3Task read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3Task given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3Task
  * @throws IOException if the JSON string is invalid with respect to Workflowv3Task
  */
  public static Workflowv3Task fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3Task.class);
  }

 /**
  * Convert an instance of Workflowv3Task to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

