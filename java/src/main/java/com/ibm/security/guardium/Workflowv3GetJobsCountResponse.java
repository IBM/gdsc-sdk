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
import com.ibm.security.guardium.Workflowv3JobCount;
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
 * Workflowv3GetJobsCountResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3GetJobsCountResponse {
  public static final String SERIALIZED_NAME_COUNTS = "counts";
  @SerializedName(SERIALIZED_NAME_COUNTS)
  private List<Workflowv3JobCount> counts = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GooglerpcStatus status;

  public Workflowv3GetJobsCountResponse() {
  }

  public Workflowv3GetJobsCountResponse counts(List<Workflowv3JobCount> counts) {
    this.counts = counts;
    return this;
  }

  public Workflowv3GetJobsCountResponse addCountsItem(Workflowv3JobCount countsItem) {
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
  public List<Workflowv3JobCount> getCounts() {
    return counts;
  }

  public void setCounts(List<Workflowv3JobCount> counts) {
    this.counts = counts;
  }


  public Workflowv3GetJobsCountResponse status(GooglerpcStatus status) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3GetJobsCountResponse workflowv3GetJobsCountResponse = (Workflowv3GetJobsCountResponse) o;
    return Objects.equals(this.counts, workflowv3GetJobsCountResponse.counts) &&
        Objects.equals(this.status, workflowv3GetJobsCountResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3GetJobsCountResponse {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3GetJobsCountResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3GetJobsCountResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3GetJobsCountResponse is not found in the empty JSON string", Workflowv3GetJobsCountResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3GetJobsCountResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3GetJobsCountResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Workflowv3JobCount.validateJsonElement(jsonArraycounts.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        GooglerpcStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3GetJobsCountResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3GetJobsCountResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3GetJobsCountResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3GetJobsCountResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3GetJobsCountResponse>() {
           @Override
           public void write(JsonWriter out, Workflowv3GetJobsCountResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3GetJobsCountResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3GetJobsCountResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3GetJobsCountResponse
  * @throws IOException if the JSON string is invalid with respect to Workflowv3GetJobsCountResponse
  */
  public static Workflowv3GetJobsCountResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3GetJobsCountResponse.class);
  }

 /**
  * Convert an instance of Workflowv3GetJobsCountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

