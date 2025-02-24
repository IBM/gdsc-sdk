// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Groupbuilderv3CancelGroupImportResponse } from '../models/Groupbuilderv3CancelGroupImportResponse';
import { Groupbuilderv3CreateGroupRequest } from '../models/Groupbuilderv3CreateGroupRequest';
import { Groupbuilderv3CreateGroupResponse } from '../models/Groupbuilderv3CreateGroupResponse';
import { Groupbuilderv3DeleteGroupResponse } from '../models/Groupbuilderv3DeleteGroupResponse';
import { Groupbuilderv3EditGroupRequest } from '../models/Groupbuilderv3EditGroupRequest';
import { Groupbuilderv3EditGroupResponse } from '../models/Groupbuilderv3EditGroupResponse';
import { Groupbuilderv3GetExportGroupRequest } from '../models/Groupbuilderv3GetExportGroupRequest';
import { Groupbuilderv3GetExportGroupResponse } from '../models/Groupbuilderv3GetExportGroupResponse';
import { Groupbuilderv3GetGroupDetailResponse } from '../models/Groupbuilderv3GetGroupDetailResponse';
import { Groupbuilderv3GetGroupMembersRequest } from '../models/Groupbuilderv3GetGroupMembersRequest';
import { Groupbuilderv3GetGroupMembersResponse } from '../models/Groupbuilderv3GetGroupMembersResponse';
import { Groupbuilderv3GetGroupSyncMappingResponse } from '../models/Groupbuilderv3GetGroupSyncMappingResponse';
import { Groupbuilderv3GetGroupTypeMappingResponse } from '../models/Groupbuilderv3GetGroupTypeMappingResponse';
import { Groupbuilderv3GetGroupTypesResponse } from '../models/Groupbuilderv3GetGroupTypesResponse';
import { Groupbuilderv3GetGroupsRequestGdp } from '../models/Groupbuilderv3GetGroupsRequestGdp';
import { Groupbuilderv3GetGroupsResponse } from '../models/Groupbuilderv3GetGroupsResponse';
import { Groupbuilderv3GetGroupsResponseGdp } from '../models/Groupbuilderv3GetGroupsResponseGdp';
import { Groupbuilderv3GetImportGroupsResponse } from '../models/Groupbuilderv3GetImportGroupsResponse';
import { Groupbuilderv3ImportGroupRequest } from '../models/Groupbuilderv3ImportGroupRequest';
import { Groupbuilderv3ImportGroupResponse } from '../models/Groupbuilderv3ImportGroupResponse';
import { Groupbuilderv3RefreshGroupsRequest } from '../models/Groupbuilderv3RefreshGroupsRequest';
import { Groupbuilderv3RefreshGroupsResponse } from '../models/Groupbuilderv3RefreshGroupsResponse';
import { Groupbuilderv3ResetGroupsRequest } from '../models/Groupbuilderv3ResetGroupsRequest';
import { Groupbuilderv3ResetGroupsResponse } from '../models/Groupbuilderv3ResetGroupsResponse';
import { Groupbuilderv3StoreGroupMembersGdpRequest } from '../models/Groupbuilderv3StoreGroupMembersGdpRequest';
import { Groupbuilderv3StoreGroupMembersGdpResponse } from '../models/Groupbuilderv3StoreGroupMembersGdpResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class GroupBuilderApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Cancel import group Description: Cancel import refresh for selected groups.
     * @param groupIds Group IDs to delete.
     */
    public async groupBuilderCancelImportGroup(groupIds?: Array<number>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/groups_import';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (groupIds !== undefined) {
            requestContext.setQueryParam("group_ids", ObjectSerializer.serialize(groupIds, "Array<number>", "int32"));
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
     * Summary: Create group Description: Create new groups.
     * @param groupbuilderv3CreateGroupRequest 
     */
    public async groupBuilderCreateGroup(groupbuilderv3CreateGroupRequest: Groupbuilderv3CreateGroupRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupbuilderv3CreateGroupRequest' is not null or undefined
        if (groupbuilderv3CreateGroupRequest === null || groupbuilderv3CreateGroupRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderCreateGroup", "groupbuilderv3CreateGroupRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/groups';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3CreateGroupRequest, "Groupbuilderv3CreateGroupRequest", ""),
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
     * Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
     * @param groupIds Group IDs to delete.
     */
    public async groupBuilderDeleteGroup(groupIds?: Array<number>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/groups';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (groupIds !== undefined) {
            requestContext.setQueryParam("group_ids", ObjectSerializer.serialize(groupIds, "Array<number>", "int32"));
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
     * Summary: Edit group Description: Add or delete group members.
     * @param groupId Group ID.
     * @param groupbuilderv3EditGroupRequest 
     */
    public async groupBuilderEditGroup(groupId: number, groupbuilderv3EditGroupRequest: Groupbuilderv3EditGroupRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupId' is not null or undefined
        if (groupId === null || groupId === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderEditGroup", "groupId");
        }


        // verify required parameter 'groupbuilderv3EditGroupRequest' is not null or undefined
        if (groupbuilderv3EditGroupRequest === null || groupbuilderv3EditGroupRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderEditGroup", "groupbuilderv3EditGroupRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/groups/{group_id}'
            .replace('{' + 'group_id' + '}', encodeURIComponent(String(groupId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3EditGroupRequest, "Groupbuilderv3EditGroupRequest", ""),
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
     * Summary: Export group Description: Export group content to a file based on a group ID.
     * @param groupbuilderv3GetExportGroupRequest 
     */
    public async groupBuilderExportGroup(groupbuilderv3GetExportGroupRequest: Groupbuilderv3GetExportGroupRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupbuilderv3GetExportGroupRequest' is not null or undefined
        if (groupbuilderv3GetExportGroupRequest === null || groupbuilderv3GetExportGroupRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderExportGroup", "groupbuilderv3GetExportGroupRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/groups_export';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3GetExportGroupRequest, "Groupbuilderv3GetExportGroupRequest", ""),
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
     * Summary: Get group details Description: Get details of group specified by group ID.
     * @param groupId Group ID.
     * @param filter Filter by group member name.
     * @param order Order by ascending (ASC) or descending (DESC).
     */
    public async groupBuilderGetGroupDetails(groupId: number, filter?: string, order?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupId' is not null or undefined
        if (groupId === null || groupId === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderGetGroupDetails", "groupId");
        }




        // Path Params
        const localVarPath = '/api/v3/groups/{group_id}'
            .replace('{' + 'group_id' + '}', encodeURIComponent(String(groupId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "string", ""));
        }

        // Query Params
        if (order !== undefined) {
            requestContext.setQueryParam("order", ObjectSerializer.serialize(order, "string", ""));
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
     * Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
     * @param groupbuilderv3GetGroupMembersRequest 
     */
    public async groupBuilderGetGroupMembers(groupbuilderv3GetGroupMembersRequest: Groupbuilderv3GetGroupMembersRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupbuilderv3GetGroupMembersRequest' is not null or undefined
        if (groupbuilderv3GetGroupMembersRequest === null || groupbuilderv3GetGroupMembersRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderGetGroupMembers", "groupbuilderv3GetGroupMembersRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/groups/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3GetGroupMembersRequest, "Groupbuilderv3GetGroupMembersRequest", ""),
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
     * Summary: Get GDP to gi group mapping Description: Get GDSC to GDP group sync mapping.
     * @param centralManagerId Central manager.
     */
    public async groupBuilderGetGroupSyncMapping(centralManagerId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/groups/mappings/sync';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (centralManagerId !== undefined) {
            requestContext.setQueryParam("central_manager_id", ObjectSerializer.serialize(centralManagerId, "string", ""));
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
     * Summary: Get group type mapping Description: Get GDSC to GDP group types mapping.
     */
    public async groupBuilderGetGroupTypeMapping(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/groups-mappings';

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
     * Summary: Get group types Description: Get a list of available group types.
     */
    public async groupBuilderGetGroupTypes(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/group_types';

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
     * Summary: Get groups Description: Get a list of imported group members.
     * @param doNotIncludeMemberCount Return group names, ID\&#39;s, type ID\&#39;s, nested bool, and tuple count only if the flag is true.
     * @param onlyFullAccess Only return groups that user has full-access to.
     * @param nonNested Only return non-nested groups.
     */
    public async groupBuilderGetGroups(doNotIncludeMemberCount?: boolean, onlyFullAccess?: boolean, nonNested?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;




        // Path Params
        const localVarPath = '/api/v3/groups';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (doNotIncludeMemberCount !== undefined) {
            requestContext.setQueryParam("do_not_include_member_count", ObjectSerializer.serialize(doNotIncludeMemberCount, "boolean", ""));
        }

        // Query Params
        if (onlyFullAccess !== undefined) {
            requestContext.setQueryParam("only_full_access", ObjectSerializer.serialize(onlyFullAccess, "boolean", ""));
        }

        // Query Params
        if (nonNested !== undefined) {
            requestContext.setQueryParam("non_nested", ObjectSerializer.serialize(nonNested, "boolean", ""));
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
     * Summary: Get import groups Description: Get unsynchronized groups from a central manager.
     * @param centralManagerId Central manager host name.
     */
    public async groupBuilderGetImportGroups(centralManagerId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/groups_import';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (centralManagerId !== undefined) {
            requestContext.setQueryParam("central_manager_id", ObjectSerializer.serialize(centralManagerId, "string", ""));
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
     * Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
     * @param groupbuilderv3ImportGroupRequest 
     */
    public async groupBuilderImportGroup(groupbuilderv3ImportGroupRequest: Groupbuilderv3ImportGroupRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupbuilderv3ImportGroupRequest' is not null or undefined
        if (groupbuilderv3ImportGroupRequest === null || groupbuilderv3ImportGroupRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderImportGroup", "groupbuilderv3ImportGroupRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/groups_import';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3ImportGroupRequest, "Groupbuilderv3ImportGroupRequest", ""),
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
     * Summary: Refresh groups Description: Refresh tenants selected imported groups.
     * @param groupbuilderv3RefreshGroupsRequest 
     */
    public async groupBuilderRefreshGroups(groupbuilderv3RefreshGroupsRequest: Groupbuilderv3RefreshGroupsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupbuilderv3RefreshGroupsRequest' is not null or undefined
        if (groupbuilderv3RefreshGroupsRequest === null || groupbuilderv3RefreshGroupsRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderRefreshGroups", "groupbuilderv3RefreshGroupsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/groups/refresh';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3RefreshGroupsRequest, "Groupbuilderv3RefreshGroupsRequest", ""),
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
     * Summary: Reset groups Description: Resets tenants selected predefined groups.
     * @param groupbuilderv3ResetGroupsRequest 
     */
    public async groupBuilderResetGroups(groupbuilderv3ResetGroupsRequest: Groupbuilderv3ResetGroupsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupbuilderv3ResetGroupsRequest' is not null or undefined
        if (groupbuilderv3ResetGroupsRequest === null || groupbuilderv3ResetGroupsRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderResetGroups", "groupbuilderv3ResetGroupsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/groups/reset';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3ResetGroupsRequest, "Groupbuilderv3ResetGroupsRequest", ""),
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
     * Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param groupbuilderv3StoreGroupMembersGdpRequest 
     */
    public async groupBuilderStoreGroupMembersGdp(centralManagerId: string, groupbuilderv3StoreGroupMembersGdpRequest: Groupbuilderv3StoreGroupMembersGdpRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderStoreGroupMembersGdp", "centralManagerId");
        }


        // verify required parameter 'groupbuilderv3StoreGroupMembersGdpRequest' is not null or undefined
        if (groupbuilderv3StoreGroupMembersGdpRequest === null || groupbuilderv3StoreGroupMembersGdpRequest === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderStoreGroupMembersGdp", "groupbuilderv3StoreGroupMembersGdpRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/groups/members'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3StoreGroupMembersGdpRequest, "Groupbuilderv3StoreGroupMembersGdpRequest", ""),
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
     * Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param groupbuilderv3GetGroupsRequestGdp 
     */
    public async groupBuilderStoreGroupsGdp(centralManagerId: string, groupbuilderv3GetGroupsRequestGdp: Groupbuilderv3GetGroupsRequestGdp, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderStoreGroupsGdp", "centralManagerId");
        }


        // verify required parameter 'groupbuilderv3GetGroupsRequestGdp' is not null or undefined
        if (groupbuilderv3GetGroupsRequestGdp === null || groupbuilderv3GetGroupsRequestGdp === undefined) {
            throw new RequiredError("GroupBuilderApi", "groupBuilderStoreGroupsGdp", "groupbuilderv3GetGroupsRequestGdp");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/groups'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(groupbuilderv3GetGroupsRequestGdp, "Groupbuilderv3GetGroupsRequestGdp", ""),
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

export class GroupBuilderApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderCancelImportGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderCancelImportGroupWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3CancelGroupImportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3CancelGroupImportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3CancelGroupImportResponse", ""
            ) as Groupbuilderv3CancelGroupImportResponse;
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
            const body: Groupbuilderv3CancelGroupImportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3CancelGroupImportResponse", ""
            ) as Groupbuilderv3CancelGroupImportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderCreateGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderCreateGroupWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3CreateGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3CreateGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3CreateGroupResponse", ""
            ) as Groupbuilderv3CreateGroupResponse;
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
            const body: Groupbuilderv3CreateGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3CreateGroupResponse", ""
            ) as Groupbuilderv3CreateGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderDeleteGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderDeleteGroupWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3DeleteGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3DeleteGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3DeleteGroupResponse", ""
            ) as Groupbuilderv3DeleteGroupResponse;
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
            const body: Groupbuilderv3DeleteGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3DeleteGroupResponse", ""
            ) as Groupbuilderv3DeleteGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderEditGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderEditGroupWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3EditGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3EditGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3EditGroupResponse", ""
            ) as Groupbuilderv3EditGroupResponse;
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
            const body: Groupbuilderv3EditGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3EditGroupResponse", ""
            ) as Groupbuilderv3EditGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderExportGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderExportGroupWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetExportGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetExportGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetExportGroupResponse", ""
            ) as Groupbuilderv3GetExportGroupResponse;
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
            const body: Groupbuilderv3GetExportGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetExportGroupResponse", ""
            ) as Groupbuilderv3GetExportGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderGetGroupDetails
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderGetGroupDetailsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetGroupDetailResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetGroupDetailResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupDetailResponse", ""
            ) as Groupbuilderv3GetGroupDetailResponse;
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
            const body: Groupbuilderv3GetGroupDetailResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupDetailResponse", ""
            ) as Groupbuilderv3GetGroupDetailResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderGetGroupMembers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderGetGroupMembersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetGroupMembersResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetGroupMembersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupMembersResponse", ""
            ) as Groupbuilderv3GetGroupMembersResponse;
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
            const body: Groupbuilderv3GetGroupMembersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupMembersResponse", ""
            ) as Groupbuilderv3GetGroupMembersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderGetGroupSyncMapping
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderGetGroupSyncMappingWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetGroupSyncMappingResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetGroupSyncMappingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupSyncMappingResponse", ""
            ) as Groupbuilderv3GetGroupSyncMappingResponse;
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
            const body: Groupbuilderv3GetGroupSyncMappingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupSyncMappingResponse", ""
            ) as Groupbuilderv3GetGroupSyncMappingResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderGetGroupTypeMapping
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderGetGroupTypeMappingWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetGroupTypeMappingResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetGroupTypeMappingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupTypeMappingResponse", ""
            ) as Groupbuilderv3GetGroupTypeMappingResponse;
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
            const body: Groupbuilderv3GetGroupTypeMappingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupTypeMappingResponse", ""
            ) as Groupbuilderv3GetGroupTypeMappingResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderGetGroupTypes
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderGetGroupTypesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetGroupTypesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetGroupTypesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupTypesResponse", ""
            ) as Groupbuilderv3GetGroupTypesResponse;
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
            const body: Groupbuilderv3GetGroupTypesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupTypesResponse", ""
            ) as Groupbuilderv3GetGroupTypesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderGetGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderGetGroupsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetGroupsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupsResponse", ""
            ) as Groupbuilderv3GetGroupsResponse;
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
            const body: Groupbuilderv3GetGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupsResponse", ""
            ) as Groupbuilderv3GetGroupsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderGetImportGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderGetImportGroupsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetImportGroupsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetImportGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetImportGroupsResponse", ""
            ) as Groupbuilderv3GetImportGroupsResponse;
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
            const body: Groupbuilderv3GetImportGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetImportGroupsResponse", ""
            ) as Groupbuilderv3GetImportGroupsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderImportGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderImportGroupWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3ImportGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3ImportGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3ImportGroupResponse", ""
            ) as Groupbuilderv3ImportGroupResponse;
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
            const body: Groupbuilderv3ImportGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3ImportGroupResponse", ""
            ) as Groupbuilderv3ImportGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderRefreshGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderRefreshGroupsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3RefreshGroupsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3RefreshGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3RefreshGroupsResponse", ""
            ) as Groupbuilderv3RefreshGroupsResponse;
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
            const body: Groupbuilderv3RefreshGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3RefreshGroupsResponse", ""
            ) as Groupbuilderv3RefreshGroupsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderResetGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderResetGroupsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3ResetGroupsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3ResetGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3ResetGroupsResponse", ""
            ) as Groupbuilderv3ResetGroupsResponse;
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
            const body: Groupbuilderv3ResetGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3ResetGroupsResponse", ""
            ) as Groupbuilderv3ResetGroupsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderStoreGroupMembersGdp
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderStoreGroupMembersGdpWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3StoreGroupMembersGdpResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3StoreGroupMembersGdpResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3StoreGroupMembersGdpResponse", ""
            ) as Groupbuilderv3StoreGroupMembersGdpResponse;
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
            const body: Groupbuilderv3StoreGroupMembersGdpResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3StoreGroupMembersGdpResponse", ""
            ) as Groupbuilderv3StoreGroupMembersGdpResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to groupBuilderStoreGroupsGdp
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async groupBuilderStoreGroupsGdpWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Groupbuilderv3GetGroupsResponseGdp >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Groupbuilderv3GetGroupsResponseGdp = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupsResponseGdp", ""
            ) as Groupbuilderv3GetGroupsResponseGdp;
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
            const body: Groupbuilderv3GetGroupsResponseGdp = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Groupbuilderv3GetGroupsResponseGdp", ""
            ) as Groupbuilderv3GetGroupsResponseGdp;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
