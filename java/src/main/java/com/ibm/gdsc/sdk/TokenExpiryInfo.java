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
 * TokenExpiryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class TokenExpiryInfo {
  public static final String SERIALIZED_NAME_TOKEN_EXPIRY_DAYS = "tokenExpiryDays";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRY_DAYS)
  private BigDecimal tokenExpiryDays;

  public static final String SERIALIZED_NAME_TOKEN_EXPIRY_TIMESTAMP = "tokenExpiryTimestamp";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRY_TIMESTAMP)
  private BigDecimal tokenExpiryTimestamp;

  public static final String SERIALIZED_NAME_AUTH_URL = "authUrl";
  @SerializedName(SERIALIZED_NAME_AUTH_URL)
  private String authUrl;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public TokenExpiryInfo() {
  }

  public TokenExpiryInfo tokenExpiryDays(BigDecimal tokenExpiryDays) {
    this.tokenExpiryDays = tokenExpiryDays;
    return this;
  }

   /**
   * Get tokenExpiryDays
   * @return tokenExpiryDays
  **/
  @javax.annotation.Nullable
  public BigDecimal getTokenExpiryDays() {
    return tokenExpiryDays;
  }

  public void setTokenExpiryDays(BigDecimal tokenExpiryDays) {
    this.tokenExpiryDays = tokenExpiryDays;
  }


  public TokenExpiryInfo tokenExpiryTimestamp(BigDecimal tokenExpiryTimestamp) {
    this.tokenExpiryTimestamp = tokenExpiryTimestamp;
    return this;
  }

   /**
   * Get tokenExpiryTimestamp
   * @return tokenExpiryTimestamp
  **/
  @javax.annotation.Nullable
  public BigDecimal getTokenExpiryTimestamp() {
    return tokenExpiryTimestamp;
  }

  public void setTokenExpiryTimestamp(BigDecimal tokenExpiryTimestamp) {
    this.tokenExpiryTimestamp = tokenExpiryTimestamp;
  }


  public TokenExpiryInfo authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

   /**
   * Get authUrl
   * @return authUrl
  **/
  @javax.annotation.Nullable
  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public TokenExpiryInfo expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @javax.annotation.Nullable
  public Boolean getExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenExpiryInfo tokenExpiryInfo = (TokenExpiryInfo) o;
    return Objects.equals(this.tokenExpiryDays, tokenExpiryInfo.tokenExpiryDays) &&
        Objects.equals(this.tokenExpiryTimestamp, tokenExpiryInfo.tokenExpiryTimestamp) &&
        Objects.equals(this.authUrl, tokenExpiryInfo.authUrl) &&
        Objects.equals(this.expired, tokenExpiryInfo.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenExpiryDays, tokenExpiryTimestamp, authUrl, expired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenExpiryInfo {\n");
    sb.append("    tokenExpiryDays: ").append(toIndentedString(tokenExpiryDays)).append("\n");
    sb.append("    tokenExpiryTimestamp: ").append(toIndentedString(tokenExpiryTimestamp)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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
    openapiFields.add("tokenExpiryDays");
    openapiFields.add("tokenExpiryTimestamp");
    openapiFields.add("authUrl");
    openapiFields.add("expired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenExpiryInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenExpiryInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenExpiryInfo is not found in the empty JSON string", TokenExpiryInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenExpiryInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenExpiryInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authUrl") != null && !jsonObj.get("authUrl").isJsonNull()) && !jsonObj.get("authUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenExpiryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenExpiryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenExpiryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenExpiryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenExpiryInfo>() {
           @Override
           public void write(JsonWriter out, TokenExpiryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenExpiryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenExpiryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenExpiryInfo
  * @throws IOException if the JSON string is invalid with respect to TokenExpiryInfo
  */
  public static TokenExpiryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenExpiryInfo.class);
  }

 /**
  * Convert an instance of TokenExpiryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

