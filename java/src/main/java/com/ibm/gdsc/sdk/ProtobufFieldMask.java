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
 * paths: \&quot;f.a\&quot;     paths: \&quot;f.b.d\&quot;  Here &#x60;f&#x60; represents a field in some root message, &#x60;a&#x60; and &#x60;b&#x60; fields in the message found in &#x60;f&#x60;, and &#x60;d&#x60; a field found in the message in &#x60;f.b&#x60;.  Field masks are used to specify a subset of fields that should be returned by a get operation or modified by an update operation. Field masks also have a custom JSON encoding (see below).  # Field Masks in Projections  When used in the context of a projection, a response message or sub-message is filtered by the API to only contain those fields as specified in the mask. For example, if the mask in the previous example is applied to a response message as follows:      f {       a : 22       b {         d : 1         x : 2       }       y : 13     }     z: 8  The result will not contain specific values for fields x,y and z (their value will be set to the default, and omitted in proto text output):       f {       a : 22       b {         d : 1       }     }  A repeated field is not allowed except at the last position of a paths string.  If a FieldMask object is not present in a get operation, the operation applies to all fields (as if a FieldMask of all fields had been specified).  Note that a field mask does not necessarily apply to the top-level response message. In case of a REST get operation, the field mask applies directly to the response, but in case of a REST list operation, the mask instead applies to each individual message in the returned resource list. In case of a REST custom method, other definitions may be used. Where the mask applies will be clearly documented together with its declaration in the API.  In any case, the effect on the returned resource/resources is required behavior for APIs.  # Field Masks in Update Operations  A field mask in update operations specifies which fields of the targeted resource are going to be updated. The API is required to only change the values of the fields as specified in the mask and leave the others untouched. If a resource is passed in to describe the updated values, the API ignores the values of all fields not covered by the mask.  If a repeated field is specified for an update operation, new values will be appended to the existing repeated field in the target resource. Note that a repeated field is only allowed in the last position of a &#x60;paths&#x60; string.  If a sub-message is specified in the last position of the field mask for an update operation, then new value will be merged into the existing sub-message in the target resource.  For example, given the target message:      f {       b {         d: 1         x: 2       }       c: [1]     }  And an update message:      f {       b {         d: 10       }       c: [2]     }  then if the field mask is:   paths: [\&quot;f.b\&quot;, \&quot;f.c\&quot;]  then the result will be:      f {       b {         d: 10         x: 2       }       c: [1, 2]     }  An implementation may provide options to override this default behavior for repeated and message fields.  In order to reset a field&#39;s value to the default, the field must be in the mask and set to the default value in the provided resource. Hence, in order to reset all fields of a resource, provide a default instance of the resource and set all fields in the mask, or do not provide a mask as described below.  If a field mask is not present on update, the operation applies to all fields (as if a field mask of all fields has been specified). Note that in the presence of schema evolution, this may mean that fields the client does not know and has therefore not filled into the request will be reset to their default. If this is unwanted behavior, a specific service may require a client to always specify a field mask, producing an error if not.  As with get operations, the location of the resource which describes the updated values in the request message depends on the operation kind. In any case, the effect of the field mask is required to be honored by the API.  ## Considerations for HTTP REST  The HTTP kind of an update operation which uses a field mask must be set to PATCH instead of PUT in order to satisfy HTTP semantics (PUT must only be used for full updates).  # JSON Encoding of Field Masks  In JSON, a field mask is encoded as a single string where paths are separated by a comma. Fields name in each path are converted to/from lower-camel naming conventions.  As an example, consider the following message declarations:      message Profile {       User user &#x3D; 1;       Photo photo &#x3D; 2;     }     message User {       string display_name &#x3D; 1;       string address &#x3D; 2;     }  In proto a field mask for &#x60;Profile&#x60; may look as such:      mask {       paths: \&quot;user.display_name\&quot;       paths: \&quot;photo\&quot;     }  In JSON, the same mask is represented as below:      {       mask: \&quot;user.displayName,photo\&quot;     }  # Field Masks and Oneof Fields  Field masks treat fields in oneofs just as regular fields. Consider the following message:      message SampleMessage {       oneof test_oneof {         string name &#x3D; 4;         SubMessage sub_message &#x3D; 9;       }     }  The field mask can be:      mask {       paths: \&quot;name\&quot;     }  Or:      mask {       paths: \&quot;sub_message\&quot;     }  Note that oneof type names (\&quot;test_oneof\&quot; in this case) cannot be used in paths.  ## Field Mask Verification  The implementation of any API method which has a FieldMask type field in the request should verify the included field paths, and return an &#x60;INVALID_ARGUMENT&#x60; error if any path is unmappable.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class ProtobufFieldMask {
  public static final String SERIALIZED_NAME_PATHS = "paths";
  @SerializedName(SERIALIZED_NAME_PATHS)
  private List<String> paths = new ArrayList<>();

  public ProtobufFieldMask() {
  }

  public ProtobufFieldMask paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public ProtobufFieldMask addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * The set of field mask paths.
   * @return paths
  **/
  @javax.annotation.Nullable
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtobufFieldMask protobufFieldMask = (ProtobufFieldMask) o;
    return Objects.equals(this.paths, protobufFieldMask.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtobufFieldMask {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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
    openapiFields.add("paths");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProtobufFieldMask
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProtobufFieldMask.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProtobufFieldMask is not found in the empty JSON string", ProtobufFieldMask.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProtobufFieldMask.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProtobufFieldMask` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("paths") != null && !jsonObj.get("paths").isJsonNull() && !jsonObj.get("paths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paths` to be an array in the JSON string but got `%s`", jsonObj.get("paths").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProtobufFieldMask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProtobufFieldMask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProtobufFieldMask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProtobufFieldMask.class));

       return (TypeAdapter<T>) new TypeAdapter<ProtobufFieldMask>() {
           @Override
           public void write(JsonWriter out, ProtobufFieldMask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProtobufFieldMask read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProtobufFieldMask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProtobufFieldMask
  * @throws IOException if the JSON string is invalid with respect to ProtobufFieldMask
  */
  public static ProtobufFieldMask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProtobufFieldMask.class);
  }

 /**
  * Convert an instance of ProtobufFieldMask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

