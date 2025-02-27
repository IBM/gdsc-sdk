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
import com.ibm.security.guardium.Riskanalyticscontrollerv3RiskEvent;
import com.ibm.security.guardium.Riskanalyticscontrollerv3RiskEventFormerHours;
import com.ibm.security.guardium.Riskanalyticscontrollerv3RiskEventHourlyFindings;
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
 * RiskEventSummarizationDataResponse message for the GetRiskEventDataForSummarization api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3RiskEventSummarizationDataResponse {
  public static final String SERIALIZED_NAME_FORMER_HOURS = "former_hours";
  @SerializedName(SERIALIZED_NAME_FORMER_HOURS)
  private Riskanalyticscontrollerv3RiskEventFormerHours formerHours;

  public static final String SERIALIZED_NAME_HOURLY_FINDINGS = "hourly_findings";
  @SerializedName(SERIALIZED_NAME_HOURLY_FINDINGS)
  private List<Riskanalyticscontrollerv3RiskEventHourlyFindings> hourlyFindings = new ArrayList<>();

  public static final String SERIALIZED_NAME_RISK_EVENT = "risk_event";
  @SerializedName(SERIALIZED_NAME_RISK_EVENT)
  private Riskanalyticscontrollerv3RiskEvent riskEvent;

  public Riskanalyticscontrollerv3RiskEventSummarizationDataResponse() {
  }

  public Riskanalyticscontrollerv3RiskEventSummarizationDataResponse formerHours(Riskanalyticscontrollerv3RiskEventFormerHours formerHours) {
    this.formerHours = formerHours;
    return this;
  }

   /**
   * Get formerHours
   * @return formerHours
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3RiskEventFormerHours getFormerHours() {
    return formerHours;
  }

  public void setFormerHours(Riskanalyticscontrollerv3RiskEventFormerHours formerHours) {
    this.formerHours = formerHours;
  }


  public Riskanalyticscontrollerv3RiskEventSummarizationDataResponse hourlyFindings(List<Riskanalyticscontrollerv3RiskEventHourlyFindings> hourlyFindings) {
    this.hourlyFindings = hourlyFindings;
    return this;
  }

  public Riskanalyticscontrollerv3RiskEventSummarizationDataResponse addHourlyFindingsItem(Riskanalyticscontrollerv3RiskEventHourlyFindings hourlyFindingsItem) {
    if (this.hourlyFindings == null) {
      this.hourlyFindings = new ArrayList<>();
    }
    this.hourlyFindings.add(hourlyFindingsItem);
    return this;
  }

   /**
   * Get hourlyFindings
   * @return hourlyFindings
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3RiskEventHourlyFindings> getHourlyFindings() {
    return hourlyFindings;
  }

  public void setHourlyFindings(List<Riskanalyticscontrollerv3RiskEventHourlyFindings> hourlyFindings) {
    this.hourlyFindings = hourlyFindings;
  }


  public Riskanalyticscontrollerv3RiskEventSummarizationDataResponse riskEvent(Riskanalyticscontrollerv3RiskEvent riskEvent) {
    this.riskEvent = riskEvent;
    return this;
  }

   /**
   * Get riskEvent
   * @return riskEvent
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3RiskEvent getRiskEvent() {
    return riskEvent;
  }

  public void setRiskEvent(Riskanalyticscontrollerv3RiskEvent riskEvent) {
    this.riskEvent = riskEvent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3RiskEventSummarizationDataResponse riskanalyticscontrollerv3RiskEventSummarizationDataResponse = (Riskanalyticscontrollerv3RiskEventSummarizationDataResponse) o;
    return Objects.equals(this.formerHours, riskanalyticscontrollerv3RiskEventSummarizationDataResponse.formerHours) &&
        Objects.equals(this.hourlyFindings, riskanalyticscontrollerv3RiskEventSummarizationDataResponse.hourlyFindings) &&
        Objects.equals(this.riskEvent, riskanalyticscontrollerv3RiskEventSummarizationDataResponse.riskEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formerHours, hourlyFindings, riskEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3RiskEventSummarizationDataResponse {\n");
    sb.append("    formerHours: ").append(toIndentedString(formerHours)).append("\n");
    sb.append("    hourlyFindings: ").append(toIndentedString(hourlyFindings)).append("\n");
    sb.append("    riskEvent: ").append(toIndentedString(riskEvent)).append("\n");
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
    openapiFields.add("former_hours");
    openapiFields.add("hourly_findings");
    openapiFields.add("risk_event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3RiskEventSummarizationDataResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3RiskEventSummarizationDataResponse is not found in the empty JSON string", Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3RiskEventSummarizationDataResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `former_hours`
      if (jsonObj.get("former_hours") != null && !jsonObj.get("former_hours").isJsonNull()) {
        Riskanalyticscontrollerv3RiskEventFormerHours.validateJsonElement(jsonObj.get("former_hours"));
      }
      if (jsonObj.get("hourly_findings") != null && !jsonObj.get("hourly_findings").isJsonNull()) {
        JsonArray jsonArrayhourlyFindings = jsonObj.getAsJsonArray("hourly_findings");
        if (jsonArrayhourlyFindings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hourly_findings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hourly_findings` to be an array in the JSON string but got `%s`", jsonObj.get("hourly_findings").toString()));
          }

          // validate the optional field `hourly_findings` (array)
          for (int i = 0; i < jsonArrayhourlyFindings.size(); i++) {
            Riskanalyticscontrollerv3RiskEventHourlyFindings.validateJsonElement(jsonArrayhourlyFindings.get(i));
          };
        }
      }
      // validate the optional field `risk_event`
      if (jsonObj.get("risk_event") != null && !jsonObj.get("risk_event").isJsonNull()) {
        Riskanalyticscontrollerv3RiskEvent.validateJsonElement(jsonObj.get("risk_event"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3RiskEventSummarizationDataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3RiskEventSummarizationDataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3RiskEventSummarizationDataResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3RiskEventSummarizationDataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3RiskEventSummarizationDataResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3RiskEventSummarizationDataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3RiskEventSummarizationDataResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3RiskEventSummarizationDataResponse
  */
  public static Riskanalyticscontrollerv3RiskEventSummarizationDataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3RiskEventSummarizationDataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

