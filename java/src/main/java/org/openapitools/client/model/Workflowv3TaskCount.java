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


package org.openapitools.client.model;

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
import org.openapitools.client.model.Workflowv3StatusCount;

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

import org.openapitools.client.JSON;

/**
 * Workflowv3TaskCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3TaskCount {
  public static final String SERIALIZED_NAME_COUNTS = "counts";
  @SerializedName(SERIALIZED_NAME_COUNTS)
  private List<Workflowv3StatusCount> counts = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEDULED_TASK_ID = "scheduled_task_id";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_TASK_ID)
  private String scheduledTaskId;

  public Workflowv3TaskCount() {
  }

  public Workflowv3TaskCount counts(List<Workflowv3StatusCount> counts) {
    this.counts = counts;
    return this;
  }

  public Workflowv3TaskCount addCountsItem(Workflowv3StatusCount countsItem) {
    if (this.counts == null) {
      this.counts = new ArrayList<>();
    }
    this.counts.add(countsItem);
    return this;
  }

   /**
   * Get counts
   * @return counts
  **/
  @javax.annotation.Nullable
  public List<Workflowv3StatusCount> getCounts() {
    return counts;
  }

  public void setCounts(List<Workflowv3StatusCount> counts) {
    this.counts = counts;
  }


  public Workflowv3TaskCount scheduledTaskId(String scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
    return this;
  }

   /**
   * The task within the ScheduledJob.
   * @return scheduledTaskId
  **/
  @javax.annotation.Nullable
  public String getScheduledTaskId() {
    return scheduledTaskId;
  }

  public void setScheduledTaskId(String scheduledTaskId) {
    this.scheduledTaskId = scheduledTaskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3TaskCount workflowv3TaskCount = (Workflowv3TaskCount) o;
    return Objects.equals(this.counts, workflowv3TaskCount.counts) &&
        Objects.equals(this.scheduledTaskId, workflowv3TaskCount.scheduledTaskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, scheduledTaskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3TaskCount {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    scheduledTaskId: ").append(toIndentedString(scheduledTaskId)).append("\n");
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
    openapiFields.add("counts");
    openapiFields.add("scheduled_task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3TaskCount
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3TaskCount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3TaskCount is not found in the empty JSON string", Workflowv3TaskCount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3TaskCount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3TaskCount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("counts") != null && !jsonObj.get("counts").isJsonNull()) {
        JsonArray jsonArraycounts = jsonObj.getAsJsonArray("counts");
        if (jsonArraycounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("counts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `counts` to be an array in the JSON string but got `%s`", jsonObj.get("counts").toString()));
          }

          // validate the optional field `counts` (array)
          for (int i = 0; i < jsonArraycounts.size(); i++) {
            Workflowv3StatusCount.validateJsonElement(jsonArraycounts.get(i));
          };
        }
      }
      if ((jsonObj.get("scheduled_task_id") != null && !jsonObj.get("scheduled_task_id").isJsonNull()) && !jsonObj.get("scheduled_task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduled_task_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3TaskCount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3TaskCount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3TaskCount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3TaskCount.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3TaskCount>() {
           @Override
           public void write(JsonWriter out, Workflowv3TaskCount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3TaskCount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3TaskCount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3TaskCount
  * @throws IOException if the JSON string is invalid with respect to Workflowv3TaskCount
  */
  public static Workflowv3TaskCount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3TaskCount.class);
  }

 /**
  * Convert an instance of Workflowv3TaskCount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

