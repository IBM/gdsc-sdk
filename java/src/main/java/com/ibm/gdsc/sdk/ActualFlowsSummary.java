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
import com.ibm.gdsc.sdk.AccessTypeCountInner;
import com.ibm.gdsc.sdk.FlowNodeSummary;
import java.io.IOException;
import java.math.BigDecimal;
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
 * ActualFlowsSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class ActualFlowsSummary {
  public static final String SERIALIZED_NAME_FLOWS_COUNT = "flowsCount";
  @SerializedName(SERIALIZED_NAME_FLOWS_COUNT)
  private BigDecimal flowsCount;

  public static final String SERIALIZED_NAME_SOURCES_SUMMARY = "sourcesSummary";
  @SerializedName(SERIALIZED_NAME_SOURCES_SUMMARY)
  private FlowNodeSummary sourcesSummary;

  public static final String SERIALIZED_NAME_DESTINATIONS_SUMMARY = "destinationsSummary";
  @SerializedName(SERIALIZED_NAME_DESTINATIONS_SUMMARY)
  private FlowNodeSummary destinationsSummary;

  public static final String SERIALIZED_NAME_ACCESS_TYPES_COUNT = "accessTypesCount";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPES_COUNT)
  private List<AccessTypeCountInner> accessTypesCount = new ArrayList<>();

  public ActualFlowsSummary() {
  }

  public ActualFlowsSummary flowsCount(BigDecimal flowsCount) {
    this.flowsCount = flowsCount;
    return this;
  }

   /**
   * Get flowsCount
   * @return flowsCount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getFlowsCount() {
    return flowsCount;
  }

  public void setFlowsCount(BigDecimal flowsCount) {
    this.flowsCount = flowsCount;
  }


  public ActualFlowsSummary sourcesSummary(FlowNodeSummary sourcesSummary) {
    this.sourcesSummary = sourcesSummary;
    return this;
  }

   /**
   * Get sourcesSummary
   * @return sourcesSummary
  **/
  @javax.annotation.Nonnull
  public FlowNodeSummary getSourcesSummary() {
    return sourcesSummary;
  }

  public void setSourcesSummary(FlowNodeSummary sourcesSummary) {
    this.sourcesSummary = sourcesSummary;
  }


  public ActualFlowsSummary destinationsSummary(FlowNodeSummary destinationsSummary) {
    this.destinationsSummary = destinationsSummary;
    return this;
  }

   /**
   * Get destinationsSummary
   * @return destinationsSummary
  **/
  @javax.annotation.Nonnull
  public FlowNodeSummary getDestinationsSummary() {
    return destinationsSummary;
  }

  public void setDestinationsSummary(FlowNodeSummary destinationsSummary) {
    this.destinationsSummary = destinationsSummary;
  }


  public ActualFlowsSummary accessTypesCount(List<AccessTypeCountInner> accessTypesCount) {
    this.accessTypesCount = accessTypesCount;
    return this;
  }

  public ActualFlowsSummary addAccessTypesCountItem(AccessTypeCountInner accessTypesCountItem) {
    if (this.accessTypesCount == null) {
      this.accessTypesCount = new ArrayList<>();
    }
    this.accessTypesCount.add(accessTypesCountItem);
    return this;
  }

   /**
   * Get accessTypesCount
   * @return accessTypesCount
  **/
  @javax.annotation.Nonnull
  public List<AccessTypeCountInner> getAccessTypesCount() {
    return accessTypesCount;
  }

  public void setAccessTypesCount(List<AccessTypeCountInner> accessTypesCount) {
    this.accessTypesCount = accessTypesCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActualFlowsSummary actualFlowsSummary = (ActualFlowsSummary) o;
    return Objects.equals(this.flowsCount, actualFlowsSummary.flowsCount) &&
        Objects.equals(this.sourcesSummary, actualFlowsSummary.sourcesSummary) &&
        Objects.equals(this.destinationsSummary, actualFlowsSummary.destinationsSummary) &&
        Objects.equals(this.accessTypesCount, actualFlowsSummary.accessTypesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowsCount, sourcesSummary, destinationsSummary, accessTypesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualFlowsSummary {\n");
    sb.append("    flowsCount: ").append(toIndentedString(flowsCount)).append("\n");
    sb.append("    sourcesSummary: ").append(toIndentedString(sourcesSummary)).append("\n");
    sb.append("    destinationsSummary: ").append(toIndentedString(destinationsSummary)).append("\n");
    sb.append("    accessTypesCount: ").append(toIndentedString(accessTypesCount)).append("\n");
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
    openapiFields.add("flowsCount");
    openapiFields.add("sourcesSummary");
    openapiFields.add("destinationsSummary");
    openapiFields.add("accessTypesCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("flowsCount");
    openapiRequiredFields.add("sourcesSummary");
    openapiRequiredFields.add("destinationsSummary");
    openapiRequiredFields.add("accessTypesCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ActualFlowsSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActualFlowsSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActualFlowsSummary is not found in the empty JSON string", ActualFlowsSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActualFlowsSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActualFlowsSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActualFlowsSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `sourcesSummary`
      FlowNodeSummary.validateJsonElement(jsonObj.get("sourcesSummary"));
      // validate the required field `destinationsSummary`
      FlowNodeSummary.validateJsonElement(jsonObj.get("destinationsSummary"));
      // ensure the json data is an array
      if (!jsonObj.get("accessTypesCount").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTypesCount` to be an array in the JSON string but got `%s`", jsonObj.get("accessTypesCount").toString()));
      }

      JsonArray jsonArrayaccessTypesCount = jsonObj.getAsJsonArray("accessTypesCount");
      // validate the required field `accessTypesCount` (array)
      for (int i = 0; i < jsonArrayaccessTypesCount.size(); i++) {
        AccessTypeCountInner.validateJsonElement(jsonArrayaccessTypesCount.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActualFlowsSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActualFlowsSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActualFlowsSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActualFlowsSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ActualFlowsSummary>() {
           @Override
           public void write(JsonWriter out, ActualFlowsSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActualFlowsSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActualFlowsSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActualFlowsSummary
  * @throws IOException if the JSON string is invalid with respect to ActualFlowsSummary
  */
  public static ActualFlowsSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActualFlowsSummary.class);
  }

 /**
  * Convert an instance of ActualFlowsSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

