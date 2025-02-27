/*
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.security.guardium;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.security.guardium.Connectionsv3Connector;
import com.ibm.security.guardium.Connectionsv3ConnectorFilterHeader;
import com.ibm.security.guardium.Connectionsv3ConnectorSettingStat;
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

import com.ibm.security.JSON;

/**
 * Connectionsv3GetConnectionsWithFiltersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3GetConnectionsWithFiltersResponse {
  public static final String SERIALIZED_NAME_CONNECTORS = "connectors";
  @SerializedName(SERIALIZED_NAME_CONNECTORS)
  private List<Connectionsv3Connector> connectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_FACETS = "facets";
  @SerializedName(SERIALIZED_NAME_FACETS)
  private List<Connectionsv3ConnectorFilterHeader> facets = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRESET_STATS = "preset_stats";
  @SerializedName(SERIALIZED_NAME_PRESET_STATS)
  private List<Connectionsv3ConnectorSettingStat> presetStats = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_CONNECTORS = "total_connectors";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONNECTORS)
  private Integer totalConnectors;

  public Connectionsv3GetConnectionsWithFiltersResponse() {
  }

  public Connectionsv3GetConnectionsWithFiltersResponse connectors(List<Connectionsv3Connector> connectors) {
    this.connectors = connectors;
    return this;
  }

  public Connectionsv3GetConnectionsWithFiltersResponse addConnectorsItem(Connectionsv3Connector connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new ArrayList<>();
    }
    this.connectors.add(connectorsItem);
    return this;
  }

   /**
   * Get connectors
   * @return connectors
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3Connector> getConnectors() {
    return connectors;
  }

  public void setConnectors(List<Connectionsv3Connector> connectors) {
    this.connectors = connectors;
  }


  public Connectionsv3GetConnectionsWithFiltersResponse facets(List<Connectionsv3ConnectorFilterHeader> facets) {
    this.facets = facets;
    return this;
  }

  public Connectionsv3GetConnectionsWithFiltersResponse addFacetsItem(Connectionsv3ConnectorFilterHeader facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

   /**
   * Get facets
   * @return facets
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3ConnectorFilterHeader> getFacets() {
    return facets;
  }

  public void setFacets(List<Connectionsv3ConnectorFilterHeader> facets) {
    this.facets = facets;
  }


  public Connectionsv3GetConnectionsWithFiltersResponse presetStats(List<Connectionsv3ConnectorSettingStat> presetStats) {
    this.presetStats = presetStats;
    return this;
  }

  public Connectionsv3GetConnectionsWithFiltersResponse addPresetStatsItem(Connectionsv3ConnectorSettingStat presetStatsItem) {
    if (this.presetStats == null) {
      this.presetStats = new ArrayList<>();
    }
    this.presetStats.add(presetStatsItem);
    return this;
  }

   /**
   * Get presetStats
   * @return presetStats
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3ConnectorSettingStat> getPresetStats() {
    return presetStats;
  }

  public void setPresetStats(List<Connectionsv3ConnectorSettingStat> presetStats) {
    this.presetStats = presetStats;
  }


  public Connectionsv3GetConnectionsWithFiltersResponse totalConnectors(Integer totalConnectors) {
    this.totalConnectors = totalConnectors;
    return this;
  }

   /**
   * Get totalConnectors
   * @return totalConnectors
  **/
  @javax.annotation.Nullable
  public Integer getTotalConnectors() {
    return totalConnectors;
  }

  public void setTotalConnectors(Integer totalConnectors) {
    this.totalConnectors = totalConnectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3GetConnectionsWithFiltersResponse connectionsv3GetConnectionsWithFiltersResponse = (Connectionsv3GetConnectionsWithFiltersResponse) o;
    return Objects.equals(this.connectors, connectionsv3GetConnectionsWithFiltersResponse.connectors) &&
        Objects.equals(this.facets, connectionsv3GetConnectionsWithFiltersResponse.facets) &&
        Objects.equals(this.presetStats, connectionsv3GetConnectionsWithFiltersResponse.presetStats) &&
        Objects.equals(this.totalConnectors, connectionsv3GetConnectionsWithFiltersResponse.totalConnectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectors, facets, presetStats, totalConnectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3GetConnectionsWithFiltersResponse {\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    presetStats: ").append(toIndentedString(presetStats)).append("\n");
    sb.append("    totalConnectors: ").append(toIndentedString(totalConnectors)).append("\n");
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
    openapiFields.add("connectors");
    openapiFields.add("facets");
    openapiFields.add("preset_stats");
    openapiFields.add("total_connectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3GetConnectionsWithFiltersResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3GetConnectionsWithFiltersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3GetConnectionsWithFiltersResponse is not found in the empty JSON string", Connectionsv3GetConnectionsWithFiltersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3GetConnectionsWithFiltersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3GetConnectionsWithFiltersResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("connectors") != null && !jsonObj.get("connectors").isJsonNull()) {
        JsonArray jsonArrayconnectors = jsonObj.getAsJsonArray("connectors");
        if (jsonArrayconnectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("connectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `connectors` to be an array in the JSON string but got `%s`", jsonObj.get("connectors").toString()));
          }

          // validate the optional field `connectors` (array)
          for (int i = 0; i < jsonArrayconnectors.size(); i++) {
            Connectionsv3Connector.validateJsonElement(jsonArrayconnectors.get(i));
          };
        }
      }
      if (jsonObj.get("facets") != null && !jsonObj.get("facets").isJsonNull()) {
        JsonArray jsonArrayfacets = jsonObj.getAsJsonArray("facets");
        if (jsonArrayfacets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("facets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `facets` to be an array in the JSON string but got `%s`", jsonObj.get("facets").toString()));
          }

          // validate the optional field `facets` (array)
          for (int i = 0; i < jsonArrayfacets.size(); i++) {
            Connectionsv3ConnectorFilterHeader.validateJsonElement(jsonArrayfacets.get(i));
          };
        }
      }
      if (jsonObj.get("preset_stats") != null && !jsonObj.get("preset_stats").isJsonNull()) {
        JsonArray jsonArraypresetStats = jsonObj.getAsJsonArray("preset_stats");
        if (jsonArraypresetStats != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preset_stats").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preset_stats` to be an array in the JSON string but got `%s`", jsonObj.get("preset_stats").toString()));
          }

          // validate the optional field `preset_stats` (array)
          for (int i = 0; i < jsonArraypresetStats.size(); i++) {
            Connectionsv3ConnectorSettingStat.validateJsonElement(jsonArraypresetStats.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3GetConnectionsWithFiltersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3GetConnectionsWithFiltersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3GetConnectionsWithFiltersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3GetConnectionsWithFiltersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3GetConnectionsWithFiltersResponse>() {
           @Override
           public void write(JsonWriter out, Connectionsv3GetConnectionsWithFiltersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3GetConnectionsWithFiltersResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3GetConnectionsWithFiltersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3GetConnectionsWithFiltersResponse
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3GetConnectionsWithFiltersResponse
  */
  public static Connectionsv3GetConnectionsWithFiltersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3GetConnectionsWithFiltersResponse.class);
  }

 /**
  * Convert an instance of Connectionsv3GetConnectionsWithFiltersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

