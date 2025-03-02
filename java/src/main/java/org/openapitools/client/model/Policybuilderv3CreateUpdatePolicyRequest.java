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
import org.openapitools.client.model.Policybuilderv3PolicyUpdate;

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
 * Message Object for creating or updating a policy request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3CreateUpdatePolicyRequest {
  public static final String SERIALIZED_NAME_CAN_OVERRIDE_NAME = "can_override_name";
  @SerializedName(SERIALIZED_NAME_CAN_OVERRIDE_NAME)
  private Boolean canOverrideName;

  public static final String SERIALIZED_NAME_POLICY_OBJECT = "policy_object";
  @SerializedName(SERIALIZED_NAME_POLICY_OBJECT)
  private Policybuilderv3PolicyUpdate policyObject;

  public Policybuilderv3CreateUpdatePolicyRequest() {
  }

  public Policybuilderv3CreateUpdatePolicyRequest canOverrideName(Boolean canOverrideName) {
    this.canOverrideName = canOverrideName;
    return this;
  }

   /**
   * Get canOverrideName
   * @return canOverrideName
  **/
  @javax.annotation.Nullable
  public Boolean getCanOverrideName() {
    return canOverrideName;
  }

  public void setCanOverrideName(Boolean canOverrideName) {
    this.canOverrideName = canOverrideName;
  }


  public Policybuilderv3CreateUpdatePolicyRequest policyObject(Policybuilderv3PolicyUpdate policyObject) {
    this.policyObject = policyObject;
    return this;
  }

   /**
   * Get policyObject
   * @return policyObject
  **/
  @javax.annotation.Nullable
  public Policybuilderv3PolicyUpdate getPolicyObject() {
    return policyObject;
  }

  public void setPolicyObject(Policybuilderv3PolicyUpdate policyObject) {
    this.policyObject = policyObject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3CreateUpdatePolicyRequest policybuilderv3CreateUpdatePolicyRequest = (Policybuilderv3CreateUpdatePolicyRequest) o;
    return Objects.equals(this.canOverrideName, policybuilderv3CreateUpdatePolicyRequest.canOverrideName) &&
        Objects.equals(this.policyObject, policybuilderv3CreateUpdatePolicyRequest.policyObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canOverrideName, policyObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3CreateUpdatePolicyRequest {\n");
    sb.append("    canOverrideName: ").append(toIndentedString(canOverrideName)).append("\n");
    sb.append("    policyObject: ").append(toIndentedString(policyObject)).append("\n");
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
    openapiFields.add("can_override_name");
    openapiFields.add("policy_object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3CreateUpdatePolicyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3CreateUpdatePolicyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3CreateUpdatePolicyRequest is not found in the empty JSON string", Policybuilderv3CreateUpdatePolicyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3CreateUpdatePolicyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3CreateUpdatePolicyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `policy_object`
      if (jsonObj.get("policy_object") != null && !jsonObj.get("policy_object").isJsonNull()) {
        Policybuilderv3PolicyUpdate.validateJsonElement(jsonObj.get("policy_object"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3CreateUpdatePolicyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3CreateUpdatePolicyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3CreateUpdatePolicyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3CreateUpdatePolicyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3CreateUpdatePolicyRequest>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3CreateUpdatePolicyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3CreateUpdatePolicyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3CreateUpdatePolicyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3CreateUpdatePolicyRequest
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3CreateUpdatePolicyRequest
  */
  public static Policybuilderv3CreateUpdatePolicyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3CreateUpdatePolicyRequest.class);
  }

 /**
  * Convert an instance of Policybuilderv3CreateUpdatePolicyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

