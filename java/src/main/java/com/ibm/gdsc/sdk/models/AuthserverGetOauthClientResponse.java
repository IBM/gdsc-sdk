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
import com.ibm.gdsc.sdk.models.AuthserverOauthClient;
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
 * Response parameters for get oauth client by clientId.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class AuthserverGetOauthClientResponse {
  public static final String SERIALIZED_NAME_OAUTH_CLIENT = "oauth_client";
  @SerializedName(SERIALIZED_NAME_OAUTH_CLIENT)
  private AuthserverOauthClient oauthClient;

  public AuthserverGetOauthClientResponse() {
  }

  public AuthserverGetOauthClientResponse oauthClient(AuthserverOauthClient oauthClient) {
    this.oauthClient = oauthClient;
    return this;
  }

   /**
   * Get oauthClient
   * @return oauthClient
  **/
  @javax.annotation.Nullable
  public AuthserverOauthClient getOauthClient() {
    return oauthClient;
  }

  public void setOauthClient(AuthserverOauthClient oauthClient) {
    this.oauthClient = oauthClient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthserverGetOauthClientResponse authserverGetOauthClientResponse = (AuthserverGetOauthClientResponse) o;
    return Objects.equals(this.oauthClient, authserverGetOauthClientResponse.oauthClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthserverGetOauthClientResponse {\n");
    sb.append("    oauthClient: ").append(toIndentedString(oauthClient)).append("\n");
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
    openapiFields.add("oauth_client");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthserverGetOauthClientResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthserverGetOauthClientResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthserverGetOauthClientResponse is not found in the empty JSON string", AuthserverGetOauthClientResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthserverGetOauthClientResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthserverGetOauthClientResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `oauth_client`
      if (jsonObj.get("oauth_client") != null && !jsonObj.get("oauth_client").isJsonNull()) {
        AuthserverOauthClient.validateJsonElement(jsonObj.get("oauth_client"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthserverGetOauthClientResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthserverGetOauthClientResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthserverGetOauthClientResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthserverGetOauthClientResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthserverGetOauthClientResponse>() {
           @Override
           public void write(JsonWriter out, AuthserverGetOauthClientResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthserverGetOauthClientResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthserverGetOauthClientResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthserverGetOauthClientResponse
  * @throws IOException if the JSON string is invalid with respect to AuthserverGetOauthClientResponse
  */
  public static AuthserverGetOauthClientResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthserverGetOauthClientResponse.class);
  }

 /**
  * Convert an instance of AuthserverGetOauthClientResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

