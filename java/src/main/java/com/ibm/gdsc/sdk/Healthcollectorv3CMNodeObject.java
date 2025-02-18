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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Healthcollectorv3ManagedUnitObject;
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
 * CMNodeObject gets health information for the central manager and all its managed units and monitoring agents.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3CMNodeObject {
  public static final String SERIALIZED_NAME_CM = "cm";
  @SerializedName(SERIALIZED_NAME_CM)
  private String cm;

  public static final String SERIALIZED_NAME_LAST_HEALTH_INFO_COLLECTED_TIMESTAMP = "last_health_info_collected_timestamp";
  @SerializedName(SERIALIZED_NAME_LAST_HEALTH_INFO_COLLECTED_TIMESTAMP)
  private String lastHealthInfoCollectedTimestamp;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<Healthcollectorv3ManagedUnitObject> nodes = new ArrayList<>();

  public Healthcollectorv3CMNodeObject() {
  }

  public Healthcollectorv3CMNodeObject cm(String cm) {
    this.cm = cm;
    return this;
  }

   /**
   * Host name or IP address of the central manager.
   * @return cm
  **/
  @javax.annotation.Nullable
  public String getCm() {
    return cm;
  }

  public void setCm(String cm) {
    this.cm = cm;
  }


  public Healthcollectorv3CMNodeObject lastHealthInfoCollectedTimestamp(String lastHealthInfoCollectedTimestamp) {
    this.lastHealthInfoCollectedTimestamp = lastHealthInfoCollectedTimestamp;
    return this;
  }

   /**
   * Timestamp from when the health information was collected.
   * @return lastHealthInfoCollectedTimestamp
  **/
  @javax.annotation.Nullable
  public String getLastHealthInfoCollectedTimestamp() {
    return lastHealthInfoCollectedTimestamp;
  }

  public void setLastHealthInfoCollectedTimestamp(String lastHealthInfoCollectedTimestamp) {
    this.lastHealthInfoCollectedTimestamp = lastHealthInfoCollectedTimestamp;
  }


  public Healthcollectorv3CMNodeObject nodes(List<Healthcollectorv3ManagedUnitObject> nodes) {
    this.nodes = nodes;
    return this;
  }

  public Healthcollectorv3CMNodeObject addNodesItem(Healthcollectorv3ManagedUnitObject nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * List of Guardium Data Protection systems.
   * @return nodes
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3ManagedUnitObject> getNodes() {
    return nodes;
  }

  public void setNodes(List<Healthcollectorv3ManagedUnitObject> nodes) {
    this.nodes = nodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3CMNodeObject healthcollectorv3CMNodeObject = (Healthcollectorv3CMNodeObject) o;
    return Objects.equals(this.cm, healthcollectorv3CMNodeObject.cm) &&
        Objects.equals(this.lastHealthInfoCollectedTimestamp, healthcollectorv3CMNodeObject.lastHealthInfoCollectedTimestamp) &&
        Objects.equals(this.nodes, healthcollectorv3CMNodeObject.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cm, lastHealthInfoCollectedTimestamp, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3CMNodeObject {\n");
    sb.append("    cm: ").append(toIndentedString(cm)).append("\n");
    sb.append("    lastHealthInfoCollectedTimestamp: ").append(toIndentedString(lastHealthInfoCollectedTimestamp)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
    openapiFields.add("cm");
    openapiFields.add("last_health_info_collected_timestamp");
    openapiFields.add("nodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3CMNodeObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3CMNodeObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3CMNodeObject is not found in the empty JSON string", Healthcollectorv3CMNodeObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3CMNodeObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3CMNodeObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cm") != null && !jsonObj.get("cm").isJsonNull()) && !jsonObj.get("cm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cm").toString()));
      }
      if ((jsonObj.get("last_health_info_collected_timestamp") != null && !jsonObj.get("last_health_info_collected_timestamp").isJsonNull()) && !jsonObj.get("last_health_info_collected_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_health_info_collected_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_health_info_collected_timestamp").toString()));
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
            Healthcollectorv3ManagedUnitObject.validateJsonElement(jsonArraynodes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3CMNodeObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3CMNodeObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3CMNodeObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3CMNodeObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3CMNodeObject>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3CMNodeObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3CMNodeObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3CMNodeObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3CMNodeObject
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3CMNodeObject
  */
  public static Healthcollectorv3CMNodeObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3CMNodeObject.class);
  }

 /**
  * Convert an instance of Healthcollectorv3CMNodeObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

