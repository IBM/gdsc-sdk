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
import com.ibm.security.guardium.Riskanalyticsenginev3DatabaseSourceField;
import com.ibm.security.guardium.Riskanalyticsenginev3PivotType;
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

import com.ibm.security.JSON;

/**
 * Pivot is the subject of the lead / risk.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsenginev3Pivot {
  public static final String SERIALIZED_NAME_DATABASE = "database";
  @SerializedName(SERIALIZED_NAME_DATABASE)
  private String database;

  public static final String SERIALIZED_NAME_DATABASE_SOURCE_FIELD = "database_source_field";
  @SerializedName(SERIALIZED_NAME_DATABASE_SOURCE_FIELD)
  private Riskanalyticsenginev3DatabaseSourceField databaseSourceField = Riskanalyticsenginev3DatabaseSourceField.UNDEFINED;

  public static final String SERIALIZED_NAME_DB_USER = "db_user";
  @SerializedName(SERIALIZED_NAME_DB_USER)
  private String dbUser;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OS_USER = "os_user";
  @SerializedName(SERIALIZED_NAME_OS_USER)
  private String osUser;

  public static final String SERIALIZED_NAME_SERVER_IP = "server_ip";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Riskanalyticsenginev3PivotType type = Riskanalyticsenginev3PivotType.UNDEFINED_PIVOT_TYPE;

  public Riskanalyticsenginev3Pivot() {
  }

  public Riskanalyticsenginev3Pivot database(String database) {
    this.database = database;
    return this;
  }

   /**
   * Optional database - if pivot is db user / database.
   * @return database
  **/
  @javax.annotation.Nullable
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }


  public Riskanalyticsenginev3Pivot databaseSourceField(Riskanalyticsenginev3DatabaseSourceField databaseSourceField) {
    this.databaseSourceField = databaseSourceField;
    return this;
  }

   /**
   * Get databaseSourceField
   * @return databaseSourceField
  **/
  @javax.annotation.Nullable
  public Riskanalyticsenginev3DatabaseSourceField getDatabaseSourceField() {
    return databaseSourceField;
  }

  public void setDatabaseSourceField(Riskanalyticsenginev3DatabaseSourceField databaseSourceField) {
    this.databaseSourceField = databaseSourceField;
  }


  public Riskanalyticsenginev3Pivot dbUser(String dbUser) {
    this.dbUser = dbUser;
    return this;
  }

   /**
   * Optional db_user - if pivot is db user.
   * @return dbUser
  **/
  @javax.annotation.Nullable
  public String getDbUser() {
    return dbUser;
  }

  public void setDbUser(String dbUser) {
    this.dbUser = dbUser;
  }


  public Riskanalyticsenginev3Pivot id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Pivot id -  all pivot fields separated by semicolon.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Riskanalyticsenginev3Pivot osUser(String osUser) {
    this.osUser = osUser;
    return this;
  }

   /**
   * Optional os_user - if pivot is os user.
   * @return osUser
  **/
  @javax.annotation.Nullable
  public String getOsUser() {
    return osUser;
  }

  public void setOsUser(String osUser) {
    this.osUser = osUser;
  }


  public Riskanalyticsenginev3Pivot serverIp(String serverIp) {
    this.serverIp = serverIp;
    return this;
  }

   /**
   * Optional server_ip - if pivot is db user / database.
   * @return serverIp
  **/
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }

  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
  }


  public Riskanalyticsenginev3Pivot type(Riskanalyticsenginev3PivotType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Riskanalyticsenginev3PivotType getType() {
    return type;
  }

  public void setType(Riskanalyticsenginev3PivotType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsenginev3Pivot riskanalyticsenginev3Pivot = (Riskanalyticsenginev3Pivot) o;
    return Objects.equals(this.database, riskanalyticsenginev3Pivot.database) &&
        Objects.equals(this.databaseSourceField, riskanalyticsenginev3Pivot.databaseSourceField) &&
        Objects.equals(this.dbUser, riskanalyticsenginev3Pivot.dbUser) &&
        Objects.equals(this.id, riskanalyticsenginev3Pivot.id) &&
        Objects.equals(this.osUser, riskanalyticsenginev3Pivot.osUser) &&
        Objects.equals(this.serverIp, riskanalyticsenginev3Pivot.serverIp) &&
        Objects.equals(this.type, riskanalyticsenginev3Pivot.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, databaseSourceField, dbUser, id, osUser, serverIp, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsenginev3Pivot {\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    databaseSourceField: ").append(toIndentedString(databaseSourceField)).append("\n");
    sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    osUser: ").append(toIndentedString(osUser)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("database");
    openapiFields.add("database_source_field");
    openapiFields.add("db_user");
    openapiFields.add("id");
    openapiFields.add("os_user");
    openapiFields.add("server_ip");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsenginev3Pivot
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsenginev3Pivot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsenginev3Pivot is not found in the empty JSON string", Riskanalyticsenginev3Pivot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsenginev3Pivot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsenginev3Pivot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("database") != null && !jsonObj.get("database").isJsonNull()) && !jsonObj.get("database").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database").toString()));
      }
      // validate the optional field `database_source_field`
      if (jsonObj.get("database_source_field") != null && !jsonObj.get("database_source_field").isJsonNull()) {
        Riskanalyticsenginev3DatabaseSourceField.validateJsonElement(jsonObj.get("database_source_field"));
      }
      if ((jsonObj.get("db_user") != null && !jsonObj.get("db_user").isJsonNull()) && !jsonObj.get("db_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `db_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("db_user").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("os_user") != null && !jsonObj.get("os_user").isJsonNull()) && !jsonObj.get("os_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_user").toString()));
      }
      if ((jsonObj.get("server_ip") != null && !jsonObj.get("server_ip").isJsonNull()) && !jsonObj.get("server_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server_ip").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Riskanalyticsenginev3PivotType.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsenginev3Pivot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsenginev3Pivot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsenginev3Pivot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsenginev3Pivot.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsenginev3Pivot>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsenginev3Pivot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsenginev3Pivot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsenginev3Pivot given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsenginev3Pivot
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsenginev3Pivot
  */
  public static Riskanalyticsenginev3Pivot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsenginev3Pivot.class);
  }

 /**
  * Convert an instance of Riskanalyticsenginev3Pivot to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

