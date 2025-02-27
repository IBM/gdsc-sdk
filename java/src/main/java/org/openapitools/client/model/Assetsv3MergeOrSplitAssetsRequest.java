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
import org.openapitools.client.model.Assetsv3AssetForMergeSplit;

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
 * Assetsv3MergeOrSplitAssetsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3MergeOrSplitAssetsRequest {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_DESTINATION_ASSETS = "destination_assets";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ASSETS)
  private List<Assetsv3AssetForMergeSplit> destinationAssets = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_ASSET = "source_asset";
  @SerializedName(SERIALIZED_NAME_SOURCE_ASSET)
  private Assetsv3AssetForMergeSplit sourceAsset;

  public Assetsv3MergeOrSplitAssetsRequest() {
  }

  public Assetsv3MergeOrSplitAssetsRequest action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public Assetsv3MergeOrSplitAssetsRequest destinationAssets(List<Assetsv3AssetForMergeSplit> destinationAssets) {
    this.destinationAssets = destinationAssets;
    return this;
  }

  public Assetsv3MergeOrSplitAssetsRequest addDestinationAssetsItem(Assetsv3AssetForMergeSplit destinationAssetsItem) {
    if (this.destinationAssets == null) {
      this.destinationAssets = new ArrayList<>();
    }
    this.destinationAssets.add(destinationAssetsItem);
    return this;
  }

   /**
   * Assets selected by user to merge with source asset or split from source asset.
   * @return destinationAssets
  **/
  @javax.annotation.Nullable
  public List<Assetsv3AssetForMergeSplit> getDestinationAssets() {
    return destinationAssets;
  }

  public void setDestinationAssets(List<Assetsv3AssetForMergeSplit> destinationAssets) {
    this.destinationAssets = destinationAssets;
  }


  public Assetsv3MergeOrSplitAssetsRequest sourceAsset(Assetsv3AssetForMergeSplit sourceAsset) {
    this.sourceAsset = sourceAsset;
    return this;
  }

   /**
   * Get sourceAsset
   * @return sourceAsset
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetForMergeSplit getSourceAsset() {
    return sourceAsset;
  }

  public void setSourceAsset(Assetsv3AssetForMergeSplit sourceAsset) {
    this.sourceAsset = sourceAsset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3MergeOrSplitAssetsRequest assetsv3MergeOrSplitAssetsRequest = (Assetsv3MergeOrSplitAssetsRequest) o;
    return Objects.equals(this.action, assetsv3MergeOrSplitAssetsRequest.action) &&
        Objects.equals(this.destinationAssets, assetsv3MergeOrSplitAssetsRequest.destinationAssets) &&
        Objects.equals(this.sourceAsset, assetsv3MergeOrSplitAssetsRequest.sourceAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, destinationAssets, sourceAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3MergeOrSplitAssetsRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    destinationAssets: ").append(toIndentedString(destinationAssets)).append("\n");
    sb.append("    sourceAsset: ").append(toIndentedString(sourceAsset)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("destination_assets");
    openapiFields.add("source_asset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3MergeOrSplitAssetsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3MergeOrSplitAssetsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3MergeOrSplitAssetsRequest is not found in the empty JSON string", Assetsv3MergeOrSplitAssetsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3MergeOrSplitAssetsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3MergeOrSplitAssetsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("destination_assets") != null && !jsonObj.get("destination_assets").isJsonNull()) {
        JsonArray jsonArraydestinationAssets = jsonObj.getAsJsonArray("destination_assets");
        if (jsonArraydestinationAssets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("destination_assets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `destination_assets` to be an array in the JSON string but got `%s`", jsonObj.get("destination_assets").toString()));
          }

          // validate the optional field `destination_assets` (array)
          for (int i = 0; i < jsonArraydestinationAssets.size(); i++) {
            Assetsv3AssetForMergeSplit.validateJsonElement(jsonArraydestinationAssets.get(i));
          };
        }
      }
      // validate the optional field `source_asset`
      if (jsonObj.get("source_asset") != null && !jsonObj.get("source_asset").isJsonNull()) {
        Assetsv3AssetForMergeSplit.validateJsonElement(jsonObj.get("source_asset"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3MergeOrSplitAssetsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3MergeOrSplitAssetsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3MergeOrSplitAssetsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3MergeOrSplitAssetsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3MergeOrSplitAssetsRequest>() {
           @Override
           public void write(JsonWriter out, Assetsv3MergeOrSplitAssetsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3MergeOrSplitAssetsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3MergeOrSplitAssetsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3MergeOrSplitAssetsRequest
  * @throws IOException if the JSON string is invalid with respect to Assetsv3MergeOrSplitAssetsRequest
  */
  public static Assetsv3MergeOrSplitAssetsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3MergeOrSplitAssetsRequest.class);
  }

 /**
  * Convert an instance of Assetsv3MergeOrSplitAssetsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

