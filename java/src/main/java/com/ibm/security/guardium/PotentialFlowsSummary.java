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
import com.ibm.security.guardium.CloudAccountCountInner;
import com.ibm.security.guardium.CloudRegionCountInner;
import com.ibm.security.guardium.TypesCountInner;
import java.io.IOException;
import java.math.BigDecimal;
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
 * PotentialFlowsSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class PotentialFlowsSummary {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;

  public static final String SERIALIZED_NAME_TYPES_COUNT = "typesCount";
  @SerializedName(SERIALIZED_NAME_TYPES_COUNT)
  private List<TypesCountInner> typesCount = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_COUNT = "cloudAccountCount";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_COUNT)
  private List<CloudAccountCountInner> cloudAccountCount = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLOUD_REGION_COUNT = "cloudRegionCount";
  @SerializedName(SERIALIZED_NAME_CLOUD_REGION_COUNT)
  private List<CloudRegionCountInner> cloudRegionCount = new ArrayList<>();

  public PotentialFlowsSummary() {
  }

  public PotentialFlowsSummary count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }


  public PotentialFlowsSummary typesCount(List<TypesCountInner> typesCount) {
    this.typesCount = typesCount;
    return this;
  }

  public PotentialFlowsSummary addTypesCountItem(TypesCountInner typesCountItem) {
    if (this.typesCount == null) {
      this.typesCount = new ArrayList<>();
    }
    this.typesCount.add(typesCountItem);
    return this;
  }

   /**
   * Get typesCount
   * @return typesCount
  **/
  @javax.annotation.Nonnull
  public List<TypesCountInner> getTypesCount() {
    return typesCount;
  }

  public void setTypesCount(List<TypesCountInner> typesCount) {
    this.typesCount = typesCount;
  }


  public PotentialFlowsSummary cloudAccountCount(List<CloudAccountCountInner> cloudAccountCount) {
    this.cloudAccountCount = cloudAccountCount;
    return this;
  }

  public PotentialFlowsSummary addCloudAccountCountItem(CloudAccountCountInner cloudAccountCountItem) {
    if (this.cloudAccountCount == null) {
      this.cloudAccountCount = new ArrayList<>();
    }
    this.cloudAccountCount.add(cloudAccountCountItem);
    return this;
  }

   /**
   * Get cloudAccountCount
   * @return cloudAccountCount
  **/
  @javax.annotation.Nonnull
  public List<CloudAccountCountInner> getCloudAccountCount() {
    return cloudAccountCount;
  }

  public void setCloudAccountCount(List<CloudAccountCountInner> cloudAccountCount) {
    this.cloudAccountCount = cloudAccountCount;
  }


  public PotentialFlowsSummary cloudRegionCount(List<CloudRegionCountInner> cloudRegionCount) {
    this.cloudRegionCount = cloudRegionCount;
    return this;
  }

  public PotentialFlowsSummary addCloudRegionCountItem(CloudRegionCountInner cloudRegionCountItem) {
    if (this.cloudRegionCount == null) {
      this.cloudRegionCount = new ArrayList<>();
    }
    this.cloudRegionCount.add(cloudRegionCountItem);
    return this;
  }

   /**
   * Get cloudRegionCount
   * @return cloudRegionCount
  **/
  @javax.annotation.Nonnull
  public List<CloudRegionCountInner> getCloudRegionCount() {
    return cloudRegionCount;
  }

  public void setCloudRegionCount(List<CloudRegionCountInner> cloudRegionCount) {
    this.cloudRegionCount = cloudRegionCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PotentialFlowsSummary potentialFlowsSummary = (PotentialFlowsSummary) o;
    return Objects.equals(this.count, potentialFlowsSummary.count) &&
        Objects.equals(this.typesCount, potentialFlowsSummary.typesCount) &&
        Objects.equals(this.cloudAccountCount, potentialFlowsSummary.cloudAccountCount) &&
        Objects.equals(this.cloudRegionCount, potentialFlowsSummary.cloudRegionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, typesCount, cloudAccountCount, cloudRegionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PotentialFlowsSummary {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    typesCount: ").append(toIndentedString(typesCount)).append("\n");
    sb.append("    cloudAccountCount: ").append(toIndentedString(cloudAccountCount)).append("\n");
    sb.append("    cloudRegionCount: ").append(toIndentedString(cloudRegionCount)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("typesCount");
    openapiFields.add("cloudAccountCount");
    openapiFields.add("cloudRegionCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("typesCount");
    openapiRequiredFields.add("cloudAccountCount");
    openapiRequiredFields.add("cloudRegionCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PotentialFlowsSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PotentialFlowsSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PotentialFlowsSummary is not found in the empty JSON string", PotentialFlowsSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PotentialFlowsSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PotentialFlowsSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PotentialFlowsSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("typesCount").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `typesCount` to be an array in the JSON string but got `%s`", jsonObj.get("typesCount").toString()));
      }

      JsonArray jsonArraytypesCount = jsonObj.getAsJsonArray("typesCount");
      // validate the required field `typesCount` (array)
      for (int i = 0; i < jsonArraytypesCount.size(); i++) {
        TypesCountInner.validateJsonElement(jsonArraytypesCount.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("cloudAccountCount").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountCount` to be an array in the JSON string but got `%s`", jsonObj.get("cloudAccountCount").toString()));
      }

      JsonArray jsonArraycloudAccountCount = jsonObj.getAsJsonArray("cloudAccountCount");
      // validate the required field `cloudAccountCount` (array)
      for (int i = 0; i < jsonArraycloudAccountCount.size(); i++) {
        CloudAccountCountInner.validateJsonElement(jsonArraycloudAccountCount.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("cloudRegionCount").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudRegionCount` to be an array in the JSON string but got `%s`", jsonObj.get("cloudRegionCount").toString()));
      }

      JsonArray jsonArraycloudRegionCount = jsonObj.getAsJsonArray("cloudRegionCount");
      // validate the required field `cloudRegionCount` (array)
      for (int i = 0; i < jsonArraycloudRegionCount.size(); i++) {
        CloudRegionCountInner.validateJsonElement(jsonArraycloudRegionCount.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PotentialFlowsSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PotentialFlowsSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PotentialFlowsSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PotentialFlowsSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<PotentialFlowsSummary>() {
           @Override
           public void write(JsonWriter out, PotentialFlowsSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PotentialFlowsSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PotentialFlowsSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PotentialFlowsSummary
  * @throws IOException if the JSON string is invalid with respect to PotentialFlowsSummary
  */
  public static PotentialFlowsSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PotentialFlowsSummary.class);
  }

 /**
  * Convert an instance of PotentialFlowsSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

