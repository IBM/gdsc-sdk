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
 * Resourcecontrollerk8v3DeleteJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3DeleteJobRequest {
  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public Resourcecontrollerk8v3DeleteJobRequest() {
  }

  public Resourcecontrollerk8v3DeleteJobRequest jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * ID of the job that needs to be deleted.
   * @return jobId
  **/
  @javax.annotation.Nullable
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3DeleteJobRequest resourcecontrollerk8v3DeleteJobRequest = (Resourcecontrollerk8v3DeleteJobRequest) o;
    return Objects.equals(this.jobId, resourcecontrollerk8v3DeleteJobRequest.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3DeleteJobRequest {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
    openapiFields.add("job_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3DeleteJobRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3DeleteJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3DeleteJobRequest is not found in the empty JSON string", Resourcecontrollerk8v3DeleteJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3DeleteJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3DeleteJobRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("job_id") != null && !jsonObj.get("job_id").isJsonNull()) && !jsonObj.get("job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3DeleteJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3DeleteJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3DeleteJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3DeleteJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3DeleteJobRequest>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3DeleteJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3DeleteJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3DeleteJobRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3DeleteJobRequest
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3DeleteJobRequest
  */
  public static Resourcecontrollerk8v3DeleteJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3DeleteJobRequest.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3DeleteJobRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

