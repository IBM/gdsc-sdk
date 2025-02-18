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
import com.ibm.gdsc.sdk.Reportsv3OrderBy;
import com.ibm.gdsc.sdk.Workflowv3Filter;
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

import com.ibm.gdsc.JSON;

/**
 * Request cases by filtering on specific values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3SearchTasksRequest {
  public static final String SERIALIZED_NAME_CASE_ID = "case_id";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private String caseId;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private Workflowv3Filter filter;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_SORT_FIELD = "sort_field";
  @SerializedName(SERIALIZED_NAME_SORT_FIELD)
  private String sortField;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Reportsv3OrderBy sortOrder = Reportsv3OrderBy.UNDEFINED_ORDER_BY;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public Workflowv3SearchTasksRequest() {
  }

  public Workflowv3SearchTasksRequest caseId(String caseId) {
    this.caseId = caseId;
    return this;
  }

   /**
   * Get caseId
   * @return caseId
  **/
  @javax.annotation.Nullable
  public String getCaseId() {
    return caseId;
  }

  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  public Workflowv3SearchTasksRequest filter(Workflowv3Filter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  public Workflowv3Filter getFilter() {
    return filter;
  }

  public void setFilter(Workflowv3Filter filter) {
    this.filter = filter;
  }


  public Workflowv3SearchTasksRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Optional: The max amount of cases to return for pagination.
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public Workflowv3SearchTasksRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Optional: The amount to offset the cases for pagination.
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public Workflowv3SearchTasksRequest sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @javax.annotation.Nullable
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }


  public Workflowv3SearchTasksRequest sortOrder(Reportsv3OrderBy sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  public Reportsv3OrderBy getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Reportsv3OrderBy sortOrder) {
    this.sortOrder = sortOrder;
  }


  public Workflowv3SearchTasksRequest taskId(String taskId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3SearchTasksRequest workflowv3SearchTasksRequest = (Workflowv3SearchTasksRequest) o;
    return Objects.equals(this.caseId, workflowv3SearchTasksRequest.caseId) &&
        Objects.equals(this.filter, workflowv3SearchTasksRequest.filter) &&
        Objects.equals(this.limit, workflowv3SearchTasksRequest.limit) &&
        Objects.equals(this.offset, workflowv3SearchTasksRequest.offset) &&
        Objects.equals(this.sortField, workflowv3SearchTasksRequest.sortField) &&
        Objects.equals(this.sortOrder, workflowv3SearchTasksRequest.sortOrder) &&
        Objects.equals(this.taskId, workflowv3SearchTasksRequest.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseId, filter, limit, offset, sortField, sortOrder, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3SearchTasksRequest {\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
    openapiFields.add("case_id");
    openapiFields.add("filter");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("sort_field");
    openapiFields.add("sort_order");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3SearchTasksRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3SearchTasksRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3SearchTasksRequest is not found in the empty JSON string", Workflowv3SearchTasksRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3SearchTasksRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3SearchTasksRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("case_id") != null && !jsonObj.get("case_id").isJsonNull()) && !jsonObj.get("case_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `case_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("case_id").toString()));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        Workflowv3Filter.validateJsonElement(jsonObj.get("filter"));
      }
      if ((jsonObj.get("sort_field") != null && !jsonObj.get("sort_field").isJsonNull()) && !jsonObj.get("sort_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_field").toString()));
      }
      // validate the optional field `sort_order`
      if (jsonObj.get("sort_order") != null && !jsonObj.get("sort_order").isJsonNull()) {
        Reportsv3OrderBy.validateJsonElement(jsonObj.get("sort_order"));
      }
      if ((jsonObj.get("task_id") != null && !jsonObj.get("task_id").isJsonNull()) && !jsonObj.get("task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3SearchTasksRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3SearchTasksRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3SearchTasksRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3SearchTasksRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3SearchTasksRequest>() {
           @Override
           public void write(JsonWriter out, Workflowv3SearchTasksRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3SearchTasksRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3SearchTasksRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3SearchTasksRequest
  * @throws IOException if the JSON string is invalid with respect to Workflowv3SearchTasksRequest
  */
  public static Workflowv3SearchTasksRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3SearchTasksRequest.class);
  }

 /**
  * Convert an instance of Workflowv3SearchTasksRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

