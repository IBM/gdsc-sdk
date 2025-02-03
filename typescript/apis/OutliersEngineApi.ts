// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Outliersenginev3GetSourceStatisticsResponse } from '../models/Outliersenginev3GetSourceStatisticsResponse';
import { Outliersenginev3GetWorkingHoursPeriodsResponse } from '../models/Outliersenginev3GetWorkingHoursPeriodsResponse';
import { Outliersenginev3OutlierResponse } from '../models/Outliersenginev3OutlierResponse';
import { Outliersenginev3RunSimulatorRequest } from '../models/Outliersenginev3RunSimulatorRequest';
import { Outliersenginev3StatisticsResponse } from '../models/Outliersenginev3StatisticsResponse';
import { Outliersenginev3UpdateWorkingHoursPeriodsRequest } from '../models/Outliersenginev3UpdateWorkingHoursPeriodsRequest';
import { RpcStatus } from '../models/RpcStatus';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class OutliersEngineApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
     * @param sourceServerIp server ip.
     * @param sourceDatabaseName database name.
     * @param sourceDbUser db user name (optional).
     * @param attributesLimit The number of attributes to return for each SourceAttributeType - optional.
     */
    public async outliersEngineGetSourceStatistics(sourceServerIp?: string, sourceDatabaseName?: string, sourceDbUser?: string, attributesLimit?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/api/v3/outliers/source/statistics';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (sourceServerIp !== undefined) {
            requestContext.setQueryParam("source.server_ip", ObjectSerializer.serialize(sourceServerIp, "string", ""));
        }

        // Query Params
        if (sourceDatabaseName !== undefined) {
            requestContext.setQueryParam("source.database_name", ObjectSerializer.serialize(sourceDatabaseName, "string", ""));
        }

        // Query Params
        if (sourceDbUser !== undefined) {
            requestContext.setQueryParam("source.db_user", ObjectSerializer.serialize(sourceDbUser, "string", ""));
        }

        // Query Params
        if (attributesLimit !== undefined) {
            requestContext.setQueryParam("attributes_limit", ObjectSerializer.serialize(attributesLimit, "number", "int32"));
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
     * Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
     */
    public async outliersEngineGetStatistics(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/outliers/statistics';

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
     * Summary: Get working hours periods Description: Get a list of the working hours periods.
     */
    public async outliersEngineGetWorkingHoursPeriods(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/outliers/working_hours_periods';

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
     * Summary: Run simulator Description: Run outlier simulator.
     * @param outliersenginev3RunSimulatorRequest 
     */
    public async outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest: Outliersenginev3RunSimulatorRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'outliersenginev3RunSimulatorRequest' is not null or undefined
        if (outliersenginev3RunSimulatorRequest === null || outliersenginev3RunSimulatorRequest === undefined) {
            throw new RequiredError("OutliersEngineApi", "outliersEngineRunSimulator", "outliersenginev3RunSimulatorRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/outliers/simulator';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(outliersenginev3RunSimulatorRequest, "Outliersenginev3RunSimulatorRequest", ""),
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
     * Summary: Update working hours periods Description: Update the working hours periods values.
     * @param outliersenginev3UpdateWorkingHoursPeriodsRequest 
     */
    public async outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest: Outliersenginev3UpdateWorkingHoursPeriodsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'outliersenginev3UpdateWorkingHoursPeriodsRequest' is not null or undefined
        if (outliersenginev3UpdateWorkingHoursPeriodsRequest === null || outliersenginev3UpdateWorkingHoursPeriodsRequest === undefined) {
            throw new RequiredError("OutliersEngineApi", "outliersEngineUpdateWorkingHoursPeriods", "outliersenginev3UpdateWorkingHoursPeriodsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/outliers/working_hours_periods';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(outliersenginev3UpdateWorkingHoursPeriodsRequest, "Outliersenginev3UpdateWorkingHoursPeriodsRequest", ""),
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
     * Summary: Upload and analyze period Description: Run outliers detection on ready periods.
     * @param body 
     */
    public async outliersEngineUploadAndAnalyzePeriod(body: any, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new RequiredError("OutliersEngineApi", "outliersEngineUploadAndAnalyzePeriod", "body");
        }


        // Path Params
        const localVarPath = '/api/v3/outliers';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(body, "any", ""),
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
     * Summary: User clustering Description: Run user-clustering on current sources.
     * @param body 
     */
    public async outliersEngineUserClustering(body: any, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new RequiredError("OutliersEngineApi", "outliersEngineUserClustering", "body");
        }


        // Path Params
        const localVarPath = '/api/v3/outliers/clusters';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(body, "any", ""),
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

export class OutliersEngineApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to outliersEngineGetSourceStatistics
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async outliersEngineGetSourceStatisticsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Outliersenginev3GetSourceStatisticsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Outliersenginev3GetSourceStatisticsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3GetSourceStatisticsResponse", ""
            ) as Outliersenginev3GetSourceStatisticsResponse;
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
            const body: Outliersenginev3GetSourceStatisticsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3GetSourceStatisticsResponse", ""
            ) as Outliersenginev3GetSourceStatisticsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to outliersEngineGetStatistics
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async outliersEngineGetStatisticsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Outliersenginev3StatisticsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Outliersenginev3StatisticsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3StatisticsResponse", ""
            ) as Outliersenginev3StatisticsResponse;
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
            const body: Outliersenginev3StatisticsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3StatisticsResponse", ""
            ) as Outliersenginev3StatisticsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to outliersEngineGetWorkingHoursPeriods
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async outliersEngineGetWorkingHoursPeriodsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Outliersenginev3GetWorkingHoursPeriodsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Outliersenginev3GetWorkingHoursPeriodsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3GetWorkingHoursPeriodsResponse", ""
            ) as Outliersenginev3GetWorkingHoursPeriodsResponse;
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
            const body: Outliersenginev3GetWorkingHoursPeriodsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3GetWorkingHoursPeriodsResponse", ""
            ) as Outliersenginev3GetWorkingHoursPeriodsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to outliersEngineRunSimulator
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async outliersEngineRunSimulatorWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RpcStatus >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RpcStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RpcStatus", ""
            ) as RpcStatus;
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
            const body: RpcStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RpcStatus", ""
            ) as RpcStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to outliersEngineUpdateWorkingHoursPeriods
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async outliersEngineUpdateWorkingHoursPeriodsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Outliersenginev3OutlierResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Outliersenginev3OutlierResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3OutlierResponse", ""
            ) as Outliersenginev3OutlierResponse;
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
            const body: Outliersenginev3OutlierResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Outliersenginev3OutlierResponse", ""
            ) as Outliersenginev3OutlierResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to outliersEngineUploadAndAnalyzePeriod
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async outliersEngineUploadAndAnalyzePeriodWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RpcStatus >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RpcStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RpcStatus", ""
            ) as RpcStatus;
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
            const body: RpcStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RpcStatus", ""
            ) as RpcStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to outliersEngineUserClustering
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async outliersEngineUserClusteringWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RpcStatus >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RpcStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RpcStatus", ""
            ) as RpcStatus;
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
            const body: RpcStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RpcStatus", ""
            ) as RpcStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
