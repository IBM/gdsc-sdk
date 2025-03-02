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
import com.ibm.security.guardium.IdpMetadataContent;
import com.ibm.security.guardium.IdpMetadataUrl;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.ibm.security.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class ConfigureSSORequestIdpMetadata extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ConfigureSSORequestIdpMetadata.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConfigureSSORequestIdpMetadata.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConfigureSSORequestIdpMetadata' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<IdpMetadataUrl> adapterIdpMetadataUrl = gson.getDelegateAdapter(this, TypeToken.get(IdpMetadataUrl.class));
            final TypeAdapter<IdpMetadataContent> adapterIdpMetadataContent = gson.getDelegateAdapter(this, TypeToken.get(IdpMetadataContent.class));

            return (TypeAdapter<T>) new TypeAdapter<ConfigureSSORequestIdpMetadata>() {
                @Override
                public void write(JsonWriter out, ConfigureSSORequestIdpMetadata value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `IdpMetadataUrl`
                    if (value.getActualInstance() instanceof IdpMetadataUrl) {
                        JsonElement element = adapterIdpMetadataUrl.toJsonTree((IdpMetadataUrl)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `IdpMetadataContent`
                    if (value.getActualInstance() instanceof IdpMetadataContent) {
                        JsonElement element = adapterIdpMetadataContent.toJsonTree((IdpMetadataContent)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: IdpMetadataContent, IdpMetadataUrl");
                }

                @Override
                public ConfigureSSORequestIdpMetadata read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize IdpMetadataUrl
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IdpMetadataUrl.validateJsonElement(jsonElement);
                        actualAdapter = adapterIdpMetadataUrl;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IdpMetadataUrl'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IdpMetadataUrl failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IdpMetadataUrl'", e);
                    }
                    // deserialize IdpMetadataContent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IdpMetadataContent.validateJsonElement(jsonElement);
                        actualAdapter = adapterIdpMetadataContent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IdpMetadataContent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IdpMetadataContent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IdpMetadataContent'", e);
                    }

                    if (match == 1) {
                        ConfigureSSORequestIdpMetadata ret = new ConfigureSSORequestIdpMetadata();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ConfigureSSORequestIdpMetadata: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ConfigureSSORequestIdpMetadata() {
        super("oneOf", Boolean.FALSE);
    }

    public ConfigureSSORequestIdpMetadata(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("IdpMetadataUrl", IdpMetadataUrl.class);
        schemas.put("IdpMetadataContent", IdpMetadataContent.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ConfigureSSORequestIdpMetadata.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IdpMetadataContent, IdpMetadataUrl
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof IdpMetadataUrl) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof IdpMetadataContent) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be IdpMetadataContent, IdpMetadataUrl");
    }

    /**
     * Get the actual instance, which can be the following:
     * IdpMetadataContent, IdpMetadataUrl
     *
     * @return The actual instance (IdpMetadataContent, IdpMetadataUrl)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `IdpMetadataUrl`. If the actual instance is not `IdpMetadataUrl`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IdpMetadataUrl`
     * @throws ClassCastException if the instance is not `IdpMetadataUrl`
     */
    public IdpMetadataUrl getIdpMetadataUrl() throws ClassCastException {
        return (IdpMetadataUrl)super.getActualInstance();
    }
    /**
     * Get the actual instance of `IdpMetadataContent`. If the actual instance is not `IdpMetadataContent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IdpMetadataContent`
     * @throws ClassCastException if the instance is not `IdpMetadataContent`
     */
    public IdpMetadataContent getIdpMetadataContent() throws ClassCastException {
        return (IdpMetadataContent)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ConfigureSSORequestIdpMetadata
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with IdpMetadataUrl
        try {
            IdpMetadataUrl.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IdpMetadataUrl failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with IdpMetadataContent
        try {
            IdpMetadataContent.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IdpMetadataContent failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ConfigureSSORequestIdpMetadata with oneOf schemas: IdpMetadataContent, IdpMetadataUrl. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ConfigureSSORequestIdpMetadata given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConfigureSSORequestIdpMetadata
     * @throws IOException if the JSON string is invalid with respect to ConfigureSSORequestIdpMetadata
     */
    public static ConfigureSSORequestIdpMetadata fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConfigureSSORequestIdpMetadata.class);
    }

    /**
     * Convert an instance of ConfigureSSORequestIdpMetadata to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

