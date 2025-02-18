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
import com.ibm.gdsc.sdk.Tenantuserv3FullUser;
import com.ibm.gdsc.sdk.Tenantuserv3Tenant;
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

import com.ibm.gdsc.JSON;

/**
 * UserTenant contains info on the user and on connected tenants.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3UserTenant {
  public static final String SERIALIZED_NAME_ACTIVE_TENANT = "active_tenant";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TENANT)
  private Tenantuserv3Tenant activeTenant;

  public static final String SERIALIZED_NAME_TENANTS = "tenants";
  @SerializedName(SERIALIZED_NAME_TENANTS)
  private List<Tenantuserv3Tenant> tenants = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Tenantuserv3FullUser user;

  public Tenantuserv3UserTenant() {
  }

  public Tenantuserv3UserTenant activeTenant(Tenantuserv3Tenant activeTenant) {
    this.activeTenant = activeTenant;
    return this;
  }

   /**
   * Get activeTenant
   * @return activeTenant
  **/
  @javax.annotation.Nullable
  public Tenantuserv3Tenant getActiveTenant() {
    return activeTenant;
  }

  public void setActiveTenant(Tenantuserv3Tenant activeTenant) {
    this.activeTenant = activeTenant;
  }


  public Tenantuserv3UserTenant tenants(List<Tenantuserv3Tenant> tenants) {
    this.tenants = tenants;
    return this;
  }

  public Tenantuserv3UserTenant addTenantsItem(Tenantuserv3Tenant tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }

   /**
   * Limited info about the other tenants this user belongs to.
   * @return tenants
  **/
  @javax.annotation.Nullable
  public List<Tenantuserv3Tenant> getTenants() {
    return tenants;
  }

  public void setTenants(List<Tenantuserv3Tenant> tenants) {
    this.tenants = tenants;
  }


  public Tenantuserv3UserTenant user(Tenantuserv3FullUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public Tenantuserv3FullUser getUser() {
    return user;
  }

  public void setUser(Tenantuserv3FullUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenantuserv3UserTenant tenantuserv3UserTenant = (Tenantuserv3UserTenant) o;
    return Objects.equals(this.activeTenant, tenantuserv3UserTenant.activeTenant) &&
        Objects.equals(this.tenants, tenantuserv3UserTenant.tenants) &&
        Objects.equals(this.user, tenantuserv3UserTenant.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTenant, tenants, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3UserTenant {\n");
    sb.append("    activeTenant: ").append(toIndentedString(activeTenant)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("active_tenant");
    openapiFields.add("tenants");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3UserTenant
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3UserTenant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3UserTenant is not found in the empty JSON string", Tenantuserv3UserTenant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3UserTenant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3UserTenant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `active_tenant`
      if (jsonObj.get("active_tenant") != null && !jsonObj.get("active_tenant").isJsonNull()) {
        Tenantuserv3Tenant.validateJsonElement(jsonObj.get("active_tenant"));
      }
      if (jsonObj.get("tenants") != null && !jsonObj.get("tenants").isJsonNull()) {
        JsonArray jsonArraytenants = jsonObj.getAsJsonArray("tenants");
        if (jsonArraytenants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tenants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tenants` to be an array in the JSON string but got `%s`", jsonObj.get("tenants").toString()));
          }

          // validate the optional field `tenants` (array)
          for (int i = 0; i < jsonArraytenants.size(); i++) {
            Tenantuserv3Tenant.validateJsonElement(jsonArraytenants.get(i));
          };
        }
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        Tenantuserv3FullUser.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3UserTenant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3UserTenant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3UserTenant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3UserTenant.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3UserTenant>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3UserTenant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3UserTenant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3UserTenant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3UserTenant
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3UserTenant
  */
  public static Tenantuserv3UserTenant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3UserTenant.class);
  }

 /**
  * Convert an instance of Tenantuserv3UserTenant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

