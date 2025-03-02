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
import com.ibm.security.guardium.Schedulerv3AuditType;
import com.ibm.security.guardium.Schedulerv3ConfigurationItem;
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

import com.ibm.security.JSON;

/**
 * Workflowv3ProductWorkflow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3ProductWorkflow {
  public static final String SERIALIZED_NAME_AUDIT_TYPE = "audit_type";
  @SerializedName(SERIALIZED_NAME_AUDIT_TYPE)
  private Schedulerv3AuditType auditType = Schedulerv3AuditType.UNDEFINED_TYPE;

  public static final String SERIALIZED_NAME_CONFIG_TYPES = "config_types";
  @SerializedName(SERIALIZED_NAME_CONFIG_TYPES)
  private List<String> configTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKFLOW_INVESTIGATION_LINKS = "workflow_investigation_links";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_INVESTIGATION_LINKS)
  private List<Schedulerv3ConfigurationItem> workflowInvestigationLinks = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKFLOW_RESPONSE_TEMPLATE = "workflow_response_template";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_RESPONSE_TEMPLATE)
  private Schedulerv3ConfigurationItem workflowResponseTemplate;

  public static final String SERIALIZED_NAME_WORKFLOW_UNIQUE_FIELDS = "workflow_unique_fields";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_UNIQUE_FIELDS)
  private List<String> workflowUniqueFields = new ArrayList<>();

  public Workflowv3ProductWorkflow() {
  }

  public Workflowv3ProductWorkflow auditType(Schedulerv3AuditType auditType) {
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


  public Workflowv3ProductWorkflow configTypes(List<String> configTypes) {
    this.configTypes = configTypes;
    return this;
  }

  public Workflowv3ProductWorkflow addConfigTypesItem(String configTypesItem) {
    if (this.configTypes == null) {
      this.configTypes = new ArrayList<>();
    }
    this.configTypes.add(configTypesItem);
    return this;
  }

   /**
   * Get configTypes
   * @return configTypes
  **/
  @javax.annotation.Nullable
  public List<String> getConfigTypes() {
    return configTypes;
  }

  public void setConfigTypes(List<String> configTypes) {
    this.configTypes = configTypes;
  }


  public Workflowv3ProductWorkflow workflowInvestigationLinks(List<Schedulerv3ConfigurationItem> workflowInvestigationLinks) {
    this.workflowInvestigationLinks = workflowInvestigationLinks;
    return this;
  }

  public Workflowv3ProductWorkflow addWorkflowInvestigationLinksItem(Schedulerv3ConfigurationItem workflowInvestigationLinksItem) {
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


  public Workflowv3ProductWorkflow workflowResponseTemplate(Schedulerv3ConfigurationItem workflowResponseTemplate) {
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


  public Workflowv3ProductWorkflow workflowUniqueFields(List<String> workflowUniqueFields) {
    this.workflowUniqueFields = workflowUniqueFields;
    return this;
  }

  public Workflowv3ProductWorkflow addWorkflowUniqueFieldsItem(String workflowUniqueFieldsItem) {
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
    Workflowv3ProductWorkflow workflowv3ProductWorkflow = (Workflowv3ProductWorkflow) o;
    return Objects.equals(this.auditType, workflowv3ProductWorkflow.auditType) &&
        Objects.equals(this.configTypes, workflowv3ProductWorkflow.configTypes) &&
        Objects.equals(this.workflowInvestigationLinks, workflowv3ProductWorkflow.workflowInvestigationLinks) &&
        Objects.equals(this.workflowResponseTemplate, workflowv3ProductWorkflow.workflowResponseTemplate) &&
        Objects.equals(this.workflowUniqueFields, workflowv3ProductWorkflow.workflowUniqueFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditType, configTypes, workflowInvestigationLinks, workflowResponseTemplate, workflowUniqueFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3ProductWorkflow {\n");
    sb.append("    auditType: ").append(toIndentedString(auditType)).append("\n");
    sb.append("    configTypes: ").append(toIndentedString(configTypes)).append("\n");
    sb.append("    workflowInvestigationLinks: ").append(toIndentedString(workflowInvestigationLinks)).append("\n");
    sb.append("    workflowResponseTemplate: ").append(toIndentedString(workflowResponseTemplate)).append("\n");
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
    openapiFields.add("config_types");
    openapiFields.add("workflow_investigation_links");
    openapiFields.add("workflow_response_template");
    openapiFields.add("workflow_unique_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3ProductWorkflow
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3ProductWorkflow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3ProductWorkflow is not found in the empty JSON string", Workflowv3ProductWorkflow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3ProductWorkflow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3ProductWorkflow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `audit_type`
      if (jsonObj.get("audit_type") != null && !jsonObj.get("audit_type").isJsonNull()) {
        Schedulerv3AuditType.validateJsonElement(jsonObj.get("audit_type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("config_types") != null && !jsonObj.get("config_types").isJsonNull() && !jsonObj.get("config_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_types` to be an array in the JSON string but got `%s`", jsonObj.get("config_types").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("workflow_unique_fields") != null && !jsonObj.get("workflow_unique_fields").isJsonNull() && !jsonObj.get("workflow_unique_fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow_unique_fields` to be an array in the JSON string but got `%s`", jsonObj.get("workflow_unique_fields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3ProductWorkflow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3ProductWorkflow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3ProductWorkflow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3ProductWorkflow.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3ProductWorkflow>() {
           @Override
           public void write(JsonWriter out, Workflowv3ProductWorkflow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3ProductWorkflow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3ProductWorkflow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3ProductWorkflow
  * @throws IOException if the JSON string is invalid with respect to Workflowv3ProductWorkflow
  */
  public static Workflowv3ProductWorkflow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3ProductWorkflow.class);
  }

 /**
  * Convert an instance of Workflowv3ProductWorkflow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

