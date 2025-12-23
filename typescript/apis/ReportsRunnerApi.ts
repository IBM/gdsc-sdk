// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Reportsrunnerv3GetActiveQueriesRequest } from '../models/Reportsrunnerv3GetActiveQueriesRequest';
import { Reportsrunnerv3GetActiveQueriesResponse } from '../models/Reportsrunnerv3GetActiveQueriesResponse';
import { Reportsrunnerv3GetAuditDataCountRequest } from '../models/Reportsrunnerv3GetAuditDataCountRequest';
import { Reportsrunnerv3GetChartDataRequest } from '../models/Reportsrunnerv3GetChartDataRequest';
import { Reportsrunnerv3GetChartDataRequestv2 } from '../models/Reportsrunnerv3GetChartDataRequestv2';
import { Reportsrunnerv3GetChartDataResponse } from '../models/Reportsrunnerv3GetChartDataResponse';
import { Reportsrunnerv3GetChartDataResponsev2 } from '../models/Reportsrunnerv3GetChartDataResponsev2';
import { Reportsrunnerv3GetReportColumnFacetRequest } from '../models/Reportsrunnerv3GetReportColumnFacetRequest';
import { Reportsrunnerv3GetReportColumnFacetResponse } from '../models/Reportsrunnerv3GetReportColumnFacetResponse';
import { Reportsrunnerv3GetReportDataCountRequest } from '../models/Reportsrunnerv3GetReportDataCountRequest';
import { Reportsrunnerv3GetReportDataCountResponse } from '../models/Reportsrunnerv3GetReportDataCountResponse';
import { Reportsrunnerv3RunAuditReportRequest } from '../models/Reportsrunnerv3RunAuditReportRequest';
import { Reportsrunnerv3RunReportRequest } from '../models/Reportsrunnerv3RunReportRequest';
import { Reportsrunnerv3StopQueryRequest } from '../models/Reportsrunnerv3StopQueryRequest';
import { Reportsrunnerv3StopQueryResponse } from '../models/Reportsrunnerv3StopQueryResponse';
import { RuntimeError } from '../models/RuntimeError';
import { StreamResultOfReportsrunnerv3RunReportResponse } from '../models/StreamResultOfReportsrunnerv3RunReportResponse';

/**
 * no description
 */
export class ReportsRunnerApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get running queries Description: Get queries that are running more than certain time
     * @param reportsrunnerv3GetActiveQueriesRequest 
     */
    public async reportsRunnerGetActiveQueries(reportsrunnerv3GetActiveQueriesRequest: Reportsrunnerv3GetActiveQueriesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsrunnerv3GetActiveQueriesRequest' is not null or undefined
        if (reportsrunnerv3GetActiveQueriesRequest === null || reportsrunnerv3GetActiveQueriesRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerGetActiveQueries", "reportsrunnerv3GetActiveQueriesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/queries/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3GetActiveQueriesRequest, "Reportsrunnerv3GetActiveQueriesRequest", ""),
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
     * Summary: Get audit data count Description: Get audit data.
     * @param reportId Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
     * @param reportsrunnerv3GetAuditDataCountRequest 
     */
    public async reportsRunnerGetAuditDataCount(reportId: string, reportsrunnerv3GetAuditDataCountRequest: Reportsrunnerv3GetAuditDataCountRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerGetAuditDataCount", "reportId");
        }


        // verify required parameter 'reportsrunnerv3GetAuditDataCountRequest' is not null or undefined
        if (reportsrunnerv3GetAuditDataCountRequest === null || reportsrunnerv3GetAuditDataCountRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerGetAuditDataCount", "reportsrunnerv3GetAuditDataCountRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/{report_id}/audit_count'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3GetAuditDataCountRequest, "Reportsrunnerv3GetAuditDataCountRequest", ""),
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
     * Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
     * @param reportsrunnerv3GetChartDataRequest 
     */
    public async reportsRunnerGetChartData(reportsrunnerv3GetChartDataRequest: Reportsrunnerv3GetChartDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsrunnerv3GetChartDataRequest' is not null or undefined
        if (reportsrunnerv3GetChartDataRequest === null || reportsrunnerv3GetChartDataRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerGetChartData", "reportsrunnerv3GetChartDataRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/charts/run';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3GetChartDataRequest, "Reportsrunnerv3GetChartDataRequest", ""),
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
     * @param reportsrunnerv3GetChartDataRequestv2 
     */
    public async reportsRunnerGetChartDatav2(reportsrunnerv3GetChartDataRequestv2: Reportsrunnerv3GetChartDataRequestv2, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsrunnerv3GetChartDataRequestv2' is not null or undefined
        if (reportsrunnerv3GetChartDataRequestv2 === null || reportsrunnerv3GetChartDataRequestv2 === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerGetChartDatav2", "reportsrunnerv3GetChartDataRequestv2");
        }


        // Path Params
        const localVarPath = '/api/v3/flex-charts/run';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3GetChartDataRequestv2, "Reportsrunnerv3GetChartDataRequestv2", ""),
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
     * Summary: Get report column facet Description: Get counts that is group by values for the selected column.
     * @param reportsrunnerv3GetReportColumnFacetRequest 
     */
    public async reportsRunnerGetReportColumnFacet(reportsrunnerv3GetReportColumnFacetRequest: Reportsrunnerv3GetReportColumnFacetRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsrunnerv3GetReportColumnFacetRequest' is not null or undefined
        if (reportsrunnerv3GetReportColumnFacetRequest === null || reportsrunnerv3GetReportColumnFacetRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerGetReportColumnFacet", "reportsrunnerv3GetReportColumnFacetRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/facet';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3GetReportColumnFacetRequest, "Reportsrunnerv3GetReportColumnFacetRequest", ""),
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
     * Summary: Get report data count Description: Get report data.
     * @param reportsrunnerv3GetReportDataCountRequest 
     */
    public async reportsRunnerGetReportDataCount(reportsrunnerv3GetReportDataCountRequest: Reportsrunnerv3GetReportDataCountRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsrunnerv3GetReportDataCountRequest' is not null or undefined
        if (reportsrunnerv3GetReportDataCountRequest === null || reportsrunnerv3GetReportDataCountRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerGetReportDataCount", "reportsrunnerv3GetReportDataCountRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/count';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3GetReportDataCountRequest, "Reportsrunnerv3GetReportDataCountRequest", ""),
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
     * Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
     * @param reportId The ID of the Report we wish to run (e.g. 000000000000000000000905).
     * @param reportsrunnerv3RunAuditReportRequest 
     */
    public async reportsRunnerRunAuditReport(reportId: string, reportsrunnerv3RunAuditReportRequest: Reportsrunnerv3RunAuditReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerRunAuditReport", "reportId");
        }


        // verify required parameter 'reportsrunnerv3RunAuditReportRequest' is not null or undefined
        if (reportsrunnerv3RunAuditReportRequest === null || reportsrunnerv3RunAuditReportRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerRunAuditReport", "reportsrunnerv3RunAuditReportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/audit/{report_id}/run'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3RunAuditReportRequest, "Reportsrunnerv3RunAuditReportRequest", ""),
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
     * Summary: Run report Description: Run report by report ID or by specifying report definition.
     * @param reportsrunnerv3RunReportRequest 
     */
    public async reportsRunnerRunReport(reportsrunnerv3RunReportRequest: Reportsrunnerv3RunReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsrunnerv3RunReportRequest' is not null or undefined
        if (reportsrunnerv3RunReportRequest === null || reportsrunnerv3RunReportRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerRunReport", "reportsrunnerv3RunReportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/run';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3RunReportRequest, "Reportsrunnerv3RunReportRequest", ""),
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
     * Summary: Stop query Description: Stop a query based on the id
     * @param reportsrunnerv3StopQueryRequest 
     */
    public async reportsRunnerStopQuery(reportsrunnerv3StopQueryRequest: Reportsrunnerv3StopQueryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsrunnerv3StopQueryRequest' is not null or undefined
        if (reportsrunnerv3StopQueryRequest === null || reportsrunnerv3StopQueryRequest === undefined) {
            throw new RequiredError("ReportsRunnerApi", "reportsRunnerStopQuery", "reportsrunnerv3StopQueryRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/queries/stop';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsrunnerv3StopQueryRequest, "Reportsrunnerv3StopQueryRequest", ""),
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

export class ReportsRunnerApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerGetActiveQueries
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerGetActiveQueriesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsrunnerv3GetActiveQueriesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsrunnerv3GetActiveQueriesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetActiveQueriesResponse", ""
            ) as Reportsrunnerv3GetActiveQueriesResponse;
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
            const body: Reportsrunnerv3GetActiveQueriesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetActiveQueriesResponse", ""
            ) as Reportsrunnerv3GetActiveQueriesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerGetAuditDataCount
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerGetAuditDataCountWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsrunnerv3GetReportDataCountResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsrunnerv3GetReportDataCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetReportDataCountResponse", ""
            ) as Reportsrunnerv3GetReportDataCountResponse;
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
            const body: Reportsrunnerv3GetReportDataCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetReportDataCountResponse", ""
            ) as Reportsrunnerv3GetReportDataCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerGetChartData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerGetChartDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsrunnerv3GetChartDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsrunnerv3GetChartDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetChartDataResponse", ""
            ) as Reportsrunnerv3GetChartDataResponse;
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
            const body: Reportsrunnerv3GetChartDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetChartDataResponse", ""
            ) as Reportsrunnerv3GetChartDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerGetChartDatav2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerGetChartDatav2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsrunnerv3GetChartDataResponsev2 >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsrunnerv3GetChartDataResponsev2 = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetChartDataResponsev2", ""
            ) as Reportsrunnerv3GetChartDataResponsev2;
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
            const body: Reportsrunnerv3GetChartDataResponsev2 = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetChartDataResponsev2", ""
            ) as Reportsrunnerv3GetChartDataResponsev2;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerGetReportColumnFacet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerGetReportColumnFacetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsrunnerv3GetReportColumnFacetResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsrunnerv3GetReportColumnFacetResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetReportColumnFacetResponse", ""
            ) as Reportsrunnerv3GetReportColumnFacetResponse;
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
            const body: Reportsrunnerv3GetReportColumnFacetResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetReportColumnFacetResponse", ""
            ) as Reportsrunnerv3GetReportColumnFacetResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerGetReportDataCount
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerGetReportDataCountWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsrunnerv3GetReportDataCountResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsrunnerv3GetReportDataCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetReportDataCountResponse", ""
            ) as Reportsrunnerv3GetReportDataCountResponse;
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
            const body: Reportsrunnerv3GetReportDataCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3GetReportDataCountResponse", ""
            ) as Reportsrunnerv3GetReportDataCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerRunAuditReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerRunAuditReportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<StreamResultOfReportsrunnerv3RunReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            var tx = await response.body.text();
            tx = tx.replace(/}}\n{\"result\":{/gi, ',');
            const body: StreamResultOfReportsrunnerv3RunReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(tx, contentType),
                "StreamResultOfReportsrunnerv3RunReportResponse", ""
            ) as StreamResultOfReportsrunnerv3RunReportResponse;
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
            const body: StreamResultOfReportsrunnerv3RunReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StreamResultOfReportsrunnerv3RunReportResponse", ""
            ) as StreamResultOfReportsrunnerv3RunReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerRunReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerRunReportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<StreamResultOfReportsrunnerv3RunReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            var tx = await response.body.text();
            tx = tx.replace(/}}\n{\"result\":{/gi, ',');
            const body: StreamResultOfReportsrunnerv3RunReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(tx, contentType),
                "StreamResultOfReportsrunnerv3RunReportResponse", ""
            ) as StreamResultOfReportsrunnerv3RunReportResponse;
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
            const body: StreamResultOfReportsrunnerv3RunReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StreamResultOfReportsrunnerv3RunReportResponse", ""
            ) as StreamResultOfReportsrunnerv3RunReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsRunnerStopQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsRunnerStopQueryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsrunnerv3StopQueryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsrunnerv3StopQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3StopQueryResponse", ""
            ) as Reportsrunnerv3StopQueryResponse;
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
            const body: Reportsrunnerv3StopQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsrunnerv3StopQueryResponse", ""
            ) as Reportsrunnerv3StopQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
