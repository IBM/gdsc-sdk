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
import com.ibm.gdsc.sdk.models.Reportsv3BriefReport;
import com.ibm.gdsc.sdk.models.Reportsv3ReportTag;
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
 * GetReportsResponse is the return type which encapsulates a list of reports from the GetReports() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Reportsv3GetReportsResponse {
  public static final String SERIALIZED_NAME_IN_REPORT_CHILDREN_LIST = "in_report_children_list";
  @SerializedName(SERIALIZED_NAME_IN_REPORT_CHILDREN_LIST)
  private List<String> inReportChildrenList = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORTS_LIST = "reports_list";
  @SerializedName(SERIALIZED_NAME_REPORTS_LIST)
  private List<Reportsv3BriefReport> reportsList = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORTS_TAGS = "reports_tags";
  @SerializedName(SERIALIZED_NAME_REPORTS_TAGS)
  private List<Reportsv3ReportTag> reportsTags = new ArrayList<>();

  public Reportsv3GetReportsResponse() {
  }

  public Reportsv3GetReportsResponse inReportChildrenList(List<String> inReportChildrenList) {
    this.inReportChildrenList = inReportChildrenList;
    return this;
  }

  public Reportsv3GetReportsResponse addInReportChildrenListItem(String inReportChildrenListItem) {
    if (this.inReportChildrenList == null) {
      this.inReportChildrenList = new ArrayList<>();
    }
    this.inReportChildrenList.add(inReportChildrenListItem);
    return this;
  }

   /**
   * List of report ids of children that are children of in reports.
   * @return inReportChildrenList
  **/
  @javax.annotation.Nullable
  public List<String> getInReportChildrenList() {
    return inReportChildrenList;
  }

  public void setInReportChildrenList(List<String> inReportChildrenList) {
    this.inReportChildrenList = inReportChildrenList;
  }


  public Reportsv3GetReportsResponse reportsList(List<Reportsv3BriefReport> reportsList) {
    this.reportsList = reportsList;
    return this;
  }

  public Reportsv3GetReportsResponse addReportsListItem(Reportsv3BriefReport reportsListItem) {
    if (this.reportsList == null) {
      this.reportsList = new ArrayList<>();
    }
    this.reportsList.add(reportsListItem);
    return this;
  }

   /**
   * A new reports list.
   * @return reportsList
  **/
  @javax.annotation.Nullable
  public List<Reportsv3BriefReport> getReportsList() {
    return reportsList;
  }

  public void setReportsList(List<Reportsv3BriefReport> reportsList) {
    this.reportsList = reportsList;
  }


  public Reportsv3GetReportsResponse reportsTags(List<Reportsv3ReportTag> reportsTags) {
    this.reportsTags = reportsTags;
    return this;
  }

  public Reportsv3GetReportsResponse addReportsTagsItem(Reportsv3ReportTag reportsTagsItem) {
    if (this.reportsTags == null) {
      this.reportsTags = new ArrayList<>();
    }
    this.reportsTags.add(reportsTagsItem);
    return this;
  }

   /**
   * The Reports&#39; tags.
   * @return reportsTags
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ReportTag> getReportsTags() {
    return reportsTags;
  }

  public void setReportsTags(List<Reportsv3ReportTag> reportsTags) {
    this.reportsTags = reportsTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3GetReportsResponse reportsv3GetReportsResponse = (Reportsv3GetReportsResponse) o;
    return Objects.equals(this.inReportChildrenList, reportsv3GetReportsResponse.inReportChildrenList) &&
        Objects.equals(this.reportsList, reportsv3GetReportsResponse.reportsList) &&
        Objects.equals(this.reportsTags, reportsv3GetReportsResponse.reportsTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inReportChildrenList, reportsList, reportsTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetReportsResponse {\n");
    sb.append("    inReportChildrenList: ").append(toIndentedString(inReportChildrenList)).append("\n");
    sb.append("    reportsList: ").append(toIndentedString(reportsList)).append("\n");
    sb.append("    reportsTags: ").append(toIndentedString(reportsTags)).append("\n");
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
    openapiFields.add("in_report_children_list");
    openapiFields.add("reports_list");
    openapiFields.add("reports_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetReportsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetReportsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetReportsResponse is not found in the empty JSON string", Reportsv3GetReportsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetReportsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetReportsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("in_report_children_list") != null && !jsonObj.get("in_report_children_list").isJsonNull() && !jsonObj.get("in_report_children_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_report_children_list` to be an array in the JSON string but got `%s`", jsonObj.get("in_report_children_list").toString()));
      }
      if (jsonObj.get("reports_list") != null && !jsonObj.get("reports_list").isJsonNull()) {
        JsonArray jsonArrayreportsList = jsonObj.getAsJsonArray("reports_list");
        if (jsonArrayreportsList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reports_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reports_list` to be an array in the JSON string but got `%s`", jsonObj.get("reports_list").toString()));
          }

          // validate the optional field `reports_list` (array)
          for (int i = 0; i < jsonArrayreportsList.size(); i++) {
            Reportsv3BriefReport.validateJsonElement(jsonArrayreportsList.get(i));
          };
        }
      }
      if (jsonObj.get("reports_tags") != null && !jsonObj.get("reports_tags").isJsonNull()) {
        JsonArray jsonArrayreportsTags = jsonObj.getAsJsonArray("reports_tags");
        if (jsonArrayreportsTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reports_tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reports_tags` to be an array in the JSON string but got `%s`", jsonObj.get("reports_tags").toString()));
          }

          // validate the optional field `reports_tags` (array)
          for (int i = 0; i < jsonArrayreportsTags.size(); i++) {
            Reportsv3ReportTag.validateJsonElement(jsonArrayreportsTags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetReportsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetReportsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetReportsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetReportsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetReportsResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetReportsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetReportsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetReportsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetReportsResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetReportsResponse
  */
  public static Reportsv3GetReportsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetReportsResponse.class);
  }

 /**
  * Convert an instance of Reportsv3GetReportsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

