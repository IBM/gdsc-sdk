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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Policybuilderv3InstallationAndSequenceObject;

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
 * Install Policies Request object for policy installation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3InstallPoliciesRequest {
  public static final String SERIALIZED_NAME_PERFORM_INSTALLATION = "perform_installation";
  @SerializedName(SERIALIZED_NAME_PERFORM_INSTALLATION)
  private Boolean performInstallation;

  public static final String SERIALIZED_NAME_POLICY_LIST = "policy_list";
  @SerializedName(SERIALIZED_NAME_POLICY_LIST)
  private List<Policybuilderv3InstallationAndSequenceObject> policyList = new ArrayList<>();

  public Policybuilderv3InstallPoliciesRequest() {
  }

  public Policybuilderv3InstallPoliciesRequest performInstallation(Boolean performInstallation) {
    this.performInstallation = performInstallation;
    return this;
  }

   /**
   * Flag which will indicate whether its just ui sequence reordering or installation and sequence ordering.
   * @return performInstallation
  **/
  @javax.annotation.Nullable
  public Boolean getPerformInstallation() {
    return performInstallation;
  }

  public void setPerformInstallation(Boolean performInstallation) {
    this.performInstallation = performInstallation;
  }


  public Policybuilderv3InstallPoliciesRequest policyList(List<Policybuilderv3InstallationAndSequenceObject> policyList) {
    this.policyList = policyList;
    return this;
  }

  public Policybuilderv3InstallPoliciesRequest addPolicyListItem(Policybuilderv3InstallationAndSequenceObject policyListItem) {
    if (this.policyList == null) {
      this.policyList = new ArrayList<>();
    }
    this.policyList.add(policyListItem);
    return this;
  }

   /**
   * Policy Ids that would be installed.
   * @return policyList
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3InstallationAndSequenceObject> getPolicyList() {
    return policyList;
  }

  public void setPolicyList(List<Policybuilderv3InstallationAndSequenceObject> policyList) {
    this.policyList = policyList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3InstallPoliciesRequest policybuilderv3InstallPoliciesRequest = (Policybuilderv3InstallPoliciesRequest) o;
    return Objects.equals(this.performInstallation, policybuilderv3InstallPoliciesRequest.performInstallation) &&
        Objects.equals(this.policyList, policybuilderv3InstallPoliciesRequest.policyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performInstallation, policyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3InstallPoliciesRequest {\n");
    sb.append("    performInstallation: ").append(toIndentedString(performInstallation)).append("\n");
    sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
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
    openapiFields.add("perform_installation");
    openapiFields.add("policy_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3InstallPoliciesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3InstallPoliciesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3InstallPoliciesRequest is not found in the empty JSON string", Policybuilderv3InstallPoliciesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3InstallPoliciesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3InstallPoliciesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("policy_list") != null && !jsonObj.get("policy_list").isJsonNull()) {
        JsonArray jsonArraypolicyList = jsonObj.getAsJsonArray("policy_list");
        if (jsonArraypolicyList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("policy_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `policy_list` to be an array in the JSON string but got `%s`", jsonObj.get("policy_list").toString()));
          }

          // validate the optional field `policy_list` (array)
          for (int i = 0; i < jsonArraypolicyList.size(); i++) {
            Policybuilderv3InstallationAndSequenceObject.validateJsonElement(jsonArraypolicyList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3InstallPoliciesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3InstallPoliciesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3InstallPoliciesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3InstallPoliciesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3InstallPoliciesRequest>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3InstallPoliciesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3InstallPoliciesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3InstallPoliciesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3InstallPoliciesRequest
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3InstallPoliciesRequest
  */
  public static Policybuilderv3InstallPoliciesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3InstallPoliciesRequest.class);
  }

 /**
  * Convert an instance of Policybuilderv3InstallPoliciesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

