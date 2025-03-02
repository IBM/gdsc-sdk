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

import com.ibm.security.ApiException;
import com.ibm.security.guardium.RuntimeError;
import com.ibm.security.guardium.Templatesv3CreateIntegrationRequest;
import com.ibm.security.guardium.Templatesv3CreateIntegrationResponse;
import com.ibm.security.guardium.Templatesv3CreateTemplateRequest;
import com.ibm.security.guardium.Templatesv3CreateTemplateResponse;
import com.ibm.security.guardium.Templatesv3DeleteIntegrationResponse;
import com.ibm.security.guardium.Templatesv3DeleteTemplateResponse;
import com.ibm.security.guardium.Templatesv3GetOriginDefaultContentResponse;
import com.ibm.security.guardium.Templatesv3GetOriginFieldsResponse;
import com.ibm.security.guardium.Templatesv3GetTemplateResponse;
import com.ibm.security.guardium.Templatesv3GetTemplatesForEdgeResponse;
import com.ibm.security.guardium.Templatesv3GetTemplatesResponse;
import com.ibm.security.guardium.Templatesv3TestTemplateRequest;
import com.ibm.security.guardium.Templatesv3TestTemplateResponse;
import com.ibm.security.guardium.Templatesv3TransformTemplateJSONRequest;
import com.ibm.security.guardium.Templatesv3TransformTemplateJSONResponse;
import com.ibm.security.guardium.Templatesv3TransformTemplateRequest;
import com.ibm.security.guardium.Templatesv3TransformTemplateResponse;
import com.ibm.security.guardium.Templatesv3UpdateTemplateRequest;
import com.ibm.security.guardium.Templatesv3UpdateTemplateResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesServiceApi
 */
@Disabled
public class TemplatesServiceApiTest {

    private final TemplatesServiceApi api = new TemplatesServiceApi();

    /**
     * Summary: Create integration Description: Create a set of new templates for a new integration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceCreateIntegrationTest() throws ApiException {
        Templatesv3CreateIntegrationRequest templatesv3CreateIntegrationRequest = null;
        Templatesv3CreateIntegrationResponse response = api.templatesServiceCreateIntegration(templatesv3CreateIntegrationRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create template Description: Create a new template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceCreateTemplateTest() throws ApiException {
        Templatesv3CreateTemplateRequest templatesv3CreateTemplateRequest = null;
        Templatesv3CreateTemplateResponse response = api.templatesServiceCreateTemplate(templatesv3CreateTemplateRequest);
        // TODO: test validations
    }

    /**
     * Summary: Delete integration Description: Delete all templates associated with an integration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceDeleteIntegrationTest() throws ApiException {
        String integrationId = null;
        Templatesv3DeleteIntegrationResponse response = api.templatesServiceDeleteIntegration(integrationId);
        // TODO: test validations
    }

    /**
     * Summary: Delete template Description: Delete a specific template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceDeleteTemplateTest() throws ApiException {
        String templateId = null;
        Templatesv3DeleteTemplateResponse response = api.templatesServiceDeleteTemplate(templateId);
        // TODO: test validations
    }

    /**
     * Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceGetOriginDefaultContentTest() throws ApiException {
        String origin = null;
        String integration = null;
        String mimeType = null;
        Templatesv3GetOriginDefaultContentResponse response = api.templatesServiceGetOriginDefaultContent(origin, integration, mimeType);
        // TODO: test validations
    }

    /**
     * Summary: Get origin fields Description: Return the fields available with a specific origin.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceGetOriginFieldsTest() throws ApiException {
        String origin = null;
        Templatesv3GetOriginFieldsResponse response = api.templatesServiceGetOriginFields(origin);
        // TODO: test validations
    }

    /**
     * Summary: Get template Description: Return a specific template by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceGetTemplateTest() throws ApiException {
        String templateId = null;
        Boolean includeIntegrationName = null;
        Templatesv3GetTemplateResponse response = api.templatesServiceGetTemplate(templateId, includeIntegrationName);
        // TODO: test validations
    }

    /**
     * Summary: Get templates Description: Return all templates based on supplied filters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceGetTemplatesTest() throws ApiException {
        String integrationId = null;
        List<String> filterIntegration = null;
        List<String> filterOrigin = null;
        List<String> filterMimeType = null;
        List<String> filterTags = null;
        Boolean filterEnabledOnly = null;
        Boolean includeIntegrationName = null;
        Templatesv3GetTemplatesResponse response = api.templatesServiceGetTemplates(integrationId, filterIntegration, filterOrigin, filterMimeType, filterTags, filterEnabledOnly, includeIntegrationName);
        // TODO: test validations
    }

    /**
     * Summary: Get templates for edge Description: Return all templates based on supplied filters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceGetTemplatesForEdgeTest() throws ApiException {
        String integrationId = null;
        List<String> filterOrigin = null;
        Boolean filterEnabledOnly = null;
        Boolean includeIntegrationName = null;
        Boolean transformToGdpFormat = null;
        Templatesv3GetTemplatesForEdgeResponse response = api.templatesServiceGetTemplatesForEdge(integrationId, filterOrigin, filterEnabledOnly, includeIntegrationName, transformToGdpFormat);
        // TODO: test validations
    }

    /**
     * Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceTestTemplateTest() throws ApiException {
        Templatesv3TestTemplateRequest templatesv3TestTemplateRequest = null;
        Templatesv3TestTemplateResponse response = api.templatesServiceTestTemplate(templatesv3TestTemplateRequest);
        // TODO: test validations
    }

    /**
     * Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceTransformTemplateTest() throws ApiException {
        Templatesv3TransformTemplateRequest templatesv3TransformTemplateRequest = null;
        Templatesv3TransformTemplateResponse response = api.templatesServiceTransformTemplate(templatesv3TransformTemplateRequest);
        // TODO: test validations
    }

    /**
     * Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceTransformTemplateJSONTest() throws ApiException {
        Templatesv3TransformTemplateJSONRequest templatesv3TransformTemplateJSONRequest = null;
        Templatesv3TransformTemplateJSONResponse response = api.templatesServiceTransformTemplateJSON(templatesv3TransformTemplateJSONRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update template Description: Update a single template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templatesServiceUpdateTemplateTest() throws ApiException {
        String templateId = null;
        Templatesv3UpdateTemplateRequest templatesv3UpdateTemplateRequest = null;
        Templatesv3UpdateTemplateResponse response = api.templatesServiceUpdateTemplate(templateId, templatesv3UpdateTemplateRequest);
        // TODO: test validations
    }

}
