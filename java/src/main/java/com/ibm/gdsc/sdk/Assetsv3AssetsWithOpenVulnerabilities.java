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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * Assetsv3AssetsWithOpenVulnerabilities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetsWithOpenVulnerabilities {
  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private String assetType;

  public static final String SERIALIZED_NAME_TOTAL_ASSETS = "total_assets";
  @SerializedName(SERIALIZED_NAME_TOTAL_ASSETS)
  private String totalAssets;

  public static final String SERIALIZED_NAME_VULNERABILITY_GROUP = "vulnerability_group";
  @SerializedName(SERIALIZED_NAME_VULNERABILITY_GROUP)
  private String vulnerabilityGroup;

  public Assetsv3AssetsWithOpenVulnerabilities() {
  }

  public Assetsv3AssetsWithOpenVulnerabilities assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }


  public Assetsv3AssetsWithOpenVulnerabilities totalAssets(String totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Get totalAssets
   * @return totalAssets
  **/
  @javax.annotation.Nullable
  public String getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(String totalAssets) {
    this.totalAssets = totalAssets;
  }


  public Assetsv3AssetsWithOpenVulnerabilities vulnerabilityGroup(String vulnerabilityGroup) {
    this.vulnerabilityGroup = vulnerabilityGroup;
    return this;
  }

   /**
   * Get vulnerabilityGroup
   * @return vulnerabilityGroup
  **/
  @javax.annotation.Nullable
  public String getVulnerabilityGroup() {
    return vulnerabilityGroup;
  }

  public void setVulnerabilityGroup(String vulnerabilityGroup) {
    this.vulnerabilityGroup = vulnerabilityGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetsWithOpenVulnerabilities assetsv3AssetsWithOpenVulnerabilities = (Assetsv3AssetsWithOpenVulnerabilities) o;
    return Objects.equals(this.assetType, assetsv3AssetsWithOpenVulnerabilities.assetType) &&
        Objects.equals(this.totalAssets, assetsv3AssetsWithOpenVulnerabilities.totalAssets) &&
        Objects.equals(this.vulnerabilityGroup, assetsv3AssetsWithOpenVulnerabilities.vulnerabilityGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, totalAssets, vulnerabilityGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetsWithOpenVulnerabilities {\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    vulnerabilityGroup: ").append(toIndentedString(vulnerabilityGroup)).append("\n");
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
    openapiFields.add("asset_type");
    openapiFields.add("total_assets");
    openapiFields.add("vulnerability_group");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetsWithOpenVulnerabilities
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetsWithOpenVulnerabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetsWithOpenVulnerabilities is not found in the empty JSON string", Assetsv3AssetsWithOpenVulnerabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetsWithOpenVulnerabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetsWithOpenVulnerabilities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asset_type") != null && !jsonObj.get("asset_type").isJsonNull()) && !jsonObj.get("asset_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_type").toString()));
      }
      if ((jsonObj.get("total_assets") != null && !jsonObj.get("total_assets").isJsonNull()) && !jsonObj.get("total_assets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_assets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_assets").toString()));
      }
      if ((jsonObj.get("vulnerability_group") != null && !jsonObj.get("vulnerability_group").isJsonNull()) && !jsonObj.get("vulnerability_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vulnerability_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vulnerability_group").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetsWithOpenVulnerabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetsWithOpenVulnerabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetsWithOpenVulnerabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetsWithOpenVulnerabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetsWithOpenVulnerabilities>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetsWithOpenVulnerabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetsWithOpenVulnerabilities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetsWithOpenVulnerabilities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetsWithOpenVulnerabilities
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetsWithOpenVulnerabilities
  */
  public static Assetsv3AssetsWithOpenVulnerabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetsWithOpenVulnerabilities.class);
  }

 /**
  * Convert an instance of Assetsv3AssetsWithOpenVulnerabilities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

