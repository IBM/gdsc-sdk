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
import java.math.BigDecimal;
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
 * Authenticate200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Authenticate200Response {
  public static final String SERIALIZED_NAME_ID_TOKEN = "idToken";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN)
  private String idToken;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private BigDecimal expiresIn;

  public Authenticate200Response() {
  }

  public Authenticate200Response idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

   /**
   * Use this token for future API calls.
   * @return idToken
  **/
  @javax.annotation.Nonnull
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }


  public Authenticate200Response refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @javax.annotation.Nonnull
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public Authenticate200Response expiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Time of token expiry.
   * @return expiresIn
  **/
  @javax.annotation.Nonnull
  public BigDecimal getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authenticate200Response authenticate200Response = (Authenticate200Response) o;
    return Objects.equals(this.idToken, authenticate200Response.idToken) &&
        Objects.equals(this.refreshToken, authenticate200Response.refreshToken) &&
        Objects.equals(this.expiresIn, authenticate200Response.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idToken, refreshToken, expiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authenticate200Response {\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
    openapiFields.add("idToken");
    openapiFields.add("refreshToken");
    openapiFields.add("expiresIn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("idToken");
    openapiRequiredFields.add("refreshToken");
    openapiRequiredFields.add("expiresIn");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Authenticate200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Authenticate200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Authenticate200Response is not found in the empty JSON string", Authenticate200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Authenticate200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Authenticate200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Authenticate200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("idToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idToken").toString()));
      }
      if (!jsonObj.get("refreshToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refreshToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refreshToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Authenticate200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Authenticate200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Authenticate200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Authenticate200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Authenticate200Response>() {
           @Override
           public void write(JsonWriter out, Authenticate200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Authenticate200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Authenticate200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Authenticate200Response
  * @throws IOException if the JSON string is invalid with respect to Authenticate200Response
  */
  public static Authenticate200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Authenticate200Response.class);
  }

 /**
  * Convert an instance of Authenticate200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

