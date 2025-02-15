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
import com.ibm.gdsc.sdk.ProtobufFieldMask;
import com.ibm.gdsc.sdk.Reportsv3ReportTag;
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
 * UpdatePartialReportRequest is the argument type used to update a report with partial information using the UpdatePartialReport() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3PartialReportUpdateRequest {
  public static final String SERIALIZED_NAME_DEFAULT_CHART_EXPANDED = "default_chart_expanded";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CHART_EXPANDED)
  private Boolean defaultChartExpanded;

  public static final String SERIALIZED_NAME_IS_HIDDEN = "is_hidden";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN)
  private Boolean isHidden;

  public static final String SERIALIZED_NAME_IS_PINNED = "is_pinned";
  @SerializedName(SERIALIZED_NAME_IS_PINNED)
  private Boolean isPinned;

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

  public static final String SERIALIZED_NAME_UPDATE_MASK = "update_mask";
  @SerializedName(SERIALIZED_NAME_UPDATE_MASK)
  private ProtobufFieldMask updateMask;

  public Reportsv3PartialReportUpdateRequest() {
  }

  public Reportsv3PartialReportUpdateRequest defaultChartExpanded(Boolean defaultChartExpanded) {
    this.defaultChartExpanded = defaultChartExpanded;
    return this;
  }

   /**
   * The default_chart_expanded is a flag taken from the user settings collection per report and user.
   * @return defaultChartExpanded
  **/
  @javax.annotation.Nullable
  public Boolean getDefaultChartExpanded() {
    return defaultChartExpanded;
  }

  public void setDefaultChartExpanded(Boolean defaultChartExpanded) {
    this.defaultChartExpanded = defaultChartExpanded;
  }


  public Reportsv3PartialReportUpdateRequest isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Flag to determine weather the report is hidden or not.
   * @return isHidden
  **/
  @javax.annotation.Nullable
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public Reportsv3PartialReportUpdateRequest isPinned(Boolean isPinned) {
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


  public Reportsv3PartialReportUpdateRequest reportDescription(String reportDescription) {
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


  public Reportsv3PartialReportUpdateRequest reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Unique Report ID.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Reportsv3PartialReportUpdateRequest reportName(String reportName) {
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


  public Reportsv3PartialReportUpdateRequest reportTags(List<Reportsv3ReportTag> reportTags) {
    this.reportTags = reportTags;
    return this;
  }

  public Reportsv3PartialReportUpdateRequest addReportTagsItem(Reportsv3ReportTag reportTagsItem) {
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


  public Reportsv3PartialReportUpdateRequest updateMask(ProtobufFieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

   /**
   * Get updateMask
   * @return updateMask
  **/
  @javax.annotation.Nullable
  public ProtobufFieldMask getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(ProtobufFieldMask updateMask) {
    this.updateMask = updateMask;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3PartialReportUpdateRequest reportsv3PartialReportUpdateRequest = (Reportsv3PartialReportUpdateRequest) o;
    return Objects.equals(this.defaultChartExpanded, reportsv3PartialReportUpdateRequest.defaultChartExpanded) &&
        Objects.equals(this.isHidden, reportsv3PartialReportUpdateRequest.isHidden) &&
        Objects.equals(this.isPinned, reportsv3PartialReportUpdateRequest.isPinned) &&
        Objects.equals(this.reportDescription, reportsv3PartialReportUpdateRequest.reportDescription) &&
        Objects.equals(this.reportId, reportsv3PartialReportUpdateRequest.reportId) &&
        Objects.equals(this.reportName, reportsv3PartialReportUpdateRequest.reportName) &&
        Objects.equals(this.reportTags, reportsv3PartialReportUpdateRequest.reportTags) &&
        Objects.equals(this.updateMask, reportsv3PartialReportUpdateRequest.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultChartExpanded, isHidden, isPinned, reportDescription, reportId, reportName, reportTags, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3PartialReportUpdateRequest {\n");
    sb.append("    defaultChartExpanded: ").append(toIndentedString(defaultChartExpanded)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportTags: ").append(toIndentedString(reportTags)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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
    openapiFields.add("default_chart_expanded");
    openapiFields.add("is_hidden");
    openapiFields.add("is_pinned");
    openapiFields.add("report_description");
    openapiFields.add("report_id");
    openapiFields.add("report_name");
    openapiFields.add("report_tags");
    openapiFields.add("update_mask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3PartialReportUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3PartialReportUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3PartialReportUpdateRequest is not found in the empty JSON string", Reportsv3PartialReportUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3PartialReportUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3PartialReportUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      // validate the optional field `update_mask`
      if (jsonObj.get("update_mask") != null && !jsonObj.get("update_mask").isJsonNull()) {
        ProtobufFieldMask.validateJsonElement(jsonObj.get("update_mask"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3PartialReportUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3PartialReportUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3PartialReportUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3PartialReportUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3PartialReportUpdateRequest>() {
           @Override
           public void write(JsonWriter out, Reportsv3PartialReportUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3PartialReportUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3PartialReportUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3PartialReportUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsv3PartialReportUpdateRequest
  */
  public static Reportsv3PartialReportUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3PartialReportUpdateRequest.class);
  }

 /**
  * Convert an instance of Reportsv3PartialReportUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

