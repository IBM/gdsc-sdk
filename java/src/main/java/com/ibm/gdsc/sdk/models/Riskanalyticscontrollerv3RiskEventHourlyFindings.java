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
import com.ibm.gdsc.sdk.models.Riskanalyticscontrollerv3Finding;
import com.ibm.gdsc.sdk.models.Riskanalyticscontrollerv3Indicator;
import com.ibm.gdsc.sdk.models.Riskanalyticsenginev3SeverityLevel;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * RiskEventHourlyFindings message represents the hourly findings of a given risk.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3RiskEventHourlyFindings {
  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private OffsetDateTime dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private OffsetDateTime dateTo;

  public static final String SERIALIZED_NAME_FINDINGS = "findings";
  @SerializedName(SERIALIZED_NAME_FINDINGS)
  private List<Riskanalyticscontrollerv3Finding> findings = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOURLY_CATEGORY = "hourly_category";
  @SerializedName(SERIALIZED_NAME_HOURLY_CATEGORY)
  private String hourlyCategory;

  public static final String SERIALIZED_NAME_HOURLY_CATEGORY_DESCRIPTION = "hourly_category_description";
  @SerializedName(SERIALIZED_NAME_HOURLY_CATEGORY_DESCRIPTION)
  private String hourlyCategoryDescription;

  public static final String SERIALIZED_NAME_HOURLY_DESCRIPTION = "hourly_description";
  @SerializedName(SERIALIZED_NAME_HOURLY_DESCRIPTION)
  private String hourlyDescription;

  public static final String SERIALIZED_NAME_HOURLY_SEVERITY_LEVEL = "hourly_severity_level";
  @SerializedName(SERIALIZED_NAME_HOURLY_SEVERITY_LEVEL)
  private Riskanalyticsenginev3SeverityLevel hourlySeverityLevel = Riskanalyticsenginev3SeverityLevel.UNDEFINED_SEVERITY_LEVEL;

  public static final String SERIALIZED_NAME_INDICATORS = "indicators";
  @SerializedName(SERIALIZED_NAME_INDICATORS)
  private List<Riskanalyticscontrollerv3Indicator> indicators = new ArrayList<>();

  public Riskanalyticscontrollerv3RiskEventHourlyFindings() {
  }

  public Riskanalyticscontrollerv3RiskEventHourlyFindings dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Start date of the data in format YYYY-MM-DDTHH:mm:ssZ.
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }


  public Riskanalyticscontrollerv3RiskEventHourlyFindings dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * End date of the data in format YYYY-MM-DDTHH:mm:ssZ.
   * @return dateTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  public Riskanalyticscontrollerv3RiskEventHourlyFindings findings(List<Riskanalyticscontrollerv3Finding> findings) {
    this.findings = findings;
    return this;
  }

  public Riskanalyticscontrollerv3RiskEventHourlyFindings addFindingsItem(Riskanalyticscontrollerv3Finding findingsItem) {
    if (this.findings == null) {
      this.findings = new ArrayList<>();
    }
    this.findings.add(findingsItem);
    return this;
  }

   /**
   * list of all the observations of the risk.
   * @return findings
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3Finding> getFindings() {
    return findings;
  }

  public void setFindings(List<Riskanalyticscontrollerv3Finding> findings) {
    this.findings = findings;
  }


  public Riskanalyticscontrollerv3RiskEventHourlyFindings hourlyCategory(String hourlyCategory) {
    this.hourlyCategory = hourlyCategory;
    return this;
  }

   /**
   * Classification of the risk in the given hour.
   * @return hourlyCategory
  **/
  @javax.annotation.Nullable
  public String getHourlyCategory() {
    return hourlyCategory;
  }

  public void setHourlyCategory(String hourlyCategory) {
    this.hourlyCategory = hourlyCategory;
  }


  public Riskanalyticscontrollerv3RiskEventHourlyFindings hourlyCategoryDescription(String hourlyCategoryDescription) {
    this.hourlyCategoryDescription = hourlyCategoryDescription;
    return this;
  }

   /**
   * Classification description of the risk in the given hour.
   * @return hourlyCategoryDescription
  **/
  @javax.annotation.Nullable
  public String getHourlyCategoryDescription() {
    return hourlyCategoryDescription;
  }

  public void setHourlyCategoryDescription(String hourlyCategoryDescription) {
    this.hourlyCategoryDescription = hourlyCategoryDescription;
  }


  public Riskanalyticscontrollerv3RiskEventHourlyFindings hourlyDescription(String hourlyDescription) {
    this.hourlyDescription = hourlyDescription;
    return this;
  }

   /**
   * Description of the risk.
   * @return hourlyDescription
  **/
  @javax.annotation.Nullable
  public String getHourlyDescription() {
    return hourlyDescription;
  }

  public void setHourlyDescription(String hourlyDescription) {
    this.hourlyDescription = hourlyDescription;
  }


  public Riskanalyticscontrollerv3RiskEventHourlyFindings hourlySeverityLevel(Riskanalyticsenginev3SeverityLevel hourlySeverityLevel) {
    this.hourlySeverityLevel = hourlySeverityLevel;
    return this;
  }

   /**
   * Get hourlySeverityLevel
   * @return hourlySeverityLevel
  **/
  @javax.annotation.Nullable
  public Riskanalyticsenginev3SeverityLevel getHourlySeverityLevel() {
    return hourlySeverityLevel;
  }

  public void setHourlySeverityLevel(Riskanalyticsenginev3SeverityLevel hourlySeverityLevel) {
    this.hourlySeverityLevel = hourlySeverityLevel;
  }


  public Riskanalyticscontrollerv3RiskEventHourlyFindings indicators(List<Riskanalyticscontrollerv3Indicator> indicators) {
    this.indicators = indicators;
    return this;
  }

  public Riskanalyticscontrollerv3RiskEventHourlyFindings addIndicatorsItem(Riskanalyticscontrollerv3Indicator indicatorsItem) {
    if (this.indicators == null) {
      this.indicators = new ArrayList<>();
    }
    this.indicators.add(indicatorsItem);
    return this;
  }

   /**
   * list of all the indicators - Optional (depending on include_indicators).
   * @return indicators
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3Indicator> getIndicators() {
    return indicators;
  }

  public void setIndicators(List<Riskanalyticscontrollerv3Indicator> indicators) {
    this.indicators = indicators;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3RiskEventHourlyFindings riskanalyticscontrollerv3RiskEventHourlyFindings = (Riskanalyticscontrollerv3RiskEventHourlyFindings) o;
    return Objects.equals(this.dateFrom, riskanalyticscontrollerv3RiskEventHourlyFindings.dateFrom) &&
        Objects.equals(this.dateTo, riskanalyticscontrollerv3RiskEventHourlyFindings.dateTo) &&
        Objects.equals(this.findings, riskanalyticscontrollerv3RiskEventHourlyFindings.findings) &&
        Objects.equals(this.hourlyCategory, riskanalyticscontrollerv3RiskEventHourlyFindings.hourlyCategory) &&
        Objects.equals(this.hourlyCategoryDescription, riskanalyticscontrollerv3RiskEventHourlyFindings.hourlyCategoryDescription) &&
        Objects.equals(this.hourlyDescription, riskanalyticscontrollerv3RiskEventHourlyFindings.hourlyDescription) &&
        Objects.equals(this.hourlySeverityLevel, riskanalyticscontrollerv3RiskEventHourlyFindings.hourlySeverityLevel) &&
        Objects.equals(this.indicators, riskanalyticscontrollerv3RiskEventHourlyFindings.indicators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, findings, hourlyCategory, hourlyCategoryDescription, hourlyDescription, hourlySeverityLevel, indicators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3RiskEventHourlyFindings {\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
    sb.append("    hourlyCategory: ").append(toIndentedString(hourlyCategory)).append("\n");
    sb.append("    hourlyCategoryDescription: ").append(toIndentedString(hourlyCategoryDescription)).append("\n");
    sb.append("    hourlyDescription: ").append(toIndentedString(hourlyDescription)).append("\n");
    sb.append("    hourlySeverityLevel: ").append(toIndentedString(hourlySeverityLevel)).append("\n");
    sb.append("    indicators: ").append(toIndentedString(indicators)).append("\n");
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
    openapiFields.add("date_from");
    openapiFields.add("date_to");
    openapiFields.add("findings");
    openapiFields.add("hourly_category");
    openapiFields.add("hourly_category_description");
    openapiFields.add("hourly_description");
    openapiFields.add("hourly_severity_level");
    openapiFields.add("indicators");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3RiskEventHourlyFindings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3RiskEventHourlyFindings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3RiskEventHourlyFindings is not found in the empty JSON string", Riskanalyticscontrollerv3RiskEventHourlyFindings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3RiskEventHourlyFindings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3RiskEventHourlyFindings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("findings") != null && !jsonObj.get("findings").isJsonNull()) {
        JsonArray jsonArrayfindings = jsonObj.getAsJsonArray("findings");
        if (jsonArrayfindings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("findings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `findings` to be an array in the JSON string but got `%s`", jsonObj.get("findings").toString()));
          }

          // validate the optional field `findings` (array)
          for (int i = 0; i < jsonArrayfindings.size(); i++) {
            Riskanalyticscontrollerv3Finding.validateJsonElement(jsonArrayfindings.get(i));
          };
        }
      }
      if ((jsonObj.get("hourly_category") != null && !jsonObj.get("hourly_category").isJsonNull()) && !jsonObj.get("hourly_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_category").toString()));
      }
      if ((jsonObj.get("hourly_category_description") != null && !jsonObj.get("hourly_category_description").isJsonNull()) && !jsonObj.get("hourly_category_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_category_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_category_description").toString()));
      }
      if ((jsonObj.get("hourly_description") != null && !jsonObj.get("hourly_description").isJsonNull()) && !jsonObj.get("hourly_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_description").toString()));
      }
      // validate the optional field `hourly_severity_level`
      if (jsonObj.get("hourly_severity_level") != null && !jsonObj.get("hourly_severity_level").isJsonNull()) {
        Riskanalyticsenginev3SeverityLevel.validateJsonElement(jsonObj.get("hourly_severity_level"));
      }
      if (jsonObj.get("indicators") != null && !jsonObj.get("indicators").isJsonNull()) {
        JsonArray jsonArrayindicators = jsonObj.getAsJsonArray("indicators");
        if (jsonArrayindicators != null) {
          // ensure the json data is an array
          if (!jsonObj.get("indicators").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `indicators` to be an array in the JSON string but got `%s`", jsonObj.get("indicators").toString()));
          }

          // validate the optional field `indicators` (array)
          for (int i = 0; i < jsonArrayindicators.size(); i++) {
            Riskanalyticscontrollerv3Indicator.validateJsonElement(jsonArrayindicators.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3RiskEventHourlyFindings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3RiskEventHourlyFindings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3RiskEventHourlyFindings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3RiskEventHourlyFindings.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3RiskEventHourlyFindings>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3RiskEventHourlyFindings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3RiskEventHourlyFindings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3RiskEventHourlyFindings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3RiskEventHourlyFindings
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3RiskEventHourlyFindings
  */
  public static Riskanalyticscontrollerv3RiskEventHourlyFindings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3RiskEventHourlyFindings.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3RiskEventHourlyFindings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

