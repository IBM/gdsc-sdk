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
import com.ibm.gdsc.sdk.Healthcollectorv3AggregationDetailsObject;
import com.ibm.gdsc.sdk.Healthcollectorv3GeneralDetailsObject;
import com.ibm.gdsc.sdk.Healthcollectorv3UtilizationParameterObject;
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
 * MUDetailObj gets additional information about managed units.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3MUDetailsObj {
  public static final String SERIALIZED_NAME_AGGREGATION_DETAILS_LIST = "aggregation_details_list";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_DETAILS_LIST)
  private List<Healthcollectorv3AggregationDetailsObject> aggregationDetailsList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONNECTIVITY_DETAILS = "connectivity_details";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY_DETAILS)
  private Healthcollectorv3GeneralDetailsObject connectivityDetails;

  public static final String SERIALIZED_NAME_GENERAL_ERR_MESSAGES = "general_err_messages";
  @SerializedName(SERIALIZED_NAME_GENERAL_ERR_MESSAGES)
  private List<String> generalErrMessages = new ArrayList<>();

  public static final String SERIALIZED_NAME_UTILIZATION_PARAMETERS_VALUES = "utilization_parameters_values";
  @SerializedName(SERIALIZED_NAME_UTILIZATION_PARAMETERS_VALUES)
  private Healthcollectorv3UtilizationParameterObject utilizationParametersValues;

  public Healthcollectorv3MUDetailsObj() {
  }

  public Healthcollectorv3MUDetailsObj aggregationDetailsList(List<Healthcollectorv3AggregationDetailsObject> aggregationDetailsList) {
    this.aggregationDetailsList = aggregationDetailsList;
    return this;
  }

  public Healthcollectorv3MUDetailsObj addAggregationDetailsListItem(Healthcollectorv3AggregationDetailsObject aggregationDetailsListItem) {
    if (this.aggregationDetailsList == null) {
      this.aggregationDetailsList = new ArrayList<>();
    }
    this.aggregationDetailsList.add(aggregationDetailsListItem);
    return this;
  }

   /**
   * Aggregation details.
   * @return aggregationDetailsList
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3AggregationDetailsObject> getAggregationDetailsList() {
    return aggregationDetailsList;
  }

  public void setAggregationDetailsList(List<Healthcollectorv3AggregationDetailsObject> aggregationDetailsList) {
    this.aggregationDetailsList = aggregationDetailsList;
  }


  public Healthcollectorv3MUDetailsObj connectivityDetails(Healthcollectorv3GeneralDetailsObject connectivityDetails) {
    this.connectivityDetails = connectivityDetails;
    return this;
  }

   /**
   * Get connectivityDetails
   * @return connectivityDetails
  **/
  @javax.annotation.Nullable
  public Healthcollectorv3GeneralDetailsObject getConnectivityDetails() {
    return connectivityDetails;
  }

  public void setConnectivityDetails(Healthcollectorv3GeneralDetailsObject connectivityDetails) {
    this.connectivityDetails = connectivityDetails;
  }


  public Healthcollectorv3MUDetailsObj generalErrMessages(List<String> generalErrMessages) {
    this.generalErrMessages = generalErrMessages;
    return this;
  }

  public Healthcollectorv3MUDetailsObj addGeneralErrMessagesItem(String generalErrMessagesItem) {
    if (this.generalErrMessages == null) {
      this.generalErrMessages = new ArrayList<>();
    }
    this.generalErrMessages.add(generalErrMessagesItem);
    return this;
  }

   /**
   * Additional messages and details about managed units.
   * @return generalErrMessages
  **/
  @javax.annotation.Nullable
  public List<String> getGeneralErrMessages() {
    return generalErrMessages;
  }

  public void setGeneralErrMessages(List<String> generalErrMessages) {
    this.generalErrMessages = generalErrMessages;
  }


  public Healthcollectorv3MUDetailsObj utilizationParametersValues(Healthcollectorv3UtilizationParameterObject utilizationParametersValues) {
    this.utilizationParametersValues = utilizationParametersValues;
    return this;
  }

   /**
   * Get utilizationParametersValues
   * @return utilizationParametersValues
  **/
  @javax.annotation.Nullable
  public Healthcollectorv3UtilizationParameterObject getUtilizationParametersValues() {
    return utilizationParametersValues;
  }

  public void setUtilizationParametersValues(Healthcollectorv3UtilizationParameterObject utilizationParametersValues) {
    this.utilizationParametersValues = utilizationParametersValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3MUDetailsObj healthcollectorv3MUDetailsObj = (Healthcollectorv3MUDetailsObj) o;
    return Objects.equals(this.aggregationDetailsList, healthcollectorv3MUDetailsObj.aggregationDetailsList) &&
        Objects.equals(this.connectivityDetails, healthcollectorv3MUDetailsObj.connectivityDetails) &&
        Objects.equals(this.generalErrMessages, healthcollectorv3MUDetailsObj.generalErrMessages) &&
        Objects.equals(this.utilizationParametersValues, healthcollectorv3MUDetailsObj.utilizationParametersValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationDetailsList, connectivityDetails, generalErrMessages, utilizationParametersValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3MUDetailsObj {\n");
    sb.append("    aggregationDetailsList: ").append(toIndentedString(aggregationDetailsList)).append("\n");
    sb.append("    connectivityDetails: ").append(toIndentedString(connectivityDetails)).append("\n");
    sb.append("    generalErrMessages: ").append(toIndentedString(generalErrMessages)).append("\n");
    sb.append("    utilizationParametersValues: ").append(toIndentedString(utilizationParametersValues)).append("\n");
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
    openapiFields.add("aggregation_details_list");
    openapiFields.add("connectivity_details");
    openapiFields.add("general_err_messages");
    openapiFields.add("utilization_parameters_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3MUDetailsObj
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3MUDetailsObj.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3MUDetailsObj is not found in the empty JSON string", Healthcollectorv3MUDetailsObj.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3MUDetailsObj.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3MUDetailsObj` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("aggregation_details_list") != null && !jsonObj.get("aggregation_details_list").isJsonNull()) {
        JsonArray jsonArrayaggregationDetailsList = jsonObj.getAsJsonArray("aggregation_details_list");
        if (jsonArrayaggregationDetailsList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("aggregation_details_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `aggregation_details_list` to be an array in the JSON string but got `%s`", jsonObj.get("aggregation_details_list").toString()));
          }

          // validate the optional field `aggregation_details_list` (array)
          for (int i = 0; i < jsonArrayaggregationDetailsList.size(); i++) {
            Healthcollectorv3AggregationDetailsObject.validateJsonElement(jsonArrayaggregationDetailsList.get(i));
          };
        }
      }
      // validate the optional field `connectivity_details`
      if (jsonObj.get("connectivity_details") != null && !jsonObj.get("connectivity_details").isJsonNull()) {
        Healthcollectorv3GeneralDetailsObject.validateJsonElement(jsonObj.get("connectivity_details"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("general_err_messages") != null && !jsonObj.get("general_err_messages").isJsonNull() && !jsonObj.get("general_err_messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `general_err_messages` to be an array in the JSON string but got `%s`", jsonObj.get("general_err_messages").toString()));
      }
      // validate the optional field `utilization_parameters_values`
      if (jsonObj.get("utilization_parameters_values") != null && !jsonObj.get("utilization_parameters_values").isJsonNull()) {
        Healthcollectorv3UtilizationParameterObject.validateJsonElement(jsonObj.get("utilization_parameters_values"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3MUDetailsObj.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3MUDetailsObj' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3MUDetailsObj> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3MUDetailsObj.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3MUDetailsObj>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3MUDetailsObj value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3MUDetailsObj read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3MUDetailsObj given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3MUDetailsObj
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3MUDetailsObj
  */
  public static Healthcollectorv3MUDetailsObj fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3MUDetailsObj.class);
  }

 /**
  * Convert an instance of Healthcollectorv3MUDetailsObj to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

