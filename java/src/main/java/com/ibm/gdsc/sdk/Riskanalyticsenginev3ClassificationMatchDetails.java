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
 * ClassificationMatchDetails contains the details about matched classifications.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsenginev3ClassificationMatchDetails {
  public static final String SERIALIZED_NAME_CLASS_KEY = "class_key";
  @SerializedName(SERIALIZED_NAME_CLASS_KEY)
  private String classKey;

  public static final String SERIALIZED_NAME_CLASS_VALUE = "class_value";
  @SerializedName(SERIALIZED_NAME_CLASS_VALUE)
  private Float classValue;

  public static final String SERIALIZED_NAME_CLASSIFICATION_CONFIDENCE = "classification_confidence";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_CONFIDENCE)
  private Float classificationConfidence;

  public static final String SERIALIZED_NAME_CLASSIFICATION_NLS = "classification_nls";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_NLS)
  private String classificationNls;

  public static final String SERIALIZED_NAME_MODEL_PROBABILITY = "model_probability";
  @SerializedName(SERIALIZED_NAME_MODEL_PROBABILITY)
  private Float modelProbability;

  public Riskanalyticsenginev3ClassificationMatchDetails() {
  }

  public Riskanalyticsenginev3ClassificationMatchDetails classKey(String classKey) {
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


  public Riskanalyticsenginev3ClassificationMatchDetails classValue(Float classValue) {
    this.classValue = classValue;
    return this;
  }

   /**
   * Get classValue
   * @return classValue
  **/
  @javax.annotation.Nullable
  public Float getClassValue() {
    return classValue;
  }

  public void setClassValue(Float classValue) {
    this.classValue = classValue;
  }


  public Riskanalyticsenginev3ClassificationMatchDetails classificationConfidence(Float classificationConfidence) {
    this.classificationConfidence = classificationConfidence;
    return this;
  }

   /**
   * Get classificationConfidence
   * @return classificationConfidence
  **/
  @javax.annotation.Nullable
  public Float getClassificationConfidence() {
    return classificationConfidence;
  }

  public void setClassificationConfidence(Float classificationConfidence) {
    this.classificationConfidence = classificationConfidence;
  }


  public Riskanalyticsenginev3ClassificationMatchDetails classificationNls(String classificationNls) {
    this.classificationNls = classificationNls;
    return this;
  }

   /**
   * Get classificationNls
   * @return classificationNls
  **/
  @javax.annotation.Nullable
  public String getClassificationNls() {
    return classificationNls;
  }

  public void setClassificationNls(String classificationNls) {
    this.classificationNls = classificationNls;
  }


  public Riskanalyticsenginev3ClassificationMatchDetails modelProbability(Float modelProbability) {
    this.modelProbability = modelProbability;
    return this;
  }

   /**
   * Get modelProbability
   * @return modelProbability
  **/
  @javax.annotation.Nullable
  public Float getModelProbability() {
    return modelProbability;
  }

  public void setModelProbability(Float modelProbability) {
    this.modelProbability = modelProbability;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsenginev3ClassificationMatchDetails riskanalyticsenginev3ClassificationMatchDetails = (Riskanalyticsenginev3ClassificationMatchDetails) o;
    return Objects.equals(this.classKey, riskanalyticsenginev3ClassificationMatchDetails.classKey) &&
        Objects.equals(this.classValue, riskanalyticsenginev3ClassificationMatchDetails.classValue) &&
        Objects.equals(this.classificationConfidence, riskanalyticsenginev3ClassificationMatchDetails.classificationConfidence) &&
        Objects.equals(this.classificationNls, riskanalyticsenginev3ClassificationMatchDetails.classificationNls) &&
        Objects.equals(this.modelProbability, riskanalyticsenginev3ClassificationMatchDetails.modelProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classKey, classValue, classificationConfidence, classificationNls, modelProbability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsenginev3ClassificationMatchDetails {\n");
    sb.append("    classKey: ").append(toIndentedString(classKey)).append("\n");
    sb.append("    classValue: ").append(toIndentedString(classValue)).append("\n");
    sb.append("    classificationConfidence: ").append(toIndentedString(classificationConfidence)).append("\n");
    sb.append("    classificationNls: ").append(toIndentedString(classificationNls)).append("\n");
    sb.append("    modelProbability: ").append(toIndentedString(modelProbability)).append("\n");
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
    openapiFields.add("class_key");
    openapiFields.add("class_value");
    openapiFields.add("classification_confidence");
    openapiFields.add("classification_nls");
    openapiFields.add("model_probability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsenginev3ClassificationMatchDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsenginev3ClassificationMatchDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsenginev3ClassificationMatchDetails is not found in the empty JSON string", Riskanalyticsenginev3ClassificationMatchDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsenginev3ClassificationMatchDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsenginev3ClassificationMatchDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("class_key") != null && !jsonObj.get("class_key").isJsonNull()) && !jsonObj.get("class_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_key").toString()));
      }
      if ((jsonObj.get("classification_nls") != null && !jsonObj.get("classification_nls").isJsonNull()) && !jsonObj.get("classification_nls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification_nls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification_nls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsenginev3ClassificationMatchDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsenginev3ClassificationMatchDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsenginev3ClassificationMatchDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsenginev3ClassificationMatchDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsenginev3ClassificationMatchDetails>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsenginev3ClassificationMatchDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsenginev3ClassificationMatchDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsenginev3ClassificationMatchDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsenginev3ClassificationMatchDetails
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsenginev3ClassificationMatchDetails
  */
  public static Riskanalyticsenginev3ClassificationMatchDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsenginev3ClassificationMatchDetails.class);
  }

 /**
  * Convert an instance of Riskanalyticsenginev3ClassificationMatchDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

