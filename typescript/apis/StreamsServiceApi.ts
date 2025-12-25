// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { RuntimeError } from '../models/RuntimeError';
import { Streamsv3CheckAWSCredentialsRequest } from '../models/Streamsv3CheckAWSCredentialsRequest';
import { Streamsv3CheckAWSCredentialsResponse } from '../models/Streamsv3CheckAWSCredentialsResponse';
import { Streamsv3CheckAzureEventHubRequest } from '../models/Streamsv3CheckAzureEventHubRequest';
import { Streamsv3CheckAzureEventHubResponse } from '../models/Streamsv3CheckAzureEventHubResponse';
import { Streamsv3CheckAzureStorageStringRequest } from '../models/Streamsv3CheckAzureStorageStringRequest';
import { Streamsv3CheckAzureStorageStringResponse } from '../models/Streamsv3CheckAzureStorageStringResponse';
import { Streamsv3GetAWSRegionsResponse } from '../models/Streamsv3GetAWSRegionsResponse';
import { Streamsv3ListAWSStreamsRequest } from '../models/Streamsv3ListAWSStreamsRequest';
import { Streamsv3ListAWSStreamsResponse } from '../models/Streamsv3ListAWSStreamsResponse';

/**
 * no description
 */
export class StreamsServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     * @param streamsv3CheckAWSCredentialsRequest 
     */
    public async streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest: Streamsv3CheckAWSCredentialsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamsv3CheckAWSCredentialsRequest' is not null or undefined
        if (streamsv3CheckAWSCredentialsRequest === null || streamsv3CheckAWSCredentialsRequest === undefined) {
            throw new RequiredError("StreamsServiceApi", "streamsServiceCheckAWSCredentials", "streamsv3CheckAWSCredentialsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/streams/credentials';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(streamsv3CheckAWSCredentialsRequest, "Streamsv3CheckAWSCredentialsRequest", ""),
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

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     * @param streamsv3CheckAzureEventHubRequest 
     */
    public async streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest: Streamsv3CheckAzureEventHubRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamsv3CheckAzureEventHubRequest' is not null or undefined
        if (streamsv3CheckAzureEventHubRequest === null || streamsv3CheckAzureEventHubRequest === undefined) {
            throw new RequiredError("StreamsServiceApi", "streamsServiceCheckAzureEventHub", "streamsv3CheckAzureEventHubRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/streams/azure_eventhub';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(streamsv3CheckAzureEventHubRequest, "Streamsv3CheckAzureEventHubRequest", ""),
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

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     * @param streamsv3CheckAzureStorageStringRequest 
     */
    public async streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest: Streamsv3CheckAzureStorageStringRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamsv3CheckAzureStorageStringRequest' is not null or undefined
        if (streamsv3CheckAzureStorageStringRequest === null || streamsv3CheckAzureStorageStringRequest === undefined) {
            throw new RequiredError("StreamsServiceApi", "streamsServiceCheckAzureStorageString", "streamsv3CheckAzureStorageStringRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/streams/azure_storage';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(streamsv3CheckAzureStorageStringRequest, "Streamsv3CheckAzureStorageStringRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
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
     * Summary: Get AWS regions Description: Service to get AWS regions.
     */
    public async streamsServiceGetAWSRegions(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/streams/regions';

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
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     * @param streamsv3ListAWSStreamsRequest 
     */
    public async streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest: Streamsv3ListAWSStreamsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamsv3ListAWSStreamsRequest' is not null or undefined
        if (streamsv3ListAWSStreamsRequest === null || streamsv3ListAWSStreamsRequest === undefined) {
            throw new RequiredError("StreamsServiceApi", "streamsServiceListAWSStreams", "streamsv3ListAWSStreamsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/streams';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(streamsv3ListAWSStreamsRequest, "Streamsv3ListAWSStreamsRequest", ""),
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

export class StreamsServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to streamsServiceCheckAWSCredentials
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async streamsServiceCheckAWSCredentialsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Streamsv3CheckAWSCredentialsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Streamsv3CheckAWSCredentialsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3CheckAWSCredentialsResponse", ""
            ) as Streamsv3CheckAWSCredentialsResponse;
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
            const body: Streamsv3CheckAWSCredentialsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3CheckAWSCredentialsResponse", ""
            ) as Streamsv3CheckAWSCredentialsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to streamsServiceCheckAzureEventHub
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async streamsServiceCheckAzureEventHubWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Streamsv3CheckAzureEventHubResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Streamsv3CheckAzureEventHubResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3CheckAzureEventHubResponse", ""
            ) as Streamsv3CheckAzureEventHubResponse;
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
            const body: Streamsv3CheckAzureEventHubResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3CheckAzureEventHubResponse", ""
            ) as Streamsv3CheckAzureEventHubResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to streamsServiceCheckAzureStorageString
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async streamsServiceCheckAzureStorageStringWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Streamsv3CheckAzureStorageStringResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Streamsv3CheckAzureStorageStringResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3CheckAzureStorageStringResponse", ""
            ) as Streamsv3CheckAzureStorageStringResponse;
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
            const body: Streamsv3CheckAzureStorageStringResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3CheckAzureStorageStringResponse", ""
            ) as Streamsv3CheckAzureStorageStringResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to streamsServiceGetAWSRegions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async streamsServiceGetAWSRegionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Streamsv3GetAWSRegionsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Streamsv3GetAWSRegionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3GetAWSRegionsResponse", ""
            ) as Streamsv3GetAWSRegionsResponse;
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
            const body: Streamsv3GetAWSRegionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3GetAWSRegionsResponse", ""
            ) as Streamsv3GetAWSRegionsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to streamsServiceListAWSStreams
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async streamsServiceListAWSStreamsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Streamsv3ListAWSStreamsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Streamsv3ListAWSStreamsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3ListAWSStreamsResponse", ""
            ) as Streamsv3ListAWSStreamsResponse;
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
            const body: Streamsv3ListAWSStreamsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Streamsv3ListAWSStreamsResponse", ""
            ) as Streamsv3ListAWSStreamsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
