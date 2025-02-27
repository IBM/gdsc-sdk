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
import com.ibm.security.guardium.Reportsv3JoinDefinition;
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
 * UpdateJoinRequest is the argument type used to update a custom join.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3UpdateJoinRequest {
  public static final String SERIALIZED_NAME_JOIN_DEF = "join_def";
  @SerializedName(SERIALIZED_NAME_JOIN_DEF)
  private Reportsv3JoinDefinition joinDef;

  public static final String SERIALIZED_NAME_JOIN_ID = "join_id";
  @SerializedName(SERIALIZED_NAME_JOIN_ID)
  private String joinId;

  public Reportsv3UpdateJoinRequest() {
  }

  public Reportsv3UpdateJoinRequest joinDef(Reportsv3JoinDefinition joinDef) {
    this.joinDef = joinDef;
    return this;
  }

   /**
   * Get joinDef
   * @return joinDef
  **/
  @javax.annotation.Nullable
  public Reportsv3JoinDefinition getJoinDef() {
    return joinDef;
  }

  public void setJoinDef(Reportsv3JoinDefinition joinDef) {
    this.joinDef = joinDef;
  }


  public Reportsv3UpdateJoinRequest joinId(String joinId) {
    this.joinId = joinId;
    return this;
  }

   /**
   * Unique join ID.
   * @return joinId
  **/
  @javax.annotation.Nullable
  public String getJoinId() {
    return joinId;
  }

  public void setJoinId(String joinId) {
    this.joinId = joinId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3UpdateJoinRequest reportsv3UpdateJoinRequest = (Reportsv3UpdateJoinRequest) o;
    return Objects.equals(this.joinDef, reportsv3UpdateJoinRequest.joinDef) &&
        Objects.equals(this.joinId, reportsv3UpdateJoinRequest.joinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinDef, joinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3UpdateJoinRequest {\n");
    sb.append("    joinDef: ").append(toIndentedString(joinDef)).append("\n");
    sb.append("    joinId: ").append(toIndentedString(joinId)).append("\n");
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
    openapiFields.add("join_def");
    openapiFields.add("join_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3UpdateJoinRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3UpdateJoinRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3UpdateJoinRequest is not found in the empty JSON string", Reportsv3UpdateJoinRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3UpdateJoinRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3UpdateJoinRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `join_def`
      if (jsonObj.get("join_def") != null && !jsonObj.get("join_def").isJsonNull()) {
        Reportsv3JoinDefinition.validateJsonElement(jsonObj.get("join_def"));
      }
      if ((jsonObj.get("join_id") != null && !jsonObj.get("join_id").isJsonNull()) && !jsonObj.get("join_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `join_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("join_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3UpdateJoinRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3UpdateJoinRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3UpdateJoinRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3UpdateJoinRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3UpdateJoinRequest>() {
           @Override
           public void write(JsonWriter out, Reportsv3UpdateJoinRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3UpdateJoinRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3UpdateJoinRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3UpdateJoinRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsv3UpdateJoinRequest
  */
  public static Reportsv3UpdateJoinRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3UpdateJoinRequest.class);
  }

 /**
  * Convert an instance of Reportsv3UpdateJoinRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

