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
import com.ibm.security.guardium.Assetsv3Category;
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
 * GetFiltersDataResponse - Response message for Manage Asset Filter Panel data api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3GetFiltersDataResponse {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<Assetsv3Category> category = new ArrayList<>();

  public Assetsv3GetFiltersDataResponse() {
  }

  public Assetsv3GetFiltersDataResponse category(List<Assetsv3Category> category) {
    this.category = category;
    return this;
  }

  public Assetsv3GetFiltersDataResponse addCategoryItem(Assetsv3Category categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public List<Assetsv3Category> getCategory() {
    return category;
  }

  public void setCategory(List<Assetsv3Category> category) {
    this.category = category;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3GetFiltersDataResponse assetsv3GetFiltersDataResponse = (Assetsv3GetFiltersDataResponse) o;
    return Objects.equals(this.category, assetsv3GetFiltersDataResponse.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3GetFiltersDataResponse {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
    openapiFields.add("category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3GetFiltersDataResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3GetFiltersDataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3GetFiltersDataResponse is not found in the empty JSON string", Assetsv3GetFiltersDataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3GetFiltersDataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3GetFiltersDataResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        JsonArray jsonArraycategory = jsonObj.getAsJsonArray("category");
        if (jsonArraycategory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("category").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `category` to be an array in the JSON string but got `%s`", jsonObj.get("category").toString()));
          }

          // validate the optional field `category` (array)
          for (int i = 0; i < jsonArraycategory.size(); i++) {
            Assetsv3Category.validateJsonElement(jsonArraycategory.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3GetFiltersDataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3GetFiltersDataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3GetFiltersDataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3GetFiltersDataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3GetFiltersDataResponse>() {
           @Override
           public void write(JsonWriter out, Assetsv3GetFiltersDataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3GetFiltersDataResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3GetFiltersDataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3GetFiltersDataResponse
  * @throws IOException if the JSON string is invalid with respect to Assetsv3GetFiltersDataResponse
  */
  public static Assetsv3GetFiltersDataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3GetFiltersDataResponse.class);
  }

 /**
  * Convert an instance of Assetsv3GetFiltersDataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

