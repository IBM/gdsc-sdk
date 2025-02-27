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

import org.openapitools.client.JSON;

/**
 * UpdateRiskFeedbackRequest message for the UpdateRiskFeedback API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3UpdateRiskFeedbackRequest {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_FEEDBACK_CLASSIFICATION_KEY = "feedback_classification_key";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_CLASSIFICATION_KEY)
  private String feedbackClassificationKey;

  public static final String SERIALIZED_NAME_ORIGINAL_CLASSIFICATION_KEY = "original_classification_key";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_CLASSIFICATION_KEY)
  private String originalClassificationKey;

  public static final String SERIALIZED_NAME_RISK_IDS = "risk_ids";
  @SerializedName(SERIALIZED_NAME_RISK_IDS)
  private List<Integer> riskIds = new ArrayList<>();

  public Riskanalyticscontrollerv3UpdateRiskFeedbackRequest() {
  }

  public Riskanalyticscontrollerv3UpdateRiskFeedbackRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public Riskanalyticscontrollerv3UpdateRiskFeedbackRequest feedbackClassificationKey(String feedbackClassificationKey) {
    this.feedbackClassificationKey = feedbackClassificationKey;
    return this;
  }

   /**
   * Get feedbackClassificationKey
   * @return feedbackClassificationKey
  **/
  @javax.annotation.Nullable
  public String getFeedbackClassificationKey() {
    return feedbackClassificationKey;
  }

  public void setFeedbackClassificationKey(String feedbackClassificationKey) {
    this.feedbackClassificationKey = feedbackClassificationKey;
  }


  public Riskanalyticscontrollerv3UpdateRiskFeedbackRequest originalClassificationKey(String originalClassificationKey) {
    this.originalClassificationKey = originalClassificationKey;
    return this;
  }

   /**
   * Get originalClassificationKey
   * @return originalClassificationKey
  **/
  @javax.annotation.Nullable
  public String getOriginalClassificationKey() {
    return originalClassificationKey;
  }

  public void setOriginalClassificationKey(String originalClassificationKey) {
    this.originalClassificationKey = originalClassificationKey;
  }


  public Riskanalyticscontrollerv3UpdateRiskFeedbackRequest riskIds(List<Integer> riskIds) {
    this.riskIds = riskIds;
    return this;
  }

  public Riskanalyticscontrollerv3UpdateRiskFeedbackRequest addRiskIdsItem(Integer riskIdsItem) {
    if (this.riskIds == null) {
      this.riskIds = new ArrayList<>();
    }
    this.riskIds.add(riskIdsItem);
    return this;
  }

   /**
   * Get riskIds
   * @return riskIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getRiskIds() {
    return riskIds;
  }

  public void setRiskIds(List<Integer> riskIds) {
    this.riskIds = riskIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3UpdateRiskFeedbackRequest riskanalyticscontrollerv3UpdateRiskFeedbackRequest = (Riskanalyticscontrollerv3UpdateRiskFeedbackRequest) o;
    return Objects.equals(this.comment, riskanalyticscontrollerv3UpdateRiskFeedbackRequest.comment) &&
        Objects.equals(this.feedbackClassificationKey, riskanalyticscontrollerv3UpdateRiskFeedbackRequest.feedbackClassificationKey) &&
        Objects.equals(this.originalClassificationKey, riskanalyticscontrollerv3UpdateRiskFeedbackRequest.originalClassificationKey) &&
        Objects.equals(this.riskIds, riskanalyticscontrollerv3UpdateRiskFeedbackRequest.riskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, feedbackClassificationKey, originalClassificationKey, riskIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3UpdateRiskFeedbackRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    feedbackClassificationKey: ").append(toIndentedString(feedbackClassificationKey)).append("\n");
    sb.append("    originalClassificationKey: ").append(toIndentedString(originalClassificationKey)).append("\n");
    sb.append("    riskIds: ").append(toIndentedString(riskIds)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("feedback_classification_key");
    openapiFields.add("original_classification_key");
    openapiFields.add("risk_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3UpdateRiskFeedbackRequest is not found in the empty JSON string", Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3UpdateRiskFeedbackRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("feedback_classification_key") != null && !jsonObj.get("feedback_classification_key").isJsonNull()) && !jsonObj.get("feedback_classification_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback_classification_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedback_classification_key").toString()));
      }
      if ((jsonObj.get("original_classification_key") != null && !jsonObj.get("original_classification_key").isJsonNull()) && !jsonObj.get("original_classification_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_classification_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_classification_key").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("risk_ids") != null && !jsonObj.get("risk_ids").isJsonNull() && !jsonObj.get("risk_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_ids` to be an array in the JSON string but got `%s`", jsonObj.get("risk_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3UpdateRiskFeedbackRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3UpdateRiskFeedbackRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3UpdateRiskFeedbackRequest>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3UpdateRiskFeedbackRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3UpdateRiskFeedbackRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3UpdateRiskFeedbackRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
  */
  public static Riskanalyticscontrollerv3UpdateRiskFeedbackRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3UpdateRiskFeedbackRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

