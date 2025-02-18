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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Riskanalyticscontrollerv3ExcludedItem;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * RiskEventTuningRequest is the request object for RiskEventTuning API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3RiskEventTuningRequest {
  public static final String SERIALIZED_NAME_EXCLUDED_ITEMS = "excluded_items";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_ITEMS)
  private List<Riskanalyticscontrollerv3ExcludedItem> excludedItems = new ArrayList<>();

  public Riskanalyticscontrollerv3RiskEventTuningRequest() {
  }

  public Riskanalyticscontrollerv3RiskEventTuningRequest excludedItems(List<Riskanalyticscontrollerv3ExcludedItem> excludedItems) {
    this.excludedItems = excludedItems;
    return this;
  }

  public Riskanalyticscontrollerv3RiskEventTuningRequest addExcludedItemsItem(Riskanalyticscontrollerv3ExcludedItem excludedItemsItem) {
    if (this.excludedItems == null) {
      this.excludedItems = new ArrayList<>();
    }
    this.excludedItems.add(excludedItemsItem);
    return this;
  }

   /**
   * Excluded items array.
   * @return excludedItems
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3ExcludedItem> getExcludedItems() {
    return excludedItems;
  }

  public void setExcludedItems(List<Riskanalyticscontrollerv3ExcludedItem> excludedItems) {
    this.excludedItems = excludedItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3RiskEventTuningRequest riskanalyticscontrollerv3RiskEventTuningRequest = (Riskanalyticscontrollerv3RiskEventTuningRequest) o;
    return Objects.equals(this.excludedItems, riskanalyticscontrollerv3RiskEventTuningRequest.excludedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3RiskEventTuningRequest {\n");
    sb.append("    excludedItems: ").append(toIndentedString(excludedItems)).append("\n");
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
    openapiFields.add("excluded_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3RiskEventTuningRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3RiskEventTuningRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3RiskEventTuningRequest is not found in the empty JSON string", Riskanalyticscontrollerv3RiskEventTuningRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3RiskEventTuningRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3RiskEventTuningRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("excluded_items") != null && !jsonObj.get("excluded_items").isJsonNull()) {
        JsonArray jsonArrayexcludedItems = jsonObj.getAsJsonArray("excluded_items");
        if (jsonArrayexcludedItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excluded_items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excluded_items` to be an array in the JSON string but got `%s`", jsonObj.get("excluded_items").toString()));
          }

          // validate the optional field `excluded_items` (array)
          for (int i = 0; i < jsonArrayexcludedItems.size(); i++) {
            Riskanalyticscontrollerv3ExcludedItem.validateJsonElement(jsonArrayexcludedItems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3RiskEventTuningRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3RiskEventTuningRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3RiskEventTuningRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3RiskEventTuningRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3RiskEventTuningRequest>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3RiskEventTuningRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3RiskEventTuningRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3RiskEventTuningRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3RiskEventTuningRequest
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3RiskEventTuningRequest
  */
  public static Riskanalyticscontrollerv3RiskEventTuningRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3RiskEventTuningRequest.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3RiskEventTuningRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

