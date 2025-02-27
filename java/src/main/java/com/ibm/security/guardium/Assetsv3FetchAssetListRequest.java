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
import com.ibm.security.guardium.Assetsv3AssetView;
import com.ibm.security.guardium.Assetsv3FilterCatagory;
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
 * Assetsv3FetchAssetListRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3FetchAssetListRequest {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<String> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private List<Assetsv3FilterCatagory> filter = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Long pageNumber;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_SEARCH_KEY = "search_key";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEY)
  private String searchKey;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public static final String SERIALIZED_NAME_VIEW_TYPE = "view_type";
  @SerializedName(SERIALIZED_NAME_VIEW_TYPE)
  private Assetsv3AssetView viewType = Assetsv3AssetView.DB;

  public Assetsv3FetchAssetListRequest() {
  }

  public Assetsv3FetchAssetListRequest columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public Assetsv3FetchAssetListRequest addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }


  public Assetsv3FetchAssetListRequest filter(List<Assetsv3FilterCatagory> filter) {
    this.filter = filter;
    return this;
  }

  public Assetsv3FetchAssetListRequest addFilterItem(Assetsv3FilterCatagory filterItem) {
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


  public Assetsv3FetchAssetListRequest pageNumber(Long pageNumber) {
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


  public Assetsv3FetchAssetListRequest pageSize(Long pageSize) {
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


  public Assetsv3FetchAssetListRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public Assetsv3FetchAssetListRequest searchKey(String searchKey) {
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


  public Assetsv3FetchAssetListRequest sort(String sort) {
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


  public Assetsv3FetchAssetListRequest sortBy(String sortBy) {
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


  public Assetsv3FetchAssetListRequest viewType(Assetsv3AssetView viewType) {
    this.viewType = viewType;
    return this;
  }

   /**
   * Get viewType
   * @return viewType
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetView getViewType() {
    return viewType;
  }

  public void setViewType(Assetsv3AssetView viewType) {
    this.viewType = viewType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3FetchAssetListRequest assetsv3FetchAssetListRequest = (Assetsv3FetchAssetListRequest) o;
    return Objects.equals(this.columns, assetsv3FetchAssetListRequest.columns) &&
        Objects.equals(this.filter, assetsv3FetchAssetListRequest.filter) &&
        Objects.equals(this.pageNumber, assetsv3FetchAssetListRequest.pageNumber) &&
        Objects.equals(this.pageSize, assetsv3FetchAssetListRequest.pageSize) &&
        Objects.equals(this.parentId, assetsv3FetchAssetListRequest.parentId) &&
        Objects.equals(this.searchKey, assetsv3FetchAssetListRequest.searchKey) &&
        Objects.equals(this.sort, assetsv3FetchAssetListRequest.sort) &&
        Objects.equals(this.sortBy, assetsv3FetchAssetListRequest.sortBy) &&
        Objects.equals(this.viewType, assetsv3FetchAssetListRequest.viewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, filter, pageNumber, pageSize, parentId, searchKey, sort, sortBy, viewType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3FetchAssetListRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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
    openapiFields.add("columns");
    openapiFields.add("filter");
    openapiFields.add("page_number");
    openapiFields.add("page_size");
    openapiFields.add("parent_id");
    openapiFields.add("search_key");
    openapiFields.add("sort");
    openapiFields.add("sort_by");
    openapiFields.add("view_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3FetchAssetListRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3FetchAssetListRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3FetchAssetListRequest is not found in the empty JSON string", Assetsv3FetchAssetListRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3FetchAssetListRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3FetchAssetListRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull() && !jsonObj.get("columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
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
      if ((jsonObj.get("parent_id") != null && !jsonObj.get("parent_id").isJsonNull()) && !jsonObj.get("parent_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_id").toString()));
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
      // validate the optional field `view_type`
      if (jsonObj.get("view_type") != null && !jsonObj.get("view_type").isJsonNull()) {
        Assetsv3AssetView.validateJsonElement(jsonObj.get("view_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3FetchAssetListRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3FetchAssetListRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3FetchAssetListRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3FetchAssetListRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3FetchAssetListRequest>() {
           @Override
           public void write(JsonWriter out, Assetsv3FetchAssetListRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3FetchAssetListRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3FetchAssetListRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3FetchAssetListRequest
  * @throws IOException if the JSON string is invalid with respect to Assetsv3FetchAssetListRequest
  */
  public static Assetsv3FetchAssetListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3FetchAssetListRequest.class);
  }

 /**
  * Convert an instance of Assetsv3FetchAssetListRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

