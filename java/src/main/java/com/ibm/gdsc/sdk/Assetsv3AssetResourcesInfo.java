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
import com.ibm.gdsc.sdk.Assetsv3ResourceData;
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
 * Assetsv3AssetResourcesInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetResourcesInfo {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private List<Assetsv3ResourceData> resource = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public Assetsv3AssetResourcesInfo() {
  }

  public Assetsv3AssetResourcesInfo resource(List<Assetsv3ResourceData> resource) {
    this.resource = resource;
    return this;
  }

  public Assetsv3AssetResourcesInfo addResourceItem(Assetsv3ResourceData resourceItem) {
    if (this.resource == null) {
      this.resource = new ArrayList<>();
    }
    this.resource.add(resourceItem);
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ResourceData> getResource() {
    return resource;
  }

  public void setResource(List<Assetsv3ResourceData> resource) {
    this.resource = resource;
  }


  public Assetsv3AssetResourcesInfo totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetResourcesInfo assetsv3AssetResourcesInfo = (Assetsv3AssetResourcesInfo) o;
    return Objects.equals(this.resource, assetsv3AssetResourcesInfo.resource) &&
        Objects.equals(this.totalCount, assetsv3AssetResourcesInfo.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetResourcesInfo {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("resource");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetResourcesInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetResourcesInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetResourcesInfo is not found in the empty JSON string", Assetsv3AssetResourcesInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetResourcesInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetResourcesInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        JsonArray jsonArrayresource = jsonObj.getAsJsonArray("resource");
        if (jsonArrayresource != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resource").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resource` to be an array in the JSON string but got `%s`", jsonObj.get("resource").toString()));
          }

          // validate the optional field `resource` (array)
          for (int i = 0; i < jsonArrayresource.size(); i++) {
            Assetsv3ResourceData.validateJsonElement(jsonArrayresource.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetResourcesInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetResourcesInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetResourcesInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetResourcesInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetResourcesInfo>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetResourcesInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetResourcesInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetResourcesInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetResourcesInfo
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetResourcesInfo
  */
  public static Assetsv3AssetResourcesInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetResourcesInfo.class);
  }

 /**
  * Convert an instance of Assetsv3AssetResourcesInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

