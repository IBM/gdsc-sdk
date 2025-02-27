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
import com.ibm.security.guardium.Complianceacceleratorv3AuditConfig;
import com.ibm.security.guardium.Complianceacceleratorv3DashboardObject;
import com.ibm.security.guardium.Complianceacceleratorv3Group;
import com.ibm.security.guardium.Complianceacceleratorv3Reports;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Complianceacceleratorv3Workspace
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3Workspace {
  public static final String SERIALIZED_NAME_AUDIT_INFO = "audit_info";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private Complianceacceleratorv3AuditConfig auditInfo;

  public static final String SERIALIZED_NAME_DASHBOARDS = "dashboards";
  @SerializedName(SERIALIZED_NAME_DASHBOARDS)
  private List<Complianceacceleratorv3DashboardObject> dashboards = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Map<String, Complianceacceleratorv3Group> groups = new HashMap<>();

  public static final String SERIALIZED_NAME_REPORTS_MAP = "reports_map";
  @SerializedName(SERIALIZED_NAME_REPORTS_MAP)
  private Map<String, Complianceacceleratorv3Reports> reportsMap = new HashMap<>();

  public Complianceacceleratorv3Workspace() {
  }

  public Complianceacceleratorv3Workspace auditInfo(Complianceacceleratorv3AuditConfig auditInfo) {
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  public Complianceacceleratorv3AuditConfig getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(Complianceacceleratorv3AuditConfig auditInfo) {
    this.auditInfo = auditInfo;
  }


  public Complianceacceleratorv3Workspace dashboards(List<Complianceacceleratorv3DashboardObject> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public Complianceacceleratorv3Workspace addDashboardsItem(Complianceacceleratorv3DashboardObject dashboardsItem) {
    if (this.dashboards == null) {
      this.dashboards = new ArrayList<>();
    }
    this.dashboards.add(dashboardsItem);
    return this;
  }

   /**
   * Get dashboards
   * @return dashboards
  **/
  @javax.annotation.Nullable
  public List<Complianceacceleratorv3DashboardObject> getDashboards() {
    return dashboards;
  }

  public void setDashboards(List<Complianceacceleratorv3DashboardObject> dashboards) {
    this.dashboards = dashboards;
  }


  public Complianceacceleratorv3Workspace groups(Map<String, Complianceacceleratorv3Group> groups) {
    this.groups = groups;
    return this;
  }

  public Complianceacceleratorv3Workspace putGroupsItem(String key, Complianceacceleratorv3Group groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

   /**
   * Groups for the policies and reports.
   * @return groups
  **/
  @javax.annotation.Nullable
  public Map<String, Complianceacceleratorv3Group> getGroups() {
    return groups;
  }

  public void setGroups(Map<String, Complianceacceleratorv3Group> groups) {
    this.groups = groups;
  }


  public Complianceacceleratorv3Workspace reportsMap(Map<String, Complianceacceleratorv3Reports> reportsMap) {
    this.reportsMap = reportsMap;
    return this;
  }

  public Complianceacceleratorv3Workspace putReportsMapItem(String key, Complianceacceleratorv3Reports reportsMapItem) {
    if (this.reportsMap == null) {
      this.reportsMap = new HashMap<>();
    }
    this.reportsMap.put(key, reportsMapItem);
    return this;
  }

   /**
   * List of reports with basic info.
   * @return reportsMap
  **/
  @javax.annotation.Nullable
  public Map<String, Complianceacceleratorv3Reports> getReportsMap() {
    return reportsMap;
  }

  public void setReportsMap(Map<String, Complianceacceleratorv3Reports> reportsMap) {
    this.reportsMap = reportsMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3Workspace complianceacceleratorv3Workspace = (Complianceacceleratorv3Workspace) o;
    return Objects.equals(this.auditInfo, complianceacceleratorv3Workspace.auditInfo) &&
        Objects.equals(this.dashboards, complianceacceleratorv3Workspace.dashboards) &&
        Objects.equals(this.groups, complianceacceleratorv3Workspace.groups) &&
        Objects.equals(this.reportsMap, complianceacceleratorv3Workspace.reportsMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, dashboards, groups, reportsMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3Workspace {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    reportsMap: ").append(toIndentedString(reportsMap)).append("\n");
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
    openapiFields.add("audit_info");
    openapiFields.add("dashboards");
    openapiFields.add("groups");
    openapiFields.add("reports_map");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3Workspace
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3Workspace.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3Workspace is not found in the empty JSON string", Complianceacceleratorv3Workspace.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3Workspace.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3Workspace` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `audit_info`
      if (jsonObj.get("audit_info") != null && !jsonObj.get("audit_info").isJsonNull()) {
        Complianceacceleratorv3AuditConfig.validateJsonElement(jsonObj.get("audit_info"));
      }
      if (jsonObj.get("dashboards") != null && !jsonObj.get("dashboards").isJsonNull()) {
        JsonArray jsonArraydashboards = jsonObj.getAsJsonArray("dashboards");
        if (jsonArraydashboards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dashboards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dashboards` to be an array in the JSON string but got `%s`", jsonObj.get("dashboards").toString()));
          }

          // validate the optional field `dashboards` (array)
          for (int i = 0; i < jsonArraydashboards.size(); i++) {
            Complianceacceleratorv3DashboardObject.validateJsonElement(jsonArraydashboards.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3Workspace.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3Workspace' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3Workspace> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3Workspace.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3Workspace>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3Workspace value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3Workspace read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3Workspace given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3Workspace
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3Workspace
  */
  public static Complianceacceleratorv3Workspace fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3Workspace.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3Workspace to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

