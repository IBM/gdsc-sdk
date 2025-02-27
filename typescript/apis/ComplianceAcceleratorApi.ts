// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Complianceacceleratorv3CreateWorkspaceRequest } from '../models/Complianceacceleratorv3CreateWorkspaceRequest';
import { Complianceacceleratorv3DeleteComplianceWorkspacesResponse } from '../models/Complianceacceleratorv3DeleteComplianceWorkspacesResponse';
import { Complianceacceleratorv3GetComplianceInfoResponse } from '../models/Complianceacceleratorv3GetComplianceInfoResponse';
import { Complianceacceleratorv3HydrateComplianceWorkspacesRequest } from '../models/Complianceacceleratorv3HydrateComplianceWorkspacesRequest';
import { Complianceacceleratorv3HydrateComplianceWorkspacesResponse } from '../models/Complianceacceleratorv3HydrateComplianceWorkspacesResponse';
import { Complianceacceleratorv3StoreComplianceInfoRequest } from '../models/Complianceacceleratorv3StoreComplianceInfoRequest';
import { Complianceacceleratorv3StoreComplianceInfoResponse } from '../models/Complianceacceleratorv3StoreComplianceInfoResponse';
import { RuntimeError } from '../models/RuntimeError';
import { StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse } from '../models/StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse';

/**
 * no description
 */
export class ComplianceAcceleratorApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create workspace Description: Create a workspace.
     * @param complianceacceleratorv3CreateWorkspaceRequest 
     */
    public async complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest: Complianceacceleratorv3CreateWorkspaceRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'complianceacceleratorv3CreateWorkspaceRequest' is not null or undefined
        if (complianceacceleratorv3CreateWorkspaceRequest === null || complianceacceleratorv3CreateWorkspaceRequest === undefined) {
            throw new RequiredError("ComplianceAcceleratorApi", "complianceAcceleratorCreateWorkspace", "complianceacceleratorv3CreateWorkspaceRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/compliance/workspace';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(complianceacceleratorv3CreateWorkspaceRequest, "Complianceacceleratorv3CreateWorkspaceRequest", ""),
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
     * Summary: Delete compliance workspaces Description: Delete workspaces.
     * @param regulations Id to be deleted.
     * @param deleteAll if you want to delete a whole configuration.
     */
    public async complianceAcceleratorDeleteComplianceWorkspaces(regulations?: Array<string>, deleteAll?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/compliance';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (regulations !== undefined) {
            requestContext.setQueryParam("regulations", ObjectSerializer.serialize(regulations, "Array<string>", ""));
        }

        // Query Params
        if (deleteAll !== undefined) {
            requestContext.setQueryParam("deleteAll", ObjectSerializer.serialize(deleteAll, "boolean", ""));
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
     * Summary: Get compliance info Description: Return stored compliance data.
     * @param isBrief gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards.
     */
    public async complianceAcceleratorGetComplianceInfo(isBrief?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/compliance';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (isBrief !== undefined) {
            requestContext.setQueryParam("is_brief", ObjectSerializer.serialize(isBrief, "boolean", ""));
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
     * HydrateWorkspace - Hydrates specified objects within a workspace
     * @param complianceacceleratorv3HydrateComplianceWorkspacesRequest 
     */
    public async complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest: Complianceacceleratorv3HydrateComplianceWorkspacesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'complianceacceleratorv3HydrateComplianceWorkspacesRequest' is not null or undefined
        if (complianceacceleratorv3HydrateComplianceWorkspacesRequest === null || complianceacceleratorv3HydrateComplianceWorkspacesRequest === undefined) {
            throw new RequiredError("ComplianceAcceleratorApi", "complianceAcceleratorHydrateWorkspace", "complianceacceleratorv3HydrateComplianceWorkspacesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/compliance/workspace/hydrate';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(complianceacceleratorv3HydrateComplianceWorkspacesRequest, "Complianceacceleratorv3HydrateComplianceWorkspacesRequest", ""),
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
     * Summary: Store compliance info Description: Store compliance data.
     * @param complianceacceleratorv3StoreComplianceInfoRequest 
     */
    public async complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest: Complianceacceleratorv3StoreComplianceInfoRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'complianceacceleratorv3StoreComplianceInfoRequest' is not null or undefined
        if (complianceacceleratorv3StoreComplianceInfoRequest === null || complianceacceleratorv3StoreComplianceInfoRequest === undefined) {
            throw new RequiredError("ComplianceAcceleratorApi", "complianceAcceleratorStoreComplianceInfo", "complianceacceleratorv3StoreComplianceInfoRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/compliance';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(complianceacceleratorv3StoreComplianceInfoRequest, "Complianceacceleratorv3StoreComplianceInfoRequest", ""),
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

export class ComplianceAcceleratorApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to complianceAcceleratorCreateWorkspace
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async complianceAcceleratorCreateWorkspaceWithHttpInfo(response: ResponseContext): Promise<HttpInfo<StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse", ""
            ) as StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse;
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
            const body: StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse", ""
            ) as StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to complianceAcceleratorDeleteComplianceWorkspaces
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async complianceAcceleratorDeleteComplianceWorkspacesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Complianceacceleratorv3DeleteComplianceWorkspacesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Complianceacceleratorv3DeleteComplianceWorkspacesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3DeleteComplianceWorkspacesResponse", ""
            ) as Complianceacceleratorv3DeleteComplianceWorkspacesResponse;
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
            const body: Complianceacceleratorv3DeleteComplianceWorkspacesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3DeleteComplianceWorkspacesResponse", ""
            ) as Complianceacceleratorv3DeleteComplianceWorkspacesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to complianceAcceleratorGetComplianceInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async complianceAcceleratorGetComplianceInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Complianceacceleratorv3GetComplianceInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Complianceacceleratorv3GetComplianceInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3GetComplianceInfoResponse", ""
            ) as Complianceacceleratorv3GetComplianceInfoResponse;
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
            const body: Complianceacceleratorv3GetComplianceInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3GetComplianceInfoResponse", ""
            ) as Complianceacceleratorv3GetComplianceInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to complianceAcceleratorHydrateWorkspace
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async complianceAcceleratorHydrateWorkspaceWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Complianceacceleratorv3HydrateComplianceWorkspacesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Complianceacceleratorv3HydrateComplianceWorkspacesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3HydrateComplianceWorkspacesResponse", ""
            ) as Complianceacceleratorv3HydrateComplianceWorkspacesResponse;
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
            const body: Complianceacceleratorv3HydrateComplianceWorkspacesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3HydrateComplianceWorkspacesResponse", ""
            ) as Complianceacceleratorv3HydrateComplianceWorkspacesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to complianceAcceleratorStoreComplianceInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async complianceAcceleratorStoreComplianceInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Complianceacceleratorv3StoreComplianceInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Complianceacceleratorv3StoreComplianceInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3StoreComplianceInfoResponse", ""
            ) as Complianceacceleratorv3StoreComplianceInfoResponse;
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
            const body: Complianceacceleratorv3StoreComplianceInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Complianceacceleratorv3StoreComplianceInfoResponse", ""
            ) as Complianceacceleratorv3StoreComplianceInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
