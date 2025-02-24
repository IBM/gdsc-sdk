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
import com.ibm.security.guardium.Reportsv3VariantRule;
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

import com.ibm.security.JSON;

/**
 * Reportsv3RunVariantOperationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3RunVariantOperationRequest {
  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<Reportsv3VariantRule> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_VARIANT_ID = "variant_id";
  @SerializedName(SERIALIZED_NAME_VARIANT_ID)
  private String variantId;

  public Reportsv3RunVariantOperationRequest() {
  }

  public Reportsv3RunVariantOperationRequest input(String input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }


  public Reportsv3RunVariantOperationRequest rules(List<Reportsv3VariantRule> rules) {
    this.rules = rules;
    return this;
  }

  public Reportsv3RunVariantOperationRequest addRulesItem(Reportsv3VariantRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<Reportsv3VariantRule> getRules() {
    return rules;
  }

  public void setRules(List<Reportsv3VariantRule> rules) {
    this.rules = rules;
  }


  public Reportsv3RunVariantOperationRequest variantId(String variantId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3RunVariantOperationRequest reportsv3RunVariantOperationRequest = (Reportsv3RunVariantOperationRequest) o;
    return Objects.equals(this.input, reportsv3RunVariantOperationRequest.input) &&
        Objects.equals(this.rules, reportsv3RunVariantOperationRequest.rules) &&
        Objects.equals(this.variantId, reportsv3RunVariantOperationRequest.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, rules, variantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3RunVariantOperationRequest {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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
    openapiFields.add("input");
    openapiFields.add("rules");
    openapiFields.add("variant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3RunVariantOperationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3RunVariantOperationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3RunVariantOperationRequest is not found in the empty JSON string", Reportsv3RunVariantOperationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3RunVariantOperationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3RunVariantOperationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            Reportsv3VariantRule.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
      if ((jsonObj.get("variant_id") != null && !jsonObj.get("variant_id").isJsonNull()) && !jsonObj.get("variant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3RunVariantOperationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3RunVariantOperationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3RunVariantOperationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3RunVariantOperationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3RunVariantOperationRequest>() {
           @Override
           public void write(JsonWriter out, Reportsv3RunVariantOperationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3RunVariantOperationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3RunVariantOperationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3RunVariantOperationRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsv3RunVariantOperationRequest
  */
  public static Reportsv3RunVariantOperationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3RunVariantOperationRequest.class);
  }

 /**
  * Convert an instance of Reportsv3RunVariantOperationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

