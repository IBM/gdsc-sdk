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
 * Complianceacceleratorv3HydrateComplianceWorkspacesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3HydrateComplianceWorkspacesRequest {
  public static final String SERIALIZED_NAME_COMPLIANCE_ID = "compliance_id";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_ID)
  private String complianceId;

  public Complianceacceleratorv3HydrateComplianceWorkspacesRequest() {
  }

  public Complianceacceleratorv3HydrateComplianceWorkspacesRequest complianceId(String complianceId) {
    this.complianceId = complianceId;
    return this;
  }

   /**
   * Workspace to be hydrated.
   * @return complianceId
  **/
  @javax.annotation.Nullable
  public String getComplianceId() {
    return complianceId;
  }

  public void setComplianceId(String complianceId) {
    this.complianceId = complianceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3HydrateComplianceWorkspacesRequest complianceacceleratorv3HydrateComplianceWorkspacesRequest = (Complianceacceleratorv3HydrateComplianceWorkspacesRequest) o;
    return Objects.equals(this.complianceId, complianceacceleratorv3HydrateComplianceWorkspacesRequest.complianceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3HydrateComplianceWorkspacesRequest {\n");
    sb.append("    complianceId: ").append(toIndentedString(complianceId)).append("\n");
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
    openapiFields.add("compliance_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3HydrateComplianceWorkspacesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3HydrateComplianceWorkspacesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3HydrateComplianceWorkspacesRequest is not found in the empty JSON string", Complianceacceleratorv3HydrateComplianceWorkspacesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3HydrateComplianceWorkspacesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3HydrateComplianceWorkspacesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("compliance_id") != null && !jsonObj.get("compliance_id").isJsonNull()) && !jsonObj.get("compliance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compliance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compliance_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3HydrateComplianceWorkspacesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3HydrateComplianceWorkspacesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3HydrateComplianceWorkspacesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3HydrateComplianceWorkspacesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3HydrateComplianceWorkspacesRequest>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3HydrateComplianceWorkspacesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3HydrateComplianceWorkspacesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3HydrateComplianceWorkspacesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3HydrateComplianceWorkspacesRequest
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3HydrateComplianceWorkspacesRequest
  */
  public static Complianceacceleratorv3HydrateComplianceWorkspacesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3HydrateComplianceWorkspacesRequest.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3HydrateComplianceWorkspacesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

