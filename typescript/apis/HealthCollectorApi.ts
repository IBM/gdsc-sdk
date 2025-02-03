// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Healthcollectorv3GetDataWarehouseUsageResponse } from '../models/Healthcollectorv3GetDataWarehouseUsageResponse';
import { Healthcollectorv3GetGDPHealthInfoResponse } from '../models/Healthcollectorv3GetGDPHealthInfoResponse';
import { Healthcollectorv3GetHistoricalHealthInfoResponse } from '../models/Healthcollectorv3GetHistoricalHealthInfoResponse';
import { Healthcollectorv3GetObjectStorageUsageResponse } from '../models/Healthcollectorv3GetObjectStorageUsageResponse';
import { Healthcollectorv3GetPVCUsageResponse } from '../models/Healthcollectorv3GetPVCUsageResponse';
import { Healthcollectorv3GetPodRestartsResponse } from '../models/Healthcollectorv3GetPodRestartsResponse';
import { Healthcollectorv3GetStreamsIngestionResponse } from '../models/Healthcollectorv3GetStreamsIngestionResponse';
import { Healthcollectorv3GetTopGDPCollectorsResponse } from '../models/Healthcollectorv3GetTopGDPCollectorsResponse';
import { Healthcollectorv3StoreHealthInfoRequest } from '../models/Healthcollectorv3StoreHealthInfoRequest';
import { Healthcollectorv3StoreHealthInfoResponse } from '../models/Healthcollectorv3StoreHealthInfoResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class HealthCollectorApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public async healthCollectorGetDataWarehouseUsage(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'type' is not null or undefined
        if (type === null || type === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorGetDataWarehouseUsage", "type");
        }




        // Path Params
        const localVarPath = '/api/v3/metrics/warehouse/{type}'
            .replace('{' + 'type' + '}', encodeURIComponent(String(type)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
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
     * Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
     */
    public async healthCollectorGetGDPHealthInfo(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/health';

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
     * Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
     * @param unit Type of unit for which data needs to be retrieved.
     * @param cmId Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved.
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public async healthCollectorGetHistoricalHealthInfo(unit?: 'UNKNOWN_UNIT' | 'STAP', cmId?: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/api/v3/health/history';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (unit !== undefined) {
            requestContext.setQueryParam("unit", ObjectSerializer.serialize(unit, "'UNKNOWN_UNIT' | 'STAP'", ""));
        }

        // Query Params
        if (cmId !== undefined) {
            requestContext.setQueryParam("cm_id", ObjectSerializer.serialize(cmId, "string", ""));
        }

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
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
     * Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public async healthCollectorGetObjectStorageUsage(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'type' is not null or undefined
        if (type === null || type === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorGetObjectStorageUsage", "type");
        }




        // Path Params
        const localVarPath = '/api/v3/metrics/object_storage/{type}'
            .replace('{' + 'type' + '}', encodeURIComponent(String(type)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
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
     * Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public async healthCollectorGetPVCUsage(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'type' is not null or undefined
        if (type === null || type === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorGetPVCUsage", "type");
        }




        // Path Params
        const localVarPath = '/api/v3/metrics/pvc/{type}'
            .replace('{' + 'type' + '}', encodeURIComponent(String(type)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
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
     * Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public async healthCollectorGetPodRestarts(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'type' is not null or undefined
        if (type === null || type === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorGetPodRestarts", "type");
        }




        // Path Params
        const localVarPath = '/api/v3/metrics/pods/{type}'
            .replace('{' + 'type' + '}', encodeURIComponent(String(type)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
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
     * Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public async healthCollectorGetStreamsIngestion(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'type' is not null or undefined
        if (type === null || type === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorGetStreamsIngestion", "type");
        }




        // Path Params
        const localVarPath = '/api/v3/metrics/streams/{type}'
            .replace('{' + 'type' + '}', encodeURIComponent(String(type)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
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
     * Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public async healthCollectorGetTopGDPCollectors(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'type' is not null or undefined
        if (type === null || type === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorGetTopGDPCollectors", "type");
        }




        // Path Params
        const localVarPath = '/api/v3/metrics/collectors/{type}'
            .replace('{' + 'type' + '}', encodeURIComponent(String(type)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
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
     * Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param healthcollectorv3StoreHealthInfoRequest 
     */
    public async healthCollectorStoreHealthInfo(centralManagerId: string, healthcollectorv3StoreHealthInfoRequest: Healthcollectorv3StoreHealthInfoRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorStoreHealthInfo", "centralManagerId");
        }


        // verify required parameter 'healthcollectorv3StoreHealthInfoRequest' is not null or undefined
        if (healthcollectorv3StoreHealthInfoRequest === null || healthcollectorv3StoreHealthInfoRequest === undefined) {
            throw new RequiredError("HealthCollectorApi", "healthCollectorStoreHealthInfo", "healthcollectorv3StoreHealthInfoRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/health/central_managers/{central_manager_id}/health_info'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(healthcollectorv3StoreHealthInfoRequest, "Healthcollectorv3StoreHealthInfoRequest", ""),
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

export class HealthCollectorApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetDataWarehouseUsage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetDataWarehouseUsageWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetDataWarehouseUsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetDataWarehouseUsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetDataWarehouseUsageResponse", ""
            ) as Healthcollectorv3GetDataWarehouseUsageResponse;
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
            const body: Healthcollectorv3GetDataWarehouseUsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetDataWarehouseUsageResponse", ""
            ) as Healthcollectorv3GetDataWarehouseUsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetGDPHealthInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetGDPHealthInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetGDPHealthInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetGDPHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetGDPHealthInfoResponse", ""
            ) as Healthcollectorv3GetGDPHealthInfoResponse;
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
            const body: Healthcollectorv3GetGDPHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetGDPHealthInfoResponse", ""
            ) as Healthcollectorv3GetGDPHealthInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetHistoricalHealthInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetHistoricalHealthInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetHistoricalHealthInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetHistoricalHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetHistoricalHealthInfoResponse", ""
            ) as Healthcollectorv3GetHistoricalHealthInfoResponse;
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
            const body: Healthcollectorv3GetHistoricalHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetHistoricalHealthInfoResponse", ""
            ) as Healthcollectorv3GetHistoricalHealthInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetObjectStorageUsage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetObjectStorageUsageWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetObjectStorageUsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetObjectStorageUsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetObjectStorageUsageResponse", ""
            ) as Healthcollectorv3GetObjectStorageUsageResponse;
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
            const body: Healthcollectorv3GetObjectStorageUsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetObjectStorageUsageResponse", ""
            ) as Healthcollectorv3GetObjectStorageUsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetPVCUsage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetPVCUsageWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetPVCUsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetPVCUsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetPVCUsageResponse", ""
            ) as Healthcollectorv3GetPVCUsageResponse;
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
            const body: Healthcollectorv3GetPVCUsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetPVCUsageResponse", ""
            ) as Healthcollectorv3GetPVCUsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetPodRestarts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetPodRestartsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetPodRestartsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetPodRestartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetPodRestartsResponse", ""
            ) as Healthcollectorv3GetPodRestartsResponse;
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
            const body: Healthcollectorv3GetPodRestartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetPodRestartsResponse", ""
            ) as Healthcollectorv3GetPodRestartsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetStreamsIngestion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetStreamsIngestionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetStreamsIngestionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetStreamsIngestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetStreamsIngestionResponse", ""
            ) as Healthcollectorv3GetStreamsIngestionResponse;
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
            const body: Healthcollectorv3GetStreamsIngestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetStreamsIngestionResponse", ""
            ) as Healthcollectorv3GetStreamsIngestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorGetTopGDPCollectors
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorGetTopGDPCollectorsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3GetTopGDPCollectorsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3GetTopGDPCollectorsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetTopGDPCollectorsResponse", ""
            ) as Healthcollectorv3GetTopGDPCollectorsResponse;
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
            const body: Healthcollectorv3GetTopGDPCollectorsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3GetTopGDPCollectorsResponse", ""
            ) as Healthcollectorv3GetTopGDPCollectorsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to healthCollectorStoreHealthInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async healthCollectorStoreHealthInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Healthcollectorv3StoreHealthInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Healthcollectorv3StoreHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3StoreHealthInfoResponse", ""
            ) as Healthcollectorv3StoreHealthInfoResponse;
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
            const body: Healthcollectorv3StoreHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Healthcollectorv3StoreHealthInfoResponse", ""
            ) as Healthcollectorv3StoreHealthInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
