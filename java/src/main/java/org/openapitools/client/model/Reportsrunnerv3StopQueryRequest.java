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
 * StopQueryRequest is the argument type of the StopQuery API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsrunnerv3StopQueryRequest {
  public static final String SERIALIZED_NAME_QUERY_IDS = "query_ids";
  @SerializedName(SERIALIZED_NAME_QUERY_IDS)
  private List<String> queryIds = new ArrayList<>();

  public Reportsrunnerv3StopQueryRequest() {
  }

  public Reportsrunnerv3StopQueryRequest queryIds(List<String> queryIds) {
    this.queryIds = queryIds;
    return this;
  }

  public Reportsrunnerv3StopQueryRequest addQueryIdsItem(String queryIdsItem) {
    if (this.queryIds == null) {
      this.queryIds = new ArrayList<>();
    }
    this.queryIds.add(queryIdsItem);
    return this;
  }

   /**
   * Token that identifies the query.
   * @return queryIds
  **/
  @javax.annotation.Nullable
  public List<String> getQueryIds() {
    return queryIds;
  }

  public void setQueryIds(List<String> queryIds) {
    this.queryIds = queryIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsrunnerv3StopQueryRequest reportsrunnerv3StopQueryRequest = (Reportsrunnerv3StopQueryRequest) o;
    return Objects.equals(this.queryIds, reportsrunnerv3StopQueryRequest.queryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsrunnerv3StopQueryRequest {\n");
    sb.append("    queryIds: ").append(toIndentedString(queryIds)).append("\n");
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
    openapiFields.add("query_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsrunnerv3StopQueryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsrunnerv3StopQueryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsrunnerv3StopQueryRequest is not found in the empty JSON string", Reportsrunnerv3StopQueryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsrunnerv3StopQueryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsrunnerv3StopQueryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("query_ids") != null && !jsonObj.get("query_ids").isJsonNull() && !jsonObj.get("query_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_ids` to be an array in the JSON string but got `%s`", jsonObj.get("query_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsrunnerv3StopQueryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsrunnerv3StopQueryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsrunnerv3StopQueryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsrunnerv3StopQueryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsrunnerv3StopQueryRequest>() {
           @Override
           public void write(JsonWriter out, Reportsrunnerv3StopQueryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsrunnerv3StopQueryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsrunnerv3StopQueryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsrunnerv3StopQueryRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsrunnerv3StopQueryRequest
  */
  public static Reportsrunnerv3StopQueryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsrunnerv3StopQueryRequest.class);
  }

 /**
  * Convert an instance of Reportsrunnerv3StopQueryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

