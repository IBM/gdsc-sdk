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
 * CreateApiKeyResponse API Key creation response format.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3CreateApiKeyResponse {
  public static final String SERIALIZED_NAME_APIKEY = "apikey";
  @SerializedName(SERIALIZED_NAME_APIKEY)
  private String apikey;

  public static final String SERIALIZED_NAME_ENCODED = "encoded";
  @SerializedName(SERIALIZED_NAME_ENCODED)
  private String encoded;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public Tenantuserv3CreateApiKeyResponse() {
  }

  public Tenantuserv3CreateApiKeyResponse apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Apikey.
   * @return apikey
  **/
  @javax.annotation.Nullable
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }


  public Tenantuserv3CreateApiKeyResponse encoded(String encoded) {
    this.encoded = encoded;
    return this;
  }

   /**
   * Encoded apikey.
   * @return encoded
  **/
  @javax.annotation.Nullable
  public String getEncoded() {
    return encoded;
  }

  public void setEncoded(String encoded) {
    this.encoded = encoded;
  }


  public Tenantuserv3CreateApiKeyResponse secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Apikey secret.
   * @return secret
  **/
  @javax.annotation.Nullable
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenantuserv3CreateApiKeyResponse tenantuserv3CreateApiKeyResponse = (Tenantuserv3CreateApiKeyResponse) o;
    return Objects.equals(this.apikey, tenantuserv3CreateApiKeyResponse.apikey) &&
        Objects.equals(this.encoded, tenantuserv3CreateApiKeyResponse.encoded) &&
        Objects.equals(this.secret, tenantuserv3CreateApiKeyResponse.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apikey, encoded, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3CreateApiKeyResponse {\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    encoded: ").append(toIndentedString(encoded)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
    openapiFields.add("apikey");
    openapiFields.add("encoded");
    openapiFields.add("secret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3CreateApiKeyResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3CreateApiKeyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3CreateApiKeyResponse is not found in the empty JSON string", Tenantuserv3CreateApiKeyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3CreateApiKeyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3CreateApiKeyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apikey") != null && !jsonObj.get("apikey").isJsonNull()) && !jsonObj.get("apikey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apikey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apikey").toString()));
      }
      if ((jsonObj.get("encoded") != null && !jsonObj.get("encoded").isJsonNull()) && !jsonObj.get("encoded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoded").toString()));
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3CreateApiKeyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3CreateApiKeyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3CreateApiKeyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3CreateApiKeyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3CreateApiKeyResponse>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3CreateApiKeyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3CreateApiKeyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3CreateApiKeyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3CreateApiKeyResponse
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3CreateApiKeyResponse
  */
  public static Tenantuserv3CreateApiKeyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3CreateApiKeyResponse.class);
  }

 /**
  * Convert an instance of Tenantuserv3CreateApiKeyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

