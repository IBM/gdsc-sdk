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
import com.ibm.security.guardium.QuestionType;
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
 * SetQuestionBodyParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class SetQuestionBodyParams {
  public static final String SERIALIZED_NAME_QUESTION_TYPE = "questionType";
  @SerializedName(SERIALIZED_NAME_QUESTION_TYPE)
  private QuestionType questionType;

  public static final String SERIALIZED_NAME_ANSWERS = "answers";
  @SerializedName(SERIALIZED_NAME_ANSWERS)
  private List<String> answers = new ArrayList<>();

  public SetQuestionBodyParams() {
  }

  public SetQuestionBodyParams questionType(QuestionType questionType) {
    this.questionType = questionType;
    return this;
  }

   /**
   * Get questionType
   * @return questionType
  **/
  @javax.annotation.Nonnull
  public QuestionType getQuestionType() {
    return questionType;
  }

  public void setQuestionType(QuestionType questionType) {
    this.questionType = questionType;
  }


  public SetQuestionBodyParams answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  public SetQuestionBodyParams addAnswersItem(String answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @javax.annotation.Nonnull
  public List<String> getAnswers() {
    return answers;
  }

  public void setAnswers(List<String> answers) {
    this.answers = answers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetQuestionBodyParams setQuestionBodyParams = (SetQuestionBodyParams) o;
    return Objects.equals(this.questionType, setQuestionBodyParams.questionType) &&
        Objects.equals(this.answers, setQuestionBodyParams.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionType, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetQuestionBodyParams {\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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
    openapiFields.add("questionType");
    openapiFields.add("answers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("questionType");
    openapiRequiredFields.add("answers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SetQuestionBodyParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetQuestionBodyParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetQuestionBodyParams is not found in the empty JSON string", SetQuestionBodyParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetQuestionBodyParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetQuestionBodyParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetQuestionBodyParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `questionType`
      QuestionType.validateJsonElement(jsonObj.get("questionType"));
      // ensure the required json array is present
      if (jsonObj.get("answers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("answers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `answers` to be an array in the JSON string but got `%s`", jsonObj.get("answers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetQuestionBodyParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetQuestionBodyParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetQuestionBodyParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetQuestionBodyParams.class));

       return (TypeAdapter<T>) new TypeAdapter<SetQuestionBodyParams>() {
           @Override
           public void write(JsonWriter out, SetQuestionBodyParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetQuestionBodyParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetQuestionBodyParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetQuestionBodyParams
  * @throws IOException if the JSON string is invalid with respect to SetQuestionBodyParams
  */
  public static SetQuestionBodyParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetQuestionBodyParams.class);
  }

 /**
  * Convert an instance of SetQuestionBodyParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

