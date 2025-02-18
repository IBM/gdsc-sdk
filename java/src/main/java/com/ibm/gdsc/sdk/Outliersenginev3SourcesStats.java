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
 * Statistics about the different sources seen. Mainly related to the number of data source users.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3SourcesStats {
  public static final String SERIALIZED_NAME_DATASOURCE_AVG_USERS = "datasource_avg_users";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_AVG_USERS)
  private Integer datasourceAvgUsers;

  public static final String SERIALIZED_NAME_DATASOURCE_MAX_USERS = "datasource_max_users";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_MAX_USERS)
  private Integer datasourceMaxUsers;

  public static final String SERIALIZED_NAME_DATASOURCE_MIN_USERS = "datasource_min_users";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_MIN_USERS)
  private Integer datasourceMinUsers;

  public Outliersenginev3SourcesStats() {
  }

  public Outliersenginev3SourcesStats datasourceAvgUsers(Integer datasourceAvgUsers) {
    this.datasourceAvgUsers = datasourceAvgUsers;
    return this;
  }

   /**
   * Average users per data source, in the past 72 hours.
   * @return datasourceAvgUsers
  **/
  @javax.annotation.Nullable
  public Integer getDatasourceAvgUsers() {
    return datasourceAvgUsers;
  }

  public void setDatasourceAvgUsers(Integer datasourceAvgUsers) {
    this.datasourceAvgUsers = datasourceAvgUsers;
  }


  public Outliersenginev3SourcesStats datasourceMaxUsers(Integer datasourceMaxUsers) {
    this.datasourceMaxUsers = datasourceMaxUsers;
    return this;
  }

   /**
   * Maximum users in a single data source, in the past 72 hours.
   * @return datasourceMaxUsers
  **/
  @javax.annotation.Nullable
  public Integer getDatasourceMaxUsers() {
    return datasourceMaxUsers;
  }

  public void setDatasourceMaxUsers(Integer datasourceMaxUsers) {
    this.datasourceMaxUsers = datasourceMaxUsers;
  }


  public Outliersenginev3SourcesStats datasourceMinUsers(Integer datasourceMinUsers) {
    this.datasourceMinUsers = datasourceMinUsers;
    return this;
  }

   /**
   * Minimum users in a single data source, in the past 72 hours.
   * @return datasourceMinUsers
  **/
  @javax.annotation.Nullable
  public Integer getDatasourceMinUsers() {
    return datasourceMinUsers;
  }

  public void setDatasourceMinUsers(Integer datasourceMinUsers) {
    this.datasourceMinUsers = datasourceMinUsers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3SourcesStats outliersenginev3SourcesStats = (Outliersenginev3SourcesStats) o;
    return Objects.equals(this.datasourceAvgUsers, outliersenginev3SourcesStats.datasourceAvgUsers) &&
        Objects.equals(this.datasourceMaxUsers, outliersenginev3SourcesStats.datasourceMaxUsers) &&
        Objects.equals(this.datasourceMinUsers, outliersenginev3SourcesStats.datasourceMinUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceAvgUsers, datasourceMaxUsers, datasourceMinUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3SourcesStats {\n");
    sb.append("    datasourceAvgUsers: ").append(toIndentedString(datasourceAvgUsers)).append("\n");
    sb.append("    datasourceMaxUsers: ").append(toIndentedString(datasourceMaxUsers)).append("\n");
    sb.append("    datasourceMinUsers: ").append(toIndentedString(datasourceMinUsers)).append("\n");
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
    openapiFields.add("datasource_avg_users");
    openapiFields.add("datasource_max_users");
    openapiFields.add("datasource_min_users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3SourcesStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3SourcesStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3SourcesStats is not found in the empty JSON string", Outliersenginev3SourcesStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3SourcesStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3SourcesStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3SourcesStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3SourcesStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3SourcesStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3SourcesStats.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3SourcesStats>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3SourcesStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3SourcesStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3SourcesStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3SourcesStats
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3SourcesStats
  */
  public static Outliersenginev3SourcesStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3SourcesStats.class);
  }

 /**
  * Convert an instance of Outliersenginev3SourcesStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

