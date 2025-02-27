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
import com.ibm.security.guardium.Vendor;
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
 * LinkedVendor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class LinkedVendor {
  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private Vendor vendor;

  public static final String SERIALIZED_NAME_TOTAL_ACCOUNTS = "totalAccounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_ACCOUNTS)
  private BigDecimal totalAccounts;

  public static final String SERIALIZED_NAME_IS_SENSITIVE = "isSensitive";
  @SerializedName(SERIALIZED_NAME_IS_SENSITIVE)
  private Boolean isSensitive;

  public LinkedVendor() {
  }

  public LinkedVendor vendor(Vendor vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @javax.annotation.Nonnull
  public Vendor getVendor() {
    return vendor;
  }

  public void setVendor(Vendor vendor) {
    this.vendor = vendor;
  }


  public LinkedVendor totalAccounts(BigDecimal totalAccounts) {
    this.totalAccounts = totalAccounts;
    return this;
  }

   /**
   * Get totalAccounts
   * @return totalAccounts
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalAccounts() {
    return totalAccounts;
  }

  public void setTotalAccounts(BigDecimal totalAccounts) {
    this.totalAccounts = totalAccounts;
  }


  public LinkedVendor isSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
    return this;
  }

   /**
   * Get isSensitive
   * @return isSensitive
  **/
  @javax.annotation.Nonnull
  public Boolean getIsSensitive() {
    return isSensitive;
  }

  public void setIsSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedVendor linkedVendor = (LinkedVendor) o;
    return Objects.equals(this.vendor, linkedVendor.vendor) &&
        Objects.equals(this.totalAccounts, linkedVendor.totalAccounts) &&
        Objects.equals(this.isSensitive, linkedVendor.isSensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendor, totalAccounts, isSensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedVendor {\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    totalAccounts: ").append(toIndentedString(totalAccounts)).append("\n");
    sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
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
    openapiFields.add("vendor");
    openapiFields.add("totalAccounts");
    openapiFields.add("isSensitive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vendor");
    openapiRequiredFields.add("totalAccounts");
    openapiRequiredFields.add("isSensitive");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LinkedVendor
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinkedVendor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkedVendor is not found in the empty JSON string", LinkedVendor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinkedVendor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkedVendor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkedVendor.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `vendor`
      Vendor.validateJsonElement(jsonObj.get("vendor"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkedVendor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkedVendor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkedVendor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkedVendor.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkedVendor>() {
           @Override
           public void write(JsonWriter out, LinkedVendor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkedVendor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkedVendor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkedVendor
  * @throws IOException if the JSON string is invalid with respect to LinkedVendor
  */
  public static LinkedVendor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkedVendor.class);
  }

 /**
  * Convert an instance of LinkedVendor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

