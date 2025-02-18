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
import com.ibm.gdsc.sdk.Groupbuilderv3GroupMember;
import com.ibm.gdsc.sdk.Groupbuilderv3LdapConfig;
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
 * EditGroupRequest request an update to the group members of a specific group ID.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3EditGroupRequest {
  public static final String SERIALIZED_NAME_CLEAR_GROUP = "clear_group";
  @SerializedName(SERIALIZED_NAME_CLEAR_GROUP)
  private Boolean clearGroup;

  public static final String SERIALIZED_NAME_DELETED_MEMBERS = "deleted_members";
  @SerializedName(SERIALIZED_NAME_DELETED_MEMBERS)
  private List<String> deletedMembers = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_LDAP_CONFIG = "ldap_config";
  @SerializedName(SERIALIZED_NAME_LDAP_CONFIG)
  private Groupbuilderv3LdapConfig ldapConfig;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_MEMBERS = "new_members";
  @SerializedName(SERIALIZED_NAME_NEW_MEMBERS)
  private List<String> newMembers = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_MEMBERS = "updated_members";
  @SerializedName(SERIALIZED_NAME_UPDATED_MEMBERS)
  private List<Groupbuilderv3GroupMember> updatedMembers = new ArrayList<>();

  public Groupbuilderv3EditGroupRequest() {
  }

  public Groupbuilderv3EditGroupRequest clearGroup(Boolean clearGroup) {
    this.clearGroup = clearGroup;
    return this;
  }

   /**
   * Clear the group member.
   * @return clearGroup
  **/
  @javax.annotation.Nullable
  public Boolean getClearGroup() {
    return clearGroup;
  }

  public void setClearGroup(Boolean clearGroup) {
    this.clearGroup = clearGroup;
  }


  public Groupbuilderv3EditGroupRequest deletedMembers(List<String> deletedMembers) {
    this.deletedMembers = deletedMembers;
    return this;
  }

  public Groupbuilderv3EditGroupRequest addDeletedMembersItem(String deletedMembersItem) {
    if (this.deletedMembers == null) {
      this.deletedMembers = new ArrayList<>();
    }
    this.deletedMembers.add(deletedMembersItem);
    return this;
  }

   /**
   * Group member ID to delete.
   * @return deletedMembers
  **/
  @javax.annotation.Nullable
  public List<String> getDeletedMembers() {
    return deletedMembers;
  }

  public void setDeletedMembers(List<String> deletedMembers) {
    this.deletedMembers = deletedMembers;
  }


  public Groupbuilderv3EditGroupRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Group description.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Groupbuilderv3EditGroupRequest groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID.
   * @return groupId
  **/
  @javax.annotation.Nullable
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public Groupbuilderv3EditGroupRequest ldapConfig(Groupbuilderv3LdapConfig ldapConfig) {
    this.ldapConfig = ldapConfig;
    return this;
  }

   /**
   * Get ldapConfig
   * @return ldapConfig
  **/
  @javax.annotation.Nullable
  public Groupbuilderv3LdapConfig getLdapConfig() {
    return ldapConfig;
  }

  public void setLdapConfig(Groupbuilderv3LdapConfig ldapConfig) {
    this.ldapConfig = ldapConfig;
  }


  public Groupbuilderv3EditGroupRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Groupbuilderv3EditGroupRequest newMembers(List<String> newMembers) {
    this.newMembers = newMembers;
    return this;
  }

  public Groupbuilderv3EditGroupRequest addNewMembersItem(String newMembersItem) {
    if (this.newMembers == null) {
      this.newMembers = new ArrayList<>();
    }
    this.newMembers.add(newMembersItem);
    return this;
  }

   /**
   * New members to add.
   * @return newMembers
  **/
  @javax.annotation.Nullable
  public List<String> getNewMembers() {
    return newMembers;
  }

  public void setNewMembers(List<String> newMembers) {
    this.newMembers = newMembers;
  }


  public Groupbuilderv3EditGroupRequest updatedMembers(List<Groupbuilderv3GroupMember> updatedMembers) {
    this.updatedMembers = updatedMembers;
    return this;
  }

  public Groupbuilderv3EditGroupRequest addUpdatedMembersItem(Groupbuilderv3GroupMember updatedMembersItem) {
    if (this.updatedMembers == null) {
      this.updatedMembers = new ArrayList<>();
    }
    this.updatedMembers.add(updatedMembersItem);
    return this;
  }

   /**
   * Group members to update.
   * @return updatedMembers
  **/
  @javax.annotation.Nullable
  public List<Groupbuilderv3GroupMember> getUpdatedMembers() {
    return updatedMembers;
  }

  public void setUpdatedMembers(List<Groupbuilderv3GroupMember> updatedMembers) {
    this.updatedMembers = updatedMembers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groupbuilderv3EditGroupRequest groupbuilderv3EditGroupRequest = (Groupbuilderv3EditGroupRequest) o;
    return Objects.equals(this.clearGroup, groupbuilderv3EditGroupRequest.clearGroup) &&
        Objects.equals(this.deletedMembers, groupbuilderv3EditGroupRequest.deletedMembers) &&
        Objects.equals(this.description, groupbuilderv3EditGroupRequest.description) &&
        Objects.equals(this.groupId, groupbuilderv3EditGroupRequest.groupId) &&
        Objects.equals(this.ldapConfig, groupbuilderv3EditGroupRequest.ldapConfig) &&
        Objects.equals(this.name, groupbuilderv3EditGroupRequest.name) &&
        Objects.equals(this.newMembers, groupbuilderv3EditGroupRequest.newMembers) &&
        Objects.equals(this.updatedMembers, groupbuilderv3EditGroupRequest.updatedMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearGroup, deletedMembers, description, groupId, ldapConfig, name, newMembers, updatedMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3EditGroupRequest {\n");
    sb.append("    clearGroup: ").append(toIndentedString(clearGroup)).append("\n");
    sb.append("    deletedMembers: ").append(toIndentedString(deletedMembers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    ldapConfig: ").append(toIndentedString(ldapConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newMembers: ").append(toIndentedString(newMembers)).append("\n");
    sb.append("    updatedMembers: ").append(toIndentedString(updatedMembers)).append("\n");
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
    openapiFields.add("clear_group");
    openapiFields.add("deleted_members");
    openapiFields.add("description");
    openapiFields.add("group_id");
    openapiFields.add("ldap_config");
    openapiFields.add("name");
    openapiFields.add("new_members");
    openapiFields.add("updated_members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3EditGroupRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3EditGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3EditGroupRequest is not found in the empty JSON string", Groupbuilderv3EditGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3EditGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3EditGroupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("deleted_members") != null && !jsonObj.get("deleted_members").isJsonNull() && !jsonObj.get("deleted_members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_members` to be an array in the JSON string but got `%s`", jsonObj.get("deleted_members").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `ldap_config`
      if (jsonObj.get("ldap_config") != null && !jsonObj.get("ldap_config").isJsonNull()) {
        Groupbuilderv3LdapConfig.validateJsonElement(jsonObj.get("ldap_config"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("new_members") != null && !jsonObj.get("new_members").isJsonNull() && !jsonObj.get("new_members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_members` to be an array in the JSON string but got `%s`", jsonObj.get("new_members").toString()));
      }
      if (jsonObj.get("updated_members") != null && !jsonObj.get("updated_members").isJsonNull()) {
        JsonArray jsonArrayupdatedMembers = jsonObj.getAsJsonArray("updated_members");
        if (jsonArrayupdatedMembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("updated_members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `updated_members` to be an array in the JSON string but got `%s`", jsonObj.get("updated_members").toString()));
          }

          // validate the optional field `updated_members` (array)
          for (int i = 0; i < jsonArrayupdatedMembers.size(); i++) {
            Groupbuilderv3GroupMember.validateJsonElement(jsonArrayupdatedMembers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3EditGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3EditGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3EditGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3EditGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3EditGroupRequest>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3EditGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3EditGroupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3EditGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3EditGroupRequest
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3EditGroupRequest
  */
  public static Groupbuilderv3EditGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3EditGroupRequest.class);
  }

 /**
  * Convert an instance of Groupbuilderv3EditGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

