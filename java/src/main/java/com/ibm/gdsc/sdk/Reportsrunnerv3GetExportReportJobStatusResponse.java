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
import com.ibm.gdsc.sdk.Reportsrunnerv3ExportJobStatus;
import com.ibm.gdsc.sdk.RpcStatus;
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
 * GetExportReportJobStatusResponse is the return type of GetExportReportStatus API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsrunnerv3GetExportReportJobStatusResponse {
  public static final String SERIALIZED_NAME_CALL_STATUS = "call_status";
  @SerializedName(SERIALIZED_NAME_CALL_STATUS)
  private RpcStatus callStatus;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_JOB_DURATION = "job_duration";
  @SerializedName(SERIALIZED_NAME_JOB_DURATION)
  private Integer jobDuration;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_JOB_START_TIME = "job_start_time";
  @SerializedName(SERIALIZED_NAME_JOB_START_TIME)
  private String jobStartTime;

  public static final String SERIALIZED_NAME_JOB_STATUS = "job_status";
  @SerializedName(SERIALIZED_NAME_JOB_STATUS)
  private Reportsrunnerv3ExportJobStatus jobStatus = Reportsrunnerv3ExportJobStatus.UNDEFINED_JOB_STATUS;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RESULT_SIZE = "result_size";
  @SerializedName(SERIALIZED_NAME_RESULT_SIZE)
  private Integer resultSize;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public Reportsrunnerv3GetExportReportJobStatusResponse() {
  }

  public Reportsrunnerv3GetExportReportJobStatusResponse callStatus(RpcStatus callStatus) {
    this.callStatus = callStatus;
    return this;
  }

   /**
   * Get callStatus
   * @return callStatus
  **/
  @javax.annotation.Nullable
  public RpcStatus getCallStatus() {
    return callStatus;
  }

  public void setCallStatus(RpcStatus callStatus) {
    this.callStatus = callStatus;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name.
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse jobDuration(Integer jobDuration) {
    this.jobDuration = jobDuration;
    return this;
  }

   /**
   * Duration of the export job in minutes.
   * @return jobDuration
  **/
  @javax.annotation.Nullable
  public Integer getJobDuration() {
    return jobDuration;
  }

  public void setJobDuration(Integer jobDuration) {
    this.jobDuration = jobDuration;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Token that identifies the export job.
   * @return jobId
  **/
  @javax.annotation.Nullable
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse jobStartTime(String jobStartTime) {
    this.jobStartTime = jobStartTime;
    return this;
  }

   /**
   * The start time of the export job.
   * @return jobStartTime
  **/
  @javax.annotation.Nullable
  public String getJobStartTime() {
    return jobStartTime;
  }

  public void setJobStartTime(String jobStartTime) {
    this.jobStartTime = jobStartTime;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse jobStatus(Reportsrunnerv3ExportJobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * Get jobStatus
   * @return jobStatus
  **/
  @javax.annotation.Nullable
  public Reportsrunnerv3ExportJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(Reportsrunnerv3ExportJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * An error message in case of failure while retriving the export job status.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse resultSize(Integer resultSize) {
    this.resultSize = resultSize;
    return this;
  }

   /**
   * The size of the exported file in MB.
   * @return resultSize
  **/
  @javax.annotation.Nullable
  public Integer getResultSize() {
    return resultSize;
  }

  public void setResultSize(Integer resultSize) {
    this.resultSize = resultSize;
  }


  public Reportsrunnerv3GetExportReportJobStatusResponse tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The unique tenant ID that the executing job is running against.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsrunnerv3GetExportReportJobStatusResponse reportsrunnerv3GetExportReportJobStatusResponse = (Reportsrunnerv3GetExportReportJobStatusResponse) o;
    return Objects.equals(this.callStatus, reportsrunnerv3GetExportReportJobStatusResponse.callStatus) &&
        Objects.equals(this.fileName, reportsrunnerv3GetExportReportJobStatusResponse.fileName) &&
        Objects.equals(this.jobDuration, reportsrunnerv3GetExportReportJobStatusResponse.jobDuration) &&
        Objects.equals(this.jobId, reportsrunnerv3GetExportReportJobStatusResponse.jobId) &&
        Objects.equals(this.jobStartTime, reportsrunnerv3GetExportReportJobStatusResponse.jobStartTime) &&
        Objects.equals(this.jobStatus, reportsrunnerv3GetExportReportJobStatusResponse.jobStatus) &&
        Objects.equals(this.message, reportsrunnerv3GetExportReportJobStatusResponse.message) &&
        Objects.equals(this.resultSize, reportsrunnerv3GetExportReportJobStatusResponse.resultSize) &&
        Objects.equals(this.tenantId, reportsrunnerv3GetExportReportJobStatusResponse.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callStatus, fileName, jobDuration, jobId, jobStartTime, jobStatus, message, resultSize, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsrunnerv3GetExportReportJobStatusResponse {\n");
    sb.append("    callStatus: ").append(toIndentedString(callStatus)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    jobDuration: ").append(toIndentedString(jobDuration)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobStartTime: ").append(toIndentedString(jobStartTime)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resultSize: ").append(toIndentedString(resultSize)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("call_status");
    openapiFields.add("file_name");
    openapiFields.add("job_duration");
    openapiFields.add("job_id");
    openapiFields.add("job_start_time");
    openapiFields.add("job_status");
    openapiFields.add("message");
    openapiFields.add("result_size");
    openapiFields.add("tenant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsrunnerv3GetExportReportJobStatusResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsrunnerv3GetExportReportJobStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsrunnerv3GetExportReportJobStatusResponse is not found in the empty JSON string", Reportsrunnerv3GetExportReportJobStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsrunnerv3GetExportReportJobStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsrunnerv3GetExportReportJobStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `call_status`
      if (jsonObj.get("call_status") != null && !jsonObj.get("call_status").isJsonNull()) {
        RpcStatus.validateJsonElement(jsonObj.get("call_status"));
      }
      if ((jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonNull()) && !jsonObj.get("file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_name").toString()));
      }
      if ((jsonObj.get("job_id") != null && !jsonObj.get("job_id").isJsonNull()) && !jsonObj.get("job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_id").toString()));
      }
      if ((jsonObj.get("job_start_time") != null && !jsonObj.get("job_start_time").isJsonNull()) && !jsonObj.get("job_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_start_time").toString()));
      }
      // validate the optional field `job_status`
      if (jsonObj.get("job_status") != null && !jsonObj.get("job_status").isJsonNull()) {
        Reportsrunnerv3ExportJobStatus.validateJsonElement(jsonObj.get("job_status"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsrunnerv3GetExportReportJobStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsrunnerv3GetExportReportJobStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsrunnerv3GetExportReportJobStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsrunnerv3GetExportReportJobStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsrunnerv3GetExportReportJobStatusResponse>() {
           @Override
           public void write(JsonWriter out, Reportsrunnerv3GetExportReportJobStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsrunnerv3GetExportReportJobStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsrunnerv3GetExportReportJobStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsrunnerv3GetExportReportJobStatusResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsrunnerv3GetExportReportJobStatusResponse
  */
  public static Reportsrunnerv3GetExportReportJobStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsrunnerv3GetExportReportJobStatusResponse.class);
  }

 /**
  * Convert an instance of Reportsrunnerv3GetExportReportJobStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

