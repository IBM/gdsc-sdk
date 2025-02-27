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
import com.ibm.security.guardium.Reportsv3DisplayHeader;
import com.ibm.security.guardium.Reportsv3ReportTag;
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
 * BriefReport - a small-scale representation of a report.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3BriefReport {
  public static final String SERIALIZED_NAME_ACCESS_LEVEL = "access_level";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL)
  private Integer accessLevel;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CREATOR_USER_ID = "creator_user_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_USER_ID)
  private String creatorUserId;

  public static final String SERIALIZED_NAME_CREATOR_USER_NAME = "creator_user_name";
  @SerializedName(SERIALIZED_NAME_CREATOR_USER_NAME)
  private String creatorUserName;

  public static final String SERIALIZED_NAME_GROUP_IDS_USED_IN_FILTER = "group_ids_used_in_filter";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS_USED_IN_FILTER)
  private List<String> groupIdsUsedInFilter = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<Reportsv3DisplayHeader> headers = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_PINNED = "is_pinned";
  @SerializedName(SERIALIZED_NAME_IS_PINNED)
  private Boolean isPinned;

  public static final String SERIALIZED_NAME_LAST_RUN_TIME = "last_run_time";
  @SerializedName(SERIALIZED_NAME_LAST_RUN_TIME)
  private OffsetDateTime lastRunTime;

  public static final String SERIALIZED_NAME_REPORT_DESCRIPTION = "report_description";
  @SerializedName(SERIALIZED_NAME_REPORT_DESCRIPTION)
  private String reportDescription;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_REPORT_NAME = "report_name";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_REPORT_TAGS = "report_tags";
  @SerializedName(SERIALIZED_NAME_REPORT_TAGS)
  private List<Reportsv3ReportTag> reportTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public Reportsv3BriefReport() {
  }

  public Reportsv3BriefReport accessLevel(Integer accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * Calculated access-level.
   * @return accessLevel
  **/
  @javax.annotation.Nullable
  public Integer getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(Integer accessLevel) {
    this.accessLevel = accessLevel;
  }


  public Reportsv3BriefReport categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The report&#39;s category ID.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public Reportsv3BriefReport creatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

   /**
   * Author.
   * @return creatorUserId
  **/
  @javax.annotation.Nullable
  public String getCreatorUserId() {
    return creatorUserId;
  }

  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
  }


  public Reportsv3BriefReport creatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

   /**
   * Author name.
   * @return creatorUserName
  **/
  @javax.annotation.Nullable
  public String getCreatorUserName() {
    return creatorUserName;
  }

  public void setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
  }


  public Reportsv3BriefReport groupIdsUsedInFilter(List<String> groupIdsUsedInFilter) {
    this.groupIdsUsedInFilter = groupIdsUsedInFilter;
    return this;
  }

  public Reportsv3BriefReport addGroupIdsUsedInFilterItem(String groupIdsUsedInFilterItem) {
    if (this.groupIdsUsedInFilter == null) {
      this.groupIdsUsedInFilter = new ArrayList<>();
    }
    this.groupIdsUsedInFilter.add(groupIdsUsedInFilterItem);
    return this;
  }

   /**
   * Get groupIdsUsedInFilter
   * @return groupIdsUsedInFilter
  **/
  @javax.annotation.Nullable
  public List<String> getGroupIdsUsedInFilter() {
    return groupIdsUsedInFilter;
  }

  public void setGroupIdsUsedInFilter(List<String> groupIdsUsedInFilter) {
    this.groupIdsUsedInFilter = groupIdsUsedInFilter;
  }


  public Reportsv3BriefReport headers(List<Reportsv3DisplayHeader> headers) {
    this.headers = headers;
    return this;
  }

  public Reportsv3BriefReport addHeadersItem(Reportsv3DisplayHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * The report&#39;s brief headers.
   * @return headers
  **/
  @javax.annotation.Nullable
  public List<Reportsv3DisplayHeader> getHeaders() {
    return headers;
  }

  public void setHeaders(List<Reportsv3DisplayHeader> headers) {
    this.headers = headers;
  }


  public Reportsv3BriefReport isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

   /**
   * Flag to determine weather the report is pinned or not.
   * @return isPinned
  **/
  @javax.annotation.Nullable
  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }


  public Reportsv3BriefReport lastRunTime(OffsetDateTime lastRunTime) {
    this.lastRunTime = lastRunTime;
    return this;
  }

   /**
   * The report&#39;s last run time in format YYYY-MM-DDTHH:mm:ss.sssZ.
   * @return lastRunTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastRunTime() {
    return lastRunTime;
  }

  public void setLastRunTime(OffsetDateTime lastRunTime) {
    this.lastRunTime = lastRunTime;
  }


  public Reportsv3BriefReport reportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
    return this;
  }

   /**
   * The report description.
   * @return reportDescription
  **/
  @javax.annotation.Nullable
  public String getReportDescription() {
    return reportDescription;
  }

  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }


  public Reportsv3BriefReport reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The report ID.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Reportsv3BriefReport reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * The report name.
   * @return reportName
  **/
  @javax.annotation.Nullable
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public Reportsv3BriefReport reportTags(List<Reportsv3ReportTag> reportTags) {
    this.reportTags = reportTags;
    return this;
  }

  public Reportsv3BriefReport addReportTagsItem(Reportsv3ReportTag reportTagsItem) {
    if (this.reportTags == null) {
      this.reportTags = new ArrayList<>();
    }
    this.reportTags.add(reportTagsItem);
    return this;
  }

   /**
   * The report tags.
   * @return reportTags
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ReportTag> getReportTags() {
    return reportTags;
  }

  public void setReportTags(List<Reportsv3ReportTag> reportTags) {
    this.reportTags = reportTags;
  }


  public Reportsv3BriefReport tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3BriefReport reportsv3BriefReport = (Reportsv3BriefReport) o;
    return Objects.equals(this.accessLevel, reportsv3BriefReport.accessLevel) &&
        Objects.equals(this.categoryId, reportsv3BriefReport.categoryId) &&
        Objects.equals(this.creatorUserId, reportsv3BriefReport.creatorUserId) &&
        Objects.equals(this.creatorUserName, reportsv3BriefReport.creatorUserName) &&
        Objects.equals(this.groupIdsUsedInFilter, reportsv3BriefReport.groupIdsUsedInFilter) &&
        Objects.equals(this.headers, reportsv3BriefReport.headers) &&
        Objects.equals(this.isPinned, reportsv3BriefReport.isPinned) &&
        Objects.equals(this.lastRunTime, reportsv3BriefReport.lastRunTime) &&
        Objects.equals(this.reportDescription, reportsv3BriefReport.reportDescription) &&
        Objects.equals(this.reportId, reportsv3BriefReport.reportId) &&
        Objects.equals(this.reportName, reportsv3BriefReport.reportName) &&
        Objects.equals(this.reportTags, reportsv3BriefReport.reportTags) &&
        Objects.equals(this.tableName, reportsv3BriefReport.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, categoryId, creatorUserId, creatorUserName, groupIdsUsedInFilter, headers, isPinned, lastRunTime, reportDescription, reportId, reportName, reportTags, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3BriefReport {\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    creatorUserName: ").append(toIndentedString(creatorUserName)).append("\n");
    sb.append("    groupIdsUsedInFilter: ").append(toIndentedString(groupIdsUsedInFilter)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportTags: ").append(toIndentedString(reportTags)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
    openapiFields.add("access_level");
    openapiFields.add("category_id");
    openapiFields.add("creator_user_id");
    openapiFields.add("creator_user_name");
    openapiFields.add("group_ids_used_in_filter");
    openapiFields.add("headers");
    openapiFields.add("is_pinned");
    openapiFields.add("last_run_time");
    openapiFields.add("report_description");
    openapiFields.add("report_id");
    openapiFields.add("report_name");
    openapiFields.add("report_tags");
    openapiFields.add("table_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3BriefReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3BriefReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3BriefReport is not found in the empty JSON string", Reportsv3BriefReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3BriefReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3BriefReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if ((jsonObj.get("creator_user_id") != null && !jsonObj.get("creator_user_id").isJsonNull()) && !jsonObj.get("creator_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_user_id").toString()));
      }
      if ((jsonObj.get("creator_user_name") != null && !jsonObj.get("creator_user_name").isJsonNull()) && !jsonObj.get("creator_user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_user_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_ids_used_in_filter") != null && !jsonObj.get("group_ids_used_in_filter").isJsonNull() && !jsonObj.get("group_ids_used_in_filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_ids_used_in_filter` to be an array in the JSON string but got `%s`", jsonObj.get("group_ids_used_in_filter").toString()));
      }
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull()) {
        JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("headers");
        if (jsonArrayheaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("headers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
          }

          // validate the optional field `headers` (array)
          for (int i = 0; i < jsonArrayheaders.size(); i++) {
            Reportsv3DisplayHeader.validateJsonElement(jsonArrayheaders.get(i));
          };
        }
      }
      if ((jsonObj.get("report_description") != null && !jsonObj.get("report_description").isJsonNull()) && !jsonObj.get("report_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_description").toString()));
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      if ((jsonObj.get("report_name") != null && !jsonObj.get("report_name").isJsonNull()) && !jsonObj.get("report_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_name").toString()));
      }
      if (jsonObj.get("report_tags") != null && !jsonObj.get("report_tags").isJsonNull()) {
        JsonArray jsonArrayreportTags = jsonObj.getAsJsonArray("report_tags");
        if (jsonArrayreportTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("report_tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `report_tags` to be an array in the JSON string but got `%s`", jsonObj.get("report_tags").toString()));
          }

          // validate the optional field `report_tags` (array)
          for (int i = 0; i < jsonArrayreportTags.size(); i++) {
            Reportsv3ReportTag.validateJsonElement(jsonArrayreportTags.get(i));
          };
        }
      }
      if ((jsonObj.get("table_name") != null && !jsonObj.get("table_name").isJsonNull()) && !jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3BriefReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3BriefReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3BriefReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3BriefReport.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3BriefReport>() {
           @Override
           public void write(JsonWriter out, Reportsv3BriefReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3BriefReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3BriefReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3BriefReport
  * @throws IOException if the JSON string is invalid with respect to Reportsv3BriefReport
  */
  public static Reportsv3BriefReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3BriefReport.class);
  }

 /**
  * Convert an instance of Reportsv3BriefReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

