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
 * Riskanalyticsdataprocessorv3Question
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsdataprocessorv3Question {
  public static final String SERIALIZED_NAME_QUESTION = "question";
  @SerializedName(SERIALIZED_NAME_QUESTION)
  private String question;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE_TO_ANALYST = "value_to_analyst";
  @SerializedName(SERIALIZED_NAME_VALUE_TO_ANALYST)
  private Integer valueToAnalyst;

  public Riskanalyticsdataprocessorv3Question() {
  }

  public Riskanalyticsdataprocessorv3Question question(String question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @javax.annotation.Nullable
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  public Riskanalyticsdataprocessorv3Question type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Riskanalyticsdataprocessorv3Question valueToAnalyst(Integer valueToAnalyst) {
    this.valueToAnalyst = valueToAnalyst;
    return this;
  }

   /**
   * Get valueToAnalyst
   * @return valueToAnalyst
  **/
  @javax.annotation.Nullable
  public Integer getValueToAnalyst() {
    return valueToAnalyst;
  }

  public void setValueToAnalyst(Integer valueToAnalyst) {
    this.valueToAnalyst = valueToAnalyst;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsdataprocessorv3Question riskanalyticsdataprocessorv3Question = (Riskanalyticsdataprocessorv3Question) o;
    return Objects.equals(this.question, riskanalyticsdataprocessorv3Question.question) &&
        Objects.equals(this.type, riskanalyticsdataprocessorv3Question.type) &&
        Objects.equals(this.valueToAnalyst, riskanalyticsdataprocessorv3Question.valueToAnalyst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, type, valueToAnalyst);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsdataprocessorv3Question {\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueToAnalyst: ").append(toIndentedString(valueToAnalyst)).append("\n");
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
    openapiFields.add("question");
    openapiFields.add("type");
    openapiFields.add("value_to_analyst");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsdataprocessorv3Question
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsdataprocessorv3Question.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsdataprocessorv3Question is not found in the empty JSON string", Riskanalyticsdataprocessorv3Question.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsdataprocessorv3Question.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsdataprocessorv3Question` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("question") != null && !jsonObj.get("question").isJsonNull()) && !jsonObj.get("question").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `question` to be a primitive type in the JSON string but got `%s`", jsonObj.get("question").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsdataprocessorv3Question.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsdataprocessorv3Question' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsdataprocessorv3Question> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsdataprocessorv3Question.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsdataprocessorv3Question>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsdataprocessorv3Question value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsdataprocessorv3Question read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsdataprocessorv3Question given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsdataprocessorv3Question
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsdataprocessorv3Question
  */
  public static Riskanalyticsdataprocessorv3Question fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsdataprocessorv3Question.class);
  }

 /**
  * Convert an instance of Riskanalyticsdataprocessorv3Question to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

