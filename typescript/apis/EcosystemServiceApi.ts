// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Ecosystemv3CreateDatasetRequest } from '../models/Ecosystemv3CreateDatasetRequest';
import { Ecosystemv3CreateDatasetResponse } from '../models/Ecosystemv3CreateDatasetResponse';
import { Ecosystemv3DataInsertRequest } from '../models/Ecosystemv3DataInsertRequest';
import { Ecosystemv3DataInsertResponse } from '../models/Ecosystemv3DataInsertResponse';
import { Ecosystemv3DeleteDatasetsResponse } from '../models/Ecosystemv3DeleteDatasetsResponse';
import { Ecosystemv3GetDatasetDataResponse } from '../models/Ecosystemv3GetDatasetDataResponse';
import { Ecosystemv3GetDatasetDetailResponse } from '../models/Ecosystemv3GetDatasetDetailResponse';
import { Ecosystemv3GetDatasetsResponse } from '../models/Ecosystemv3GetDatasetsResponse';
import { Ecosystemv3GetPurgableRowsRequest } from '../models/Ecosystemv3GetPurgableRowsRequest';
import { Ecosystemv3GetPurgableRowsResponse } from '../models/Ecosystemv3GetPurgableRowsResponse';
import { Ecosystemv3PurgeDataResponse } from '../models/Ecosystemv3PurgeDataResponse';
import { Ecosystemv3TestIntegrationRequest } from '../models/Ecosystemv3TestIntegrationRequest';
import { Ecosystemv3TestIntegrationResponse } from '../models/Ecosystemv3TestIntegrationResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class EcosystemServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create dataset Description: Save a definition in the database.
     * @param ecosystemv3CreateDatasetRequest 
     */
    public async ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest: Ecosystemv3CreateDatasetRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'ecosystemv3CreateDatasetRequest' is not null or undefined
        if (ecosystemv3CreateDatasetRequest === null || ecosystemv3CreateDatasetRequest === undefined) {
            throw new RequiredError("EcosystemServiceApi", "ecosystemServiceCreateDataset", "ecosystemv3CreateDatasetRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/datasets';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(ecosystemv3CreateDatasetRequest, "Ecosystemv3CreateDatasetRequest", ""),
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
     * Summary: Data insert Description: Process Data received from webhook API and insert.
     * @param datasetName Data set target name.
     * @param ecosystemv3DataInsertRequest 
     */
    public async ecosystemServiceDataInsert(datasetName: string, ecosystemv3DataInsertRequest: Ecosystemv3DataInsertRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'datasetName' is not null or undefined
        if (datasetName === null || datasetName === undefined) {
            throw new RequiredError("EcosystemServiceApi", "ecosystemServiceDataInsert", "datasetName");
        }


        // verify required parameter 'ecosystemv3DataInsertRequest' is not null or undefined
        if (ecosystemv3DataInsertRequest === null || ecosystemv3DataInsertRequest === undefined) {
            throw new RequiredError("EcosystemServiceApi", "ecosystemServiceDataInsert", "ecosystemv3DataInsertRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/datasets/{dataset_name}'
            .replace('{' + 'dataset_name' + '}', encodeURIComponent(String(datasetName)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(ecosystemv3DataInsertRequest, "Ecosystemv3DataInsertRequest", ""),
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
     * Summary: Delete datasets Description: Delete an array of datasets.
     * @param datasetNames Name of the dataset, required field.
     */
    public async ecosystemServiceDeleteDatasets(datasetNames?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/integrations/datasets';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (datasetNames !== undefined) {
            requestContext.setQueryParam("dataset_names", ObjectSerializer.serialize(datasetNames, "Array<string>", ""));
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
     * Summary: Get dataset data Description: Return data report for a given dataset.
     * @param datasetName Name of the dataset.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param returnHeader If needs to return header information. It is for pagination. The first page needs header, the rest doesn\&#39;t need.
     * @param field Search field.
     * @param value Search value.
     * @param sortField Field to sort.
     * @param sortOrder Sort order.
     */
    public async ecosystemServiceGetDatasetData(datasetName: string, offset?: number, limit?: number, returnHeader?: boolean, field?: string, value?: string, sortField?: string, sortOrder?: 'NONE' | 'ASC' | 'DESC', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'datasetName' is not null or undefined
        if (datasetName === null || datasetName === undefined) {
            throw new RequiredError("EcosystemServiceApi", "ecosystemServiceGetDatasetData", "datasetName");
        }









        // Path Params
        const localVarPath = '/api/v3/integrations/datasets/{dataset_name}/data'
            .replace('{' + 'dataset_name' + '}', encodeURIComponent(String(datasetName)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("offset", ObjectSerializer.serialize(offset, "number", "int64"));
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", "int64"));
        }

        // Query Params
        if (returnHeader !== undefined) {
            requestContext.setQueryParam("return_header", ObjectSerializer.serialize(returnHeader, "boolean", ""));
        }

        // Query Params
        if (field !== undefined) {
            requestContext.setQueryParam("field", ObjectSerializer.serialize(field, "string", ""));
        }

        // Query Params
        if (value !== undefined) {
            requestContext.setQueryParam("value", ObjectSerializer.serialize(value, "string", ""));
        }

        // Query Params
        if (sortField !== undefined) {
            requestContext.setQueryParam("sort_field", ObjectSerializer.serialize(sortField, "string", ""));
        }

        // Query Params
        if (sortOrder !== undefined) {
            requestContext.setQueryParam("sort_order", ObjectSerializer.serialize(sortOrder, "'NONE' | 'ASC' | 'DESC'", ""));
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
     * Summary: Get dataset detail Description: Return detail on a dataset definition.
     * @param datasetName Name of the dataset.
     */
    public async ecosystemServiceGetDatasetDetail(datasetName: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'datasetName' is not null or undefined
        if (datasetName === null || datasetName === undefined) {
            throw new RequiredError("EcosystemServiceApi", "ecosystemServiceGetDatasetDetail", "datasetName");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/datasets/{dataset_name}/details'
            .replace('{' + 'dataset_name' + '}', encodeURIComponent(String(datasetName)));

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
     * Summary: Get datasets Description: Return dataset list that matches the specified filter.
     * @param filterStartTime Return datasets created at this time or later (&gt;&#x3D;).
     * @param filterEndTime Return datasets created before this time (&lt;).
     * @param filterDatasetNames The state filter groups commonly paired states. Only returns records that include the specified names.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param includeFilterCounts Computing the filter counts is relatively expensive, only compute when needed.
     */
    public async ecosystemServiceGetDatasets(filterStartTime?: Date, filterEndTime?: Date, filterDatasetNames?: Array<string>, offset?: number, limit?: number, includeFilterCounts?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;







        // Path Params
        const localVarPath = '/api/v3/integrations/datasets';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filterStartTime !== undefined) {
            requestContext.setQueryParam("filter.start_time", ObjectSerializer.serialize(filterStartTime, "Date", "date-time"));
        }

        // Query Params
        if (filterEndTime !== undefined) {
            requestContext.setQueryParam("filter.end_time", ObjectSerializer.serialize(filterEndTime, "Date", "date-time"));
        }

        // Query Params
        if (filterDatasetNames !== undefined) {
            requestContext.setQueryParam("filter.dataset_names", ObjectSerializer.serialize(filterDatasetNames, "Array<string>", ""));
        }

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("offset", ObjectSerializer.serialize(offset, "number", "int64"));
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", "int64"));
        }

        // Query Params
        if (includeFilterCounts !== undefined) {
            requestContext.setQueryParam("include_filter_counts", ObjectSerializer.serialize(includeFilterCounts, "boolean", ""));
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
     * Summary: Get purgable rows Description: Check the number of rows that can be purged.
     * @param ecosystemv3GetPurgableRowsRequest 
     */
    public async ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest: Ecosystemv3GetPurgableRowsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'ecosystemv3GetPurgableRowsRequest' is not null or undefined
        if (ecosystemv3GetPurgableRowsRequest === null || ecosystemv3GetPurgableRowsRequest === undefined) {
            throw new RequiredError("EcosystemServiceApi", "ecosystemServiceGetPurgableRows", "ecosystemv3GetPurgableRowsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/purge';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(ecosystemv3GetPurgableRowsRequest, "Ecosystemv3GetPurgableRowsRequest", ""),
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
     * Summary: Purge data Description: Purge data.
     * @param datasetNames Name of the datasets, required field.
     */
    public async ecosystemServicePurgeData(datasetNames?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/integrations/datasets/data';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (datasetNames !== undefined) {
            requestContext.setQueryParam("dataset_names", ObjectSerializer.serialize(datasetNames, "Array<string>", ""));
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
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional. Currently this API only supports API_IMPORT type integrations
     * @param ecosystemv3TestIntegrationRequest 
     */
    public async ecosystemServiceTestIntegration(ecosystemv3TestIntegrationRequest: Ecosystemv3TestIntegrationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'ecosystemv3TestIntegrationRequest' is not null or undefined
        if (ecosystemv3TestIntegrationRequest === null || ecosystemv3TestIntegrationRequest === undefined) {
            throw new RequiredError("EcosystemServiceApi", "ecosystemServiceTestIntegration", "ecosystemv3TestIntegrationRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/setup/test';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(ecosystemv3TestIntegrationRequest, "Ecosystemv3TestIntegrationRequest", ""),
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

export class EcosystemServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceCreateDataset
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceCreateDatasetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3CreateDatasetResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3CreateDatasetResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3CreateDatasetResponse", ""
            ) as Ecosystemv3CreateDatasetResponse;
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
            const body: Ecosystemv3CreateDatasetResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3CreateDatasetResponse", ""
            ) as Ecosystemv3CreateDatasetResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceDataInsert
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceDataInsertWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3DataInsertResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3DataInsertResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3DataInsertResponse", ""
            ) as Ecosystemv3DataInsertResponse;
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
            const body: Ecosystemv3DataInsertResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3DataInsertResponse", ""
            ) as Ecosystemv3DataInsertResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceDeleteDatasets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceDeleteDatasetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3DeleteDatasetsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3DeleteDatasetsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3DeleteDatasetsResponse", ""
            ) as Ecosystemv3DeleteDatasetsResponse;
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
            const body: Ecosystemv3DeleteDatasetsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3DeleteDatasetsResponse", ""
            ) as Ecosystemv3DeleteDatasetsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceGetDatasetData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceGetDatasetDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3GetDatasetDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3GetDatasetDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetDatasetDataResponse", ""
            ) as Ecosystemv3GetDatasetDataResponse;
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
            const body: Ecosystemv3GetDatasetDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetDatasetDataResponse", ""
            ) as Ecosystemv3GetDatasetDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceGetDatasetDetail
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceGetDatasetDetailWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3GetDatasetDetailResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3GetDatasetDetailResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetDatasetDetailResponse", ""
            ) as Ecosystemv3GetDatasetDetailResponse;
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
            const body: Ecosystemv3GetDatasetDetailResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetDatasetDetailResponse", ""
            ) as Ecosystemv3GetDatasetDetailResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceGetDatasets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceGetDatasetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3GetDatasetsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3GetDatasetsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetDatasetsResponse", ""
            ) as Ecosystemv3GetDatasetsResponse;
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
            const body: Ecosystemv3GetDatasetsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetDatasetsResponse", ""
            ) as Ecosystemv3GetDatasetsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceGetPurgableRows
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceGetPurgableRowsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3GetPurgableRowsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3GetPurgableRowsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetPurgableRowsResponse", ""
            ) as Ecosystemv3GetPurgableRowsResponse;
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
            const body: Ecosystemv3GetPurgableRowsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3GetPurgableRowsResponse", ""
            ) as Ecosystemv3GetPurgableRowsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServicePurgeData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServicePurgeDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3PurgeDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3PurgeDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3PurgeDataResponse", ""
            ) as Ecosystemv3PurgeDataResponse;
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
            const body: Ecosystemv3PurgeDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3PurgeDataResponse", ""
            ) as Ecosystemv3PurgeDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ecosystemServiceTestIntegration
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ecosystemServiceTestIntegrationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Ecosystemv3TestIntegrationResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Ecosystemv3TestIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3TestIntegrationResponse", ""
            ) as Ecosystemv3TestIntegrationResponse;
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
            const body: Ecosystemv3TestIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Ecosystemv3TestIntegrationResponse", ""
            ) as Ecosystemv3TestIntegrationResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
