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
import com.ibm.security.guardium.Assetsv3TagsData;
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
 * Assetsv3TagsFilterData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3TagsFilterData {
  public static final String SERIALIZED_NAME_TAG_CATEGORY = "tag_category";
  @SerializedName(SERIALIZED_NAME_TAG_CATEGORY)
  private String tagCategory;

  public static final String SERIALIZED_NAME_TAG_CATEGORY_ID = "tag_category_id";
  @SerializedName(SERIALIZED_NAME_TAG_CATEGORY_ID)
  private String tagCategoryId;

  public static final String SERIALIZED_NAME_TAGS_DATA = "tags_data";
  @SerializedName(SERIALIZED_NAME_TAGS_DATA)
  private List<Assetsv3TagsData> tagsData = new ArrayList<>();

  public Assetsv3TagsFilterData() {
  }

  public Assetsv3TagsFilterData tagCategory(String tagCategory) {
    this.tagCategory = tagCategory;
    return this;
  }

   /**
   * Get tagCategory
   * @return tagCategory
  **/
  @javax.annotation.Nullable
  public String getTagCategory() {
    return tagCategory;
  }

  public void setTagCategory(String tagCategory) {
    this.tagCategory = tagCategory;
  }


  public Assetsv3TagsFilterData tagCategoryId(String tagCategoryId) {
    this.tagCategoryId = tagCategoryId;
    return this;
  }

   /**
   * Get tagCategoryId
   * @return tagCategoryId
  **/
  @javax.annotation.Nullable
  public String getTagCategoryId() {
    return tagCategoryId;
  }

  public void setTagCategoryId(String tagCategoryId) {
    this.tagCategoryId = tagCategoryId;
  }


  public Assetsv3TagsFilterData tagsData(List<Assetsv3TagsData> tagsData) {
    this.tagsData = tagsData;
    return this;
  }

  public Assetsv3TagsFilterData addTagsDataItem(Assetsv3TagsData tagsDataItem) {
    if (this.tagsData == null) {
      this.tagsData = new ArrayList<>();
    }
    this.tagsData.add(tagsDataItem);
    return this;
  }

   /**
   * Get tagsData
   * @return tagsData
  **/
  @javax.annotation.Nullable
  public List<Assetsv3TagsData> getTagsData() {
    return tagsData;
  }

  public void setTagsData(List<Assetsv3TagsData> tagsData) {
    this.tagsData = tagsData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3TagsFilterData assetsv3TagsFilterData = (Assetsv3TagsFilterData) o;
    return Objects.equals(this.tagCategory, assetsv3TagsFilterData.tagCategory) &&
        Objects.equals(this.tagCategoryId, assetsv3TagsFilterData.tagCategoryId) &&
        Objects.equals(this.tagsData, assetsv3TagsFilterData.tagsData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagCategory, tagCategoryId, tagsData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3TagsFilterData {\n");
    sb.append("    tagCategory: ").append(toIndentedString(tagCategory)).append("\n");
    sb.append("    tagCategoryId: ").append(toIndentedString(tagCategoryId)).append("\n");
    sb.append("    tagsData: ").append(toIndentedString(tagsData)).append("\n");
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
    openapiFields.add("tag_category");
    openapiFields.add("tag_category_id");
    openapiFields.add("tags_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3TagsFilterData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3TagsFilterData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3TagsFilterData is not found in the empty JSON string", Assetsv3TagsFilterData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3TagsFilterData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3TagsFilterData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tag_category") != null && !jsonObj.get("tag_category").isJsonNull()) && !jsonObj.get("tag_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_category").toString()));
      }
      if ((jsonObj.get("tag_category_id") != null && !jsonObj.get("tag_category_id").isJsonNull()) && !jsonObj.get("tag_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_category_id").toString()));
      }
      if (jsonObj.get("tags_data") != null && !jsonObj.get("tags_data").isJsonNull()) {
        JsonArray jsonArraytagsData = jsonObj.getAsJsonArray("tags_data");
        if (jsonArraytagsData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags_data` to be an array in the JSON string but got `%s`", jsonObj.get("tags_data").toString()));
          }

          // validate the optional field `tags_data` (array)
          for (int i = 0; i < jsonArraytagsData.size(); i++) {
            Assetsv3TagsData.validateJsonElement(jsonArraytagsData.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3TagsFilterData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3TagsFilterData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3TagsFilterData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3TagsFilterData.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3TagsFilterData>() {
           @Override
           public void write(JsonWriter out, Assetsv3TagsFilterData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3TagsFilterData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3TagsFilterData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3TagsFilterData
  * @throws IOException if the JSON string is invalid with respect to Assetsv3TagsFilterData
  */
  public static Assetsv3TagsFilterData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3TagsFilterData.class);
  }

 /**
  * Convert an instance of Assetsv3TagsFilterData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

