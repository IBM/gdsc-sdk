// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Authenticate400Response } from '../models/Authenticate400Response';
import { LinkedVendor } from '../models/LinkedVendor';
import { ListLinkedVendorDataStores200Response } from '../models/ListLinkedVendorDataStores200Response';
import { ListLinkedVendorDataStoresSortParameter } from '../models/ListLinkedVendorDataStoresSortParameter';
import { ListTrusteesFilterParameter } from '../models/ListTrusteesFilterParameter';
import { ListVendorDataStoresFilterParameter } from '../models/ListVendorDataStoresFilterParameter';
import { Trustee } from '../models/Trustee';
import { VendorSummary } from '../models/VendorSummary';

/**
 * no description
 */
export class ThirdPartyVendorsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.
     * Get additional details of a specific third party vendor
     * @param vendorId The third party vendor\&#39;s account ID
     */
    public async getLinkedVendor(vendorId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vendorId' is not null or undefined
        if (vendorId === null || vendorId === undefined) {
            throw new RequiredError("ThirdPartyVendorsApi", "getLinkedVendor", "vendorId");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts'
            .replace('{' + 'vendorId' + '}', encodeURIComponent(String(vendorId)));

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
     * Get details about a third party vendor.
     * Get the third party vendors list
     * @param vendorId vendor id
     */
    public async getSingleLinkedVendor(vendorId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vendorId' is not null or undefined
        if (vendorId === null || vendorId === undefined) {
            throw new RequiredError("ThirdPartyVendorsApi", "getSingleLinkedVendor", "vendorId");
        }


        // Path Params
        const localVarPath = '/api/v1/dspm/linkedVendors/{vendorId}'
            .replace('{' + 'vendorId' + '}', encodeURIComponent(String(vendorId)));

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
     * Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.
     * Get the data stores associated with a third party vendor
     * @param vendorId The third party vendor\&#39;s account ID
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public async listLinkedVendorDataStores(vendorId: string, filter?: ListVendorDataStoresFilterParameter, sort?: ListLinkedVendorDataStoresSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vendorId' is not null or undefined
        if (vendorId === null || vendorId === undefined) {
            throw new RequiredError("ThirdPartyVendorsApi", "listLinkedVendorDataStores", "vendorId");
        }






        // Path Params
        const localVarPath = '/api/v1/dspm/linkedVendors/{vendorId}/dataStores'
            .replace('{' + 'vendorId' + '}', encodeURIComponent(String(vendorId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "ListVendorDataStoresFilterParameter", ""));
        }

        // Query Params
        if (sort !== undefined) {
            requestContext.setQueryParam("sort", ObjectSerializer.serialize(sort, "ListLinkedVendorDataStoresSortParameter", ""));
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
     * Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).
     * Get the summary of a third party vendor
     */
    public async listLinkedVendors(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v1/dspm/linkedVendors';

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
     * Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.
     * Get a list of all the actual trusted assets
     * @param filter 
     */
    public async listTrustedAssets(filter?: ListTrusteesFilterParameter, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v1/dspm/linkedVendors/trustedAssets';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "ListTrusteesFilterParameter", ""));
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

}

export class ThirdPartyVendorsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getLinkedVendor
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getLinkedVendorWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<VendorSummary> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<VendorSummary> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<VendorSummary>", ""
            ) as Array<VendorSummary>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Bad Request", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Forbidden", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: Authenticate400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Authenticate400Response", ""
            ) as Authenticate400Response;
            throw new ApiException<Authenticate400Response>(response.httpStatusCode, "Internal Server Error", body, response.headers);
        }
        if (isCodeInRange("503", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Service Unavailable", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<VendorSummary> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<VendorSummary>", ""
            ) as Array<VendorSummary>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSingleLinkedVendor
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getSingleLinkedVendorWithHttpInfo(response: ResponseContext): Promise<HttpInfo<LinkedVendor >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LinkedVendor = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LinkedVendor", ""
            ) as LinkedVendor;
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
            const body: LinkedVendor = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LinkedVendor", ""
            ) as LinkedVendor;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listLinkedVendorDataStores
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listLinkedVendorDataStoresWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListLinkedVendorDataStores200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListLinkedVendorDataStores200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListLinkedVendorDataStores200Response", ""
            ) as ListLinkedVendorDataStores200Response;
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
            const body: ListLinkedVendorDataStores200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListLinkedVendorDataStores200Response", ""
            ) as ListLinkedVendorDataStores200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listLinkedVendors
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listLinkedVendorsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<LinkedVendor> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<LinkedVendor> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<LinkedVendor>", ""
            ) as Array<LinkedVendor>;
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
            const body: Array<LinkedVendor> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<LinkedVendor>", ""
            ) as Array<LinkedVendor>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listTrustedAssets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listTrustedAssetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<Trustee> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<Trustee> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<Trustee>", ""
            ) as Array<Trustee>;
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
            const body: Array<Trustee> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<Trustee>", ""
            ) as Array<Trustee>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
