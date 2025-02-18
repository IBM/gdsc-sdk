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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Reportsv3Category;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * GetCategoriesResponse is the return type which encapsulates a list of categories from the GetCategories() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Reportsv3GetCategoriesResponse {
  public static final String SERIALIZED_NAME_CATEGORY_LIST = "category_list";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LIST)
  private List<Reportsv3Category> categoryList = new ArrayList<>();

  public Reportsv3GetCategoriesResponse() {
  }

  public Reportsv3GetCategoriesResponse categoryList(List<Reportsv3Category> categoryList) {
    this.categoryList = categoryList;
    return this;
  }

  public Reportsv3GetCategoriesResponse addCategoryListItem(Reportsv3Category categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

   /**
   * List of available report categories.
   * @return categoryList
  **/
  @javax.annotation.Nullable
  public List<Reportsv3Category> getCategoryList() {
    return categoryList;
  }

  public void setCategoryList(List<Reportsv3Category> categoryList) {
    this.categoryList = categoryList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3GetCategoriesResponse reportsv3GetCategoriesResponse = (Reportsv3GetCategoriesResponse) o;
    return Objects.equals(this.categoryList, reportsv3GetCategoriesResponse.categoryList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetCategoriesResponse {\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
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
    openapiFields.add("category_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetCategoriesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetCategoriesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetCategoriesResponse is not found in the empty JSON string", Reportsv3GetCategoriesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetCategoriesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetCategoriesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("category_list") != null && !jsonObj.get("category_list").isJsonNull()) {
        JsonArray jsonArraycategoryList = jsonObj.getAsJsonArray("category_list");
        if (jsonArraycategoryList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("category_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `category_list` to be an array in the JSON string but got `%s`", jsonObj.get("category_list").toString()));
          }

          // validate the optional field `category_list` (array)
          for (int i = 0; i < jsonArraycategoryList.size(); i++) {
            Reportsv3Category.validateJsonElement(jsonArraycategoryList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetCategoriesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetCategoriesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetCategoriesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetCategoriesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetCategoriesResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetCategoriesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetCategoriesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetCategoriesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetCategoriesResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetCategoriesResponse
  */
  public static Reportsv3GetCategoriesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetCategoriesResponse.class);
  }

 /**
  * Convert an instance of Reportsv3GetCategoriesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

