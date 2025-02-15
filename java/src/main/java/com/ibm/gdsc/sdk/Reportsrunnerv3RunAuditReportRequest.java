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
import com.ibm.gdsc.sdk.Reportsv3OrderBy;
import com.ibm.gdsc.sdk.Reportsv3ReportFilterBrackets;
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
 * RunAuditReportRequest is the argument of RunAuditReport API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsrunnerv3RunAuditReportRequest {
  public static final String SERIALIZED_NAME_FETCH_SIZE = "fetch_size";
  @SerializedName(SERIALIZED_NAME_FETCH_SIZE)
  private Integer fetchSize;

  public static final String SERIALIZED_NAME_HEADER_NAME = "header_name";
  @SerializedName(SERIALIZED_NAME_HEADER_NAME)
  private String headerName;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private Reportsv3OrderBy orderBy = Reportsv3OrderBy.UNDEFINED_ORDER_BY;

  public static final String SERIALIZED_NAME_REPORT_FILTERS = "report_filters";
  @SerializedName(SERIALIZED_NAME_REPORT_FILTERS)
  private Reportsv3ReportFilterBrackets reportFilters;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";
  @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
  private String schemaName;

  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public static final String SERIALIZED_NAME_WITHOUT_LIMIT = "without_limit";
  @SerializedName(SERIALIZED_NAME_WITHOUT_LIMIT)
  private Boolean withoutLimit;

  public Reportsrunnerv3RunAuditReportRequest() {
  }

  public Reportsrunnerv3RunAuditReportRequest fetchSize(Integer fetchSize) {
    this.fetchSize = fetchSize;
    return this;
  }

   /**
   * The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters.
   * @return fetchSize
  **/
  @javax.annotation.Nullable
  public Integer getFetchSize() {
    return fetchSize;
  }

  public void setFetchSize(Integer fetchSize) {
    this.fetchSize = fetchSize;
  }


  public Reportsrunnerv3RunAuditReportRequest headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * The header name.
   * @return headerName
  **/
  @javax.annotation.Nullable
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }


  public Reportsrunnerv3RunAuditReportRequest jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Unique token identifying the export job.
   * @return jobId
  **/
  @javax.annotation.Nullable
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public Reportsrunnerv3RunAuditReportRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters.
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public Reportsrunnerv3RunAuditReportRequest orderBy(Reportsv3OrderBy orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  public Reportsv3OrderBy getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(Reportsv3OrderBy orderBy) {
    this.orderBy = orderBy;
  }


  public Reportsrunnerv3RunAuditReportRequest reportFilters(Reportsv3ReportFilterBrackets reportFilters) {
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


  public Reportsrunnerv3RunAuditReportRequest reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The ID of the Report we wish to run (e.g. 000000000000000000000905).
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Reportsrunnerv3RunAuditReportRequest schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
   * The schema name to organize report task temp tables.
   * @return schemaName
  **/
  @javax.annotation.Nullable
  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public Reportsrunnerv3RunAuditReportRequest tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * The table name to save report task data(task_id).
   * @return tableName
  **/
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public Reportsrunnerv3RunAuditReportRequest withoutLimit(Boolean withoutLimit) {
    this.withoutLimit = withoutLimit;
    return this;
  }

   /**
   * Whether or not to limit the results.
   * @return withoutLimit
  **/
  @javax.annotation.Nullable
  public Boolean getWithoutLimit() {
    return withoutLimit;
  }

  public void setWithoutLimit(Boolean withoutLimit) {
    this.withoutLimit = withoutLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsrunnerv3RunAuditReportRequest reportsrunnerv3RunAuditReportRequest = (Reportsrunnerv3RunAuditReportRequest) o;
    return Objects.equals(this.fetchSize, reportsrunnerv3RunAuditReportRequest.fetchSize) &&
        Objects.equals(this.headerName, reportsrunnerv3RunAuditReportRequest.headerName) &&
        Objects.equals(this.jobId, reportsrunnerv3RunAuditReportRequest.jobId) &&
        Objects.equals(this.offset, reportsrunnerv3RunAuditReportRequest.offset) &&
        Objects.equals(this.orderBy, reportsrunnerv3RunAuditReportRequest.orderBy) &&
        Objects.equals(this.reportFilters, reportsrunnerv3RunAuditReportRequest.reportFilters) &&
        Objects.equals(this.reportId, reportsrunnerv3RunAuditReportRequest.reportId) &&
        Objects.equals(this.schemaName, reportsrunnerv3RunAuditReportRequest.schemaName) &&
        Objects.equals(this.tableName, reportsrunnerv3RunAuditReportRequest.tableName) &&
        Objects.equals(this.withoutLimit, reportsrunnerv3RunAuditReportRequest.withoutLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fetchSize, headerName, jobId, offset, orderBy, reportFilters, reportId, schemaName, tableName, withoutLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsrunnerv3RunAuditReportRequest {\n");
    sb.append("    fetchSize: ").append(toIndentedString(fetchSize)).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    withoutLimit: ").append(toIndentedString(withoutLimit)).append("\n");
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
    openapiFields.add("fetch_size");
    openapiFields.add("header_name");
    openapiFields.add("job_id");
    openapiFields.add("offset");
    openapiFields.add("order_by");
    openapiFields.add("report_filters");
    openapiFields.add("report_id");
    openapiFields.add("schema_name");
    openapiFields.add("table_name");
    openapiFields.add("without_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsrunnerv3RunAuditReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsrunnerv3RunAuditReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsrunnerv3RunAuditReportRequest is not found in the empty JSON string", Reportsrunnerv3RunAuditReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsrunnerv3RunAuditReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsrunnerv3RunAuditReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("header_name") != null && !jsonObj.get("header_name").isJsonNull()) && !jsonObj.get("header_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_name").toString()));
      }
      if ((jsonObj.get("job_id") != null && !jsonObj.get("job_id").isJsonNull()) && !jsonObj.get("job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_id").toString()));
      }
      // validate the optional field `order_by`
      if (jsonObj.get("order_by") != null && !jsonObj.get("order_by").isJsonNull()) {
        Reportsv3OrderBy.validateJsonElement(jsonObj.get("order_by"));
      }
      // validate the optional field `report_filters`
      if (jsonObj.get("report_filters") != null && !jsonObj.get("report_filters").isJsonNull()) {
        Reportsv3ReportFilterBrackets.validateJsonElement(jsonObj.get("report_filters"));
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      if ((jsonObj.get("schema_name") != null && !jsonObj.get("schema_name").isJsonNull()) && !jsonObj.get("schema_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_name").toString()));
      }
      if ((jsonObj.get("table_name") != null && !jsonObj.get("table_name").isJsonNull()) && !jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsrunnerv3RunAuditReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsrunnerv3RunAuditReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsrunnerv3RunAuditReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsrunnerv3RunAuditReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsrunnerv3RunAuditReportRequest>() {
           @Override
           public void write(JsonWriter out, Reportsrunnerv3RunAuditReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsrunnerv3RunAuditReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsrunnerv3RunAuditReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsrunnerv3RunAuditReportRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsrunnerv3RunAuditReportRequest
  */
  public static Reportsrunnerv3RunAuditReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsrunnerv3RunAuditReportRequest.class);
  }

 /**
  * Convert an instance of Reportsrunnerv3RunAuditReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

