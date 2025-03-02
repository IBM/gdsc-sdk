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
import com.ibm.security.guardium.Guardiumconnectorv3TaskParamsObject;
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
 * Task defifnition executed by GDP.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3TaskDefinition {
  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_TASK_PARAMS = "task_params";
  @SerializedName(SERIALIZED_NAME_TASK_PARAMS)
  private List<Guardiumconnectorv3TaskParamsObject> taskParams = new ArrayList<>();

  public static final String SERIALIZED_NAME_TASK_TYPE = "task_type";
  @SerializedName(SERIALIZED_NAME_TASK_TYPE)
  private String taskType;

  public Guardiumconnectorv3TaskDefinition() {
  }

  public Guardiumconnectorv3TaskDefinition taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Task id.
   * @return taskId
  **/
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public Guardiumconnectorv3TaskDefinition taskParams(List<Guardiumconnectorv3TaskParamsObject> taskParams) {
    this.taskParams = taskParams;
    return this;
  }

  public Guardiumconnectorv3TaskDefinition addTaskParamsItem(Guardiumconnectorv3TaskParamsObject taskParamsItem) {
    if (this.taskParams == null) {
      this.taskParams = new ArrayList<>();
    }
    this.taskParams.add(taskParamsItem);
    return this;
  }

   /**
   * Parameters passed top the task.
   * @return taskParams
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3TaskParamsObject> getTaskParams() {
    return taskParams;
  }

  public void setTaskParams(List<Guardiumconnectorv3TaskParamsObject> taskParams) {
    this.taskParams = taskParams;
  }


  public Guardiumconnectorv3TaskDefinition taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Task type.
   * @return taskType
  **/
  @javax.annotation.Nullable
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3TaskDefinition guardiumconnectorv3TaskDefinition = (Guardiumconnectorv3TaskDefinition) o;
    return Objects.equals(this.taskId, guardiumconnectorv3TaskDefinition.taskId) &&
        Objects.equals(this.taskParams, guardiumconnectorv3TaskDefinition.taskParams) &&
        Objects.equals(this.taskType, guardiumconnectorv3TaskDefinition.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, taskParams, taskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3TaskDefinition {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskParams: ").append(toIndentedString(taskParams)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
    openapiFields.add("task_id");
    openapiFields.add("task_params");
    openapiFields.add("task_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3TaskDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3TaskDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3TaskDefinition is not found in the empty JSON string", Guardiumconnectorv3TaskDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3TaskDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3TaskDefinition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("task_id") != null && !jsonObj.get("task_id").isJsonNull()) && !jsonObj.get("task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_id").toString()));
      }
      if (jsonObj.get("task_params") != null && !jsonObj.get("task_params").isJsonNull()) {
        JsonArray jsonArraytaskParams = jsonObj.getAsJsonArray("task_params");
        if (jsonArraytaskParams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("task_params").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `task_params` to be an array in the JSON string but got `%s`", jsonObj.get("task_params").toString()));
          }

          // validate the optional field `task_params` (array)
          for (int i = 0; i < jsonArraytaskParams.size(); i++) {
            Guardiumconnectorv3TaskParamsObject.validateJsonElement(jsonArraytaskParams.get(i));
          };
        }
      }
      if ((jsonObj.get("task_type") != null && !jsonObj.get("task_type").isJsonNull()) && !jsonObj.get("task_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3TaskDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3TaskDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3TaskDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3TaskDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3TaskDefinition>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3TaskDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3TaskDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3TaskDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3TaskDefinition
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3TaskDefinition
  */
  public static Guardiumconnectorv3TaskDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3TaskDefinition.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3TaskDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

