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
import com.ibm.security.guardium.Policybuilderv3GDPSyncEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Request object containing a list of objects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3InsertGdpPolicySyncRequest {
  public static final String SERIALIZED_NAME_GDP_POLICIES = "gdp_policies";
  @SerializedName(SERIALIZED_NAME_GDP_POLICIES)
  private List<Policybuilderv3GDPSyncEntry> gdpPolicies = new ArrayList<>();

  public Policybuilderv3InsertGdpPolicySyncRequest() {
  }

  public Policybuilderv3InsertGdpPolicySyncRequest gdpPolicies(List<Policybuilderv3GDPSyncEntry> gdpPolicies) {
    this.gdpPolicies = gdpPolicies;
    return this;
  }

  public Policybuilderv3InsertGdpPolicySyncRequest addGdpPoliciesItem(Policybuilderv3GDPSyncEntry gdpPoliciesItem) {
    if (this.gdpPolicies == null) {
      this.gdpPolicies = new ArrayList<>();
    }
    this.gdpPolicies.add(gdpPoliciesItem);
    return this;
  }

   /**
   * Get gdpPolicies
   * @return gdpPolicies
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3GDPSyncEntry> getGdpPolicies() {
    return gdpPolicies;
  }

  public void setGdpPolicies(List<Policybuilderv3GDPSyncEntry> gdpPolicies) {
    this.gdpPolicies = gdpPolicies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3InsertGdpPolicySyncRequest policybuilderv3InsertGdpPolicySyncRequest = (Policybuilderv3InsertGdpPolicySyncRequest) o;
    return Objects.equals(this.gdpPolicies, policybuilderv3InsertGdpPolicySyncRequest.gdpPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gdpPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3InsertGdpPolicySyncRequest {\n");
    sb.append("    gdpPolicies: ").append(toIndentedString(gdpPolicies)).append("\n");
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
    openapiFields.add("gdp_policies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3InsertGdpPolicySyncRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3InsertGdpPolicySyncRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3InsertGdpPolicySyncRequest is not found in the empty JSON string", Policybuilderv3InsertGdpPolicySyncRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3InsertGdpPolicySyncRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3InsertGdpPolicySyncRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("gdp_policies") != null && !jsonObj.get("gdp_policies").isJsonNull()) {
        JsonArray jsonArraygdpPolicies = jsonObj.getAsJsonArray("gdp_policies");
        if (jsonArraygdpPolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("gdp_policies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `gdp_policies` to be an array in the JSON string but got `%s`", jsonObj.get("gdp_policies").toString()));
          }

          // validate the optional field `gdp_policies` (array)
          for (int i = 0; i < jsonArraygdpPolicies.size(); i++) {
            Policybuilderv3GDPSyncEntry.validateJsonElement(jsonArraygdpPolicies.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3InsertGdpPolicySyncRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3InsertGdpPolicySyncRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3InsertGdpPolicySyncRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3InsertGdpPolicySyncRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3InsertGdpPolicySyncRequest>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3InsertGdpPolicySyncRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3InsertGdpPolicySyncRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3InsertGdpPolicySyncRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3InsertGdpPolicySyncRequest
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3InsertGdpPolicySyncRequest
  */
  public static Policybuilderv3InsertGdpPolicySyncRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3InsertGdpPolicySyncRequest.class);
  }

 /**
  * Convert an instance of Policybuilderv3InsertGdpPolicySyncRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

