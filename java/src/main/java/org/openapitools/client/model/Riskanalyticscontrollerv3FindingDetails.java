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
import org.openapitools.client.model.Riskanalyticscontrollerv3DetailToCount;

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
 * Riskanalyticscontrollerv3FindingDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3FindingDetails {
  public static final String SERIALIZED_NAME_COUNTS = "counts";
  @SerializedName(SERIALIZED_NAME_COUNTS)
  private List<Riskanalyticscontrollerv3DetailToCount> counts = new ArrayList<>();

  public static final String SERIALIZED_NAME_FINDING_EXAMPLES = "finding_examples";
  @SerializedName(SERIALIZED_NAME_FINDING_EXAMPLES)
  private List<String> findingExamples = new ArrayList<>();

  public Riskanalyticscontrollerv3FindingDetails() {
  }

  public Riskanalyticscontrollerv3FindingDetails counts(List<Riskanalyticscontrollerv3DetailToCount> counts) {
    this.counts = counts;
    return this;
  }

  public Riskanalyticscontrollerv3FindingDetails addCountsItem(Riskanalyticscontrollerv3DetailToCount countsItem) {
    if (this.counts == null) {
      this.counts = new ArrayList<>();
    }
    this.counts.add(countsItem);
    return this;
  }

   /**
   * Finding details counts (for violation, exception) - Optional.
   * @return counts
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3DetailToCount> getCounts() {
    return counts;
  }

  public void setCounts(List<Riskanalyticscontrollerv3DetailToCount> counts) {
    this.counts = counts;
  }


  public Riskanalyticscontrollerv3FindingDetails findingExamples(List<String> findingExamples) {
    this.findingExamples = findingExamples;
    return this;
  }

  public Riskanalyticscontrollerv3FindingDetails addFindingExamplesItem(String findingExamplesItem) {
    if (this.findingExamples == null) {
      this.findingExamples = new ArrayList<>();
    }
    this.findingExamples.add(findingExamplesItem);
    return this;
  }

   /**
   * Finding examples (for outlier, activity) - Optional.
   * @return findingExamples
  **/
  @javax.annotation.Nullable
  public List<String> getFindingExamples() {
    return findingExamples;
  }

  public void setFindingExamples(List<String> findingExamples) {
    this.findingExamples = findingExamples;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3FindingDetails riskanalyticscontrollerv3FindingDetails = (Riskanalyticscontrollerv3FindingDetails) o;
    return Objects.equals(this.counts, riskanalyticscontrollerv3FindingDetails.counts) &&
        Objects.equals(this.findingExamples, riskanalyticscontrollerv3FindingDetails.findingExamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, findingExamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3FindingDetails {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    findingExamples: ").append(toIndentedString(findingExamples)).append("\n");
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
    openapiFields.add("counts");
    openapiFields.add("finding_examples");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3FindingDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3FindingDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3FindingDetails is not found in the empty JSON string", Riskanalyticscontrollerv3FindingDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3FindingDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3FindingDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("counts") != null && !jsonObj.get("counts").isJsonNull()) {
        JsonArray jsonArraycounts = jsonObj.getAsJsonArray("counts");
        if (jsonArraycounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("counts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `counts` to be an array in the JSON string but got `%s`", jsonObj.get("counts").toString()));
          }

          // validate the optional field `counts` (array)
          for (int i = 0; i < jsonArraycounts.size(); i++) {
            Riskanalyticscontrollerv3DetailToCount.validateJsonElement(jsonArraycounts.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("finding_examples") != null && !jsonObj.get("finding_examples").isJsonNull() && !jsonObj.get("finding_examples").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `finding_examples` to be an array in the JSON string but got `%s`", jsonObj.get("finding_examples").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3FindingDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3FindingDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3FindingDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3FindingDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3FindingDetails>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3FindingDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3FindingDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3FindingDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3FindingDetails
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3FindingDetails
  */
  public static Riskanalyticscontrollerv3FindingDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3FindingDetails.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3FindingDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

