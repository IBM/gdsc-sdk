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
import com.ibm.gdsc.sdk.Riskanalyticscontrollerv3ProcessStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * GetRiskEventProcessStatusResponse is the request object for GetRiskEventProcessStatus API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse {
  public static final String SERIALIZED_NAME_FEEDBACK_STATUS = "feedback_status";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_STATUS)
  private Riskanalyticscontrollerv3ProcessStatus feedbackStatus = Riskanalyticscontrollerv3ProcessStatus.UNDEFINED_PROCESS_STATUS_TYPE;

  public static final String SERIALIZED_NAME_LAST_RUN_DATE = "last_run_date";
  @SerializedName(SERIALIZED_NAME_LAST_RUN_DATE)
  private OffsetDateTime lastRunDate;

  public static final String SERIALIZED_NAME_PROCESS_STATUS = "process_status";
  @SerializedName(SERIALIZED_NAME_PROCESS_STATUS)
  private Riskanalyticscontrollerv3ProcessStatus processStatus = Riskanalyticscontrollerv3ProcessStatus.UNDEFINED_PROCESS_STATUS_TYPE;

  public Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse() {
  }

  public Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse feedbackStatus(Riskanalyticscontrollerv3ProcessStatus feedbackStatus) {
    this.feedbackStatus = feedbackStatus;
    return this;
  }

   /**
   * Get feedbackStatus
   * @return feedbackStatus
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3ProcessStatus getFeedbackStatus() {
    return feedbackStatus;
  }

  public void setFeedbackStatus(Riskanalyticscontrollerv3ProcessStatus feedbackStatus) {
    this.feedbackStatus = feedbackStatus;
  }


  public Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse lastRunDate(OffsetDateTime lastRunDate) {
    this.lastRunDate = lastRunDate;
    return this;
  }

   /**
   * Last run date in format YYYY-MM-DDTHH:mm:ssZ.
   * @return lastRunDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastRunDate() {
    return lastRunDate;
  }

  public void setLastRunDate(OffsetDateTime lastRunDate) {
    this.lastRunDate = lastRunDate;
  }


  public Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse processStatus(Riskanalyticscontrollerv3ProcessStatus processStatus) {
    this.processStatus = processStatus;
    return this;
  }

   /**
   * Get processStatus
   * @return processStatus
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3ProcessStatus getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(Riskanalyticscontrollerv3ProcessStatus processStatus) {
    this.processStatus = processStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse riskanalyticscontrollerv3GetRiskEventProcessStatusResponse = (Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse) o;
    return Objects.equals(this.feedbackStatus, riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.feedbackStatus) &&
        Objects.equals(this.lastRunDate, riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.lastRunDate) &&
        Objects.equals(this.processStatus, riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.processStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackStatus, lastRunDate, processStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse {\n");
    sb.append("    feedbackStatus: ").append(toIndentedString(feedbackStatus)).append("\n");
    sb.append("    lastRunDate: ").append(toIndentedString(lastRunDate)).append("\n");
    sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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
    openapiFields.add("feedback_status");
    openapiFields.add("last_run_date");
    openapiFields.add("process_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse is not found in the empty JSON string", Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `feedback_status`
      if (jsonObj.get("feedback_status") != null && !jsonObj.get("feedback_status").isJsonNull()) {
        Riskanalyticscontrollerv3ProcessStatus.validateJsonElement(jsonObj.get("feedback_status"));
      }
      // validate the optional field `process_status`
      if (jsonObj.get("process_status") != null && !jsonObj.get("process_status").isJsonNull()) {
        Riskanalyticscontrollerv3ProcessStatus.validateJsonElement(jsonObj.get("process_status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse
  */
  public static Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

