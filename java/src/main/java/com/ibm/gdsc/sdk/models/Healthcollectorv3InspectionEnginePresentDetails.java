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


package com.ibm.gdsc.sdk.models;

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

import com.ibm.gdsc.sdk.JSON;

/**
 * Details if inspection engine are present at start and end.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3InspectionEnginePresentDetails {
  public static final String SERIALIZED_NAME_INSPECTION_ENGINE = "inspection_engine";
  @SerializedName(SERIALIZED_NAME_INSPECTION_ENGINE)
  private String inspectionEngine;

  public static final String SERIALIZED_NAME_PRESENT_AT_END = "present_at_end";
  @SerializedName(SERIALIZED_NAME_PRESENT_AT_END)
  private Boolean presentAtEnd;

  public static final String SERIALIZED_NAME_PRESENT_AT_START = "present_at_start";
  @SerializedName(SERIALIZED_NAME_PRESENT_AT_START)
  private Boolean presentAtStart;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public Healthcollectorv3InspectionEnginePresentDetails() {
  }

  public Healthcollectorv3InspectionEnginePresentDetails inspectionEngine(String inspectionEngine) {
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


  public Healthcollectorv3InspectionEnginePresentDetails presentAtEnd(Boolean presentAtEnd) {
    this.presentAtEnd = presentAtEnd;
    return this;
  }

   /**
   * Inspection engine present at end time.
   * @return presentAtEnd
  **/
  @javax.annotation.Nullable
  public Boolean getPresentAtEnd() {
    return presentAtEnd;
  }

  public void setPresentAtEnd(Boolean presentAtEnd) {
    this.presentAtEnd = presentAtEnd;
  }


  public Healthcollectorv3InspectionEnginePresentDetails presentAtStart(Boolean presentAtStart) {
    this.presentAtStart = presentAtStart;
    return this;
  }

   /**
   * Inspection engine present at start time.
   * @return presentAtStart
  **/
  @javax.annotation.Nullable
  public Boolean getPresentAtStart() {
    return presentAtStart;
  }

  public void setPresentAtStart(Boolean presentAtStart) {
    this.presentAtStart = presentAtStart;
  }


  public Healthcollectorv3InspectionEnginePresentDetails protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol of the ie.
   * @return protocol
  **/
  @javax.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public Healthcollectorv3InspectionEnginePresentDetails version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the ie.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3InspectionEnginePresentDetails healthcollectorv3InspectionEnginePresentDetails = (Healthcollectorv3InspectionEnginePresentDetails) o;
    return Objects.equals(this.inspectionEngine, healthcollectorv3InspectionEnginePresentDetails.inspectionEngine) &&
        Objects.equals(this.presentAtEnd, healthcollectorv3InspectionEnginePresentDetails.presentAtEnd) &&
        Objects.equals(this.presentAtStart, healthcollectorv3InspectionEnginePresentDetails.presentAtStart) &&
        Objects.equals(this.protocol, healthcollectorv3InspectionEnginePresentDetails.protocol) &&
        Objects.equals(this.version, healthcollectorv3InspectionEnginePresentDetails.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inspectionEngine, presentAtEnd, presentAtStart, protocol, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3InspectionEnginePresentDetails {\n");
    sb.append("    inspectionEngine: ").append(toIndentedString(inspectionEngine)).append("\n");
    sb.append("    presentAtEnd: ").append(toIndentedString(presentAtEnd)).append("\n");
    sb.append("    presentAtStart: ").append(toIndentedString(presentAtStart)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("inspection_engine");
    openapiFields.add("present_at_end");
    openapiFields.add("present_at_start");
    openapiFields.add("protocol");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3InspectionEnginePresentDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3InspectionEnginePresentDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3InspectionEnginePresentDetails is not found in the empty JSON string", Healthcollectorv3InspectionEnginePresentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3InspectionEnginePresentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3InspectionEnginePresentDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("inspection_engine") != null && !jsonObj.get("inspection_engine").isJsonNull()) && !jsonObj.get("inspection_engine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inspection_engine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inspection_engine").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3InspectionEnginePresentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3InspectionEnginePresentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3InspectionEnginePresentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3InspectionEnginePresentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3InspectionEnginePresentDetails>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3InspectionEnginePresentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3InspectionEnginePresentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3InspectionEnginePresentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3InspectionEnginePresentDetails
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3InspectionEnginePresentDetails
  */
  public static Healthcollectorv3InspectionEnginePresentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3InspectionEnginePresentDetails.class);
  }

 /**
  * Convert an instance of Healthcollectorv3InspectionEnginePresentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

