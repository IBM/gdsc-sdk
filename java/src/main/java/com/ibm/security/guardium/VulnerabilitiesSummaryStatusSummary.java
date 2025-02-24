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
import java.io.IOException;
import java.math.BigDecimal;
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
 * VulnerabilitiesSummaryStatusSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class VulnerabilitiesSummaryStatusSummary {
  public static final String SERIALIZED_NAME_RECENTLY_DISCOVERED = "recentlyDiscovered";
  @SerializedName(SERIALIZED_NAME_RECENTLY_DISCOVERED)
  private BigDecimal recentlyDiscovered;

  public static final String SERIALIZED_NAME_OPEN = "open";
  @SerializedName(SERIALIZED_NAME_OPEN)
  private BigDecimal open;

  public static final String SERIALIZED_NAME_FIXED = "fixed";
  @SerializedName(SERIALIZED_NAME_FIXED)
  private BigDecimal fixed;

  public VulnerabilitiesSummaryStatusSummary() {
  }

  public VulnerabilitiesSummaryStatusSummary recentlyDiscovered(BigDecimal recentlyDiscovered) {
    this.recentlyDiscovered = recentlyDiscovered;
    return this;
  }

   /**
   * Get recentlyDiscovered
   * @return recentlyDiscovered
  **/
  @javax.annotation.Nonnull
  public BigDecimal getRecentlyDiscovered() {
    return recentlyDiscovered;
  }

  public void setRecentlyDiscovered(BigDecimal recentlyDiscovered) {
    this.recentlyDiscovered = recentlyDiscovered;
  }


  public VulnerabilitiesSummaryStatusSummary open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @javax.annotation.Nonnull
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }


  public VulnerabilitiesSummaryStatusSummary fixed(BigDecimal fixed) {
    this.fixed = fixed;
    return this;
  }

   /**
   * Get fixed
   * @return fixed
  **/
  @javax.annotation.Nonnull
  public BigDecimal getFixed() {
    return fixed;
  }

  public void setFixed(BigDecimal fixed) {
    this.fixed = fixed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VulnerabilitiesSummaryStatusSummary vulnerabilitiesSummaryStatusSummary = (VulnerabilitiesSummaryStatusSummary) o;
    return Objects.equals(this.recentlyDiscovered, vulnerabilitiesSummaryStatusSummary.recentlyDiscovered) &&
        Objects.equals(this.open, vulnerabilitiesSummaryStatusSummary.open) &&
        Objects.equals(this.fixed, vulnerabilitiesSummaryStatusSummary.fixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recentlyDiscovered, open, fixed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VulnerabilitiesSummaryStatusSummary {\n");
    sb.append("    recentlyDiscovered: ").append(toIndentedString(recentlyDiscovered)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
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
    openapiFields.add("recentlyDiscovered");
    openapiFields.add("open");
    openapiFields.add("fixed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recentlyDiscovered");
    openapiRequiredFields.add("open");
    openapiRequiredFields.add("fixed");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VulnerabilitiesSummaryStatusSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VulnerabilitiesSummaryStatusSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VulnerabilitiesSummaryStatusSummary is not found in the empty JSON string", VulnerabilitiesSummaryStatusSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VulnerabilitiesSummaryStatusSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VulnerabilitiesSummaryStatusSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VulnerabilitiesSummaryStatusSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VulnerabilitiesSummaryStatusSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VulnerabilitiesSummaryStatusSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VulnerabilitiesSummaryStatusSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VulnerabilitiesSummaryStatusSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<VulnerabilitiesSummaryStatusSummary>() {
           @Override
           public void write(JsonWriter out, VulnerabilitiesSummaryStatusSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VulnerabilitiesSummaryStatusSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VulnerabilitiesSummaryStatusSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VulnerabilitiesSummaryStatusSummary
  * @throws IOException if the JSON string is invalid with respect to VulnerabilitiesSummaryStatusSummary
  */
  public static VulnerabilitiesSummaryStatusSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VulnerabilitiesSummaryStatusSummary.class);
  }

 /**
  * Convert an instance of VulnerabilitiesSummaryStatusSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

