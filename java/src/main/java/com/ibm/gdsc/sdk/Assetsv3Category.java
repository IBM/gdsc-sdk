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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Assetsv3SubCategory;
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
 * Category - Main Category Data for Manage Asset Filter Panel.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3Category {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHOW_TIMELINE_FILTER = "show_timeline_filter";
  @SerializedName(SERIALIZED_NAME_SHOW_TIMELINE_FILTER)
  private Boolean showTimelineFilter;

  public static final String SERIALIZED_NAME_SUB_CATEGORY = "sub_category";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private List<Assetsv3SubCategory> subCategory = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMELINE_DISPLAY_NAME = "timeline_display_name";
  @SerializedName(SERIALIZED_NAME_TIMELINE_DISPLAY_NAME)
  private String timelineDisplayName;

  public Assetsv3Category() {
  }

  public Assetsv3Category group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public Assetsv3Category id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Assetsv3Category name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Assetsv3Category showTimelineFilter(Boolean showTimelineFilter) {
    this.showTimelineFilter = showTimelineFilter;
    return this;
  }

   /**
   * Get showTimelineFilter
   * @return showTimelineFilter
  **/
  @javax.annotation.Nullable
  public Boolean getShowTimelineFilter() {
    return showTimelineFilter;
  }

  public void setShowTimelineFilter(Boolean showTimelineFilter) {
    this.showTimelineFilter = showTimelineFilter;
  }


  public Assetsv3Category subCategory(List<Assetsv3SubCategory> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  public Assetsv3Category addSubCategoryItem(Assetsv3SubCategory subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<>();
    }
    this.subCategory.add(subCategoryItem);
    return this;
  }

   /**
   * Get subCategory
   * @return subCategory
  **/
  @javax.annotation.Nullable
  public List<Assetsv3SubCategory> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(List<Assetsv3SubCategory> subCategory) {
    this.subCategory = subCategory;
  }


  public Assetsv3Category timelineDisplayName(String timelineDisplayName) {
    this.timelineDisplayName = timelineDisplayName;
    return this;
  }

   /**
   * Get timelineDisplayName
   * @return timelineDisplayName
  **/
  @javax.annotation.Nullable
  public String getTimelineDisplayName() {
    return timelineDisplayName;
  }

  public void setTimelineDisplayName(String timelineDisplayName) {
    this.timelineDisplayName = timelineDisplayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3Category assetsv3Category = (Assetsv3Category) o;
    return Objects.equals(this.group, assetsv3Category.group) &&
        Objects.equals(this.id, assetsv3Category.id) &&
        Objects.equals(this.name, assetsv3Category.name) &&
        Objects.equals(this.showTimelineFilter, assetsv3Category.showTimelineFilter) &&
        Objects.equals(this.subCategory, assetsv3Category.subCategory) &&
        Objects.equals(this.timelineDisplayName, assetsv3Category.timelineDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, id, name, showTimelineFilter, subCategory, timelineDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3Category {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showTimelineFilter: ").append(toIndentedString(showTimelineFilter)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    timelineDisplayName: ").append(toIndentedString(timelineDisplayName)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("show_timeline_filter");
    openapiFields.add("sub_category");
    openapiFields.add("timeline_display_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3Category
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3Category.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3Category is not found in the empty JSON string", Assetsv3Category.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3Category.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3Category` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("sub_category") != null && !jsonObj.get("sub_category").isJsonNull()) {
        JsonArray jsonArraysubCategory = jsonObj.getAsJsonArray("sub_category");
        if (jsonArraysubCategory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sub_category").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sub_category` to be an array in the JSON string but got `%s`", jsonObj.get("sub_category").toString()));
          }

          // validate the optional field `sub_category` (array)
          for (int i = 0; i < jsonArraysubCategory.size(); i++) {
            Assetsv3SubCategory.validateJsonElement(jsonArraysubCategory.get(i));
          };
        }
      }
      if ((jsonObj.get("timeline_display_name") != null && !jsonObj.get("timeline_display_name").isJsonNull()) && !jsonObj.get("timeline_display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeline_display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeline_display_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3Category.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3Category' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3Category> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3Category.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3Category>() {
           @Override
           public void write(JsonWriter out, Assetsv3Category value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3Category read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3Category given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3Category
  * @throws IOException if the JSON string is invalid with respect to Assetsv3Category
  */
  public static Assetsv3Category fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3Category.class);
  }

 /**
  * Convert an instance of Assetsv3Category to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

