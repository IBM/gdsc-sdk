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
import com.ibm.gdsc.sdk.models.Tenantuserv3User;
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
 * PostUsersResponse message for Get v3/users api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Tenantuserv3GetUsersResponse {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<Tenantuserv3User> users = new ArrayList<>();

  public Tenantuserv3GetUsersResponse() {
  }

  public Tenantuserv3GetUsersResponse users(List<Tenantuserv3User> users) {
    this.users = users;
    return this;
  }

  public Tenantuserv3GetUsersResponse addUsersItem(Tenantuserv3User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users.
   * @return users
  **/
  @javax.annotation.Nullable
  public List<Tenantuserv3User> getUsers() {
    return users;
  }

  public void setUsers(List<Tenantuserv3User> users) {
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
    Tenantuserv3GetUsersResponse tenantuserv3GetUsersResponse = (Tenantuserv3GetUsersResponse) o;
    return Objects.equals(this.users, tenantuserv3GetUsersResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3GetUsersResponse {\n");
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
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3GetUsersResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3GetUsersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3GetUsersResponse is not found in the empty JSON string", Tenantuserv3GetUsersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3GetUsersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3GetUsersResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            Tenantuserv3User.validateJsonElement(jsonArrayusers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3GetUsersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3GetUsersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3GetUsersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3GetUsersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3GetUsersResponse>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3GetUsersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3GetUsersResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3GetUsersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3GetUsersResponse
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3GetUsersResponse
  */
  public static Tenantuserv3GetUsersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3GetUsersResponse.class);
  }

 /**
  * Convert an instance of Tenantuserv3GetUsersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

