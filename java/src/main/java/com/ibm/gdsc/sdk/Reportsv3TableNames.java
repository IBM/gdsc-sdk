/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
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
 * Reportsv3TableNames
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3TableNames {
  public static final String SERIALIZED_NAME_TABLE_NAMES = "table_names";
  @SerializedName(SERIALIZED_NAME_TABLE_NAMES)
  private List<String> tableNames = new ArrayList<>();

  public Reportsv3TableNames() {
  }

  public Reportsv3TableNames tableNames(List<String> tableNames) {
    this.tableNames = tableNames;
    return this;
  }

  public Reportsv3TableNames addTableNamesItem(String tableNamesItem) {
    if (this.tableNames == null) {
      this.tableNames = new ArrayList<>();
    }
    this.tableNames.add(tableNamesItem);
    return this;
  }

   /**
   * Get tableNames
   * @return tableNames
  **/
  @javax.annotation.Nullable
  public List<String> getTableNames() {
    return tableNames;
  }

  public void setTableNames(List<String> tableNames) {
    this.tableNames = tableNames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3TableNames reportsv3TableNames = (Reportsv3TableNames) o;
    return Objects.equals(this.tableNames, reportsv3TableNames.tableNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3TableNames {\n");
    sb.append("    tableNames: ").append(toIndentedString(tableNames)).append("\n");
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
    openapiFields.add("table_names");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3TableNames
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3TableNames.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3TableNames is not found in the empty JSON string", Reportsv3TableNames.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3TableNames.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3TableNames` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("table_names") != null && !jsonObj.get("table_names").isJsonNull() && !jsonObj.get("table_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_names` to be an array in the JSON string but got `%s`", jsonObj.get("table_names").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3TableNames.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3TableNames' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3TableNames> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3TableNames.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3TableNames>() {
           @Override
           public void write(JsonWriter out, Reportsv3TableNames value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3TableNames read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3TableNames given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3TableNames
  * @throws IOException if the JSON string is invalid with respect to Reportsv3TableNames
  */
  public static Reportsv3TableNames fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3TableNames.class);
  }

 /**
  * Convert an instance of Reportsv3TableNames to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

