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
import com.ibm.security.guardium.Featureflagsv3FeatureFlag;
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
 * UpdateFeatureFlagOverridesRequest request body of update featureflag API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Featureflagsv3UpdateFeatureFlagOverridesRequest {
  public static final String SERIALIZED_NAME_FEATURE_FLAG = "feature_flag";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAG)
  private Featureflagsv3FeatureFlag featureFlag;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public Featureflagsv3UpdateFeatureFlagOverridesRequest() {
  }

  public Featureflagsv3UpdateFeatureFlagOverridesRequest featureFlag(Featureflagsv3FeatureFlag featureFlag) {
    this.featureFlag = featureFlag;
    return this;
  }

   /**
   * Get featureFlag
   * @return featureFlag
  **/
  @javax.annotation.Nullable
  public Featureflagsv3FeatureFlag getFeatureFlag() {
    return featureFlag;
  }

  public void setFeatureFlag(Featureflagsv3FeatureFlag featureFlag) {
    this.featureFlag = featureFlag;
  }


  public Featureflagsv3UpdateFeatureFlagOverridesRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Optional tenant id.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Featureflagsv3UpdateFeatureFlagOverridesRequest featureflagsv3UpdateFeatureFlagOverridesRequest = (Featureflagsv3UpdateFeatureFlagOverridesRequest) o;
    return Objects.equals(this.featureFlag, featureflagsv3UpdateFeatureFlagOverridesRequest.featureFlag) &&
        Objects.equals(this.tenantId, featureflagsv3UpdateFeatureFlagOverridesRequest.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureFlag, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Featureflagsv3UpdateFeatureFlagOverridesRequest {\n");
    sb.append("    featureFlag: ").append(toIndentedString(featureFlag)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("feature_flag");
    openapiFields.add("tenant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Featureflagsv3UpdateFeatureFlagOverridesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Featureflagsv3UpdateFeatureFlagOverridesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Featureflagsv3UpdateFeatureFlagOverridesRequest is not found in the empty JSON string", Featureflagsv3UpdateFeatureFlagOverridesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Featureflagsv3UpdateFeatureFlagOverridesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Featureflagsv3UpdateFeatureFlagOverridesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `feature_flag`
      if (jsonObj.get("feature_flag") != null && !jsonObj.get("feature_flag").isJsonNull()) {
        Featureflagsv3FeatureFlag.validateJsonElement(jsonObj.get("feature_flag"));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Featureflagsv3UpdateFeatureFlagOverridesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Featureflagsv3UpdateFeatureFlagOverridesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Featureflagsv3UpdateFeatureFlagOverridesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Featureflagsv3UpdateFeatureFlagOverridesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Featureflagsv3UpdateFeatureFlagOverridesRequest>() {
           @Override
           public void write(JsonWriter out, Featureflagsv3UpdateFeatureFlagOverridesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Featureflagsv3UpdateFeatureFlagOverridesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Featureflagsv3UpdateFeatureFlagOverridesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Featureflagsv3UpdateFeatureFlagOverridesRequest
  * @throws IOException if the JSON string is invalid with respect to Featureflagsv3UpdateFeatureFlagOverridesRequest
  */
  public static Featureflagsv3UpdateFeatureFlagOverridesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Featureflagsv3UpdateFeatureFlagOverridesRequest.class);
  }

 /**
  * Convert an instance of Featureflagsv3UpdateFeatureFlagOverridesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

