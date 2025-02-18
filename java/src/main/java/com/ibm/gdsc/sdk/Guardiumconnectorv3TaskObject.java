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
import com.ibm.gdsc.sdk.Guardiumconnectorv3SubTaskObject;
import com.ibm.gdsc.sdk.Guardiumconnectorv3TaskDefinitionObject;
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
 * Object holding task info.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3TaskObject {
  public static final String SERIALIZED_NAME_SUB_TASKS = "sub_tasks";
  @SerializedName(SERIALIZED_NAME_SUB_TASKS)
  private List<Guardiumconnectorv3SubTaskObject> subTasks = new ArrayList<>();

  public static final String SERIALIZED_NAME_TASK_DEFINITION = "task_definition";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION)
  private Guardiumconnectorv3TaskDefinitionObject taskDefinition;

  public Guardiumconnectorv3TaskObject() {
  }

  public Guardiumconnectorv3TaskObject subTasks(List<Guardiumconnectorv3SubTaskObject> subTasks) {
    this.subTasks = subTasks;
    return this;
  }

  public Guardiumconnectorv3TaskObject addSubTasksItem(Guardiumconnectorv3SubTaskObject subTasksItem) {
    if (this.subTasks == null) {
      this.subTasks = new ArrayList<>();
    }
    this.subTasks.add(subTasksItem);
    return this;
  }

   /**
   * Sub tasks.
   * @return subTasks
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3SubTaskObject> getSubTasks() {
    return subTasks;
  }

  public void setSubTasks(List<Guardiumconnectorv3SubTaskObject> subTasks) {
    this.subTasks = subTasks;
  }


  public Guardiumconnectorv3TaskObject taskDefinition(Guardiumconnectorv3TaskDefinitionObject taskDefinition) {
    this.taskDefinition = taskDefinition;
    return this;
  }

   /**
   * Get taskDefinition
   * @return taskDefinition
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3TaskDefinitionObject getTaskDefinition() {
    return taskDefinition;
  }

  public void setTaskDefinition(Guardiumconnectorv3TaskDefinitionObject taskDefinition) {
    this.taskDefinition = taskDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3TaskObject guardiumconnectorv3TaskObject = (Guardiumconnectorv3TaskObject) o;
    return Objects.equals(this.subTasks, guardiumconnectorv3TaskObject.subTasks) &&
        Objects.equals(this.taskDefinition, guardiumconnectorv3TaskObject.taskDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subTasks, taskDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3TaskObject {\n");
    sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
    sb.append("    taskDefinition: ").append(toIndentedString(taskDefinition)).append("\n");
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
    openapiFields.add("sub_tasks");
    openapiFields.add("task_definition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3TaskObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3TaskObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3TaskObject is not found in the empty JSON string", Guardiumconnectorv3TaskObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3TaskObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3TaskObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("sub_tasks") != null && !jsonObj.get("sub_tasks").isJsonNull()) {
        JsonArray jsonArraysubTasks = jsonObj.getAsJsonArray("sub_tasks");
        if (jsonArraysubTasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sub_tasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sub_tasks` to be an array in the JSON string but got `%s`", jsonObj.get("sub_tasks").toString()));
          }

          // validate the optional field `sub_tasks` (array)
          for (int i = 0; i < jsonArraysubTasks.size(); i++) {
            Guardiumconnectorv3SubTaskObject.validateJsonElement(jsonArraysubTasks.get(i));
          };
        }
      }
      // validate the optional field `task_definition`
      if (jsonObj.get("task_definition") != null && !jsonObj.get("task_definition").isJsonNull()) {
        Guardiumconnectorv3TaskDefinitionObject.validateJsonElement(jsonObj.get("task_definition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3TaskObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3TaskObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3TaskObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3TaskObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3TaskObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3TaskObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3TaskObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3TaskObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3TaskObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3TaskObject
  */
  public static Guardiumconnectorv3TaskObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3TaskObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3TaskObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

