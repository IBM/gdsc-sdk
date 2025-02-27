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
import com.ibm.security.guardium.Featureflagsv3FeatureFlagValue;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Featureflagsv3GetFeatureFlagsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Featureflagsv3GetFeatureFlagsResponse {
  public static final String SERIALIZED_NAME_FEATURE_FLAGS = "feature_flags";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAGS)
  private Map<String, Featureflagsv3FeatureFlagValue> featureFlags = new HashMap<>();

  public Featureflagsv3GetFeatureFlagsResponse() {
  }

  public Featureflagsv3GetFeatureFlagsResponse featureFlags(Map<String, Featureflagsv3FeatureFlagValue> featureFlags) {
    this.featureFlags = featureFlags;
    return this;
  }

  public Featureflagsv3GetFeatureFlagsResponse putFeatureFlagsItem(String key, Featureflagsv3FeatureFlagValue featureFlagsItem) {
    if (this.featureFlags == null) {
      this.featureFlags = new HashMap<>();
    }
    this.featureFlags.put(key, featureFlagsItem);
    return this;
  }

   /**
   * Get featureFlags
   * @return featureFlags
  **/
  @javax.annotation.Nullable
  public Map<String, Featureflagsv3FeatureFlagValue> getFeatureFlags() {
    return featureFlags;
  }

  public void setFeatureFlags(Map<String, Featureflagsv3FeatureFlagValue> featureFlags) {
    this.featureFlags = featureFlags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Featureflagsv3GetFeatureFlagsResponse featureflagsv3GetFeatureFlagsResponse = (Featureflagsv3GetFeatureFlagsResponse) o;
    return Objects.equals(this.featureFlags, featureflagsv3GetFeatureFlagsResponse.featureFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Featureflagsv3GetFeatureFlagsResponse {\n");
    sb.append("    featureFlags: ").append(toIndentedString(featureFlags)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Featureflagsv3GetFeatureFlagsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Featureflagsv3GetFeatureFlagsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Featureflagsv3GetFeatureFlagsResponse is not found in the empty JSON string", Featureflagsv3GetFeatureFlagsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Featureflagsv3GetFeatureFlagsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Featureflagsv3GetFeatureFlagsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Featureflagsv3GetFeatureFlagsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Featureflagsv3GetFeatureFlagsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Featureflagsv3GetFeatureFlagsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Featureflagsv3GetFeatureFlagsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Featureflagsv3GetFeatureFlagsResponse>() {
           @Override
           public void write(JsonWriter out, Featureflagsv3GetFeatureFlagsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Featureflagsv3GetFeatureFlagsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Featureflagsv3GetFeatureFlagsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Featureflagsv3GetFeatureFlagsResponse
  * @throws IOException if the JSON string is invalid with respect to Featureflagsv3GetFeatureFlagsResponse
  */
  public static Featureflagsv3GetFeatureFlagsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Featureflagsv3GetFeatureFlagsResponse.class);
  }

 /**
  * Convert an instance of Featureflagsv3GetFeatureFlagsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

