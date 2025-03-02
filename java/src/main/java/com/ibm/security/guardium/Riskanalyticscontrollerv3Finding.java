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
import com.ibm.security.guardium.Riskanalyticscontrollerv3FindingDetailsMap;
import com.ibm.security.guardium.Riskanalyticscontrollerv3ObservationType;
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
 * A finding (AKA observation); details the evidence found in a Risk event hourly observation; may contain multiple finding maps.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3Finding {
  public static final String SERIALIZED_NAME_FINDING_DESCRIPTION = "finding_description";
  @SerializedName(SERIALIZED_NAME_FINDING_DESCRIPTION)
  private String findingDescription;

  public static final String SERIALIZED_NAME_FINDING_DETAILS_MAP = "finding_details_map";
  @SerializedName(SERIALIZED_NAME_FINDING_DETAILS_MAP)
  private List<Riskanalyticscontrollerv3FindingDetailsMap> findingDetailsMap = new ArrayList<>();

  public static final String SERIALIZED_NAME_FINDING_TYPE = "finding_type";
  @SerializedName(SERIALIZED_NAME_FINDING_TYPE)
  private Riskanalyticscontrollerv3ObservationType findingType = Riskanalyticscontrollerv3ObservationType.UNDEFINED_OBSERVATION_TYPE;

  public Riskanalyticscontrollerv3Finding() {
  }

  public Riskanalyticscontrollerv3Finding findingDescription(String findingDescription) {
    this.findingDescription = findingDescription;
    return this;
  }

   /**
   * Finding description.
   * @return findingDescription
  **/
  @javax.annotation.Nullable
  public String getFindingDescription() {
    return findingDescription;
  }

  public void setFindingDescription(String findingDescription) {
    this.findingDescription = findingDescription;
  }


  public Riskanalyticscontrollerv3Finding findingDetailsMap(List<Riskanalyticscontrollerv3FindingDetailsMap> findingDetailsMap) {
    this.findingDetailsMap = findingDetailsMap;
    return this;
  }

  public Riskanalyticscontrollerv3Finding addFindingDetailsMapItem(Riskanalyticscontrollerv3FindingDetailsMap findingDetailsMapItem) {
    if (this.findingDetailsMap == null) {
      this.findingDetailsMap = new ArrayList<>();
    }
    this.findingDetailsMap.add(findingDetailsMapItem);
    return this;
  }

   /**
   * Finding details - Optional.
   * @return findingDetailsMap
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3FindingDetailsMap> getFindingDetailsMap() {
    return findingDetailsMap;
  }

  public void setFindingDetailsMap(List<Riskanalyticscontrollerv3FindingDetailsMap> findingDetailsMap) {
    this.findingDetailsMap = findingDetailsMap;
  }


  public Riskanalyticscontrollerv3Finding findingType(Riskanalyticscontrollerv3ObservationType findingType) {
    this.findingType = findingType;
    return this;
  }

   /**
   * Get findingType
   * @return findingType
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3ObservationType getFindingType() {
    return findingType;
  }

  public void setFindingType(Riskanalyticscontrollerv3ObservationType findingType) {
    this.findingType = findingType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3Finding riskanalyticscontrollerv3Finding = (Riskanalyticscontrollerv3Finding) o;
    return Objects.equals(this.findingDescription, riskanalyticscontrollerv3Finding.findingDescription) &&
        Objects.equals(this.findingDetailsMap, riskanalyticscontrollerv3Finding.findingDetailsMap) &&
        Objects.equals(this.findingType, riskanalyticscontrollerv3Finding.findingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(findingDescription, findingDetailsMap, findingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3Finding {\n");
    sb.append("    findingDescription: ").append(toIndentedString(findingDescription)).append("\n");
    sb.append("    findingDetailsMap: ").append(toIndentedString(findingDetailsMap)).append("\n");
    sb.append("    findingType: ").append(toIndentedString(findingType)).append("\n");
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
    openapiFields.add("finding_description");
    openapiFields.add("finding_details_map");
    openapiFields.add("finding_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3Finding
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3Finding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3Finding is not found in the empty JSON string", Riskanalyticscontrollerv3Finding.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3Finding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3Finding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("finding_description") != null && !jsonObj.get("finding_description").isJsonNull()) && !jsonObj.get("finding_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finding_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finding_description").toString()));
      }
      if (jsonObj.get("finding_details_map") != null && !jsonObj.get("finding_details_map").isJsonNull()) {
        JsonArray jsonArrayfindingDetailsMap = jsonObj.getAsJsonArray("finding_details_map");
        if (jsonArrayfindingDetailsMap != null) {
          // ensure the json data is an array
          if (!jsonObj.get("finding_details_map").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `finding_details_map` to be an array in the JSON string but got `%s`", jsonObj.get("finding_details_map").toString()));
          }

          // validate the optional field `finding_details_map` (array)
          for (int i = 0; i < jsonArrayfindingDetailsMap.size(); i++) {
            Riskanalyticscontrollerv3FindingDetailsMap.validateJsonElement(jsonArrayfindingDetailsMap.get(i));
          };
        }
      }
      // validate the optional field `finding_type`
      if (jsonObj.get("finding_type") != null && !jsonObj.get("finding_type").isJsonNull()) {
        Riskanalyticscontrollerv3ObservationType.validateJsonElement(jsonObj.get("finding_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3Finding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3Finding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3Finding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3Finding.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3Finding>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3Finding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3Finding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3Finding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3Finding
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3Finding
  */
  public static Riskanalyticscontrollerv3Finding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3Finding.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3Finding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

