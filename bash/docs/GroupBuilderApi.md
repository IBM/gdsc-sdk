# GroupBuilderApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupBuilderCancelImportGroup**](GroupBuilderApi.md#groupBuilderCancelImportGroup) | **DELETE** /api/v3/groups_import | Summary: Cancel import group
Description: Cancel import refresh for selected groups.
[**groupBuilderCreateGroup**](GroupBuilderApi.md#groupBuilderCreateGroup) | **POST** /api/v3/groups | Summary: Create group
Description: Create new groups.
[**groupBuilderDeleteGroup**](GroupBuilderApi.md#groupBuilderDeleteGroup) | **DELETE** /api/v3/groups | Summary: Delete group
Description: Delete specified groups if the group ID is not used for reports.
[**groupBuilderEditGroup**](GroupBuilderApi.md#groupBuilderEditGroup) | **PATCH** /api/v3/groups/{group_id} | Summary: Edit group
Description: Add or delete group members.
[**groupBuilderExportGroup**](GroupBuilderApi.md#groupBuilderExportGroup) | **POST** /api/v3/groups_export | Summary: Export group
Description: Export group content to a file based on a group ID.
[**groupBuilderGetGroupDetails**](GroupBuilderApi.md#groupBuilderGetGroupDetails) | **GET** /api/v3/groups/{group_id} | Summary: Get group details
Description: Get details of group specified by group ID.
[**groupBuilderGetGroupMembers**](GroupBuilderApi.md#groupBuilderGetGroupMembers) | **POST** /api/v3/groups/search | Summary: Get group members
Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
[**groupBuilderGetGroupSyncMapping**](GroupBuilderApi.md#groupBuilderGetGroupSyncMapping) | **GET** /api/v3/groups/mappings/sync | Summary: Get GDP to gi group mapping
Description: Get GDSC to GDP group sync mapping.
[**groupBuilderGetGroupTypeMapping**](GroupBuilderApi.md#groupBuilderGetGroupTypeMapping) | **GET** /api/v3/groups-mappings | Summary: Get group type mapping
Description: Get GDSC to GDP group types mapping.
[**groupBuilderGetGroupTypes**](GroupBuilderApi.md#groupBuilderGetGroupTypes) | **GET** /api/v3/group_types | Summary: Get group types
Description: Get a list of available group types.
[**groupBuilderGetGroups**](GroupBuilderApi.md#groupBuilderGetGroups) | **GET** /api/v3/groups | Summary: Get groups
Description: Get a list of imported group members.
[**groupBuilderGetImportGroups**](GroupBuilderApi.md#groupBuilderGetImportGroups) | **GET** /api/v3/groups_import | Summary: Get import groups
Description: Get unsynchronized groups from a central manager.
[**groupBuilderImportGroup**](GroupBuilderApi.md#groupBuilderImportGroup) | **POST** /api/v3/groups_import | Summary: Import group
Description: Import selected groups from a central manager. (This API is called from GDP only)
[**groupBuilderRefreshGroups**](GroupBuilderApi.md#groupBuilderRefreshGroups) | **POST** /api/v3/groups/refresh | Summary: Refresh groups
Description: Refresh tenants selected imported groups.
[**groupBuilderResetGroups**](GroupBuilderApi.md#groupBuilderResetGroups) | **POST** /api/v3/groups/reset | Summary: Reset groups
Description: Resets tenants selected predefined groups.
[**groupBuilderStoreGroupMembersGdp**](GroupBuilderApi.md#groupBuilderStoreGroupMembersGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp
Description: Store GDP groups. (This API is called from GDP only)
[**groupBuilderStoreGroupsGdp**](GroupBuilderApi.md#groupBuilderStoreGroupsGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp
Description: Store GDP groups. (This API is called from GDP only)



## groupBuilderCancelImportGroup

Summary: Cancel import group
Description: Cancel import refresh for selected groups.

### Example

```bash
 groupBuilderCancelImportGroup  Specify as:  group_ids=value1 group_ids=value2 group_ids=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**array[integer]**](integer.md) | Group IDs to delete. | [optional] [default to null]

### Return type

[**Groupbuilderv3CancelGroupImportResponse**](Groupbuilderv3CancelGroupImportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderCreateGroup

Summary: Create group
Description: Create new groups.

### Example

```bash
 groupBuilderCreateGroup
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3CreateGroupRequest** | [**Groupbuilderv3CreateGroupRequest**](Groupbuilderv3CreateGroupRequest.md) |  |

### Return type

[**Groupbuilderv3CreateGroupResponse**](Groupbuilderv3CreateGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderDeleteGroup

Summary: Delete group
Description: Delete specified groups if the group ID is not used for reports.

### Example

```bash
 groupBuilderDeleteGroup  Specify as:  group_ids=value1 group_ids=value2 group_ids=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**array[integer]**](integer.md) | Group IDs to delete. | [optional] [default to null]

### Return type

[**Groupbuilderv3DeleteGroupResponse**](Groupbuilderv3DeleteGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderEditGroup

Summary: Edit group
Description: Add or delete group members.

### Example

```bash
 groupBuilderEditGroup group_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **integer** | Group ID. | [default to null]
 **groupbuilderv3EditGroupRequest** | [**Groupbuilderv3EditGroupRequest**](Groupbuilderv3EditGroupRequest.md) |  |

### Return type

[**Groupbuilderv3EditGroupResponse**](Groupbuilderv3EditGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderExportGroup

Summary: Export group
Description: Export group content to a file based on a group ID.

### Example

```bash
 groupBuilderExportGroup
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetExportGroupRequest** | [**Groupbuilderv3GetExportGroupRequest**](Groupbuilderv3GetExportGroupRequest.md) |  |

### Return type

[**Groupbuilderv3GetExportGroupResponse**](Groupbuilderv3GetExportGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderGetGroupDetails

Summary: Get group details
Description: Get details of group specified by group ID.

### Example

```bash
 groupBuilderGetGroupDetails group_id=value  filter=value  order=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **integer** | Group ID. | [default to null]
 **filter** | **string** | Filter by group member name. | [optional] [default to null]
 **order** | **string** | Order by ascending (ASC) or descending (DESC). | [optional] [default to null]

### Return type

[**Groupbuilderv3GetGroupDetailResponse**](Groupbuilderv3GetGroupDetailResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderGetGroupMembers

Summary: Get group members
Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.

### Example

```bash
 groupBuilderGetGroupMembers
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetGroupMembersRequest** | [**Groupbuilderv3GetGroupMembersRequest**](Groupbuilderv3GetGroupMembersRequest.md) |  |

### Return type

[**Groupbuilderv3GetGroupMembersResponse**](Groupbuilderv3GetGroupMembersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderGetGroupSyncMapping

Summary: Get GDP to gi group mapping
Description: Get GDSC to GDP group sync mapping.

### Example

```bash
 groupBuilderGetGroupSyncMapping  central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central manager. | [optional] [default to null]

### Return type

[**Groupbuilderv3GetGroupSyncMappingResponse**](Groupbuilderv3GetGroupSyncMappingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderGetGroupTypeMapping

Summary: Get group type mapping
Description: Get GDSC to GDP group types mapping.

### Example

```bash
 groupBuilderGetGroupTypeMapping
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypeMappingResponse**](Groupbuilderv3GetGroupTypeMappingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderGetGroupTypes

Summary: Get group types
Description: Get a list of available group types.

### Example

```bash
 groupBuilderGetGroupTypes
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypesResponse**](Groupbuilderv3GetGroupTypesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderGetGroups

Summary: Get groups
Description: Get a list of imported group members.

### Example

```bash
 groupBuilderGetGroups  do_not_include_member_count=value  only_full_access=value  non_nested=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doNotIncludeMemberCount** | **boolean** | Return group names, ID's, type ID's, nested bool, and tuple count only if the flag is true. | [optional] [default to null]
 **onlyFullAccess** | **boolean** | Only return groups that user has full-access to. | [optional] [default to null]
 **nonNested** | **boolean** | Only return non-nested groups. | [optional] [default to null]

### Return type

[**Groupbuilderv3GetGroupsResponse**](Groupbuilderv3GetGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderGetImportGroups

Summary: Get import groups
Description: Get unsynchronized groups from a central manager.

### Example

```bash
 groupBuilderGetImportGroups  central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central manager host name. | [optional] [default to null]

### Return type

[**Groupbuilderv3GetImportGroupsResponse**](Groupbuilderv3GetImportGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderImportGroup

Summary: Import group
Description: Import selected groups from a central manager. (This API is called from GDP only)

### Example

```bash
 groupBuilderImportGroup
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3ImportGroupRequest** | [**Groupbuilderv3ImportGroupRequest**](Groupbuilderv3ImportGroupRequest.md) |  |

### Return type

[**Groupbuilderv3ImportGroupResponse**](Groupbuilderv3ImportGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderRefreshGroups

Summary: Refresh groups
Description: Refresh tenants selected imported groups.

### Example

```bash
 groupBuilderRefreshGroups
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3RefreshGroupsRequest** | [**Groupbuilderv3RefreshGroupsRequest**](Groupbuilderv3RefreshGroupsRequest.md) |  |

### Return type

[**Groupbuilderv3RefreshGroupsResponse**](Groupbuilderv3RefreshGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderResetGroups

Summary: Reset groups
Description: Resets tenants selected predefined groups.

### Example

```bash
 groupBuilderResetGroups
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3ResetGroupsRequest** | [**Groupbuilderv3ResetGroupsRequest**](Groupbuilderv3ResetGroupsRequest.md) |  |

### Return type

[**Groupbuilderv3ResetGroupsResponse**](Groupbuilderv3ResetGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderStoreGroupMembersGdp

Summary: Store group members Gdp
Description: Store GDP groups. (This API is called from GDP only)

### Example

```bash
 groupBuilderStoreGroupMembersGdp central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **groupbuilderv3StoreGroupMembersGdpRequest** | [**Groupbuilderv3StoreGroupMembersGdpRequest**](Groupbuilderv3StoreGroupMembersGdpRequest.md) |  |

### Return type

[**Groupbuilderv3StoreGroupMembersGdpResponse**](Groupbuilderv3StoreGroupMembersGdpResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## groupBuilderStoreGroupsGdp

Summary: Store groups Gdp
Description: Store GDP groups. (This API is called from GDP only)

### Example

```bash
 groupBuilderStoreGroupsGdp central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **groupbuilderv3GetGroupsRequestGdp** | [**Groupbuilderv3GetGroupsRequestGdp**](Groupbuilderv3GetGroupsRequestGdp.md) |  |

### Return type

[**Groupbuilderv3GetGroupsResponseGdp**](Groupbuilderv3GetGroupsResponseGdp.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

