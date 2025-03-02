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
 * GetJiraIntegrationParameters200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class GetJiraIntegrationParameters200Response {
  public static final String SERIALIZED_NAME_COMPANY_DOMAIN_NAME = "companyDomainName";
  @SerializedName(SERIALIZED_NAME_COMPANY_DOMAIN_NAME)
  private String companyDomainName;

  public static final String SERIALIZED_NAME_ISSUE_TYPE = "issueType";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE)
  private String issueType;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public GetJiraIntegrationParameters200Response() {
  }

  public GetJiraIntegrationParameters200Response companyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
    return this;
  }

   /**
   * Get companyDomainName
   * @return companyDomainName
  **/
  @javax.annotation.Nonnull
  public String getCompanyDomainName() {
    return companyDomainName;
  }

  public void setCompanyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
  }


  public GetJiraIntegrationParameters200Response issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

   /**
   * Get issueType
   * @return issueType
  **/
  @javax.annotation.Nullable
  public String getIssueType() {
    return issueType;
  }

  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }


  public GetJiraIntegrationParameters200Response projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJiraIntegrationParameters200Response getJiraIntegrationParameters200Response = (GetJiraIntegrationParameters200Response) o;
    return Objects.equals(this.companyDomainName, getJiraIntegrationParameters200Response.companyDomainName) &&
        Objects.equals(this.issueType, getJiraIntegrationParameters200Response.issueType) &&
        Objects.equals(this.projectId, getJiraIntegrationParameters200Response.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyDomainName, issueType, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJiraIntegrationParameters200Response {\n");
    sb.append("    companyDomainName: ").append(toIndentedString(companyDomainName)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("companyDomainName");
    openapiFields.add("issueType");
    openapiFields.add("projectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("companyDomainName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetJiraIntegrationParameters200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetJiraIntegrationParameters200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetJiraIntegrationParameters200Response is not found in the empty JSON string", GetJiraIntegrationParameters200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetJiraIntegrationParameters200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetJiraIntegrationParameters200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetJiraIntegrationParameters200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("companyDomainName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyDomainName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyDomainName").toString()));
      }
      if ((jsonObj.get("issueType") != null && !jsonObj.get("issueType").isJsonNull()) && !jsonObj.get("issueType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueType").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetJiraIntegrationParameters200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetJiraIntegrationParameters200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetJiraIntegrationParameters200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetJiraIntegrationParameters200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetJiraIntegrationParameters200Response>() {
           @Override
           public void write(JsonWriter out, GetJiraIntegrationParameters200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetJiraIntegrationParameters200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetJiraIntegrationParameters200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetJiraIntegrationParameters200Response
  * @throws IOException if the JSON string is invalid with respect to GetJiraIntegrationParameters200Response
  */
  public static GetJiraIntegrationParameters200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetJiraIntegrationParameters200Response.class);
  }

 /**
  * Convert an instance of GetJiraIntegrationParameters200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

