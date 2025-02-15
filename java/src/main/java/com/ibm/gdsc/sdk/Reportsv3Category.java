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
import com.ibm.gdsc.sdk.Reportsv3CategoryVersion;
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
 * Reportsv3Category
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3Category {
  public static final String SERIALIZED_NAME_CATEGORY_DESCRIPTION = "category_description";
  @SerializedName(SERIALIZED_NAME_CATEGORY_DESCRIPTION)
  private String categoryDescription;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_MULTI_VERSION = "multi_version";
  @SerializedName(SERIALIZED_NAME_MULTI_VERSION)
  private Boolean multiVersion;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<Reportsv3CategoryVersion> versions = new ArrayList<>();

  public Reportsv3Category() {
  }

  public Reportsv3Category categoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
    return this;
  }

   /**
   * The category description.
   * @return categoryDescription
  **/
  @javax.annotation.Nullable
  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }


  public Reportsv3Category categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The category id.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public Reportsv3Category categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Identifies the NLS translated string.
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public Reportsv3Category multiVersion(Boolean multiVersion) {
    this.multiVersion = multiVersion;
    return this;
  }

   /**
   * Get multiVersion
   * @return multiVersion
  **/
  @javax.annotation.Nullable
  public Boolean getMultiVersion() {
    return multiVersion;
  }

  public void setMultiVersion(Boolean multiVersion) {
    this.multiVersion = multiVersion;
  }


  public Reportsv3Category versions(List<Reportsv3CategoryVersion> versions) {
    this.versions = versions;
    return this;
  }

  public Reportsv3Category addVersionsItem(Reportsv3CategoryVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @javax.annotation.Nullable
  public List<Reportsv3CategoryVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<Reportsv3CategoryVersion> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3Category reportsv3Category = (Reportsv3Category) o;
    return Objects.equals(this.categoryDescription, reportsv3Category.categoryDescription) &&
        Objects.equals(this.categoryId, reportsv3Category.categoryId) &&
        Objects.equals(this.categoryName, reportsv3Category.categoryName) &&
        Objects.equals(this.multiVersion, reportsv3Category.multiVersion) &&
        Objects.equals(this.versions, reportsv3Category.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryDescription, categoryId, categoryName, multiVersion, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3Category {\n");
    sb.append("    categoryDescription: ").append(toIndentedString(categoryDescription)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    multiVersion: ").append(toIndentedString(multiVersion)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("category_description");
    openapiFields.add("category_id");
    openapiFields.add("category_name");
    openapiFields.add("multi_version");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3Category
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3Category.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3Category is not found in the empty JSON string", Reportsv3Category.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3Category.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3Category` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("category_description") != null && !jsonObj.get("category_description").isJsonNull()) && !jsonObj.get("category_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_description").toString()));
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if ((jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonNull()) && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      if (jsonObj.get("versions") != null && !jsonObj.get("versions").isJsonNull()) {
        JsonArray jsonArrayversions = jsonObj.getAsJsonArray("versions");
        if (jsonArrayversions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("versions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
          }

          // validate the optional field `versions` (array)
          for (int i = 0; i < jsonArrayversions.size(); i++) {
            Reportsv3CategoryVersion.validateJsonElement(jsonArrayversions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3Category.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3Category' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3Category> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3Category.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3Category>() {
           @Override
           public void write(JsonWriter out, Reportsv3Category value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3Category read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3Category given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3Category
  * @throws IOException if the JSON string is invalid with respect to Reportsv3Category
  */
  public static Reportsv3Category fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3Category.class);
  }

 /**
  * Convert an instance of Reportsv3Category to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

