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
import com.ibm.gdsc.sdk.Tenantuserv3Privilege;
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
 * Tenantuserv3PostPrivilegesBulkRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3PostPrivilegesBulkRequest {
  public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";
  @SerializedName(SERIALIZED_NAME_PRIVILEGES)
  private List<Tenantuserv3Privilege> privileges = new ArrayList<>();

  public Tenantuserv3PostPrivilegesBulkRequest() {
  }

  public Tenantuserv3PostPrivilegesBulkRequest privileges(List<Tenantuserv3Privilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  public Tenantuserv3PostPrivilegesBulkRequest addPrivilegesItem(Tenantuserv3Privilege privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Array of privileges to be created. Use for bulk import of groups, datasources, etc.
   * @return privileges
  **/
  @javax.annotation.Nullable
  public List<Tenantuserv3Privilege> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<Tenantuserv3Privilege> privileges) {
    this.privileges = privileges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenantuserv3PostPrivilegesBulkRequest tenantuserv3PostPrivilegesBulkRequest = (Tenantuserv3PostPrivilegesBulkRequest) o;
    return Objects.equals(this.privileges, tenantuserv3PostPrivilegesBulkRequest.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privileges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3PostPrivilegesBulkRequest {\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
    openapiFields.add("privileges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3PostPrivilegesBulkRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3PostPrivilegesBulkRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3PostPrivilegesBulkRequest is not found in the empty JSON string", Tenantuserv3PostPrivilegesBulkRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3PostPrivilegesBulkRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3PostPrivilegesBulkRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("privileges") != null && !jsonObj.get("privileges").isJsonNull()) {
        JsonArray jsonArrayprivileges = jsonObj.getAsJsonArray("privileges");
        if (jsonArrayprivileges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("privileges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `privileges` to be an array in the JSON string but got `%s`", jsonObj.get("privileges").toString()));
          }

          // validate the optional field `privileges` (array)
          for (int i = 0; i < jsonArrayprivileges.size(); i++) {
            Tenantuserv3Privilege.validateJsonElement(jsonArrayprivileges.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3PostPrivilegesBulkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3PostPrivilegesBulkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3PostPrivilegesBulkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3PostPrivilegesBulkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3PostPrivilegesBulkRequest>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3PostPrivilegesBulkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3PostPrivilegesBulkRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3PostPrivilegesBulkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3PostPrivilegesBulkRequest
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3PostPrivilegesBulkRequest
  */
  public static Tenantuserv3PostPrivilegesBulkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3PostPrivilegesBulkRequest.class);
  }

 /**
  * Convert an instance of Tenantuserv3PostPrivilegesBulkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

