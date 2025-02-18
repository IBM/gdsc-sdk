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

import com.ibm.gdsc.sdk.JSON;

/**
 * CreateGroupRequest requests creation of a new group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3CreateGroupRequest {
  public static final String SERIALIZED_NAME_COPY_GROUP_ID = "copy_group_id";
  @SerializedName(SERIALIZED_NAME_COPY_GROUP_ID)
  private Integer copyGroupId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUP_TYPE_ID = "group_type_id";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE_ID)
  private Integer groupTypeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NESTED = "nested";
  @SerializedName(SERIALIZED_NAME_NESTED)
  private Boolean nested;

  public Groupbuilderv3CreateGroupRequest() {
  }

  public Groupbuilderv3CreateGroupRequest copyGroupId(Integer copyGroupId) {
    this.copyGroupId = copyGroupId;
    return this;
  }

   /**
   * Group ID to copy.
   * @return copyGroupId
  **/
  @javax.annotation.Nullable
  public Integer getCopyGroupId() {
    return copyGroupId;
  }

  public void setCopyGroupId(Integer copyGroupId) {
    this.copyGroupId = copyGroupId;
  }


  public Groupbuilderv3CreateGroupRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Group description.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Groupbuilderv3CreateGroupRequest groupTypeId(Integer groupTypeId) {
    this.groupTypeId = groupTypeId;
    return this;
  }

   /**
   * Group type ID.
   * @return groupTypeId
  **/
  @javax.annotation.Nullable
  public Integer getGroupTypeId() {
    return groupTypeId;
  }

  public void setGroupTypeId(Integer groupTypeId) {
    this.groupTypeId = groupTypeId;
  }


  public Groupbuilderv3CreateGroupRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Groupbuilderv3CreateGroupRequest nested(Boolean nested) {
    this.nested = nested;
    return this;
  }

   /**
   * Nested (hierarchical).
   * @return nested
  **/
  @javax.annotation.Nullable
  public Boolean getNested() {
    return nested;
  }

  public void setNested(Boolean nested) {
    this.nested = nested;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groupbuilderv3CreateGroupRequest groupbuilderv3CreateGroupRequest = (Groupbuilderv3CreateGroupRequest) o;
    return Objects.equals(this.copyGroupId, groupbuilderv3CreateGroupRequest.copyGroupId) &&
        Objects.equals(this.description, groupbuilderv3CreateGroupRequest.description) &&
        Objects.equals(this.groupTypeId, groupbuilderv3CreateGroupRequest.groupTypeId) &&
        Objects.equals(this.name, groupbuilderv3CreateGroupRequest.name) &&
        Objects.equals(this.nested, groupbuilderv3CreateGroupRequest.nested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyGroupId, description, groupTypeId, name, nested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3CreateGroupRequest {\n");
    sb.append("    copyGroupId: ").append(toIndentedString(copyGroupId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupTypeId: ").append(toIndentedString(groupTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nested: ").append(toIndentedString(nested)).append("\n");
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
    openapiFields.add("copy_group_id");
    openapiFields.add("description");
    openapiFields.add("group_type_id");
    openapiFields.add("name");
    openapiFields.add("nested");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3CreateGroupRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3CreateGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3CreateGroupRequest is not found in the empty JSON string", Groupbuilderv3CreateGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3CreateGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3CreateGroupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3CreateGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3CreateGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3CreateGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3CreateGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3CreateGroupRequest>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3CreateGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3CreateGroupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3CreateGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3CreateGroupRequest
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3CreateGroupRequest
  */
  public static Groupbuilderv3CreateGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3CreateGroupRequest.class);
  }

 /**
  * Convert an instance of Groupbuilderv3CreateGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

