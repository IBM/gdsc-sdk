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
import com.ibm.security.guardium.Schedulerv3ReportArray;
import com.ibm.security.guardium.Schedulerv3ScheduledJobSummary;
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
 * ScheduledJobSummaryResponse message for Get v3/schedules or v3/schedules/search api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3ScheduledJobSummaryResponse {
  public static final String SERIALIZED_NAME_RECORD_COUNT = "record_count";
  @SerializedName(SERIALIZED_NAME_RECORD_COUNT)
  private Long recordCount;

  public static final String SERIALIZED_NAME_REPORT_NAMES = "report_names";
  @SerializedName(SERIALIZED_NAME_REPORT_NAMES)
  private List<Schedulerv3ReportArray> reportNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEDULED_JOB = "scheduled_job";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_JOB)
  private List<Schedulerv3ScheduledJobSummary> scheduledJob = new ArrayList<>();

  public Schedulerv3ScheduledJobSummaryResponse() {
  }

  public Schedulerv3ScheduledJobSummaryResponse recordCount(Long recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Total number of the scheduled jobs.
   * @return recordCount
  **/
  @javax.annotation.Nullable
  public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }


  public Schedulerv3ScheduledJobSummaryResponse reportNames(List<Schedulerv3ReportArray> reportNames) {
    this.reportNames = reportNames;
    return this;
  }

  public Schedulerv3ScheduledJobSummaryResponse addReportNamesItem(Schedulerv3ReportArray reportNamesItem) {
    if (this.reportNames == null) {
      this.reportNames = new ArrayList<>();
    }
    this.reportNames.add(reportNamesItem);
    return this;
  }

   /**
   * Array of report name for each scheduledJobSummary.
   * @return reportNames
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3ReportArray> getReportNames() {
    return reportNames;
  }

  public void setReportNames(List<Schedulerv3ReportArray> reportNames) {
    this.reportNames = reportNames;
  }


  public Schedulerv3ScheduledJobSummaryResponse scheduledJob(List<Schedulerv3ScheduledJobSummary> scheduledJob) {
    this.scheduledJob = scheduledJob;
    return this;
  }

  public Schedulerv3ScheduledJobSummaryResponse addScheduledJobItem(Schedulerv3ScheduledJobSummary scheduledJobItem) {
    if (this.scheduledJob == null) {
      this.scheduledJob = new ArrayList<>();
    }
    this.scheduledJob.add(scheduledJobItem);
    return this;
  }

   /**
   * The requested scheduled job data.
   * @return scheduledJob
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3ScheduledJobSummary> getScheduledJob() {
    return scheduledJob;
  }

  public void setScheduledJob(List<Schedulerv3ScheduledJobSummary> scheduledJob) {
    this.scheduledJob = scheduledJob;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3ScheduledJobSummaryResponse schedulerv3ScheduledJobSummaryResponse = (Schedulerv3ScheduledJobSummaryResponse) o;
    return Objects.equals(this.recordCount, schedulerv3ScheduledJobSummaryResponse.recordCount) &&
        Objects.equals(this.reportNames, schedulerv3ScheduledJobSummaryResponse.reportNames) &&
        Objects.equals(this.scheduledJob, schedulerv3ScheduledJobSummaryResponse.scheduledJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordCount, reportNames, scheduledJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3ScheduledJobSummaryResponse {\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    reportNames: ").append(toIndentedString(reportNames)).append("\n");
    sb.append("    scheduledJob: ").append(toIndentedString(scheduledJob)).append("\n");
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
    openapiFields.add("record_count");
    openapiFields.add("report_names");
    openapiFields.add("scheduled_job");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3ScheduledJobSummaryResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3ScheduledJobSummaryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3ScheduledJobSummaryResponse is not found in the empty JSON string", Schedulerv3ScheduledJobSummaryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3ScheduledJobSummaryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3ScheduledJobSummaryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("report_names") != null && !jsonObj.get("report_names").isJsonNull()) {
        JsonArray jsonArrayreportNames = jsonObj.getAsJsonArray("report_names");
        if (jsonArrayreportNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("report_names").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `report_names` to be an array in the JSON string but got `%s`", jsonObj.get("report_names").toString()));
          }

          // validate the optional field `report_names` (array)
          for (int i = 0; i < jsonArrayreportNames.size(); i++) {
            Schedulerv3ReportArray.validateJsonElement(jsonArrayreportNames.get(i));
          };
        }
      }
      if (jsonObj.get("scheduled_job") != null && !jsonObj.get("scheduled_job").isJsonNull()) {
        JsonArray jsonArrayscheduledJob = jsonObj.getAsJsonArray("scheduled_job");
        if (jsonArrayscheduledJob != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scheduled_job").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scheduled_job` to be an array in the JSON string but got `%s`", jsonObj.get("scheduled_job").toString()));
          }

          // validate the optional field `scheduled_job` (array)
          for (int i = 0; i < jsonArrayscheduledJob.size(); i++) {
            Schedulerv3ScheduledJobSummary.validateJsonElement(jsonArrayscheduledJob.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3ScheduledJobSummaryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3ScheduledJobSummaryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3ScheduledJobSummaryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3ScheduledJobSummaryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3ScheduledJobSummaryResponse>() {
           @Override
           public void write(JsonWriter out, Schedulerv3ScheduledJobSummaryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3ScheduledJobSummaryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3ScheduledJobSummaryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3ScheduledJobSummaryResponse
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3ScheduledJobSummaryResponse
  */
  public static Schedulerv3ScheduledJobSummaryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3ScheduledJobSummaryResponse.class);
  }

 /**
  * Convert an instance of Schedulerv3ScheduledJobSummaryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

