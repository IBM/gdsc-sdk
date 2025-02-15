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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Riskanalyticscontrollerv3ShortObservation;
import com.ibm.gdsc.sdk.Riskanalyticscontrollerv3Status;
import com.ibm.gdsc.sdk.Riskanalyticsenginev3Pivot;
import com.ibm.gdsc.sdk.Riskanalyticsenginev3SeverityLevel;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Risk event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3RiskEvent {
  public static final String SERIALIZED_NAME_CATEGORIZATION_CONFIDENCE = "categorization_confidence";
  @SerializedName(SERIALIZED_NAME_CATEGORIZATION_CONFIDENCE)
  private Float categorizationConfidence;

  public static final String SERIALIZED_NAME_CATEGORIZATION_MODIFIED = "categorization_modified";
  @SerializedName(SERIALIZED_NAME_CATEGORIZATION_MODIFIED)
  private Boolean categorizationModified;

  public static final String SERIALIZED_NAME_CATEGORY_DESCRIPTION = "category_description";
  @SerializedName(SERIALIZED_NAME_CATEGORY_DESCRIPTION)
  private String categoryDescription;

  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private String classification;

  public static final String SERIALIZED_NAME_CLASSIFICATION_NLS = "classification_nls";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_NLS)
  private String classificationNls;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMERGING_RISK = "emerging_risk";
  @SerializedName(SERIALIZED_NAME_EMERGING_RISK)
  private Boolean emergingRisk;

  public static final String SERIALIZED_NAME_FROM_DATE = "from_date";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private OffsetDateTime fromDate;

  public static final String SERIALIZED_NAME_JUSTIFICATION = "justification";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATION)
  private String justification;

  public static final String SERIALIZED_NAME_PIVOT = "pivot";
  @SerializedName(SERIALIZED_NAME_PIVOT)
  private Riskanalyticsenginev3Pivot pivot;

  public static final String SERIALIZED_NAME_RISK_ID = "risk_id";
  @SerializedName(SERIALIZED_NAME_RISK_ID)
  private Integer riskId;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;

  public static final String SERIALIZED_NAME_SEVERITY_LEVEL = "severity_level";
  @SerializedName(SERIALIZED_NAME_SEVERITY_LEVEL)
  private Riskanalyticsenginev3SeverityLevel severityLevel = Riskanalyticsenginev3SeverityLevel.UNDEFINED_SEVERITY_LEVEL;

  public static final String SERIALIZED_NAME_SHORT_OBSERVATIONS = "short_observations";
  @SerializedName(SERIALIZED_NAME_SHORT_OBSERVATIONS)
  private List<Riskanalyticscontrollerv3ShortObservation> shortObservations = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Riskanalyticscontrollerv3Status status = Riskanalyticscontrollerv3Status.UNDEFINED_STATUS;

  public static final String SERIALIZED_NAME_STATUS_CHANGED_BY_USER_NAME = "status_changed_by_user_name";
  @SerializedName(SERIALIZED_NAME_STATUS_CHANGED_BY_USER_NAME)
  private String statusChangedByUserName;

  public static final String SERIALIZED_NAME_TO_DATE = "to_date";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private OffsetDateTime toDate;

  public Riskanalyticscontrollerv3RiskEvent() {
  }

  public Riskanalyticscontrollerv3RiskEvent categorizationConfidence(Float categorizationConfidence) {
    this.categorizationConfidence = categorizationConfidence;
    return this;
  }

   /**
   * Get categorizationConfidence
   * @return categorizationConfidence
  **/
  @javax.annotation.Nullable
  public Float getCategorizationConfidence() {
    return categorizationConfidence;
  }

  public void setCategorizationConfidence(Float categorizationConfidence) {
    this.categorizationConfidence = categorizationConfidence;
  }


  public Riskanalyticscontrollerv3RiskEvent categorizationModified(Boolean categorizationModified) {
    this.categorizationModified = categorizationModified;
    return this;
  }

   /**
   * Get categorizationModified
   * @return categorizationModified
  **/
  @javax.annotation.Nullable
  public Boolean getCategorizationModified() {
    return categorizationModified;
  }

  public void setCategorizationModified(Boolean categorizationModified) {
    this.categorizationModified = categorizationModified;
  }


  public Riskanalyticscontrollerv3RiskEvent categoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
    return this;
  }

   /**
   * Category description of the risk.
   * @return categoryDescription
  **/
  @javax.annotation.Nullable
  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }


  public Riskanalyticscontrollerv3RiskEvent classification(String classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Classification of the risk // key of the classification.
   * @return classification
  **/
  @javax.annotation.Nullable
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }


  public Riskanalyticscontrollerv3RiskEvent classificationNls(String classificationNls) {
    this.classificationNls = classificationNls;
    return this;
  }

   /**
   * Classification nls // key of nls.
   * @return classificationNls
  **/
  @javax.annotation.Nullable
  public String getClassificationNls() {
    return classificationNls;
  }

  public void setClassificationNls(String classificationNls) {
    this.classificationNls = classificationNls;
  }


  public Riskanalyticscontrollerv3RiskEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the risk.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Riskanalyticscontrollerv3RiskEvent emergingRisk(Boolean emergingRisk) {
    this.emergingRisk = emergingRisk;
    return this;
  }

   /**
   * Flag for emerging risks.
   * @return emergingRisk
  **/
  @javax.annotation.Nullable
  public Boolean getEmergingRisk() {
    return emergingRisk;
  }

  public void setEmergingRisk(Boolean emergingRisk) {
    this.emergingRisk = emergingRisk;
  }


  public Riskanalyticscontrollerv3RiskEvent fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Opened date in format YYYY-MM-DDTHH:mm:ssZ.
   * @return fromDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }


  public Riskanalyticscontrollerv3RiskEvent justification(String justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Justification.
   * @return justification
  **/
  @javax.annotation.Nullable
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }


  public Riskanalyticscontrollerv3RiskEvent pivot(Riskanalyticsenginev3Pivot pivot) {
    this.pivot = pivot;
    return this;
  }

   /**
   * Get pivot
   * @return pivot
  **/
  @javax.annotation.Nullable
  public Riskanalyticsenginev3Pivot getPivot() {
    return pivot;
  }

  public void setPivot(Riskanalyticsenginev3Pivot pivot) {
    this.pivot = pivot;
  }


  public Riskanalyticscontrollerv3RiskEvent riskId(Integer riskId) {
    this.riskId = riskId;
    return this;
  }

   /**
   * Risk id.
   * @return riskId
  **/
  @javax.annotation.Nullable
  public Integer getRiskId() {
    return riskId;
  }

  public void setRiskId(Integer riskId) {
    this.riskId = riskId;
  }


  public Riskanalyticscontrollerv3RiskEvent severity(Integer severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Severity of the risk.
   * @return severity
  **/
  @javax.annotation.Nullable
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  public Riskanalyticscontrollerv3RiskEvent severityLevel(Riskanalyticsenginev3SeverityLevel severityLevel) {
    this.severityLevel = severityLevel;
    return this;
  }

   /**
   * Get severityLevel
   * @return severityLevel
  **/
  @javax.annotation.Nullable
  public Riskanalyticsenginev3SeverityLevel getSeverityLevel() {
    return severityLevel;
  }

  public void setSeverityLevel(Riskanalyticsenginev3SeverityLevel severityLevel) {
    this.severityLevel = severityLevel;
  }


  public Riskanalyticscontrollerv3RiskEvent shortObservations(List<Riskanalyticscontrollerv3ShortObservation> shortObservations) {
    this.shortObservations = shortObservations;
    return this;
  }

  public Riskanalyticscontrollerv3RiskEvent addShortObservationsItem(Riskanalyticscontrollerv3ShortObservation shortObservationsItem) {
    if (this.shortObservations == null) {
      this.shortObservations = new ArrayList<>();
    }
    this.shortObservations.add(shortObservationsItem);
    return this;
  }

   /**
   * Observations of the risk.
   * @return shortObservations
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3ShortObservation> getShortObservations() {
    return shortObservations;
  }

  public void setShortObservations(List<Riskanalyticscontrollerv3ShortObservation> shortObservations) {
    this.shortObservations = shortObservations;
  }


  public Riskanalyticscontrollerv3RiskEvent status(Riskanalyticscontrollerv3Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3Status getStatus() {
    return status;
  }

  public void setStatus(Riskanalyticscontrollerv3Status status) {
    this.status = status;
  }


  public Riskanalyticscontrollerv3RiskEvent statusChangedByUserName(String statusChangedByUserName) {
    this.statusChangedByUserName = statusChangedByUserName;
    return this;
  }

   /**
   * Status changed by the user name.
   * @return statusChangedByUserName
  **/
  @javax.annotation.Nullable
  public String getStatusChangedByUserName() {
    return statusChangedByUserName;
  }

  public void setStatusChangedByUserName(String statusChangedByUserName) {
    this.statusChangedByUserName = statusChangedByUserName;
  }


  public Riskanalyticscontrollerv3RiskEvent toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Last updated date in format YYYY-MM-DDTHH:mm:ssZ.
   * @return toDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3RiskEvent riskanalyticscontrollerv3RiskEvent = (Riskanalyticscontrollerv3RiskEvent) o;
    return Objects.equals(this.categorizationConfidence, riskanalyticscontrollerv3RiskEvent.categorizationConfidence) &&
        Objects.equals(this.categorizationModified, riskanalyticscontrollerv3RiskEvent.categorizationModified) &&
        Objects.equals(this.categoryDescription, riskanalyticscontrollerv3RiskEvent.categoryDescription) &&
        Objects.equals(this.classification, riskanalyticscontrollerv3RiskEvent.classification) &&
        Objects.equals(this.classificationNls, riskanalyticscontrollerv3RiskEvent.classificationNls) &&
        Objects.equals(this.description, riskanalyticscontrollerv3RiskEvent.description) &&
        Objects.equals(this.emergingRisk, riskanalyticscontrollerv3RiskEvent.emergingRisk) &&
        Objects.equals(this.fromDate, riskanalyticscontrollerv3RiskEvent.fromDate) &&
        Objects.equals(this.justification, riskanalyticscontrollerv3RiskEvent.justification) &&
        Objects.equals(this.pivot, riskanalyticscontrollerv3RiskEvent.pivot) &&
        Objects.equals(this.riskId, riskanalyticscontrollerv3RiskEvent.riskId) &&
        Objects.equals(this.severity, riskanalyticscontrollerv3RiskEvent.severity) &&
        Objects.equals(this.severityLevel, riskanalyticscontrollerv3RiskEvent.severityLevel) &&
        Objects.equals(this.shortObservations, riskanalyticscontrollerv3RiskEvent.shortObservations) &&
        Objects.equals(this.status, riskanalyticscontrollerv3RiskEvent.status) &&
        Objects.equals(this.statusChangedByUserName, riskanalyticscontrollerv3RiskEvent.statusChangedByUserName) &&
        Objects.equals(this.toDate, riskanalyticscontrollerv3RiskEvent.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorizationConfidence, categorizationModified, categoryDescription, classification, classificationNls, description, emergingRisk, fromDate, justification, pivot, riskId, severity, severityLevel, shortObservations, status, statusChangedByUserName, toDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3RiskEvent {\n");
    sb.append("    categorizationConfidence: ").append(toIndentedString(categorizationConfidence)).append("\n");
    sb.append("    categorizationModified: ").append(toIndentedString(categorizationModified)).append("\n");
    sb.append("    categoryDescription: ").append(toIndentedString(categoryDescription)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    classificationNls: ").append(toIndentedString(classificationNls)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emergingRisk: ").append(toIndentedString(emergingRisk)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    pivot: ").append(toIndentedString(pivot)).append("\n");
    sb.append("    riskId: ").append(toIndentedString(riskId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
    sb.append("    shortObservations: ").append(toIndentedString(shortObservations)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedByUserName: ").append(toIndentedString(statusChangedByUserName)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
    openapiFields.add("categorization_confidence");
    openapiFields.add("categorization_modified");
    openapiFields.add("category_description");
    openapiFields.add("classification");
    openapiFields.add("classification_nls");
    openapiFields.add("description");
    openapiFields.add("emerging_risk");
    openapiFields.add("from_date");
    openapiFields.add("justification");
    openapiFields.add("pivot");
    openapiFields.add("risk_id");
    openapiFields.add("severity");
    openapiFields.add("severity_level");
    openapiFields.add("short_observations");
    openapiFields.add("status");
    openapiFields.add("status_changed_by_user_name");
    openapiFields.add("to_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3RiskEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3RiskEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3RiskEvent is not found in the empty JSON string", Riskanalyticscontrollerv3RiskEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3RiskEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3RiskEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("category_description") != null && !jsonObj.get("category_description").isJsonNull()) && !jsonObj.get("category_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_description").toString()));
      }
      if ((jsonObj.get("classification") != null && !jsonObj.get("classification").isJsonNull()) && !jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
      if ((jsonObj.get("classification_nls") != null && !jsonObj.get("classification_nls").isJsonNull()) && !jsonObj.get("classification_nls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification_nls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification_nls").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("justification") != null && !jsonObj.get("justification").isJsonNull()) && !jsonObj.get("justification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `justification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("justification").toString()));
      }
      // validate the optional field `pivot`
      if (jsonObj.get("pivot") != null && !jsonObj.get("pivot").isJsonNull()) {
        Riskanalyticsenginev3Pivot.validateJsonElement(jsonObj.get("pivot"));
      }
      // validate the optional field `severity_level`
      if (jsonObj.get("severity_level") != null && !jsonObj.get("severity_level").isJsonNull()) {
        Riskanalyticsenginev3SeverityLevel.validateJsonElement(jsonObj.get("severity_level"));
      }
      if (jsonObj.get("short_observations") != null && !jsonObj.get("short_observations").isJsonNull()) {
        JsonArray jsonArrayshortObservations = jsonObj.getAsJsonArray("short_observations");
        if (jsonArrayshortObservations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("short_observations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `short_observations` to be an array in the JSON string but got `%s`", jsonObj.get("short_observations").toString()));
          }

          // validate the optional field `short_observations` (array)
          for (int i = 0; i < jsonArrayshortObservations.size(); i++) {
            Riskanalyticscontrollerv3ShortObservation.validateJsonElement(jsonArrayshortObservations.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Riskanalyticscontrollerv3Status.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("status_changed_by_user_name") != null && !jsonObj.get("status_changed_by_user_name").isJsonNull()) && !jsonObj.get("status_changed_by_user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_changed_by_user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_changed_by_user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3RiskEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3RiskEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3RiskEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3RiskEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3RiskEvent>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3RiskEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3RiskEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3RiskEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3RiskEvent
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3RiskEvent
  */
  public static Riskanalyticscontrollerv3RiskEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3RiskEvent.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3RiskEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

