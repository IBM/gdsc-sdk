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
import org.openapitools.client.model.Outliersenginev3WorkingHoursPeriod;

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
 * GetWorkingHoursPeriodsResponse is the response object for GetWorkingHoursPeriods API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3GetWorkingHoursPeriodsResponse {
  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private List<Outliersenginev3WorkingHoursPeriod> periods = new ArrayList<>();

  public Outliersenginev3GetWorkingHoursPeriodsResponse() {
  }

  public Outliersenginev3GetWorkingHoursPeriodsResponse periods(List<Outliersenginev3WorkingHoursPeriod> periods) {
    this.periods = periods;
    return this;
  }

  public Outliersenginev3GetWorkingHoursPeriodsResponse addPeriodsItem(Outliersenginev3WorkingHoursPeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * Periods is a list of WorkingHoursPeriod objects retrived from the database.
   * @return periods
  **/
  @javax.annotation.Nullable
  public List<Outliersenginev3WorkingHoursPeriod> getPeriods() {
    return periods;
  }

  public void setPeriods(List<Outliersenginev3WorkingHoursPeriod> periods) {
    this.periods = periods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3GetWorkingHoursPeriodsResponse outliersenginev3GetWorkingHoursPeriodsResponse = (Outliersenginev3GetWorkingHoursPeriodsResponse) o;
    return Objects.equals(this.periods, outliersenginev3GetWorkingHoursPeriodsResponse.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3GetWorkingHoursPeriodsResponse {\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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
    openapiFields.add("periods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3GetWorkingHoursPeriodsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3GetWorkingHoursPeriodsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3GetWorkingHoursPeriodsResponse is not found in the empty JSON string", Outliersenginev3GetWorkingHoursPeriodsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3GetWorkingHoursPeriodsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3GetWorkingHoursPeriodsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("periods") != null && !jsonObj.get("periods").isJsonNull()) {
        JsonArray jsonArrayperiods = jsonObj.getAsJsonArray("periods");
        if (jsonArrayperiods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("periods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `periods` to be an array in the JSON string but got `%s`", jsonObj.get("periods").toString()));
          }

          // validate the optional field `periods` (array)
          for (int i = 0; i < jsonArrayperiods.size(); i++) {
            Outliersenginev3WorkingHoursPeriod.validateJsonElement(jsonArrayperiods.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3GetWorkingHoursPeriodsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3GetWorkingHoursPeriodsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3GetWorkingHoursPeriodsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3GetWorkingHoursPeriodsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3GetWorkingHoursPeriodsResponse>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3GetWorkingHoursPeriodsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3GetWorkingHoursPeriodsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3GetWorkingHoursPeriodsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3GetWorkingHoursPeriodsResponse
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3GetWorkingHoursPeriodsResponse
  */
  public static Outliersenginev3GetWorkingHoursPeriodsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3GetWorkingHoursPeriodsResponse.class);
  }

 /**
  * Convert an instance of Outliersenginev3GetWorkingHoursPeriodsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

