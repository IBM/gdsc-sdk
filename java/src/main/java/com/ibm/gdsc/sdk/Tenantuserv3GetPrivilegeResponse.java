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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Tenantuserv3Privilege;
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
 * Tenantuserv3GetPrivilegeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3GetPrivilegeResponse {
  public static final String SERIALIZED_NAME_PRIVILEGE = "privilege";
  @SerializedName(SERIALIZED_NAME_PRIVILEGE)
  private Tenantuserv3Privilege privilege;

  public Tenantuserv3GetPrivilegeResponse() {
  }

  public Tenantuserv3GetPrivilegeResponse privilege(Tenantuserv3Privilege privilege) {
    this.privilege = privilege;
    return this;
  }

   /**
   * Get privilege
   * @return privilege
  **/
  @javax.annotation.Nullable
  public Tenantuserv3Privilege getPrivilege() {
    return privilege;
  }

  public void setPrivilege(Tenantuserv3Privilege privilege) {
    this.privilege = privilege;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenantuserv3GetPrivilegeResponse tenantuserv3GetPrivilegeResponse = (Tenantuserv3GetPrivilegeResponse) o;
    return Objects.equals(this.privilege, tenantuserv3GetPrivilegeResponse.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3GetPrivilegeResponse {\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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
    openapiFields.add("privilege");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3GetPrivilegeResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3GetPrivilegeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3GetPrivilegeResponse is not found in the empty JSON string", Tenantuserv3GetPrivilegeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3GetPrivilegeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3GetPrivilegeResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `privilege`
      if (jsonObj.get("privilege") != null && !jsonObj.get("privilege").isJsonNull()) {
        Tenantuserv3Privilege.validateJsonElement(jsonObj.get("privilege"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3GetPrivilegeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3GetPrivilegeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3GetPrivilegeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3GetPrivilegeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3GetPrivilegeResponse>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3GetPrivilegeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3GetPrivilegeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3GetPrivilegeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3GetPrivilegeResponse
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3GetPrivilegeResponse
  */
  public static Tenantuserv3GetPrivilegeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3GetPrivilegeResponse.class);
  }

 /**
  * Convert an instance of Tenantuserv3GetPrivilegeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

