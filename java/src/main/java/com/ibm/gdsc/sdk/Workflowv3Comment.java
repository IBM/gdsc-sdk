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
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.ibm.gdsc.JSON;

/**
 * Case or task read-only comment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3Comment {
  public static final String SERIALIZED_NAME_WHAT = "what";
  @SerializedName(SERIALIZED_NAME_WHAT)
  private String what;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private OffsetDateTime when;

  public static final String SERIALIZED_NAME_WHO = "who";
  @SerializedName(SERIALIZED_NAME_WHO)
  private String who;

  public Workflowv3Comment() {
  }

  public Workflowv3Comment what(String what) {
    this.what = what;
    return this;
  }

   /**
   * Text of the comment.
   * @return what
  **/
  @javax.annotation.Nullable
  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }


  public Workflowv3Comment when(OffsetDateTime when) {
    this.when = when;
    return this;
  }

   /**
   * Timestamp when the comment happened.
   * @return when
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getWhen() {
    return when;
  }

  public void setWhen(OffsetDateTime when) {
    this.when = when;
  }


  public Workflowv3Comment who(String who) {
    this.who = who;
    return this;
  }

   /**
   * User ID who created the comment.
   * @return who
  **/
  @javax.annotation.Nullable
  public String getWho() {
    return who;
  }

  public void setWho(String who) {
    this.who = who;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3Comment workflowv3Comment = (Workflowv3Comment) o;
    return Objects.equals(this.what, workflowv3Comment.what) &&
        Objects.equals(this.when, workflowv3Comment.when) &&
        Objects.equals(this.who, workflowv3Comment.who);
  }

  @Override
  public int hashCode() {
    return Objects.hash(what, when, who);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3Comment {\n");
    sb.append("    what: ").append(toIndentedString(what)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    who: ").append(toIndentedString(who)).append("\n");
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
    openapiFields.add("what");
    openapiFields.add("when");
    openapiFields.add("who");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3Comment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3Comment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3Comment is not found in the empty JSON string", Workflowv3Comment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3Comment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3Comment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("what") != null && !jsonObj.get("what").isJsonNull()) && !jsonObj.get("what").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `what` to be a primitive type in the JSON string but got `%s`", jsonObj.get("what").toString()));
      }
      if ((jsonObj.get("who") != null && !jsonObj.get("who").isJsonNull()) && !jsonObj.get("who").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `who` to be a primitive type in the JSON string but got `%s`", jsonObj.get("who").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3Comment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3Comment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3Comment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3Comment.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3Comment>() {
           @Override
           public void write(JsonWriter out, Workflowv3Comment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3Comment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3Comment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3Comment
  * @throws IOException if the JSON string is invalid with respect to Workflowv3Comment
  */
  public static Workflowv3Comment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3Comment.class);
  }

 /**
  * Convert an instance of Workflowv3Comment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

