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

import com.ibm.security.JSON;

/**
 * Asset from Asset Inventory selected for merge or split.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetForMergeSplit {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_DSDEF_KEY = "dsdef_key";
  @SerializedName(SERIALIZED_NAME_DSDEF_KEY)
  private List<String> dsdefKey = new ArrayList<>();

  public Assetsv3AssetForMergeSplit() {
  }

  public Assetsv3AssetForMergeSplit assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public Assetsv3AssetForMergeSplit assetName(String assetName) {
    this.assetName = assetName;
    return this;
  }

   /**
   * Get assetName
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public Assetsv3AssetForMergeSplit dsdefKey(List<String> dsdefKey) {
    this.dsdefKey = dsdefKey;
    return this;
  }

  public Assetsv3AssetForMergeSplit addDsdefKeyItem(String dsdefKeyItem) {
    if (this.dsdefKey == null) {
      this.dsdefKey = new ArrayList<>();
    }
    this.dsdefKey.add(dsdefKeyItem);
    return this;
  }

   /**
   * Get dsdefKey
   * @return dsdefKey
  **/
  @javax.annotation.Nullable
  public List<String> getDsdefKey() {
    return dsdefKey;
  }

  public void setDsdefKey(List<String> dsdefKey) {
    this.dsdefKey = dsdefKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetForMergeSplit assetsv3AssetForMergeSplit = (Assetsv3AssetForMergeSplit) o;
    return Objects.equals(this.assetId, assetsv3AssetForMergeSplit.assetId) &&
        Objects.equals(this.assetName, assetsv3AssetForMergeSplit.assetName) &&
        Objects.equals(this.dsdefKey, assetsv3AssetForMergeSplit.dsdefKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, dsdefKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetForMergeSplit {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    dsdefKey: ").append(toIndentedString(dsdefKey)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");
    openapiFields.add("dsdef_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetForMergeSplit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetForMergeSplit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetForMergeSplit is not found in the empty JSON string", Assetsv3AssetForMergeSplit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetForMergeSplit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetForMergeSplit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asset_id") != null && !jsonObj.get("asset_id").isJsonNull()) && !jsonObj.get("asset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_id").toString()));
      }
      if ((jsonObj.get("asset_name") != null && !jsonObj.get("asset_name").isJsonNull()) && !jsonObj.get("asset_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dsdef_key") != null && !jsonObj.get("dsdef_key").isJsonNull() && !jsonObj.get("dsdef_key").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsdef_key` to be an array in the JSON string but got `%s`", jsonObj.get("dsdef_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetForMergeSplit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetForMergeSplit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetForMergeSplit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetForMergeSplit.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetForMergeSplit>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetForMergeSplit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetForMergeSplit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetForMergeSplit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetForMergeSplit
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetForMergeSplit
  */
  public static Assetsv3AssetForMergeSplit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetForMergeSplit.class);
  }

 /**
  * Convert an instance of Assetsv3AssetForMergeSplit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

