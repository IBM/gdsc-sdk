// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Riskanalyticsenginev3GetLeadGeneratorConfigResponse } from '../models/Riskanalyticsenginev3GetLeadGeneratorConfigResponse';
import { Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest } from '../models/Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest';
import { Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse } from '../models/Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class RiskAnalyticsEngineApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
     */
    public async riskAnalyticsEngineGetLeadGeneratorConfig(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/risk/lead_generator';

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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Update lead generator config Description: Update the configuration of a leads generator.
     * @param riskanalyticsenginev3UpdateLeadGeneratorConfigRequest 
     */
    public async riskAnalyticsEngineUpdateLeadGeneratorConfig(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest: Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskanalyticsenginev3UpdateLeadGeneratorConfigRequest' is not null or undefined
        if (riskanalyticsenginev3UpdateLeadGeneratorConfigRequest === null || riskanalyticsenginev3UpdateLeadGeneratorConfigRequest === undefined) {
            throw new RequiredError("RiskAnalyticsEngineApi", "riskAnalyticsEngineUpdateLeadGeneratorConfig", "riskanalyticsenginev3UpdateLeadGeneratorConfigRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk/lead_generator';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest, "Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest", ""),
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class RiskAnalyticsEngineApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsEngineGetLeadGeneratorConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsEngineGetLeadGeneratorConfigWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticsenginev3GetLeadGeneratorConfigResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticsenginev3GetLeadGeneratorConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsenginev3GetLeadGeneratorConfigResponse", ""
            ) as Riskanalyticsenginev3GetLeadGeneratorConfigResponse;
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
            const body: Riskanalyticsenginev3GetLeadGeneratorConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsenginev3GetLeadGeneratorConfigResponse", ""
            ) as Riskanalyticsenginev3GetLeadGeneratorConfigResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsEngineUpdateLeadGeneratorConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsEngineUpdateLeadGeneratorConfigWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse", ""
            ) as Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse;
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
            const body: Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse", ""
            ) as Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
