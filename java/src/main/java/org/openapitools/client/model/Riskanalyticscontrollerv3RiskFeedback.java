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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Riskanalyticsenginev3Feature;
import org.openapitools.client.model.Riskanalyticsenginev3SeverityLevel;

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
 * RiskFeedback represent feedback object in status NEW that should be sent to UI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3RiskFeedback {
  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_CREATION_TIME = "creation_time";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<Riskanalyticsenginev3Feature> features = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEW_CLASSIFICATION = "new_classification";
  @SerializedName(SERIALIZED_NAME_NEW_CLASSIFICATION)
  private String newClassification;

  public static final String SERIALIZED_NAME_NEW_SEVERITY = "new_severity";
  @SerializedName(SERIALIZED_NAME_NEW_SEVERITY)
  private Riskanalyticsenginev3SeverityLevel newSeverity = Riskanalyticsenginev3SeverityLevel.UNDEFINED_SEVERITY_LEVEL;

  public static final String SERIALIZED_NAME_OLD_CLASSIFICATION = "old_classification";
  @SerializedName(SERIALIZED_NAME_OLD_CLASSIFICATION)
  private String oldClassification;

  public static final String SERIALIZED_NAME_OLD_SEVERITY = "old_severity";
  @SerializedName(SERIALIZED_NAME_OLD_SEVERITY)
  private Riskanalyticsenginev3SeverityLevel oldSeverity = Riskanalyticsenginev3SeverityLevel.UNDEFINED_SEVERITY_LEVEL;

  public Riskanalyticscontrollerv3RiskFeedback() {
  }

  public Riskanalyticscontrollerv3RiskFeedback comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Feedback comments.
   * @return comments
  **/
  @javax.annotation.Nullable
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  public Riskanalyticscontrollerv3RiskFeedback creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Feedback creation time.
   * @return creationTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public Riskanalyticscontrollerv3RiskFeedback features(List<Riskanalyticsenginev3Feature> features) {
    this.features = features;
    return this;
  }

  public Riskanalyticscontrollerv3RiskFeedback addFeaturesItem(Riskanalyticsenginev3Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * List of features for the risk that related to this feedback.
   * @return features
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsenginev3Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Riskanalyticsenginev3Feature> features) {
    this.features = features;
  }


  public Riskanalyticscontrollerv3RiskFeedback newClassification(String newClassification) {
    this.newClassification = newClassification;
    return this;
  }

   /**
   * Feedback classification.
   * @return newClassification
  **/
  @javax.annotation.Nullable
  public String getNewClassification() {
    return newClassification;
  }

  public void setNewClassification(String newClassification) {
    this.newClassification = newClassification;
  }


  public Riskanalyticscontrollerv3RiskFeedback newSeverity(Riskanalyticsenginev3SeverityLevel newSeverity) {
    this.newSeverity = newSeverity;
    return this;
  }

   /**
   * Get newSeverity
   * @return newSeverity
  **/
  @javax.annotation.Nullable
  public Riskanalyticsenginev3SeverityLevel getNewSeverity() {
    return newSeverity;
  }

  public void setNewSeverity(Riskanalyticsenginev3SeverityLevel newSeverity) {
    this.newSeverity = newSeverity;
  }


  public Riskanalyticscontrollerv3RiskFeedback oldClassification(String oldClassification) {
    this.oldClassification = oldClassification;
    return this;
  }

   /**
   * Original classification.
   * @return oldClassification
  **/
  @javax.annotation.Nullable
  public String getOldClassification() {
    return oldClassification;
  }

  public void setOldClassification(String oldClassification) {
    this.oldClassification = oldClassification;
  }


  public Riskanalyticscontrollerv3RiskFeedback oldSeverity(Riskanalyticsenginev3SeverityLevel oldSeverity) {
    this.oldSeverity = oldSeverity;
    return this;
  }

   /**
   * Get oldSeverity
   * @return oldSeverity
  **/
  @javax.annotation.Nullable
  public Riskanalyticsenginev3SeverityLevel getOldSeverity() {
    return oldSeverity;
  }

  public void setOldSeverity(Riskanalyticsenginev3SeverityLevel oldSeverity) {
    this.oldSeverity = oldSeverity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3RiskFeedback riskanalyticscontrollerv3RiskFeedback = (Riskanalyticscontrollerv3RiskFeedback) o;
    return Objects.equals(this.comments, riskanalyticscontrollerv3RiskFeedback.comments) &&
        Objects.equals(this.creationTime, riskanalyticscontrollerv3RiskFeedback.creationTime) &&
        Objects.equals(this.features, riskanalyticscontrollerv3RiskFeedback.features) &&
        Objects.equals(this.newClassification, riskanalyticscontrollerv3RiskFeedback.newClassification) &&
        Objects.equals(this.newSeverity, riskanalyticscontrollerv3RiskFeedback.newSeverity) &&
        Objects.equals(this.oldClassification, riskanalyticscontrollerv3RiskFeedback.oldClassification) &&
        Objects.equals(this.oldSeverity, riskanalyticscontrollerv3RiskFeedback.oldSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, creationTime, features, newClassification, newSeverity, oldClassification, oldSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3RiskFeedback {\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    newClassification: ").append(toIndentedString(newClassification)).append("\n");
    sb.append("    newSeverity: ").append(toIndentedString(newSeverity)).append("\n");
    sb.append("    oldClassification: ").append(toIndentedString(oldClassification)).append("\n");
    sb.append("    oldSeverity: ").append(toIndentedString(oldSeverity)).append("\n");
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
    openapiFields.add("comments");
    openapiFields.add("creation_time");
    openapiFields.add("features");
    openapiFields.add("new_classification");
    openapiFields.add("new_severity");
    openapiFields.add("old_classification");
    openapiFields.add("old_severity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3RiskFeedback
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3RiskFeedback.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3RiskFeedback is not found in the empty JSON string", Riskanalyticscontrollerv3RiskFeedback.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3RiskFeedback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3RiskFeedback` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("features");
        if (jsonArrayfeatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("features").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
          }

          // validate the optional field `features` (array)
          for (int i = 0; i < jsonArrayfeatures.size(); i++) {
            Riskanalyticsenginev3Feature.validateJsonElement(jsonArrayfeatures.get(i));
          };
        }
      }
      if ((jsonObj.get("new_classification") != null && !jsonObj.get("new_classification").isJsonNull()) && !jsonObj.get("new_classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_classification").toString()));
      }
      // validate the optional field `new_severity`
      if (jsonObj.get("new_severity") != null && !jsonObj.get("new_severity").isJsonNull()) {
        Riskanalyticsenginev3SeverityLevel.validateJsonElement(jsonObj.get("new_severity"));
      }
      if ((jsonObj.get("old_classification") != null && !jsonObj.get("old_classification").isJsonNull()) && !jsonObj.get("old_classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `old_classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("old_classification").toString()));
      }
      // validate the optional field `old_severity`
      if (jsonObj.get("old_severity") != null && !jsonObj.get("old_severity").isJsonNull()) {
        Riskanalyticsenginev3SeverityLevel.validateJsonElement(jsonObj.get("old_severity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3RiskFeedback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3RiskFeedback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3RiskFeedback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3RiskFeedback.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3RiskFeedback>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3RiskFeedback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3RiskFeedback read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3RiskFeedback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3RiskFeedback
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3RiskFeedback
  */
  public static Riskanalyticscontrollerv3RiskFeedback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3RiskFeedback.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3RiskFeedback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

