// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Analyticseventsv3DeleteCacheKeyRequest } from '../models/Analyticseventsv3DeleteCacheKeyRequest';
import { Analyticseventsv3DeleteCacheKeyResponse } from '../models/Analyticseventsv3DeleteCacheKeyResponse';
import { Analyticseventsv3PostQSAdvisorRiskRequest } from '../models/Analyticseventsv3PostQSAdvisorRiskRequest';
import { Analyticseventsv3PostQSAdvisorRiskResponse } from '../models/Analyticseventsv3PostQSAdvisorRiskResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class AnalyticsEventsServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Delete cache key Description: Return delete key result message.
     * @param cacheKey The cache key to delete.
     * @param analyticseventsv3DeleteCacheKeyRequest 
     */
    public async analyticsEventsServiceDeleteCacheKey(cacheKey: string, analyticseventsv3DeleteCacheKeyRequest: Analyticseventsv3DeleteCacheKeyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'cacheKey' is not null or undefined
        if (cacheKey === null || cacheKey === undefined) {
            throw new RequiredError("AnalyticsEventsServiceApi", "analyticsEventsServiceDeleteCacheKey", "cacheKey");
        }


        // verify required parameter 'analyticseventsv3DeleteCacheKeyRequest' is not null or undefined
        if (analyticseventsv3DeleteCacheKeyRequest === null || analyticseventsv3DeleteCacheKeyRequest === undefined) {
            throw new RequiredError("AnalyticsEventsServiceApi", "analyticsEventsServiceDeleteCacheKey", "analyticseventsv3DeleteCacheKeyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/eventscache/{cache_key}'
            .replace('{' + 'cache_key' + '}', encodeURIComponent(String(cacheKey)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(analyticseventsv3DeleteCacheKeyRequest, "Analyticseventsv3DeleteCacheKeyRequest", ""),
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
     * Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status
     * @param analyticseventsv3PostQSAdvisorRiskRequest 
     */
    public async analyticsEventsServicePostQSAdvisorRisk(analyticseventsv3PostQSAdvisorRiskRequest: Analyticseventsv3PostQSAdvisorRiskRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'analyticseventsv3PostQSAdvisorRiskRequest' is not null or undefined
        if (analyticseventsv3PostQSAdvisorRiskRequest === null || analyticseventsv3PostQSAdvisorRiskRequest === undefined) {
            throw new RequiredError("AnalyticsEventsServiceApi", "analyticsEventsServicePostQSAdvisorRisk", "analyticseventsv3PostQSAdvisorRiskRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk/qs_advisor';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(analyticseventsv3PostQSAdvisorRiskRequest, "Analyticseventsv3PostQSAdvisorRiskRequest", ""),
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

export class AnalyticsEventsServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to analyticsEventsServiceDeleteCacheKey
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async analyticsEventsServiceDeleteCacheKeyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Analyticseventsv3DeleteCacheKeyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Analyticseventsv3DeleteCacheKeyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyticseventsv3DeleteCacheKeyResponse", ""
            ) as Analyticseventsv3DeleteCacheKeyResponse;
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
            const body: Analyticseventsv3DeleteCacheKeyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyticseventsv3DeleteCacheKeyResponse", ""
            ) as Analyticseventsv3DeleteCacheKeyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to analyticsEventsServicePostQSAdvisorRisk
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async analyticsEventsServicePostQSAdvisorRiskWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Analyticseventsv3PostQSAdvisorRiskResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Analyticseventsv3PostQSAdvisorRiskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyticseventsv3PostQSAdvisorRiskResponse", ""
            ) as Analyticseventsv3PostQSAdvisorRiskResponse;
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
            const body: Analyticseventsv3PostQSAdvisorRiskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyticseventsv3PostQSAdvisorRiskResponse", ""
            ) as Analyticseventsv3PostQSAdvisorRiskResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
