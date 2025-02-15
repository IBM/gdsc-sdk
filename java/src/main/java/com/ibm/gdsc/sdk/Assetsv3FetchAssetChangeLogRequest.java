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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Assetsv3FilterCatagory;
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
 * Assetsv3FetchAssetChangeLogRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3FetchAssetChangeLogRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private List<Assetsv3FilterCatagory> filter = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Long pageNumber;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_SEARCH_KEY = "search_key";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEY)
  private String searchKey;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public Assetsv3FetchAssetChangeLogRequest() {
  }

  public Assetsv3FetchAssetChangeLogRequest assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public Assetsv3FetchAssetChangeLogRequest filter(List<Assetsv3FilterCatagory> filter) {
    this.filter = filter;
    return this;
  }

  public Assetsv3FetchAssetChangeLogRequest addFilterItem(Assetsv3FilterCatagory filterItem) {
    if (this.filter == null) {
      this.filter = new ArrayList<>();
    }
    this.filter.add(filterItem);
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  public List<Assetsv3FilterCatagory> getFilter() {
    return filter;
  }

  public void setFilter(List<Assetsv3FilterCatagory> filter) {
    this.filter = filter;
  }


  public Assetsv3FetchAssetChangeLogRequest pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }


  public Assetsv3FetchAssetChangeLogRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public Assetsv3FetchAssetChangeLogRequest searchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

   /**
   * Get searchKey
   * @return searchKey
  **/
  @javax.annotation.Nullable
  public String getSearchKey() {
    return searchKey;
  }

  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }


  public Assetsv3FetchAssetChangeLogRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  public Assetsv3FetchAssetChangeLogRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3FetchAssetChangeLogRequest assetsv3FetchAssetChangeLogRequest = (Assetsv3FetchAssetChangeLogRequest) o;
    return Objects.equals(this.assetId, assetsv3FetchAssetChangeLogRequest.assetId) &&
        Objects.equals(this.filter, assetsv3FetchAssetChangeLogRequest.filter) &&
        Objects.equals(this.pageNumber, assetsv3FetchAssetChangeLogRequest.pageNumber) &&
        Objects.equals(this.pageSize, assetsv3FetchAssetChangeLogRequest.pageSize) &&
        Objects.equals(this.searchKey, assetsv3FetchAssetChangeLogRequest.searchKey) &&
        Objects.equals(this.sort, assetsv3FetchAssetChangeLogRequest.sort) &&
        Objects.equals(this.sortBy, assetsv3FetchAssetChangeLogRequest.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, filter, pageNumber, pageSize, searchKey, sort, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3FetchAssetChangeLogRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("filter");
    openapiFields.add("page_number");
    openapiFields.add("page_size");
    openapiFields.add("search_key");
    openapiFields.add("sort");
    openapiFields.add("sort_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3FetchAssetChangeLogRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3FetchAssetChangeLogRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3FetchAssetChangeLogRequest is not found in the empty JSON string", Assetsv3FetchAssetChangeLogRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3FetchAssetChangeLogRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3FetchAssetChangeLogRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asset_id") != null && !jsonObj.get("asset_id").isJsonNull()) && !jsonObj.get("asset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_id").toString()));
      }
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        JsonArray jsonArrayfilter = jsonObj.getAsJsonArray("filter");
        if (jsonArrayfilter != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filter").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filter` to be an array in the JSON string but got `%s`", jsonObj.get("filter").toString()));
          }

          // validate the optional field `filter` (array)
          for (int i = 0; i < jsonArrayfilter.size(); i++) {
            Assetsv3FilterCatagory.validateJsonElement(jsonArrayfilter.get(i));
          };
        }
      }
      if ((jsonObj.get("search_key") != null && !jsonObj.get("search_key").isJsonNull()) && !jsonObj.get("search_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_key").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
      if ((jsonObj.get("sort_by") != null && !jsonObj.get("sort_by").isJsonNull()) && !jsonObj.get("sort_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3FetchAssetChangeLogRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3FetchAssetChangeLogRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3FetchAssetChangeLogRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3FetchAssetChangeLogRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3FetchAssetChangeLogRequest>() {
           @Override
           public void write(JsonWriter out, Assetsv3FetchAssetChangeLogRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3FetchAssetChangeLogRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3FetchAssetChangeLogRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3FetchAssetChangeLogRequest
  * @throws IOException if the JSON string is invalid with respect to Assetsv3FetchAssetChangeLogRequest
  */
  public static Assetsv3FetchAssetChangeLogRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3FetchAssetChangeLogRequest.class);
  }

 /**
  * Convert an instance of Assetsv3FetchAssetChangeLogRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

