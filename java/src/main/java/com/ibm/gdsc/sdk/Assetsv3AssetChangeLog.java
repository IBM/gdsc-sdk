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
import com.ibm.gdsc.sdk.Assetsv3BeforeAfter;
import com.ibm.gdsc.sdk.Assetsv3RuleLog;
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
 * Assetsv3AssetChangeLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetChangeLog {
  public static final String SERIALIZED_NAME_ACTION_TAKEN = "action_taken";
  @SerializedName(SERIALIZED_NAME_ACTION_TAKEN)
  private String actionTaken;

  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private String activity;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private List<Assetsv3BeforeAfter> after = new ArrayList<>();

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private List<Assetsv3BeforeAfter> before = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_PERFORMED_BY = "performed_by";
  @SerializedName(SERIALIZED_NAME_PERFORMED_BY)
  private String performedBy;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private List<Assetsv3RuleLog> rule = new ArrayList<>();

  public Assetsv3AssetChangeLog() {
  }

  public Assetsv3AssetChangeLog actionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
    return this;
  }

   /**
   * Get actionTaken
   * @return actionTaken
  **/
  @javax.annotation.Nullable
  public String getActionTaken() {
    return actionTaken;
  }

  public void setActionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
  }


  public Assetsv3AssetChangeLog activity(String activity) {
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @javax.annotation.Nullable
  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }


  public Assetsv3AssetChangeLog after(List<Assetsv3BeforeAfter> after) {
    this.after = after;
    return this;
  }

  public Assetsv3AssetChangeLog addAfterItem(Assetsv3BeforeAfter afterItem) {
    if (this.after == null) {
      this.after = new ArrayList<>();
    }
    this.after.add(afterItem);
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @javax.annotation.Nullable
  public List<Assetsv3BeforeAfter> getAfter() {
    return after;
  }

  public void setAfter(List<Assetsv3BeforeAfter> after) {
    this.after = after;
  }


  public Assetsv3AssetChangeLog before(List<Assetsv3BeforeAfter> before) {
    this.before = before;
    return this;
  }

  public Assetsv3AssetChangeLog addBeforeItem(Assetsv3BeforeAfter beforeItem) {
    if (this.before == null) {
      this.before = new ArrayList<>();
    }
    this.before.add(beforeItem);
    return this;
  }

   /**
   * Get before
   * @return before
  **/
  @javax.annotation.Nullable
  public List<Assetsv3BeforeAfter> getBefore() {
    return before;
  }

  public void setBefore(List<Assetsv3BeforeAfter> before) {
    this.before = before;
  }


  public Assetsv3AssetChangeLog date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public Assetsv3AssetChangeLog performedBy(String performedBy) {
    this.performedBy = performedBy;
    return this;
  }

   /**
   * Get performedBy
   * @return performedBy
  **/
  @javax.annotation.Nullable
  public String getPerformedBy() {
    return performedBy;
  }

  public void setPerformedBy(String performedBy) {
    this.performedBy = performedBy;
  }


  public Assetsv3AssetChangeLog rule(List<Assetsv3RuleLog> rule) {
    this.rule = rule;
    return this;
  }

  public Assetsv3AssetChangeLog addRuleItem(Assetsv3RuleLog ruleItem) {
    if (this.rule == null) {
      this.rule = new ArrayList<>();
    }
    this.rule.add(ruleItem);
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nullable
  public List<Assetsv3RuleLog> getRule() {
    return rule;
  }

  public void setRule(List<Assetsv3RuleLog> rule) {
    this.rule = rule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetChangeLog assetsv3AssetChangeLog = (Assetsv3AssetChangeLog) o;
    return Objects.equals(this.actionTaken, assetsv3AssetChangeLog.actionTaken) &&
        Objects.equals(this.activity, assetsv3AssetChangeLog.activity) &&
        Objects.equals(this.after, assetsv3AssetChangeLog.after) &&
        Objects.equals(this.before, assetsv3AssetChangeLog.before) &&
        Objects.equals(this.date, assetsv3AssetChangeLog.date) &&
        Objects.equals(this.performedBy, assetsv3AssetChangeLog.performedBy) &&
        Objects.equals(this.rule, assetsv3AssetChangeLog.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTaken, activity, after, before, date, performedBy, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetChangeLog {\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    performedBy: ").append(toIndentedString(performedBy)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
    openapiFields.add("action_taken");
    openapiFields.add("activity");
    openapiFields.add("after");
    openapiFields.add("before");
    openapiFields.add("date");
    openapiFields.add("performed_by");
    openapiFields.add("rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetChangeLog
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetChangeLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetChangeLog is not found in the empty JSON string", Assetsv3AssetChangeLog.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetChangeLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetChangeLog` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action_taken") != null && !jsonObj.get("action_taken").isJsonNull()) && !jsonObj.get("action_taken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_taken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_taken").toString()));
      }
      if ((jsonObj.get("activity") != null && !jsonObj.get("activity").isJsonNull()) && !jsonObj.get("activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity").toString()));
      }
      if (jsonObj.get("after") != null && !jsonObj.get("after").isJsonNull()) {
        JsonArray jsonArrayafter = jsonObj.getAsJsonArray("after");
        if (jsonArrayafter != null) {
          // ensure the json data is an array
          if (!jsonObj.get("after").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `after` to be an array in the JSON string but got `%s`", jsonObj.get("after").toString()));
          }

          // validate the optional field `after` (array)
          for (int i = 0; i < jsonArrayafter.size(); i++) {
            Assetsv3BeforeAfter.validateJsonElement(jsonArrayafter.get(i));
          };
        }
      }
      if (jsonObj.get("before") != null && !jsonObj.get("before").isJsonNull()) {
        JsonArray jsonArraybefore = jsonObj.getAsJsonArray("before");
        if (jsonArraybefore != null) {
          // ensure the json data is an array
          if (!jsonObj.get("before").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `before` to be an array in the JSON string but got `%s`", jsonObj.get("before").toString()));
          }

          // validate the optional field `before` (array)
          for (int i = 0; i < jsonArraybefore.size(); i++) {
            Assetsv3BeforeAfter.validateJsonElement(jsonArraybefore.get(i));
          };
        }
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("performed_by") != null && !jsonObj.get("performed_by").isJsonNull()) && !jsonObj.get("performed_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `performed_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("performed_by").toString()));
      }
      if (jsonObj.get("rule") != null && !jsonObj.get("rule").isJsonNull()) {
        JsonArray jsonArrayrule = jsonObj.getAsJsonArray("rule");
        if (jsonArrayrule != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rule").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rule` to be an array in the JSON string but got `%s`", jsonObj.get("rule").toString()));
          }

          // validate the optional field `rule` (array)
          for (int i = 0; i < jsonArrayrule.size(); i++) {
            Assetsv3RuleLog.validateJsonElement(jsonArrayrule.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetChangeLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetChangeLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetChangeLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetChangeLog.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetChangeLog>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetChangeLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetChangeLog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetChangeLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetChangeLog
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetChangeLog
  */
  public static Assetsv3AssetChangeLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetChangeLog.class);
  }

 /**
  * Convert an instance of Assetsv3AssetChangeLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

