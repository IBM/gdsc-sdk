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
import com.ibm.gdsc.sdk.Datamartprocessorv3DatamartFileInfo;
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

import com.ibm.gdsc.JSON;

/**
 * DatamartInfo is the object containing all info of a datamart.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Datamartprocessorv3DatamartInfo {
  public static final String SERIALIZED_NAME_CURRENT_TS = "current_ts";
  @SerializedName(SERIALIZED_NAME_CURRENT_TS)
  private OffsetDateTime currentTs;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_EXPORT_RECORD_COUNT = "export_record_count";
  @SerializedName(SERIALIZED_NAME_EXPORT_RECORD_COUNT)
  private Integer exportRecordCount;

  public static final String SERIALIZED_NAME_EXPORT_STATUS = "export_status";
  @SerializedName(SERIALIZED_NAME_EXPORT_STATUS)
  private Integer exportStatus;

  public static final String SERIALIZED_NAME_FAILURE_FILE_COUNT = "failure_file_count";
  @SerializedName(SERIALIZED_NAME_FAILURE_FILE_COUNT)
  private Integer failureFileCount;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<Datamartprocessorv3DatamartFileInfo> files = new ArrayList<>();

  public static final String SERIALIZED_NAME_GDP_HOSTNAME = "gdp_hostname";
  @SerializedName(SERIALIZED_NAME_GDP_HOSTNAME)
  private String gdpHostname;

  public static final String SERIALIZED_NAME_INGEST_RECORD_COUNT = "ingest_record_count";
  @SerializedName(SERIALIZED_NAME_INGEST_RECORD_COUNT)
  private Integer ingestRecordCount;

  public static final String SERIALIZED_NAME_INGEST_STATUS = "ingest_status";
  @SerializedName(SERIALIZED_NAME_INGEST_STATUS)
  private Integer ingestStatus;

  public static final String SERIALIZED_NAME_INGESTION_ID = "ingestion_id";
  @SerializedName(SERIALIZED_NAME_INGESTION_ID)
  private String ingestionId;

  public static final String SERIALIZED_NAME_PERIOD_END = "period_end";
  @SerializedName(SERIALIZED_NAME_PERIOD_END)
  private OffsetDateTime periodEnd;

  public static final String SERIALIZED_NAME_PERIOD_START = "period_start";
  @SerializedName(SERIALIZED_NAME_PERIOD_START)
  private OffsetDateTime periodStart;

  public static final String SERIALIZED_NAME_SUCCESS_FILE_COUNT = "success_file_count";
  @SerializedName(SERIALIZED_NAME_SUCCESS_FILE_COUNT)
  private Integer successFileCount;

  public static final String SERIALIZED_NAME_TOTAL_FILE_COUNT = "total_file_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_FILE_COUNT)
  private Integer totalFileCount;

  public Datamartprocessorv3DatamartInfo() {
  }

  public Datamartprocessorv3DatamartInfo currentTs(OffsetDateTime currentTs) {
    this.currentTs = currentTs;
    return this;
  }

   /**
   * Timestamp in UTC when the entry was made.
   * @return currentTs
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCurrentTs() {
    return currentTs;
  }

  public void setCurrentTs(OffsetDateTime currentTs) {
    this.currentTs = currentTs;
  }


  public Datamartprocessorv3DatamartInfo dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Type of datamart.
   * @return dataType
  **/
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public Datamartprocessorv3DatamartInfo error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Errors if any.
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public Datamartprocessorv3DatamartInfo exportRecordCount(Integer exportRecordCount) {
    this.exportRecordCount = exportRecordCount;
    return this;
  }

   /**
   * Total records exported from gdp.
   * @return exportRecordCount
  **/
  @javax.annotation.Nullable
  public Integer getExportRecordCount() {
    return exportRecordCount;
  }

  public void setExportRecordCount(Integer exportRecordCount) {
    this.exportRecordCount = exportRecordCount;
  }


  public Datamartprocessorv3DatamartInfo exportStatus(Integer exportStatus) {
    this.exportStatus = exportStatus;
    return this;
  }

   /**
   * Export status of datamart.
   * @return exportStatus
  **/
  @javax.annotation.Nullable
  public Integer getExportStatus() {
    return exportStatus;
  }

  public void setExportStatus(Integer exportStatus) {
    this.exportStatus = exportStatus;
  }


  public Datamartprocessorv3DatamartInfo failureFileCount(Integer failureFileCount) {
    this.failureFileCount = failureFileCount;
    return this;
  }

   /**
   * Total failed files in a datamart.
   * @return failureFileCount
  **/
  @javax.annotation.Nullable
  public Integer getFailureFileCount() {
    return failureFileCount;
  }

  public void setFailureFileCount(Integer failureFileCount) {
    this.failureFileCount = failureFileCount;
  }


  public Datamartprocessorv3DatamartInfo files(List<Datamartprocessorv3DatamartFileInfo> files) {
    this.files = files;
    return this;
  }

  public Datamartprocessorv3DatamartInfo addFilesItem(Datamartprocessorv3DatamartFileInfo filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * File info inside a datamart.
   * @return files
  **/
  @javax.annotation.Nullable
  public List<Datamartprocessorv3DatamartFileInfo> getFiles() {
    return files;
  }

  public void setFiles(List<Datamartprocessorv3DatamartFileInfo> files) {
    this.files = files;
  }


  public Datamartprocessorv3DatamartInfo gdpHostname(String gdpHostname) {
    this.gdpHostname = gdpHostname;
    return this;
  }

   /**
   * GDP hostname.
   * @return gdpHostname
  **/
  @javax.annotation.Nullable
  public String getGdpHostname() {
    return gdpHostname;
  }

  public void setGdpHostname(String gdpHostname) {
    this.gdpHostname = gdpHostname;
  }


  public Datamartprocessorv3DatamartInfo ingestRecordCount(Integer ingestRecordCount) {
    this.ingestRecordCount = ingestRecordCount;
    return this;
  }

   /**
   * Total numbers of records ingested for this datamart.
   * @return ingestRecordCount
  **/
  @javax.annotation.Nullable
  public Integer getIngestRecordCount() {
    return ingestRecordCount;
  }

  public void setIngestRecordCount(Integer ingestRecordCount) {
    this.ingestRecordCount = ingestRecordCount;
  }


  public Datamartprocessorv3DatamartInfo ingestStatus(Integer ingestStatus) {
    this.ingestStatus = ingestStatus;
    return this;
  }

   /**
   * Ingest status of datamart.
   * @return ingestStatus
  **/
  @javax.annotation.Nullable
  public Integer getIngestStatus() {
    return ingestStatus;
  }

  public void setIngestStatus(Integer ingestStatus) {
    this.ingestStatus = ingestStatus;
  }


  public Datamartprocessorv3DatamartInfo ingestionId(String ingestionId) {
    this.ingestionId = ingestionId;
    return this;
  }

   /**
   * Ingestion id.
   * @return ingestionId
  **/
  @javax.annotation.Nullable
  public String getIngestionId() {
    return ingestionId;
  }

  public void setIngestionId(String ingestionId) {
    this.ingestionId = ingestionId;
  }


  public Datamartprocessorv3DatamartInfo periodEnd(OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * Wnding time period of data in datamart.
   * @return periodEnd
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
  }


  public Datamartprocessorv3DatamartInfo periodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Starting time period of data in datamart.
   * @return periodStart
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
  }


  public Datamartprocessorv3DatamartInfo successFileCount(Integer successFileCount) {
    this.successFileCount = successFileCount;
    return this;
  }

   /**
   * Total successful files in a datamart.
   * @return successFileCount
  **/
  @javax.annotation.Nullable
  public Integer getSuccessFileCount() {
    return successFileCount;
  }

  public void setSuccessFileCount(Integer successFileCount) {
    this.successFileCount = successFileCount;
  }


  public Datamartprocessorv3DatamartInfo totalFileCount(Integer totalFileCount) {
    this.totalFileCount = totalFileCount;
    return this;
  }

   /**
   * Total file count inside a datamart.
   * @return totalFileCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalFileCount() {
    return totalFileCount;
  }

  public void setTotalFileCount(Integer totalFileCount) {
    this.totalFileCount = totalFileCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datamartprocessorv3DatamartInfo datamartprocessorv3DatamartInfo = (Datamartprocessorv3DatamartInfo) o;
    return Objects.equals(this.currentTs, datamartprocessorv3DatamartInfo.currentTs) &&
        Objects.equals(this.dataType, datamartprocessorv3DatamartInfo.dataType) &&
        Objects.equals(this.error, datamartprocessorv3DatamartInfo.error) &&
        Objects.equals(this.exportRecordCount, datamartprocessorv3DatamartInfo.exportRecordCount) &&
        Objects.equals(this.exportStatus, datamartprocessorv3DatamartInfo.exportStatus) &&
        Objects.equals(this.failureFileCount, datamartprocessorv3DatamartInfo.failureFileCount) &&
        Objects.equals(this.files, datamartprocessorv3DatamartInfo.files) &&
        Objects.equals(this.gdpHostname, datamartprocessorv3DatamartInfo.gdpHostname) &&
        Objects.equals(this.ingestRecordCount, datamartprocessorv3DatamartInfo.ingestRecordCount) &&
        Objects.equals(this.ingestStatus, datamartprocessorv3DatamartInfo.ingestStatus) &&
        Objects.equals(this.ingestionId, datamartprocessorv3DatamartInfo.ingestionId) &&
        Objects.equals(this.periodEnd, datamartprocessorv3DatamartInfo.periodEnd) &&
        Objects.equals(this.periodStart, datamartprocessorv3DatamartInfo.periodStart) &&
        Objects.equals(this.successFileCount, datamartprocessorv3DatamartInfo.successFileCount) &&
        Objects.equals(this.totalFileCount, datamartprocessorv3DatamartInfo.totalFileCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTs, dataType, error, exportRecordCount, exportStatus, failureFileCount, files, gdpHostname, ingestRecordCount, ingestStatus, ingestionId, periodEnd, periodStart, successFileCount, totalFileCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datamartprocessorv3DatamartInfo {\n");
    sb.append("    currentTs: ").append(toIndentedString(currentTs)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    exportRecordCount: ").append(toIndentedString(exportRecordCount)).append("\n");
    sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
    sb.append("    failureFileCount: ").append(toIndentedString(failureFileCount)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    gdpHostname: ").append(toIndentedString(gdpHostname)).append("\n");
    sb.append("    ingestRecordCount: ").append(toIndentedString(ingestRecordCount)).append("\n");
    sb.append("    ingestStatus: ").append(toIndentedString(ingestStatus)).append("\n");
    sb.append("    ingestionId: ").append(toIndentedString(ingestionId)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    successFileCount: ").append(toIndentedString(successFileCount)).append("\n");
    sb.append("    totalFileCount: ").append(toIndentedString(totalFileCount)).append("\n");
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
    openapiFields.add("current_ts");
    openapiFields.add("data_type");
    openapiFields.add("error");
    openapiFields.add("export_record_count");
    openapiFields.add("export_status");
    openapiFields.add("failure_file_count");
    openapiFields.add("files");
    openapiFields.add("gdp_hostname");
    openapiFields.add("ingest_record_count");
    openapiFields.add("ingest_status");
    openapiFields.add("ingestion_id");
    openapiFields.add("period_end");
    openapiFields.add("period_start");
    openapiFields.add("success_file_count");
    openapiFields.add("total_file_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Datamartprocessorv3DatamartInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Datamartprocessorv3DatamartInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Datamartprocessorv3DatamartInfo is not found in the empty JSON string", Datamartprocessorv3DatamartInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Datamartprocessorv3DatamartInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Datamartprocessorv3DatamartInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonNull()) && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
        if (jsonArrayfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
          }

          // validate the optional field `files` (array)
          for (int i = 0; i < jsonArrayfiles.size(); i++) {
            Datamartprocessorv3DatamartFileInfo.validateJsonElement(jsonArrayfiles.get(i));
          };
        }
      }
      if ((jsonObj.get("gdp_hostname") != null && !jsonObj.get("gdp_hostname").isJsonNull()) && !jsonObj.get("gdp_hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gdp_hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gdp_hostname").toString()));
      }
      if ((jsonObj.get("ingestion_id") != null && !jsonObj.get("ingestion_id").isJsonNull()) && !jsonObj.get("ingestion_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingestion_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingestion_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Datamartprocessorv3DatamartInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Datamartprocessorv3DatamartInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Datamartprocessorv3DatamartInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Datamartprocessorv3DatamartInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<Datamartprocessorv3DatamartInfo>() {
           @Override
           public void write(JsonWriter out, Datamartprocessorv3DatamartInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Datamartprocessorv3DatamartInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Datamartprocessorv3DatamartInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Datamartprocessorv3DatamartInfo
  * @throws IOException if the JSON string is invalid with respect to Datamartprocessorv3DatamartInfo
  */
  public static Datamartprocessorv3DatamartInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Datamartprocessorv3DatamartInfo.class);
  }

 /**
  * Convert an instance of Datamartprocessorv3DatamartInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

