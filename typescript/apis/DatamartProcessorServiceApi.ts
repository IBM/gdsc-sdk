// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Datamartprocessorv3DMExtractionLogsRequest } from '../models/Datamartprocessorv3DMExtractionLogsRequest';
import { Datamartprocessorv3DMExtractionLogsResponse } from '../models/Datamartprocessorv3DMExtractionLogsResponse';
import { Datamartprocessorv3GetDatamartInfoResponse } from '../models/Datamartprocessorv3GetDatamartInfoResponse';
import { Datamartprocessorv3GetDatamartResponse } from '../models/Datamartprocessorv3GetDatamartResponse';
import { Datamartprocessorv3GetEarliestStartTimeResponse } from '../models/Datamartprocessorv3GetEarliestStartTimeResponse';
import { Datamartprocessorv3StatusResponseBase } from '../models/Datamartprocessorv3StatusResponseBase';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class DatamartProcessorServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
     * @param ingestionId Ingestion id.
     */
    public async datamartProcessorServiceGetDatamartInfo(ingestionId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/datamarts/info';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (ingestionId !== undefined) {
            requestContext.setQueryParam("ingestion_id", ObjectSerializer.serialize(ingestionId, "string", "int64"));
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
     * Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
     * @param periodStart Data starting time period in UTC.
     * @param periodEnd Data ending time period in UTC.
     */
    public async datamartProcessorServiceGetDatamarts(periodStart?: Date, periodEnd?: Date, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/datamarts';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (periodStart !== undefined) {
            requestContext.setQueryParam("period_start", ObjectSerializer.serialize(periodStart, "Date", "date-time"));
        }

        // Query Params
        if (periodEnd !== undefined) {
            requestContext.setQueryParam("period_end", ObjectSerializer.serialize(periodEnd, "Date", "date-time"));
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
     * Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
     */
    public async datamartProcessorServiceGetEarliestStartTime(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/datamarts/earliest_start_time';

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
     * @param body 
     */
    public async datamartProcessorServiceSendAllCompleteFilesToQueue(body: any, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new RequiredError("DatamartProcessorServiceApi", "datamartProcessorServiceSendAllCompleteFilesToQueue", "body");
        }


        // Path Params
        const localVarPath = '/api/v3/datamarts/repush_files';

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
     * Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
     * @param requestId Request id which co-relates to request.
     * @param datamartprocessorv3DMExtractionLogsRequest 
     */
    public async datamartProcessorServiceStoreExtractionLogs(requestId: string, datamartprocessorv3DMExtractionLogsRequest: Datamartprocessorv3DMExtractionLogsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'requestId' is not null or undefined
        if (requestId === null || requestId === undefined) {
            throw new RequiredError("DatamartProcessorServiceApi", "datamartProcessorServiceStoreExtractionLogs", "requestId");
        }


        // verify required parameter 'datamartprocessorv3DMExtractionLogsRequest' is not null or undefined
        if (datamartprocessorv3DMExtractionLogsRequest === null || datamartprocessorv3DMExtractionLogsRequest === undefined) {
            throw new RequiredError("DatamartProcessorServiceApi", "datamartProcessorServiceStoreExtractionLogs", "datamartprocessorv3DMExtractionLogsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/datamarts/{request_id}/dm_extraction_logs'
            .replace('{' + 'request_id' + '}', encodeURIComponent(String(requestId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(datamartprocessorv3DMExtractionLogsRequest, "Datamartprocessorv3DMExtractionLogsRequest", ""),
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
     * Summary: Upload datamart Description: Upload datamart file for ingestion.
     * @param file The file to upload.
     */
    public async uploadDatamart(file: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'file' is not null or undefined
        if (file === null || file === undefined) {
            throw new RequiredError("DatamartProcessorServiceApi", "uploadDatamart", "file");
        }


        // Path Params
        const localVarPath = '/api/v3/datamarts/upload';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Form Params
        const useForm = canConsumeForm([
            'application/x-www-form-urlencoded',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (file !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('file', file, file.name);
             }
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "application/x-www-form-urlencoded"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
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

}

export class DatamartProcessorServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to datamartProcessorServiceGetDatamartInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async datamartProcessorServiceGetDatamartInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Datamartprocessorv3GetDatamartInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Datamartprocessorv3GetDatamartInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3GetDatamartInfoResponse", ""
            ) as Datamartprocessorv3GetDatamartInfoResponse;
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
            const body: Datamartprocessorv3GetDatamartInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3GetDatamartInfoResponse", ""
            ) as Datamartprocessorv3GetDatamartInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to datamartProcessorServiceGetDatamarts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async datamartProcessorServiceGetDatamartsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Datamartprocessorv3GetDatamartResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Datamartprocessorv3GetDatamartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3GetDatamartResponse", ""
            ) as Datamartprocessorv3GetDatamartResponse;
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
            const body: Datamartprocessorv3GetDatamartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3GetDatamartResponse", ""
            ) as Datamartprocessorv3GetDatamartResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to datamartProcessorServiceGetEarliestStartTime
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async datamartProcessorServiceGetEarliestStartTimeWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Datamartprocessorv3GetEarliestStartTimeResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Datamartprocessorv3GetEarliestStartTimeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3GetEarliestStartTimeResponse", ""
            ) as Datamartprocessorv3GetEarliestStartTimeResponse;
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
            const body: Datamartprocessorv3GetEarliestStartTimeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3GetEarliestStartTimeResponse", ""
            ) as Datamartprocessorv3GetEarliestStartTimeResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to datamartProcessorServiceSendAllCompleteFilesToQueue
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async datamartProcessorServiceSendAllCompleteFilesToQueueWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Datamartprocessorv3StatusResponseBase >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Datamartprocessorv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3StatusResponseBase", ""
            ) as Datamartprocessorv3StatusResponseBase;
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
            const body: Datamartprocessorv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3StatusResponseBase", ""
            ) as Datamartprocessorv3StatusResponseBase;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to datamartProcessorServiceStoreExtractionLogs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async datamartProcessorServiceStoreExtractionLogsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Datamartprocessorv3DMExtractionLogsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Datamartprocessorv3DMExtractionLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3DMExtractionLogsResponse", ""
            ) as Datamartprocessorv3DMExtractionLogsResponse;
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
            const body: Datamartprocessorv3DMExtractionLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Datamartprocessorv3DMExtractionLogsResponse", ""
            ) as Datamartprocessorv3DMExtractionLogsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to uploadDatamart
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async uploadDatamartWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
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
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
