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
import org.openapitools.client.model.Dashboardsv3CardPosition;
import org.openapitools.client.model.Dashboardsv3CardType;
import org.openapitools.client.model.Dashboardsv3ReportParameters;

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
 * Cards - a small-scale representation of a Dashboard Card.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Dashboardsv3Card {
  public static final String SERIALIZED_NAME_CARD_I_D = "card_ID";
  @SerializedName(SERIALIZED_NAME_CARD_I_D)
  private String cardID;

  public static final String SERIALIZED_NAME_CARD_POSITION = "card_position";
  @SerializedName(SERIALIZED_NAME_CARD_POSITION)
  private Dashboardsv3CardPosition cardPosition;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private Dashboardsv3CardType cardType = Dashboardsv3CardType.UNDEFINED_CARD_TYPE;

  public static final String SERIALIZED_NAME_EXCLUDED_GLOBAL_FILTER_IDS = "excluded_global_filter_ids";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_GLOBAL_FILTER_IDS)
  private List<String> excludedGlobalFilterIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_PARAMETERS = "report_parameters";
  @SerializedName(SERIALIZED_NAME_REPORT_PARAMETERS)
  private Dashboardsv3ReportParameters reportParameters;

  public Dashboardsv3Card() {
  }

  public Dashboardsv3Card cardID(String cardID) {
    this.cardID = cardID;
    return this;
  }

   /**
   * Card ID.
   * @return cardID
  **/
  @javax.annotation.Nullable
  public String getCardID() {
    return cardID;
  }

  public void setCardID(String cardID) {
    this.cardID = cardID;
  }


  public Dashboardsv3Card cardPosition(Dashboardsv3CardPosition cardPosition) {
    this.cardPosition = cardPosition;
    return this;
  }

   /**
   * Get cardPosition
   * @return cardPosition
  **/
  @javax.annotation.Nullable
  public Dashboardsv3CardPosition getCardPosition() {
    return cardPosition;
  }

  public void setCardPosition(Dashboardsv3CardPosition cardPosition) {
    this.cardPosition = cardPosition;
  }


  public Dashboardsv3Card cardType(Dashboardsv3CardType cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  public Dashboardsv3CardType getCardType() {
    return cardType;
  }

  public void setCardType(Dashboardsv3CardType cardType) {
    this.cardType = cardType;
  }


  public Dashboardsv3Card excludedGlobalFilterIds(List<String> excludedGlobalFilterIds) {
    this.excludedGlobalFilterIds = excludedGlobalFilterIds;
    return this;
  }

  public Dashboardsv3Card addExcludedGlobalFilterIdsItem(String excludedGlobalFilterIdsItem) {
    if (this.excludedGlobalFilterIds == null) {
      this.excludedGlobalFilterIds = new ArrayList<>();
    }
    this.excludedGlobalFilterIds.add(excludedGlobalFilterIdsItem);
    return this;
  }

   /**
   * Get excludedGlobalFilterIds
   * @return excludedGlobalFilterIds
  **/
  @javax.annotation.Nullable
  public List<String> getExcludedGlobalFilterIds() {
    return excludedGlobalFilterIds;
  }

  public void setExcludedGlobalFilterIds(List<String> excludedGlobalFilterIds) {
    this.excludedGlobalFilterIds = excludedGlobalFilterIds;
  }


  public Dashboardsv3Card reportParameters(Dashboardsv3ReportParameters reportParameters) {
    this.reportParameters = reportParameters;
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  public Dashboardsv3ReportParameters getReportParameters() {
    return reportParameters;
  }

  public void setReportParameters(Dashboardsv3ReportParameters reportParameters) {
    this.reportParameters = reportParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboardsv3Card dashboardsv3Card = (Dashboardsv3Card) o;
    return Objects.equals(this.cardID, dashboardsv3Card.cardID) &&
        Objects.equals(this.cardPosition, dashboardsv3Card.cardPosition) &&
        Objects.equals(this.cardType, dashboardsv3Card.cardType) &&
        Objects.equals(this.excludedGlobalFilterIds, dashboardsv3Card.excludedGlobalFilterIds) &&
        Objects.equals(this.reportParameters, dashboardsv3Card.reportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardID, cardPosition, cardType, excludedGlobalFilterIds, reportParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboardsv3Card {\n");
    sb.append("    cardID: ").append(toIndentedString(cardID)).append("\n");
    sb.append("    cardPosition: ").append(toIndentedString(cardPosition)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    excludedGlobalFilterIds: ").append(toIndentedString(excludedGlobalFilterIds)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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
    openapiFields.add("card_ID");
    openapiFields.add("card_position");
    openapiFields.add("card_type");
    openapiFields.add("excluded_global_filter_ids");
    openapiFields.add("report_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dashboardsv3Card
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dashboardsv3Card.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboardsv3Card is not found in the empty JSON string", Dashboardsv3Card.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dashboardsv3Card.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dashboardsv3Card` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("card_ID") != null && !jsonObj.get("card_ID").isJsonNull()) && !jsonObj.get("card_ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_ID").toString()));
      }
      // validate the optional field `card_position`
      if (jsonObj.get("card_position") != null && !jsonObj.get("card_position").isJsonNull()) {
        Dashboardsv3CardPosition.validateJsonElement(jsonObj.get("card_position"));
      }
      // validate the optional field `card_type`
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) {
        Dashboardsv3CardType.validateJsonElement(jsonObj.get("card_type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excluded_global_filter_ids") != null && !jsonObj.get("excluded_global_filter_ids").isJsonNull() && !jsonObj.get("excluded_global_filter_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excluded_global_filter_ids` to be an array in the JSON string but got `%s`", jsonObj.get("excluded_global_filter_ids").toString()));
      }
      // validate the optional field `report_parameters`
      if (jsonObj.get("report_parameters") != null && !jsonObj.get("report_parameters").isJsonNull()) {
        Dashboardsv3ReportParameters.validateJsonElement(jsonObj.get("report_parameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboardsv3Card.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboardsv3Card' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboardsv3Card> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboardsv3Card.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboardsv3Card>() {
           @Override
           public void write(JsonWriter out, Dashboardsv3Card value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboardsv3Card read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dashboardsv3Card given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dashboardsv3Card
  * @throws IOException if the JSON string is invalid with respect to Dashboardsv3Card
  */
  public static Dashboardsv3Card fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboardsv3Card.class);
  }

 /**
  * Convert an instance of Dashboardsv3Card to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

