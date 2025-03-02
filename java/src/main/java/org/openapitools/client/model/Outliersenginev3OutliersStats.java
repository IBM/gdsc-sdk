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
import org.openapitools.client.model.Outliersenginev3OutlierTypeStats;

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
 * Statistics of the types of outliers found during various time periods.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3OutliersStats {
  public static final String SERIALIZED_NAME_OUTLIER_TYPE_STATS1H = "outlier_type_stats_1h";
  @SerializedName(SERIALIZED_NAME_OUTLIER_TYPE_STATS1H)
  private List<Outliersenginev3OutlierTypeStats> outlierTypeStats1h = new ArrayList<>();

  public static final String SERIALIZED_NAME_OUTLIER_TYPE_STATS24H = "outlier_type_stats_24h";
  @SerializedName(SERIALIZED_NAME_OUTLIER_TYPE_STATS24H)
  private List<Outliersenginev3OutlierTypeStats> outlierTypeStats24h = new ArrayList<>();

  public Outliersenginev3OutliersStats() {
  }

  public Outliersenginev3OutliersStats outlierTypeStats1h(List<Outliersenginev3OutlierTypeStats> outlierTypeStats1h) {
    this.outlierTypeStats1h = outlierTypeStats1h;
    return this;
  }

  public Outliersenginev3OutliersStats addOutlierTypeStats1hItem(Outliersenginev3OutlierTypeStats outlierTypeStats1hItem) {
    if (this.outlierTypeStats1h == null) {
      this.outlierTypeStats1h = new ArrayList<>();
    }
    this.outlierTypeStats1h.add(outlierTypeStats1hItem);
    return this;
  }

   /**
   * Types of outliers found in the last hour.
   * @return outlierTypeStats1h
  **/
  @javax.annotation.Nullable
  public List<Outliersenginev3OutlierTypeStats> getOutlierTypeStats1h() {
    return outlierTypeStats1h;
  }

  public void setOutlierTypeStats1h(List<Outliersenginev3OutlierTypeStats> outlierTypeStats1h) {
    this.outlierTypeStats1h = outlierTypeStats1h;
  }


  public Outliersenginev3OutliersStats outlierTypeStats24h(List<Outliersenginev3OutlierTypeStats> outlierTypeStats24h) {
    this.outlierTypeStats24h = outlierTypeStats24h;
    return this;
  }

  public Outliersenginev3OutliersStats addOutlierTypeStats24hItem(Outliersenginev3OutlierTypeStats outlierTypeStats24hItem) {
    if (this.outlierTypeStats24h == null) {
      this.outlierTypeStats24h = new ArrayList<>();
    }
    this.outlierTypeStats24h.add(outlierTypeStats24hItem);
    return this;
  }

   /**
   * Types of outliers found in the past 24 hours.
   * @return outlierTypeStats24h
  **/
  @javax.annotation.Nullable
  public List<Outliersenginev3OutlierTypeStats> getOutlierTypeStats24h() {
    return outlierTypeStats24h;
  }

  public void setOutlierTypeStats24h(List<Outliersenginev3OutlierTypeStats> outlierTypeStats24h) {
    this.outlierTypeStats24h = outlierTypeStats24h;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3OutliersStats outliersenginev3OutliersStats = (Outliersenginev3OutliersStats) o;
    return Objects.equals(this.outlierTypeStats1h, outliersenginev3OutliersStats.outlierTypeStats1h) &&
        Objects.equals(this.outlierTypeStats24h, outliersenginev3OutliersStats.outlierTypeStats24h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlierTypeStats1h, outlierTypeStats24h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3OutliersStats {\n");
    sb.append("    outlierTypeStats1h: ").append(toIndentedString(outlierTypeStats1h)).append("\n");
    sb.append("    outlierTypeStats24h: ").append(toIndentedString(outlierTypeStats24h)).append("\n");
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
    openapiFields.add("outlier_type_stats_1h");
    openapiFields.add("outlier_type_stats_24h");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3OutliersStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3OutliersStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3OutliersStats is not found in the empty JSON string", Outliersenginev3OutliersStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3OutliersStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3OutliersStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("outlier_type_stats_1h") != null && !jsonObj.get("outlier_type_stats_1h").isJsonNull()) {
        JsonArray jsonArrayoutlierTypeStats1h = jsonObj.getAsJsonArray("outlier_type_stats_1h");
        if (jsonArrayoutlierTypeStats1h != null) {
          // ensure the json data is an array
          if (!jsonObj.get("outlier_type_stats_1h").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `outlier_type_stats_1h` to be an array in the JSON string but got `%s`", jsonObj.get("outlier_type_stats_1h").toString()));
          }

          // validate the optional field `outlier_type_stats_1h` (array)
          for (int i = 0; i < jsonArrayoutlierTypeStats1h.size(); i++) {
            Outliersenginev3OutlierTypeStats.validateJsonElement(jsonArrayoutlierTypeStats1h.get(i));
          };
        }
      }
      if (jsonObj.get("outlier_type_stats_24h") != null && !jsonObj.get("outlier_type_stats_24h").isJsonNull()) {
        JsonArray jsonArrayoutlierTypeStats24h = jsonObj.getAsJsonArray("outlier_type_stats_24h");
        if (jsonArrayoutlierTypeStats24h != null) {
          // ensure the json data is an array
          if (!jsonObj.get("outlier_type_stats_24h").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `outlier_type_stats_24h` to be an array in the JSON string but got `%s`", jsonObj.get("outlier_type_stats_24h").toString()));
          }

          // validate the optional field `outlier_type_stats_24h` (array)
          for (int i = 0; i < jsonArrayoutlierTypeStats24h.size(); i++) {
            Outliersenginev3OutlierTypeStats.validateJsonElement(jsonArrayoutlierTypeStats24h.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3OutliersStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3OutliersStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3OutliersStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3OutliersStats.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3OutliersStats>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3OutliersStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3OutliersStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3OutliersStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3OutliersStats
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3OutliersStats
  */
  public static Outliersenginev3OutliersStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3OutliersStats.class);
  }

 /**
  * Convert an instance of Outliersenginev3OutliersStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

