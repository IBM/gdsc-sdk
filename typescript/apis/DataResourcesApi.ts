// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Authenticate400Response } from '../models/Authenticate400Response';
import { DataResource } from '../models/DataResource';
import { DataResourcesSummary } from '../models/DataResourcesSummary';
import { ListDataResources200Response } from '../models/ListDataResources200Response';
import { ListDataResourcesFilterParameter } from '../models/ListDataResourcesFilterParameter';
import { ListDataResourcesSortParameter } from '../models/ListDataResourcesSortParameter';
import { RemoveResource200Response } from '../models/RemoveResource200Response';
import { UpdateResourceReviewBody } from '../models/UpdateResourceReviewBody';
import { UpdateResourceReviewStatus200Response } from '../models/UpdateResourceReviewStatus200Response';

/**
 * no description
 */
export class DataResourcesApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get additional details on a specific data resource by providing its ID.
     * Get a specific data resource by its ID
     * @param dataResourceId Data resource ID
     */
    public async getDataResource(dataResourceId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'dataResourceId' is not null or undefined
        if (dataResourceId === null || dataResourceId === undefined) {
            throw new RequiredError("DataResourcesApi", "getDataResource", "dataResourceId");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/dataResources/{dataResourceId}'
            .replace('{' + 'dataResourceId' + '}', encodeURIComponent(String(dataResourceId)));

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
     * Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.
     * Data resources summary
     * @param dataStoreId Data store id
     * @param filter 
     */
    public async getDataResourcesSummary(dataStoreId?: string, filter?: ListDataResourcesFilterParameter, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v1/dspm/dataResources/summary';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (dataStoreId !== undefined) {
            requestContext.setQueryParam("dataStoreId", ObjectSerializer.serialize(dataStoreId, "string", ""));
        }

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "ListDataResourcesFilterParameter", ""));
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
     * Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List data resources that match a given filter
     * @param dataStoreId 
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public async listDataResources(dataStoreId?: string, filter?: ListDataResourcesFilterParameter, sort?: ListDataResourcesSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;






        // Path Params
        const localVarPath = '/api/v1/dspm/dataResources';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (dataStoreId !== undefined) {
            requestContext.setQueryParam("dataStoreId", ObjectSerializer.serialize(dataStoreId, "string", ""));
        }

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "ListDataResourcesFilterParameter", ""));
        }

        // Query Params
        if (sort !== undefined) {
            requestContext.setQueryParam("sort", ObjectSerializer.serialize(sort, "ListDataResourcesSortParameter", ""));
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
     * List and filter data resources by their names
     * List names of data resources
     * @param prefix Prefix of data resource name
     * @param dataStoreId 
     */
    public async listDataResourcesNames(prefix: string, dataStoreId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'prefix' is not null or undefined
        if (prefix === null || prefix === undefined) {
            throw new RequiredError("DataResourcesApi", "listDataResourcesNames", "prefix");
        }



        // Path Params
        const localVarPath = '/api/v1/dspm/dataResources/names';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (prefix !== undefined) {
            requestContext.setQueryParam("prefix", ObjectSerializer.serialize(prefix, "string", ""));
        }

        // Query Params
        if (dataStoreId !== undefined) {
            requestContext.setQueryParam("dataStoreId", ObjectSerializer.serialize(dataStoreId, "string", ""));
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
     * Removes a resource, with all its sensitivities, from Guardium Insights SaaS DSPM dashboard. This action does not remove the resource from the resource\'s source environment.
     * Remove resource from Guardium Insights SaaS DSPM
     * @param dataResourceId Data resource ID
     * @param dataStoreId Data store ID
     */
    public async removeResource(dataResourceId: string, dataStoreId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'dataResourceId' is not null or undefined
        if (dataResourceId === null || dataResourceId === undefined) {
            throw new RequiredError("DataResourcesApi", "removeResource", "dataResourceId");
        }


        // verify required parameter 'dataStoreId' is not null or undefined
        if (dataStoreId === null || dataStoreId === undefined) {
            throw new RequiredError("DataResourcesApi", "removeResource", "dataStoreId");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/dataResources/{dataResourceId}/removeResource'
            .replace('{' + 'dataResourceId' + '}', encodeURIComponent(String(dataResourceId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (dataStoreId !== undefined) {
            requestContext.setQueryParam("dataStoreId", ObjectSerializer.serialize(dataStoreId, "string", ""));
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
     * Set the review status of a specific data resource in a specific data store.
     * Set review status of a data resource
     * @param dataResourceId Data resource id
     * @param updateResourceReviewBody 
     */
    public async updateResourceReviewStatus(dataResourceId: string, updateResourceReviewBody: UpdateResourceReviewBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'dataResourceId' is not null or undefined
        if (dataResourceId === null || dataResourceId === undefined) {
            throw new RequiredError("DataResourcesApi", "updateResourceReviewStatus", "dataResourceId");
        }


        // verify required parameter 'updateResourceReviewBody' is not null or undefined
        if (updateResourceReviewBody === null || updateResourceReviewBody === undefined) {
            throw new RequiredError("DataResourcesApi", "updateResourceReviewStatus", "updateResourceReviewBody");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/dataResources/{dataResourceId}/reviewed'
            .replace('{' + 'dataResourceId' + '}', encodeURIComponent(String(dataResourceId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateResourceReviewBody, "UpdateResourceReviewBody", ""),
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

export class DataResourcesApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getDataResource
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getDataResourceWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DataResource >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DataResource = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DataResource", ""
            ) as DataResource;
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
            const body: DataResource = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DataResource", ""
            ) as DataResource;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getDataResourcesSummary
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getDataResourcesSummaryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DataResourcesSummary >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DataResourcesSummary = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DataResourcesSummary", ""
            ) as DataResourcesSummary;
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
            const body: DataResourcesSummary = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DataResourcesSummary", ""
            ) as DataResourcesSummary;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listDataResources
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listDataResourcesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListDataResources200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListDataResources200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListDataResources200Response", ""
            ) as ListDataResources200Response;
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
            const body: ListDataResources200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListDataResources200Response", ""
            ) as ListDataResources200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listDataResourcesNames
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listDataResourcesNamesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<string> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<string> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<string>", ""
            ) as Array<string>;
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
            const body: Array<string> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<string>", ""
            ) as Array<string>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to removeResource
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async removeResourceWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RemoveResource200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RemoveResource200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RemoveResource200Response", ""
            ) as RemoveResource200Response;
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
            const body: RemoveResource200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RemoveResource200Response", ""
            ) as RemoveResource200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateResourceReviewStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateResourceReviewStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UpdateResourceReviewStatus200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UpdateResourceReviewStatus200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateResourceReviewStatus200Response", ""
            ) as UpdateResourceReviewStatus200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UpdateResourceReviewStatus200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateResourceReviewStatus200Response", ""
            ) as UpdateResourceReviewStatus200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
