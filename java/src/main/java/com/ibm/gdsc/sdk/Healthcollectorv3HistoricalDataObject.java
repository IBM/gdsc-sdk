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
import com.ibm.gdsc.sdk.Healthcollectorv3CountObject;
import com.ibm.gdsc.sdk.Healthcollectorv3StapInformationObject;
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
 * S-tap Historical data object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3HistoricalDataObject {
  public static final String SERIALIZED_NAME_CM_ID = "cm_id";
  @SerializedName(SERIALIZED_NAME_CM_ID)
  private String cmId;

  public static final String SERIALIZED_NAME_INSPECTION_ENGINE_COUNTS = "inspection_engine_counts";
  @SerializedName(SERIALIZED_NAME_INSPECTION_ENGINE_COUNTS)
  private List<Healthcollectorv3CountObject> inspectionEngineCounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<Healthcollectorv3StapInformationObject> nodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STAP_COUNTS = "stap_counts";
  @SerializedName(SERIALIZED_NAME_STAP_COUNTS)
  private List<Healthcollectorv3CountObject> stapCounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_STAPS_ADDED = "staps_added";
  @SerializedName(SERIALIZED_NAME_STAPS_ADDED)
  private Integer stapsAdded;

  public static final String SERIALIZED_NAME_STAPS_REMOVED = "staps_removed";
  @SerializedName(SERIALIZED_NAME_STAPS_REMOVED)
  private Integer stapsRemoved;

  public static final String SERIALIZED_NAME_STAPS_WITH_IE_CHANGES = "staps_with_ie_changes";
  @SerializedName(SERIALIZED_NAME_STAPS_WITH_IE_CHANGES)
  private Integer stapsWithIeChanges;

  public Healthcollectorv3HistoricalDataObject() {
  }

  public Healthcollectorv3HistoricalDataObject cmId(String cmId) {
    this.cmId = cmId;
    return this;
  }

   /**
   * Cm Id.
   * @return cmId
  **/
  @javax.annotation.Nullable
  public String getCmId() {
    return cmId;
  }

  public void setCmId(String cmId) {
    this.cmId = cmId;
  }


  public Healthcollectorv3HistoricalDataObject inspectionEngineCounts(List<Healthcollectorv3CountObject> inspectionEngineCounts) {
    this.inspectionEngineCounts = inspectionEngineCounts;
    return this;
  }

  public Healthcollectorv3HistoricalDataObject addInspectionEngineCountsItem(Healthcollectorv3CountObject inspectionEngineCountsItem) {
    if (this.inspectionEngineCounts == null) {
      this.inspectionEngineCounts = new ArrayList<>();
    }
    this.inspectionEngineCounts.add(inspectionEngineCountsItem);
    return this;
  }

   /**
   * Inspection engine counts over a period of time.
   * @return inspectionEngineCounts
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3CountObject> getInspectionEngineCounts() {
    return inspectionEngineCounts;
  }

  public void setInspectionEngineCounts(List<Healthcollectorv3CountObject> inspectionEngineCounts) {
    this.inspectionEngineCounts = inspectionEngineCounts;
  }


  public Healthcollectorv3HistoricalDataObject nodes(List<Healthcollectorv3StapInformationObject> nodes) {
    this.nodes = nodes;
    return this;
  }

  public Healthcollectorv3HistoricalDataObject addNodesItem(Healthcollectorv3StapInformationObject nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Detailed information about staps.
   * @return nodes
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3StapInformationObject> getNodes() {
    return nodes;
  }

  public void setNodes(List<Healthcollectorv3StapInformationObject> nodes) {
    this.nodes = nodes;
  }


  public Healthcollectorv3HistoricalDataObject stapCounts(List<Healthcollectorv3CountObject> stapCounts) {
    this.stapCounts = stapCounts;
    return this;
  }

  public Healthcollectorv3HistoricalDataObject addStapCountsItem(Healthcollectorv3CountObject stapCountsItem) {
    if (this.stapCounts == null) {
      this.stapCounts = new ArrayList<>();
    }
    this.stapCounts.add(stapCountsItem);
    return this;
  }

   /**
   * Stap counts over a period of time.
   * @return stapCounts
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3CountObject> getStapCounts() {
    return stapCounts;
  }

  public void setStapCounts(List<Healthcollectorv3CountObject> stapCounts) {
    this.stapCounts = stapCounts;
  }


  public Healthcollectorv3HistoricalDataObject stapsAdded(Integer stapsAdded) {
    this.stapsAdded = stapsAdded;
    return this;
  }

   /**
   * Count of staps added.
   * @return stapsAdded
  **/
  @javax.annotation.Nullable
  public Integer getStapsAdded() {
    return stapsAdded;
  }

  public void setStapsAdded(Integer stapsAdded) {
    this.stapsAdded = stapsAdded;
  }


  public Healthcollectorv3HistoricalDataObject stapsRemoved(Integer stapsRemoved) {
    this.stapsRemoved = stapsRemoved;
    return this;
  }

   /**
   * Count of staps removed.
   * @return stapsRemoved
  **/
  @javax.annotation.Nullable
  public Integer getStapsRemoved() {
    return stapsRemoved;
  }

  public void setStapsRemoved(Integer stapsRemoved) {
    this.stapsRemoved = stapsRemoved;
  }


  public Healthcollectorv3HistoricalDataObject stapsWithIeChanges(Integer stapsWithIeChanges) {
    this.stapsWithIeChanges = stapsWithIeChanges;
    return this;
  }

   /**
   * Count of staps that had ie changes.
   * @return stapsWithIeChanges
  **/
  @javax.annotation.Nullable
  public Integer getStapsWithIeChanges() {
    return stapsWithIeChanges;
  }

  public void setStapsWithIeChanges(Integer stapsWithIeChanges) {
    this.stapsWithIeChanges = stapsWithIeChanges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3HistoricalDataObject healthcollectorv3HistoricalDataObject = (Healthcollectorv3HistoricalDataObject) o;
    return Objects.equals(this.cmId, healthcollectorv3HistoricalDataObject.cmId) &&
        Objects.equals(this.inspectionEngineCounts, healthcollectorv3HistoricalDataObject.inspectionEngineCounts) &&
        Objects.equals(this.nodes, healthcollectorv3HistoricalDataObject.nodes) &&
        Objects.equals(this.stapCounts, healthcollectorv3HistoricalDataObject.stapCounts) &&
        Objects.equals(this.stapsAdded, healthcollectorv3HistoricalDataObject.stapsAdded) &&
        Objects.equals(this.stapsRemoved, healthcollectorv3HistoricalDataObject.stapsRemoved) &&
        Objects.equals(this.stapsWithIeChanges, healthcollectorv3HistoricalDataObject.stapsWithIeChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmId, inspectionEngineCounts, nodes, stapCounts, stapsAdded, stapsRemoved, stapsWithIeChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3HistoricalDataObject {\n");
    sb.append("    cmId: ").append(toIndentedString(cmId)).append("\n");
    sb.append("    inspectionEngineCounts: ").append(toIndentedString(inspectionEngineCounts)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    stapCounts: ").append(toIndentedString(stapCounts)).append("\n");
    sb.append("    stapsAdded: ").append(toIndentedString(stapsAdded)).append("\n");
    sb.append("    stapsRemoved: ").append(toIndentedString(stapsRemoved)).append("\n");
    sb.append("    stapsWithIeChanges: ").append(toIndentedString(stapsWithIeChanges)).append("\n");
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
    openapiFields.add("cm_id");
    openapiFields.add("inspection_engine_counts");
    openapiFields.add("nodes");
    openapiFields.add("stap_counts");
    openapiFields.add("staps_added");
    openapiFields.add("staps_removed");
    openapiFields.add("staps_with_ie_changes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3HistoricalDataObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3HistoricalDataObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3HistoricalDataObject is not found in the empty JSON string", Healthcollectorv3HistoricalDataObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3HistoricalDataObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3HistoricalDataObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cm_id") != null && !jsonObj.get("cm_id").isJsonNull()) && !jsonObj.get("cm_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cm_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cm_id").toString()));
      }
      if (jsonObj.get("inspection_engine_counts") != null && !jsonObj.get("inspection_engine_counts").isJsonNull()) {
        JsonArray jsonArrayinspectionEngineCounts = jsonObj.getAsJsonArray("inspection_engine_counts");
        if (jsonArrayinspectionEngineCounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inspection_engine_counts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inspection_engine_counts` to be an array in the JSON string but got `%s`", jsonObj.get("inspection_engine_counts").toString()));
          }

          // validate the optional field `inspection_engine_counts` (array)
          for (int i = 0; i < jsonArrayinspectionEngineCounts.size(); i++) {
            Healthcollectorv3CountObject.validateJsonElement(jsonArrayinspectionEngineCounts.get(i));
          };
        }
      }
      if (jsonObj.get("nodes") != null && !jsonObj.get("nodes").isJsonNull()) {
        JsonArray jsonArraynodes = jsonObj.getAsJsonArray("nodes");
        if (jsonArraynodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nodes` to be an array in the JSON string but got `%s`", jsonObj.get("nodes").toString()));
          }

          // validate the optional field `nodes` (array)
          for (int i = 0; i < jsonArraynodes.size(); i++) {
            Healthcollectorv3StapInformationObject.validateJsonElement(jsonArraynodes.get(i));
          };
        }
      }
      if (jsonObj.get("stap_counts") != null && !jsonObj.get("stap_counts").isJsonNull()) {
        JsonArray jsonArraystapCounts = jsonObj.getAsJsonArray("stap_counts");
        if (jsonArraystapCounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stap_counts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stap_counts` to be an array in the JSON string but got `%s`", jsonObj.get("stap_counts").toString()));
          }

          // validate the optional field `stap_counts` (array)
          for (int i = 0; i < jsonArraystapCounts.size(); i++) {
            Healthcollectorv3CountObject.validateJsonElement(jsonArraystapCounts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3HistoricalDataObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3HistoricalDataObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3HistoricalDataObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3HistoricalDataObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3HistoricalDataObject>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3HistoricalDataObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3HistoricalDataObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3HistoricalDataObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3HistoricalDataObject
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3HistoricalDataObject
  */
  public static Healthcollectorv3HistoricalDataObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3HistoricalDataObject.class);
  }

 /**
  * Convert an instance of Healthcollectorv3HistoricalDataObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

