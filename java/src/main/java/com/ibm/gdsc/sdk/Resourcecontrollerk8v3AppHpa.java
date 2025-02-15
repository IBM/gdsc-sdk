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
 * AppHpa contains the information required for horizontal pod autoscaler.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-11T14:56:28.892451Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3AppHpa {
  public static final String SERIALIZED_NAME_MAX_REPLICAS = "max_replicas";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  private String maxReplicas;

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "min_replicas";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  private String minReplicas;

  public static final String SERIALIZED_NAME_TARGET_CPU_UTILIZATION_PERCENTAGE = "target_cpu_utilization_percentage";
  @SerializedName(SERIALIZED_NAME_TARGET_CPU_UTILIZATION_PERCENTAGE)
  private String targetCpuUtilizationPercentage;

  public Resourcecontrollerk8v3AppHpa() {
  }

  public Resourcecontrollerk8v3AppHpa maxReplicas(String maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * The upper limit for the number of pods that can be set by the autoscaler. It cannot be smaller than min_replicas.
   * @return maxReplicas
  **/
  @javax.annotation.Nullable
  public String getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(String maxReplicas) {
    this.maxReplicas = maxReplicas;
  }


  public Resourcecontrollerk8v3AppHpa minReplicas(String minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

   /**
   * Optional: The lower limit for the number of pods that can be set by the autoscaler, default 1.
   * @return minReplicas
  **/
  @javax.annotation.Nullable
  public String getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(String minReplicas) {
    this.minReplicas = minReplicas;
  }


  public Resourcecontrollerk8v3AppHpa targetCpuUtilizationPercentage(String targetCpuUtilizationPercentage) {
    this.targetCpuUtilizationPercentage = targetCpuUtilizationPercentage;
    return this;
  }

   /**
   * Optional: The target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified it defaults to the target CPU utilization at 80% of the requested resources.
   * @return targetCpuUtilizationPercentage
  **/
  @javax.annotation.Nullable
  public String getTargetCpuUtilizationPercentage() {
    return targetCpuUtilizationPercentage;
  }

  public void setTargetCpuUtilizationPercentage(String targetCpuUtilizationPercentage) {
    this.targetCpuUtilizationPercentage = targetCpuUtilizationPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3AppHpa resourcecontrollerk8v3AppHpa = (Resourcecontrollerk8v3AppHpa) o;
    return Objects.equals(this.maxReplicas, resourcecontrollerk8v3AppHpa.maxReplicas) &&
        Objects.equals(this.minReplicas, resourcecontrollerk8v3AppHpa.minReplicas) &&
        Objects.equals(this.targetCpuUtilizationPercentage, resourcecontrollerk8v3AppHpa.targetCpuUtilizationPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, minReplicas, targetCpuUtilizationPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3AppHpa {\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    targetCpuUtilizationPercentage: ").append(toIndentedString(targetCpuUtilizationPercentage)).append("\n");
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
    openapiFields.add("max_replicas");
    openapiFields.add("min_replicas");
    openapiFields.add("target_cpu_utilization_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3AppHpa
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3AppHpa.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3AppHpa is not found in the empty JSON string", Resourcecontrollerk8v3AppHpa.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3AppHpa.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3AppHpa` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("max_replicas") != null && !jsonObj.get("max_replicas").isJsonNull()) && !jsonObj.get("max_replicas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_replicas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_replicas").toString()));
      }
      if ((jsonObj.get("min_replicas") != null && !jsonObj.get("min_replicas").isJsonNull()) && !jsonObj.get("min_replicas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_replicas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_replicas").toString()));
      }
      if ((jsonObj.get("target_cpu_utilization_percentage") != null && !jsonObj.get("target_cpu_utilization_percentage").isJsonNull()) && !jsonObj.get("target_cpu_utilization_percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_cpu_utilization_percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_cpu_utilization_percentage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3AppHpa.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3AppHpa' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3AppHpa> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3AppHpa.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3AppHpa>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3AppHpa value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3AppHpa read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3AppHpa given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3AppHpa
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3AppHpa
  */
  public static Resourcecontrollerk8v3AppHpa fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3AppHpa.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3AppHpa to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

