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
import org.openapitools.client.model.Assetsv3FilterSubCatagoryChild;

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
 * Assetsv3FilterSubCatagory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3FilterSubCatagory {
  public static final String SERIALIZED_NAME_SELECTED_CHILDREN_LIST = "selected_children_list";
  @SerializedName(SERIALIZED_NAME_SELECTED_CHILDREN_LIST)
  private List<Assetsv3FilterSubCatagoryChild> selectedChildrenList = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUB_CATAGORY_ID = "sub_catagory_id";
  @SerializedName(SERIALIZED_NAME_SUB_CATAGORY_ID)
  private String subCatagoryId;

  public static final String SERIALIZED_NAME_SUB_CATEGORY_VALUE = "sub_category_value";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY_VALUE)
  private String subCategoryValue;

  public Assetsv3FilterSubCatagory() {
  }

  public Assetsv3FilterSubCatagory selectedChildrenList(List<Assetsv3FilterSubCatagoryChild> selectedChildrenList) {
    this.selectedChildrenList = selectedChildrenList;
    return this;
  }

  public Assetsv3FilterSubCatagory addSelectedChildrenListItem(Assetsv3FilterSubCatagoryChild selectedChildrenListItem) {
    if (this.selectedChildrenList == null) {
      this.selectedChildrenList = new ArrayList<>();
    }
    this.selectedChildrenList.add(selectedChildrenListItem);
    return this;
  }

   /**
   * Get selectedChildrenList
   * @return selectedChildrenList
  **/
  @javax.annotation.Nullable
  public List<Assetsv3FilterSubCatagoryChild> getSelectedChildrenList() {
    return selectedChildrenList;
  }

  public void setSelectedChildrenList(List<Assetsv3FilterSubCatagoryChild> selectedChildrenList) {
    this.selectedChildrenList = selectedChildrenList;
  }


  public Assetsv3FilterSubCatagory subCatagoryId(String subCatagoryId) {
    this.subCatagoryId = subCatagoryId;
    return this;
  }

   /**
   * Get subCatagoryId
   * @return subCatagoryId
  **/
  @javax.annotation.Nullable
  public String getSubCatagoryId() {
    return subCatagoryId;
  }

  public void setSubCatagoryId(String subCatagoryId) {
    this.subCatagoryId = subCatagoryId;
  }


  public Assetsv3FilterSubCatagory subCategoryValue(String subCategoryValue) {
    this.subCategoryValue = subCategoryValue;
    return this;
  }

   /**
   * Get subCategoryValue
   * @return subCategoryValue
  **/
  @javax.annotation.Nullable
  public String getSubCategoryValue() {
    return subCategoryValue;
  }

  public void setSubCategoryValue(String subCategoryValue) {
    this.subCategoryValue = subCategoryValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3FilterSubCatagory assetsv3FilterSubCatagory = (Assetsv3FilterSubCatagory) o;
    return Objects.equals(this.selectedChildrenList, assetsv3FilterSubCatagory.selectedChildrenList) &&
        Objects.equals(this.subCatagoryId, assetsv3FilterSubCatagory.subCatagoryId) &&
        Objects.equals(this.subCategoryValue, assetsv3FilterSubCatagory.subCategoryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedChildrenList, subCatagoryId, subCategoryValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3FilterSubCatagory {\n");
    sb.append("    selectedChildrenList: ").append(toIndentedString(selectedChildrenList)).append("\n");
    sb.append("    subCatagoryId: ").append(toIndentedString(subCatagoryId)).append("\n");
    sb.append("    subCategoryValue: ").append(toIndentedString(subCategoryValue)).append("\n");
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
    openapiFields.add("selected_children_list");
    openapiFields.add("sub_catagory_id");
    openapiFields.add("sub_category_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3FilterSubCatagory
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3FilterSubCatagory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3FilterSubCatagory is not found in the empty JSON string", Assetsv3FilterSubCatagory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3FilterSubCatagory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3FilterSubCatagory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("selected_children_list") != null && !jsonObj.get("selected_children_list").isJsonNull()) {
        JsonArray jsonArrayselectedChildrenList = jsonObj.getAsJsonArray("selected_children_list");
        if (jsonArrayselectedChildrenList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selected_children_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `selected_children_list` to be an array in the JSON string but got `%s`", jsonObj.get("selected_children_list").toString()));
          }

          // validate the optional field `selected_children_list` (array)
          for (int i = 0; i < jsonArrayselectedChildrenList.size(); i++) {
            Assetsv3FilterSubCatagoryChild.validateJsonElement(jsonArrayselectedChildrenList.get(i));
          };
        }
      }
      if ((jsonObj.get("sub_catagory_id") != null && !jsonObj.get("sub_catagory_id").isJsonNull()) && !jsonObj.get("sub_catagory_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_catagory_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_catagory_id").toString()));
      }
      if ((jsonObj.get("sub_category_value") != null && !jsonObj.get("sub_category_value").isJsonNull()) && !jsonObj.get("sub_category_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_category_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_category_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3FilterSubCatagory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3FilterSubCatagory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3FilterSubCatagory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3FilterSubCatagory.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3FilterSubCatagory>() {
           @Override
           public void write(JsonWriter out, Assetsv3FilterSubCatagory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3FilterSubCatagory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3FilterSubCatagory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3FilterSubCatagory
  * @throws IOException if the JSON string is invalid with respect to Assetsv3FilterSubCatagory
  */
  public static Assetsv3FilterSubCatagory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3FilterSubCatagory.class);
  }

 /**
  * Convert an instance of Assetsv3FilterSubCatagory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

