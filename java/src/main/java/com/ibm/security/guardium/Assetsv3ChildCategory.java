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
import java.io.IOException;
import java.util.Arrays;

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
 * ChildCategory - Child Category Data of Sub Category for Manage Asset Filter Panel.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3ChildCategory {
  public static final String SERIALIZED_NAME_CHILD_ID = "child_id";
  @SerializedName(SERIALIZED_NAME_CHILD_ID)
  private String childId;

  public static final String SERIALIZED_NAME_CHILD_NAME = "child_name";
  @SerializedName(SERIALIZED_NAME_CHILD_NAME)
  private String childName;

  public Assetsv3ChildCategory() {
  }

  public Assetsv3ChildCategory childId(String childId) {
    this.childId = childId;
    return this;
  }

   /**
   * Get childId
   * @return childId
  **/
  @javax.annotation.Nullable
  public String getChildId() {
    return childId;
  }

  public void setChildId(String childId) {
    this.childId = childId;
  }


  public Assetsv3ChildCategory childName(String childName) {
    this.childName = childName;
    return this;
  }

   /**
   * Get childName
   * @return childName
  **/
  @javax.annotation.Nullable
  public String getChildName() {
    return childName;
  }

  public void setChildName(String childName) {
    this.childName = childName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3ChildCategory assetsv3ChildCategory = (Assetsv3ChildCategory) o;
    return Objects.equals(this.childId, assetsv3ChildCategory.childId) &&
        Objects.equals(this.childName, assetsv3ChildCategory.childName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childId, childName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3ChildCategory {\n");
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    childName: ").append(toIndentedString(childName)).append("\n");
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
    openapiFields.add("child_id");
    openapiFields.add("child_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3ChildCategory
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3ChildCategory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3ChildCategory is not found in the empty JSON string", Assetsv3ChildCategory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3ChildCategory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3ChildCategory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("child_id") != null && !jsonObj.get("child_id").isJsonNull()) && !jsonObj.get("child_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_id").toString()));
      }
      if ((jsonObj.get("child_name") != null && !jsonObj.get("child_name").isJsonNull()) && !jsonObj.get("child_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3ChildCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3ChildCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3ChildCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3ChildCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3ChildCategory>() {
           @Override
           public void write(JsonWriter out, Assetsv3ChildCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3ChildCategory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3ChildCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3ChildCategory
  * @throws IOException if the JSON string is invalid with respect to Assetsv3ChildCategory
  */
  public static Assetsv3ChildCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3ChildCategory.class);
  }

 /**
  * Convert an instance of Assetsv3ChildCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

