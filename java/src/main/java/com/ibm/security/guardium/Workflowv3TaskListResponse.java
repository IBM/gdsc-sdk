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
import com.ibm.security.guardium.GooglerpcStatus;
import com.ibm.security.guardium.Workflowv3Task;
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
 * Returns just tasks, not cases.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3TaskListResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GooglerpcStatus status;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<Workflowv3Task> tasks = new ArrayList<>();

  public Workflowv3TaskListResponse() {
  }

  public Workflowv3TaskListResponse status(GooglerpcStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public GooglerpcStatus getStatus() {
    return status;
  }

  public void setStatus(GooglerpcStatus status) {
    this.status = status;
  }


  public Workflowv3TaskListResponse tasks(List<Workflowv3Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Workflowv3TaskListResponse addTasksItem(Workflowv3Task tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * All tasks or just the ones requested.
   * @return tasks
  **/
  @javax.annotation.Nullable
  public List<Workflowv3Task> getTasks() {
    return tasks;
  }

  public void setTasks(List<Workflowv3Task> tasks) {
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
    Workflowv3TaskListResponse workflowv3TaskListResponse = (Workflowv3TaskListResponse) o;
    return Objects.equals(this.status, workflowv3TaskListResponse.status) &&
        Objects.equals(this.tasks, workflowv3TaskListResponse.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3TaskListResponse {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3TaskListResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3TaskListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3TaskListResponse is not found in the empty JSON string", Workflowv3TaskListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3TaskListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3TaskListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        GooglerpcStatus.validateJsonElement(jsonObj.get("status"));
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
            Workflowv3Task.validateJsonElement(jsonArraytasks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3TaskListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3TaskListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3TaskListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3TaskListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3TaskListResponse>() {
           @Override
           public void write(JsonWriter out, Workflowv3TaskListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3TaskListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3TaskListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3TaskListResponse
  * @throws IOException if the JSON string is invalid with respect to Workflowv3TaskListResponse
  */
  public static Workflowv3TaskListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3TaskListResponse.class);
  }

 /**
  * Convert an instance of Workflowv3TaskListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

