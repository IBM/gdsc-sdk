// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Edgeschedulerv3GetEdgeQueryStatusResponse } from '../models/Edgeschedulerv3GetEdgeQueryStatusResponse';
import { Edgeschedulerv3ScheduleEdgeQueryRequest } from '../models/Edgeschedulerv3ScheduleEdgeQueryRequest';
import { Edgeschedulerv3ScheduleEdgeQueryResponse } from '../models/Edgeschedulerv3ScheduleEdgeQueryResponse';
import { RuntimeError } from '../models/RuntimeError';
import { StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse } from '../models/StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse';

/**
 * no description
 */
export class EdgeSchedulerServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get edge query status Description: Get the status of a queued edge query
     * @param edgeId the id of the edge
     * @param edgeResultReportId the id of the UC report being queried for.
     */
    public async edgeSchedulerServiceGetEdgeQueryStatus(edgeId: string, edgeResultReportId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'edgeId' is not null or undefined
        if (edgeId === null || edgeId === undefined) {
            throw new RequiredError("EdgeSchedulerServiceApi", "edgeSchedulerServiceGetEdgeQueryStatus", "edgeId");
        }



        // Path Params
        const localVarPath = '/api/v3/edges/{edge_id}/query/status'
            .replace('{' + 'edge_id' + '}', encodeURIComponent(String(edgeId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (edgeResultReportId !== undefined) {
            requestContext.setQueryParam("edge_result_report_id", ObjectSerializer.serialize(edgeResultReportId, "string", ""));
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
     * Summary: Monitor for a pending edge query request Description: monitor edge query pending request
     * @param clientId edge client id to monitor edge query requests for.
     */
    public async edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery(clientId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/edges/query';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (clientId !== undefined) {
            requestContext.setQueryParam("client_id", ObjectSerializer.serialize(clientId, "string", ""));
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
     * Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue
     * @param edgeId the id of the edge
     * @param edgeschedulerv3ScheduleEdgeQueryRequest 
     */
    public async edgeSchedulerServiceScheduleEdgeQuery(edgeId: string, edgeschedulerv3ScheduleEdgeQueryRequest: Edgeschedulerv3ScheduleEdgeQueryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'edgeId' is not null or undefined
        if (edgeId === null || edgeId === undefined) {
            throw new RequiredError("EdgeSchedulerServiceApi", "edgeSchedulerServiceScheduleEdgeQuery", "edgeId");
        }


        // verify required parameter 'edgeschedulerv3ScheduleEdgeQueryRequest' is not null or undefined
        if (edgeschedulerv3ScheduleEdgeQueryRequest === null || edgeschedulerv3ScheduleEdgeQueryRequest === undefined) {
            throw new RequiredError("EdgeSchedulerServiceApi", "edgeSchedulerServiceScheduleEdgeQuery", "edgeschedulerv3ScheduleEdgeQueryRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edges/{edge_id}/query/schedule'
            .replace('{' + 'edge_id' + '}', encodeURIComponent(String(edgeId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(edgeschedulerv3ScheduleEdgeQueryRequest, "Edgeschedulerv3ScheduleEdgeQueryRequest", ""),
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

export class EdgeSchedulerServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to edgeSchedulerServiceGetEdgeQueryStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async edgeSchedulerServiceGetEdgeQueryStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Edgeschedulerv3GetEdgeQueryStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Edgeschedulerv3GetEdgeQueryStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Edgeschedulerv3GetEdgeQueryStatusResponse", ""
            ) as Edgeschedulerv3GetEdgeQueryStatusResponse;
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
            const body: Edgeschedulerv3GetEdgeQueryStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Edgeschedulerv3GetEdgeQueryStatusResponse", ""
            ) as Edgeschedulerv3GetEdgeQueryStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse", ""
            ) as StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse;
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
            const body: StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse", ""
            ) as StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to edgeSchedulerServiceScheduleEdgeQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async edgeSchedulerServiceScheduleEdgeQueryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Edgeschedulerv3ScheduleEdgeQueryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Edgeschedulerv3ScheduleEdgeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Edgeschedulerv3ScheduleEdgeQueryResponse", ""
            ) as Edgeschedulerv3ScheduleEdgeQueryResponse;
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
            const body: Edgeschedulerv3ScheduleEdgeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Edgeschedulerv3ScheduleEdgeQueryResponse", ""
            ) as Edgeschedulerv3ScheduleEdgeQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
