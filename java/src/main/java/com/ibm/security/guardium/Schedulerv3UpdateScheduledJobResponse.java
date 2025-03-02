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

import com.ibm.security.JSON;

/**
 * UpdateScheduledJobResponse message for Put v3/schedules/ api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3UpdateScheduledJobResponse {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public Schedulerv3UpdateScheduledJobResponse() {
  }

  public Schedulerv3UpdateScheduledJobResponse result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Result is \&quot;\&quot; if record is persisted, otherwise an error is returned.
   * @return result
  **/
  @javax.annotation.Nullable
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3UpdateScheduledJobResponse schedulerv3UpdateScheduledJobResponse = (Schedulerv3UpdateScheduledJobResponse) o;
    return Objects.equals(this.result, schedulerv3UpdateScheduledJobResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3UpdateScheduledJobResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3UpdateScheduledJobResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3UpdateScheduledJobResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3UpdateScheduledJobResponse is not found in the empty JSON string", Schedulerv3UpdateScheduledJobResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3UpdateScheduledJobResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3UpdateScheduledJobResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3UpdateScheduledJobResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3UpdateScheduledJobResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3UpdateScheduledJobResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3UpdateScheduledJobResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3UpdateScheduledJobResponse>() {
           @Override
           public void write(JsonWriter out, Schedulerv3UpdateScheduledJobResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3UpdateScheduledJobResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3UpdateScheduledJobResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3UpdateScheduledJobResponse
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3UpdateScheduledJobResponse
  */
  public static Schedulerv3UpdateScheduledJobResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3UpdateScheduledJobResponse.class);
  }

 /**
  * Convert an instance of Schedulerv3UpdateScheduledJobResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

