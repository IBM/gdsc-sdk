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
import com.ibm.gdsc.sdk.models.Riskanalyticsmlclassificationv3RuleSetList;
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
 * ClassModelExplained message for the response of GetClassificationModel api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Riskanalyticsmlclassificationv3ClassModelExplained {
  public static final String SERIALIZED_NAME_CLASS_CONFIDENCE = "class_confidence";
  @SerializedName(SERIALIZED_NAME_CLASS_CONFIDENCE)
  private Float classConfidence;

  public static final String SERIALIZED_NAME_CLASS_KEY = "class_key";
  @SerializedName(SERIALIZED_NAME_CLASS_KEY)
  private String classKey;

  public static final String SERIALIZED_NAME_RULE_SETS = "rule_sets";
  @SerializedName(SERIALIZED_NAME_RULE_SETS)
  private List<Riskanalyticsmlclassificationv3RuleSetList> ruleSets = new ArrayList<>();

  public Riskanalyticsmlclassificationv3ClassModelExplained() {
  }

  public Riskanalyticsmlclassificationv3ClassModelExplained classConfidence(Float classConfidence) {
    this.classConfidence = classConfidence;
    return this;
  }

   /**
   * Get classConfidence
   * @return classConfidence
  **/
  @javax.annotation.Nullable
  public Float getClassConfidence() {
    return classConfidence;
  }

  public void setClassConfidence(Float classConfidence) {
    this.classConfidence = classConfidence;
  }


  public Riskanalyticsmlclassificationv3ClassModelExplained classKey(String classKey) {
    this.classKey = classKey;
    return this;
  }

   /**
   * Get classKey
   * @return classKey
  **/
  @javax.annotation.Nullable
  public String getClassKey() {
    return classKey;
  }

  public void setClassKey(String classKey) {
    this.classKey = classKey;
  }


  public Riskanalyticsmlclassificationv3ClassModelExplained ruleSets(List<Riskanalyticsmlclassificationv3RuleSetList> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }

  public Riskanalyticsmlclassificationv3ClassModelExplained addRuleSetsItem(Riskanalyticsmlclassificationv3RuleSetList ruleSetsItem) {
    if (this.ruleSets == null) {
      this.ruleSets = new ArrayList<>();
    }
    this.ruleSets.add(ruleSetsItem);
    return this;
  }

   /**
   * Get ruleSets
   * @return ruleSets
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsmlclassificationv3RuleSetList> getRuleSets() {
    return ruleSets;
  }

  public void setRuleSets(List<Riskanalyticsmlclassificationv3RuleSetList> ruleSets) {
    this.ruleSets = ruleSets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsmlclassificationv3ClassModelExplained riskanalyticsmlclassificationv3ClassModelExplained = (Riskanalyticsmlclassificationv3ClassModelExplained) o;
    return Objects.equals(this.classConfidence, riskanalyticsmlclassificationv3ClassModelExplained.classConfidence) &&
        Objects.equals(this.classKey, riskanalyticsmlclassificationv3ClassModelExplained.classKey) &&
        Objects.equals(this.ruleSets, riskanalyticsmlclassificationv3ClassModelExplained.ruleSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classConfidence, classKey, ruleSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsmlclassificationv3ClassModelExplained {\n");
    sb.append("    classConfidence: ").append(toIndentedString(classConfidence)).append("\n");
    sb.append("    classKey: ").append(toIndentedString(classKey)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
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
    openapiFields.add("class_confidence");
    openapiFields.add("class_key");
    openapiFields.add("rule_sets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsmlclassificationv3ClassModelExplained
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsmlclassificationv3ClassModelExplained.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsmlclassificationv3ClassModelExplained is not found in the empty JSON string", Riskanalyticsmlclassificationv3ClassModelExplained.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsmlclassificationv3ClassModelExplained.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsmlclassificationv3ClassModelExplained` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("class_key") != null && !jsonObj.get("class_key").isJsonNull()) && !jsonObj.get("class_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_key").toString()));
      }
      if (jsonObj.get("rule_sets") != null && !jsonObj.get("rule_sets").isJsonNull()) {
        JsonArray jsonArrayruleSets = jsonObj.getAsJsonArray("rule_sets");
        if (jsonArrayruleSets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rule_sets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rule_sets` to be an array in the JSON string but got `%s`", jsonObj.get("rule_sets").toString()));
          }

          // validate the optional field `rule_sets` (array)
          for (int i = 0; i < jsonArrayruleSets.size(); i++) {
            Riskanalyticsmlclassificationv3RuleSetList.validateJsonElement(jsonArrayruleSets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsmlclassificationv3ClassModelExplained.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsmlclassificationv3ClassModelExplained' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsmlclassificationv3ClassModelExplained> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsmlclassificationv3ClassModelExplained.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsmlclassificationv3ClassModelExplained>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsmlclassificationv3ClassModelExplained value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsmlclassificationv3ClassModelExplained read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsmlclassificationv3ClassModelExplained given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsmlclassificationv3ClassModelExplained
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsmlclassificationv3ClassModelExplained
  */
  public static Riskanalyticsmlclassificationv3ClassModelExplained fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsmlclassificationv3ClassModelExplained.class);
  }

 /**
  * Convert an instance of Riskanalyticsmlclassificationv3ClassModelExplained to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

