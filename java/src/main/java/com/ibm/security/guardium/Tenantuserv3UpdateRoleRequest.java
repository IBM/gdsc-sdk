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
 * Tenantuserv3UpdateRoleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3UpdateRoleRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICP_ROLES = "icp_roles";
  @SerializedName(SERIALIZED_NAME_ICP_ROLES)
  private List<String> icpRoles = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REMOVABLE = "removable";
  @SerializedName(SERIALIZED_NAME_REMOVABLE)
  private Boolean removable;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public Tenantuserv3UpdateRoleRequest() {
  }

  public Tenantuserv3UpdateRoleRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * (Optional) A role description that the access-manager sees (for pre-defined roles, use translation text).
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Tenantuserv3UpdateRoleRequest icpRoles(List<String> icpRoles) {
    this.icpRoles = icpRoles;
    return this;
  }

  public Tenantuserv3UpdateRoleRequest addIcpRolesItem(String icpRolesItem) {
    if (this.icpRoles == null) {
      this.icpRoles = new ArrayList<>();
    }
    this.icpRoles.add(icpRolesItem);
    return this;
  }

   /**
   * (Optional) An array of ICP roles that should be set for each user with this role.
   * @return icpRoles
  **/
  @javax.annotation.Nullable
  public List<String> getIcpRoles() {
    return icpRoles;
  }

  public void setIcpRoles(List<String> icpRoles) {
    this.icpRoles = icpRoles;
  }


  public Tenantuserv3UpdateRoleRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * (Optional) A role name that the access-manager sees (for pre-defined roles, use translation text).
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Tenantuserv3UpdateRoleRequest removable(Boolean removable) {
    this.removable = removable;
    return this;
  }

   /**
   * (Optional) Some pre-defined roles are not removable.
   * @return removable
  **/
  @javax.annotation.Nullable
  public Boolean getRemovable() {
    return removable;
  }

  public void setRemovable(Boolean removable) {
    this.removable = removable;
  }


  public Tenantuserv3UpdateRoleRequest roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Permanent id of the role.
   * @return roleId
  **/
  @javax.annotation.Nullable
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenantuserv3UpdateRoleRequest tenantuserv3UpdateRoleRequest = (Tenantuserv3UpdateRoleRequest) o;
    return Objects.equals(this.description, tenantuserv3UpdateRoleRequest.description) &&
        Objects.equals(this.icpRoles, tenantuserv3UpdateRoleRequest.icpRoles) &&
        Objects.equals(this.name, tenantuserv3UpdateRoleRequest.name) &&
        Objects.equals(this.removable, tenantuserv3UpdateRoleRequest.removable) &&
        Objects.equals(this.roleId, tenantuserv3UpdateRoleRequest.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, icpRoles, name, removable, roleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3UpdateRoleRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icpRoles: ").append(toIndentedString(icpRoles)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("icp_roles");
    openapiFields.add("name");
    openapiFields.add("removable");
    openapiFields.add("role_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3UpdateRoleRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3UpdateRoleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3UpdateRoleRequest is not found in the empty JSON string", Tenantuserv3UpdateRoleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3UpdateRoleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3UpdateRoleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("icp_roles") != null && !jsonObj.get("icp_roles").isJsonNull() && !jsonObj.get("icp_roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `icp_roles` to be an array in the JSON string but got `%s`", jsonObj.get("icp_roles").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("role_id") != null && !jsonObj.get("role_id").isJsonNull()) && !jsonObj.get("role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3UpdateRoleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3UpdateRoleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3UpdateRoleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3UpdateRoleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3UpdateRoleRequest>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3UpdateRoleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3UpdateRoleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3UpdateRoleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3UpdateRoleRequest
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3UpdateRoleRequest
  */
  public static Tenantuserv3UpdateRoleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3UpdateRoleRequest.class);
  }

 /**
  * Convert an instance of Tenantuserv3UpdateRoleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

