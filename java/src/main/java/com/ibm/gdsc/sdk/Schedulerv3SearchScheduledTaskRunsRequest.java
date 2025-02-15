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
 * Schedulerv3SearchScheduledTaskRunsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3SearchScheduledTaskRunsRequest {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;

  public static final String SERIALIZED_NAME_SCHEDULED_JOB_ID = "scheduled_job_id";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_JOB_ID)
  private List<String> scheduledJobId = new ArrayList<>();

  public static final String SERIALIZED_NAME_WITH_LATEST = "with_latest";
  @SerializedName(SERIALIZED_NAME_WITH_LATEST)
  private Boolean withLatest;

  public Schedulerv3SearchScheduledTaskRunsRequest() {
  }

  public Schedulerv3SearchScheduledTaskRunsRequest limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Optional: the max amount of rows to return for pagination.
   * @return limit
  **/
  @javax.annotation.Nullable
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public Schedulerv3SearchScheduledTaskRunsRequest offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Optional: the amount to offset the rows by for pagination.
   * @return offset
  **/
  @javax.annotation.Nullable
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }


  public Schedulerv3SearchScheduledTaskRunsRequest scheduledJobId(List<String> scheduledJobId) {
    this.scheduledJobId = scheduledJobId;
    return this;
  }

  public Schedulerv3SearchScheduledTaskRunsRequest addScheduledJobIdItem(String scheduledJobIdItem) {
    if (this.scheduledJobId == null) {
      this.scheduledJobId = new ArrayList<>();
    }
    this.scheduledJobId.add(scheduledJobIdItem);
    return this;
  }

   /**
   * Optional: specicified ScheduledJobs.
   * @return scheduledJobId
  **/
  @javax.annotation.Nullable
  public List<String> getScheduledJobId() {
    return scheduledJobId;
  }

  public void setScheduledJobId(List<String> scheduledJobId) {
    this.scheduledJobId = scheduledJobId;
  }


  public Schedulerv3SearchScheduledTaskRunsRequest withLatest(Boolean withLatest) {
    this.withLatest = withLatest;
    return this;
  }

   /**
   * Optional: whether return latest runs for ScheduledJobs.
   * @return withLatest
  **/
  @javax.annotation.Nullable
  public Boolean getWithLatest() {
    return withLatest;
  }

  public void setWithLatest(Boolean withLatest) {
    this.withLatest = withLatest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3SearchScheduledTaskRunsRequest schedulerv3SearchScheduledTaskRunsRequest = (Schedulerv3SearchScheduledTaskRunsRequest) o;
    return Objects.equals(this.limit, schedulerv3SearchScheduledTaskRunsRequest.limit) &&
        Objects.equals(this.offset, schedulerv3SearchScheduledTaskRunsRequest.offset) &&
        Objects.equals(this.scheduledJobId, schedulerv3SearchScheduledTaskRunsRequest.scheduledJobId) &&
        Objects.equals(this.withLatest, schedulerv3SearchScheduledTaskRunsRequest.withLatest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, scheduledJobId, withLatest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3SearchScheduledTaskRunsRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    scheduledJobId: ").append(toIndentedString(scheduledJobId)).append("\n");
    sb.append("    withLatest: ").append(toIndentedString(withLatest)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("scheduled_job_id");
    openapiFields.add("with_latest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3SearchScheduledTaskRunsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3SearchScheduledTaskRunsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3SearchScheduledTaskRunsRequest is not found in the empty JSON string", Schedulerv3SearchScheduledTaskRunsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3SearchScheduledTaskRunsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3SearchScheduledTaskRunsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("scheduled_job_id") != null && !jsonObj.get("scheduled_job_id").isJsonNull() && !jsonObj.get("scheduled_job_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_job_id` to be an array in the JSON string but got `%s`", jsonObj.get("scheduled_job_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3SearchScheduledTaskRunsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3SearchScheduledTaskRunsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3SearchScheduledTaskRunsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3SearchScheduledTaskRunsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3SearchScheduledTaskRunsRequest>() {
           @Override
           public void write(JsonWriter out, Schedulerv3SearchScheduledTaskRunsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3SearchScheduledTaskRunsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3SearchScheduledTaskRunsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3SearchScheduledTaskRunsRequest
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3SearchScheduledTaskRunsRequest
  */
  public static Schedulerv3SearchScheduledTaskRunsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3SearchScheduledTaskRunsRequest.class);
  }

 /**
  * Convert an instance of Schedulerv3SearchScheduledTaskRunsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

