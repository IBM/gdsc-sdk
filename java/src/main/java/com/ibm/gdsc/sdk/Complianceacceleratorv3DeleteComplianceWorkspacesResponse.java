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
import com.ibm.gdsc.sdk.Complianceacceleratorv3StatusResponseBase;
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
 * Response message after deleting compliance data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3DeleteComplianceWorkspacesResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Complianceacceleratorv3StatusResponseBase status;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspace_id";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public Complianceacceleratorv3DeleteComplianceWorkspacesResponse() {
  }

  public Complianceacceleratorv3DeleteComplianceWorkspacesResponse status(Complianceacceleratorv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Complianceacceleratorv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Complianceacceleratorv3StatusResponseBase status) {
    this.status = status;
  }


  public Complianceacceleratorv3DeleteComplianceWorkspacesResponse workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * The id of the workspace.
   * @return workspaceId
  **/
  @javax.annotation.Nullable
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3DeleteComplianceWorkspacesResponse complianceacceleratorv3DeleteComplianceWorkspacesResponse = (Complianceacceleratorv3DeleteComplianceWorkspacesResponse) o;
    return Objects.equals(this.status, complianceacceleratorv3DeleteComplianceWorkspacesResponse.status) &&
        Objects.equals(this.workspaceId, complianceacceleratorv3DeleteComplianceWorkspacesResponse.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, workspaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3DeleteComplianceWorkspacesResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("workspace_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3DeleteComplianceWorkspacesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3DeleteComplianceWorkspacesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3DeleteComplianceWorkspacesResponse is not found in the empty JSON string", Complianceacceleratorv3DeleteComplianceWorkspacesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3DeleteComplianceWorkspacesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3DeleteComplianceWorkspacesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Complianceacceleratorv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("workspace_id") != null && !jsonObj.get("workspace_id").isJsonNull()) && !jsonObj.get("workspace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3DeleteComplianceWorkspacesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3DeleteComplianceWorkspacesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3DeleteComplianceWorkspacesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3DeleteComplianceWorkspacesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3DeleteComplianceWorkspacesResponse>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3DeleteComplianceWorkspacesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3DeleteComplianceWorkspacesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3DeleteComplianceWorkspacesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3DeleteComplianceWorkspacesResponse
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3DeleteComplianceWorkspacesResponse
  */
  public static Complianceacceleratorv3DeleteComplianceWorkspacesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3DeleteComplianceWorkspacesResponse.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3DeleteComplianceWorkspacesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

