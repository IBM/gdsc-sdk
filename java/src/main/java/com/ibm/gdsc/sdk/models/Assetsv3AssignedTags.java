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
 * Assetsv3AssignedTags
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Assetsv3AssignedTags {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private List<String> assetId = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domain_id";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private String domainId;

  public static final String SERIALIZED_NAME_GROUPER_COUNT = "grouper_count";
  @SerializedName(SERIALIZED_NAME_GROUPER_COUNT)
  private String grouperCount;

  public static final String SERIALIZED_NAME_TAG_CATEGORY = "tag_category";
  @SerializedName(SERIALIZED_NAME_TAG_CATEGORY)
  private String tagCategory;

  public static final String SERIALIZED_NAME_TAG_ID = "tag_id";
  @SerializedName(SERIALIZED_NAME_TAG_ID)
  private String tagId;

  public static final String SERIALIZED_NAME_TAG_NAMES = "tag_names";
  @SerializedName(SERIALIZED_NAME_TAG_NAMES)
  private String tagNames;

  public Assetsv3AssignedTags() {
  }

  public Assetsv3AssignedTags assetId(List<String> assetId) {
    this.assetId = assetId;
    return this;
  }

  public Assetsv3AssignedTags addAssetIdItem(String assetIdItem) {
    if (this.assetId == null) {
      this.assetId = new ArrayList<>();
    }
    this.assetId.add(assetIdItem);
    return this;
  }

   /**
   * List of Asset IDs.
   * @return assetId
  **/
  @javax.annotation.Nullable
  public List<String> getAssetId() {
    return assetId;
  }

  public void setAssetId(List<String> assetId) {
    this.assetId = assetId;
  }


  public Assetsv3AssignedTags domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Domain id of the tag.
   * @return domainId
  **/
  @javax.annotation.Nullable
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }


  public Assetsv3AssignedTags grouperCount(String grouperCount) {
    this.grouperCount = grouperCount;
    return this;
  }

   /**
   * Get grouperCount
   * @return grouperCount
  **/
  @javax.annotation.Nullable
  public String getGrouperCount() {
    return grouperCount;
  }

  public void setGrouperCount(String grouperCount) {
    this.grouperCount = grouperCount;
  }


  public Assetsv3AssignedTags tagCategory(String tagCategory) {
    this.tagCategory = tagCategory;
    return this;
  }

   /**
   * Name of the tag.
   * @return tagCategory
  **/
  @javax.annotation.Nullable
  public String getTagCategory() {
    return tagCategory;
  }

  public void setTagCategory(String tagCategory) {
    this.tagCategory = tagCategory;
  }


  public Assetsv3AssignedTags tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @javax.annotation.Nullable
  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }


  public Assetsv3AssignedTags tagNames(String tagNames) {
    this.tagNames = tagNames;
    return this;
  }

   /**
   * Concepts for the tag.
   * @return tagNames
  **/
  @javax.annotation.Nullable
  public String getTagNames() {
    return tagNames;
  }

  public void setTagNames(String tagNames) {
    this.tagNames = tagNames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssignedTags assetsv3AssignedTags = (Assetsv3AssignedTags) o;
    return Objects.equals(this.assetId, assetsv3AssignedTags.assetId) &&
        Objects.equals(this.domainId, assetsv3AssignedTags.domainId) &&
        Objects.equals(this.grouperCount, assetsv3AssignedTags.grouperCount) &&
        Objects.equals(this.tagCategory, assetsv3AssignedTags.tagCategory) &&
        Objects.equals(this.tagId, assetsv3AssignedTags.tagId) &&
        Objects.equals(this.tagNames, assetsv3AssignedTags.tagNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, domainId, grouperCount, tagCategory, tagId, tagNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssignedTags {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    grouperCount: ").append(toIndentedString(grouperCount)).append("\n");
    sb.append("    tagCategory: ").append(toIndentedString(tagCategory)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
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
    openapiFields.add("domain_id");
    openapiFields.add("grouper_count");
    openapiFields.add("tag_category");
    openapiFields.add("tag_id");
    openapiFields.add("tag_names");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssignedTags
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssignedTags.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssignedTags is not found in the empty JSON string", Assetsv3AssignedTags.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssignedTags.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssignedTags` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("asset_id") != null && !jsonObj.get("asset_id").isJsonNull() && !jsonObj.get("asset_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id` to be an array in the JSON string but got `%s`", jsonObj.get("asset_id").toString()));
      }
      if ((jsonObj.get("domain_id") != null && !jsonObj.get("domain_id").isJsonNull()) && !jsonObj.get("domain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_id").toString()));
      }
      if ((jsonObj.get("grouper_count") != null && !jsonObj.get("grouper_count").isJsonNull()) && !jsonObj.get("grouper_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grouper_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grouper_count").toString()));
      }
      if ((jsonObj.get("tag_category") != null && !jsonObj.get("tag_category").isJsonNull()) && !jsonObj.get("tag_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_category").toString()));
      }
      if ((jsonObj.get("tag_id") != null && !jsonObj.get("tag_id").isJsonNull()) && !jsonObj.get("tag_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_id").toString()));
      }
      if ((jsonObj.get("tag_names") != null && !jsonObj.get("tag_names").isJsonNull()) && !jsonObj.get("tag_names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_names").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssignedTags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssignedTags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssignedTags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssignedTags.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssignedTags>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssignedTags value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssignedTags read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssignedTags given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssignedTags
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssignedTags
  */
  public static Assetsv3AssignedTags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssignedTags.class);
  }

 /**
  * Convert an instance of Assetsv3AssignedTags to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

