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
import com.ibm.gdsc.sdk.Environment;
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
 * CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner {
  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_ID = "cloudAccountId";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_ID)
  private String cloudAccountId;

  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_NAME = "cloudAccountName";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_NAME)
  private String cloudAccountName;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private Environment environment;

  public CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner() {
  }

  public CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nonnull
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner cloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
    return this;
  }

   /**
   * Get cloudAccountName
   * @return cloudAccountName
  **/
  @javax.annotation.Nonnull
  public String getCloudAccountName() {
    return cloudAccountName;
  }

  public void setCloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
  }


  public CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner environment(Environment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner cloudAccountsCloudProvidersOptionsRequestCloudAccountsInner = (CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner) o;
    return Objects.equals(this.cloudAccountId, cloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.cloudAccountId) &&
        Objects.equals(this.cloudAccountName, cloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.cloudAccountName) &&
        Objects.equals(this.environment, cloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, cloudAccountName, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudAccountName: ").append(toIndentedString(cloudAccountName)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
    openapiFields.add("cloudAccountId");
    openapiFields.add("cloudAccountName");
    openapiFields.add("environment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudAccountId");
    openapiRequiredFields.add("cloudAccountName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner is not found in the empty JSON string", CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cloudAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudAccountId").toString()));
      }
      if (!jsonObj.get("cloudAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudAccountName").toString()));
      }
      // validate the optional field `environment`
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) {
        Environment.validateJsonElement(jsonObj.get("environment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner>() {
           @Override
           public void write(JsonWriter out, CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner
  * @throws IOException if the JSON string is invalid with respect to CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner
  */
  public static CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.class);
  }

 /**
  * Convert an instance of CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

