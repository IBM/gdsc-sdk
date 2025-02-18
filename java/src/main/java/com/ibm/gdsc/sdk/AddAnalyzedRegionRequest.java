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
import com.ibm.gdsc.sdk.Tags;
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
 * AddAnalyzedRegionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class AddAnalyzedRegionRequest {
  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_REGIONS = "regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List<String> regions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUSTOMER_TAGS = "customerTags";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TAGS)
  private List<Tags> customerTags = new ArrayList<>();

  public AddAnalyzedRegionRequest() {
  }

  public AddAnalyzedRegionRequest cloudProvider(CloudServiceProvider cloudProvider) {
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


  public AddAnalyzedRegionRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public AddAnalyzedRegionRequest regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public AddAnalyzedRegionRequest addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
  }


  public AddAnalyzedRegionRequest customerTags(List<Tags> customerTags) {
    this.customerTags = customerTags;
    return this;
  }

  public AddAnalyzedRegionRequest addCustomerTagsItem(Tags customerTagsItem) {
    if (this.customerTags == null) {
      this.customerTags = new ArrayList<>();
    }
    this.customerTags.add(customerTagsItem);
    return this;
  }

   /**
   * Get customerTags
   * @return customerTags
  **/
  @javax.annotation.Nullable
  public List<Tags> getCustomerTags() {
    return customerTags;
  }

  public void setCustomerTags(List<Tags> customerTags) {
    this.customerTags = customerTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAnalyzedRegionRequest addAnalyzedRegionRequest = (AddAnalyzedRegionRequest) o;
    return Objects.equals(this.cloudProvider, addAnalyzedRegionRequest.cloudProvider) &&
        Objects.equals(this.region, addAnalyzedRegionRequest.region) &&
        Objects.equals(this.regions, addAnalyzedRegionRequest.regions) &&
        Objects.equals(this.customerTags, addAnalyzedRegionRequest.customerTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, region, regions, customerTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAnalyzedRegionRequest {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    customerTags: ").append(toIndentedString(customerTags)).append("\n");
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
    openapiFields.add("regions");
    openapiFields.add("customerTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudProvider");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddAnalyzedRegionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddAnalyzedRegionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddAnalyzedRegionRequest is not found in the empty JSON string", AddAnalyzedRegionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddAnalyzedRegionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddAnalyzedRegionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddAnalyzedRegionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `cloudProvider`
      CloudServiceProvider.validateJsonElement(jsonObj.get("cloudProvider"));
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("regions") != null && !jsonObj.get("regions").isJsonNull() && !jsonObj.get("regions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `regions` to be an array in the JSON string but got `%s`", jsonObj.get("regions").toString()));
      }
      if (jsonObj.get("customerTags") != null && !jsonObj.get("customerTags").isJsonNull()) {
        JsonArray jsonArraycustomerTags = jsonObj.getAsJsonArray("customerTags");
        if (jsonArraycustomerTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customerTags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customerTags` to be an array in the JSON string but got `%s`", jsonObj.get("customerTags").toString()));
          }

          // validate the optional field `customerTags` (array)
          for (int i = 0; i < jsonArraycustomerTags.size(); i++) {
            Tags.validateJsonElement(jsonArraycustomerTags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddAnalyzedRegionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddAnalyzedRegionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddAnalyzedRegionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddAnalyzedRegionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddAnalyzedRegionRequest>() {
           @Override
           public void write(JsonWriter out, AddAnalyzedRegionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddAnalyzedRegionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddAnalyzedRegionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddAnalyzedRegionRequest
  * @throws IOException if the JSON string is invalid with respect to AddAnalyzedRegionRequest
  */
  public static AddAnalyzedRegionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddAnalyzedRegionRequest.class);
  }

 /**
  * Convert an instance of AddAnalyzedRegionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

