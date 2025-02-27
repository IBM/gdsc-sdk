// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AddCommentBody } from '../models/AddCommentBody';
import { Authenticate400Response } from '../models/Authenticate400Response';
import { ListVulnerabilities200Response } from '../models/ListVulnerabilities200Response';
import { ListVulnerabilitiesByDataStore200Response } from '../models/ListVulnerabilitiesByDataStore200Response';
import { ListVulnerabilitiesByDataStoreSortParameter } from '../models/ListVulnerabilitiesByDataStoreSortParameter';
import { ListVulnerabilitiesSortParameter } from '../models/ListVulnerabilitiesSortParameter';
import { SetVulnerabilityStatusRequest } from '../models/SetVulnerabilityStatusRequest';
import { UpdateCommentBody } from '../models/UpdateCommentBody';
import { VulnerabilitiesByDataStoreFilterOptions } from '../models/VulnerabilitiesByDataStoreFilterOptions';
import { VulnerabilitiesFilterOptions } from '../models/VulnerabilitiesFilterOptions';
import { VulnerabilitiesSummary } from '../models/VulnerabilitiesSummary';
import { Vulnerability } from '../models/Vulnerability';
import { VulnerabilityStatus } from '../models/VulnerabilityStatus';
import { VulnerabilityStatusComment } from '../models/VulnerabilityStatusComment';

/**
 * no description
 */
export class DataVulnerabilitiesApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Add or update the status comment of a vulnerability status to keep track of the workflow progress.
     * Add vulnerability status comment
     * @param vulnerabilityId 
     * @param statusId 
     * @param addCommentBody 
     */
    public async addVulnerabilityStatusComment(vulnerabilityId: string, statusId: string, addCommentBody: AddCommentBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vulnerabilityId' is not null or undefined
        if (vulnerabilityId === null || vulnerabilityId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "addVulnerabilityStatusComment", "vulnerabilityId");
        }


        // verify required parameter 'statusId' is not null or undefined
        if (statusId === null || statusId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "addVulnerabilityStatusComment", "statusId");
        }


        // verify required parameter 'addCommentBody' is not null or undefined
        if (addCommentBody === null || addCommentBody === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "addVulnerabilityStatusComment", "addCommentBody");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments'
            .replace('{' + 'vulnerabilityId' + '}', encodeURIComponent(String(vulnerabilityId)))
            .replace('{' + 'statusId' + '}', encodeURIComponent(String(statusId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(addCommentBody, "AddCommentBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
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
     * Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility\'s type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.
     * Get vulnerabilities summary
     * @param filter 
     */
    public async getVulnerabilitiesSummary(filter?: VulnerabilitiesFilterOptions, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities/summary';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "VulnerabilitiesFilterOptions", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
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
     * Get vulnerability details by providing its ID.
     * Get vulnerability details by ID
     * @param vulnerabilityId 
     */
    public async getVulnerability(vulnerabilityId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vulnerabilityId' is not null or undefined
        if (vulnerabilityId === null || vulnerabilityId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "getVulnerability", "vulnerabilityId");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities/{vulnerabilityId}'
            .replace('{' + 'vulnerabilityId' + '}', encodeURIComponent(String(vulnerabilityId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
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
     * Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List vulnerabilities based on an applied filter
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public async listVulnerabilities(filter?: VulnerabilitiesFilterOptions, sort?: ListVulnerabilitiesSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "VulnerabilitiesFilterOptions", ""));
        }

        // Query Params
        if (sort !== undefined) {
            requestContext.setQueryParam("sort", ObjectSerializer.serialize(sort, "ListVulnerabilitiesSortParameter", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("pageSize", ObjectSerializer.serialize(pageSize, "number", ""));
        }

        // Query Params
        if (nextToken !== undefined) {
            requestContext.setQueryParam("nextToken", ObjectSerializer.serialize(nextToken, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
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
     * Get a list of all the vulnerabilities of data stores.
     * List vulnerabilities of data stores
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public async listVulnerabilitiesByDataStore(filter?: VulnerabilitiesByDataStoreFilterOptions, sort?: ListVulnerabilitiesByDataStoreSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities/byDataStore';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "VulnerabilitiesByDataStoreFilterOptions", ""));
        }

        // Query Params
        if (sort !== undefined) {
            requestContext.setQueryParam("sort", ObjectSerializer.serialize(sort, "ListVulnerabilitiesByDataStoreSortParameter", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("pageSize", ObjectSerializer.serialize(pageSize, "number", ""));
        }

        // Query Params
        if (nextToken !== undefined) {
            requestContext.setQueryParam("nextToken", ObjectSerializer.serialize(nextToken, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
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
     * Delete a status comment of a vulnerability status.
     * Delete vulnerability status comment
     * @param vulnerabilityId 
     * @param statusId 
     * @param commentId 
     */
    public async removeVulnerabilityStatusComment(vulnerabilityId: string, statusId: string, commentId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vulnerabilityId' is not null or undefined
        if (vulnerabilityId === null || vulnerabilityId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "removeVulnerabilityStatusComment", "vulnerabilityId");
        }


        // verify required parameter 'statusId' is not null or undefined
        if (statusId === null || statusId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "removeVulnerabilityStatusComment", "statusId");
        }


        // verify required parameter 'commentId' is not null or undefined
        if (commentId === null || commentId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "removeVulnerabilityStatusComment", "commentId");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId}'
            .replace('{' + 'vulnerabilityId' + '}', encodeURIComponent(String(vulnerabilityId)))
            .replace('{' + 'statusId' + '}', encodeURIComponent(String(statusId)))
            .replace('{' + 'commentId' + '}', encodeURIComponent(String(commentId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
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
     * Add or update the status of a vulnerability to track its progress.
     * Set status of a vulnerability
     * @param vulnerabilityId 
     * @param setVulnerabilityStatusRequest 
     */
    public async setVulnerabilityStatus(vulnerabilityId: string, setVulnerabilityStatusRequest: SetVulnerabilityStatusRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vulnerabilityId' is not null or undefined
        if (vulnerabilityId === null || vulnerabilityId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "setVulnerabilityStatus", "vulnerabilityId");
        }


        // verify required parameter 'setVulnerabilityStatusRequest' is not null or undefined
        if (setVulnerabilityStatusRequest === null || setVulnerabilityStatusRequest === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "setVulnerabilityStatus", "setVulnerabilityStatusRequest");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses'
            .replace('{' + 'vulnerabilityId' + '}', encodeURIComponent(String(vulnerabilityId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(setVulnerabilityStatusRequest, "SetVulnerabilityStatusRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
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
     * Set a vulnerability status of a vulnerability.
     * Set vulnerability status
     * @param vulnerabilityId 
     * @param statusId 
     * @param commentId 
     * @param updateCommentBody 
     */
    public async updateVulnerabilityStatusComment(vulnerabilityId: string, statusId: string, commentId: string, updateCommentBody: UpdateCommentBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vulnerabilityId' is not null or undefined
        if (vulnerabilityId === null || vulnerabilityId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "updateVulnerabilityStatusComment", "vulnerabilityId");
        }


        // verify required parameter 'statusId' is not null or undefined
        if (statusId === null || statusId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "updateVulnerabilityStatusComment", "statusId");
        }


        // verify required parameter 'commentId' is not null or undefined
        if (commentId === null || commentId === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "updateVulnerabilityStatusComment", "commentId");
        }


        // verify required parameter 'updateCommentBody' is not null or undefined
        if (updateCommentBody === null || updateCommentBody === undefined) {
            throw new RequiredError("DataVulnerabilitiesApi", "updateVulnerabilityStatusComment", "updateCommentBody");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId}'
            .replace('{' + 'vulnerabilityId' + '}', encodeURIComponent(String(vulnerabilityId)))
            .replace('{' + 'statusId' + '}', encodeURIComponent(String(statusId)))
            .replace('{' + 'commentId' + '}', encodeURIComponent(String(commentId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateCommentBody, "UpdateCommentBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
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

export class DataVulnerabilitiesApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to addVulnerabilityStatusComment
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async addVulnerabilityStatusCommentWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VulnerabilityStatus >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VulnerabilityStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilityStatus", ""
            ) as VulnerabilityStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VulnerabilityStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilityStatus", ""
            ) as VulnerabilityStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getVulnerabilitiesSummary
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getVulnerabilitiesSummaryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VulnerabilitiesSummary >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VulnerabilitiesSummary = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilitiesSummary", ""
            ) as VulnerabilitiesSummary;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VulnerabilitiesSummary = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilitiesSummary", ""
            ) as VulnerabilitiesSummary;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getVulnerability
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getVulnerabilityWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Vulnerability >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Vulnerability = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Vulnerability", ""
            ) as Vulnerability;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Vulnerability = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Vulnerability", ""
            ) as Vulnerability;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listVulnerabilities
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listVulnerabilitiesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListVulnerabilities200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListVulnerabilities200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVulnerabilities200Response", ""
            ) as ListVulnerabilities200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ListVulnerabilities200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVulnerabilities200Response", ""
            ) as ListVulnerabilities200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listVulnerabilitiesByDataStore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listVulnerabilitiesByDataStoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListVulnerabilitiesByDataStore200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListVulnerabilitiesByDataStore200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVulnerabilitiesByDataStore200Response", ""
            ) as ListVulnerabilitiesByDataStore200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ListVulnerabilitiesByDataStore200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVulnerabilitiesByDataStore200Response", ""
            ) as ListVulnerabilitiesByDataStore200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to removeVulnerabilityStatusComment
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async removeVulnerabilityStatusCommentWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
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

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to setVulnerabilityStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async setVulnerabilityStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VulnerabilityStatus >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VulnerabilityStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilityStatus", ""
            ) as VulnerabilityStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VulnerabilityStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilityStatus", ""
            ) as VulnerabilityStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateVulnerabilityStatusComment
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateVulnerabilityStatusCommentWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VulnerabilityStatusComment >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VulnerabilityStatusComment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilityStatusComment", ""
            ) as VulnerabilityStatusComment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VulnerabilityStatusComment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VulnerabilityStatusComment", ""
            ) as VulnerabilityStatusComment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
