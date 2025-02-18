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
import com.ibm.gdsc.sdk.Workflowv3CaseEdit;
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
 * Update existing cases.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3UpdateCasesRequest {
  public static final String SERIALIZED_NAME_CASES = "cases";
  @SerializedName(SERIALIZED_NAME_CASES)
  private List<Workflowv3CaseEdit> cases = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATE_FIELDS = "update_fields";
  @SerializedName(SERIALIZED_NAME_UPDATE_FIELDS)
  private List<String> updateFields = new ArrayList<>();

  public Workflowv3UpdateCasesRequest() {
  }

  public Workflowv3UpdateCasesRequest cases(List<Workflowv3CaseEdit> cases) {
    this.cases = cases;
    return this;
  }

  public Workflowv3UpdateCasesRequest addCasesItem(Workflowv3CaseEdit casesItem) {
    if (this.cases == null) {
      this.cases = new ArrayList<>();
    }
    this.cases.add(casesItem);
    return this;
  }

   /**
   * Update multiple cases in one request.
   * @return cases
  **/
  @javax.annotation.Nullable
  public List<Workflowv3CaseEdit> getCases() {
    return cases;
  }

  public void setCases(List<Workflowv3CaseEdit> cases) {
    this.cases = cases;
  }


  public Workflowv3UpdateCasesRequest updateFields(List<String> updateFields) {
    this.updateFields = updateFields;
    return this;
  }

  public Workflowv3UpdateCasesRequest addUpdateFieldsItem(String updateFieldsItem) {
    if (this.updateFields == null) {
      this.updateFields = new ArrayList<>();
    }
    this.updateFields.add(updateFieldsItem);
    return this;
  }

   /**
   * Only update these fields in the backend records.
   * @return updateFields
  **/
  @javax.annotation.Nullable
  public List<String> getUpdateFields() {
    return updateFields;
  }

  public void setUpdateFields(List<String> updateFields) {
    this.updateFields = updateFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3UpdateCasesRequest workflowv3UpdateCasesRequest = (Workflowv3UpdateCasesRequest) o;
    return Objects.equals(this.cases, workflowv3UpdateCasesRequest.cases) &&
        Objects.equals(this.updateFields, workflowv3UpdateCasesRequest.updateFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cases, updateFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3UpdateCasesRequest {\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
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
    openapiFields.add("cases");
    openapiFields.add("update_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3UpdateCasesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3UpdateCasesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3UpdateCasesRequest is not found in the empty JSON string", Workflowv3UpdateCasesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3UpdateCasesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3UpdateCasesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("cases") != null && !jsonObj.get("cases").isJsonNull()) {
        JsonArray jsonArraycases = jsonObj.getAsJsonArray("cases");
        if (jsonArraycases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cases` to be an array in the JSON string but got `%s`", jsonObj.get("cases").toString()));
          }

          // validate the optional field `cases` (array)
          for (int i = 0; i < jsonArraycases.size(); i++) {
            Workflowv3CaseEdit.validateJsonElement(jsonArraycases.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("update_fields") != null && !jsonObj.get("update_fields").isJsonNull() && !jsonObj.get("update_fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_fields` to be an array in the JSON string but got `%s`", jsonObj.get("update_fields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3UpdateCasesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3UpdateCasesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3UpdateCasesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3UpdateCasesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3UpdateCasesRequest>() {
           @Override
           public void write(JsonWriter out, Workflowv3UpdateCasesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3UpdateCasesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3UpdateCasesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3UpdateCasesRequest
  * @throws IOException if the JSON string is invalid with respect to Workflowv3UpdateCasesRequest
  */
  public static Workflowv3UpdateCasesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3UpdateCasesRequest.class);
  }

 /**
  * Convert an instance of Workflowv3UpdateCasesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

