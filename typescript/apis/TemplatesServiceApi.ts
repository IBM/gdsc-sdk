// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { RuntimeError } from '../models/RuntimeError';
import { Templatesv3CreateIntegrationRequest } from '../models/Templatesv3CreateIntegrationRequest';
import { Templatesv3CreateIntegrationResponse } from '../models/Templatesv3CreateIntegrationResponse';
import { Templatesv3CreateTemplateRequest } from '../models/Templatesv3CreateTemplateRequest';
import { Templatesv3CreateTemplateResponse } from '../models/Templatesv3CreateTemplateResponse';
import { Templatesv3DeleteIntegrationResponse } from '../models/Templatesv3DeleteIntegrationResponse';
import { Templatesv3DeleteTemplateResponse } from '../models/Templatesv3DeleteTemplateResponse';
import { Templatesv3GetOriginDefaultContentResponse } from '../models/Templatesv3GetOriginDefaultContentResponse';
import { Templatesv3GetOriginFieldsResponse } from '../models/Templatesv3GetOriginFieldsResponse';
import { Templatesv3GetTemplateResponse } from '../models/Templatesv3GetTemplateResponse';
import { Templatesv3GetTemplatesForEdgeResponse } from '../models/Templatesv3GetTemplatesForEdgeResponse';
import { Templatesv3GetTemplatesResponse } from '../models/Templatesv3GetTemplatesResponse';
import { Templatesv3TestTemplateRequest } from '../models/Templatesv3TestTemplateRequest';
import { Templatesv3TestTemplateResponse } from '../models/Templatesv3TestTemplateResponse';
import { Templatesv3TransformTemplateJSONRequest } from '../models/Templatesv3TransformTemplateJSONRequest';
import { Templatesv3TransformTemplateJSONResponse } from '../models/Templatesv3TransformTemplateJSONResponse';
import { Templatesv3TransformTemplateRequest } from '../models/Templatesv3TransformTemplateRequest';
import { Templatesv3TransformTemplateResponse } from '../models/Templatesv3TransformTemplateResponse';
import { Templatesv3UpdateTemplateRequest } from '../models/Templatesv3UpdateTemplateRequest';
import { Templatesv3UpdateTemplateResponse } from '../models/Templatesv3UpdateTemplateResponse';

/**
 * no description
 */
export class TemplatesServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create integration Description: Create a set of new templates for a new integration.
     * @param templatesv3CreateIntegrationRequest 
     */
    public async templatesServiceCreateIntegration(templatesv3CreateIntegrationRequest: Templatesv3CreateIntegrationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templatesv3CreateIntegrationRequest' is not null or undefined
        if (templatesv3CreateIntegrationRequest === null || templatesv3CreateIntegrationRequest === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceCreateIntegration", "templatesv3CreateIntegrationRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/integration';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(templatesv3CreateIntegrationRequest, "Templatesv3CreateIntegrationRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Create template Description: Create a new template.
     * @param templatesv3CreateTemplateRequest 
     */
    public async templatesServiceCreateTemplate(templatesv3CreateTemplateRequest: Templatesv3CreateTemplateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templatesv3CreateTemplateRequest' is not null or undefined
        if (templatesv3CreateTemplateRequest === null || templatesv3CreateTemplateRequest === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceCreateTemplate", "templatesv3CreateTemplateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/templates';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(templatesv3CreateTemplateRequest, "Templatesv3CreateTemplateRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Delete integration Description: Delete all templates associated with an integration.
     * @param integrationId Delete the templates associated with the specified integration ID.
     */
    public async templatesServiceDeleteIntegration(integrationId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'integrationId' is not null or undefined
        if (integrationId === null || integrationId === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceDeleteIntegration", "integrationId");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/integrations/{integration_id}'
            .replace('{' + 'integration_id' + '}', encodeURIComponent(String(integrationId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Delete template Description: Delete a specific template.
     * @param templateId Delete the template with the specified unique ID.
     */
    public async templatesServiceDeleteTemplate(templateId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templateId' is not null or undefined
        if (templateId === null || templateId === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceDeleteTemplate", "templateId");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/{template_id}'
            .replace('{' + 'template_id' + '}', encodeURIComponent(String(templateId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
     * @param origin Origin for the desired content.
     * @param integration Integration provides the context for the Request.
     * @param mimeType MIME type for the desired content.
     */
    public async templatesServiceGetOriginDefaultContent(origin: 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION', integration?: 'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA', mimeType?: 'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'origin' is not null or undefined
        if (origin === null || origin === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceGetOriginDefaultContent", "origin");
        }




        // Path Params
        const localVarPath = '/api/v3/templates/origins/{origin}/content'
            .replace('{' + 'origin' + '}', encodeURIComponent(String(origin)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (integration !== undefined) {
            requestContext.setQueryParam("integration", ObjectSerializer.serialize(integration, "'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA'", ""));
        }

        // Query Params
        if (mimeType !== undefined) {
            requestContext.setQueryParam("mime_type", ObjectSerializer.serialize(mimeType, "'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF'", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get origin fields Description: Return the fields available with a specific origin.
     * @param origin Origin for the desired fields.
     */
    public async templatesServiceGetOriginFields(origin: 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'origin' is not null or undefined
        if (origin === null || origin === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceGetOriginFields", "origin");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/origins/{origin}/fields'
            .replace('{' + 'origin' + '}', encodeURIComponent(String(origin)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get template Description: Return a specific template by id.
     * @param templateId The unique ID for the template to fetch.
     * @param includeIntegrationName Include the Integration name in the returned template.
     */
    public async templatesServiceGetTemplate(templateId: string, includeIntegrationName?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templateId' is not null or undefined
        if (templateId === null || templateId === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceGetTemplate", "templateId");
        }



        // Path Params
        const localVarPath = '/api/v3/templates/{template_id}'
            .replace('{' + 'template_id' + '}', encodeURIComponent(String(templateId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (includeIntegrationName !== undefined) {
            requestContext.setQueryParam("include_integration_name", ObjectSerializer.serialize(includeIntegrationName, "boolean", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get templates Description: Return all templates based on supplied filters.
     * @param integrationId Filter on templates associated with a specific integration.
     * @param filterIntegration Filter on a set of integrations; ignored if empty.
     * @param filterOrigin Filter on a specific set of data origins; ignored if empty.
     * @param filterMimeType Filter on specific mime types; ignored if empty.
     * @param filterTags Filter on specific tags; ignored if empty.
     * @param filterEnabledOnly Filter on all templates instead of just the enabled templates.
     * @param includeIntegrationName Include the Integration name in the returned templates.
     */
    public async templatesServiceGetTemplates(integrationId?: string, filterIntegration?: Array<'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA'>, filterOrigin?: Array<'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION'>, filterMimeType?: Array<'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF'>, filterTags?: Array<string>, filterEnabledOnly?: boolean, includeIntegrationName?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;








        // Path Params
        const localVarPath = '/api/v3/templates';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (integrationId !== undefined) {
            requestContext.setQueryParam("integration_id", ObjectSerializer.serialize(integrationId, "string", ""));
        }

        // Query Params
        if (filterIntegration !== undefined) {
            requestContext.setQueryParam("filter_integration", ObjectSerializer.serialize(filterIntegration, "Array<'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA'>", ""));
        }

        // Query Params
        if (filterOrigin !== undefined) {
            requestContext.setQueryParam("filter_origin", ObjectSerializer.serialize(filterOrigin, "Array<'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION'>", ""));
        }

        // Query Params
        if (filterMimeType !== undefined) {
            requestContext.setQueryParam("filter_mime_type", ObjectSerializer.serialize(filterMimeType, "Array<'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF'>", ""));
        }

        // Query Params
        if (filterTags !== undefined) {
            requestContext.setQueryParam("filter_tags", ObjectSerializer.serialize(filterTags, "Array<string>", ""));
        }

        // Query Params
        if (filterEnabledOnly !== undefined) {
            requestContext.setQueryParam("filter_enabled_only", ObjectSerializer.serialize(filterEnabledOnly, "boolean", ""));
        }

        // Query Params
        if (includeIntegrationName !== undefined) {
            requestContext.setQueryParam("include_integration_name", ObjectSerializer.serialize(includeIntegrationName, "boolean", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get templates for edge Description: Return all templates based on supplied filters.
     * @param integrationId Templates associated with a specific integration.
     * @param filterOrigin Filter on a specific set of data origins; ignored if empty.
     * @param filterEnabledOnly Filter on all templates instead of just the enabled templates.
     * @param includeIntegrationName Include the Integration name in the returned templates.
     * @param transformToGdpFormat Tranform template format to GDP style format.
     */
    public async templatesServiceGetTemplatesForEdge(integrationId?: string, filterOrigin?: Array<'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION'>, filterEnabledOnly?: boolean, includeIntegrationName?: boolean, transformToGdpFormat?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;






        // Path Params
        const localVarPath = '/api/v3/templates/edge';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (integrationId !== undefined) {
            requestContext.setQueryParam("integration_id", ObjectSerializer.serialize(integrationId, "string", ""));
        }

        // Query Params
        if (filterOrigin !== undefined) {
            requestContext.setQueryParam("filter_origin", ObjectSerializer.serialize(filterOrigin, "Array<'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION'>", ""));
        }

        // Query Params
        if (filterEnabledOnly !== undefined) {
            requestContext.setQueryParam("filter_enabled_only", ObjectSerializer.serialize(filterEnabledOnly, "boolean", ""));
        }

        // Query Params
        if (includeIntegrationName !== undefined) {
            requestContext.setQueryParam("include_integration_name", ObjectSerializer.serialize(includeIntegrationName, "boolean", ""));
        }

        // Query Params
        if (transformToGdpFormat !== undefined) {
            requestContext.setQueryParam("transform_to_gdp_format", ObjectSerializer.serialize(transformToGdpFormat, "boolean", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
     * @param templatesv3TestTemplateRequest 
     */
    public async templatesServiceTestTemplate(templatesv3TestTemplateRequest: Templatesv3TestTemplateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templatesv3TestTemplateRequest' is not null or undefined
        if (templatesv3TestTemplateRequest === null || templatesv3TestTemplateRequest === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceTestTemplate", "templatesv3TestTemplateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/test';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(templatesv3TestTemplateRequest, "Templatesv3TestTemplateRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
     * @param templatesv3TransformTemplateRequest 
     */
    public async templatesServiceTransformTemplate(templatesv3TransformTemplateRequest: Templatesv3TransformTemplateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templatesv3TransformTemplateRequest' is not null or undefined
        if (templatesv3TransformTemplateRequest === null || templatesv3TransformTemplateRequest === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceTransformTemplate", "templatesv3TransformTemplateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/transform';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(templatesv3TransformTemplateRequest, "Templatesv3TransformTemplateRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
     * @param templatesv3TransformTemplateJSONRequest 
     */
    public async templatesServiceTransformTemplateJSON(templatesv3TransformTemplateJSONRequest: Templatesv3TransformTemplateJSONRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templatesv3TransformTemplateJSONRequest' is not null or undefined
        if (templatesv3TransformTemplateJSONRequest === null || templatesv3TransformTemplateJSONRequest === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceTransformTemplateJSON", "templatesv3TransformTemplateJSONRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/transformjson';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(templatesv3TransformTemplateJSONRequest, "Templatesv3TransformTemplateJSONRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Update template Description: Update a single template.
     * @param templateId The template id to update.
     * @param templatesv3UpdateTemplateRequest 
     */
    public async templatesServiceUpdateTemplate(templateId: string, templatesv3UpdateTemplateRequest: Templatesv3UpdateTemplateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templateId' is not null or undefined
        if (templateId === null || templateId === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceUpdateTemplate", "templateId");
        }


        // verify required parameter 'templatesv3UpdateTemplateRequest' is not null or undefined
        if (templatesv3UpdateTemplateRequest === null || templatesv3UpdateTemplateRequest === undefined) {
            throw new RequiredError("TemplatesServiceApi", "templatesServiceUpdateTemplate", "templatesv3UpdateTemplateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/templates/{template_id}'
            .replace('{' + 'template_id' + '}', encodeURIComponent(String(templateId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(templatesv3UpdateTemplateRequest, "Templatesv3UpdateTemplateRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class TemplatesServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceCreateIntegration
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceCreateIntegrationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3CreateIntegrationResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3CreateIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3CreateIntegrationResponse", ""
            ) as Templatesv3CreateIntegrationResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3CreateIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3CreateIntegrationResponse", ""
            ) as Templatesv3CreateIntegrationResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceCreateTemplate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceCreateTemplateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3CreateTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3CreateTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3CreateTemplateResponse", ""
            ) as Templatesv3CreateTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3CreateTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3CreateTemplateResponse", ""
            ) as Templatesv3CreateTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceDeleteIntegration
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceDeleteIntegrationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3DeleteIntegrationResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3DeleteIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3DeleteIntegrationResponse", ""
            ) as Templatesv3DeleteIntegrationResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3DeleteIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3DeleteIntegrationResponse", ""
            ) as Templatesv3DeleteIntegrationResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceDeleteTemplate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceDeleteTemplateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3DeleteTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3DeleteTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3DeleteTemplateResponse", ""
            ) as Templatesv3DeleteTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3DeleteTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3DeleteTemplateResponse", ""
            ) as Templatesv3DeleteTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceGetOriginDefaultContent
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceGetOriginDefaultContentWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3GetOriginDefaultContentResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3GetOriginDefaultContentResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetOriginDefaultContentResponse", ""
            ) as Templatesv3GetOriginDefaultContentResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3GetOriginDefaultContentResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetOriginDefaultContentResponse", ""
            ) as Templatesv3GetOriginDefaultContentResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceGetOriginFields
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceGetOriginFieldsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3GetOriginFieldsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3GetOriginFieldsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetOriginFieldsResponse", ""
            ) as Templatesv3GetOriginFieldsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3GetOriginFieldsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetOriginFieldsResponse", ""
            ) as Templatesv3GetOriginFieldsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceGetTemplate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceGetTemplateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3GetTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3GetTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetTemplateResponse", ""
            ) as Templatesv3GetTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3GetTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetTemplateResponse", ""
            ) as Templatesv3GetTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceGetTemplates
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceGetTemplatesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3GetTemplatesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3GetTemplatesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetTemplatesResponse", ""
            ) as Templatesv3GetTemplatesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3GetTemplatesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetTemplatesResponse", ""
            ) as Templatesv3GetTemplatesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceGetTemplatesForEdge
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceGetTemplatesForEdgeWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3GetTemplatesForEdgeResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3GetTemplatesForEdgeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetTemplatesForEdgeResponse", ""
            ) as Templatesv3GetTemplatesForEdgeResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3GetTemplatesForEdgeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3GetTemplatesForEdgeResponse", ""
            ) as Templatesv3GetTemplatesForEdgeResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceTestTemplate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceTestTemplateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3TestTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3TestTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3TestTemplateResponse", ""
            ) as Templatesv3TestTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3TestTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3TestTemplateResponse", ""
            ) as Templatesv3TestTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceTransformTemplate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceTransformTemplateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3TransformTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3TransformTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3TransformTemplateResponse", ""
            ) as Templatesv3TransformTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3TransformTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3TransformTemplateResponse", ""
            ) as Templatesv3TransformTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceTransformTemplateJSON
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceTransformTemplateJSONWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3TransformTemplateJSONResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3TransformTemplateJSONResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3TransformTemplateJSONResponse", ""
            ) as Templatesv3TransformTemplateJSONResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3TransformTemplateJSONResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3TransformTemplateJSONResponse", ""
            ) as Templatesv3TransformTemplateJSONResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to templatesServiceUpdateTemplate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async templatesServiceUpdateTemplateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Templatesv3UpdateTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Templatesv3UpdateTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3UpdateTemplateResponse", ""
            ) as Templatesv3UpdateTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Templatesv3UpdateTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Templatesv3UpdateTemplateResponse", ""
            ) as Templatesv3UpdateTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
