// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Featureflagsv3DeleteFeatureFlagOverridesResponse } from '../models/Featureflagsv3DeleteFeatureFlagOverridesResponse';
import { Featureflagsv3GetFeatureFlagOverridesResponse } from '../models/Featureflagsv3GetFeatureFlagOverridesResponse';
import { Featureflagsv3GetFeatureFlagsResponse } from '../models/Featureflagsv3GetFeatureFlagsResponse';
import { Featureflagsv3UpdateFeatureFlagOverridesRequest } from '../models/Featureflagsv3UpdateFeatureFlagOverridesRequest';
import { Featureflagsv3UpdateFeatureFlagOverridesResponse } from '../models/Featureflagsv3UpdateFeatureFlagOverridesResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class FeatureFlagsServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
     * @param flagName Flag name.
     * @param tenantId Optional tenant id.
     */
    public async featureFlagsServiceDeleteFeatureFlagOverrides(flagName?: string, tenantId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/feature_flags/overrides';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (flagName !== undefined) {
            requestContext.setQueryParam("flag_name", ObjectSerializer.serialize(flagName, "string", ""));
        }

        // Query Params
        if (tenantId !== undefined) {
            requestContext.setQueryParam("tenant_id", ObjectSerializer.serialize(tenantId, "string", ""));
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
     * Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
     * @param tenantId Optional tenant id.
     * @param flagNames Optional flag names; if empty then return all flag.
     */
    public async featureFlagsServiceGetFeatureFlagOverrides(tenantId?: string, flagNames?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/feature_flags/overrides';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (tenantId !== undefined) {
            requestContext.setQueryParam("tenant_id", ObjectSerializer.serialize(tenantId, "string", ""));
        }

        // Query Params
        if (flagNames !== undefined) {
            requestContext.setQueryParam("flag_names", ObjectSerializer.serialize(flagNames, "Array<string>", ""));
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
     * Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
     * @param tenantId Tenant id.
     * @param flagNames Optional flag names; if empty then return all flag.
     */
    public async featureFlagsServiceGetFeatureFlags(tenantId?: string, flagNames?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/feature_flags';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (tenantId !== undefined) {
            requestContext.setQueryParam("tenant_id", ObjectSerializer.serialize(tenantId, "string", ""));
        }

        // Query Params
        if (flagNames !== undefined) {
            requestContext.setQueryParam("flag_names", ObjectSerializer.serialize(flagNames, "Array<string>", ""));
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
     * Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
     * @param featureflagsv3UpdateFeatureFlagOverridesRequest 
     */
    public async featureFlagsServiceUpdateFeatureFlagOverrides(featureflagsv3UpdateFeatureFlagOverridesRequest: Featureflagsv3UpdateFeatureFlagOverridesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'featureflagsv3UpdateFeatureFlagOverridesRequest' is not null or undefined
        if (featureflagsv3UpdateFeatureFlagOverridesRequest === null || featureflagsv3UpdateFeatureFlagOverridesRequest === undefined) {
            throw new RequiredError("FeatureFlagsServiceApi", "featureFlagsServiceUpdateFeatureFlagOverrides", "featureflagsv3UpdateFeatureFlagOverridesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/feature_flags/overrides';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(featureflagsv3UpdateFeatureFlagOverridesRequest, "Featureflagsv3UpdateFeatureFlagOverridesRequest", ""),
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

export class FeatureFlagsServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to featureFlagsServiceDeleteFeatureFlagOverrides
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async featureFlagsServiceDeleteFeatureFlagOverridesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Featureflagsv3DeleteFeatureFlagOverridesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Featureflagsv3DeleteFeatureFlagOverridesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3DeleteFeatureFlagOverridesResponse", ""
            ) as Featureflagsv3DeleteFeatureFlagOverridesResponse;
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
            const body: Featureflagsv3DeleteFeatureFlagOverridesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3DeleteFeatureFlagOverridesResponse", ""
            ) as Featureflagsv3DeleteFeatureFlagOverridesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to featureFlagsServiceGetFeatureFlagOverrides
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async featureFlagsServiceGetFeatureFlagOverridesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Featureflagsv3GetFeatureFlagOverridesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Featureflagsv3GetFeatureFlagOverridesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3GetFeatureFlagOverridesResponse", ""
            ) as Featureflagsv3GetFeatureFlagOverridesResponse;
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
            const body: Featureflagsv3GetFeatureFlagOverridesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3GetFeatureFlagOverridesResponse", ""
            ) as Featureflagsv3GetFeatureFlagOverridesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to featureFlagsServiceGetFeatureFlags
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async featureFlagsServiceGetFeatureFlagsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Featureflagsv3GetFeatureFlagsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Featureflagsv3GetFeatureFlagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3GetFeatureFlagsResponse", ""
            ) as Featureflagsv3GetFeatureFlagsResponse;
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
            const body: Featureflagsv3GetFeatureFlagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3GetFeatureFlagsResponse", ""
            ) as Featureflagsv3GetFeatureFlagsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to featureFlagsServiceUpdateFeatureFlagOverrides
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async featureFlagsServiceUpdateFeatureFlagOverridesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Featureflagsv3UpdateFeatureFlagOverridesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Featureflagsv3UpdateFeatureFlagOverridesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3UpdateFeatureFlagOverridesResponse", ""
            ) as Featureflagsv3UpdateFeatureFlagOverridesResponse;
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
            const body: Featureflagsv3UpdateFeatureFlagOverridesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Featureflagsv3UpdateFeatureFlagOverridesResponse", ""
            ) as Featureflagsv3UpdateFeatureFlagOverridesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
