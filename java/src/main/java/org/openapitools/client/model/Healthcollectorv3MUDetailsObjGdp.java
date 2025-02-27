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
import org.openapitools.client.model.Healthcollectorv3AggregationDetailsObjectGdp;
import org.openapitools.client.model.Healthcollectorv3GeneralDetailsObject;
import org.openapitools.client.model.Healthcollectorv3UtilizationParameterObjectGdp;

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
 * MUDetailObj gets additional information about managed units.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3MUDetailsObjGdp {
  public static final String SERIALIZED_NAME_AGG_HEALTH_VIEW_LIST = "agg_health_view_list";
  @SerializedName(SERIALIZED_NAME_AGG_HEALTH_VIEW_LIST)
  private List<Healthcollectorv3AggregationDetailsObjectGdp> aggHealthViewList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONNECTIVITY_DETAILS = "connectivity_details";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY_DETAILS)
  private Healthcollectorv3GeneralDetailsObject connectivityDetails;

  public static final String SERIALIZED_NAME_GENERAL_ERR_MESSAGES = "general_err_messages";
  @SerializedName(SERIALIZED_NAME_GENERAL_ERR_MESSAGES)
  private List<String> generalErrMessages = new ArrayList<>();

  public static final String SERIALIZED_NAME_UTILIZATION_SCHEME = "utilization_scheme";
  @SerializedName(SERIALIZED_NAME_UTILIZATION_SCHEME)
  private Healthcollectorv3UtilizationParameterObjectGdp utilizationScheme;

  public Healthcollectorv3MUDetailsObjGdp() {
  }

  public Healthcollectorv3MUDetailsObjGdp aggHealthViewList(List<Healthcollectorv3AggregationDetailsObjectGdp> aggHealthViewList) {
    this.aggHealthViewList = aggHealthViewList;
    return this;
  }

  public Healthcollectorv3MUDetailsObjGdp addAggHealthViewListItem(Healthcollectorv3AggregationDetailsObjectGdp aggHealthViewListItem) {
    if (this.aggHealthViewList == null) {
      this.aggHealthViewList = new ArrayList<>();
    }
    this.aggHealthViewList.add(aggHealthViewListItem);
    return this;
  }

   /**
   * Aggregation details.
   * @return aggHealthViewList
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3AggregationDetailsObjectGdp> getAggHealthViewList() {
    return aggHealthViewList;
  }

  public void setAggHealthViewList(List<Healthcollectorv3AggregationDetailsObjectGdp> aggHealthViewList) {
    this.aggHealthViewList = aggHealthViewList;
  }


  public Healthcollectorv3MUDetailsObjGdp connectivityDetails(Healthcollectorv3GeneralDetailsObject connectivityDetails) {
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


  public Healthcollectorv3MUDetailsObjGdp generalErrMessages(List<String> generalErrMessages) {
    this.generalErrMessages = generalErrMessages;
    return this;
  }

  public Healthcollectorv3MUDetailsObjGdp addGeneralErrMessagesItem(String generalErrMessagesItem) {
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


  public Healthcollectorv3MUDetailsObjGdp utilizationScheme(Healthcollectorv3UtilizationParameterObjectGdp utilizationScheme) {
    this.utilizationScheme = utilizationScheme;
    return this;
  }

   /**
   * Get utilizationScheme
   * @return utilizationScheme
  **/
  @javax.annotation.Nullable
  public Healthcollectorv3UtilizationParameterObjectGdp getUtilizationScheme() {
    return utilizationScheme;
  }

  public void setUtilizationScheme(Healthcollectorv3UtilizationParameterObjectGdp utilizationScheme) {
    this.utilizationScheme = utilizationScheme;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3MUDetailsObjGdp healthcollectorv3MUDetailsObjGdp = (Healthcollectorv3MUDetailsObjGdp) o;
    return Objects.equals(this.aggHealthViewList, healthcollectorv3MUDetailsObjGdp.aggHealthViewList) &&
        Objects.equals(this.connectivityDetails, healthcollectorv3MUDetailsObjGdp.connectivityDetails) &&
        Objects.equals(this.generalErrMessages, healthcollectorv3MUDetailsObjGdp.generalErrMessages) &&
        Objects.equals(this.utilizationScheme, healthcollectorv3MUDetailsObjGdp.utilizationScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggHealthViewList, connectivityDetails, generalErrMessages, utilizationScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3MUDetailsObjGdp {\n");
    sb.append("    aggHealthViewList: ").append(toIndentedString(aggHealthViewList)).append("\n");
    sb.append("    connectivityDetails: ").append(toIndentedString(connectivityDetails)).append("\n");
    sb.append("    generalErrMessages: ").append(toIndentedString(generalErrMessages)).append("\n");
    sb.append("    utilizationScheme: ").append(toIndentedString(utilizationScheme)).append("\n");
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
    openapiFields.add("agg_health_view_list");
    openapiFields.add("connectivity_details");
    openapiFields.add("general_err_messages");
    openapiFields.add("utilization_scheme");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3MUDetailsObjGdp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3MUDetailsObjGdp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3MUDetailsObjGdp is not found in the empty JSON string", Healthcollectorv3MUDetailsObjGdp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3MUDetailsObjGdp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3MUDetailsObjGdp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("agg_health_view_list") != null && !jsonObj.get("agg_health_view_list").isJsonNull()) {
        JsonArray jsonArrayaggHealthViewList = jsonObj.getAsJsonArray("agg_health_view_list");
        if (jsonArrayaggHealthViewList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agg_health_view_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agg_health_view_list` to be an array in the JSON string but got `%s`", jsonObj.get("agg_health_view_list").toString()));
          }

          // validate the optional field `agg_health_view_list` (array)
          for (int i = 0; i < jsonArrayaggHealthViewList.size(); i++) {
            Healthcollectorv3AggregationDetailsObjectGdp.validateJsonElement(jsonArrayaggHealthViewList.get(i));
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
      // validate the optional field `utilization_scheme`
      if (jsonObj.get("utilization_scheme") != null && !jsonObj.get("utilization_scheme").isJsonNull()) {
        Healthcollectorv3UtilizationParameterObjectGdp.validateJsonElement(jsonObj.get("utilization_scheme"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3MUDetailsObjGdp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3MUDetailsObjGdp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3MUDetailsObjGdp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3MUDetailsObjGdp.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3MUDetailsObjGdp>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3MUDetailsObjGdp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3MUDetailsObjGdp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3MUDetailsObjGdp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3MUDetailsObjGdp
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3MUDetailsObjGdp
  */
  public static Healthcollectorv3MUDetailsObjGdp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3MUDetailsObjGdp.class);
  }

 /**
  * Convert an instance of Healthcollectorv3MUDetailsObjGdp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

