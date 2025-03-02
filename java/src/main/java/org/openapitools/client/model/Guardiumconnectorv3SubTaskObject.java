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
import org.openapitools.client.model.Guardiumconnectorv3TaskParamsObject;

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
 * Object holding sub task info.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3SubTaskObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<Guardiumconnectorv3TaskParamsObject> params = new ArrayList<>();

  public Guardiumconnectorv3SubTaskObject() {
  }

  public Guardiumconnectorv3SubTaskObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Subtask id.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Guardiumconnectorv3SubTaskObject interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Subtask interval.
   * @return interval
  **/
  @javax.annotation.Nullable
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }


  public Guardiumconnectorv3SubTaskObject params(List<Guardiumconnectorv3TaskParamsObject> params) {
    this.params = params;
    return this;
  }

  public Guardiumconnectorv3SubTaskObject addParamsItem(Guardiumconnectorv3TaskParamsObject paramsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3SubTaskObject guardiumconnectorv3SubTaskObject = (Guardiumconnectorv3SubTaskObject) o;
    return Objects.equals(this.id, guardiumconnectorv3SubTaskObject.id) &&
        Objects.equals(this.interval, guardiumconnectorv3SubTaskObject.interval) &&
        Objects.equals(this.params, guardiumconnectorv3SubTaskObject.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, interval, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3SubTaskObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("interval");
    openapiFields.add("params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3SubTaskObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3SubTaskObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3SubTaskObject is not found in the empty JSON string", Guardiumconnectorv3SubTaskObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3SubTaskObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3SubTaskObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) && !jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3SubTaskObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3SubTaskObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3SubTaskObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3SubTaskObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3SubTaskObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3SubTaskObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3SubTaskObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3SubTaskObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3SubTaskObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3SubTaskObject
  */
  public static Guardiumconnectorv3SubTaskObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3SubTaskObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3SubTaskObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

