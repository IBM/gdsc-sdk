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
import com.ibm.gdsc.sdk.UserSensitiveCategoriesSensitiveCategoriesInner;
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
 * UserSensitiveCategories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class UserSensitiveCategories {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "accountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENSITIVE_CATEGORIES = "sensitiveCategories";
  @SerializedName(SERIALIZED_NAME_SENSITIVE_CATEGORIES)
  private List<UserSensitiveCategoriesSensitiveCategoriesInner> sensitiveCategories = new ArrayList<>();

  public UserSensitiveCategories() {
  }

  public UserSensitiveCategories accountIds(List<String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public UserSensitiveCategories addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Get accountIds
   * @return accountIds
  **/
  @javax.annotation.Nonnull
  public List<String> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public UserSensitiveCategories sensitiveCategories(List<UserSensitiveCategoriesSensitiveCategoriesInner> sensitiveCategories) {
    this.sensitiveCategories = sensitiveCategories;
    return this;
  }

  public UserSensitiveCategories addSensitiveCategoriesItem(UserSensitiveCategoriesSensitiveCategoriesInner sensitiveCategoriesItem) {
    if (this.sensitiveCategories == null) {
      this.sensitiveCategories = new ArrayList<>();
    }
    this.sensitiveCategories.add(sensitiveCategoriesItem);
    return this;
  }

   /**
   * Get sensitiveCategories
   * @return sensitiveCategories
  **/
  @javax.annotation.Nonnull
  public List<UserSensitiveCategoriesSensitiveCategoriesInner> getSensitiveCategories() {
    return sensitiveCategories;
  }

  public void setSensitiveCategories(List<UserSensitiveCategoriesSensitiveCategoriesInner> sensitiveCategories) {
    this.sensitiveCategories = sensitiveCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSensitiveCategories userSensitiveCategories = (UserSensitiveCategories) o;
    return Objects.equals(this.accountIds, userSensitiveCategories.accountIds) &&
        Objects.equals(this.sensitiveCategories, userSensitiveCategories.sensitiveCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, sensitiveCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSensitiveCategories {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    sensitiveCategories: ").append(toIndentedString(sensitiveCategories)).append("\n");
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
    openapiFields.add("accountIds");
    openapiFields.add("sensitiveCategories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountIds");
    openapiRequiredFields.add("sensitiveCategories");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserSensitiveCategories
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserSensitiveCategories.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSensitiveCategories is not found in the empty JSON string", UserSensitiveCategories.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserSensitiveCategories.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserSensitiveCategories` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserSensitiveCategories.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("accountIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("accountIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountIds` to be an array in the JSON string but got `%s`", jsonObj.get("accountIds").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sensitiveCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitiveCategories` to be an array in the JSON string but got `%s`", jsonObj.get("sensitiveCategories").toString()));
      }

      JsonArray jsonArraysensitiveCategories = jsonObj.getAsJsonArray("sensitiveCategories");
      // validate the required field `sensitiveCategories` (array)
      for (int i = 0; i < jsonArraysensitiveCategories.size(); i++) {
        UserSensitiveCategoriesSensitiveCategoriesInner.validateJsonElement(jsonArraysensitiveCategories.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSensitiveCategories.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSensitiveCategories' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSensitiveCategories> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSensitiveCategories.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSensitiveCategories>() {
           @Override
           public void write(JsonWriter out, UserSensitiveCategories value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSensitiveCategories read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserSensitiveCategories given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserSensitiveCategories
  * @throws IOException if the JSON string is invalid with respect to UserSensitiveCategories
  */
  public static UserSensitiveCategories fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSensitiveCategories.class);
  }

 /**
  * Convert an instance of UserSensitiveCategories to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

