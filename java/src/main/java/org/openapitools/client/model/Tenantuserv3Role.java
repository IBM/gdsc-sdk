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
 * Role.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3Role {
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

  public Tenantuserv3Role() {
  }

  public Tenantuserv3Role description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A role description that the access-manager sees (for pre-defined roles, use translation text).
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Tenantuserv3Role icpRoles(List<String> icpRoles) {
    this.icpRoles = icpRoles;
    return this;
  }

  public Tenantuserv3Role addIcpRolesItem(String icpRolesItem) {
    if (this.icpRoles == null) {
      this.icpRoles = new ArrayList<>();
    }
    this.icpRoles.add(icpRolesItem);
    return this;
  }

   /**
   * An array of ICP roles that should be set for each user with this role.
   * @return icpRoles
  **/
  @javax.annotation.Nullable
  public List<String> getIcpRoles() {
    return icpRoles;
  }

  public void setIcpRoles(List<String> icpRoles) {
    this.icpRoles = icpRoles;
  }


  public Tenantuserv3Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A role name that the access-manager sees (for pre-defined roles, use translation text).
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Tenantuserv3Role removable(Boolean removable) {
    this.removable = removable;
    return this;
  }

   /**
   * Some pre-defined roles are not removable.
   * @return removable
  **/
  @javax.annotation.Nullable
  public Boolean getRemovable() {
    return removable;
  }

  public void setRemovable(Boolean removable) {
    this.removable = removable;
  }


  public Tenantuserv3Role roleId(String roleId) {
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
    Tenantuserv3Role tenantuserv3Role = (Tenantuserv3Role) o;
    return Objects.equals(this.description, tenantuserv3Role.description) &&
        Objects.equals(this.icpRoles, tenantuserv3Role.icpRoles) &&
        Objects.equals(this.name, tenantuserv3Role.name) &&
        Objects.equals(this.removable, tenantuserv3Role.removable) &&
        Objects.equals(this.roleId, tenantuserv3Role.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, icpRoles, name, removable, roleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3Role {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3Role
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3Role.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3Role is not found in the empty JSON string", Tenantuserv3Role.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3Role.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3Role` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!Tenantuserv3Role.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3Role' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3Role> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3Role.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3Role>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3Role value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3Role read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3Role given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3Role
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3Role
  */
  public static Tenantuserv3Role fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3Role.class);
  }

 /**
  * Convert an instance of Tenantuserv3Role to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

