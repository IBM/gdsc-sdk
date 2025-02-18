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
import com.ibm.gdsc.sdk.CloudServiceProvider;
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
 * CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest {
  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest() {
  }

  public CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest cloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @javax.annotation.Nonnull
  public CloudServiceProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest cloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest = (CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest) o;
    return Objects.equals(this.cloudProvider, cloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.cloudProvider) &&
        Objects.equals(this.region, cloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("cloudProvider");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudProvider");
    openapiRequiredFields.add("region");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest is not found in the empty JSON string", CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `cloudProvider`
      CloudServiceProvider.validateJsonElement(jsonObj.get("cloudProvider"));
      if (!jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest>() {
           @Override
           public void write(JsonWriter out, CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest
  * @throws IOException if the JSON string is invalid with respect to CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest
  */
  public static CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.class);
  }

 /**
  * Convert an instance of CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

