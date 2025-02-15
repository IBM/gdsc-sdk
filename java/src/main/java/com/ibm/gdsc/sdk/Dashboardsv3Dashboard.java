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
import com.ibm.gdsc.sdk.Dashboardsv3Card;
import com.ibm.gdsc.sdk.Dashboardsv3ReportGlobalFilter;
import com.ibm.gdsc.sdk.Dashboardsv3TimeRange;
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
 * Dashboard - a small-scale representation of a Dashboard.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Dashboardsv3Dashboard {
  public static final String SERIALIZED_NAME_CARDS = "cards";
  @SerializedName(SERIALIZED_NAME_CARDS)
  private List<Dashboardsv3Card> cards = new ArrayList<>();

  public static final String SERIALIZED_NAME_DASHBOARD_DESCRIPTION = "dashboard_description";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_DESCRIPTION)
  private String dashboardDescription;

  public static final String SERIALIZED_NAME_DASHBOARD_ID = "dashboard_id";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_ID)
  private String dashboardId;

  public static final String SERIALIZED_NAME_DASHBOARD_TITLE = "dashboard_title";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_TITLE)
  private String dashboardTitle;

  public static final String SERIALIZED_NAME_GLOBAL_TIME_FILTER = "global_time_filter";
  @SerializedName(SERIALIZED_NAME_GLOBAL_TIME_FILTER)
  private Dashboardsv3TimeRange globalTimeFilter;

  public static final String SERIALIZED_NAME_REPORT_GLOBAL_FILTER_LIST = "report_global_filter_list";
  @SerializedName(SERIALIZED_NAME_REPORT_GLOBAL_FILTER_LIST)
  private List<Dashboardsv3ReportGlobalFilter> reportGlobalFilterList = new ArrayList<>();

  public Dashboardsv3Dashboard() {
  }

  public Dashboardsv3Dashboard cards(List<Dashboardsv3Card> cards) {
    this.cards = cards;
    return this;
  }

  public Dashboardsv3Dashboard addCardsItem(Dashboardsv3Card cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<>();
    }
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * Dashboard cards.
   * @return cards
  **/
  @javax.annotation.Nullable
  public List<Dashboardsv3Card> getCards() {
    return cards;
  }

  public void setCards(List<Dashboardsv3Card> cards) {
    this.cards = cards;
  }


  public Dashboardsv3Dashboard dashboardDescription(String dashboardDescription) {
    this.dashboardDescription = dashboardDescription;
    return this;
  }

   /**
   * Dashboard description.
   * @return dashboardDescription
  **/
  @javax.annotation.Nullable
  public String getDashboardDescription() {
    return dashboardDescription;
  }

  public void setDashboardDescription(String dashboardDescription) {
    this.dashboardDescription = dashboardDescription;
  }


  public Dashboardsv3Dashboard dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * Unique Dashboard ID.
   * @return dashboardId
  **/
  @javax.annotation.Nullable
  public String getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }


  public Dashboardsv3Dashboard dashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
    return this;
  }

   /**
   * Dashboard title.
   * @return dashboardTitle
  **/
  @javax.annotation.Nullable
  public String getDashboardTitle() {
    return dashboardTitle;
  }

  public void setDashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
  }


  public Dashboardsv3Dashboard globalTimeFilter(Dashboardsv3TimeRange globalTimeFilter) {
    this.globalTimeFilter = globalTimeFilter;
    return this;
  }

   /**
   * Get globalTimeFilter
   * @return globalTimeFilter
  **/
  @javax.annotation.Nullable
  public Dashboardsv3TimeRange getGlobalTimeFilter() {
    return globalTimeFilter;
  }

  public void setGlobalTimeFilter(Dashboardsv3TimeRange globalTimeFilter) {
    this.globalTimeFilter = globalTimeFilter;
  }


  public Dashboardsv3Dashboard reportGlobalFilterList(List<Dashboardsv3ReportGlobalFilter> reportGlobalFilterList) {
    this.reportGlobalFilterList = reportGlobalFilterList;
    return this;
  }

  public Dashboardsv3Dashboard addReportGlobalFilterListItem(Dashboardsv3ReportGlobalFilter reportGlobalFilterListItem) {
    if (this.reportGlobalFilterList == null) {
      this.reportGlobalFilterList = new ArrayList<>();
    }
    this.reportGlobalFilterList.add(reportGlobalFilterListItem);
    return this;
  }

   /**
   * Get reportGlobalFilterList
   * @return reportGlobalFilterList
  **/
  @javax.annotation.Nullable
  public List<Dashboardsv3ReportGlobalFilter> getReportGlobalFilterList() {
    return reportGlobalFilterList;
  }

  public void setReportGlobalFilterList(List<Dashboardsv3ReportGlobalFilter> reportGlobalFilterList) {
    this.reportGlobalFilterList = reportGlobalFilterList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboardsv3Dashboard dashboardsv3Dashboard = (Dashboardsv3Dashboard) o;
    return Objects.equals(this.cards, dashboardsv3Dashboard.cards) &&
        Objects.equals(this.dashboardDescription, dashboardsv3Dashboard.dashboardDescription) &&
        Objects.equals(this.dashboardId, dashboardsv3Dashboard.dashboardId) &&
        Objects.equals(this.dashboardTitle, dashboardsv3Dashboard.dashboardTitle) &&
        Objects.equals(this.globalTimeFilter, dashboardsv3Dashboard.globalTimeFilter) &&
        Objects.equals(this.reportGlobalFilterList, dashboardsv3Dashboard.reportGlobalFilterList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cards, dashboardDescription, dashboardId, dashboardTitle, globalTimeFilter, reportGlobalFilterList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboardsv3Dashboard {\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    dashboardDescription: ").append(toIndentedString(dashboardDescription)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    dashboardTitle: ").append(toIndentedString(dashboardTitle)).append("\n");
    sb.append("    globalTimeFilter: ").append(toIndentedString(globalTimeFilter)).append("\n");
    sb.append("    reportGlobalFilterList: ").append(toIndentedString(reportGlobalFilterList)).append("\n");
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
    openapiFields.add("cards");
    openapiFields.add("dashboard_description");
    openapiFields.add("dashboard_id");
    openapiFields.add("dashboard_title");
    openapiFields.add("global_time_filter");
    openapiFields.add("report_global_filter_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dashboardsv3Dashboard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dashboardsv3Dashboard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboardsv3Dashboard is not found in the empty JSON string", Dashboardsv3Dashboard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dashboardsv3Dashboard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dashboardsv3Dashboard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("cards") != null && !jsonObj.get("cards").isJsonNull()) {
        JsonArray jsonArraycards = jsonObj.getAsJsonArray("cards");
        if (jsonArraycards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cards` to be an array in the JSON string but got `%s`", jsonObj.get("cards").toString()));
          }

          // validate the optional field `cards` (array)
          for (int i = 0; i < jsonArraycards.size(); i++) {
            Dashboardsv3Card.validateJsonElement(jsonArraycards.get(i));
          };
        }
      }
      if ((jsonObj.get("dashboard_description") != null && !jsonObj.get("dashboard_description").isJsonNull()) && !jsonObj.get("dashboard_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboard_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboard_description").toString()));
      }
      if ((jsonObj.get("dashboard_id") != null && !jsonObj.get("dashboard_id").isJsonNull()) && !jsonObj.get("dashboard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboard_id").toString()));
      }
      if ((jsonObj.get("dashboard_title") != null && !jsonObj.get("dashboard_title").isJsonNull()) && !jsonObj.get("dashboard_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboard_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboard_title").toString()));
      }
      // validate the optional field `global_time_filter`
      if (jsonObj.get("global_time_filter") != null && !jsonObj.get("global_time_filter").isJsonNull()) {
        Dashboardsv3TimeRange.validateJsonElement(jsonObj.get("global_time_filter"));
      }
      if (jsonObj.get("report_global_filter_list") != null && !jsonObj.get("report_global_filter_list").isJsonNull()) {
        JsonArray jsonArrayreportGlobalFilterList = jsonObj.getAsJsonArray("report_global_filter_list");
        if (jsonArrayreportGlobalFilterList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("report_global_filter_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `report_global_filter_list` to be an array in the JSON string but got `%s`", jsonObj.get("report_global_filter_list").toString()));
          }

          // validate the optional field `report_global_filter_list` (array)
          for (int i = 0; i < jsonArrayreportGlobalFilterList.size(); i++) {
            Dashboardsv3ReportGlobalFilter.validateJsonElement(jsonArrayreportGlobalFilterList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboardsv3Dashboard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboardsv3Dashboard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboardsv3Dashboard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboardsv3Dashboard.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboardsv3Dashboard>() {
           @Override
           public void write(JsonWriter out, Dashboardsv3Dashboard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboardsv3Dashboard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dashboardsv3Dashboard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dashboardsv3Dashboard
  * @throws IOException if the JSON string is invalid with respect to Dashboardsv3Dashboard
  */
  public static Dashboardsv3Dashboard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboardsv3Dashboard.class);
  }

 /**
  * Convert an instance of Dashboardsv3Dashboard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

