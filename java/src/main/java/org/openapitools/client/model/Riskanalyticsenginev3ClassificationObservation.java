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

import org.openapitools.client.JSON;

/**
 * ClassificationObservation is a pair of key and value of observation that were found for this classification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsenginev3ClassificationObservation {
  public static final String SERIALIZED_NAME_IS_SUPPORTING_OBSERVATION = "is_supporting_observation";
  @SerializedName(SERIALIZED_NAME_IS_SUPPORTING_OBSERVATION)
  private Boolean isSupportingObservation;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_ORIGINAL_VALUE = "original_value";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_VALUE)
  private Float originalValue;

  public Riskanalyticsenginev3ClassificationObservation() {
  }

  public Riskanalyticsenginev3ClassificationObservation isSupportingObservation(Boolean isSupportingObservation) {
    this.isSupportingObservation = isSupportingObservation;
    return this;
  }

   /**
   * Is supporting observation - means is this observation used as a supporting observation for this classification.
   * @return isSupportingObservation
  **/
  @javax.annotation.Nullable
  public Boolean getIsSupportingObservation() {
    return isSupportingObservation;
  }

  public void setIsSupportingObservation(Boolean isSupportingObservation) {
    this.isSupportingObservation = isSupportingObservation;
  }


  public Riskanalyticsenginev3ClassificationObservation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Classification observation key.
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public Riskanalyticsenginev3ClassificationObservation originalValue(Float originalValue) {
    this.originalValue = originalValue;
    return this;
  }

   /**
   * Classification observation value before normalization.
   * @return originalValue
  **/
  @javax.annotation.Nullable
  public Float getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(Float originalValue) {
    this.originalValue = originalValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsenginev3ClassificationObservation riskanalyticsenginev3ClassificationObservation = (Riskanalyticsenginev3ClassificationObservation) o;
    return Objects.equals(this.isSupportingObservation, riskanalyticsenginev3ClassificationObservation.isSupportingObservation) &&
        Objects.equals(this.key, riskanalyticsenginev3ClassificationObservation.key) &&
        Objects.equals(this.originalValue, riskanalyticsenginev3ClassificationObservation.originalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSupportingObservation, key, originalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsenginev3ClassificationObservation {\n");
    sb.append("    isSupportingObservation: ").append(toIndentedString(isSupportingObservation)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
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
    openapiFields.add("is_supporting_observation");
    openapiFields.add("key");
    openapiFields.add("original_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsenginev3ClassificationObservation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsenginev3ClassificationObservation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsenginev3ClassificationObservation is not found in the empty JSON string", Riskanalyticsenginev3ClassificationObservation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsenginev3ClassificationObservation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsenginev3ClassificationObservation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsenginev3ClassificationObservation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsenginev3ClassificationObservation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsenginev3ClassificationObservation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsenginev3ClassificationObservation.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsenginev3ClassificationObservation>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsenginev3ClassificationObservation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsenginev3ClassificationObservation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsenginev3ClassificationObservation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsenginev3ClassificationObservation
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsenginev3ClassificationObservation
  */
  public static Riskanalyticsenginev3ClassificationObservation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsenginev3ClassificationObservation.class);
  }

 /**
  * Convert an instance of Riskanalyticsenginev3ClassificationObservation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

