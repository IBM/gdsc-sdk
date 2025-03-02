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
 * Tenantuserv3UpdatePrivilegeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3UpdatePrivilegeRequest {
  public static final String SERIALIZED_NAME_MANAGE_ROLES = "manage_roles";
  @SerializedName(SERIALIZED_NAME_MANAGE_ROLES)
  private List<String> manageRoles = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIVILEGE_ID = "privilege_id";
  @SerializedName(SERIALIZED_NAME_PRIVILEGE_ID)
  private String privilegeId;

  public static final String SERIALIZED_NAME_REMOVABLE = "removable";
  @SerializedName(SERIALIZED_NAME_REMOVABLE)
  private Boolean removable;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Tenantuserv3UpdatePrivilegeRequest() {
  }

  public Tenantuserv3UpdatePrivilegeRequest manageRoles(List<String> manageRoles) {
    this.manageRoles = manageRoles;
    return this;
  }

  public Tenantuserv3UpdatePrivilegeRequest addManageRolesItem(String manageRolesItem) {
    if (this.manageRoles == null) {
      this.manageRoles = new ArrayList<>();
    }
    this.manageRoles.add(manageRolesItem);
    return this;
  }

   /**
   * (Optional) Roles of the management permission.
   * @return manageRoles
  **/
  @javax.annotation.Nullable
  public List<String> getManageRoles() {
    return manageRoles;
  }

  public void setManageRoles(List<String> manageRoles) {
    this.manageRoles = manageRoles;
  }


  public Tenantuserv3UpdatePrivilegeRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * (Optional) A privilege name that the access-manager sees (for pre-defined privileges, use translation text).
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Tenantuserv3UpdatePrivilegeRequest privilegeId(String privilegeId) {
    this.privilegeId = privilegeId;
    return this;
  }

   /**
   * Permanent id of the privilege to be updated or created.
   * @return privilegeId
  **/
  @javax.annotation.Nullable
  public String getPrivilegeId() {
    return privilegeId;
  }

  public void setPrivilegeId(String privilegeId) {
    this.privilegeId = privilegeId;
  }


  public Tenantuserv3UpdatePrivilegeRequest removable(Boolean removable) {
    this.removable = removable;
    return this;
  }

   /**
   * (Optional) All pre-defined privileges are not removable.
   * @return removable
  **/
  @javax.annotation.Nullable
  public Boolean getRemovable() {
    return removable;
  }

  public void setRemovable(Boolean removable) {
    this.removable = removable;
  }


  public Tenantuserv3UpdatePrivilegeRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Tenantuserv3UpdatePrivilegeRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The array of Insights roles that this privilege belongs to.
   * @return roles
  **/
  @javax.annotation.Nullable
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public Tenantuserv3UpdatePrivilegeRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * (Optional) Type of privilege: report, classification, group, page, restapi, etc.
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
    Tenantuserv3UpdatePrivilegeRequest tenantuserv3UpdatePrivilegeRequest = (Tenantuserv3UpdatePrivilegeRequest) o;
    return Objects.equals(this.manageRoles, tenantuserv3UpdatePrivilegeRequest.manageRoles) &&
        Objects.equals(this.name, tenantuserv3UpdatePrivilegeRequest.name) &&
        Objects.equals(this.privilegeId, tenantuserv3UpdatePrivilegeRequest.privilegeId) &&
        Objects.equals(this.removable, tenantuserv3UpdatePrivilegeRequest.removable) &&
        Objects.equals(this.roles, tenantuserv3UpdatePrivilegeRequest.roles) &&
        Objects.equals(this.type, tenantuserv3UpdatePrivilegeRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manageRoles, name, privilegeId, removable, roles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3UpdatePrivilegeRequest {\n");
    sb.append("    manageRoles: ").append(toIndentedString(manageRoles)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privilegeId: ").append(toIndentedString(privilegeId)).append("\n");
    sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
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
    openapiFields.add("manage_roles");
    openapiFields.add("name");
    openapiFields.add("privilege_id");
    openapiFields.add("removable");
    openapiFields.add("roles");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3UpdatePrivilegeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3UpdatePrivilegeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3UpdatePrivilegeRequest is not found in the empty JSON string", Tenantuserv3UpdatePrivilegeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3UpdatePrivilegeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3UpdatePrivilegeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("manage_roles") != null && !jsonObj.get("manage_roles").isJsonNull() && !jsonObj.get("manage_roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `manage_roles` to be an array in the JSON string but got `%s`", jsonObj.get("manage_roles").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
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
       if (!Tenantuserv3UpdatePrivilegeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3UpdatePrivilegeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3UpdatePrivilegeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3UpdatePrivilegeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3UpdatePrivilegeRequest>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3UpdatePrivilegeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3UpdatePrivilegeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3UpdatePrivilegeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3UpdatePrivilegeRequest
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3UpdatePrivilegeRequest
  */
  public static Tenantuserv3UpdatePrivilegeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3UpdatePrivilegeRequest.class);
  }

 /**
  * Convert an instance of Tenantuserv3UpdatePrivilegeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

