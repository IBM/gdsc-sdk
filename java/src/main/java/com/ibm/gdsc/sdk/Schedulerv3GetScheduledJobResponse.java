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
import com.ibm.gdsc.sdk.Schedulerv3ScheduledJob;
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
 * GetScheduledJobResponse message for Get v3/schedules or v3/schedules/{scheduled_id} api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3GetScheduledJobResponse {
  public static final String SERIALIZED_NAME_SCHEDULED_JOB = "scheduled_job";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_JOB)
  private Schedulerv3ScheduledJob scheduledJob;

  public Schedulerv3GetScheduledJobResponse() {
  }

  public Schedulerv3GetScheduledJobResponse scheduledJob(Schedulerv3ScheduledJob scheduledJob) {
    this.scheduledJob = scheduledJob;
    return this;
  }

   /**
   * Get scheduledJob
   * @return scheduledJob
  **/
  @javax.annotation.Nullable
  public Schedulerv3ScheduledJob getScheduledJob() {
    return scheduledJob;
  }

  public void setScheduledJob(Schedulerv3ScheduledJob scheduledJob) {
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
    Schedulerv3GetScheduledJobResponse schedulerv3GetScheduledJobResponse = (Schedulerv3GetScheduledJobResponse) o;
    return Objects.equals(this.scheduledJob, schedulerv3GetScheduledJobResponse.scheduledJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3GetScheduledJobResponse {\n");
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
    openapiFields.add("scheduled_job");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3GetScheduledJobResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3GetScheduledJobResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3GetScheduledJobResponse is not found in the empty JSON string", Schedulerv3GetScheduledJobResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3GetScheduledJobResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3GetScheduledJobResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `scheduled_job`
      if (jsonObj.get("scheduled_job") != null && !jsonObj.get("scheduled_job").isJsonNull()) {
        Schedulerv3ScheduledJob.validateJsonElement(jsonObj.get("scheduled_job"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3GetScheduledJobResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3GetScheduledJobResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3GetScheduledJobResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3GetScheduledJobResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3GetScheduledJobResponse>() {
           @Override
           public void write(JsonWriter out, Schedulerv3GetScheduledJobResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3GetScheduledJobResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3GetScheduledJobResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3GetScheduledJobResponse
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3GetScheduledJobResponse
  */
  public static Schedulerv3GetScheduledJobResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3GetScheduledJobResponse.class);
  }

 /**
  * Convert an instance of Schedulerv3GetScheduledJobResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

