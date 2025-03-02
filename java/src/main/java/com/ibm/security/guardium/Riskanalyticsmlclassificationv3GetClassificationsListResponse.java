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
import com.ibm.security.guardium.Riskanalyticsmlclassificationv3ClassificationDefinition;
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
 * GetClassificationListResponse for the GetClassificationsList api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsmlclassificationv3GetClassificationsListResponse {
  public static final String SERIALIZED_NAME_CLASSIFICATIONS = "classifications";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATIONS)
  private List<Riskanalyticsmlclassificationv3ClassificationDefinition> classifications = new ArrayList<>();

  public Riskanalyticsmlclassificationv3GetClassificationsListResponse() {
  }

  public Riskanalyticsmlclassificationv3GetClassificationsListResponse classifications(List<Riskanalyticsmlclassificationv3ClassificationDefinition> classifications) {
    this.classifications = classifications;
    return this;
  }

  public Riskanalyticsmlclassificationv3GetClassificationsListResponse addClassificationsItem(Riskanalyticsmlclassificationv3ClassificationDefinition classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new ArrayList<>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * Get classifications
   * @return classifications
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsmlclassificationv3ClassificationDefinition> getClassifications() {
    return classifications;
  }

  public void setClassifications(List<Riskanalyticsmlclassificationv3ClassificationDefinition> classifications) {
    this.classifications = classifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsmlclassificationv3GetClassificationsListResponse riskanalyticsmlclassificationv3GetClassificationsListResponse = (Riskanalyticsmlclassificationv3GetClassificationsListResponse) o;
    return Objects.equals(this.classifications, riskanalyticsmlclassificationv3GetClassificationsListResponse.classifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsmlclassificationv3GetClassificationsListResponse {\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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
    openapiFields.add("classifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsmlclassificationv3GetClassificationsListResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsmlclassificationv3GetClassificationsListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsmlclassificationv3GetClassificationsListResponse is not found in the empty JSON string", Riskanalyticsmlclassificationv3GetClassificationsListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsmlclassificationv3GetClassificationsListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsmlclassificationv3GetClassificationsListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("classifications") != null && !jsonObj.get("classifications").isJsonNull()) {
        JsonArray jsonArrayclassifications = jsonObj.getAsJsonArray("classifications");
        if (jsonArrayclassifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("classifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `classifications` to be an array in the JSON string but got `%s`", jsonObj.get("classifications").toString()));
          }

          // validate the optional field `classifications` (array)
          for (int i = 0; i < jsonArrayclassifications.size(); i++) {
            Riskanalyticsmlclassificationv3ClassificationDefinition.validateJsonElement(jsonArrayclassifications.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsmlclassificationv3GetClassificationsListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsmlclassificationv3GetClassificationsListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsmlclassificationv3GetClassificationsListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsmlclassificationv3GetClassificationsListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsmlclassificationv3GetClassificationsListResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsmlclassificationv3GetClassificationsListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsmlclassificationv3GetClassificationsListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsmlclassificationv3GetClassificationsListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsmlclassificationv3GetClassificationsListResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsmlclassificationv3GetClassificationsListResponse
  */
  public static Riskanalyticsmlclassificationv3GetClassificationsListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsmlclassificationv3GetClassificationsListResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticsmlclassificationv3GetClassificationsListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

