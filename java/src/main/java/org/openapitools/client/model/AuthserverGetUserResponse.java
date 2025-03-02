/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Featureflagsv3FeatureFlagValue;
import org.openapitools.client.model.Tenantuserv3FullUser;

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

import org.openapitools.client.JSON;

/**
 * Response parameters for get privillage.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class AuthserverGetUserResponse {
  public static final String SERIALIZED_NAME_FEATURE_FLAGS = "feature_flags";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAGS)
  private Map<String, Featureflagsv3FeatureFlagValue> featureFlags = new HashMap<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Tenantuserv3FullUser user;

  public AuthserverGetUserResponse() {
  }

  public AuthserverGetUserResponse featureFlags(Map<String, Featureflagsv3FeatureFlagValue> featureFlags) {
    this.featureFlags = featureFlags;
    return this;
  }

  public AuthserverGetUserResponse putFeatureFlagsItem(String key, Featureflagsv3FeatureFlagValue featureFlagsItem) {
    if (this.featureFlags == null) {
      this.featureFlags = new HashMap<>();
    }
    this.featureFlags.put(key, featureFlagsItem);
    return this;
  }

   /**
   * Feature flags map.
   * @return featureFlags
  **/
  @javax.annotation.Nullable
  public Map<String, Featureflagsv3FeatureFlagValue> getFeatureFlags() {
    return featureFlags;
  }

  public void setFeatureFlags(Map<String, Featureflagsv3FeatureFlagValue> featureFlags) {
    this.featureFlags = featureFlags;
  }


  public AuthserverGetUserResponse user(Tenantuserv3FullUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public Tenantuserv3FullUser getUser() {
    return user;
  }

  public void setUser(Tenantuserv3FullUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthserverGetUserResponse authserverGetUserResponse = (AuthserverGetUserResponse) o;
    return Objects.equals(this.featureFlags, authserverGetUserResponse.featureFlags) &&
        Objects.equals(this.user, authserverGetUserResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureFlags, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthserverGetUserResponse {\n");
    sb.append("    featureFlags: ").append(toIndentedString(featureFlags)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("feature_flags");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthserverGetUserResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthserverGetUserResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthserverGetUserResponse is not found in the empty JSON string", AuthserverGetUserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthserverGetUserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthserverGetUserResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        Tenantuserv3FullUser.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthserverGetUserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthserverGetUserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthserverGetUserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthserverGetUserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthserverGetUserResponse>() {
           @Override
           public void write(JsonWriter out, AuthserverGetUserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthserverGetUserResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthserverGetUserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthserverGetUserResponse
  * @throws IOException if the JSON string is invalid with respect to AuthserverGetUserResponse
  */
  public static AuthserverGetUserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthserverGetUserResponse.class);
  }

 /**
  * Convert an instance of AuthserverGetUserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

