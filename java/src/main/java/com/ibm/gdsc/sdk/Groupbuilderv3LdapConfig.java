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
 * LdapConfig contains information about configuration for importing group members from LDAP.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3LdapConfig {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<String> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_BIND_GROUP_ID = "bind_group_id";
  @SerializedName(SERIALIZED_NAME_BIND_GROUP_ID)
  private Integer bindGroupId;

  public static final String SERIALIZED_NAME_BIND_PASSWORD = "bind_password";
  @SerializedName(SERIALIZED_NAME_BIND_PASSWORD)
  private String bindPassword;

  public static final String SERIALIZED_NAME_CLEAR_GROUP = "clear_group";
  @SerializedName(SERIALIZED_NAME_CLEAR_GROUP)
  private Boolean clearGroup;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_FILTER_SCOPE = "filter_scope";
  @SerializedName(SERIALIZED_NAME_FILTER_SCOPE)
  private Integer filterScope;

  public static final String SERIALIZED_NAME_IMPORT_LIMIT = "import_limit";
  @SerializedName(SERIALIZED_NAME_IMPORT_LIMIT)
  private Integer importLimit;

  public static final String SERIALIZED_NAME_LDAP_GROUP_NAME = "ldap_group_name";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_NAME)
  private String ldapGroupName;

  public static final String SERIALIZED_NAME_LDAP_ID = "ldap_id";
  @SerializedName(SERIALIZED_NAME_LDAP_ID)
  private String ldapId;

  public static final String SERIALIZED_NAME_MEMBER_PREFIX = "member_prefix";
  @SerializedName(SERIALIZED_NAME_MEMBER_PREFIX)
  private String memberPrefix;

  public Groupbuilderv3LdapConfig() {
  }

  public Groupbuilderv3LdapConfig attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Groupbuilderv3LdapConfig addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * LDAP object attribute used to convert to member data.
   * @return attributes
  **/
  @javax.annotation.Nullable
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }


  public Groupbuilderv3LdapConfig bindGroupId(Integer bindGroupId) {
    this.bindGroupId = bindGroupId;
    return this;
  }

   /**
   * ID of the group whose members are used as bind values for parameterize filter.
   * @return bindGroupId
  **/
  @javax.annotation.Nullable
  public Integer getBindGroupId() {
    return bindGroupId;
  }

  public void setBindGroupId(Integer bindGroupId) {
    this.bindGroupId = bindGroupId;
  }


  public Groupbuilderv3LdapConfig bindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

   /**
   * Password for binding to LDAP if bind ID is set for ICP LDAP definition.
   * @return bindPassword
  **/
  @javax.annotation.Nullable
  public String getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
  }


  public Groupbuilderv3LdapConfig clearGroup(Boolean clearGroup) {
    this.clearGroup = clearGroup;
    return this;
  }

   /**
   * Flag indicating whether new data is replacing old data or is appended to it.
   * @return clearGroup
  **/
  @javax.annotation.Nullable
  public Boolean getClearGroup() {
    return clearGroup;
  }

  public void setClearGroup(Boolean clearGroup) {
    this.clearGroup = clearGroup;
  }


  public Groupbuilderv3LdapConfig filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * LDAP search query to use to find objects.
   * @return filter
  **/
  @javax.annotation.Nullable
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }


  public Groupbuilderv3LdapConfig filterScope(Integer filterScope) {
    this.filterScope = filterScope;
    return this;
  }

   /**
   * Scope of LDAP search:  sub-tree vs immediate base DN children.
   * @return filterScope
  **/
  @javax.annotation.Nullable
  public Integer getFilterScope() {
    return filterScope;
  }

  public void setFilterScope(Integer filterScope) {
    this.filterScope = filterScope;
  }


  public Groupbuilderv3LdapConfig importLimit(Integer importLimit) {
    this.importLimit = importLimit;
    return this;
  }

   /**
   * Maximum number of objects to import.
   * @return importLimit
  **/
  @javax.annotation.Nullable
  public Integer getImportLimit() {
    return importLimit;
  }

  public void setImportLimit(Integer importLimit) {
    this.importLimit = importLimit;
  }


  public Groupbuilderv3LdapConfig ldapGroupName(String ldapGroupName) {
    this.ldapGroupName = ldapGroupName;
    return this;
  }

   /**
   * DN name of the LDAP group to get members from.  Alternative to explicit filter.
   * @return ldapGroupName
  **/
  @javax.annotation.Nullable
  public String getLdapGroupName() {
    return ldapGroupName;
  }

  public void setLdapGroupName(String ldapGroupName) {
    this.ldapGroupName = ldapGroupName;
  }


  public Groupbuilderv3LdapConfig ldapId(String ldapId) {
    this.ldapId = ldapId;
    return this;
  }

   /**
   * ID of the ICP LDAP definition from which to import.
   * @return ldapId
  **/
  @javax.annotation.Nullable
  public String getLdapId() {
    return ldapId;
  }

  public void setLdapId(String ldapId) {
    this.ldapId = ldapId;
  }


  public Groupbuilderv3LdapConfig memberPrefix(String memberPrefix) {
    this.memberPrefix = memberPrefix;
    return this;
  }

   /**
   * Prefix that will be added to each imported member.
   * @return memberPrefix
  **/
  @javax.annotation.Nullable
  public String getMemberPrefix() {
    return memberPrefix;
  }

  public void setMemberPrefix(String memberPrefix) {
    this.memberPrefix = memberPrefix;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groupbuilderv3LdapConfig groupbuilderv3LdapConfig = (Groupbuilderv3LdapConfig) o;
    return Objects.equals(this.attributes, groupbuilderv3LdapConfig.attributes) &&
        Objects.equals(this.bindGroupId, groupbuilderv3LdapConfig.bindGroupId) &&
        Objects.equals(this.bindPassword, groupbuilderv3LdapConfig.bindPassword) &&
        Objects.equals(this.clearGroup, groupbuilderv3LdapConfig.clearGroup) &&
        Objects.equals(this.filter, groupbuilderv3LdapConfig.filter) &&
        Objects.equals(this.filterScope, groupbuilderv3LdapConfig.filterScope) &&
        Objects.equals(this.importLimit, groupbuilderv3LdapConfig.importLimit) &&
        Objects.equals(this.ldapGroupName, groupbuilderv3LdapConfig.ldapGroupName) &&
        Objects.equals(this.ldapId, groupbuilderv3LdapConfig.ldapId) &&
        Objects.equals(this.memberPrefix, groupbuilderv3LdapConfig.memberPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, bindGroupId, bindPassword, clearGroup, filter, filterScope, importLimit, ldapGroupName, ldapId, memberPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3LdapConfig {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    bindGroupId: ").append(toIndentedString(bindGroupId)).append("\n");
    sb.append("    bindPassword: ").append(toIndentedString(bindPassword)).append("\n");
    sb.append("    clearGroup: ").append(toIndentedString(clearGroup)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    filterScope: ").append(toIndentedString(filterScope)).append("\n");
    sb.append("    importLimit: ").append(toIndentedString(importLimit)).append("\n");
    sb.append("    ldapGroupName: ").append(toIndentedString(ldapGroupName)).append("\n");
    sb.append("    ldapId: ").append(toIndentedString(ldapId)).append("\n");
    sb.append("    memberPrefix: ").append(toIndentedString(memberPrefix)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("bind_group_id");
    openapiFields.add("bind_password");
    openapiFields.add("clear_group");
    openapiFields.add("filter");
    openapiFields.add("filter_scope");
    openapiFields.add("import_limit");
    openapiFields.add("ldap_group_name");
    openapiFields.add("ldap_id");
    openapiFields.add("member_prefix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3LdapConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3LdapConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3LdapConfig is not found in the empty JSON string", Groupbuilderv3LdapConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3LdapConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3LdapConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull() && !jsonObj.get("attributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
      }
      if ((jsonObj.get("bind_password") != null && !jsonObj.get("bind_password").isJsonNull()) && !jsonObj.get("bind_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_password").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if ((jsonObj.get("ldap_group_name") != null && !jsonObj.get("ldap_group_name").isJsonNull()) && !jsonObj.get("ldap_group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_group_name").toString()));
      }
      if ((jsonObj.get("ldap_id") != null && !jsonObj.get("ldap_id").isJsonNull()) && !jsonObj.get("ldap_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_id").toString()));
      }
      if ((jsonObj.get("member_prefix") != null && !jsonObj.get("member_prefix").isJsonNull()) && !jsonObj.get("member_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_prefix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3LdapConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3LdapConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3LdapConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3LdapConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3LdapConfig>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3LdapConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3LdapConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3LdapConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3LdapConfig
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3LdapConfig
  */
  public static Groupbuilderv3LdapConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3LdapConfig.class);
  }

 /**
  * Convert an instance of Groupbuilderv3LdapConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

