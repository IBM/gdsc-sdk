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
import java.io.IOException;
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
 * Riskanalyticscontrollerv3Indicator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3Indicator {
  public static final String SERIALIZED_NAME_INDICATOR_DESC = "indicator_desc";
  @SerializedName(SERIALIZED_NAME_INDICATOR_DESC)
  private String indicatorDesc;

  public static final String SERIALIZED_NAME_INDICATOR_SCORE = "indicator_score";
  @SerializedName(SERIALIZED_NAME_INDICATOR_SCORE)
  private Integer indicatorScore;

  public Riskanalyticscontrollerv3Indicator() {
  }

  public Riskanalyticscontrollerv3Indicator indicatorDesc(String indicatorDesc) {
    this.indicatorDesc = indicatorDesc;
    return this;
  }

   /**
   * Indicator (feature) description.
   * @return indicatorDesc
  **/
  @javax.annotation.Nullable
  public String getIndicatorDesc() {
    return indicatorDesc;
  }

  public void setIndicatorDesc(String indicatorDesc) {
    this.indicatorDesc = indicatorDesc;
  }


  public Riskanalyticscontrollerv3Indicator indicatorScore(Integer indicatorScore) {
    this.indicatorScore = indicatorScore;
    return this;
  }

   /**
   * Indicator (feature) score.
   * @return indicatorScore
  **/
  @javax.annotation.Nullable
  public Integer getIndicatorScore() {
    return indicatorScore;
  }

  public void setIndicatorScore(Integer indicatorScore) {
    this.indicatorScore = indicatorScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3Indicator riskanalyticscontrollerv3Indicator = (Riskanalyticscontrollerv3Indicator) o;
    return Objects.equals(this.indicatorDesc, riskanalyticscontrollerv3Indicator.indicatorDesc) &&
        Objects.equals(this.indicatorScore, riskanalyticscontrollerv3Indicator.indicatorScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatorDesc, indicatorScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3Indicator {\n");
    sb.append("    indicatorDesc: ").append(toIndentedString(indicatorDesc)).append("\n");
    sb.append("    indicatorScore: ").append(toIndentedString(indicatorScore)).append("\n");
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
    openapiFields.add("indicator_desc");
    openapiFields.add("indicator_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3Indicator
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3Indicator.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3Indicator is not found in the empty JSON string", Riskanalyticscontrollerv3Indicator.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3Indicator.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3Indicator` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("indicator_desc") != null && !jsonObj.get("indicator_desc").isJsonNull()) && !jsonObj.get("indicator_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indicator_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indicator_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3Indicator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3Indicator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3Indicator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3Indicator.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3Indicator>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3Indicator value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3Indicator read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3Indicator given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3Indicator
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3Indicator
  */
  public static Riskanalyticscontrollerv3Indicator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3Indicator.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3Indicator to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

