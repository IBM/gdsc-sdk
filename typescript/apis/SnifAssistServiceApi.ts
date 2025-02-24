// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { RuntimeError } from '../models/RuntimeError';
import { Snifassistv3GetSnifConfigResponse } from '../models/Snifassistv3GetSnifConfigResponse';
import { Snifassistv3PostSnifFeedbackRequest } from '../models/Snifassistv3PostSnifFeedbackRequest';
import { Snifassistv3StatusResponseBase } from '../models/Snifassistv3StatusResponseBase';
import { Snifassistv3TestRegexRequest } from '../models/Snifassistv3TestRegexRequest';

/**
 * no description
 */
export class SnifAssistServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
     * @param tenantId Provide tenant_id.
     * @param edgeId Provide edge_id.
     * @param configType Provide configuration type.
     * @param configId Specify config_id provided by configuration service.
     * @param configurationParametersCrc Provide CRC value of configuration parameters that sniffer is currently using.
     */
    public async snifAssistServiceGetSnifConfig(tenantId?: string, edgeId?: string, configType?: string, configId?: string, configurationParametersCrc?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;






        // Path Params
        const localVarPath = '/api/v3/snif/config';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (tenantId !== undefined) {
            requestContext.setQueryParam("tenant_id", ObjectSerializer.serialize(tenantId, "string", ""));
        }

        // Query Params
        if (edgeId !== undefined) {
            requestContext.setQueryParam("edge_id", ObjectSerializer.serialize(edgeId, "string", ""));
        }

        // Query Params
        if (configType !== undefined) {
            requestContext.setQueryParam("config_type", ObjectSerializer.serialize(configType, "string", ""));
        }

        // Query Params
        if (configId !== undefined) {
            requestContext.setQueryParam("config_id", ObjectSerializer.serialize(configId, "string", ""));
        }

        // Query Params
        if (configurationParametersCrc !== undefined) {
            requestContext.setQueryParam("configuration_parameters_crc", ObjectSerializer.serialize(configurationParametersCrc, "number", "int64"));
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
     * Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
     * @param tenantId Specify tenant_id.
     * @param edgeId Specify edge_id if known.
     * @param policyCrc Provide CRC value of installed policy that sniffer is currently using.
     */
    public async snifAssistServiceGetSnifPolicy(tenantId?: string, edgeId?: string, policyCrc?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;




        // Path Params
        const localVarPath = '/api/v3/snif/policy';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (tenantId !== undefined) {
            requestContext.setQueryParam("tenant_id", ObjectSerializer.serialize(tenantId, "string", ""));
        }

        // Query Params
        if (edgeId !== undefined) {
            requestContext.setQueryParam("edge_id", ObjectSerializer.serialize(edgeId, "string", ""));
        }

        // Query Params
        if (policyCrc !== undefined) {
            requestContext.setQueryParam("policy_crc", ObjectSerializer.serialize(policyCrc, "number", "int64"));
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
     * Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
     * @param snifassistv3PostSnifFeedbackRequest 
     */
    public async snifAssistServicePostSnifFeedback(snifassistv3PostSnifFeedbackRequest: Snifassistv3PostSnifFeedbackRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'snifassistv3PostSnifFeedbackRequest' is not null or undefined
        if (snifassistv3PostSnifFeedbackRequest === null || snifassistv3PostSnifFeedbackRequest === undefined) {
            throw new RequiredError("SnifAssistServiceApi", "snifAssistServicePostSnifFeedback", "snifassistv3PostSnifFeedbackRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/snif/feedback';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(snifassistv3PostSnifFeedbackRequest, "Snifassistv3PostSnifFeedbackRequest", ""),
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
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
     * @param snifassistv3TestRegexRequest 
     */
    public async snifAssistServiceTestRegex(snifassistv3TestRegexRequest: Snifassistv3TestRegexRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'snifassistv3TestRegexRequest' is not null or undefined
        if (snifassistv3TestRegexRequest === null || snifassistv3TestRegexRequest === undefined) {
            throw new RequiredError("SnifAssistServiceApi", "snifAssistServiceTestRegex", "snifassistv3TestRegexRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/snif/test_regex';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(snifassistv3TestRegexRequest, "Snifassistv3TestRegexRequest", ""),
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

export class SnifAssistServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to snifAssistServiceGetSnifConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async snifAssistServiceGetSnifConfigWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Snifassistv3GetSnifConfigResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Snifassistv3GetSnifConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3GetSnifConfigResponse", ""
            ) as Snifassistv3GetSnifConfigResponse;
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
            const body: Snifassistv3GetSnifConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3GetSnifConfigResponse", ""
            ) as Snifassistv3GetSnifConfigResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to snifAssistServiceGetSnifPolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async snifAssistServiceGetSnifPolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Snifassistv3StatusResponseBase >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Snifassistv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3StatusResponseBase", ""
            ) as Snifassistv3StatusResponseBase;
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
            const body: Snifassistv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3StatusResponseBase", ""
            ) as Snifassistv3StatusResponseBase;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to snifAssistServicePostSnifFeedback
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async snifAssistServicePostSnifFeedbackWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Snifassistv3StatusResponseBase >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Snifassistv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3StatusResponseBase", ""
            ) as Snifassistv3StatusResponseBase;
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
            const body: Snifassistv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3StatusResponseBase", ""
            ) as Snifassistv3StatusResponseBase;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to snifAssistServiceTestRegex
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async snifAssistServiceTestRegexWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Snifassistv3StatusResponseBase >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Snifassistv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3StatusResponseBase", ""
            ) as Snifassistv3StatusResponseBase;
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
            const body: Snifassistv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Snifassistv3StatusResponseBase", ""
            ) as Snifassistv3StatusResponseBase;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
