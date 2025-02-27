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

import org.openapitools.client.JSON;

/**
 * InspectionEngineDetails gets additional information about inspection engines.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3InspectionEngineObjectGdp {
  public static final String SERIALIZED_NAME_IE_STATUS = "ie_status";
  @SerializedName(SERIALIZED_NAME_IE_STATUS)
  private Integer ieStatus;

  public static final String SERIALIZED_NAME_INSPECTION_ENGINE = "inspection_engine";
  @SerializedName(SERIALIZED_NAME_INSPECTION_ENGINE)
  private String inspectionEngine;

  public Healthcollectorv3InspectionEngineObjectGdp() {
  }

  public Healthcollectorv3InspectionEngineObjectGdp ieStatus(Integer ieStatus) {
    this.ieStatus = ieStatus;
    return this;
  }

   /**
   * The status of inspection engine.
   * @return ieStatus
  **/
  @javax.annotation.Nullable
  public Integer getIeStatus() {
    return ieStatus;
  }

  public void setIeStatus(Integer ieStatus) {
    this.ieStatus = ieStatus;
  }


  public Healthcollectorv3InspectionEngineObjectGdp inspectionEngine(String inspectionEngine) {
    this.inspectionEngine = inspectionEngine;
    return this;
  }

   /**
   * Name of the inspection engine.
   * @return inspectionEngine
  **/
  @javax.annotation.Nullable
  public String getInspectionEngine() {
    return inspectionEngine;
  }

  public void setInspectionEngine(String inspectionEngine) {
    this.inspectionEngine = inspectionEngine;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3InspectionEngineObjectGdp healthcollectorv3InspectionEngineObjectGdp = (Healthcollectorv3InspectionEngineObjectGdp) o;
    return Objects.equals(this.ieStatus, healthcollectorv3InspectionEngineObjectGdp.ieStatus) &&
        Objects.equals(this.inspectionEngine, healthcollectorv3InspectionEngineObjectGdp.inspectionEngine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ieStatus, inspectionEngine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3InspectionEngineObjectGdp {\n");
    sb.append("    ieStatus: ").append(toIndentedString(ieStatus)).append("\n");
    sb.append("    inspectionEngine: ").append(toIndentedString(inspectionEngine)).append("\n");
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
    openapiFields.add("ie_status");
    openapiFields.add("inspection_engine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3InspectionEngineObjectGdp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3InspectionEngineObjectGdp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3InspectionEngineObjectGdp is not found in the empty JSON string", Healthcollectorv3InspectionEngineObjectGdp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3InspectionEngineObjectGdp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3InspectionEngineObjectGdp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("inspection_engine") != null && !jsonObj.get("inspection_engine").isJsonNull()) && !jsonObj.get("inspection_engine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inspection_engine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inspection_engine").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3InspectionEngineObjectGdp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3InspectionEngineObjectGdp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3InspectionEngineObjectGdp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3InspectionEngineObjectGdp.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3InspectionEngineObjectGdp>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3InspectionEngineObjectGdp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3InspectionEngineObjectGdp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3InspectionEngineObjectGdp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3InspectionEngineObjectGdp
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3InspectionEngineObjectGdp
  */
  public static Healthcollectorv3InspectionEngineObjectGdp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3InspectionEngineObjectGdp.class);
  }

 /**
  * Convert an instance of Healthcollectorv3InspectionEngineObjectGdp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

