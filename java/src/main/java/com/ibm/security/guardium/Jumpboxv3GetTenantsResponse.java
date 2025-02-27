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
import com.ibm.security.guardium.Jumpboxv3Tenant;
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
 * Jumpboxv3GetTenantsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Jumpboxv3GetTenantsResponse {
  public static final String SERIALIZED_NAME_TENANTS = "Tenants";
  @SerializedName(SERIALIZED_NAME_TENANTS)
  private List<Jumpboxv3Tenant> tenants = new ArrayList<>();

  public Jumpboxv3GetTenantsResponse() {
  }

  public Jumpboxv3GetTenantsResponse tenants(List<Jumpboxv3Tenant> tenants) {
    this.tenants = tenants;
    return this;
  }

  public Jumpboxv3GetTenantsResponse addTenantsItem(Jumpboxv3Tenant tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }

   /**
   * Get tenants
   * @return tenants
  **/
  @javax.annotation.Nullable
  public List<Jumpboxv3Tenant> getTenants() {
    return tenants;
  }

  public void setTenants(List<Jumpboxv3Tenant> tenants) {
    this.tenants = tenants;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jumpboxv3GetTenantsResponse jumpboxv3GetTenantsResponse = (Jumpboxv3GetTenantsResponse) o;
    return Objects.equals(this.tenants, jumpboxv3GetTenantsResponse.tenants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jumpboxv3GetTenantsResponse {\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
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
    openapiFields.add("Tenants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Jumpboxv3GetTenantsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jumpboxv3GetTenantsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jumpboxv3GetTenantsResponse is not found in the empty JSON string", Jumpboxv3GetTenantsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jumpboxv3GetTenantsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jumpboxv3GetTenantsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Tenants") != null && !jsonObj.get("Tenants").isJsonNull()) {
        JsonArray jsonArraytenants = jsonObj.getAsJsonArray("Tenants");
        if (jsonArraytenants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Tenants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Tenants` to be an array in the JSON string but got `%s`", jsonObj.get("Tenants").toString()));
          }

          // validate the optional field `Tenants` (array)
          for (int i = 0; i < jsonArraytenants.size(); i++) {
            Jumpboxv3Tenant.validateJsonElement(jsonArraytenants.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jumpboxv3GetTenantsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jumpboxv3GetTenantsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jumpboxv3GetTenantsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jumpboxv3GetTenantsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Jumpboxv3GetTenantsResponse>() {
           @Override
           public void write(JsonWriter out, Jumpboxv3GetTenantsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jumpboxv3GetTenantsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jumpboxv3GetTenantsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jumpboxv3GetTenantsResponse
  * @throws IOException if the JSON string is invalid with respect to Jumpboxv3GetTenantsResponse
  */
  public static Jumpboxv3GetTenantsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jumpboxv3GetTenantsResponse.class);
  }

 /**
  * Convert an instance of Jumpboxv3GetTenantsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

