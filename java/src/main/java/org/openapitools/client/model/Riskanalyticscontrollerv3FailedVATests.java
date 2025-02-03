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
 * Riskanalyticscontrollerv3FailedVATests
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3FailedVATests {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_TEST_DESCRIPTION = "test_description";
  @SerializedName(SERIALIZED_NAME_TEST_DESCRIPTION)
  private String testDescription;

  public static final String SERIALIZED_NAME_TEST_RESULT = "test_result";
  @SerializedName(SERIALIZED_NAME_TEST_RESULT)
  private String testResult;

  public Riskanalyticscontrollerv3FailedVATests() {
  }

  public Riskanalyticscontrollerv3FailedVATests severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public Riskanalyticscontrollerv3FailedVATests testDescription(String testDescription) {
    this.testDescription = testDescription;
    return this;
  }

   /**
   * Get testDescription
   * @return testDescription
  **/
  @javax.annotation.Nullable
  public String getTestDescription() {
    return testDescription;
  }

  public void setTestDescription(String testDescription) {
    this.testDescription = testDescription;
  }


  public Riskanalyticscontrollerv3FailedVATests testResult(String testResult) {
    this.testResult = testResult;
    return this;
  }

   /**
   * Get testResult
   * @return testResult
  **/
  @javax.annotation.Nullable
  public String getTestResult() {
    return testResult;
  }

  public void setTestResult(String testResult) {
    this.testResult = testResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3FailedVATests riskanalyticscontrollerv3FailedVATests = (Riskanalyticscontrollerv3FailedVATests) o;
    return Objects.equals(this.severity, riskanalyticscontrollerv3FailedVATests.severity) &&
        Objects.equals(this.testDescription, riskanalyticscontrollerv3FailedVATests.testDescription) &&
        Objects.equals(this.testResult, riskanalyticscontrollerv3FailedVATests.testResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, testDescription, testResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3FailedVATests {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    testDescription: ").append(toIndentedString(testDescription)).append("\n");
    sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
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
    openapiFields.add("severity");
    openapiFields.add("test_description");
    openapiFields.add("test_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3FailedVATests
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3FailedVATests.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3FailedVATests is not found in the empty JSON string", Riskanalyticscontrollerv3FailedVATests.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3FailedVATests.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3FailedVATests` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if ((jsonObj.get("test_description") != null && !jsonObj.get("test_description").isJsonNull()) && !jsonObj.get("test_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_description").toString()));
      }
      if ((jsonObj.get("test_result") != null && !jsonObj.get("test_result").isJsonNull()) && !jsonObj.get("test_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_result").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3FailedVATests.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3FailedVATests' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3FailedVATests> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3FailedVATests.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3FailedVATests>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3FailedVATests value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3FailedVATests read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3FailedVATests given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3FailedVATests
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3FailedVATests
  */
  public static Riskanalyticscontrollerv3FailedVATests fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3FailedVATests.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3FailedVATests to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

