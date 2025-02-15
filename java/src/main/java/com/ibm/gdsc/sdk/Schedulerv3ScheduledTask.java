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
import com.ibm.gdsc.sdk.Reportsv3ReportFilterBrackets;
import com.ibm.gdsc.sdk.Schedulerv3AuditType;
import com.ibm.gdsc.sdk.Schedulerv3ConfigurationItem;
import com.ibm.gdsc.sdk.Schedulerv3DeliveryMethod;
import com.ibm.gdsc.sdk.Schedulerv3Recipient;
import com.ibm.gdsc.sdk.Schedulerv3TaskParameter;
import com.ibm.gdsc.sdk.Schedulerv3TaskType;
import com.ibm.gdsc.sdk.Schedulerv3WorkflowType;
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
 * Scheduled Task for Post v3/schedules api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3ScheduledTask {
  public static final String SERIALIZED_NAME_AUDIT_TYPE = "audit_type";
  @SerializedName(SERIALIZED_NAME_AUDIT_TYPE)
  private Schedulerv3AuditType auditType = Schedulerv3AuditType.UNDEFINED_TYPE;

  public static final String SERIALIZED_NAME_DELIVERY_METHOD = "delivery_method";
  @SerializedName(SERIALIZED_NAME_DELIVERY_METHOD)
  private Schedulerv3DeliveryMethod deliveryMethod;

  public static final String SERIALIZED_NAME_DISTRIBUTION_RULE_IDS = "distribution_rule_ids";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_RULE_IDS)
  private List<String> distributionRuleIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL_SUBJECT = "email_subject";
  @SerializedName(SERIALIZED_NAME_EMAIL_SUBJECT)
  private String emailSubject;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private Schedulerv3TaskParameter parameter;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<Schedulerv3Recipient> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_FILTERS = "report_filters";
  @SerializedName(SERIALIZED_NAME_REPORT_FILTERS)
  private Reportsv3ReportFilterBrackets reportFilters;

  public static final String SERIALIZED_NAME_SCHEDULED_TASK_ID = "scheduled_task_id";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_TASK_ID)
  private String scheduledTaskId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Schedulerv3TaskType type = Schedulerv3TaskType.UNDEFINED_JOBTYPE;

  public static final String SERIALIZED_NAME_WORKFLOW_INVESTIGATION_LINKS = "workflow_investigation_links";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_INVESTIGATION_LINKS)
  private List<Schedulerv3ConfigurationItem> workflowInvestigationLinks = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKFLOW_RESPONSE_TEMPLATE = "workflow_response_template";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_RESPONSE_TEMPLATE)
  private Schedulerv3ConfigurationItem workflowResponseTemplate;

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "workflow_type";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
  private Schedulerv3WorkflowType workflowType = Schedulerv3WorkflowType.NONE;

  public static final String SERIALIZED_NAME_WORKFLOW_UNIQUE_FIELDS = "workflow_unique_fields";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_UNIQUE_FIELDS)
  private List<String> workflowUniqueFields = new ArrayList<>();

  public Schedulerv3ScheduledTask() {
  }

  public Schedulerv3ScheduledTask auditType(Schedulerv3AuditType auditType) {
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


  public Schedulerv3ScheduledTask deliveryMethod(Schedulerv3DeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @javax.annotation.Nullable
  public Schedulerv3DeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(Schedulerv3DeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  public Schedulerv3ScheduledTask distributionRuleIds(List<String> distributionRuleIds) {
    this.distributionRuleIds = distributionRuleIds;
    return this;
  }

  public Schedulerv3ScheduledTask addDistributionRuleIdsItem(String distributionRuleIdsItem) {
    if (this.distributionRuleIds == null) {
      this.distributionRuleIds = new ArrayList<>();
    }
    this.distributionRuleIds.add(distributionRuleIdsItem);
    return this;
  }

   /**
   * Optional: Distribution rule IDs for a task. Will be populated by recipients on save.
   * @return distributionRuleIds
  **/
  @javax.annotation.Nullable
  public List<String> getDistributionRuleIds() {
    return distributionRuleIds;
  }

  public void setDistributionRuleIds(List<String> distributionRuleIds) {
    this.distributionRuleIds = distributionRuleIds;
  }


  public Schedulerv3ScheduledTask emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Optional: Email subject with replaceable variables.
   * @return emailSubject
  **/
  @javax.annotation.Nullable
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  public Schedulerv3ScheduledTask instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Optional: Instructions for the task owner.
   * @return instructions
  **/
  @javax.annotation.Nullable
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public Schedulerv3ScheduledTask name(String name) {
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


  public Schedulerv3ScheduledTask parameter(Schedulerv3TaskParameter parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @javax.annotation.Nullable
  public Schedulerv3TaskParameter getParameter() {
    return parameter;
  }

  public void setParameter(Schedulerv3TaskParameter parameter) {
    this.parameter = parameter;
  }


  public Schedulerv3ScheduledTask recipients(List<Schedulerv3Recipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Schedulerv3ScheduledTask addRecipientsItem(Schedulerv3Recipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Optional: Report result recipients.
   * @return recipients
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3Recipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Schedulerv3Recipient> recipients) {
    this.recipients = recipients;
  }


  public Schedulerv3ScheduledTask reportFilters(Reportsv3ReportFilterBrackets reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

   /**
   * Get reportFilters
   * @return reportFilters
  **/
  @javax.annotation.Nullable
  public Reportsv3ReportFilterBrackets getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Reportsv3ReportFilterBrackets reportFilters) {
    this.reportFilters = reportFilters;
  }


  public Schedulerv3ScheduledTask scheduledTaskId(String scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
    return this;
  }

   /**
   * Optional: Id for the task.
   * @return scheduledTaskId
  **/
  @javax.annotation.Nullable
  public String getScheduledTaskId() {
    return scheduledTaskId;
  }

  public void setScheduledTaskId(String scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
  }


  public Schedulerv3ScheduledTask type(Schedulerv3TaskType type) {
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


  public Schedulerv3ScheduledTask workflowInvestigationLinks(List<Schedulerv3ConfigurationItem> workflowInvestigationLinks) {
    this.workflowInvestigationLinks = workflowInvestigationLinks;
    return this;
  }

  public Schedulerv3ScheduledTask addWorkflowInvestigationLinksItem(Schedulerv3ConfigurationItem workflowInvestigationLinksItem) {
    if (this.workflowInvestigationLinks == null) {
      this.workflowInvestigationLinks = new ArrayList<>();
    }
    this.workflowInvestigationLinks.add(workflowInvestigationLinksItem);
    return this;
  }

   /**
   * Get workflowInvestigationLinks
   * @return workflowInvestigationLinks
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3ConfigurationItem> getWorkflowInvestigationLinks() {
    return workflowInvestigationLinks;
  }

  public void setWorkflowInvestigationLinks(List<Schedulerv3ConfigurationItem> workflowInvestigationLinks) {
    this.workflowInvestigationLinks = workflowInvestigationLinks;
  }


  public Schedulerv3ScheduledTask workflowResponseTemplate(Schedulerv3ConfigurationItem workflowResponseTemplate) {
    this.workflowResponseTemplate = workflowResponseTemplate;
    return this;
  }

   /**
   * Get workflowResponseTemplate
   * @return workflowResponseTemplate
  **/
  @javax.annotation.Nullable
  public Schedulerv3ConfigurationItem getWorkflowResponseTemplate() {
    return workflowResponseTemplate;
  }

  public void setWorkflowResponseTemplate(Schedulerv3ConfigurationItem workflowResponseTemplate) {
    this.workflowResponseTemplate = workflowResponseTemplate;
  }


  public Schedulerv3ScheduledTask workflowType(Schedulerv3WorkflowType workflowType) {
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


  public Schedulerv3ScheduledTask workflowUniqueFields(List<String> workflowUniqueFields) {
    this.workflowUniqueFields = workflowUniqueFields;
    return this;
  }

  public Schedulerv3ScheduledTask addWorkflowUniqueFieldsItem(String workflowUniqueFieldsItem) {
    if (this.workflowUniqueFields == null) {
      this.workflowUniqueFields = new ArrayList<>();
    }
    this.workflowUniqueFields.add(workflowUniqueFieldsItem);
    return this;
  }

   /**
   * Get workflowUniqueFields
   * @return workflowUniqueFields
  **/
  @javax.annotation.Nullable
  public List<String> getWorkflowUniqueFields() {
    return workflowUniqueFields;
  }

  public void setWorkflowUniqueFields(List<String> workflowUniqueFields) {
    this.workflowUniqueFields = workflowUniqueFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3ScheduledTask schedulerv3ScheduledTask = (Schedulerv3ScheduledTask) o;
    return Objects.equals(this.auditType, schedulerv3ScheduledTask.auditType) &&
        Objects.equals(this.deliveryMethod, schedulerv3ScheduledTask.deliveryMethod) &&
        Objects.equals(this.distributionRuleIds, schedulerv3ScheduledTask.distributionRuleIds) &&
        Objects.equals(this.emailSubject, schedulerv3ScheduledTask.emailSubject) &&
        Objects.equals(this.instructions, schedulerv3ScheduledTask.instructions) &&
        Objects.equals(this.name, schedulerv3ScheduledTask.name) &&
        Objects.equals(this.parameter, schedulerv3ScheduledTask.parameter) &&
        Objects.equals(this.recipients, schedulerv3ScheduledTask.recipients) &&
        Objects.equals(this.reportFilters, schedulerv3ScheduledTask.reportFilters) &&
        Objects.equals(this.scheduledTaskId, schedulerv3ScheduledTask.scheduledTaskId) &&
        Objects.equals(this.type, schedulerv3ScheduledTask.type) &&
        Objects.equals(this.workflowInvestigationLinks, schedulerv3ScheduledTask.workflowInvestigationLinks) &&
        Objects.equals(this.workflowResponseTemplate, schedulerv3ScheduledTask.workflowResponseTemplate) &&
        Objects.equals(this.workflowType, schedulerv3ScheduledTask.workflowType) &&
        Objects.equals(this.workflowUniqueFields, schedulerv3ScheduledTask.workflowUniqueFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditType, deliveryMethod, distributionRuleIds, emailSubject, instructions, name, parameter, recipients, reportFilters, scheduledTaskId, type, workflowInvestigationLinks, workflowResponseTemplate, workflowType, workflowUniqueFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3ScheduledTask {\n");
    sb.append("    auditType: ").append(toIndentedString(auditType)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    distributionRuleIds: ").append(toIndentedString(distributionRuleIds)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    scheduledTaskId: ").append(toIndentedString(scheduledTaskId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workflowInvestigationLinks: ").append(toIndentedString(workflowInvestigationLinks)).append("\n");
    sb.append("    workflowResponseTemplate: ").append(toIndentedString(workflowResponseTemplate)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowUniqueFields: ").append(toIndentedString(workflowUniqueFields)).append("\n");
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
    openapiFields.add("delivery_method");
    openapiFields.add("distribution_rule_ids");
    openapiFields.add("email_subject");
    openapiFields.add("instructions");
    openapiFields.add("name");
    openapiFields.add("parameter");
    openapiFields.add("recipients");
    openapiFields.add("report_filters");
    openapiFields.add("scheduled_task_id");
    openapiFields.add("type");
    openapiFields.add("workflow_investigation_links");
    openapiFields.add("workflow_response_template");
    openapiFields.add("workflow_type");
    openapiFields.add("workflow_unique_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3ScheduledTask
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3ScheduledTask.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3ScheduledTask is not found in the empty JSON string", Schedulerv3ScheduledTask.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3ScheduledTask.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3ScheduledTask` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `audit_type`
      if (jsonObj.get("audit_type") != null && !jsonObj.get("audit_type").isJsonNull()) {
        Schedulerv3AuditType.validateJsonElement(jsonObj.get("audit_type"));
      }
      // validate the optional field `delivery_method`
      if (jsonObj.get("delivery_method") != null && !jsonObj.get("delivery_method").isJsonNull()) {
        Schedulerv3DeliveryMethod.validateJsonElement(jsonObj.get("delivery_method"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("distribution_rule_ids") != null && !jsonObj.get("distribution_rule_ids").isJsonNull() && !jsonObj.get("distribution_rule_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `distribution_rule_ids` to be an array in the JSON string but got `%s`", jsonObj.get("distribution_rule_ids").toString()));
      }
      if ((jsonObj.get("email_subject") != null && !jsonObj.get("email_subject").isJsonNull()) && !jsonObj.get("email_subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_subject").toString()));
      }
      if ((jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull()) && !jsonObj.get("instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `parameter`
      if (jsonObj.get("parameter") != null && !jsonObj.get("parameter").isJsonNull()) {
        Schedulerv3TaskParameter.validateJsonElement(jsonObj.get("parameter"));
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
      // validate the optional field `report_filters`
      if (jsonObj.get("report_filters") != null && !jsonObj.get("report_filters").isJsonNull()) {
        Reportsv3ReportFilterBrackets.validateJsonElement(jsonObj.get("report_filters"));
      }
      if ((jsonObj.get("scheduled_task_id") != null && !jsonObj.get("scheduled_task_id").isJsonNull()) && !jsonObj.get("scheduled_task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduled_task_id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Schedulerv3TaskType.validateJsonElement(jsonObj.get("type"));
      }
      if (jsonObj.get("workflow_investigation_links") != null && !jsonObj.get("workflow_investigation_links").isJsonNull()) {
        JsonArray jsonArrayworkflowInvestigationLinks = jsonObj.getAsJsonArray("workflow_investigation_links");
        if (jsonArrayworkflowInvestigationLinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("workflow_investigation_links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `workflow_investigation_links` to be an array in the JSON string but got `%s`", jsonObj.get("workflow_investigation_links").toString()));
          }

          // validate the optional field `workflow_investigation_links` (array)
          for (int i = 0; i < jsonArrayworkflowInvestigationLinks.size(); i++) {
            Schedulerv3ConfigurationItem.validateJsonElement(jsonArrayworkflowInvestigationLinks.get(i));
          };
        }
      }
      // validate the optional field `workflow_response_template`
      if (jsonObj.get("workflow_response_template") != null && !jsonObj.get("workflow_response_template").isJsonNull()) {
        Schedulerv3ConfigurationItem.validateJsonElement(jsonObj.get("workflow_response_template"));
      }
      // validate the optional field `workflow_type`
      if (jsonObj.get("workflow_type") != null && !jsonObj.get("workflow_type").isJsonNull()) {
        Schedulerv3WorkflowType.validateJsonElement(jsonObj.get("workflow_type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workflow_unique_fields") != null && !jsonObj.get("workflow_unique_fields").isJsonNull() && !jsonObj.get("workflow_unique_fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow_unique_fields` to be an array in the JSON string but got `%s`", jsonObj.get("workflow_unique_fields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3ScheduledTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3ScheduledTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3ScheduledTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3ScheduledTask.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3ScheduledTask>() {
           @Override
           public void write(JsonWriter out, Schedulerv3ScheduledTask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3ScheduledTask read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3ScheduledTask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3ScheduledTask
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3ScheduledTask
  */
  public static Schedulerv3ScheduledTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3ScheduledTask.class);
  }

 /**
  * Convert an instance of Schedulerv3ScheduledTask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

