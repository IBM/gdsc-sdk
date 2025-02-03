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
import org.openapitools.client.model.Riskanalyticscontrollerv3RiskEvent;

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
 * GetRiskEventRowResponse is the response object for GetRiskEventRow API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3GetRiskEventRowResponse {
  public static final String SERIALIZED_NAME_LIMIT_REACHED = "limit_reached";
  @SerializedName(SERIALIZED_NAME_LIMIT_REACHED)
  private Boolean limitReached;

  public static final String SERIALIZED_NAME_RISK_EVENT_ROWS = "risk_event_rows";
  @SerializedName(SERIALIZED_NAME_RISK_EVENT_ROWS)
  private List<Riskanalyticscontrollerv3RiskEvent> riskEventRows = new ArrayList<>();

  public Riskanalyticscontrollerv3GetRiskEventRowResponse() {
  }

  public Riskanalyticscontrollerv3GetRiskEventRowResponse limitReached(Boolean limitReached) {
    this.limitReached = limitReached;
    return this;
  }

   /**
   * Indicate whether riskevent list is partial because the number of risks reached the limit.
   * @return limitReached
  **/
  @javax.annotation.Nullable
  public Boolean getLimitReached() {
    return limitReached;
  }

  public void setLimitReached(Boolean limitReached) {
    this.limitReached = limitReached;
  }


  public Riskanalyticscontrollerv3GetRiskEventRowResponse riskEventRows(List<Riskanalyticscontrollerv3RiskEvent> riskEventRows) {
    this.riskEventRows = riskEventRows;
    return this;
  }

  public Riskanalyticscontrollerv3GetRiskEventRowResponse addRiskEventRowsItem(Riskanalyticscontrollerv3RiskEvent riskEventRowsItem) {
    if (this.riskEventRows == null) {
      this.riskEventRows = new ArrayList<>();
    }
    this.riskEventRows.add(riskEventRowsItem);
    return this;
  }

   /**
   * Repeated risk event rows.
   * @return riskEventRows
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3RiskEvent> getRiskEventRows() {
    return riskEventRows;
  }

  public void setRiskEventRows(List<Riskanalyticscontrollerv3RiskEvent> riskEventRows) {
    this.riskEventRows = riskEventRows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3GetRiskEventRowResponse riskanalyticscontrollerv3GetRiskEventRowResponse = (Riskanalyticscontrollerv3GetRiskEventRowResponse) o;
    return Objects.equals(this.limitReached, riskanalyticscontrollerv3GetRiskEventRowResponse.limitReached) &&
        Objects.equals(this.riskEventRows, riskanalyticscontrollerv3GetRiskEventRowResponse.riskEventRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitReached, riskEventRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3GetRiskEventRowResponse {\n");
    sb.append("    limitReached: ").append(toIndentedString(limitReached)).append("\n");
    sb.append("    riskEventRows: ").append(toIndentedString(riskEventRows)).append("\n");
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
    openapiFields.add("limit_reached");
    openapiFields.add("risk_event_rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3GetRiskEventRowResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3GetRiskEventRowResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3GetRiskEventRowResponse is not found in the empty JSON string", Riskanalyticscontrollerv3GetRiskEventRowResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3GetRiskEventRowResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3GetRiskEventRowResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("risk_event_rows") != null && !jsonObj.get("risk_event_rows").isJsonNull()) {
        JsonArray jsonArrayriskEventRows = jsonObj.getAsJsonArray("risk_event_rows");
        if (jsonArrayriskEventRows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("risk_event_rows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `risk_event_rows` to be an array in the JSON string but got `%s`", jsonObj.get("risk_event_rows").toString()));
          }

          // validate the optional field `risk_event_rows` (array)
          for (int i = 0; i < jsonArrayriskEventRows.size(); i++) {
            Riskanalyticscontrollerv3RiskEvent.validateJsonElement(jsonArrayriskEventRows.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3GetRiskEventRowResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3GetRiskEventRowResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3GetRiskEventRowResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3GetRiskEventRowResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3GetRiskEventRowResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3GetRiskEventRowResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3GetRiskEventRowResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3GetRiskEventRowResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3GetRiskEventRowResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3GetRiskEventRowResponse
  */
  public static Riskanalyticscontrollerv3GetRiskEventRowResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3GetRiskEventRowResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3GetRiskEventRowResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

