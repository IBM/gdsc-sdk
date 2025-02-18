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
import com.ibm.gdsc.sdk.AddCloudAccountsRequestCloudAccountsInner;
import com.ibm.gdsc.sdk.CloudServiceProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * AddCloudAccountsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class AddCloudAccountsRequest {
  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public static final String SERIALIZED_NAME_CLOUD_ACCOUNTS = "cloudAccounts";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNTS)
  private List<AddCloudAccountsRequestCloudAccountsInner> cloudAccounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAIN_ACCOUNT_ID = "mainAccountId";
  @SerializedName(SERIALIZED_NAME_MAIN_ACCOUNT_ID)
  private String mainAccountId;

  public AddCloudAccountsRequest() {
  }

  public AddCloudAccountsRequest cloudProvider(CloudServiceProvider cloudProvider) {
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


  public AddCloudAccountsRequest cloudAccounts(List<AddCloudAccountsRequestCloudAccountsInner> cloudAccounts) {
    this.cloudAccounts = cloudAccounts;
    return this;
  }

  public AddCloudAccountsRequest addCloudAccountsItem(AddCloudAccountsRequestCloudAccountsInner cloudAccountsItem) {
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
  public List<AddCloudAccountsRequestCloudAccountsInner> getCloudAccounts() {
    return cloudAccounts;
  }

  public void setCloudAccounts(List<AddCloudAccountsRequestCloudAccountsInner> cloudAccounts) {
    this.cloudAccounts = cloudAccounts;
  }


  public AddCloudAccountsRequest mainAccountId(String mainAccountId) {
    this.mainAccountId = mainAccountId;
    return this;
  }

   /**
   * Get mainAccountId
   * @return mainAccountId
  **/
  @javax.annotation.Nullable
  public String getMainAccountId() {
    return mainAccountId;
  }

  public void setMainAccountId(String mainAccountId) {
    this.mainAccountId = mainAccountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCloudAccountsRequest addCloudAccountsRequest = (AddCloudAccountsRequest) o;
    return Objects.equals(this.cloudProvider, addCloudAccountsRequest.cloudProvider) &&
        Objects.equals(this.cloudAccounts, addCloudAccountsRequest.cloudAccounts) &&
        Objects.equals(this.mainAccountId, addCloudAccountsRequest.mainAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, cloudAccounts, mainAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCloudAccountsRequest {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    cloudAccounts: ").append(toIndentedString(cloudAccounts)).append("\n");
    sb.append("    mainAccountId: ").append(toIndentedString(mainAccountId)).append("\n");
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
    openapiFields.add("mainAccountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudProvider");
    openapiRequiredFields.add("cloudAccounts");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddCloudAccountsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddCloudAccountsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddCloudAccountsRequest is not found in the empty JSON string", AddCloudAccountsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddCloudAccountsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddCloudAccountsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddCloudAccountsRequest.openapiRequiredFields) {
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
        AddCloudAccountsRequestCloudAccountsInner.validateJsonElement(jsonArraycloudAccounts.get(i));
      };
      if ((jsonObj.get("mainAccountId") != null && !jsonObj.get("mainAccountId").isJsonNull()) && !jsonObj.get("mainAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mainAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mainAccountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddCloudAccountsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddCloudAccountsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddCloudAccountsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddCloudAccountsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddCloudAccountsRequest>() {
           @Override
           public void write(JsonWriter out, AddCloudAccountsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddCloudAccountsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddCloudAccountsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddCloudAccountsRequest
  * @throws IOException if the JSON string is invalid with respect to AddCloudAccountsRequest
  */
  public static AddCloudAccountsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddCloudAccountsRequest.class);
  }

 /**
  * Convert an instance of AddCloudAccountsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

