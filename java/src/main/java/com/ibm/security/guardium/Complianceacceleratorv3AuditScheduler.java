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
import com.ibm.security.guardium.Schedulerv3DayOfWeek;
import com.ibm.security.guardium.Schedulerv3DayOrder;
import com.ibm.security.guardium.Schedulerv3Frequency;
import com.ibm.security.guardium.Schedulerv3Month;
import com.ibm.security.guardium.Schedulerv3RepeatBegin;
import com.ibm.security.guardium.Schedulerv3RepeatEnd;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Audit scheduler.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3AuditScheduler {
  public static final String SERIALIZED_NAME_BEGIN_SCHEDULE = "begin_schedule";
  @SerializedName(SERIALIZED_NAME_BEGIN_SCHEDULE)
  private OffsetDateTime beginSchedule;

  public static final String SERIALIZED_NAME_BY_DAY_OF_MONTH = "by_day_of_month";
  @SerializedName(SERIALIZED_NAME_BY_DAY_OF_MONTH)
  private Boolean byDayOfMonth;

  public static final String SERIALIZED_NAME_DAY_OF_MONTH = "day_of_month";
  @SerializedName(SERIALIZED_NAME_DAY_OF_MONTH)
  private String dayOfMonth;

  public static final String SERIALIZED_NAME_DAY_OF_WEEK = "day_of_week";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
  private List<Schedulerv3DayOfWeek> dayOfWeek = new ArrayList<>();

  public static final String SERIALIZED_NAME_DAY_ORDER = "day_order";
  @SerializedName(SERIALIZED_NAME_DAY_ORDER)
  private Schedulerv3DayOrder dayOrder = Schedulerv3DayOrder.UNDEFINED_ORDER;

  public static final String SERIALIZED_NAME_DAY_ORDER_DAY_OF_WEEK = "day_order_day_of_week";
  @SerializedName(SERIALIZED_NAME_DAY_ORDER_DAY_OF_WEEK)
  private Schedulerv3DayOfWeek dayOrderDayOfWeek = Schedulerv3DayOfWeek.UNDEFINED_DAY;

  public static final String SERIALIZED_NAME_END_SCHEDULE = "end_schedule";
  @SerializedName(SERIALIZED_NAME_END_SCHEDULE)
  private OffsetDateTime endSchedule;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Schedulerv3Frequency frequency = Schedulerv3Frequency.UNDEFINED_FREQUENCY;

  public static final String SERIALIZED_NAME_MONTHS = "months";
  @SerializedName(SERIALIZED_NAME_MONTHS)
  private List<Schedulerv3Month> months = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEVER_END = "never_end";
  @SerializedName(SERIALIZED_NAME_NEVER_END)
  private Boolean neverEnd;

  public static final String SERIALIZED_NAME_REPEAT = "repeat";
  @SerializedName(SERIALIZED_NAME_REPEAT)
  private Integer repeat;

  public static final String SERIALIZED_NAME_REPEAT_BEGIN = "repeat_begin";
  @SerializedName(SERIALIZED_NAME_REPEAT_BEGIN)
  private Schedulerv3RepeatBegin repeatBegin;

  public static final String SERIALIZED_NAME_REPEAT_END = "repeat_end";
  @SerializedName(SERIALIZED_NAME_REPEAT_END)
  private Schedulerv3RepeatEnd repeatEnd;

  public Complianceacceleratorv3AuditScheduler() {
  }

  public Complianceacceleratorv3AuditScheduler beginSchedule(OffsetDateTime beginSchedule) {
    this.beginSchedule = beginSchedule;
    return this;
  }

   /**
   * Begin the schedule on.
   * @return beginSchedule
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getBeginSchedule() {
    return beginSchedule;
  }

  public void setBeginSchedule(OffsetDateTime beginSchedule) {
    this.beginSchedule = beginSchedule;
  }


  public Complianceacceleratorv3AuditScheduler byDayOfMonth(Boolean byDayOfMonth) {
    this.byDayOfMonth = byDayOfMonth;
    return this;
  }

   /**
   * Either by day of month or date of the week of month.
   * @return byDayOfMonth
  **/
  @javax.annotation.Nullable
  public Boolean getByDayOfMonth() {
    return byDayOfMonth;
  }

  public void setByDayOfMonth(Boolean byDayOfMonth) {
    this.byDayOfMonth = byDayOfMonth;
  }


  public Complianceacceleratorv3AuditScheduler dayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * The day of the month, combined with frequency &#x3D; 4 because there last day of the month the data type is string.
   * @return dayOfMonth
  **/
  @javax.annotation.Nullable
  public String getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  public Complianceacceleratorv3AuditScheduler dayOfWeek(List<Schedulerv3DayOfWeek> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public Complianceacceleratorv3AuditScheduler addDayOfWeekItem(Schedulerv3DayOfWeek dayOfWeekItem) {
    if (this.dayOfWeek == null) {
      this.dayOfWeek = new ArrayList<>();
    }
    this.dayOfWeek.add(dayOfWeekItem);
    return this;
  }

   /**
   * What day do you want to run , combined with frequency&#x3D; 3, such as Monday, Tuesday.
   * @return dayOfWeek
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3DayOfWeek> getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(List<Schedulerv3DayOfWeek> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public Complianceacceleratorv3AuditScheduler dayOrder(Schedulerv3DayOrder dayOrder) {
    this.dayOrder = dayOrder;
    return this;
  }

   /**
   * Get dayOrder
   * @return dayOrder
  **/
  @javax.annotation.Nullable
  public Schedulerv3DayOrder getDayOrder() {
    return dayOrder;
  }

  public void setDayOrder(Schedulerv3DayOrder dayOrder) {
    this.dayOrder = dayOrder;
  }


  public Complianceacceleratorv3AuditScheduler dayOrderDayOfWeek(Schedulerv3DayOfWeek dayOrderDayOfWeek) {
    this.dayOrderDayOfWeek = dayOrderDayOfWeek;
    return this;
  }

   /**
   * Get dayOrderDayOfWeek
   * @return dayOrderDayOfWeek
  **/
  @javax.annotation.Nullable
  public Schedulerv3DayOfWeek getDayOrderDayOfWeek() {
    return dayOrderDayOfWeek;
  }

  public void setDayOrderDayOfWeek(Schedulerv3DayOfWeek dayOrderDayOfWeek) {
    this.dayOrderDayOfWeek = dayOrderDayOfWeek;
  }


  public Complianceacceleratorv3AuditScheduler endSchedule(OffsetDateTime endSchedule) {
    this.endSchedule = endSchedule;
    return this;
  }

   /**
   * End the schedule on , if it is null means never ends.
   * @return endSchedule
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndSchedule() {
    return endSchedule;
  }

  public void setEndSchedule(OffsetDateTime endSchedule) {
    this.endSchedule = endSchedule;
  }


  public Complianceacceleratorv3AuditScheduler frequency(Schedulerv3Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  public Schedulerv3Frequency getFrequency() {
    return frequency;
  }

  public void setFrequency(Schedulerv3Frequency frequency) {
    this.frequency = frequency;
  }


  public Complianceacceleratorv3AuditScheduler months(List<Schedulerv3Month> months) {
    this.months = months;
    return this;
  }

  public Complianceacceleratorv3AuditScheduler addMonthsItem(Schedulerv3Month monthsItem) {
    if (this.months == null) {
      this.months = new ArrayList<>();
    }
    this.months.add(monthsItem);
    return this;
  }

   /**
   * Month value.
   * @return months
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3Month> getMonths() {
    return months;
  }

  public void setMonths(List<Schedulerv3Month> months) {
    this.months = months;
  }


  public Complianceacceleratorv3AuditScheduler neverEnd(Boolean neverEnd) {
    this.neverEnd = neverEnd;
    return this;
  }

   /**
   * Never end schedule or not.
   * @return neverEnd
  **/
  @javax.annotation.Nullable
  public Boolean getNeverEnd() {
    return neverEnd;
  }

  public void setNeverEnd(Boolean neverEnd) {
    this.neverEnd = neverEnd;
  }


  public Complianceacceleratorv3AuditScheduler repeat(Integer repeat) {
    this.repeat = repeat;
    return this;
  }

   /**
   * Combined with frequency to define how often to run the job. ie, if frequncy &#x3D;1 and repeat &#x3D;3 means run the job every 3 hours.
   * @return repeat
  **/
  @javax.annotation.Nullable
  public Integer getRepeat() {
    return repeat;
  }

  public void setRepeat(Integer repeat) {
    this.repeat = repeat;
  }


  public Complianceacceleratorv3AuditScheduler repeatBegin(Schedulerv3RepeatBegin repeatBegin) {
    this.repeatBegin = repeatBegin;
    return this;
  }

   /**
   * Get repeatBegin
   * @return repeatBegin
  **/
  @javax.annotation.Nullable
  public Schedulerv3RepeatBegin getRepeatBegin() {
    return repeatBegin;
  }

  public void setRepeatBegin(Schedulerv3RepeatBegin repeatBegin) {
    this.repeatBegin = repeatBegin;
  }


  public Complianceacceleratorv3AuditScheduler repeatEnd(Schedulerv3RepeatEnd repeatEnd) {
    this.repeatEnd = repeatEnd;
    return this;
  }

   /**
   * Get repeatEnd
   * @return repeatEnd
  **/
  @javax.annotation.Nullable
  public Schedulerv3RepeatEnd getRepeatEnd() {
    return repeatEnd;
  }

  public void setRepeatEnd(Schedulerv3RepeatEnd repeatEnd) {
    this.repeatEnd = repeatEnd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3AuditScheduler complianceacceleratorv3AuditScheduler = (Complianceacceleratorv3AuditScheduler) o;
    return Objects.equals(this.beginSchedule, complianceacceleratorv3AuditScheduler.beginSchedule) &&
        Objects.equals(this.byDayOfMonth, complianceacceleratorv3AuditScheduler.byDayOfMonth) &&
        Objects.equals(this.dayOfMonth, complianceacceleratorv3AuditScheduler.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, complianceacceleratorv3AuditScheduler.dayOfWeek) &&
        Objects.equals(this.dayOrder, complianceacceleratorv3AuditScheduler.dayOrder) &&
        Objects.equals(this.dayOrderDayOfWeek, complianceacceleratorv3AuditScheduler.dayOrderDayOfWeek) &&
        Objects.equals(this.endSchedule, complianceacceleratorv3AuditScheduler.endSchedule) &&
        Objects.equals(this.frequency, complianceacceleratorv3AuditScheduler.frequency) &&
        Objects.equals(this.months, complianceacceleratorv3AuditScheduler.months) &&
        Objects.equals(this.neverEnd, complianceacceleratorv3AuditScheduler.neverEnd) &&
        Objects.equals(this.repeat, complianceacceleratorv3AuditScheduler.repeat) &&
        Objects.equals(this.repeatBegin, complianceacceleratorv3AuditScheduler.repeatBegin) &&
        Objects.equals(this.repeatEnd, complianceacceleratorv3AuditScheduler.repeatEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginSchedule, byDayOfMonth, dayOfMonth, dayOfWeek, dayOrder, dayOrderDayOfWeek, endSchedule, frequency, months, neverEnd, repeat, repeatBegin, repeatEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3AuditScheduler {\n");
    sb.append("    beginSchedule: ").append(toIndentedString(beginSchedule)).append("\n");
    sb.append("    byDayOfMonth: ").append(toIndentedString(byDayOfMonth)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    dayOrder: ").append(toIndentedString(dayOrder)).append("\n");
    sb.append("    dayOrderDayOfWeek: ").append(toIndentedString(dayOrderDayOfWeek)).append("\n");
    sb.append("    endSchedule: ").append(toIndentedString(endSchedule)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    neverEnd: ").append(toIndentedString(neverEnd)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    repeatBegin: ").append(toIndentedString(repeatBegin)).append("\n");
    sb.append("    repeatEnd: ").append(toIndentedString(repeatEnd)).append("\n");
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
    openapiFields.add("begin_schedule");
    openapiFields.add("by_day_of_month");
    openapiFields.add("day_of_month");
    openapiFields.add("day_of_week");
    openapiFields.add("day_order");
    openapiFields.add("day_order_day_of_week");
    openapiFields.add("end_schedule");
    openapiFields.add("frequency");
    openapiFields.add("months");
    openapiFields.add("never_end");
    openapiFields.add("repeat");
    openapiFields.add("repeat_begin");
    openapiFields.add("repeat_end");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3AuditScheduler
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3AuditScheduler.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3AuditScheduler is not found in the empty JSON string", Complianceacceleratorv3AuditScheduler.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3AuditScheduler.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3AuditScheduler` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("day_of_month") != null && !jsonObj.get("day_of_month").isJsonNull()) && !jsonObj.get("day_of_month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day_of_month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day_of_month").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("day_of_week") != null && !jsonObj.get("day_of_week").isJsonNull() && !jsonObj.get("day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("day_of_week").toString()));
      }
      // validate the optional field `day_order`
      if (jsonObj.get("day_order") != null && !jsonObj.get("day_order").isJsonNull()) {
        Schedulerv3DayOrder.validateJsonElement(jsonObj.get("day_order"));
      }
      // validate the optional field `day_order_day_of_week`
      if (jsonObj.get("day_order_day_of_week") != null && !jsonObj.get("day_order_day_of_week").isJsonNull()) {
        Schedulerv3DayOfWeek.validateJsonElement(jsonObj.get("day_order_day_of_week"));
      }
      // validate the optional field `frequency`
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
        Schedulerv3Frequency.validateJsonElement(jsonObj.get("frequency"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("months") != null && !jsonObj.get("months").isJsonNull() && !jsonObj.get("months").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `months` to be an array in the JSON string but got `%s`", jsonObj.get("months").toString()));
      }
      // validate the optional field `repeat_begin`
      if (jsonObj.get("repeat_begin") != null && !jsonObj.get("repeat_begin").isJsonNull()) {
        Schedulerv3RepeatBegin.validateJsonElement(jsonObj.get("repeat_begin"));
      }
      // validate the optional field `repeat_end`
      if (jsonObj.get("repeat_end") != null && !jsonObj.get("repeat_end").isJsonNull()) {
        Schedulerv3RepeatEnd.validateJsonElement(jsonObj.get("repeat_end"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3AuditScheduler.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3AuditScheduler' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3AuditScheduler> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3AuditScheduler.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3AuditScheduler>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3AuditScheduler value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3AuditScheduler read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3AuditScheduler given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3AuditScheduler
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3AuditScheduler
  */
  public static Complianceacceleratorv3AuditScheduler fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3AuditScheduler.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3AuditScheduler to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

