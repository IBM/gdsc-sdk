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
import com.ibm.gdsc.sdk.Guardiumconnectorv3StatusResponseBase;
import com.ibm.gdsc.sdk.Guardiumconnectorv3TaskObject;
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
 * GetTasks response message and returned list of tasks.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3GetTasksResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Guardiumconnectorv3StatusResponseBase status;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<Guardiumconnectorv3TaskObject> tasks = new ArrayList<>();

  public Guardiumconnectorv3GetTasksResponse() {
  }

  public Guardiumconnectorv3GetTasksResponse status(Guardiumconnectorv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Guardiumconnectorv3StatusResponseBase status) {
    this.status = status;
  }


  public Guardiumconnectorv3GetTasksResponse tasks(List<Guardiumconnectorv3TaskObject> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Guardiumconnectorv3GetTasksResponse addTasksItem(Guardiumconnectorv3TaskObject tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * List of task(s).
   * @return tasks
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3TaskObject> getTasks() {
    return tasks;
  }

  public void setTasks(List<Guardiumconnectorv3TaskObject> tasks) {
    this.tasks = tasks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3GetTasksResponse guardiumconnectorv3GetTasksResponse = (Guardiumconnectorv3GetTasksResponse) o;
    return Objects.equals(this.status, guardiumconnectorv3GetTasksResponse.status) &&
        Objects.equals(this.tasks, guardiumconnectorv3GetTasksResponse.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3GetTasksResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("tasks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3GetTasksResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3GetTasksResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3GetTasksResponse is not found in the empty JSON string", Guardiumconnectorv3GetTasksResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3GetTasksResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3GetTasksResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Guardiumconnectorv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("tasks") != null && !jsonObj.get("tasks").isJsonNull()) {
        JsonArray jsonArraytasks = jsonObj.getAsJsonArray("tasks");
        if (jsonArraytasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tasks` to be an array in the JSON string but got `%s`", jsonObj.get("tasks").toString()));
          }

          // validate the optional field `tasks` (array)
          for (int i = 0; i < jsonArraytasks.size(); i++) {
            Guardiumconnectorv3TaskObject.validateJsonElement(jsonArraytasks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3GetTasksResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3GetTasksResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3GetTasksResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3GetTasksResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3GetTasksResponse>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3GetTasksResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3GetTasksResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3GetTasksResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3GetTasksResponse
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3GetTasksResponse
  */
  public static Guardiumconnectorv3GetTasksResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3GetTasksResponse.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3GetTasksResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

