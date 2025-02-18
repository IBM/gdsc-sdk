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
 * Tenantuserv3BasicPrivilege
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3BasicPrivilege {
  public static final String SERIALIZED_NAME_PRIVILEGE_ID = "privilege_id";
  @SerializedName(SERIALIZED_NAME_PRIVILEGE_ID)
  private String privilegeId;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Tenantuserv3BasicPrivilege() {
  }

  public Tenantuserv3BasicPrivilege privilegeId(String privilegeId) {
    this.privilegeId = privilegeId;
    return this;
  }

   /**
   * Privilege ID to be updated.
   * @return privilegeId
  **/
  @javax.annotation.Nullable
  public String getPrivilegeId() {
    return privilegeId;
  }

  public void setPrivilegeId(String privilegeId) {
    this.privilegeId = privilegeId;
  }


  public Tenantuserv3BasicPrivilege roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Tenantuserv3BasicPrivilege addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles array (which is the purpose of Bulk Update).
   * @return roles
  **/
  @javax.annotation.Nullable
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public Tenantuserv3BasicPrivilege type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Privilege type (to uniquely identify the privilege).
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenantuserv3BasicPrivilege tenantuserv3BasicPrivilege = (Tenantuserv3BasicPrivilege) o;
    return Objects.equals(this.privilegeId, tenantuserv3BasicPrivilege.privilegeId) &&
        Objects.equals(this.roles, tenantuserv3BasicPrivilege.roles) &&
        Objects.equals(this.type, tenantuserv3BasicPrivilege.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeId, roles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3BasicPrivilege {\n");
    sb.append("    privilegeId: ").append(toIndentedString(privilegeId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("privilege_id");
    openapiFields.add("roles");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3BasicPrivilege
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3BasicPrivilege.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3BasicPrivilege is not found in the empty JSON string", Tenantuserv3BasicPrivilege.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3BasicPrivilege.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3BasicPrivilege` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("privilege_id") != null && !jsonObj.get("privilege_id").isJsonNull()) && !jsonObj.get("privilege_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privilege_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privilege_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull() && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3BasicPrivilege.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3BasicPrivilege' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3BasicPrivilege> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3BasicPrivilege.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3BasicPrivilege>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3BasicPrivilege value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3BasicPrivilege read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3BasicPrivilege given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3BasicPrivilege
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3BasicPrivilege
  */
  public static Tenantuserv3BasicPrivilege fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3BasicPrivilege.class);
  }

 /**
  * Convert an instance of Tenantuserv3BasicPrivilege to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

