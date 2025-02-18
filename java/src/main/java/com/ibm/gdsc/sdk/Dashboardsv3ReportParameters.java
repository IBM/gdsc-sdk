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
import com.ibm.gdsc.sdk.Dashboardsv3TimeRange;
import com.ibm.gdsc.sdk.Reportsv3ReportTag;
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
 * ReportParameters - distinguishing features of a report card.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Dashboardsv3ReportParameters {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_TIME_FILTER = "local_time_filter";
  @SerializedName(SERIALIZED_NAME_LOCAL_TIME_FILTER)
  private Dashboardsv3TimeRange localTimeFilter;

  public static final String SERIALIZED_NAME_MENU_ITEM = "menu_item";
  @SerializedName(SERIALIZED_NAME_MENU_ITEM)
  private String menuItem;

  public static final String SERIALIZED_NAME_OVERRIDE = "override";
  @SerializedName(SERIALIZED_NAME_OVERRIDE)
  private Boolean override;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private String range;

  public static final String SERIALIZED_NAME_REGULATION = "regulation";
  @SerializedName(SERIALIZED_NAME_REGULATION)
  private String regulation;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Reportsv3ReportTag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Dashboardsv3ReportParameters() {
  }

  public Dashboardsv3ReportParameters end(String end) {
    this.end = end;
    return this;
  }

   /**
   * End.
   * @return end
  **/
  @javax.annotation.Nullable
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  public Dashboardsv3ReportParameters id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Parameters id.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Dashboardsv3ReportParameters localTimeFilter(Dashboardsv3TimeRange localTimeFilter) {
    this.localTimeFilter = localTimeFilter;
    return this;
  }

   /**
   * Get localTimeFilter
   * @return localTimeFilter
  **/
  @javax.annotation.Nullable
  public Dashboardsv3TimeRange getLocalTimeFilter() {
    return localTimeFilter;
  }

  public void setLocalTimeFilter(Dashboardsv3TimeRange localTimeFilter) {
    this.localTimeFilter = localTimeFilter;
  }


  public Dashboardsv3ReportParameters menuItem(String menuItem) {
    this.menuItem = menuItem;
    return this;
  }

   /**
   * Menu Item.
   * @return menuItem
  **/
  @javax.annotation.Nullable
  public String getMenuItem() {
    return menuItem;
  }

  public void setMenuItem(String menuItem) {
    this.menuItem = menuItem;
  }


  public Dashboardsv3ReportParameters override(Boolean override) {
    this.override = override;
    return this;
  }

   /**
   * Use local parameters instead of global.
   * @return override
  **/
  @javax.annotation.Nullable
  public Boolean getOverride() {
    return override;
  }

  public void setOverride(Boolean override) {
    this.override = override;
  }


  public Dashboardsv3ReportParameters range(String range) {
    this.range = range;
    return this;
  }

   /**
   * Time range - Time range is no longer used.
   * @return range
  **/
  @javax.annotation.Nullable
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }


  public Dashboardsv3ReportParameters regulation(String regulation) {
    this.regulation = regulation;
    return this;
  }

   /**
   * Regulation for isDataSecurity.
   * @return regulation
  **/
  @javax.annotation.Nullable
  public String getRegulation() {
    return regulation;
  }

  public void setRegulation(String regulation) {
    this.regulation = regulation;
  }


  public Dashboardsv3ReportParameters start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Start.
   * @return start
  **/
  @javax.annotation.Nullable
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }


  public Dashboardsv3ReportParameters tags(List<Reportsv3ReportTag> tags) {
    this.tags = tags;
    return this;
  }

  public Dashboardsv3ReportParameters addTagsItem(Reportsv3ReportTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Report tags.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ReportTag> getTags() {
    return tags;
  }

  public void setTags(List<Reportsv3ReportTag> tags) {
    this.tags = tags;
  }


  public Dashboardsv3ReportParameters title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Optional title of card.
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboardsv3ReportParameters dashboardsv3ReportParameters = (Dashboardsv3ReportParameters) o;
    return Objects.equals(this.end, dashboardsv3ReportParameters.end) &&
        Objects.equals(this.id, dashboardsv3ReportParameters.id) &&
        Objects.equals(this.localTimeFilter, dashboardsv3ReportParameters.localTimeFilter) &&
        Objects.equals(this.menuItem, dashboardsv3ReportParameters.menuItem) &&
        Objects.equals(this.override, dashboardsv3ReportParameters.override) &&
        Objects.equals(this.range, dashboardsv3ReportParameters.range) &&
        Objects.equals(this.regulation, dashboardsv3ReportParameters.regulation) &&
        Objects.equals(this.start, dashboardsv3ReportParameters.start) &&
        Objects.equals(this.tags, dashboardsv3ReportParameters.tags) &&
        Objects.equals(this.title, dashboardsv3ReportParameters.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, id, localTimeFilter, menuItem, override, range, regulation, start, tags, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboardsv3ReportParameters {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localTimeFilter: ").append(toIndentedString(localTimeFilter)).append("\n");
    sb.append("    menuItem: ").append(toIndentedString(menuItem)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    regulation: ").append(toIndentedString(regulation)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("end");
    openapiFields.add("id");
    openapiFields.add("local_time_filter");
    openapiFields.add("menu_item");
    openapiFields.add("override");
    openapiFields.add("range");
    openapiFields.add("regulation");
    openapiFields.add("start");
    openapiFields.add("tags");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dashboardsv3ReportParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dashboardsv3ReportParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboardsv3ReportParameters is not found in the empty JSON string", Dashboardsv3ReportParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dashboardsv3ReportParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dashboardsv3ReportParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) && !jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `local_time_filter`
      if (jsonObj.get("local_time_filter") != null && !jsonObj.get("local_time_filter").isJsonNull()) {
        Dashboardsv3TimeRange.validateJsonElement(jsonObj.get("local_time_filter"));
      }
      if ((jsonObj.get("menu_item") != null && !jsonObj.get("menu_item").isJsonNull()) && !jsonObj.get("menu_item").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `menu_item` to be a primitive type in the JSON string but got `%s`", jsonObj.get("menu_item").toString()));
      }
      if ((jsonObj.get("range") != null && !jsonObj.get("range").isJsonNull()) && !jsonObj.get("range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("range").toString()));
      }
      if ((jsonObj.get("regulation") != null && !jsonObj.get("regulation").isJsonNull()) && !jsonObj.get("regulation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regulation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regulation").toString()));
      }
      if ((jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) && !jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Reportsv3ReportTag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboardsv3ReportParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboardsv3ReportParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboardsv3ReportParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboardsv3ReportParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboardsv3ReportParameters>() {
           @Override
           public void write(JsonWriter out, Dashboardsv3ReportParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboardsv3ReportParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dashboardsv3ReportParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dashboardsv3ReportParameters
  * @throws IOException if the JSON string is invalid with respect to Dashboardsv3ReportParameters
  */
  public static Dashboardsv3ReportParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboardsv3ReportParameters.class);
  }

 /**
  * Convert an instance of Dashboardsv3ReportParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

