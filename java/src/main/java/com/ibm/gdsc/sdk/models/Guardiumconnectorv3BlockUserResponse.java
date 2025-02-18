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
 * Returns the response of the block user action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3BlockUserResponse {
  public static final String SERIALIZED_NAME_BLOCK_RESULT = "block_result";
  @SerializedName(SERIALIZED_NAME_BLOCK_RESULT)
  private Boolean blockResult;

  public static final String SERIALIZED_NAME_ERR = "err";
  @SerializedName(SERIALIZED_NAME_ERR)
  private String err;

  public Guardiumconnectorv3BlockUserResponse() {
  }

  public Guardiumconnectorv3BlockUserResponse blockResult(Boolean blockResult) {
    this.blockResult = blockResult;
    return this;
  }

   /**
   * Result of block action.
   * @return blockResult
  **/
  @javax.annotation.Nullable
  public Boolean getBlockResult() {
    return blockResult;
  }

  public void setBlockResult(Boolean blockResult) {
    this.blockResult = blockResult;
  }


  public Guardiumconnectorv3BlockUserResponse err(String err) {
    this.err = err;
    return this;
  }

   /**
   * Error message.
   * @return err
  **/
  @javax.annotation.Nullable
  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3BlockUserResponse guardiumconnectorv3BlockUserResponse = (Guardiumconnectorv3BlockUserResponse) o;
    return Objects.equals(this.blockResult, guardiumconnectorv3BlockUserResponse.blockResult) &&
        Objects.equals(this.err, guardiumconnectorv3BlockUserResponse.err);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockResult, err);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3BlockUserResponse {\n");
    sb.append("    blockResult: ").append(toIndentedString(blockResult)).append("\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
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
    openapiFields.add("block_result");
    openapiFields.add("err");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3BlockUserResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3BlockUserResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3BlockUserResponse is not found in the empty JSON string", Guardiumconnectorv3BlockUserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3BlockUserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3BlockUserResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("err") != null && !jsonObj.get("err").isJsonNull()) && !jsonObj.get("err").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `err` to be a primitive type in the JSON string but got `%s`", jsonObj.get("err").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3BlockUserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3BlockUserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3BlockUserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3BlockUserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3BlockUserResponse>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3BlockUserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3BlockUserResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3BlockUserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3BlockUserResponse
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3BlockUserResponse
  */
  public static Guardiumconnectorv3BlockUserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3BlockUserResponse.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3BlockUserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

