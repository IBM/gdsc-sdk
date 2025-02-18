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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Outliersenginev3DatasourcesCoverageStats;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * StatisticsResponse is the message for the result from getStatistics.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Outliersenginev3QueueStatisticsMessage {
  public static final String SERIALIZED_NAME_COVERAGE1H = "coverage_1h";
  @SerializedName(SERIALIZED_NAME_COVERAGE1H)
  private Outliersenginev3DatasourcesCoverageStats coverage1h;

  public static final String SERIALIZED_NAME_COVERAGE24H = "coverage_24h";
  @SerializedName(SERIALIZED_NAME_COVERAGE24H)
  private Outliersenginev3DatasourcesCoverageStats coverage24h;

  public static final String SERIALIZED_NAME_COVERAGE72H = "coverage_72h";
  @SerializedName(SERIALIZED_NAME_COVERAGE72H)
  private Outliersenginev3DatasourcesCoverageStats coverage72h;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private Integer tasks;

  public static final String SERIALIZED_NAME_TASKS_DONE = "tasks_done";
  @SerializedName(SERIALIZED_NAME_TASKS_DONE)
  private Integer tasksDone;

  public static final String SERIALIZED_NAME_TASKS_IN_PROGRESS = "tasks_in_progress";
  @SerializedName(SERIALIZED_NAME_TASKS_IN_PROGRESS)
  private Integer tasksInProgress;

  public static final String SERIALIZED_NAME_TASKS_IN_PROGRESS2H = "tasks_in_progress_2h";
  @SerializedName(SERIALIZED_NAME_TASKS_IN_PROGRESS2H)
  private Integer tasksInProgress2h;

  public static final String SERIALIZED_NAME_TASKS_NEW = "tasks_new";
  @SerializedName(SERIALIZED_NAME_TASKS_NEW)
  private Integer tasksNew;

  public static final String SERIALIZED_NAME_TASKS_NEW2H = "tasks_new_2h";
  @SerializedName(SERIALIZED_NAME_TASKS_NEW2H)
  private Integer tasksNew2h;

  public Outliersenginev3QueueStatisticsMessage() {
  }

  public Outliersenginev3QueueStatisticsMessage coverage1h(Outliersenginev3DatasourcesCoverageStats coverage1h) {
    this.coverage1h = coverage1h;
    return this;
  }

   /**
   * Get coverage1h
   * @return coverage1h
  **/
  @javax.annotation.Nullable
  public Outliersenginev3DatasourcesCoverageStats getCoverage1h() {
    return coverage1h;
  }

  public void setCoverage1h(Outliersenginev3DatasourcesCoverageStats coverage1h) {
    this.coverage1h = coverage1h;
  }


  public Outliersenginev3QueueStatisticsMessage coverage24h(Outliersenginev3DatasourcesCoverageStats coverage24h) {
    this.coverage24h = coverage24h;
    return this;
  }

   /**
   * Get coverage24h
   * @return coverage24h
  **/
  @javax.annotation.Nullable
  public Outliersenginev3DatasourcesCoverageStats getCoverage24h() {
    return coverage24h;
  }

  public void setCoverage24h(Outliersenginev3DatasourcesCoverageStats coverage24h) {
    this.coverage24h = coverage24h;
  }


  public Outliersenginev3QueueStatisticsMessage coverage72h(Outliersenginev3DatasourcesCoverageStats coverage72h) {
    this.coverage72h = coverage72h;
    return this;
  }

   /**
   * Get coverage72h
   * @return coverage72h
  **/
  @javax.annotation.Nullable
  public Outliersenginev3DatasourcesCoverageStats getCoverage72h() {
    return coverage72h;
  }

  public void setCoverage72h(Outliersenginev3DatasourcesCoverageStats coverage72h) {
    this.coverage72h = coverage72h;
  }


  public Outliersenginev3QueueStatisticsMessage tasks(Integer tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Number of tasks in queue, in total.
   * @return tasks
  **/
  @javax.annotation.Nullable
  public Integer getTasks() {
    return tasks;
  }

  public void setTasks(Integer tasks) {
    this.tasks = tasks;
  }


  public Outliersenginev3QueueStatisticsMessage tasksDone(Integer tasksDone) {
    this.tasksDone = tasksDone;
    return this;
  }

   /**
   * Number of tasks done.
   * @return tasksDone
  **/
  @javax.annotation.Nullable
  public Integer getTasksDone() {
    return tasksDone;
  }

  public void setTasksDone(Integer tasksDone) {
    this.tasksDone = tasksDone;
  }


  public Outliersenginev3QueueStatisticsMessage tasksInProgress(Integer tasksInProgress) {
    this.tasksInProgress = tasksInProgress;
    return this;
  }

   /**
   * Number of tasks in progress.
   * @return tasksInProgress
  **/
  @javax.annotation.Nullable
  public Integer getTasksInProgress() {
    return tasksInProgress;
  }

  public void setTasksInProgress(Integer tasksInProgress) {
    this.tasksInProgress = tasksInProgress;
  }


  public Outliersenginev3QueueStatisticsMessage tasksInProgress2h(Integer tasksInProgress2h) {
    this.tasksInProgress2h = tasksInProgress2h;
    return this;
  }

   /**
   * Number of tasks in progress, for over 2 hours.
   * @return tasksInProgress2h
  **/
  @javax.annotation.Nullable
  public Integer getTasksInProgress2h() {
    return tasksInProgress2h;
  }

  public void setTasksInProgress2h(Integer tasksInProgress2h) {
    this.tasksInProgress2h = tasksInProgress2h;
  }


  public Outliersenginev3QueueStatisticsMessage tasksNew(Integer tasksNew) {
    this.tasksNew = tasksNew;
    return this;
  }

   /**
   * Number of new tasks in queue.
   * @return tasksNew
  **/
  @javax.annotation.Nullable
  public Integer getTasksNew() {
    return tasksNew;
  }

  public void setTasksNew(Integer tasksNew) {
    this.tasksNew = tasksNew;
  }


  public Outliersenginev3QueueStatisticsMessage tasksNew2h(Integer tasksNew2h) {
    this.tasksNew2h = tasksNew2h;
    return this;
  }

   /**
   * Number of new tasks in queue, for over 2 hours.
   * @return tasksNew2h
  **/
  @javax.annotation.Nullable
  public Integer getTasksNew2h() {
    return tasksNew2h;
  }

  public void setTasksNew2h(Integer tasksNew2h) {
    this.tasksNew2h = tasksNew2h;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3QueueStatisticsMessage outliersenginev3QueueStatisticsMessage = (Outliersenginev3QueueStatisticsMessage) o;
    return Objects.equals(this.coverage1h, outliersenginev3QueueStatisticsMessage.coverage1h) &&
        Objects.equals(this.coverage24h, outliersenginev3QueueStatisticsMessage.coverage24h) &&
        Objects.equals(this.coverage72h, outliersenginev3QueueStatisticsMessage.coverage72h) &&
        Objects.equals(this.tasks, outliersenginev3QueueStatisticsMessage.tasks) &&
        Objects.equals(this.tasksDone, outliersenginev3QueueStatisticsMessage.tasksDone) &&
        Objects.equals(this.tasksInProgress, outliersenginev3QueueStatisticsMessage.tasksInProgress) &&
        Objects.equals(this.tasksInProgress2h, outliersenginev3QueueStatisticsMessage.tasksInProgress2h) &&
        Objects.equals(this.tasksNew, outliersenginev3QueueStatisticsMessage.tasksNew) &&
        Objects.equals(this.tasksNew2h, outliersenginev3QueueStatisticsMessage.tasksNew2h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverage1h, coverage24h, coverage72h, tasks, tasksDone, tasksInProgress, tasksInProgress2h, tasksNew, tasksNew2h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3QueueStatisticsMessage {\n");
    sb.append("    coverage1h: ").append(toIndentedString(coverage1h)).append("\n");
    sb.append("    coverage24h: ").append(toIndentedString(coverage24h)).append("\n");
    sb.append("    coverage72h: ").append(toIndentedString(coverage72h)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    tasksDone: ").append(toIndentedString(tasksDone)).append("\n");
    sb.append("    tasksInProgress: ").append(toIndentedString(tasksInProgress)).append("\n");
    sb.append("    tasksInProgress2h: ").append(toIndentedString(tasksInProgress2h)).append("\n");
    sb.append("    tasksNew: ").append(toIndentedString(tasksNew)).append("\n");
    sb.append("    tasksNew2h: ").append(toIndentedString(tasksNew2h)).append("\n");
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
    openapiFields.add("coverage_1h");
    openapiFields.add("coverage_24h");
    openapiFields.add("coverage_72h");
    openapiFields.add("tasks");
    openapiFields.add("tasks_done");
    openapiFields.add("tasks_in_progress");
    openapiFields.add("tasks_in_progress_2h");
    openapiFields.add("tasks_new");
    openapiFields.add("tasks_new_2h");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3QueueStatisticsMessage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3QueueStatisticsMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3QueueStatisticsMessage is not found in the empty JSON string", Outliersenginev3QueueStatisticsMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3QueueStatisticsMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3QueueStatisticsMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `coverage_1h`
      if (jsonObj.get("coverage_1h") != null && !jsonObj.get("coverage_1h").isJsonNull()) {
        Outliersenginev3DatasourcesCoverageStats.validateJsonElement(jsonObj.get("coverage_1h"));
      }
      // validate the optional field `coverage_24h`
      if (jsonObj.get("coverage_24h") != null && !jsonObj.get("coverage_24h").isJsonNull()) {
        Outliersenginev3DatasourcesCoverageStats.validateJsonElement(jsonObj.get("coverage_24h"));
      }
      // validate the optional field `coverage_72h`
      if (jsonObj.get("coverage_72h") != null && !jsonObj.get("coverage_72h").isJsonNull()) {
        Outliersenginev3DatasourcesCoverageStats.validateJsonElement(jsonObj.get("coverage_72h"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3QueueStatisticsMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3QueueStatisticsMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3QueueStatisticsMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3QueueStatisticsMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3QueueStatisticsMessage>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3QueueStatisticsMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3QueueStatisticsMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3QueueStatisticsMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3QueueStatisticsMessage
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3QueueStatisticsMessage
  */
  public static Outliersenginev3QueueStatisticsMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3QueueStatisticsMessage.class);
  }

 /**
  * Convert an instance of Outliersenginev3QueueStatisticsMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

