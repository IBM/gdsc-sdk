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
 * Guardiumconnectorv3Datamarts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3Datamarts {
  public static final String SERIALIZED_NAME_DM = "dm";
  @SerializedName(SERIALIZED_NAME_DM)
  private String dm;

  public static final String SERIALIZED_NAME_DM_CURRENT_TYPE = "dm_current_type";
  @SerializedName(SERIALIZED_NAME_DM_CURRENT_TYPE)
  private String dmCurrentType;

  public static final String SERIALIZED_NAME_DM_DEFAULT_TYPE = "dm_default_type";
  @SerializedName(SERIALIZED_NAME_DM_DEFAULT_TYPE)
  private String dmDefaultType;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_UNIT_TYPES = "unit_types";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPES)
  private String unitTypes;

  public Guardiumconnectorv3Datamarts() {
  }

  public Guardiumconnectorv3Datamarts dm(String dm) {
    this.dm = dm;
    return this;
  }

   /**
   * Get dm
   * @return dm
  **/
  @javax.annotation.Nullable
  public String getDm() {
    return dm;
  }

  public void setDm(String dm) {
    this.dm = dm;
  }


  public Guardiumconnectorv3Datamarts dmCurrentType(String dmCurrentType) {
    this.dmCurrentType = dmCurrentType;
    return this;
  }

   /**
   * Get dmCurrentType
   * @return dmCurrentType
  **/
  @javax.annotation.Nullable
  public String getDmCurrentType() {
    return dmCurrentType;
  }

  public void setDmCurrentType(String dmCurrentType) {
    this.dmCurrentType = dmCurrentType;
  }


  public Guardiumconnectorv3Datamarts dmDefaultType(String dmDefaultType) {
    this.dmDefaultType = dmDefaultType;
    return this;
  }

   /**
   * Get dmDefaultType
   * @return dmDefaultType
  **/
  @javax.annotation.Nullable
  public String getDmDefaultType() {
    return dmDefaultType;
  }

  public void setDmDefaultType(String dmDefaultType) {
    this.dmDefaultType = dmDefaultType;
  }


  public Guardiumconnectorv3Datamarts schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public Guardiumconnectorv3Datamarts unitTypes(String unitTypes) {
    this.unitTypes = unitTypes;
    return this;
  }

   /**
   * Get unitTypes
   * @return unitTypes
  **/
  @javax.annotation.Nullable
  public String getUnitTypes() {
    return unitTypes;
  }

  public void setUnitTypes(String unitTypes) {
    this.unitTypes = unitTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3Datamarts guardiumconnectorv3Datamarts = (Guardiumconnectorv3Datamarts) o;
    return Objects.equals(this.dm, guardiumconnectorv3Datamarts.dm) &&
        Objects.equals(this.dmCurrentType, guardiumconnectorv3Datamarts.dmCurrentType) &&
        Objects.equals(this.dmDefaultType, guardiumconnectorv3Datamarts.dmDefaultType) &&
        Objects.equals(this.schedule, guardiumconnectorv3Datamarts.schedule) &&
        Objects.equals(this.unitTypes, guardiumconnectorv3Datamarts.unitTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dm, dmCurrentType, dmDefaultType, schedule, unitTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3Datamarts {\n");
    sb.append("    dm: ").append(toIndentedString(dm)).append("\n");
    sb.append("    dmCurrentType: ").append(toIndentedString(dmCurrentType)).append("\n");
    sb.append("    dmDefaultType: ").append(toIndentedString(dmDefaultType)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    unitTypes: ").append(toIndentedString(unitTypes)).append("\n");
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
    openapiFields.add("dm");
    openapiFields.add("dm_current_type");
    openapiFields.add("dm_default_type");
    openapiFields.add("schedule");
    openapiFields.add("unit_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3Datamarts
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3Datamarts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3Datamarts is not found in the empty JSON string", Guardiumconnectorv3Datamarts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3Datamarts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3Datamarts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dm") != null && !jsonObj.get("dm").isJsonNull()) && !jsonObj.get("dm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dm").toString()));
      }
      if ((jsonObj.get("dm_current_type") != null && !jsonObj.get("dm_current_type").isJsonNull()) && !jsonObj.get("dm_current_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dm_current_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dm_current_type").toString()));
      }
      if ((jsonObj.get("dm_default_type") != null && !jsonObj.get("dm_default_type").isJsonNull()) && !jsonObj.get("dm_default_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dm_default_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dm_default_type").toString()));
      }
      if ((jsonObj.get("schedule") != null && !jsonObj.get("schedule").isJsonNull()) && !jsonObj.get("schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule").toString()));
      }
      if ((jsonObj.get("unit_types") != null && !jsonObj.get("unit_types").isJsonNull()) && !jsonObj.get("unit_types").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_types` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3Datamarts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3Datamarts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3Datamarts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3Datamarts.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3Datamarts>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3Datamarts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3Datamarts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3Datamarts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3Datamarts
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3Datamarts
  */
  public static Guardiumconnectorv3Datamarts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3Datamarts.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3Datamarts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

