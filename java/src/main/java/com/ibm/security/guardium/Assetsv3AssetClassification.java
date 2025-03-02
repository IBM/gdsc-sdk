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
import com.ibm.security.guardium.Assetsv3ClassificationData;
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
 * Assetsv3AssetClassification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetClassification {
  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private List<Assetsv3ClassificationData> classification = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "last_activity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private String lastActivity;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public Assetsv3AssetClassification() {
  }

  public Assetsv3AssetClassification classification(List<Assetsv3ClassificationData> classification) {
    this.classification = classification;
    return this;
  }

  public Assetsv3AssetClassification addClassificationItem(Assetsv3ClassificationData classificationItem) {
    if (this.classification == null) {
      this.classification = new ArrayList<>();
    }
    this.classification.add(classificationItem);
    return this;
  }

   /**
   * Get classification
   * @return classification
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ClassificationData> getClassification() {
    return classification;
  }

  public void setClassification(List<Assetsv3ClassificationData> classification) {
    this.classification = classification;
  }


  public Assetsv3AssetClassification lastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Get lastActivity
   * @return lastActivity
  **/
  @javax.annotation.Nullable
  public String getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
  }


  public Assetsv3AssetClassification totalCount(Integer totalCount) {
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
    Assetsv3AssetClassification assetsv3AssetClassification = (Assetsv3AssetClassification) o;
    return Objects.equals(this.classification, assetsv3AssetClassification.classification) &&
        Objects.equals(this.lastActivity, assetsv3AssetClassification.lastActivity) &&
        Objects.equals(this.totalCount, assetsv3AssetClassification.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, lastActivity, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetClassification {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
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
    openapiFields.add("classification");
    openapiFields.add("last_activity");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetClassification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetClassification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetClassification is not found in the empty JSON string", Assetsv3AssetClassification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetClassification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetClassification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("classification") != null && !jsonObj.get("classification").isJsonNull()) {
        JsonArray jsonArrayclassification = jsonObj.getAsJsonArray("classification");
        if (jsonArrayclassification != null) {
          // ensure the json data is an array
          if (!jsonObj.get("classification").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `classification` to be an array in the JSON string but got `%s`", jsonObj.get("classification").toString()));
          }

          // validate the optional field `classification` (array)
          for (int i = 0; i < jsonArrayclassification.size(); i++) {
            Assetsv3ClassificationData.validateJsonElement(jsonArrayclassification.get(i));
          };
        }
      }
      if ((jsonObj.get("last_activity") != null && !jsonObj.get("last_activity").isJsonNull()) && !jsonObj.get("last_activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_activity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetClassification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetClassification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetClassification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetClassification.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetClassification>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetClassification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetClassification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetClassification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetClassification
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetClassification
  */
  public static Assetsv3AssetClassification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetClassification.class);
  }

 /**
  * Convert an instance of Assetsv3AssetClassification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

