// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { RuntimeError } from '../models/RuntimeError';
import { Tenantuserv3CreateApiKeyRequest } from '../models/Tenantuserv3CreateApiKeyRequest';
import { Tenantuserv3CreateApiKeyResponse } from '../models/Tenantuserv3CreateApiKeyResponse';
import { Tenantuserv3GetApiKeysResponse } from '../models/Tenantuserv3GetApiKeysResponse';
import { Tenantuserv3GetCurrentUserResponse } from '../models/Tenantuserv3GetCurrentUserResponse';
import { Tenantuserv3GetPrivilegeResponse } from '../models/Tenantuserv3GetPrivilegeResponse';
import { Tenantuserv3GetPrivilegesResponse } from '../models/Tenantuserv3GetPrivilegesResponse';
import { Tenantuserv3GetRolesResponse } from '../models/Tenantuserv3GetRolesResponse';
import { Tenantuserv3GetUserNamesRequest } from '../models/Tenantuserv3GetUserNamesRequest';
import { Tenantuserv3GetUserNamesResponse } from '../models/Tenantuserv3GetUserNamesResponse';
import { Tenantuserv3GetUserResponse } from '../models/Tenantuserv3GetUserResponse';
import { Tenantuserv3GetUserTenantResponse } from '../models/Tenantuserv3GetUserTenantResponse';
import { Tenantuserv3PostPrivilegesBulkRequest } from '../models/Tenantuserv3PostPrivilegesBulkRequest';
import { Tenantuserv3PostPrivilegesBulkResponse } from '../models/Tenantuserv3PostPrivilegesBulkResponse';
import { Tenantuserv3PostRoleRequest } from '../models/Tenantuserv3PostRoleRequest';
import { Tenantuserv3PostRoleResponse } from '../models/Tenantuserv3PostRoleResponse';
import { Tenantuserv3Role } from '../models/Tenantuserv3Role';
import { Tenantuserv3UpdatePrivilegeRequest } from '../models/Tenantuserv3UpdatePrivilegeRequest';
import { Tenantuserv3UpdatePrivilegeResponse } from '../models/Tenantuserv3UpdatePrivilegeResponse';
import { Tenantuserv3UpdatePrivilegesBulkRequest } from '../models/Tenantuserv3UpdatePrivilegesBulkRequest';
import { Tenantuserv3UpdatePrivilegesBulkResponse } from '../models/Tenantuserv3UpdatePrivilegesBulkResponse';
import { Tenantuserv3UpdateRoleRequest } from '../models/Tenantuserv3UpdateRoleRequest';
import { Tenantuserv3UpdateRoleResponse } from '../models/Tenantuserv3UpdateRoleResponse';
import { Tenantuserv3UpdateUserRoleBulkRequest } from '../models/Tenantuserv3UpdateUserRoleBulkRequest';
import { Tenantuserv3UpdateUserRoleBulkResponse } from '../models/Tenantuserv3UpdateUserRoleBulkResponse';

/**
 * no description
 */
export class TenantuserApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create API key Description: Create API Key.
     * @param tenantuserv3CreateApiKeyRequest 
     */
    public async tenantuserCreateAPIKey(tenantuserv3CreateApiKeyRequest: Tenantuserv3CreateApiKeyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantuserv3CreateApiKeyRequest' is not null or undefined
        if (tenantuserv3CreateApiKeyRequest === null || tenantuserv3CreateApiKeyRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserCreateAPIKey", "tenantuserv3CreateApiKeyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/apikeys';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3CreateApiKeyRequest, "Tenantuserv3CreateApiKeyRequest", ""),
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
     * Summary: Delete API key Description: Delete APIKey Document based on the document id.
     * @param id Apikey id.
     */
    public async tenantuserDeleteAPIKey(id: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserDeleteAPIKey", "id");
        }


        // Path Params
        const localVarPath = '/api/v3/apikeys/{id}'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

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
     * Summary: Delete role Description: Delete a role.
     * @param roleId ID or role deleted.
     */
    public async tenantuserDeleteRole(roleId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'roleId' is not null or undefined
        if (roleId === null || roleId === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserDeleteRole", "roleId");
        }


        // Path Params
        const localVarPath = '/api/v3/roles/{role_id}'
            .replace('{' + 'role_id' + '}', encodeURIComponent(String(roleId)));

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
     * Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
     */
    public async tenantuserGetAPIKeys(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/apikeys';

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
     * Summary: Get current user Description: Return the currently authenticated user.
     */
    public async tenantuserGetCurrentUser(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/currentuser';

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
     * Summary: Get privilege Description: Return privilege.
     * @param privilegePrivilegeId Privilege ID.
     * @param privilegeType Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined.
     */
    public async tenantuserGetPrivilege(privilegePrivilegeId: string, privilegeType?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'privilegePrivilegeId' is not null or undefined
        if (privilegePrivilegeId === null || privilegePrivilegeId === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserGetPrivilege", "privilegePrivilegeId");
        }



        // Path Params
        const localVarPath = '/api/v3/privileges/{privilege.privilege_id}'
            .replace('{' + 'privilege.privilege_id' + '}', encodeURIComponent(String(privilegePrivilegeId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (privilegeType !== undefined) {
            requestContext.setQueryParam("privilege.type", ObjectSerializer.serialize(privilegeType, "string", ""));
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
     * Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
     * @param roles If empty, will return all privileges.
     * @param type Type of privilege to return: group, page, permission, report, restapi, etc.
     */
    public async tenantuserGetPrivileges(roles?: Array<string>, type?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/privileges';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (roles !== undefined) {
            requestContext.setQueryParam("roles", ObjectSerializer.serialize(roles, "Array<string>", ""));
        }

        // Query Params
        if (type !== undefined) {
            requestContext.setQueryParam("type", ObjectSerializer.serialize(type, "string", ""));
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
     * Summary: Get role Description: Return single role.
     * @param roleId ID of role to be returned.
     */
    public async tenantuserGetRole(roleId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'roleId' is not null or undefined
        if (roleId === null || roleId === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserGetRole", "roleId");
        }


        // Path Params
        const localVarPath = '/api/v3/roles/{role_id}'
            .replace('{' + 'role_id' + '}', encodeURIComponent(String(roleId)));

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
     * Summary: Get roles Description: Return all roles without privileges.
     */
    public async tenantuserGetRoles(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/roles';

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
     * Summary: Get user Description: Return full user for specified user_id.
     * @param userId User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     */
    public async tenantuserGetUser(userId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserGetUser", "userId");
        }


        // Path Params
        const localVarPath = '/api/v3/users/user/{user_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)));

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
     * Summary: Get user names Description: Get user names.
     * @param tenantuserv3GetUserNamesRequest 
     */
    public async tenantuserGetUserNames(tenantuserv3GetUserNamesRequest: Tenantuserv3GetUserNamesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantuserv3GetUserNamesRequest' is not null or undefined
        if (tenantuserv3GetUserNamesRequest === null || tenantuserv3GetUserNamesRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserGetUserNames", "tenantuserv3GetUserNamesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/users/names';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3GetUserNamesRequest, "Tenantuserv3GetUserNamesRequest", ""),
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
     * Summary: Get user tenant Description: Return the user plus tenant information.
     * @param userId User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     */
    public async tenantuserGetUserTenant(userId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserGetUserTenant", "userId");
        }


        // Path Params
        const localVarPath = '/api/v3/users/tenant/{user_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)));

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
     * Summary: Post privileges bulk Description: Perform bulk user add preivilege.
     * @param tenantuserv3PostPrivilegesBulkRequest 
     */
    public async tenantuserPostPrivilegesBulk(tenantuserv3PostPrivilegesBulkRequest: Tenantuserv3PostPrivilegesBulkRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantuserv3PostPrivilegesBulkRequest' is not null or undefined
        if (tenantuserv3PostPrivilegesBulkRequest === null || tenantuserv3PostPrivilegesBulkRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserPostPrivilegesBulk", "tenantuserv3PostPrivilegesBulkRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/privileges';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3PostPrivilegesBulkRequest, "Tenantuserv3PostPrivilegesBulkRequest", ""),
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
     * Summary: Post role Description: Create a new role.
     * @param tenantuserv3PostRoleRequest 
     */
    public async tenantuserPostRole(tenantuserv3PostRoleRequest: Tenantuserv3PostRoleRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantuserv3PostRoleRequest' is not null or undefined
        if (tenantuserv3PostRoleRequest === null || tenantuserv3PostRoleRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserPostRole", "tenantuserv3PostRoleRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/roles';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3PostRoleRequest, "Tenantuserv3PostRoleRequest", ""),
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
     * Summary: Update privilege Description: Update privilege.
     * @param privilegeId Permanent id of the privilege to be updated or created.
     * @param tenantuserv3UpdatePrivilegeRequest 
     */
    public async tenantuserUpdatePrivilege(privilegeId: string, tenantuserv3UpdatePrivilegeRequest: Tenantuserv3UpdatePrivilegeRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'privilegeId' is not null or undefined
        if (privilegeId === null || privilegeId === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserUpdatePrivilege", "privilegeId");
        }


        // verify required parameter 'tenantuserv3UpdatePrivilegeRequest' is not null or undefined
        if (tenantuserv3UpdatePrivilegeRequest === null || tenantuserv3UpdatePrivilegeRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserUpdatePrivilege", "tenantuserv3UpdatePrivilegeRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/privileges/{privilege_id}'
            .replace('{' + 'privilege_id' + '}', encodeURIComponent(String(privilegeId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3UpdatePrivilegeRequest, "Tenantuserv3UpdatePrivilegeRequest", ""),
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
     * Summary: Update privileges role bulk Description: Perform bulk user update role.
     * @param tenantuserv3UpdatePrivilegesBulkRequest 
     */
    public async tenantuserUpdatePrivilegesRoleBulk(tenantuserv3UpdatePrivilegesBulkRequest: Tenantuserv3UpdatePrivilegesBulkRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantuserv3UpdatePrivilegesBulkRequest' is not null or undefined
        if (tenantuserv3UpdatePrivilegesBulkRequest === null || tenantuserv3UpdatePrivilegesBulkRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserUpdatePrivilegesRoleBulk", "tenantuserv3UpdatePrivilegesBulkRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/privileges';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3UpdatePrivilegesBulkRequest, "Tenantuserv3UpdatePrivilegesBulkRequest", ""),
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
     * Summary: Update role Description: Update single role.
     * @param roleId Permanent id of the role.
     * @param tenantuserv3UpdateRoleRequest 
     */
    public async tenantuserUpdateRole(roleId: string, tenantuserv3UpdateRoleRequest: Tenantuserv3UpdateRoleRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'roleId' is not null or undefined
        if (roleId === null || roleId === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserUpdateRole", "roleId");
        }


        // verify required parameter 'tenantuserv3UpdateRoleRequest' is not null or undefined
        if (tenantuserv3UpdateRoleRequest === null || tenantuserv3UpdateRoleRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserUpdateRole", "tenantuserv3UpdateRoleRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/roles/{role_id}'
            .replace('{' + 'role_id' + '}', encodeURIComponent(String(roleId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3UpdateRoleRequest, "Tenantuserv3UpdateRoleRequest", ""),
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
     * Summary: Update user role bulk Description: Perform bulk user add or remove role.
     * @param tenantuserv3UpdateUserRoleBulkRequest 
     */
    public async tenantuserUpdateUserRoleBulk(tenantuserv3UpdateUserRoleBulkRequest: Tenantuserv3UpdateUserRoleBulkRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantuserv3UpdateUserRoleBulkRequest' is not null or undefined
        if (tenantuserv3UpdateUserRoleBulkRequest === null || tenantuserv3UpdateUserRoleBulkRequest === undefined) {
            throw new RequiredError("TenantuserApi", "tenantuserUpdateUserRoleBulk", "tenantuserv3UpdateUserRoleBulkRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/users/role';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(tenantuserv3UpdateUserRoleBulkRequest, "Tenantuserv3UpdateUserRoleBulkRequest", ""),
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

export class TenantuserApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserCreateAPIKey
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserCreateAPIKeyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3CreateApiKeyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3CreateApiKeyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3CreateApiKeyResponse", ""
            ) as Tenantuserv3CreateApiKeyResponse;
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
            const body: Tenantuserv3CreateApiKeyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3CreateApiKeyResponse", ""
            ) as Tenantuserv3CreateApiKeyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserDeleteAPIKey
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserDeleteAPIKeyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
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
     * @params response Response returned by the server for a request to tenantuserDeleteRole
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserDeleteRoleWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
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
     * @params response Response returned by the server for a request to tenantuserGetAPIKeys
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetAPIKeysWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetApiKeysResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetApiKeysResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetApiKeysResponse", ""
            ) as Tenantuserv3GetApiKeysResponse;
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
            const body: Tenantuserv3GetApiKeysResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetApiKeysResponse", ""
            ) as Tenantuserv3GetApiKeysResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetCurrentUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetCurrentUserWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetCurrentUserResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetCurrentUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetCurrentUserResponse", ""
            ) as Tenantuserv3GetCurrentUserResponse;
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
            const body: Tenantuserv3GetCurrentUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetCurrentUserResponse", ""
            ) as Tenantuserv3GetCurrentUserResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetPrivilege
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetPrivilegeWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetPrivilegeResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetPrivilegeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetPrivilegeResponse", ""
            ) as Tenantuserv3GetPrivilegeResponse;
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
            const body: Tenantuserv3GetPrivilegeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetPrivilegeResponse", ""
            ) as Tenantuserv3GetPrivilegeResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetPrivileges
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetPrivilegesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetPrivilegesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetPrivilegesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetPrivilegesResponse", ""
            ) as Tenantuserv3GetPrivilegesResponse;
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
            const body: Tenantuserv3GetPrivilegesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetPrivilegesResponse", ""
            ) as Tenantuserv3GetPrivilegesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetRole
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetRoleWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3Role >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3Role = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3Role", ""
            ) as Tenantuserv3Role;
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
            const body: Tenantuserv3Role = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3Role", ""
            ) as Tenantuserv3Role;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetRoles
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetRolesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetRolesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetRolesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetRolesResponse", ""
            ) as Tenantuserv3GetRolesResponse;
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
            const body: Tenantuserv3GetRolesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetRolesResponse", ""
            ) as Tenantuserv3GetRolesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetUserWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetUserResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUserResponse", ""
            ) as Tenantuserv3GetUserResponse;
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
            const body: Tenantuserv3GetUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUserResponse", ""
            ) as Tenantuserv3GetUserResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetUserNames
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetUserNamesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetUserNamesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetUserNamesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUserNamesResponse", ""
            ) as Tenantuserv3GetUserNamesResponse;
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
            const body: Tenantuserv3GetUserNamesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUserNamesResponse", ""
            ) as Tenantuserv3GetUserNamesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserGetUserTenant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserGetUserTenantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3GetUserTenantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3GetUserTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUserTenantResponse", ""
            ) as Tenantuserv3GetUserTenantResponse;
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
            const body: Tenantuserv3GetUserTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3GetUserTenantResponse", ""
            ) as Tenantuserv3GetUserTenantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserPostPrivilegesBulk
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserPostPrivilegesBulkWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3PostPrivilegesBulkResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3PostPrivilegesBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3PostPrivilegesBulkResponse", ""
            ) as Tenantuserv3PostPrivilegesBulkResponse;
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
            const body: Tenantuserv3PostPrivilegesBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3PostPrivilegesBulkResponse", ""
            ) as Tenantuserv3PostPrivilegesBulkResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserPostRole
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserPostRoleWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3PostRoleResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3PostRoleResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3PostRoleResponse", ""
            ) as Tenantuserv3PostRoleResponse;
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
            const body: Tenantuserv3PostRoleResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3PostRoleResponse", ""
            ) as Tenantuserv3PostRoleResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserUpdatePrivilege
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserUpdatePrivilegeWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3UpdatePrivilegeResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3UpdatePrivilegeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdatePrivilegeResponse", ""
            ) as Tenantuserv3UpdatePrivilegeResponse;
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
            const body: Tenantuserv3UpdatePrivilegeResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdatePrivilegeResponse", ""
            ) as Tenantuserv3UpdatePrivilegeResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserUpdatePrivilegesRoleBulk
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserUpdatePrivilegesRoleBulkWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3UpdatePrivilegesBulkResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3UpdatePrivilegesBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdatePrivilegesBulkResponse", ""
            ) as Tenantuserv3UpdatePrivilegesBulkResponse;
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
            const body: Tenantuserv3UpdatePrivilegesBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdatePrivilegesBulkResponse", ""
            ) as Tenantuserv3UpdatePrivilegesBulkResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserUpdateRole
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserUpdateRoleWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3UpdateRoleResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3UpdateRoleResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdateRoleResponse", ""
            ) as Tenantuserv3UpdateRoleResponse;
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
            const body: Tenantuserv3UpdateRoleResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdateRoleResponse", ""
            ) as Tenantuserv3UpdateRoleResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to tenantuserUpdateUserRoleBulk
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async tenantuserUpdateUserRoleBulkWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Tenantuserv3UpdateUserRoleBulkResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tenantuserv3UpdateUserRoleBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdateUserRoleBulkResponse", ""
            ) as Tenantuserv3UpdateUserRoleBulkResponse;
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
            const body: Tenantuserv3UpdateUserRoleBulkResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tenantuserv3UpdateUserRoleBulkResponse", ""
            ) as Tenantuserv3UpdateUserRoleBulkResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
