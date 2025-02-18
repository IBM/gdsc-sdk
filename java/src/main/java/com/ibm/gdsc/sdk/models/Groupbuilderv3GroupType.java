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
 * GroupType provides information about available group types.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3GroupType {
  public static final String SERIALIZED_NAME_GROUP_TYPE_ID = "group_type_id";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE_ID)
  private Integer groupTypeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TUPLE_COUNT = "tuple_count";
  @SerializedName(SERIALIZED_NAME_TUPLE_COUNT)
  private Integer tupleCount;

  public static final String SERIALIZED_NAME_TUPLE_PARAMS = "tuple_params";
  @SerializedName(SERIALIZED_NAME_TUPLE_PARAMS)
  private List<String> tupleParams = new ArrayList<>();

  public Groupbuilderv3GroupType() {
  }

  public Groupbuilderv3GroupType groupTypeId(Integer groupTypeId) {
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


  public Groupbuilderv3GroupType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group type name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Groupbuilderv3GroupType tupleCount(Integer tupleCount) {
    this.tupleCount = tupleCount;
    return this;
  }

   /**
   * Type tuples count.
   * @return tupleCount
  **/
  @javax.annotation.Nullable
  public Integer getTupleCount() {
    return tupleCount;
  }

  public void setTupleCount(Integer tupleCount) {
    this.tupleCount = tupleCount;
  }


  public Groupbuilderv3GroupType tupleParams(List<String> tupleParams) {
    this.tupleParams = tupleParams;
    return this;
  }

  public Groupbuilderv3GroupType addTupleParamsItem(String tupleParamsItem) {
    if (this.tupleParams == null) {
      this.tupleParams = new ArrayList<>();
    }
    this.tupleParams.add(tupleParamsItem);
    return this;
  }

   /**
   * Tuple parameters.
   * @return tupleParams
  **/
  @javax.annotation.Nullable
  public List<String> getTupleParams() {
    return tupleParams;
  }

  public void setTupleParams(List<String> tupleParams) {
    this.tupleParams = tupleParams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groupbuilderv3GroupType groupbuilderv3GroupType = (Groupbuilderv3GroupType) o;
    return Objects.equals(this.groupTypeId, groupbuilderv3GroupType.groupTypeId) &&
        Objects.equals(this.name, groupbuilderv3GroupType.name) &&
        Objects.equals(this.tupleCount, groupbuilderv3GroupType.tupleCount) &&
        Objects.equals(this.tupleParams, groupbuilderv3GroupType.tupleParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupTypeId, name, tupleCount, tupleParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3GroupType {\n");
    sb.append("    groupTypeId: ").append(toIndentedString(groupTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tupleCount: ").append(toIndentedString(tupleCount)).append("\n");
    sb.append("    tupleParams: ").append(toIndentedString(tupleParams)).append("\n");
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
    openapiFields.add("group_type_id");
    openapiFields.add("name");
    openapiFields.add("tuple_count");
    openapiFields.add("tuple_params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3GroupType
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3GroupType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3GroupType is not found in the empty JSON string", Groupbuilderv3GroupType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3GroupType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3GroupType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tuple_params") != null && !jsonObj.get("tuple_params").isJsonNull() && !jsonObj.get("tuple_params").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tuple_params` to be an array in the JSON string but got `%s`", jsonObj.get("tuple_params").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3GroupType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3GroupType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3GroupType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3GroupType.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3GroupType>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3GroupType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3GroupType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3GroupType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3GroupType
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3GroupType
  */
  public static Groupbuilderv3GroupType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3GroupType.class);
  }

 /**
  * Convert an instance of Groupbuilderv3GroupType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

