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
import com.ibm.gdsc.sdk.Complianceacceleratorv3Group;
import com.ibm.gdsc.sdk.Complianceacceleratorv3ReportStatus;
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
 * Report object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3Report {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUPS_NEEDED = "groups_needed";
  @SerializedName(SERIALIZED_NAME_GROUPS_NEEDED)
  private List<Complianceacceleratorv3Group> groupsNeeded = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUPS_PRESENT = "groups_present";
  @SerializedName(SERIALIZED_NAME_GROUPS_PRESENT)
  private List<Complianceacceleratorv3Group> groupsPresent = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_REPORT_TAGS = "report_tags";
  @SerializedName(SERIALIZED_NAME_REPORT_TAGS)
  private List<Reportsv3ReportTag> reportTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Complianceacceleratorv3ReportStatus status = Complianceacceleratorv3ReportStatus.POPULATED;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Complianceacceleratorv3Report() {
  }

  public Complianceacceleratorv3Report description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Report description.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Complianceacceleratorv3Report groupsNeeded(List<Complianceacceleratorv3Group> groupsNeeded) {
    this.groupsNeeded = groupsNeeded;
    return this;
  }

  public Complianceacceleratorv3Report addGroupsNeededItem(Complianceacceleratorv3Group groupsNeededItem) {
    if (this.groupsNeeded == null) {
      this.groupsNeeded = new ArrayList<>();
    }
    this.groupsNeeded.add(groupsNeededItem);
    return this;
  }

   /**
   * Get groupsNeeded
   * @return groupsNeeded
  **/
  @javax.annotation.Nullable
  public List<Complianceacceleratorv3Group> getGroupsNeeded() {
    return groupsNeeded;
  }

  public void setGroupsNeeded(List<Complianceacceleratorv3Group> groupsNeeded) {
    this.groupsNeeded = groupsNeeded;
  }


  public Complianceacceleratorv3Report groupsPresent(List<Complianceacceleratorv3Group> groupsPresent) {
    this.groupsPresent = groupsPresent;
    return this;
  }

  public Complianceacceleratorv3Report addGroupsPresentItem(Complianceacceleratorv3Group groupsPresentItem) {
    if (this.groupsPresent == null) {
      this.groupsPresent = new ArrayList<>();
    }
    this.groupsPresent.add(groupsPresentItem);
    return this;
  }

   /**
   * Groups present in the reports.
   * @return groupsPresent
  **/
  @javax.annotation.Nullable
  public List<Complianceacceleratorv3Group> getGroupsPresent() {
    return groupsPresent;
  }

  public void setGroupsPresent(List<Complianceacceleratorv3Group> groupsPresent) {
    this.groupsPresent = groupsPresent;
  }


  public Complianceacceleratorv3Report reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Id of the reports.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Complianceacceleratorv3Report reportTags(List<Reportsv3ReportTag> reportTags) {
    this.reportTags = reportTags;
    return this;
  }

  public Complianceacceleratorv3Report addReportTagsItem(Reportsv3ReportTag reportTagsItem) {
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


  public Complianceacceleratorv3Report status(Complianceacceleratorv3ReportStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Complianceacceleratorv3ReportStatus getStatus() {
    return status;
  }

  public void setStatus(Complianceacceleratorv3ReportStatus status) {
    this.status = status;
  }


  public Complianceacceleratorv3Report title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the report.
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
    Complianceacceleratorv3Report complianceacceleratorv3Report = (Complianceacceleratorv3Report) o;
    return Objects.equals(this.description, complianceacceleratorv3Report.description) &&
        Objects.equals(this.groupsNeeded, complianceacceleratorv3Report.groupsNeeded) &&
        Objects.equals(this.groupsPresent, complianceacceleratorv3Report.groupsPresent) &&
        Objects.equals(this.reportId, complianceacceleratorv3Report.reportId) &&
        Objects.equals(this.reportTags, complianceacceleratorv3Report.reportTags) &&
        Objects.equals(this.status, complianceacceleratorv3Report.status) &&
        Objects.equals(this.title, complianceacceleratorv3Report.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groupsNeeded, groupsPresent, reportId, reportTags, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3Report {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupsNeeded: ").append(toIndentedString(groupsNeeded)).append("\n");
    sb.append("    groupsPresent: ").append(toIndentedString(groupsPresent)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportTags: ").append(toIndentedString(reportTags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("groups_needed");
    openapiFields.add("groups_present");
    openapiFields.add("report_id");
    openapiFields.add("report_tags");
    openapiFields.add("status");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3Report
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3Report.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3Report is not found in the empty JSON string", Complianceacceleratorv3Report.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3Report.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3Report` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("groups_needed") != null && !jsonObj.get("groups_needed").isJsonNull()) {
        JsonArray jsonArraygroupsNeeded = jsonObj.getAsJsonArray("groups_needed");
        if (jsonArraygroupsNeeded != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups_needed").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups_needed` to be an array in the JSON string but got `%s`", jsonObj.get("groups_needed").toString()));
          }

          // validate the optional field `groups_needed` (array)
          for (int i = 0; i < jsonArraygroupsNeeded.size(); i++) {
            Complianceacceleratorv3Group.validateJsonElement(jsonArraygroupsNeeded.get(i));
          };
        }
      }
      if (jsonObj.get("groups_present") != null && !jsonObj.get("groups_present").isJsonNull()) {
        JsonArray jsonArraygroupsPresent = jsonObj.getAsJsonArray("groups_present");
        if (jsonArraygroupsPresent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups_present").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups_present` to be an array in the JSON string but got `%s`", jsonObj.get("groups_present").toString()));
          }

          // validate the optional field `groups_present` (array)
          for (int i = 0; i < jsonArraygroupsPresent.size(); i++) {
            Complianceacceleratorv3Group.validateJsonElement(jsonArraygroupsPresent.get(i));
          };
        }
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
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
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Complianceacceleratorv3ReportStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3Report.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3Report' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3Report> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3Report.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3Report>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3Report value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3Report read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3Report given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3Report
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3Report
  */
  public static Complianceacceleratorv3Report fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3Report.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3Report to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

