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
import java.util.Arrays;

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
 * Connection string for database.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3DatabaseConnectionStringRequest {
  public static final String SERIALIZED_NAME_DBHOST = "dbhost";
  @SerializedName(SERIALIZED_NAME_DBHOST)
  private String dbhost;

  public static final String SERIALIZED_NAME_DBNAME = "dbname";
  @SerializedName(SERIALIZED_NAME_DBNAME)
  private String dbname;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public Guardiumconnectorv3DatabaseConnectionStringRequest() {
  }

  public Guardiumconnectorv3DatabaseConnectionStringRequest dbhost(String dbhost) {
    this.dbhost = dbhost;
    return this;
  }

   /**
   * Database host.
   * @return dbhost
  **/
  @javax.annotation.Nullable
  public String getDbhost() {
    return dbhost;
  }

  public void setDbhost(String dbhost) {
    this.dbhost = dbhost;
  }


  public Guardiumconnectorv3DatabaseConnectionStringRequest dbname(String dbname) {
    this.dbname = dbname;
    return this;
  }

   /**
   * Database name.
   * @return dbname
  **/
  @javax.annotation.Nullable
  public String getDbname() {
    return dbname;
  }

  public void setDbname(String dbname) {
    this.dbname = dbname;
  }


  public Guardiumconnectorv3DatabaseConnectionStringRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Database password.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public Guardiumconnectorv3DatabaseConnectionStringRequest port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Database port.
   * @return port
  **/
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public Guardiumconnectorv3DatabaseConnectionStringRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Database user.
   * @return user
  **/
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3DatabaseConnectionStringRequest guardiumconnectorv3DatabaseConnectionStringRequest = (Guardiumconnectorv3DatabaseConnectionStringRequest) o;
    return Objects.equals(this.dbhost, guardiumconnectorv3DatabaseConnectionStringRequest.dbhost) &&
        Objects.equals(this.dbname, guardiumconnectorv3DatabaseConnectionStringRequest.dbname) &&
        Objects.equals(this.password, guardiumconnectorv3DatabaseConnectionStringRequest.password) &&
        Objects.equals(this.port, guardiumconnectorv3DatabaseConnectionStringRequest.port) &&
        Objects.equals(this.user, guardiumconnectorv3DatabaseConnectionStringRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbhost, dbname, password, port, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3DatabaseConnectionStringRequest {\n");
    sb.append("    dbhost: ").append(toIndentedString(dbhost)).append("\n");
    sb.append("    dbname: ").append(toIndentedString(dbname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("dbhost");
    openapiFields.add("dbname");
    openapiFields.add("password");
    openapiFields.add("port");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3DatabaseConnectionStringRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3DatabaseConnectionStringRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3DatabaseConnectionStringRequest is not found in the empty JSON string", Guardiumconnectorv3DatabaseConnectionStringRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3DatabaseConnectionStringRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3DatabaseConnectionStringRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dbhost") != null && !jsonObj.get("dbhost").isJsonNull()) && !jsonObj.get("dbhost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbhost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbhost").toString()));
      }
      if ((jsonObj.get("dbname") != null && !jsonObj.get("dbname").isJsonNull()) && !jsonObj.get("dbname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbname").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3DatabaseConnectionStringRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3DatabaseConnectionStringRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3DatabaseConnectionStringRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3DatabaseConnectionStringRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3DatabaseConnectionStringRequest>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3DatabaseConnectionStringRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3DatabaseConnectionStringRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3DatabaseConnectionStringRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3DatabaseConnectionStringRequest
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3DatabaseConnectionStringRequest
  */
  public static Guardiumconnectorv3DatabaseConnectionStringRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3DatabaseConnectionStringRequest.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3DatabaseConnectionStringRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

