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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner;
import org.openapitools.client.model.CloudServiceProvider;

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
 * CloudAccountsCloudProvidersOptionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class CloudAccountsCloudProvidersOptionsRequest {
  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public static final String SERIALIZED_NAME_CLOUD_ACCOUNTS = "cloudAccounts";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNTS)
  private List<CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner> cloudAccounts = new ArrayList<>();

  public CloudAccountsCloudProvidersOptionsRequest() {
  }

  public CloudAccountsCloudProvidersOptionsRequest cloudProvider(CloudServiceProvider cloudProvider) {
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


  public CloudAccountsCloudProvidersOptionsRequest cloudAccounts(List<CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner> cloudAccounts) {
    this.cloudAccounts = cloudAccounts;
    return this;
  }

  public CloudAccountsCloudProvidersOptionsRequest addCloudAccountsItem(CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner cloudAccountsItem) {
    if (this.cloudAccounts == null) {
      this.cloudAccounts = new ArrayList<>();
    }
    this.cloudAccounts.add(cloudAccountsItem);
    return this;
  }

   /**
   * Get cloudAccounts
   * @return cloudAccounts
  **/
  @javax.annotation.Nonnull
  public List<CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner> getCloudAccounts() {
    return cloudAccounts;
  }

  public void setCloudAccounts(List<CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner> cloudAccounts) {
    this.cloudAccounts = cloudAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountsCloudProvidersOptionsRequest cloudAccountsCloudProvidersOptionsRequest = (CloudAccountsCloudProvidersOptionsRequest) o;
    return Objects.equals(this.cloudProvider, cloudAccountsCloudProvidersOptionsRequest.cloudProvider) &&
        Objects.equals(this.cloudAccounts, cloudAccountsCloudProvidersOptionsRequest.cloudAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, cloudAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountsCloudProvidersOptionsRequest {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    cloudAccounts: ").append(toIndentedString(cloudAccounts)).append("\n");
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
    openapiFields.add("cloudAccounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudProvider");
    openapiRequiredFields.add("cloudAccounts");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudAccountsCloudProvidersOptionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudAccountsCloudProvidersOptionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudAccountsCloudProvidersOptionsRequest is not found in the empty JSON string", CloudAccountsCloudProvidersOptionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudAccountsCloudProvidersOptionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudAccountsCloudProvidersOptionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudAccountsCloudProvidersOptionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `cloudProvider`
      CloudServiceProvider.validateJsonElement(jsonObj.get("cloudProvider"));
      // ensure the json data is an array
      if (!jsonObj.get("cloudAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("cloudAccounts").toString()));
      }

      JsonArray jsonArraycloudAccounts = jsonObj.getAsJsonArray("cloudAccounts");
      // validate the required field `cloudAccounts` (array)
      for (int i = 0; i < jsonArraycloudAccounts.size(); i++) {
        CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.validateJsonElement(jsonArraycloudAccounts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudAccountsCloudProvidersOptionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudAccountsCloudProvidersOptionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudAccountsCloudProvidersOptionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudAccountsCloudProvidersOptionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudAccountsCloudProvidersOptionsRequest>() {
           @Override
           public void write(JsonWriter out, CloudAccountsCloudProvidersOptionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudAccountsCloudProvidersOptionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudAccountsCloudProvidersOptionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudAccountsCloudProvidersOptionsRequest
  * @throws IOException if the JSON string is invalid with respect to CloudAccountsCloudProvidersOptionsRequest
  */
  public static CloudAccountsCloudProvidersOptionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudAccountsCloudProvidersOptionsRequest.class);
  }

 /**
  * Convert an instance of CloudAccountsCloudProvidersOptionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

