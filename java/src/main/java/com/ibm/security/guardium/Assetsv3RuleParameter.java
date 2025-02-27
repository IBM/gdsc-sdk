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
 * Assetsv3RuleParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3RuleParameter {
  public static final String SERIALIZED_NAME_ASSET_ATTRIBUTE = "asset_attribute";
  @SerializedName(SERIALIZED_NAME_ASSET_ATTRIBUTE)
  private String assetAttribute;

  public static final String SERIALIZED_NAME_ATTRIBUTE_ENUM = "attribute_enum";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ENUM)
  private String attributeEnum;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public static final String SERIALIZED_NAME_CONDITION_CATEGORY = "condition_category";
  @SerializedName(SERIALIZED_NAME_CONDITION_CATEGORY)
  private String conditionCategory;

  public static final String SERIALIZED_NAME_CONDITION_VALUE = "condition_value";
  @SerializedName(SERIALIZED_NAME_CONDITION_VALUE)
  private String conditionValue;

  public Assetsv3RuleParameter() {
  }

  public Assetsv3RuleParameter assetAttribute(String assetAttribute) {
    this.assetAttribute = assetAttribute;
    return this;
  }

   /**
   * Attribute type of the rule.
   * @return assetAttribute
  **/
  @javax.annotation.Nullable
  public String getAssetAttribute() {
    return assetAttribute;
  }

  public void setAssetAttribute(String assetAttribute) {
    this.assetAttribute = assetAttribute;
  }


  public Assetsv3RuleParameter attributeEnum(String attributeEnum) {
    this.attributeEnum = attributeEnum;
    return this;
  }

   /**
   * Enum to indicate attribute type.
   * @return attributeEnum
  **/
  @javax.annotation.Nullable
  public String getAttributeEnum() {
    return attributeEnum;
  }

  public void setAttributeEnum(String attributeEnum) {
    this.attributeEnum = attributeEnum;
  }


  public Assetsv3RuleParameter condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Attribute condition.
   * @return condition
  **/
  @javax.annotation.Nullable
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }


  public Assetsv3RuleParameter conditionCategory(String conditionCategory) {
    this.conditionCategory = conditionCategory;
    return this;
  }

   /**
   * Category of the attribute.
   * @return conditionCategory
  **/
  @javax.annotation.Nullable
  public String getConditionCategory() {
    return conditionCategory;
  }

  public void setConditionCategory(String conditionCategory) {
    this.conditionCategory = conditionCategory;
  }


  public Assetsv3RuleParameter conditionValue(String conditionValue) {
    this.conditionValue = conditionValue;
    return this;
  }

   /**
   * Value of the attribute.
   * @return conditionValue
  **/
  @javax.annotation.Nullable
  public String getConditionValue() {
    return conditionValue;
  }

  public void setConditionValue(String conditionValue) {
    this.conditionValue = conditionValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3RuleParameter assetsv3RuleParameter = (Assetsv3RuleParameter) o;
    return Objects.equals(this.assetAttribute, assetsv3RuleParameter.assetAttribute) &&
        Objects.equals(this.attributeEnum, assetsv3RuleParameter.attributeEnum) &&
        Objects.equals(this.condition, assetsv3RuleParameter.condition) &&
        Objects.equals(this.conditionCategory, assetsv3RuleParameter.conditionCategory) &&
        Objects.equals(this.conditionValue, assetsv3RuleParameter.conditionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetAttribute, attributeEnum, condition, conditionCategory, conditionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3RuleParameter {\n");
    sb.append("    assetAttribute: ").append(toIndentedString(assetAttribute)).append("\n");
    sb.append("    attributeEnum: ").append(toIndentedString(attributeEnum)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditionCategory: ").append(toIndentedString(conditionCategory)).append("\n");
    sb.append("    conditionValue: ").append(toIndentedString(conditionValue)).append("\n");
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
    openapiFields.add("asset_attribute");
    openapiFields.add("attribute_enum");
    openapiFields.add("condition");
    openapiFields.add("condition_category");
    openapiFields.add("condition_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3RuleParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3RuleParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3RuleParameter is not found in the empty JSON string", Assetsv3RuleParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3RuleParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3RuleParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asset_attribute") != null && !jsonObj.get("asset_attribute").isJsonNull()) && !jsonObj.get("asset_attribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_attribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_attribute").toString()));
      }
      if ((jsonObj.get("attribute_enum") != null && !jsonObj.get("attribute_enum").isJsonNull()) && !jsonObj.get("attribute_enum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute_enum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute_enum").toString()));
      }
      if ((jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      if ((jsonObj.get("condition_category") != null && !jsonObj.get("condition_category").isJsonNull()) && !jsonObj.get("condition_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition_category").toString()));
      }
      if ((jsonObj.get("condition_value") != null && !jsonObj.get("condition_value").isJsonNull()) && !jsonObj.get("condition_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3RuleParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3RuleParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3RuleParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3RuleParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3RuleParameter>() {
           @Override
           public void write(JsonWriter out, Assetsv3RuleParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3RuleParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3RuleParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3RuleParameter
  * @throws IOException if the JSON string is invalid with respect to Assetsv3RuleParameter
  */
  public static Assetsv3RuleParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3RuleParameter.class);
  }

 /**
  * Convert an instance of Assetsv3RuleParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

