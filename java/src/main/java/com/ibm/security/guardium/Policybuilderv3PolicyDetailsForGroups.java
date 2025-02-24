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

import com.ibm.security.JSON;

/**
 * Policy Details for groups being used in policies.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3PolicyDetailsForGroups {
  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public Policybuilderv3PolicyDetailsForGroups() {
  }

  public Policybuilderv3PolicyDetailsForGroups policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Policy id.
   * @return policyId
  **/
  @javax.annotation.Nullable
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public Policybuilderv3PolicyDetailsForGroups policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Policy name.
   * @return policyName
  **/
  @javax.annotation.Nullable
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3PolicyDetailsForGroups policybuilderv3PolicyDetailsForGroups = (Policybuilderv3PolicyDetailsForGroups) o;
    return Objects.equals(this.policyId, policybuilderv3PolicyDetailsForGroups.policyId) &&
        Objects.equals(this.policyName, policybuilderv3PolicyDetailsForGroups.policyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3PolicyDetailsForGroups {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
    openapiFields.add("policy_id");
    openapiFields.add("policy_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3PolicyDetailsForGroups
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3PolicyDetailsForGroups.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3PolicyDetailsForGroups is not found in the empty JSON string", Policybuilderv3PolicyDetailsForGroups.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3PolicyDetailsForGroups.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3PolicyDetailsForGroups` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if ((jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3PolicyDetailsForGroups.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3PolicyDetailsForGroups' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3PolicyDetailsForGroups> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3PolicyDetailsForGroups.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3PolicyDetailsForGroups>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3PolicyDetailsForGroups value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3PolicyDetailsForGroups read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3PolicyDetailsForGroups given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3PolicyDetailsForGroups
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3PolicyDetailsForGroups
  */
  public static Policybuilderv3PolicyDetailsForGroups fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3PolicyDetailsForGroups.class);
  }

 /**
  * Convert an instance of Policybuilderv3PolicyDetailsForGroups to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

