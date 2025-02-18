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
import com.ibm.gdsc.sdk.Assetsv3Policy;
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
 * Assetsv3ListPolicyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3ListPolicyResponse {
  public static final String SERIALIZED_NAME_POLICY_LIST = "policy_list";
  @SerializedName(SERIALIZED_NAME_POLICY_LIST)
  private List<Assetsv3Policy> policyList = new ArrayList<>();

  public Assetsv3ListPolicyResponse() {
  }

  public Assetsv3ListPolicyResponse policyList(List<Assetsv3Policy> policyList) {
    this.policyList = policyList;
    return this;
  }

  public Assetsv3ListPolicyResponse addPolicyListItem(Assetsv3Policy policyListItem) {
    if (this.policyList == null) {
      this.policyList = new ArrayList<>();
    }
    this.policyList.add(policyListItem);
    return this;
  }

   /**
   * Get policyList
   * @return policyList
  **/
  @javax.annotation.Nullable
  public List<Assetsv3Policy> getPolicyList() {
    return policyList;
  }

  public void setPolicyList(List<Assetsv3Policy> policyList) {
    this.policyList = policyList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3ListPolicyResponse assetsv3ListPolicyResponse = (Assetsv3ListPolicyResponse) o;
    return Objects.equals(this.policyList, assetsv3ListPolicyResponse.policyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3ListPolicyResponse {\n");
    sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
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
    openapiFields.add("policy_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3ListPolicyResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3ListPolicyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3ListPolicyResponse is not found in the empty JSON string", Assetsv3ListPolicyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3ListPolicyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3ListPolicyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("policy_list") != null && !jsonObj.get("policy_list").isJsonNull()) {
        JsonArray jsonArraypolicyList = jsonObj.getAsJsonArray("policy_list");
        if (jsonArraypolicyList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("policy_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `policy_list` to be an array in the JSON string but got `%s`", jsonObj.get("policy_list").toString()));
          }

          // validate the optional field `policy_list` (array)
          for (int i = 0; i < jsonArraypolicyList.size(); i++) {
            Assetsv3Policy.validateJsonElement(jsonArraypolicyList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3ListPolicyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3ListPolicyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3ListPolicyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3ListPolicyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3ListPolicyResponse>() {
           @Override
           public void write(JsonWriter out, Assetsv3ListPolicyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3ListPolicyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3ListPolicyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3ListPolicyResponse
  * @throws IOException if the JSON string is invalid with respect to Assetsv3ListPolicyResponse
  */
  public static Assetsv3ListPolicyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3ListPolicyResponse.class);
  }

 /**
  * Convert an instance of Assetsv3ListPolicyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

