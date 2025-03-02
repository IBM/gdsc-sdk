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
import com.ibm.security.guardium.PotentialFlowListItem;
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
 * ListPotentialFlows200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class ListPotentialFlows200Response {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<PotentialFlowListItem> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public ListPotentialFlows200Response() {
  }

  public ListPotentialFlows200Response results(List<PotentialFlowListItem> results) {
    this.results = results;
    return this;
  }

  public ListPotentialFlows200Response addResultsItem(PotentialFlowListItem resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  public List<PotentialFlowListItem> getResults() {
    return results;
  }

  public void setResults(List<PotentialFlowListItem> results) {
    this.results = results;
  }


  public ListPotentialFlows200Response nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPotentialFlows200Response listPotentialFlows200Response = (ListPotentialFlows200Response) o;
    return Objects.equals(this.results, listPotentialFlows200Response.results) &&
        Objects.equals(this.nextToken, listPotentialFlows200Response.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPotentialFlows200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("nextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
    openapiRequiredFields.add("nextToken");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListPotentialFlows200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPotentialFlows200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPotentialFlows200Response is not found in the empty JSON string", ListPotentialFlows200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPotentialFlows200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPotentialFlows200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListPotentialFlows200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        PotentialFlowListItem.validateJsonElement(jsonArrayresults.get(i));
      };
      if ((jsonObj.get("nextToken") != null && !jsonObj.get("nextToken").isJsonNull()) && !jsonObj.get("nextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPotentialFlows200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPotentialFlows200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPotentialFlows200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPotentialFlows200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPotentialFlows200Response>() {
           @Override
           public void write(JsonWriter out, ListPotentialFlows200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPotentialFlows200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPotentialFlows200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPotentialFlows200Response
  * @throws IOException if the JSON string is invalid with respect to ListPotentialFlows200Response
  */
  public static ListPotentialFlows200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPotentialFlows200Response.class);
  }

 /**
  * Convert an instance of ListPotentialFlows200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

