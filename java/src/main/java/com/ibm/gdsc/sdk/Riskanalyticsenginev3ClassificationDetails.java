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
import com.ibm.gdsc.sdk.Riskanalyticsenginev3ClassificationMatchDetails;
import com.ibm.gdsc.sdk.Riskanalyticsenginev3ClassificationObservation;
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
 * ClassificationDetails message an additional info for the classification the UI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsenginev3ClassificationDetails {
  public static final String SERIALIZED_NAME_CLASS_DESCRIPTION_NLS = "class_description_nls";
  @SerializedName(SERIALIZED_NAME_CLASS_DESCRIPTION_NLS)
  private String classDescriptionNls;

  public static final String SERIALIZED_NAME_CLASS_KEY = "class_key";
  @SerializedName(SERIALIZED_NAME_CLASS_KEY)
  private String classKey;

  public static final String SERIALIZED_NAME_CLASS_NLS = "class_nls";
  @SerializedName(SERIALIZED_NAME_CLASS_NLS)
  private String classNls;

  public static final String SERIALIZED_NAME_CLASS_OBSERVATIONS = "class_observations";
  @SerializedName(SERIALIZED_NAME_CLASS_OBSERVATIONS)
  private List<Riskanalyticsenginev3ClassificationObservation> classObservations = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLASS_VALUE = "class_value";
  @SerializedName(SERIALIZED_NAME_CLASS_VALUE)
  private Float classValue;

  public static final String SERIALIZED_NAME_CLASSIFICATION_MATCH_DETAILS = "classification_match_details";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_MATCH_DETAILS)
  private List<Riskanalyticsenginev3ClassificationMatchDetails> classificationMatchDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLASSIFICATION_MODIFIED = "classification_modified";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_MODIFIED)
  private Boolean classificationModified;

  public Riskanalyticsenginev3ClassificationDetails() {
  }

  public Riskanalyticsenginev3ClassificationDetails classDescriptionNls(String classDescriptionNls) {
    this.classDescriptionNls = classDescriptionNls;
    return this;
  }

   /**
   * Class description for UI with translation.
   * @return classDescriptionNls
  **/
  @javax.annotation.Nullable
  public String getClassDescriptionNls() {
    return classDescriptionNls;
  }

  public void setClassDescriptionNls(String classDescriptionNls) {
    this.classDescriptionNls = classDescriptionNls;
  }


  public Riskanalyticsenginev3ClassificationDetails classKey(String classKey) {
    this.classKey = classKey;
    return this;
  }

   /**
   * Key of the classification found for this risk.
   * @return classKey
  **/
  @javax.annotation.Nullable
  public String getClassKey() {
    return classKey;
  }

  public void setClassKey(String classKey) {
    this.classKey = classKey;
  }


  public Riskanalyticsenginev3ClassificationDetails classNls(String classNls) {
    this.classNls = classNls;
    return this;
  }

   /**
   * Key of the classification found for this risk.
   * @return classNls
  **/
  @javax.annotation.Nullable
  public String getClassNls() {
    return classNls;
  }

  public void setClassNls(String classNls) {
    this.classNls = classNls;
  }


  public Riskanalyticsenginev3ClassificationDetails classObservations(List<Riskanalyticsenginev3ClassificationObservation> classObservations) {
    this.classObservations = classObservations;
    return this;
  }

  public Riskanalyticsenginev3ClassificationDetails addClassObservationsItem(Riskanalyticsenginev3ClassificationObservation classObservationsItem) {
    if (this.classObservations == null) {
      this.classObservations = new ArrayList<>();
    }
    this.classObservations.add(classObservationsItem);
    return this;
  }

   /**
   * Classification Observation array of observations that were found for this classification.
   * @return classObservations
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsenginev3ClassificationObservation> getClassObservations() {
    return classObservations;
  }

  public void setClassObservations(List<Riskanalyticsenginev3ClassificationObservation> classObservations) {
    this.classObservations = classObservations;
  }


  public Riskanalyticsenginev3ClassificationDetails classValue(Float classValue) {
    this.classValue = classValue;
    return this;
  }

   /**
   * Value of the classification found for this risk.
   * @return classValue
  **/
  @javax.annotation.Nullable
  public Float getClassValue() {
    return classValue;
  }

  public void setClassValue(Float classValue) {
    this.classValue = classValue;
  }


  public Riskanalyticsenginev3ClassificationDetails classificationMatchDetails(List<Riskanalyticsenginev3ClassificationMatchDetails> classificationMatchDetails) {
    this.classificationMatchDetails = classificationMatchDetails;
    return this;
  }

  public Riskanalyticsenginev3ClassificationDetails addClassificationMatchDetailsItem(Riskanalyticsenginev3ClassificationMatchDetails classificationMatchDetailsItem) {
    if (this.classificationMatchDetails == null) {
      this.classificationMatchDetails = new ArrayList<>();
    }
    this.classificationMatchDetails.add(classificationMatchDetailsItem);
    return this;
  }

   /**
   * Get classificationMatchDetails
   * @return classificationMatchDetails
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsenginev3ClassificationMatchDetails> getClassificationMatchDetails() {
    return classificationMatchDetails;
  }

  public void setClassificationMatchDetails(List<Riskanalyticsenginev3ClassificationMatchDetails> classificationMatchDetails) {
    this.classificationMatchDetails = classificationMatchDetails;
  }


  public Riskanalyticsenginev3ClassificationDetails classificationModified(Boolean classificationModified) {
    this.classificationModified = classificationModified;
    return this;
  }

   /**
   * Get classificationModified
   * @return classificationModified
  **/
  @javax.annotation.Nullable
  public Boolean getClassificationModified() {
    return classificationModified;
  }

  public void setClassificationModified(Boolean classificationModified) {
    this.classificationModified = classificationModified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsenginev3ClassificationDetails riskanalyticsenginev3ClassificationDetails = (Riskanalyticsenginev3ClassificationDetails) o;
    return Objects.equals(this.classDescriptionNls, riskanalyticsenginev3ClassificationDetails.classDescriptionNls) &&
        Objects.equals(this.classKey, riskanalyticsenginev3ClassificationDetails.classKey) &&
        Objects.equals(this.classNls, riskanalyticsenginev3ClassificationDetails.classNls) &&
        Objects.equals(this.classObservations, riskanalyticsenginev3ClassificationDetails.classObservations) &&
        Objects.equals(this.classValue, riskanalyticsenginev3ClassificationDetails.classValue) &&
        Objects.equals(this.classificationMatchDetails, riskanalyticsenginev3ClassificationDetails.classificationMatchDetails) &&
        Objects.equals(this.classificationModified, riskanalyticsenginev3ClassificationDetails.classificationModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classDescriptionNls, classKey, classNls, classObservations, classValue, classificationMatchDetails, classificationModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsenginev3ClassificationDetails {\n");
    sb.append("    classDescriptionNls: ").append(toIndentedString(classDescriptionNls)).append("\n");
    sb.append("    classKey: ").append(toIndentedString(classKey)).append("\n");
    sb.append("    classNls: ").append(toIndentedString(classNls)).append("\n");
    sb.append("    classObservations: ").append(toIndentedString(classObservations)).append("\n");
    sb.append("    classValue: ").append(toIndentedString(classValue)).append("\n");
    sb.append("    classificationMatchDetails: ").append(toIndentedString(classificationMatchDetails)).append("\n");
    sb.append("    classificationModified: ").append(toIndentedString(classificationModified)).append("\n");
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
    openapiFields.add("class_description_nls");
    openapiFields.add("class_key");
    openapiFields.add("class_nls");
    openapiFields.add("class_observations");
    openapiFields.add("class_value");
    openapiFields.add("classification_match_details");
    openapiFields.add("classification_modified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsenginev3ClassificationDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsenginev3ClassificationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsenginev3ClassificationDetails is not found in the empty JSON string", Riskanalyticsenginev3ClassificationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsenginev3ClassificationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsenginev3ClassificationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("class_description_nls") != null && !jsonObj.get("class_description_nls").isJsonNull()) && !jsonObj.get("class_description_nls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_description_nls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_description_nls").toString()));
      }
      if ((jsonObj.get("class_key") != null && !jsonObj.get("class_key").isJsonNull()) && !jsonObj.get("class_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_key").toString()));
      }
      if ((jsonObj.get("class_nls") != null && !jsonObj.get("class_nls").isJsonNull()) && !jsonObj.get("class_nls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_nls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_nls").toString()));
      }
      if (jsonObj.get("class_observations") != null && !jsonObj.get("class_observations").isJsonNull()) {
        JsonArray jsonArrayclassObservations = jsonObj.getAsJsonArray("class_observations");
        if (jsonArrayclassObservations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("class_observations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `class_observations` to be an array in the JSON string but got `%s`", jsonObj.get("class_observations").toString()));
          }

          // validate the optional field `class_observations` (array)
          for (int i = 0; i < jsonArrayclassObservations.size(); i++) {
            Riskanalyticsenginev3ClassificationObservation.validateJsonElement(jsonArrayclassObservations.get(i));
          };
        }
      }
      if (jsonObj.get("classification_match_details") != null && !jsonObj.get("classification_match_details").isJsonNull()) {
        JsonArray jsonArrayclassificationMatchDetails = jsonObj.getAsJsonArray("classification_match_details");
        if (jsonArrayclassificationMatchDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("classification_match_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `classification_match_details` to be an array in the JSON string but got `%s`", jsonObj.get("classification_match_details").toString()));
          }

          // validate the optional field `classification_match_details` (array)
          for (int i = 0; i < jsonArrayclassificationMatchDetails.size(); i++) {
            Riskanalyticsenginev3ClassificationMatchDetails.validateJsonElement(jsonArrayclassificationMatchDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsenginev3ClassificationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsenginev3ClassificationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsenginev3ClassificationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsenginev3ClassificationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsenginev3ClassificationDetails>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsenginev3ClassificationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsenginev3ClassificationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsenginev3ClassificationDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsenginev3ClassificationDetails
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsenginev3ClassificationDetails
  */
  public static Riskanalyticsenginev3ClassificationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsenginev3ClassificationDetails.class);
  }

 /**
  * Convert an instance of Riskanalyticsenginev3ClassificationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

