# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GroupBuilderCancelImportGroup**](GroupBuilderApi.md#GroupBuilderCancelImportGroup) | **Delete** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups.
[**GroupBuilderCreateGroup**](GroupBuilderApi.md#GroupBuilderCreateGroup) | **Post** /api/v3/groups | Summary: Create group Description: Create new groups.
[**GroupBuilderDeleteGroup**](GroupBuilderApi.md#GroupBuilderDeleteGroup) | **Delete** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
[**GroupBuilderEditGroup**](GroupBuilderApi.md#GroupBuilderEditGroup) | **Patch** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members.
[**GroupBuilderExportGroup**](GroupBuilderApi.md#GroupBuilderExportGroup) | **Post** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID.
[**GroupBuilderGetGroupDetails**](GroupBuilderApi.md#GroupBuilderGetGroupDetails) | **Get** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID.
[**GroupBuilderGetGroupMembers**](GroupBuilderApi.md#GroupBuilderGetGroupMembers) | **Post** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
[**GroupBuilderGetGroupSyncMapping**](GroupBuilderApi.md#GroupBuilderGetGroupSyncMapping) | **Get** /api/v3/groups/mappings/sync | Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
[**GroupBuilderGetGroupTypeMapping**](GroupBuilderApi.md#GroupBuilderGetGroupTypeMapping) | **Get** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get insights to gdp group types mapping.
[**GroupBuilderGetGroupTypes**](GroupBuilderApi.md#GroupBuilderGetGroupTypes) | **Get** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types.
[**GroupBuilderGetGroups**](GroupBuilderApi.md#GroupBuilderGetGroups) | **Get** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members.
[**GroupBuilderGetImportGroups**](GroupBuilderApi.md#GroupBuilderGetImportGroups) | **Get** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager.
[**GroupBuilderImportGroup**](GroupBuilderApi.md#GroupBuilderImportGroup) | **Post** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
[**GroupBuilderRefreshGroups**](GroupBuilderApi.md#GroupBuilderRefreshGroups) | **Post** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups.
[**GroupBuilderResetGroups**](GroupBuilderApi.md#GroupBuilderResetGroups) | **Post** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups.
[**GroupBuilderStoreGroupMembersGdp**](GroupBuilderApi.md#GroupBuilderStoreGroupMembersGdp) | **Post** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
[**GroupBuilderStoreGroupsGdp**](GroupBuilderApi.md#GroupBuilderStoreGroupsGdp) | **Post** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)

# **GroupBuilderCancelImportGroup**
> Groupbuilderv3CancelGroupImportResponse GroupBuilderCancelImportGroup(ctx, optional)
Summary: Cancel import group Description: Cancel import refresh for selected groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GroupBuilderApiGroupBuilderCancelImportGroupOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GroupBuilderApiGroupBuilderCancelImportGroupOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**optional.Interface of []int32**](int32.md)| Group IDs to delete. | 

### Return type

[**Groupbuilderv3CancelGroupImportResponse**](groupbuilderv3CancelGroupImportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderCreateGroup**
> Groupbuilderv3CreateGroupResponse GroupBuilderCreateGroup(ctx, body)
Summary: Create group Description: Create new groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3CreateGroupRequest**](Groupbuilderv3CreateGroupRequest.md)|  | 

### Return type

[**Groupbuilderv3CreateGroupResponse**](groupbuilderv3CreateGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderDeleteGroup**
> Groupbuilderv3DeleteGroupResponse GroupBuilderDeleteGroup(ctx, optional)
Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GroupBuilderApiGroupBuilderDeleteGroupOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GroupBuilderApiGroupBuilderDeleteGroupOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**optional.Interface of []int32**](int32.md)| Group IDs to delete. | 

### Return type

[**Groupbuilderv3DeleteGroupResponse**](groupbuilderv3DeleteGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderEditGroup**
> Groupbuilderv3EditGroupResponse GroupBuilderEditGroup(ctx, body, groupId)
Summary: Edit group Description: Add or delete group members.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3EditGroupRequest**](Groupbuilderv3EditGroupRequest.md)|  | 
  **groupId** | **int32**| Group ID. | 

### Return type

[**Groupbuilderv3EditGroupResponse**](groupbuilderv3EditGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderExportGroup**
> Groupbuilderv3GetExportGroupResponse GroupBuilderExportGroup(ctx, body)
Summary: Export group Description: Export group content to a file based on a group ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3GetExportGroupRequest**](Groupbuilderv3GetExportGroupRequest.md)|  | 

### Return type

[**Groupbuilderv3GetExportGroupResponse**](groupbuilderv3GetExportGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderGetGroupDetails**
> Groupbuilderv3GetGroupDetailResponse GroupBuilderGetGroupDetails(ctx, groupId, optional)
Summary: Get group details Description: Get details of group specified by group ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **groupId** | **int32**| Group ID. | 
 **optional** | ***GroupBuilderApiGroupBuilderGetGroupDetailsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GroupBuilderApiGroupBuilderGetGroupDetailsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **filter** | **optional.String**| Filter by group member name. | 
 **order** | **optional.String**| Order by ascending (ASC) or descending (DESC). | 

### Return type

[**Groupbuilderv3GetGroupDetailResponse**](groupbuilderv3GetGroupDetailResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderGetGroupMembers**
> Groupbuilderv3GetGroupMembersResponse GroupBuilderGetGroupMembers(ctx, body)
Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3GetGroupMembersRequest**](Groupbuilderv3GetGroupMembersRequest.md)|  | 

### Return type

[**Groupbuilderv3GetGroupMembersResponse**](groupbuilderv3GetGroupMembersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderGetGroupSyncMapping**
> Groupbuilderv3GetGroupSyncMappingResponse GroupBuilderGetGroupSyncMapping(ctx, optional)
Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GroupBuilderApiGroupBuilderGetGroupSyncMappingOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GroupBuilderApiGroupBuilderGetGroupSyncMappingOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **optional.String**| Central manager. | 

### Return type

[**Groupbuilderv3GetGroupSyncMappingResponse**](groupbuilderv3GetGroupSyncMappingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderGetGroupTypeMapping**
> Groupbuilderv3GetGroupTypeMappingResponse GroupBuilderGetGroupTypeMapping(ctx, )
Summary: Get group type mapping Description: Get insights to gdp group types mapping.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypeMappingResponse**](groupbuilderv3GetGroupTypeMappingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderGetGroupTypes**
> Groupbuilderv3GetGroupTypesResponse GroupBuilderGetGroupTypes(ctx, )
Summary: Get group types Description: Get a list of available group types.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypesResponse**](groupbuilderv3GetGroupTypesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderGetGroups**
> Groupbuilderv3GetGroupsResponse GroupBuilderGetGroups(ctx, optional)
Summary: Get groups Description: Get a list of imported group members.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GroupBuilderApiGroupBuilderGetGroupsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GroupBuilderApiGroupBuilderGetGroupsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doNotIncludeMemberCount** | **optional.Bool**| Return group names, ID&#x27;s, type ID&#x27;s, nested bool, and tuple count only if the flag is true. | 
 **onlyFullAccess** | **optional.Bool**| Only return groups that user has full-access to. | 
 **nonNested** | **optional.Bool**| Only return non-nested groups. | 

### Return type

[**Groupbuilderv3GetGroupsResponse**](groupbuilderv3GetGroupsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderGetImportGroups**
> Groupbuilderv3GetImportGroupsResponse GroupBuilderGetImportGroups(ctx, optional)
Summary: Get import groups Description: Get unsynchronized groups from a central manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GroupBuilderApiGroupBuilderGetImportGroupsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GroupBuilderApiGroupBuilderGetImportGroupsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **optional.String**| Central manager host name. | 

### Return type

[**Groupbuilderv3GetImportGroupsResponse**](groupbuilderv3GetImportGroupsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderImportGroup**
> Groupbuilderv3ImportGroupResponse GroupBuilderImportGroup(ctx, body)
Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3ImportGroupRequest**](Groupbuilderv3ImportGroupRequest.md)|  | 

### Return type

[**Groupbuilderv3ImportGroupResponse**](groupbuilderv3ImportGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderRefreshGroups**
> Groupbuilderv3RefreshGroupsResponse GroupBuilderRefreshGroups(ctx, body)
Summary: Refresh groups Description: Refresh tenants selected imported groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3RefreshGroupsRequest**](Groupbuilderv3RefreshGroupsRequest.md)|  | 

### Return type

[**Groupbuilderv3RefreshGroupsResponse**](groupbuilderv3RefreshGroupsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderResetGroups**
> Groupbuilderv3ResetGroupsResponse GroupBuilderResetGroups(ctx, body)
Summary: Reset groups Description: Resets tenants selected predefined groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3ResetGroupsRequest**](Groupbuilderv3ResetGroupsRequest.md)|  | 

### Return type

[**Groupbuilderv3ResetGroupsResponse**](groupbuilderv3ResetGroupsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderStoreGroupMembersGdp**
> Groupbuilderv3StoreGroupMembersGdpResponse GroupBuilderStoreGroupMembersGdp(ctx, body, centralManagerId)
Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3StoreGroupMembersGdpRequest**](Groupbuilderv3StoreGroupMembersGdpRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Groupbuilderv3StoreGroupMembersGdpResponse**](groupbuilderv3StoreGroupMembersGdpResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GroupBuilderStoreGroupsGdp**
> Groupbuilderv3GetGroupsResponseGdp GroupBuilderStoreGroupsGdp(ctx, body, centralManagerId)
Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Groupbuilderv3GetGroupsRequestGdp**](Groupbuilderv3GetGroupsRequestGdp.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Groupbuilderv3GetGroupsResponseGdp**](groupbuilderv3GetGroupsResponseGdp.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

