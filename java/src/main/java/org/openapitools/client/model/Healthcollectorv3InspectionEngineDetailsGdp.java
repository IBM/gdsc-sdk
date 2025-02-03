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
public class Healthcollectorv3InspectionEngineDetailsGdp {
  public static final String SERIALIZED_NAME_IE = "ie";
  @SerializedName(SERIALIZED_NAME_IE)
  private String ie;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_STAP = "stap";
  @SerializedName(SERIALIZED_NAME_STAP)
  private String stap;

  public static final String SERIALIZED_NAME_VERIFICATION_HEALTH = "verification_health";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_HEALTH)
  private Integer verificationHealth;

  public static final String SERIALIZED_NAME_VERIFICATION_RESULT = "verification_result";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_RESULT)
  private String verificationResult;

  public static final String SERIALIZED_NAME_VERIFICATION_STATE = "verification_state";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATE)
  private String verificationState;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public Healthcollectorv3InspectionEngineDetailsGdp() {
  }

  public Healthcollectorv3InspectionEngineDetailsGdp ie(String ie) {
    this.ie = ie;
    return this;
  }

   /**
   * Inspection engine name.
   * @return ie
  **/
  @javax.annotation.Nullable
  public String getIe() {
    return ie;
  }

  public void setIe(String ie) {
    this.ie = ie;
  }


  public Healthcollectorv3InspectionEngineDetailsGdp port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Port of the inspection engine.
   * @return port
  **/
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public Healthcollectorv3InspectionEngineDetailsGdp protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol being used.
   * @return protocol
  **/
  @javax.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public Healthcollectorv3InspectionEngineDetailsGdp stap(String stap) {
    this.stap = stap;
    return this;
  }

   /**
   * S-TAP of the inspection engine.
   * @return stap
  **/
  @javax.annotation.Nullable
  public String getStap() {
    return stap;
  }

  public void setStap(String stap) {
    this.stap = stap;
  }


  public Healthcollectorv3InspectionEngineDetailsGdp verificationHealth(Integer verificationHealth) {
    this.verificationHealth = verificationHealth;
    return this;
  }

   /**
   * Status of inspection engine.
   * @return verificationHealth
  **/
  @javax.annotation.Nullable
  public Integer getVerificationHealth() {
    return verificationHealth;
  }

  public void setVerificationHealth(Integer verificationHealth) {
    this.verificationHealth = verificationHealth;
  }


  public Healthcollectorv3InspectionEngineDetailsGdp verificationResult(String verificationResult) {
    this.verificationResult = verificationResult;
    return this;
  }

   /**
   * Verification result of the inspection engine.
   * @return verificationResult
  **/
  @javax.annotation.Nullable
  public String getVerificationResult() {
    return verificationResult;
  }

  public void setVerificationResult(String verificationResult) {
    this.verificationResult = verificationResult;
  }


  public Healthcollectorv3InspectionEngineDetailsGdp verificationState(String verificationState) {
    this.verificationState = verificationState;
    return this;
  }

   /**
   * Verification state of the inspection engine.
   * @return verificationState
  **/
  @javax.annotation.Nullable
  public String getVerificationState() {
    return verificationState;
  }

  public void setVerificationState(String verificationState) {
    this.verificationState = verificationState;
  }


  public Healthcollectorv3InspectionEngineDetailsGdp version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the inspection engine.
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
    Healthcollectorv3InspectionEngineDetailsGdp healthcollectorv3InspectionEngineDetailsGdp = (Healthcollectorv3InspectionEngineDetailsGdp) o;
    return Objects.equals(this.ie, healthcollectorv3InspectionEngineDetailsGdp.ie) &&
        Objects.equals(this.port, healthcollectorv3InspectionEngineDetailsGdp.port) &&
        Objects.equals(this.protocol, healthcollectorv3InspectionEngineDetailsGdp.protocol) &&
        Objects.equals(this.stap, healthcollectorv3InspectionEngineDetailsGdp.stap) &&
        Objects.equals(this.verificationHealth, healthcollectorv3InspectionEngineDetailsGdp.verificationHealth) &&
        Objects.equals(this.verificationResult, healthcollectorv3InspectionEngineDetailsGdp.verificationResult) &&
        Objects.equals(this.verificationState, healthcollectorv3InspectionEngineDetailsGdp.verificationState) &&
        Objects.equals(this.version, healthcollectorv3InspectionEngineDetailsGdp.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ie, port, protocol, stap, verificationHealth, verificationResult, verificationState, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3InspectionEngineDetailsGdp {\n");
    sb.append("    ie: ").append(toIndentedString(ie)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    stap: ").append(toIndentedString(stap)).append("\n");
    sb.append("    verificationHealth: ").append(toIndentedString(verificationHealth)).append("\n");
    sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
    sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
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
    openapiFields.add("ie");
    openapiFields.add("port");
    openapiFields.add("protocol");
    openapiFields.add("stap");
    openapiFields.add("verification_health");
    openapiFields.add("verification_result");
    openapiFields.add("verification_state");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3InspectionEngineDetailsGdp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3InspectionEngineDetailsGdp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3InspectionEngineDetailsGdp is not found in the empty JSON string", Healthcollectorv3InspectionEngineDetailsGdp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3InspectionEngineDetailsGdp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3InspectionEngineDetailsGdp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ie") != null && !jsonObj.get("ie").isJsonNull()) && !jsonObj.get("ie").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ie` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ie").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if ((jsonObj.get("stap") != null && !jsonObj.get("stap").isJsonNull()) && !jsonObj.get("stap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stap").toString()));
      }
      if ((jsonObj.get("verification_result") != null && !jsonObj.get("verification_result").isJsonNull()) && !jsonObj.get("verification_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_result").toString()));
      }
      if ((jsonObj.get("verification_state") != null && !jsonObj.get("verification_state").isJsonNull()) && !jsonObj.get("verification_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_state").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3InspectionEngineDetailsGdp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3InspectionEngineDetailsGdp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3InspectionEngineDetailsGdp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3InspectionEngineDetailsGdp.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3InspectionEngineDetailsGdp>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3InspectionEngineDetailsGdp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3InspectionEngineDetailsGdp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3InspectionEngineDetailsGdp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3InspectionEngineDetailsGdp
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3InspectionEngineDetailsGdp
  */
  public static Healthcollectorv3InspectionEngineDetailsGdp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3InspectionEngineDetailsGdp.class);
  }

 /**
  * Convert an instance of Healthcollectorv3InspectionEngineDetailsGdp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

