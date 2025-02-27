// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Jumpboxv3AuthorizeRequest } from '../models/Jumpboxv3AuthorizeRequest';
import { Jumpboxv3AuthorizeResponse } from '../models/Jumpboxv3AuthorizeResponse';
import { Jumpboxv3GetTenantResponse } from '../models/Jumpboxv3GetTenantResponse';
import { Jumpboxv3GetTenantsResponse } from '../models/Jumpboxv3GetTenantsResponse';
import { Jumpboxv3PostTenantsRequest } from '../models/Jumpboxv3PostTenantsRequest';
import { Jumpboxv3PostTenantsResponse } from '../models/Jumpboxv3PostTenantsResponse';
import { Jumpboxv3PostUsersBulkRequest } from '../models/Jumpboxv3PostUsersBulkRequest';
import { Jumpboxv3PostUsersBulkResponse } from '../models/Jumpboxv3PostUsersBulkResponse';
import { Jumpboxv3SearchUsersRequest } from '../models/Jumpboxv3SearchUsersRequest';
import { Jumpboxv3SearchUsersResponse } from '../models/Jumpboxv3SearchUsersResponse';
import { Jumpboxv3TestUserRequest } from '../models/Jumpboxv3TestUserRequest';
import { Jumpboxv3TestUserResponse } from '../models/Jumpboxv3TestUserResponse';
import { Jumpboxv3UpdateTenantRequest } from '../models/Jumpboxv3UpdateTenantRequest';
import { Jumpboxv3UpdateTenantResponse } from '../models/Jumpboxv3UpdateTenantResponse';
import { Jumpboxv3UpdateUsersBulkRequest } from '../models/Jumpboxv3UpdateUsersBulkRequest';
import { Jumpboxv3UpdateUsersBulkResponse } from '../models/Jumpboxv3UpdateUsersBulkResponse';
import { RuntimeError } from '../models/RuntimeError';
import { Tenantuserv3GetUsersResponse } from '../models/Tenantuserv3GetUsersResponse';

/**
 * no description
 */
export class JumpboxServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Authorize Description: Authenticate a user and return a JWT.
     * @param jumpboxv3AuthorizeRequest 
     */
    public async jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest: Jumpboxv3AuthorizeRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jumpboxv3AuthorizeRequest' is not null or undefined
        if (jumpboxv3AuthorizeRequest === null || jumpboxv3AuthorizeRequest === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceAuthorize", "jumpboxv3AuthorizeRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/authorization';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(jumpboxv3AuthorizeRequest, "Jumpboxv3AuthorizeRequest", ""),
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
     * Summary: Delete tenant Description: Delete a tenant.
     * @param tenantId Tenant id.
     * @param isPermanentDelete Delete tenant permanently if true.
     * @param async Async.
     */
    public async jumpboxServiceDeleteTenant(tenantId: string, isPermanentDelete?: boolean, async?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceDeleteTenant", "tenantId");
        }




        // Path Params
        const localVarPath = '/api/v3/tenants/{tenant_id}'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (isPermanentDelete !== undefined) {
            requestContext.setQueryParam("is_permanent_delete", ObjectSerializer.serialize(isPermanentDelete, "boolean", ""));
        }

        // Query Params
        if (async !== undefined) {
            requestContext.setQueryParam("async", ObjectSerializer.serialize(async, "boolean", ""));
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
     * Summary: Delete user Description: Delete the user.
     * @param userId The user id.
     */
    public async jumpboxServiceDeleteUser(userId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceDeleteUser", "userId");
        }


        // Path Params
        const localVarPath = '/api/v3/users/{user_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
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
     * Summary: Get tenant Description: Get a tenant.
     * @param tenantId Tenant id.
     * @param includeInactive Include inactive.
     * @param includeNotReady Include tenants that are not ready(are in state of being created or deleted).
     */
    public async jumpboxServiceGetTenant(tenantId: string, includeInactive?: boolean, includeNotReady?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceGetTenant", "tenantId");
        }




        // Path Params
        const localVarPath = '/api/v3/tenants/{tenant_id}'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (includeInactive !== undefined) {
            requestContext.setQueryParam("include_inactive", ObjectSerializer.serialize(includeInactive, "boolean", ""));
        }

        // Query Params
        if (includeNotReady !== undefined) {
            requestContext.setQueryParam("include_not_ready", ObjectSerializer.serialize(includeNotReady, "boolean", ""));
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
     * Summary: Get tenants Description: Get all tenant base on UID.
     * @param uid Email.
     * @param externalId External id.
     * @param includeInactive Include inactive.
     * @param includeNotReady Include tenants that are not ready(are in state of being created or deleted).
     */
    public async jumpboxServiceGetTenants(uid?: string, externalId?: string, includeInactive?: boolean, includeNotReady?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/api/v3/tenants';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (uid !== undefined) {
            requestContext.setQueryParam("uid", ObjectSerializer.serialize(uid, "string", ""));
        }

        // Query Params
        if (externalId !== undefined) {
            requestContext.setQueryParam("external_id", ObjectSerializer.serialize(externalId, "string", ""));
        }

        // Query Params
        if (includeInactive !== undefined) {
            requestContext.setQueryParam("include_inactive", ObjectSerializer.serialize(includeInactive, "boolean", ""));
        }

        // Query Params
        if (includeNotReady !== undefined) {
            requestContext.setQueryParam("include_not_ready", ObjectSerializer.serialize(includeNotReady, "boolean", ""));
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
     * Summary: Get users Description: Get all users base on a tenantID.
     * @param uid Email.
     */
    public async jumpboxServiceGetUsers(uid?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/users';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (uid !== undefined) {
            requestContext.setQueryParam("uid", ObjectSerializer.serialize(uid, "string", ""));
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
     * Summary: Post tenants Description: Create a tenant.
     * @param jumpboxv3PostTenantsRequest 
     */
    public async jumpboxServicePostTenants(jumpboxv3PostTenantsRequest: Jumpboxv3PostTenantsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jumpboxv3PostTenantsRequest' is not null or undefined
        if (jumpboxv3PostTenantsRequest === null || jumpboxv3PostTenantsRequest === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServicePostTenants", "jumpboxv3PostTenantsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/tenants';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(jumpboxv3PostTenantsRequest, "Jumpboxv3PostTenantsRequest", ""),
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
     * Summary: Post users Description: Create users.
     * @param jumpboxv3PostUsersBulkRequest 
     */
    public async jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest: Jumpboxv3PostUsersBulkRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jumpboxv3PostUsersBulkRequest' is not null or undefined
        if (jumpboxv3PostUsersBulkRequest === null || jumpboxv3PostUsersBulkRequest === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServicePostUsers", "jumpboxv3PostUsersBulkRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/users';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(jumpboxv3PostUsersBulkRequest, "Jumpboxv3PostUsersBulkRequest", ""),
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
     * Summary: Search users Description: Search for all users matching the provided string.
     * @param jumpboxv3SearchUsersRequest 
     */
    public async jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest: Jumpboxv3SearchUsersRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jumpboxv3SearchUsersRequest' is not null or undefined
        if (jumpboxv3SearchUsersRequest === null || jumpboxv3SearchUsersRequest === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceSearchUsers", "jumpboxv3SearchUsersRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/users/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(jumpboxv3SearchUsersRequest, "Jumpboxv3SearchUsersRequest", ""),
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
     * Summary: Test user Description: Test a user lookup to a given LDAP.
     * @param jumpboxv3TestUserRequest 
     */
    public async jumpboxServiceTestUser(jumpboxv3TestUserRequest: Jumpboxv3TestUserRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jumpboxv3TestUserRequest' is not null or undefined
        if (jumpboxv3TestUserRequest === null || jumpboxv3TestUserRequest === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceTestUser", "jumpboxv3TestUserRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/users/test';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(jumpboxv3TestUserRequest, "Jumpboxv3TestUserRequest", ""),
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
     * Summary: Update tenant Description: Update a tenant.
     * @param tenantId Tenant id.
     * @param jumpboxv3UpdateTenantRequest 
     */
    public async jumpboxServiceUpdateTenant(tenantId: string, jumpboxv3UpdateTenantRequest: Jumpboxv3UpdateTenantRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceUpdateTenant", "tenantId");
        }


        // verify required parameter 'jumpboxv3UpdateTenantRequest' is not null or undefined
        if (jumpboxv3UpdateTenantRequest === null || jumpboxv3UpdateTenantRequest === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceUpdateTenant", "jumpboxv3UpdateTenantRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/tenants/{tenant_id}'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(jumpboxv3UpdateTenantRequest, "Jumpboxv3UpdateTenantRequest", ""),
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
     * Summary: Update users Description: Update an array of users.
     * @param jumpboxv3UpdateUsersBulkRequest 
     */
    public async jumpboxServiceUpdateUsers(jumpboxv3UpdateUsersBulkRequest: Jumpboxv3UpdateUsersBulkRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jumpboxv3UpdateUsersBulkRequest' is not null or undefined
        if (jumpboxv3UpdateUsersBulkRequest === null || jumpboxv3UpdateUsersBulkRequest === undefined) {
            throw new RequiredError("JumpboxServiceApi", "jumpboxServiceUpdateUsers", "jumpboxv3UpdateUsersBulkRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/users';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(jumpboxv3UpdateUsersBulkRequest, "Jumpboxv3UpdateUsersBulkRequest", ""),
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

export class JumpboxServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceAuthorize
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceAuthorizeWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3AuthorizeResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3AuthorizeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3AuthorizeResponse", ""
            ) as Jumpboxv3AuthorizeResponse;
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
            const body: Jumpboxv3AuthorizeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3AuthorizeResponse", ""
            ) as Jumpboxv3AuthorizeResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceDeleteTenant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceDeleteTenantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
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
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceDeleteUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceDeleteUserWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
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
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceGetTenant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceGetTenantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3GetTenantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3GetTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3GetTenantResponse", ""
            ) as Jumpboxv3GetTenantResponse;
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
            const body: Jumpboxv3GetTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3GetTenantResponse", ""
            ) as Jumpboxv3GetTenantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceGetTenants
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceGetTenantsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3GetTenantsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3GetTenantsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3GetTenantsResponse", ""
            ) as Jumpboxv3GetTenantsResponse;
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
            const body: Jumpboxv3GetTenantsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3GetTenantsResponse", ""
            ) as Jumpboxv3GetTenantsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceGetUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceGetUsersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetUsersResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetUsersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUsersResponse", ""
            ) as Tenantuserv3GetUsersResponse;
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
            const body: Tenantuserv3GetUsersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUsersResponse", ""
            ) as Tenantuserv3GetUsersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServicePostTenants
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServicePostTenantsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3PostTenantsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3PostTenantsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3PostTenantsResponse", ""
            ) as Jumpboxv3PostTenantsResponse;
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
            const body: Jumpboxv3PostTenantsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3PostTenantsResponse", ""
            ) as Jumpboxv3PostTenantsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServicePostUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServicePostUsersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3PostUsersBulkResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3PostUsersBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3PostUsersBulkResponse", ""
            ) as Jumpboxv3PostUsersBulkResponse;
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
            const body: Jumpboxv3PostUsersBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3PostUsersBulkResponse", ""
            ) as Jumpboxv3PostUsersBulkResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceSearchUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceSearchUsersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3SearchUsersResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3SearchUsersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3SearchUsersResponse", ""
            ) as Jumpboxv3SearchUsersResponse;
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
            const body: Jumpboxv3SearchUsersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3SearchUsersResponse", ""
            ) as Jumpboxv3SearchUsersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceTestUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceTestUserWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3TestUserResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3TestUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3TestUserResponse", ""
            ) as Jumpboxv3TestUserResponse;
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
            const body: Jumpboxv3TestUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3TestUserResponse", ""
            ) as Jumpboxv3TestUserResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceUpdateTenant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceUpdateTenantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3UpdateTenantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3UpdateTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3UpdateTenantResponse", ""
            ) as Jumpboxv3UpdateTenantResponse;
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
            const body: Jumpboxv3UpdateTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3UpdateTenantResponse", ""
            ) as Jumpboxv3UpdateTenantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to jumpboxServiceUpdateUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async jumpboxServiceUpdateUsersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Jumpboxv3UpdateUsersBulkResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Jumpboxv3UpdateUsersBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3UpdateUsersBulkResponse", ""
            ) as Jumpboxv3UpdateUsersBulkResponse;
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
            const body: Jumpboxv3UpdateUsersBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Jumpboxv3UpdateUsersBulkResponse", ""
            ) as Jumpboxv3UpdateUsersBulkResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
