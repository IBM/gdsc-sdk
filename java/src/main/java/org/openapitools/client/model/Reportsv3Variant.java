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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import org.openapitools.client.JSON;

/**
 * Reportsv3Variant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3Variant {
  public static final String SERIALIZED_NAME_HEADER_ID = "header_id";
  @SerializedName(SERIALIZED_NAME_HEADER_ID)
  private String headerId;

  public static final String SERIALIZED_NAME_LAST_RUN = "last_run";
  @SerializedName(SERIALIZED_NAME_LAST_RUN)
  private OffsetDateTime lastRun;

  public static final String SERIALIZED_NAME_LAST_RUN_ERROR = "last_run_error";
  @SerializedName(SERIALIZED_NAME_LAST_RUN_ERROR)
  private String lastRunError;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_VARIANT_ID = "variant_id";
  @SerializedName(SERIALIZED_NAME_VARIANT_ID)
  private String variantId;

  public static final String SERIALIZED_NAME_VARIANT_NAME = "variant_name";
  @SerializedName(SERIALIZED_NAME_VARIANT_NAME)
  private String variantName;

  public Reportsv3Variant() {
  }

  public Reportsv3Variant headerId(String headerId) {
    this.headerId = headerId;
    return this;
  }

   /**
   * Get headerId
   * @return headerId
  **/
  @javax.annotation.Nullable
  public String getHeaderId() {
    return headerId;
  }

  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }


  public Reportsv3Variant lastRun(OffsetDateTime lastRun) {
    this.lastRun = lastRun;
    return this;
  }

   /**
   * Get lastRun
   * @return lastRun
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastRun() {
    return lastRun;
  }

  public void setLastRun(OffsetDateTime lastRun) {
    this.lastRun = lastRun;
  }


  public Reportsv3Variant lastRunError(String lastRunError) {
    this.lastRunError = lastRunError;
    return this;
  }

   /**
   * Get lastRunError
   * @return lastRunError
  **/
  @javax.annotation.Nullable
  public String getLastRunError() {
    return lastRunError;
  }

  public void setLastRunError(String lastRunError) {
    this.lastRunError = lastRunError;
  }


  public Reportsv3Variant totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public Reportsv3Variant variantId(String variantId) {
    this.variantId = variantId;
    return this;
  }

   /**
   * Get variantId
   * @return variantId
  **/
  @javax.annotation.Nullable
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }


  public Reportsv3Variant variantName(String variantName) {
    this.variantName = variantName;
    return this;
  }

   /**
   * Get variantName
   * @return variantName
  **/
  @javax.annotation.Nullable
  public String getVariantName() {
    return variantName;
  }

  public void setVariantName(String variantName) {
    this.variantName = variantName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3Variant reportsv3Variant = (Reportsv3Variant) o;
    return Objects.equals(this.headerId, reportsv3Variant.headerId) &&
        Objects.equals(this.lastRun, reportsv3Variant.lastRun) &&
        Objects.equals(this.lastRunError, reportsv3Variant.lastRunError) &&
        Objects.equals(this.totalCount, reportsv3Variant.totalCount) &&
        Objects.equals(this.variantId, reportsv3Variant.variantId) &&
        Objects.equals(this.variantName, reportsv3Variant.variantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerId, lastRun, lastRunError, totalCount, variantId, variantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3Variant {\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
    sb.append("    lastRunError: ").append(toIndentedString(lastRunError)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
    sb.append("    variantName: ").append(toIndentedString(variantName)).append("\n");
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
    openapiFields.add("header_id");
    openapiFields.add("last_run");
    openapiFields.add("last_run_error");
    openapiFields.add("total_count");
    openapiFields.add("variant_id");
    openapiFields.add("variant_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3Variant
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3Variant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3Variant is not found in the empty JSON string", Reportsv3Variant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3Variant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3Variant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("header_id") != null && !jsonObj.get("header_id").isJsonNull()) && !jsonObj.get("header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_id").toString()));
      }
      if ((jsonObj.get("last_run_error") != null && !jsonObj.get("last_run_error").isJsonNull()) && !jsonObj.get("last_run_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_run_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_run_error").toString()));
      }
      if ((jsonObj.get("variant_id") != null && !jsonObj.get("variant_id").isJsonNull()) && !jsonObj.get("variant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_id").toString()));
      }
      if ((jsonObj.get("variant_name") != null && !jsonObj.get("variant_name").isJsonNull()) && !jsonObj.get("variant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3Variant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3Variant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3Variant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3Variant.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3Variant>() {
           @Override
           public void write(JsonWriter out, Reportsv3Variant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3Variant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3Variant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3Variant
  * @throws IOException if the JSON string is invalid with respect to Reportsv3Variant
  */
  public static Reportsv3Variant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3Variant.class);
  }

 /**
  * Convert an instance of Reportsv3Variant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

