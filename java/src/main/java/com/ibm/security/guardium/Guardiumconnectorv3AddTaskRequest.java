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
 * Adds specified task.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3AddTaskRequest {
  public static final String SERIALIZED_NAME_CENTRAL_MANAGER_ID = "central_manager_id";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER_ID)
  private String centralManagerId;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_KEY_OBJECT = "key_object";
  @SerializedName(SERIALIZED_NAME_KEY_OBJECT)
  private String keyObject;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<Guardiumconnectorv3TaskParamsObject> params = new ArrayList<>();

  public static final String SERIALIZED_NAME_TASK_TYPE = "task_type";
  @SerializedName(SERIALIZED_NAME_TASK_TYPE)
  private String taskType;

  public Guardiumconnectorv3AddTaskRequest() {
  }

  public Guardiumconnectorv3AddTaskRequest centralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
    return this;
  }

   /**
   * ID of central manager.
   * @return centralManagerId
  **/
  @javax.annotation.Nullable
  public String getCentralManagerId() {
    return centralManagerId;
  }

  public void setCentralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
  }


  public Guardiumconnectorv3AddTaskRequest interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Optional, overrides task default interval.
   * @return interval
  **/
  @javax.annotation.Nullable
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }


  public Guardiumconnectorv3AddTaskRequest keyObject(String keyObject) {
    this.keyObject = keyObject;
    return this;
  }

   /**
   * Key object.
   * @return keyObject
  **/
  @javax.annotation.Nullable
  public String getKeyObject() {
    return keyObject;
  }

  public void setKeyObject(String keyObject) {
    this.keyObject = keyObject;
  }


  public Guardiumconnectorv3AddTaskRequest params(List<Guardiumconnectorv3TaskParamsObject> params) {
    this.params = params;
    return this;
  }

  public Guardiumconnectorv3AddTaskRequest addParamsItem(Guardiumconnectorv3TaskParamsObject paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Json array.
   * @return params
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3TaskParamsObject> getParams() {
    return params;
  }

  public void setParams(List<Guardiumconnectorv3TaskParamsObject> params) {
    this.params = params;
  }


  public Guardiumconnectorv3AddTaskRequest taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Type of task being added.
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
    Guardiumconnectorv3AddTaskRequest guardiumconnectorv3AddTaskRequest = (Guardiumconnectorv3AddTaskRequest) o;
    return Objects.equals(this.centralManagerId, guardiumconnectorv3AddTaskRequest.centralManagerId) &&
        Objects.equals(this.interval, guardiumconnectorv3AddTaskRequest.interval) &&
        Objects.equals(this.keyObject, guardiumconnectorv3AddTaskRequest.keyObject) &&
        Objects.equals(this.params, guardiumconnectorv3AddTaskRequest.params) &&
        Objects.equals(this.taskType, guardiumconnectorv3AddTaskRequest.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralManagerId, interval, keyObject, params, taskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3AddTaskRequest {\n");
    sb.append("    centralManagerId: ").append(toIndentedString(centralManagerId)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    keyObject: ").append(toIndentedString(keyObject)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
    openapiFields.add("central_manager_id");
    openapiFields.add("interval");
    openapiFields.add("key_object");
    openapiFields.add("params");
    openapiFields.add("task_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3AddTaskRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3AddTaskRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3AddTaskRequest is not found in the empty JSON string", Guardiumconnectorv3AddTaskRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3AddTaskRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3AddTaskRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("central_manager_id") != null && !jsonObj.get("central_manager_id").isJsonNull()) && !jsonObj.get("central_manager_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager_id").toString()));
      }
      if ((jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) && !jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      if ((jsonObj.get("key_object") != null && !jsonObj.get("key_object").isJsonNull()) && !jsonObj.get("key_object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_object").toString()));
      }
      if (jsonObj.get("params") != null && !jsonObj.get("params").isJsonNull()) {
        JsonArray jsonArrayparams = jsonObj.getAsJsonArray("params");
        if (jsonArrayparams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("params").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `params` to be an array in the JSON string but got `%s`", jsonObj.get("params").toString()));
          }

          // validate the optional field `params` (array)
          for (int i = 0; i < jsonArrayparams.size(); i++) {
            Guardiumconnectorv3TaskParamsObject.validateJsonElement(jsonArrayparams.get(i));
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
       if (!Guardiumconnectorv3AddTaskRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3AddTaskRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3AddTaskRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3AddTaskRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3AddTaskRequest>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3AddTaskRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3AddTaskRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3AddTaskRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3AddTaskRequest
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3AddTaskRequest
  */
  public static Guardiumconnectorv3AddTaskRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3AddTaskRequest.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3AddTaskRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

