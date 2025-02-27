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
import com.ibm.security.guardium.Assetsv3Tag;
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
 * Assetsv3SaveTagConceptDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3SaveTagConceptDataRequest {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private Assetsv3Tag tag;

  public Assetsv3SaveTagConceptDataRequest() {
  }

  public Assetsv3SaveTagConceptDataRequest tag(Assetsv3Tag tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  public Assetsv3Tag getTag() {
    return tag;
  }

  public void setTag(Assetsv3Tag tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3SaveTagConceptDataRequest assetsv3SaveTagConceptDataRequest = (Assetsv3SaveTagConceptDataRequest) o;
    return Objects.equals(this.tag, assetsv3SaveTagConceptDataRequest.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3SaveTagConceptDataRequest {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3SaveTagConceptDataRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3SaveTagConceptDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3SaveTagConceptDataRequest is not found in the empty JSON string", Assetsv3SaveTagConceptDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3SaveTagConceptDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3SaveTagConceptDataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        Assetsv3Tag.validateJsonElement(jsonObj.get("tag"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3SaveTagConceptDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3SaveTagConceptDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3SaveTagConceptDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3SaveTagConceptDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3SaveTagConceptDataRequest>() {
           @Override
           public void write(JsonWriter out, Assetsv3SaveTagConceptDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3SaveTagConceptDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3SaveTagConceptDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3SaveTagConceptDataRequest
  * @throws IOException if the JSON string is invalid with respect to Assetsv3SaveTagConceptDataRequest
  */
  public static Assetsv3SaveTagConceptDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3SaveTagConceptDataRequest.class);
  }

 /**
  * Convert an instance of Assetsv3SaveTagConceptDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

