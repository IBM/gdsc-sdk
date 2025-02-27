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
import com.ibm.security.guardium.Assetsv3Attributes;
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
 * MappedEntities - Entity details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3MappedEntities {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Assetsv3Attributes attributes;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<Assetsv3MappedEntities> children = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_CHILD_COUNT = "parent_child_count";
  @SerializedName(SERIALIZED_NAME_PARENT_CHILD_COUNT)
  private String parentChildCount;

  public static final String SERIALIZED_NAME_SEARCH_TERM = "search_term";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERM)
  private String searchTerm;

  public Assetsv3MappedEntities() {
  }

  public Assetsv3MappedEntities attributes(Assetsv3Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public Assetsv3Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Assetsv3Attributes attributes) {
    this.attributes = attributes;
  }


  public Assetsv3MappedEntities children(List<Assetsv3MappedEntities> children) {
    this.children = children;
    return this;
  }

  public Assetsv3MappedEntities addChildrenItem(Assetsv3MappedEntities childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  public List<Assetsv3MappedEntities> getChildren() {
    return children;
  }

  public void setChildren(List<Assetsv3MappedEntities> children) {
    this.children = children;
  }


  public Assetsv3MappedEntities name(String name) {
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


  public Assetsv3MappedEntities parentChildCount(String parentChildCount) {
    this.parentChildCount = parentChildCount;
    return this;
  }

   /**
   * Get parentChildCount
   * @return parentChildCount
  **/
  @javax.annotation.Nullable
  public String getParentChildCount() {
    return parentChildCount;
  }

  public void setParentChildCount(String parentChildCount) {
    this.parentChildCount = parentChildCount;
  }


  public Assetsv3MappedEntities searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }

   /**
   * Get searchTerm
   * @return searchTerm
  **/
  @javax.annotation.Nullable
  public String getSearchTerm() {
    return searchTerm;
  }

  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3MappedEntities assetsv3MappedEntities = (Assetsv3MappedEntities) o;
    return Objects.equals(this.attributes, assetsv3MappedEntities.attributes) &&
        Objects.equals(this.children, assetsv3MappedEntities.children) &&
        Objects.equals(this.name, assetsv3MappedEntities.name) &&
        Objects.equals(this.parentChildCount, assetsv3MappedEntities.parentChildCount) &&
        Objects.equals(this.searchTerm, assetsv3MappedEntities.searchTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, children, name, parentChildCount, searchTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3MappedEntities {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentChildCount: ").append(toIndentedString(parentChildCount)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("children");
    openapiFields.add("name");
    openapiFields.add("parent_child_count");
    openapiFields.add("search_term");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3MappedEntities
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3MappedEntities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3MappedEntities is not found in the empty JSON string", Assetsv3MappedEntities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3MappedEntities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3MappedEntities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `attributes`
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        Assetsv3Attributes.validateJsonElement(jsonObj.get("attributes"));
      }
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonNull()) {
        JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
        if (jsonArraychildren != null) {
          // ensure the json data is an array
          if (!jsonObj.get("children").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
          }

          // validate the optional field `children` (array)
          for (int i = 0; i < jsonArraychildren.size(); i++) {
            Assetsv3MappedEntities.validateJsonElement(jsonArraychildren.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("parent_child_count") != null && !jsonObj.get("parent_child_count").isJsonNull()) && !jsonObj.get("parent_child_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_child_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_child_count").toString()));
      }
      if ((jsonObj.get("search_term") != null && !jsonObj.get("search_term").isJsonNull()) && !jsonObj.get("search_term").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_term` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_term").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3MappedEntities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3MappedEntities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3MappedEntities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3MappedEntities.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3MappedEntities>() {
           @Override
           public void write(JsonWriter out, Assetsv3MappedEntities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3MappedEntities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3MappedEntities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3MappedEntities
  * @throws IOException if the JSON string is invalid with respect to Assetsv3MappedEntities
  */
  public static Assetsv3MappedEntities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3MappedEntities.class);
  }

 /**
  * Convert an instance of Assetsv3MappedEntities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

