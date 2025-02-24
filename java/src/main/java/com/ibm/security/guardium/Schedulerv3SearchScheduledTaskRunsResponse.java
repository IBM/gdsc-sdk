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
import com.ibm.security.guardium.Schedulerv3ScheduledJobRun;
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
 * Schedulerv3SearchScheduledTaskRunsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3SearchScheduledTaskRunsResponse {
  public static final String SERIALIZED_NAME_RECORD_COUNT = "record_count";
  @SerializedName(SERIALIZED_NAME_RECORD_COUNT)
  private Long recordCount;

  public static final String SERIALIZED_NAME_RUNS = "runs";
  @SerializedName(SERIALIZED_NAME_RUNS)
  private List<Schedulerv3ScheduledJobRun> runs = new ArrayList<>();

  public Schedulerv3SearchScheduledTaskRunsResponse() {
  }

  public Schedulerv3SearchScheduledTaskRunsResponse recordCount(Long recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Total number of the scheduled job runs.
   * @return recordCount
  **/
  @javax.annotation.Nullable
  public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }


  public Schedulerv3SearchScheduledTaskRunsResponse runs(List<Schedulerv3ScheduledJobRun> runs) {
    this.runs = runs;
    return this;
  }

  public Schedulerv3SearchScheduledTaskRunsResponse addRunsItem(Schedulerv3ScheduledJobRun runsItem) {
    if (this.runs == null) {
      this.runs = new ArrayList<>();
    }
    this.runs.add(runsItem);
    return this;
  }

   /**
   * The requested scheduled job data.
   * @return runs
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3ScheduledJobRun> getRuns() {
    return runs;
  }

  public void setRuns(List<Schedulerv3ScheduledJobRun> runs) {
    this.runs = runs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3SearchScheduledTaskRunsResponse schedulerv3SearchScheduledTaskRunsResponse = (Schedulerv3SearchScheduledTaskRunsResponse) o;
    return Objects.equals(this.recordCount, schedulerv3SearchScheduledTaskRunsResponse.recordCount) &&
        Objects.equals(this.runs, schedulerv3SearchScheduledTaskRunsResponse.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordCount, runs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3SearchScheduledTaskRunsResponse {\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
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
    openapiFields.add("runs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3SearchScheduledTaskRunsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3SearchScheduledTaskRunsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3SearchScheduledTaskRunsResponse is not found in the empty JSON string", Schedulerv3SearchScheduledTaskRunsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3SearchScheduledTaskRunsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3SearchScheduledTaskRunsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("runs") != null && !jsonObj.get("runs").isJsonNull()) {
        JsonArray jsonArrayruns = jsonObj.getAsJsonArray("runs");
        if (jsonArrayruns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("runs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `runs` to be an array in the JSON string but got `%s`", jsonObj.get("runs").toString()));
          }

          // validate the optional field `runs` (array)
          for (int i = 0; i < jsonArrayruns.size(); i++) {
            Schedulerv3ScheduledJobRun.validateJsonElement(jsonArrayruns.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3SearchScheduledTaskRunsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3SearchScheduledTaskRunsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3SearchScheduledTaskRunsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3SearchScheduledTaskRunsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3SearchScheduledTaskRunsResponse>() {
           @Override
           public void write(JsonWriter out, Schedulerv3SearchScheduledTaskRunsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3SearchScheduledTaskRunsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3SearchScheduledTaskRunsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3SearchScheduledTaskRunsResponse
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3SearchScheduledTaskRunsResponse
  */
  public static Schedulerv3SearchScheduledTaskRunsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3SearchScheduledTaskRunsResponse.class);
  }

 /**
  * Convert an instance of Schedulerv3SearchScheduledTaskRunsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

