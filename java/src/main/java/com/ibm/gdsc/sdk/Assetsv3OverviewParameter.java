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
import com.ibm.gdsc.sdk.Assetsv3IpHost;
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
 * Assetsv3OverviewParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3OverviewParameter {
  public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_DB_ID = "db_id";
  @SerializedName(SERIALIZED_NAME_DB_ID)
  private String dbId;

  public static final String SERIALIZED_NAME_IP_HOST = "ip_host";
  @SerializedName(SERIALIZED_NAME_IP_HOST)
  private List<Assetsv3IpHost> ipHost = new ArrayList<>();

  public Assetsv3OverviewParameter() {
  }

  public Assetsv3OverviewParameter databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public Assetsv3OverviewParameter dbId(String dbId) {
    this.dbId = dbId;
    return this;
  }

   /**
   * Get dbId
   * @return dbId
  **/
  @javax.annotation.Nullable
  public String getDbId() {
    return dbId;
  }

  public void setDbId(String dbId) {
    this.dbId = dbId;
  }


  public Assetsv3OverviewParameter ipHost(List<Assetsv3IpHost> ipHost) {
    this.ipHost = ipHost;
    return this;
  }

  public Assetsv3OverviewParameter addIpHostItem(Assetsv3IpHost ipHostItem) {
    if (this.ipHost == null) {
      this.ipHost = new ArrayList<>();
    }
    this.ipHost.add(ipHostItem);
    return this;
  }

   /**
   * IP addresses and hosts associated with each.
   * @return ipHost
  **/
  @javax.annotation.Nullable
  public List<Assetsv3IpHost> getIpHost() {
    return ipHost;
  }

  public void setIpHost(List<Assetsv3IpHost> ipHost) {
    this.ipHost = ipHost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3OverviewParameter assetsv3OverviewParameter = (Assetsv3OverviewParameter) o;
    return Objects.equals(this.databaseName, assetsv3OverviewParameter.databaseName) &&
        Objects.equals(this.dbId, assetsv3OverviewParameter.dbId) &&
        Objects.equals(this.ipHost, assetsv3OverviewParameter.ipHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, dbId, ipHost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3OverviewParameter {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    ipHost: ").append(toIndentedString(ipHost)).append("\n");
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
    openapiFields.add("database_name");
    openapiFields.add("db_id");
    openapiFields.add("ip_host");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3OverviewParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3OverviewParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3OverviewParameter is not found in the empty JSON string", Assetsv3OverviewParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3OverviewParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3OverviewParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("database_name") != null && !jsonObj.get("database_name").isJsonNull()) && !jsonObj.get("database_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_name").toString()));
      }
      if ((jsonObj.get("db_id") != null && !jsonObj.get("db_id").isJsonNull()) && !jsonObj.get("db_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `db_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("db_id").toString()));
      }
      if (jsonObj.get("ip_host") != null && !jsonObj.get("ip_host").isJsonNull()) {
        JsonArray jsonArrayipHost = jsonObj.getAsJsonArray("ip_host");
        if (jsonArrayipHost != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ip_host").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ip_host` to be an array in the JSON string but got `%s`", jsonObj.get("ip_host").toString()));
          }

          // validate the optional field `ip_host` (array)
          for (int i = 0; i < jsonArrayipHost.size(); i++) {
            Assetsv3IpHost.validateJsonElement(jsonArrayipHost.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3OverviewParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3OverviewParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3OverviewParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3OverviewParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3OverviewParameter>() {
           @Override
           public void write(JsonWriter out, Assetsv3OverviewParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3OverviewParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3OverviewParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3OverviewParameter
  * @throws IOException if the JSON string is invalid with respect to Assetsv3OverviewParameter
  */
  public static Assetsv3OverviewParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3OverviewParameter.class);
  }

 /**
  * Convert an instance of Assetsv3OverviewParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

