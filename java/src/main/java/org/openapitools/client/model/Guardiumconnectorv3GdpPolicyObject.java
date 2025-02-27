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
 * Guardiumconnectorv3GdpPolicyObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3GdpPolicyObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_POLICY_DESCRIPTION = "policy_description";
  @SerializedName(SERIALIZED_NAME_POLICY_DESCRIPTION)
  private String policyDescription;

  public static final String SERIALIZED_NAME_POLICY_RULES_COUNT = "policy_rules_count";
  @SerializedName(SERIALIZED_NAME_POLICY_RULES_COUNT)
  private Integer policyRulesCount;

  public static final String SERIALIZED_NAME_POLICY_SUB_TYPE = "policy_sub_type";
  @SerializedName(SERIALIZED_NAME_POLICY_SUB_TYPE)
  private String policySubType;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  public Guardiumconnectorv3GdpPolicyObject() {
  }

  public Guardiumconnectorv3GdpPolicyObject id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Guardiumconnectorv3GdpPolicyObject policyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
    return this;
  }

   /**
   * Policy name.
   * @return policyDescription
  **/
  @javax.annotation.Nullable
  public String getPolicyDescription() {
    return policyDescription;
  }

  public void setPolicyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
  }


  public Guardiumconnectorv3GdpPolicyObject policyRulesCount(Integer policyRulesCount) {
    this.policyRulesCount = policyRulesCount;
    return this;
  }

   /**
   * Number of rules.
   * @return policyRulesCount
  **/
  @javax.annotation.Nullable
  public Integer getPolicyRulesCount() {
    return policyRulesCount;
  }

  public void setPolicyRulesCount(Integer policyRulesCount) {
    this.policyRulesCount = policyRulesCount;
  }


  public Guardiumconnectorv3GdpPolicyObject policySubType(String policySubType) {
    this.policySubType = policySubType;
    return this;
  }

   /**
   * Get policySubType
   * @return policySubType
  **/
  @javax.annotation.Nullable
  public String getPolicySubType() {
    return policySubType;
  }

  public void setPolicySubType(String policySubType) {
    this.policySubType = policySubType;
  }


  public Guardiumconnectorv3GdpPolicyObject policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @javax.annotation.Nullable
  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3GdpPolicyObject guardiumconnectorv3GdpPolicyObject = (Guardiumconnectorv3GdpPolicyObject) o;
    return Objects.equals(this.id, guardiumconnectorv3GdpPolicyObject.id) &&
        Objects.equals(this.policyDescription, guardiumconnectorv3GdpPolicyObject.policyDescription) &&
        Objects.equals(this.policyRulesCount, guardiumconnectorv3GdpPolicyObject.policyRulesCount) &&
        Objects.equals(this.policySubType, guardiumconnectorv3GdpPolicyObject.policySubType) &&
        Objects.equals(this.policyType, guardiumconnectorv3GdpPolicyObject.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyDescription, policyRulesCount, policySubType, policyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3GdpPolicyObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    policyRulesCount: ").append(toIndentedString(policyRulesCount)).append("\n");
    sb.append("    policySubType: ").append(toIndentedString(policySubType)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("policy_description");
    openapiFields.add("policy_rules_count");
    openapiFields.add("policy_sub_type");
    openapiFields.add("policy_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3GdpPolicyObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3GdpPolicyObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3GdpPolicyObject is not found in the empty JSON string", Guardiumconnectorv3GdpPolicyObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3GdpPolicyObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3GdpPolicyObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("policy_description") != null && !jsonObj.get("policy_description").isJsonNull()) && !jsonObj.get("policy_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_description").toString()));
      }
      if ((jsonObj.get("policy_sub_type") != null && !jsonObj.get("policy_sub_type").isJsonNull()) && !jsonObj.get("policy_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_sub_type").toString()));
      }
      if ((jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) && !jsonObj.get("policy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3GdpPolicyObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3GdpPolicyObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3GdpPolicyObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3GdpPolicyObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3GdpPolicyObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3GdpPolicyObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3GdpPolicyObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3GdpPolicyObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3GdpPolicyObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3GdpPolicyObject
  */
  public static Guardiumconnectorv3GdpPolicyObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3GdpPolicyObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3GdpPolicyObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

