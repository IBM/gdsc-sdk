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
import org.openapitools.client.model.Assetsv3FilterSubCatagory;
import org.openapitools.client.model.Assetsv3TimelineDateRange;

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
 * Assetsv3FilterCatagory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3FilterCatagory {
  public static final String SERIALIZED_NAME_CATAGORY_ID = "catagory_id";
  @SerializedName(SERIALIZED_NAME_CATAGORY_ID)
  private String catagoryId;

  public static final String SERIALIZED_NAME_DATE_RANGE = "date_range";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE)
  private Assetsv3TimelineDateRange dateRange;

  public static final String SERIALIZED_NAME_SELECTED_SUB_CATAGORY_LIST = "selected_sub_catagory_list";
  @SerializedName(SERIALIZED_NAME_SELECTED_SUB_CATAGORY_LIST)
  private List<Assetsv3FilterSubCatagory> selectedSubCatagoryList = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUB_CATAGORY_IDS = "sub_catagory_ids";
  @SerializedName(SERIALIZED_NAME_SUB_CATAGORY_IDS)
  private List<String> subCatagoryIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUB_CATEGORY_VALUES = "sub_category_values";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY_VALUES)
  private List<String> subCategoryValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMELINE_VALUE_SELECTED = "timeline_value_selected";
  @SerializedName(SERIALIZED_NAME_TIMELINE_VALUE_SELECTED)
  private String timelineValueSelected;

  public Assetsv3FilterCatagory() {
  }

  public Assetsv3FilterCatagory catagoryId(String catagoryId) {
    this.catagoryId = catagoryId;
    return this;
  }

   /**
   * Get catagoryId
   * @return catagoryId
  **/
  @javax.annotation.Nullable
  public String getCatagoryId() {
    return catagoryId;
  }

  public void setCatagoryId(String catagoryId) {
    this.catagoryId = catagoryId;
  }


  public Assetsv3FilterCatagory dateRange(Assetsv3TimelineDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @javax.annotation.Nullable
  public Assetsv3TimelineDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(Assetsv3TimelineDateRange dateRange) {
    this.dateRange = dateRange;
  }


  public Assetsv3FilterCatagory selectedSubCatagoryList(List<Assetsv3FilterSubCatagory> selectedSubCatagoryList) {
    this.selectedSubCatagoryList = selectedSubCatagoryList;
    return this;
  }

  public Assetsv3FilterCatagory addSelectedSubCatagoryListItem(Assetsv3FilterSubCatagory selectedSubCatagoryListItem) {
    if (this.selectedSubCatagoryList == null) {
      this.selectedSubCatagoryList = new ArrayList<>();
    }
    this.selectedSubCatagoryList.add(selectedSubCatagoryListItem);
    return this;
  }

   /**
   * Get selectedSubCatagoryList
   * @return selectedSubCatagoryList
  **/
  @javax.annotation.Nullable
  public List<Assetsv3FilterSubCatagory> getSelectedSubCatagoryList() {
    return selectedSubCatagoryList;
  }

  public void setSelectedSubCatagoryList(List<Assetsv3FilterSubCatagory> selectedSubCatagoryList) {
    this.selectedSubCatagoryList = selectedSubCatagoryList;
  }


  public Assetsv3FilterCatagory subCatagoryIds(List<String> subCatagoryIds) {
    this.subCatagoryIds = subCatagoryIds;
    return this;
  }

  public Assetsv3FilterCatagory addSubCatagoryIdsItem(String subCatagoryIdsItem) {
    if (this.subCatagoryIds == null) {
      this.subCatagoryIds = new ArrayList<>();
    }
    this.subCatagoryIds.add(subCatagoryIdsItem);
    return this;
  }

   /**
   * Get subCatagoryIds
   * @return subCatagoryIds
  **/
  @javax.annotation.Nullable
  public List<String> getSubCatagoryIds() {
    return subCatagoryIds;
  }

  public void setSubCatagoryIds(List<String> subCatagoryIds) {
    this.subCatagoryIds = subCatagoryIds;
  }


  public Assetsv3FilterCatagory subCategoryValues(List<String> subCategoryValues) {
    this.subCategoryValues = subCategoryValues;
    return this;
  }

  public Assetsv3FilterCatagory addSubCategoryValuesItem(String subCategoryValuesItem) {
    if (this.subCategoryValues == null) {
      this.subCategoryValues = new ArrayList<>();
    }
    this.subCategoryValues.add(subCategoryValuesItem);
    return this;
  }

   /**
   * Get subCategoryValues
   * @return subCategoryValues
  **/
  @javax.annotation.Nullable
  public List<String> getSubCategoryValues() {
    return subCategoryValues;
  }

  public void setSubCategoryValues(List<String> subCategoryValues) {
    this.subCategoryValues = subCategoryValues;
  }


  public Assetsv3FilterCatagory timelineValueSelected(String timelineValueSelected) {
    this.timelineValueSelected = timelineValueSelected;
    return this;
  }

   /**
   * Get timelineValueSelected
   * @return timelineValueSelected
  **/
  @javax.annotation.Nullable
  public String getTimelineValueSelected() {
    return timelineValueSelected;
  }

  public void setTimelineValueSelected(String timelineValueSelected) {
    this.timelineValueSelected = timelineValueSelected;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3FilterCatagory assetsv3FilterCatagory = (Assetsv3FilterCatagory) o;
    return Objects.equals(this.catagoryId, assetsv3FilterCatagory.catagoryId) &&
        Objects.equals(this.dateRange, assetsv3FilterCatagory.dateRange) &&
        Objects.equals(this.selectedSubCatagoryList, assetsv3FilterCatagory.selectedSubCatagoryList) &&
        Objects.equals(this.subCatagoryIds, assetsv3FilterCatagory.subCatagoryIds) &&
        Objects.equals(this.subCategoryValues, assetsv3FilterCatagory.subCategoryValues) &&
        Objects.equals(this.timelineValueSelected, assetsv3FilterCatagory.timelineValueSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catagoryId, dateRange, selectedSubCatagoryList, subCatagoryIds, subCategoryValues, timelineValueSelected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3FilterCatagory {\n");
    sb.append("    catagoryId: ").append(toIndentedString(catagoryId)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    selectedSubCatagoryList: ").append(toIndentedString(selectedSubCatagoryList)).append("\n");
    sb.append("    subCatagoryIds: ").append(toIndentedString(subCatagoryIds)).append("\n");
    sb.append("    subCategoryValues: ").append(toIndentedString(subCategoryValues)).append("\n");
    sb.append("    timelineValueSelected: ").append(toIndentedString(timelineValueSelected)).append("\n");
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
    openapiFields.add("catagory_id");
    openapiFields.add("date_range");
    openapiFields.add("selected_sub_catagory_list");
    openapiFields.add("sub_catagory_ids");
    openapiFields.add("sub_category_values");
    openapiFields.add("timeline_value_selected");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3FilterCatagory
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3FilterCatagory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3FilterCatagory is not found in the empty JSON string", Assetsv3FilterCatagory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3FilterCatagory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3FilterCatagory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("catagory_id") != null && !jsonObj.get("catagory_id").isJsonNull()) && !jsonObj.get("catagory_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catagory_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catagory_id").toString()));
      }
      // validate the optional field `date_range`
      if (jsonObj.get("date_range") != null && !jsonObj.get("date_range").isJsonNull()) {
        Assetsv3TimelineDateRange.validateJsonElement(jsonObj.get("date_range"));
      }
      if (jsonObj.get("selected_sub_catagory_list") != null && !jsonObj.get("selected_sub_catagory_list").isJsonNull()) {
        JsonArray jsonArrayselectedSubCatagoryList = jsonObj.getAsJsonArray("selected_sub_catagory_list");
        if (jsonArrayselectedSubCatagoryList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selected_sub_catagory_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `selected_sub_catagory_list` to be an array in the JSON string but got `%s`", jsonObj.get("selected_sub_catagory_list").toString()));
          }

          // validate the optional field `selected_sub_catagory_list` (array)
          for (int i = 0; i < jsonArrayselectedSubCatagoryList.size(); i++) {
            Assetsv3FilterSubCatagory.validateJsonElement(jsonArrayselectedSubCatagoryList.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sub_catagory_ids") != null && !jsonObj.get("sub_catagory_ids").isJsonNull() && !jsonObj.get("sub_catagory_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_catagory_ids` to be an array in the JSON string but got `%s`", jsonObj.get("sub_catagory_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sub_category_values") != null && !jsonObj.get("sub_category_values").isJsonNull() && !jsonObj.get("sub_category_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_category_values` to be an array in the JSON string but got `%s`", jsonObj.get("sub_category_values").toString()));
      }
      if ((jsonObj.get("timeline_value_selected") != null && !jsonObj.get("timeline_value_selected").isJsonNull()) && !jsonObj.get("timeline_value_selected").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeline_value_selected` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeline_value_selected").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3FilterCatagory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3FilterCatagory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3FilterCatagory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3FilterCatagory.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3FilterCatagory>() {
           @Override
           public void write(JsonWriter out, Assetsv3FilterCatagory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3FilterCatagory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3FilterCatagory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3FilterCatagory
  * @throws IOException if the JSON string is invalid with respect to Assetsv3FilterCatagory
  */
  public static Assetsv3FilterCatagory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3FilterCatagory.class);
  }

 /**
  * Convert an instance of Assetsv3FilterCatagory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

