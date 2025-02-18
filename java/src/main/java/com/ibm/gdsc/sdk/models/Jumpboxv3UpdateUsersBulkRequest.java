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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Jumpboxv3User;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * UpdateUsersBulkRequest message for Patch v3/users api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Jumpboxv3UpdateUsersBulkRequest {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_METADATA_ONLY = "metadata_only";
  @SerializedName(SERIALIZED_NAME_METADATA_ONLY)
  private Boolean metadataOnly;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<Jumpboxv3User> users = new ArrayList<>();

  public Jumpboxv3UpdateUsersBulkRequest() {
  }

  public Jumpboxv3UpdateUsersBulkRequest action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public Jumpboxv3UpdateUsersBulkRequest metadataOnly(Boolean metadataOnly) {
    this.metadataOnly = metadataOnly;
    return this;
  }

   /**
   * Boolean to update metadata only or not.
   * @return metadataOnly
  **/
  @javax.annotation.Nullable
  public Boolean getMetadataOnly() {
    return metadataOnly;
  }

  public void setMetadataOnly(Boolean metadataOnly) {
    this.metadataOnly = metadataOnly;
  }


  public Jumpboxv3UpdateUsersBulkRequest users(List<Jumpboxv3User> users) {
    this.users = users;
    return this;
  }

  public Jumpboxv3UpdateUsersBulkRequest addUsersItem(Jumpboxv3User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users to get updated.
   * @return users
  **/
  @javax.annotation.Nullable
  public List<Jumpboxv3User> getUsers() {
    return users;
  }

  public void setUsers(List<Jumpboxv3User> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jumpboxv3UpdateUsersBulkRequest jumpboxv3UpdateUsersBulkRequest = (Jumpboxv3UpdateUsersBulkRequest) o;
    return Objects.equals(this.action, jumpboxv3UpdateUsersBulkRequest.action) &&
        Objects.equals(this.metadataOnly, jumpboxv3UpdateUsersBulkRequest.metadataOnly) &&
        Objects.equals(this.users, jumpboxv3UpdateUsersBulkRequest.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, metadataOnly, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jumpboxv3UpdateUsersBulkRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    metadataOnly: ").append(toIndentedString(metadataOnly)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("metadata_only");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Jumpboxv3UpdateUsersBulkRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jumpboxv3UpdateUsersBulkRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jumpboxv3UpdateUsersBulkRequest is not found in the empty JSON string", Jumpboxv3UpdateUsersBulkRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jumpboxv3UpdateUsersBulkRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jumpboxv3UpdateUsersBulkRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            Jumpboxv3User.validateJsonElement(jsonArrayusers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jumpboxv3UpdateUsersBulkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jumpboxv3UpdateUsersBulkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jumpboxv3UpdateUsersBulkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jumpboxv3UpdateUsersBulkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Jumpboxv3UpdateUsersBulkRequest>() {
           @Override
           public void write(JsonWriter out, Jumpboxv3UpdateUsersBulkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jumpboxv3UpdateUsersBulkRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jumpboxv3UpdateUsersBulkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jumpboxv3UpdateUsersBulkRequest
  * @throws IOException if the JSON string is invalid with respect to Jumpboxv3UpdateUsersBulkRequest
  */
  public static Jumpboxv3UpdateUsersBulkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jumpboxv3UpdateUsersBulkRequest.class);
  }

 /**
  * Convert an instance of Jumpboxv3UpdateUsersBulkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

