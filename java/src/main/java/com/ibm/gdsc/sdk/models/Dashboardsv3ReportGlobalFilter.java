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
import com.ibm.gdsc.sdk.models.Dashboardsv3ReportOperator;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * Dashboardsv3ReportGlobalFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Dashboardsv3ReportGlobalFilter {
  public static final String SERIALIZED_NAME_CASE_INSENSITIVE = "case_insensitive";
  @SerializedName(SERIALIZED_NAME_CASE_INSENSITIVE)
  private Boolean caseInsensitive;

  public static final String SERIALIZED_NAME_FILTER_ITEM_TYPE = "filter_item_type";
  @SerializedName(SERIALIZED_NAME_FILTER_ITEM_TYPE)
  private String filterItemType;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_HEADER_ID = "header_id";
  @SerializedName(SERIALIZED_NAME_HEADER_ID)
  private String headerId;

  public static final String SERIALIZED_NAME_HEADER_TYPE = "header_type";
  @SerializedName(SERIALIZED_NAME_HEADER_TYPE)
  private String headerType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_OPERATOR_KEY = "operator_key";
  @SerializedName(SERIALIZED_NAME_OPERATOR_KEY)
  private String operatorKey;

  public static final String SERIALIZED_NAME_REPORT_OPERATOR = "report_operator";
  @SerializedName(SERIALIZED_NAME_REPORT_OPERATOR)
  private List<Dashboardsv3ReportOperator> reportOperator = new ArrayList<>();

  public Dashboardsv3ReportGlobalFilter() {
  }

  public Dashboardsv3ReportGlobalFilter caseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
    return this;
  }

   /**
   * Get caseInsensitive
   * @return caseInsensitive
  **/
  @javax.annotation.Nullable
  public Boolean getCaseInsensitive() {
    return caseInsensitive;
  }

  public void setCaseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
  }


  public Dashboardsv3ReportGlobalFilter filterItemType(String filterItemType) {
    this.filterItemType = filterItemType;
    return this;
  }

   /**
   * Get filterItemType
   * @return filterItemType
  **/
  @javax.annotation.Nullable
  public String getFilterItemType() {
    return filterItemType;
  }

  public void setFilterItemType(String filterItemType) {
    this.filterItemType = filterItemType;
  }


  public Dashboardsv3ReportGlobalFilter groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public Dashboardsv3ReportGlobalFilter headerId(String headerId) {
    this.headerId = headerId;
    return this;
  }

   /**
   * Get headerId
   * @return headerId
  **/
  @javax.annotation.Nullable
  public String getHeaderId() {
    return headerId;
  }

  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }


  public Dashboardsv3ReportGlobalFilter headerType(String headerType) {
    this.headerType = headerType;
    return this;
  }

   /**
   * Get headerType
   * @return headerType
  **/
  @javax.annotation.Nullable
  public String getHeaderType() {
    return headerType;
  }

  public void setHeaderType(String headerType) {
    this.headerType = headerType;
  }


  public Dashboardsv3ReportGlobalFilter id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Dashboardsv3ReportGlobalFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Dashboardsv3ReportGlobalFilter operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nullable
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public Dashboardsv3ReportGlobalFilter operatorKey(String operatorKey) {
    this.operatorKey = operatorKey;
    return this;
  }

   /**
   * Get operatorKey
   * @return operatorKey
  **/
  @javax.annotation.Nullable
  public String getOperatorKey() {
    return operatorKey;
  }

  public void setOperatorKey(String operatorKey) {
    this.operatorKey = operatorKey;
  }


  public Dashboardsv3ReportGlobalFilter reportOperator(List<Dashboardsv3ReportOperator> reportOperator) {
    this.reportOperator = reportOperator;
    return this;
  }

  public Dashboardsv3ReportGlobalFilter addReportOperatorItem(Dashboardsv3ReportOperator reportOperatorItem) {
    if (this.reportOperator == null) {
      this.reportOperator = new ArrayList<>();
    }
    this.reportOperator.add(reportOperatorItem);
    return this;
  }

   /**
   * Get reportOperator
   * @return reportOperator
  **/
  @javax.annotation.Nullable
  public List<Dashboardsv3ReportOperator> getReportOperator() {
    return reportOperator;
  }

  public void setReportOperator(List<Dashboardsv3ReportOperator> reportOperator) {
    this.reportOperator = reportOperator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboardsv3ReportGlobalFilter dashboardsv3ReportGlobalFilter = (Dashboardsv3ReportGlobalFilter) o;
    return Objects.equals(this.caseInsensitive, dashboardsv3ReportGlobalFilter.caseInsensitive) &&
        Objects.equals(this.filterItemType, dashboardsv3ReportGlobalFilter.filterItemType) &&
        Objects.equals(this.groupName, dashboardsv3ReportGlobalFilter.groupName) &&
        Objects.equals(this.headerId, dashboardsv3ReportGlobalFilter.headerId) &&
        Objects.equals(this.headerType, dashboardsv3ReportGlobalFilter.headerType) &&
        Objects.equals(this.id, dashboardsv3ReportGlobalFilter.id) &&
        Objects.equals(this.name, dashboardsv3ReportGlobalFilter.name) &&
        Objects.equals(this.operator, dashboardsv3ReportGlobalFilter.operator) &&
        Objects.equals(this.operatorKey, dashboardsv3ReportGlobalFilter.operatorKey) &&
        Objects.equals(this.reportOperator, dashboardsv3ReportGlobalFilter.reportOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseInsensitive, filterItemType, groupName, headerId, headerType, id, name, operator, operatorKey, reportOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboardsv3ReportGlobalFilter {\n");
    sb.append("    caseInsensitive: ").append(toIndentedString(caseInsensitive)).append("\n");
    sb.append("    filterItemType: ").append(toIndentedString(filterItemType)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    headerType: ").append(toIndentedString(headerType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operatorKey: ").append(toIndentedString(operatorKey)).append("\n");
    sb.append("    reportOperator: ").append(toIndentedString(reportOperator)).append("\n");
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
    openapiFields.add("case_insensitive");
    openapiFields.add("filter_item_type");
    openapiFields.add("group_name");
    openapiFields.add("header_id");
    openapiFields.add("header_type");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("operator");
    openapiFields.add("operator_key");
    openapiFields.add("report_operator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dashboardsv3ReportGlobalFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dashboardsv3ReportGlobalFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboardsv3ReportGlobalFilter is not found in the empty JSON string", Dashboardsv3ReportGlobalFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dashboardsv3ReportGlobalFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dashboardsv3ReportGlobalFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("filter_item_type") != null && !jsonObj.get("filter_item_type").isJsonNull()) && !jsonObj.get("filter_item_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_item_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_item_type").toString()));
      }
      if ((jsonObj.get("group_name") != null && !jsonObj.get("group_name").isJsonNull()) && !jsonObj.get("group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_name").toString()));
      }
      if ((jsonObj.get("header_id") != null && !jsonObj.get("header_id").isJsonNull()) && !jsonObj.get("header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_id").toString()));
      }
      if ((jsonObj.get("header_type") != null && !jsonObj.get("header_type").isJsonNull()) && !jsonObj.get("header_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_type").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if ((jsonObj.get("operator_key") != null && !jsonObj.get("operator_key").isJsonNull()) && !jsonObj.get("operator_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator_key").toString()));
      }
      if (jsonObj.get("report_operator") != null && !jsonObj.get("report_operator").isJsonNull()) {
        JsonArray jsonArrayreportOperator = jsonObj.getAsJsonArray("report_operator");
        if (jsonArrayreportOperator != null) {
          // ensure the json data is an array
          if (!jsonObj.get("report_operator").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `report_operator` to be an array in the JSON string but got `%s`", jsonObj.get("report_operator").toString()));
          }

          // validate the optional field `report_operator` (array)
          for (int i = 0; i < jsonArrayreportOperator.size(); i++) {
            Dashboardsv3ReportOperator.validateJsonElement(jsonArrayreportOperator.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboardsv3ReportGlobalFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboardsv3ReportGlobalFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboardsv3ReportGlobalFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboardsv3ReportGlobalFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboardsv3ReportGlobalFilter>() {
           @Override
           public void write(JsonWriter out, Dashboardsv3ReportGlobalFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboardsv3ReportGlobalFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dashboardsv3ReportGlobalFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dashboardsv3ReportGlobalFilter
  * @throws IOException if the JSON string is invalid with respect to Dashboardsv3ReportGlobalFilter
  */
  public static Dashboardsv3ReportGlobalFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboardsv3ReportGlobalFilter.class);
  }

 /**
  * Convert an instance of Dashboardsv3ReportGlobalFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

