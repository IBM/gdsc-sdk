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
import com.ibm.security.guardium.Groupbuilderv3Group;
import com.ibm.security.guardium.Groupbuilderv3LdapConfig;
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
 * GetGroupsRequest requests to import specific groups from a Guardium Data Protection central manager.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3ImportGroupRequest {
  public static final String SERIALIZED_NAME_CENTRAL_MANAGER_ID = "central_manager_id";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER_ID)
  private String centralManagerId;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<Groupbuilderv3Group> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_LDAP_CONFIG = "ldap_config";
  @SerializedName(SERIALIZED_NAME_LDAP_CONFIG)
  private Groupbuilderv3LdapConfig ldapConfig;

  public static final String SERIALIZED_NAME_ONE_TIME = "one_time";
  @SerializedName(SERIALIZED_NAME_ONE_TIME)
  private Boolean oneTime;

  public static final String SERIALIZED_NAME_PREVIEW = "preview";
  @SerializedName(SERIALIZED_NAME_PREVIEW)
  private Boolean preview;

  public Groupbuilderv3ImportGroupRequest() {
  }

  public Groupbuilderv3ImportGroupRequest centralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
    return this;
  }

   /**
   * Central manager host name.
   * @return centralManagerId
  **/
  @javax.annotation.Nullable
  public String getCentralManagerId() {
    return centralManagerId;
  }

  public void setCentralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
  }


  public Groupbuilderv3ImportGroupRequest groups(List<Groupbuilderv3Group> groups) {
    this.groups = groups;
    return this;
  }

  public Groupbuilderv3ImportGroupRequest addGroupsItem(Groupbuilderv3Group groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of groups to import from the central manager.
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<Groupbuilderv3Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Groupbuilderv3Group> groups) {
    this.groups = groups;
  }


  public Groupbuilderv3ImportGroupRequest ldapConfig(Groupbuilderv3LdapConfig ldapConfig) {
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


  public Groupbuilderv3ImportGroupRequest oneTime(Boolean oneTime) {
    this.oneTime = oneTime;
    return this;
  }

   /**
   * Import without synchronizing.
   * @return oneTime
  **/
  @javax.annotation.Nullable
  public Boolean getOneTime() {
    return oneTime;
  }

  public void setOneTime(Boolean oneTime) {
    this.oneTime = oneTime;
  }


  public Groupbuilderv3ImportGroupRequest preview(Boolean preview) {
    this.preview = preview;
    return this;
  }

   /**
   * This flag is only valid if ldap_config is specified When set, LDAP import will pull the first 10 members from LDAP based on specified  LDAP config and return to the caller without adding them to the group.
   * @return preview
  **/
  @javax.annotation.Nullable
  public Boolean getPreview() {
    return preview;
  }

  public void setPreview(Boolean preview) {
    this.preview = preview;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groupbuilderv3ImportGroupRequest groupbuilderv3ImportGroupRequest = (Groupbuilderv3ImportGroupRequest) o;
    return Objects.equals(this.centralManagerId, groupbuilderv3ImportGroupRequest.centralManagerId) &&
        Objects.equals(this.groups, groupbuilderv3ImportGroupRequest.groups) &&
        Objects.equals(this.ldapConfig, groupbuilderv3ImportGroupRequest.ldapConfig) &&
        Objects.equals(this.oneTime, groupbuilderv3ImportGroupRequest.oneTime) &&
        Objects.equals(this.preview, groupbuilderv3ImportGroupRequest.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralManagerId, groups, ldapConfig, oneTime, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3ImportGroupRequest {\n");
    sb.append("    centralManagerId: ").append(toIndentedString(centralManagerId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    ldapConfig: ").append(toIndentedString(ldapConfig)).append("\n");
    sb.append("    oneTime: ").append(toIndentedString(oneTime)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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
    openapiFields.add("central_manager_id");
    openapiFields.add("groups");
    openapiFields.add("ldap_config");
    openapiFields.add("one_time");
    openapiFields.add("preview");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3ImportGroupRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3ImportGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3ImportGroupRequest is not found in the empty JSON string", Groupbuilderv3ImportGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3ImportGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3ImportGroupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("central_manager_id") != null && !jsonObj.get("central_manager_id").isJsonNull()) && !jsonObj.get("central_manager_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager_id").toString()));
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            Groupbuilderv3Group.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
      // validate the optional field `ldap_config`
      if (jsonObj.get("ldap_config") != null && !jsonObj.get("ldap_config").isJsonNull()) {
        Groupbuilderv3LdapConfig.validateJsonElement(jsonObj.get("ldap_config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3ImportGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3ImportGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3ImportGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3ImportGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3ImportGroupRequest>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3ImportGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3ImportGroupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3ImportGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3ImportGroupRequest
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3ImportGroupRequest
  */
  public static Groupbuilderv3ImportGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3ImportGroupRequest.class);
  }

 /**
  * Convert an instance of Groupbuilderv3ImportGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

