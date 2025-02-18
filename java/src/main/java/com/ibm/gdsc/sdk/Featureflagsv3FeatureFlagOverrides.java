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
 * FeatureFlagOverrides feature flag model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Featureflagsv3FeatureFlagOverrides {
  public static final String SERIALIZED_NAME_FLAG_NAME = "flag_name";
  @SerializedName(SERIALIZED_NAME_FLAG_NAME)
  private String flagName;

  public static final String SERIALIZED_NAME_HIGH_PRIORITY = "high_priority";
  @SerializedName(SERIALIZED_NAME_HIGH_PRIORITY)
  private Boolean highPriority;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Featureflagsv3FeatureFlagOverrides() {
  }

  public Featureflagsv3FeatureFlagOverrides flagName(String flagName) {
    this.flagName = flagName;
    return this;
  }

   /**
   * Feature flag name.
   * @return flagName
  **/
  @javax.annotation.Nullable
  public String getFlagName() {
    return flagName;
  }

  public void setFlagName(String flagName) {
    this.flagName = flagName;
  }


  public Featureflagsv3FeatureFlagOverrides highPriority(Boolean highPriority) {
    this.highPriority = highPriority;
    return this;
  }

   /**
   * Optional: high priority.
   * @return highPriority
  **/
  @javax.annotation.Nullable
  public Boolean getHighPriority() {
    return highPriority;
  }

  public void setHighPriority(Boolean highPriority) {
    this.highPriority = highPriority;
  }


  public Featureflagsv3FeatureFlagOverrides isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Feature flag enabled or not.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public Featureflagsv3FeatureFlagOverrides value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Optional: additional value for the feature flag.
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Featureflagsv3FeatureFlagOverrides featureflagsv3FeatureFlagOverrides = (Featureflagsv3FeatureFlagOverrides) o;
    return Objects.equals(this.flagName, featureflagsv3FeatureFlagOverrides.flagName) &&
        Objects.equals(this.highPriority, featureflagsv3FeatureFlagOverrides.highPriority) &&
        Objects.equals(this.isEnabled, featureflagsv3FeatureFlagOverrides.isEnabled) &&
        Objects.equals(this.value, featureflagsv3FeatureFlagOverrides.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagName, highPriority, isEnabled, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Featureflagsv3FeatureFlagOverrides {\n");
    sb.append("    flagName: ").append(toIndentedString(flagName)).append("\n");
    sb.append("    highPriority: ").append(toIndentedString(highPriority)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("flag_name");
    openapiFields.add("high_priority");
    openapiFields.add("is_enabled");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Featureflagsv3FeatureFlagOverrides
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Featureflagsv3FeatureFlagOverrides.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Featureflagsv3FeatureFlagOverrides is not found in the empty JSON string", Featureflagsv3FeatureFlagOverrides.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Featureflagsv3FeatureFlagOverrides.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Featureflagsv3FeatureFlagOverrides` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("flag_name") != null && !jsonObj.get("flag_name").isJsonNull()) && !jsonObj.get("flag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flag_name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Featureflagsv3FeatureFlagOverrides.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Featureflagsv3FeatureFlagOverrides' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Featureflagsv3FeatureFlagOverrides> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Featureflagsv3FeatureFlagOverrides.class));

       return (TypeAdapter<T>) new TypeAdapter<Featureflagsv3FeatureFlagOverrides>() {
           @Override
           public void write(JsonWriter out, Featureflagsv3FeatureFlagOverrides value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Featureflagsv3FeatureFlagOverrides read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Featureflagsv3FeatureFlagOverrides given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Featureflagsv3FeatureFlagOverrides
  * @throws IOException if the JSON string is invalid with respect to Featureflagsv3FeatureFlagOverrides
  */
  public static Featureflagsv3FeatureFlagOverrides fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Featureflagsv3FeatureFlagOverrides.class);
  }

 /**
  * Convert an instance of Featureflagsv3FeatureFlagOverrides to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

