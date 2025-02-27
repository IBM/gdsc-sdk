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
import com.ibm.security.guardium.Reportsv3ContributionPointersInfoObject;
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
 * TransposeRequest is the request type for the api call to get the SQls based on the constructIDs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3TransposeRequest {
  public static final String SERIALIZED_NAME_CONSTRUCT_IDS = "construct_ids";
  @SerializedName(SERIALIZED_NAME_CONSTRUCT_IDS)
  private List<String> constructIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTRIBUTION_INDICATORS = "contribution_indicators";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_INDICATORS)
  private String contributionIndicators;

  public static final String SERIALIZED_NAME_CONTRIBUTION_POINTERS = "contribution_pointers";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_POINTERS)
  private List<Reportsv3ContributionPointersInfoObject> contributionPointers = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private String limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private String offset;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private Boolean summary;

  public Reportsv3TransposeRequest() {
  }

  public Reportsv3TransposeRequest constructIds(List<String> constructIds) {
    this.constructIds = constructIds;
    return this;
  }

  public Reportsv3TransposeRequest addConstructIdsItem(String constructIdsItem) {
    if (this.constructIds == null) {
      this.constructIds = new ArrayList<>();
    }
    this.constructIds.add(constructIdsItem);
    return this;
  }

   /**
   * The list of construct IDs to get the SQLs for.
   * @return constructIds
  **/
  @javax.annotation.Nullable
  public List<String> getConstructIds() {
    return constructIds;
  }

  public void setConstructIds(List<String> constructIds) {
    this.constructIds = constructIds;
  }


  public Reportsv3TransposeRequest contributionIndicators(String contributionIndicators) {
    this.contributionIndicators = contributionIndicators;
    return this;
  }

   /**
   * The contribution indicators represented as a string.
   * @return contributionIndicators
  **/
  @javax.annotation.Nullable
  public String getContributionIndicators() {
    return contributionIndicators;
  }

  public void setContributionIndicators(String contributionIndicators) {
    this.contributionIndicators = contributionIndicators;
  }


  public Reportsv3TransposeRequest contributionPointers(List<Reportsv3ContributionPointersInfoObject> contributionPointers) {
    this.contributionPointers = contributionPointers;
    return this;
  }

  public Reportsv3TransposeRequest addContributionPointersItem(Reportsv3ContributionPointersInfoObject contributionPointersItem) {
    if (this.contributionPointers == null) {
      this.contributionPointers = new ArrayList<>();
    }
    this.contributionPointers.add(contributionPointersItem);
    return this;
  }

   /**
   * The list of contribution pointers.
   * @return contributionPointers
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ContributionPointersInfoObject> getContributionPointers() {
    return contributionPointers;
  }

  public void setContributionPointers(List<Reportsv3ContributionPointersInfoObject> contributionPointers) {
    this.contributionPointers = contributionPointers;
  }


  public Reportsv3TransposeRequest limit(String limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The max amount of rows to return for pagination. Required if report query uses offset and limit parameters.
   * @return limit
  **/
  @javax.annotation.Nullable
  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }


  public Reportsv3TransposeRequest offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The amount to offset the rows by for pagination. Required if report query uses offset and limit parameters.
   * @return offset
  **/
  @javax.annotation.Nullable
  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }


  public Reportsv3TransposeRequest summary(Boolean summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Whether or not to run Summary query.
   * @return summary
  **/
  @javax.annotation.Nullable
  public Boolean getSummary() {
    return summary;
  }

  public void setSummary(Boolean summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3TransposeRequest reportsv3TransposeRequest = (Reportsv3TransposeRequest) o;
    return Objects.equals(this.constructIds, reportsv3TransposeRequest.constructIds) &&
        Objects.equals(this.contributionIndicators, reportsv3TransposeRequest.contributionIndicators) &&
        Objects.equals(this.contributionPointers, reportsv3TransposeRequest.contributionPointers) &&
        Objects.equals(this.limit, reportsv3TransposeRequest.limit) &&
        Objects.equals(this.offset, reportsv3TransposeRequest.offset) &&
        Objects.equals(this.summary, reportsv3TransposeRequest.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constructIds, contributionIndicators, contributionPointers, limit, offset, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3TransposeRequest {\n");
    sb.append("    constructIds: ").append(toIndentedString(constructIds)).append("\n");
    sb.append("    contributionIndicators: ").append(toIndentedString(contributionIndicators)).append("\n");
    sb.append("    contributionPointers: ").append(toIndentedString(contributionPointers)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("construct_ids");
    openapiFields.add("contribution_indicators");
    openapiFields.add("contribution_pointers");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3TransposeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3TransposeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3TransposeRequest is not found in the empty JSON string", Reportsv3TransposeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3TransposeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3TransposeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("construct_ids") != null && !jsonObj.get("construct_ids").isJsonNull() && !jsonObj.get("construct_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `construct_ids` to be an array in the JSON string but got `%s`", jsonObj.get("construct_ids").toString()));
      }
      if ((jsonObj.get("contribution_indicators") != null && !jsonObj.get("contribution_indicators").isJsonNull()) && !jsonObj.get("contribution_indicators").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contribution_indicators` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contribution_indicators").toString()));
      }
      if (jsonObj.get("contribution_pointers") != null && !jsonObj.get("contribution_pointers").isJsonNull()) {
        JsonArray jsonArraycontributionPointers = jsonObj.getAsJsonArray("contribution_pointers");
        if (jsonArraycontributionPointers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contribution_pointers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contribution_pointers` to be an array in the JSON string but got `%s`", jsonObj.get("contribution_pointers").toString()));
          }

          // validate the optional field `contribution_pointers` (array)
          for (int i = 0; i < jsonArraycontributionPointers.size(); i++) {
            Reportsv3ContributionPointersInfoObject.validateJsonElement(jsonArraycontributionPointers.get(i));
          };
        }
      }
      if ((jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) && !jsonObj.get("limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit").toString()));
      }
      if ((jsonObj.get("offset") != null && !jsonObj.get("offset").isJsonNull()) && !jsonObj.get("offset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3TransposeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3TransposeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3TransposeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3TransposeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3TransposeRequest>() {
           @Override
           public void write(JsonWriter out, Reportsv3TransposeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3TransposeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3TransposeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3TransposeRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsv3TransposeRequest
  */
  public static Reportsv3TransposeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3TransposeRequest.class);
  }

 /**
  * Convert an instance of Reportsv3TransposeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

