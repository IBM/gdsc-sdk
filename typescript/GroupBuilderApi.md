# .GroupBuilderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupBuilderCancelImportGroup**](GroupBuilderApi.md#groupBuilderCancelImportGroup) | **DELETE** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups.
[**groupBuilderCreateGroup**](GroupBuilderApi.md#groupBuilderCreateGroup) | **POST** /api/v3/groups | Summary: Create group Description: Create new groups.
[**groupBuilderDeleteGroup**](GroupBuilderApi.md#groupBuilderDeleteGroup) | **DELETE** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
[**groupBuilderEditGroup**](GroupBuilderApi.md#groupBuilderEditGroup) | **PATCH** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members.
[**groupBuilderExportGroup**](GroupBuilderApi.md#groupBuilderExportGroup) | **POST** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID.
[**groupBuilderGetGroupDetails**](GroupBuilderApi.md#groupBuilderGetGroupDetails) | **GET** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID.
[**groupBuilderGetGroupMembers**](GroupBuilderApi.md#groupBuilderGetGroupMembers) | **POST** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
[**groupBuilderGetGroupSyncMapping**](GroupBuilderApi.md#groupBuilderGetGroupSyncMapping) | **GET** /api/v3/groups/mappings/sync | Summary: Get GDP to gi group mapping Description: Get GDSC to GDP group sync mapping.
[**groupBuilderGetGroupTypeMapping**](GroupBuilderApi.md#groupBuilderGetGroupTypeMapping) | **GET** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get GDSC to GDP group types mapping.
[**groupBuilderGetGroupTypes**](GroupBuilderApi.md#groupBuilderGetGroupTypes) | **GET** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types.
[**groupBuilderGetGroups**](GroupBuilderApi.md#groupBuilderGetGroups) | **GET** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members.
[**groupBuilderGetImportGroups**](GroupBuilderApi.md#groupBuilderGetImportGroups) | **GET** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager.
[**groupBuilderImportGroup**](GroupBuilderApi.md#groupBuilderImportGroup) | **POST** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
[**groupBuilderRefreshGroups**](GroupBuilderApi.md#groupBuilderRefreshGroups) | **POST** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups.
[**groupBuilderResetGroups**](GroupBuilderApi.md#groupBuilderResetGroups) | **POST** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups.
[**groupBuilderStoreGroupMembersGdp**](GroupBuilderApi.md#groupBuilderStoreGroupMembersGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
[**groupBuilderStoreGroupsGdp**](GroupBuilderApi.md#groupBuilderStoreGroupsGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)


# **groupBuilderCancelImportGroup**
> Groupbuilderv3CancelGroupImportResponse groupBuilderCancelImportGroup()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderCancelImportGroupRequest = {
  // Array<number> | Group IDs to delete. (optional)
  groupIds: [
    1,
  ],
};

apiInstance.groupBuilderCancelImportGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **Array&lt;number&gt;** | Group IDs to delete. | (optional) defaults to undefined


### Return type

**Groupbuilderv3CancelGroupImportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderCreateGroup**
> Groupbuilderv3CreateGroupResponse groupBuilderCreateGroup(groupbuilderv3CreateGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderCreateGroupRequest = {
  // Groupbuilderv3CreateGroupRequest
  groupbuilderv3CreateGroupRequest: {
    copyGroupId: 1,
    description: "description_example",
    groupTypeId: 1,
    name: "name_example",
    nested: true,
  },
};

apiInstance.groupBuilderCreateGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3CreateGroupRequest** | **Groupbuilderv3CreateGroupRequest**|  |


### Return type

**Groupbuilderv3CreateGroupResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderDeleteGroup**
> Groupbuilderv3DeleteGroupResponse groupBuilderDeleteGroup()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderDeleteGroupRequest = {
  // Array<number> | Group IDs to delete. (optional)
  groupIds: [
    1,
  ],
};

apiInstance.groupBuilderDeleteGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **Array&lt;number&gt;** | Group IDs to delete. | (optional) defaults to undefined


### Return type

**Groupbuilderv3DeleteGroupResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderEditGroup**
> Groupbuilderv3EditGroupResponse groupBuilderEditGroup(groupbuilderv3EditGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderEditGroupRequest = {
  // number | Group ID.
  groupId: 1,
  // Groupbuilderv3EditGroupRequest
  groupbuilderv3EditGroupRequest: {
    clearGroup: true,
    deletedMembers: [
      "deletedMembers_example",
    ],
    description: "description_example",
    groupId: 1,
    ldapConfig: {
      attributes: [
        "attributes_example",
      ],
      bindGroupId: 1,
      bindPassword: "bindPassword_example",
      clearGroup: true,
      filter: "filter_example",
      filterScope: 1,
      importLimit: 1,
      ldapGroupName: "ldapGroupName_example",
      ldapId: "ldapId_example",
      memberPrefix: "memberPrefix_example",
    },
    name: "name_example",
    newMembers: [
      "newMembers_example",
    ],
    updatedMembers: [
      {
        memberId: "memberId_example",
        name: "name_example",
      },
    ],
  },
};

apiInstance.groupBuilderEditGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3EditGroupRequest** | **Groupbuilderv3EditGroupRequest**|  |
 **groupId** | [**number**] | Group ID. | defaults to undefined


### Return type

**Groupbuilderv3EditGroupResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderExportGroup**
> Groupbuilderv3GetExportGroupResponse groupBuilderExportGroup(groupbuilderv3GetExportGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderExportGroupRequest = {
  // Groupbuilderv3GetExportGroupRequest
  groupbuilderv3GetExportGroupRequest: {
    exportHierarchy: true,
    groupId: 1,
  },
};

apiInstance.groupBuilderExportGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetExportGroupRequest** | **Groupbuilderv3GetExportGroupRequest**|  |


### Return type

**Groupbuilderv3GetExportGroupResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderGetGroupDetails**
> Groupbuilderv3GetGroupDetailResponse groupBuilderGetGroupDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupDetailsRequest = {
  // number | Group ID.
  groupId: 1,
  // string | Filter by group member name. (optional)
  filter: "filter_example",
  // string | Order by ascending (ASC) or descending (DESC). (optional)
  order: "order_example",
};

apiInstance.groupBuilderGetGroupDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**number**] | Group ID. | defaults to undefined
 **filter** | [**string**] | Filter by group member name. | (optional) defaults to undefined
 **order** | [**string**] | Order by ascending (ASC) or descending (DESC). | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetGroupDetailResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderGetGroupMembers**
> Groupbuilderv3GetGroupMembersResponse groupBuilderGetGroupMembers(groupbuilderv3GetGroupMembersRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupMembersRequest = {
  // Groupbuilderv3GetGroupMembersRequest
  groupbuilderv3GetGroupMembersRequest: {
    groupId: [
      1,
    ],
  },
};

apiInstance.groupBuilderGetGroupMembers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetGroupMembersRequest** | **Groupbuilderv3GetGroupMembersRequest**|  |


### Return type

**Groupbuilderv3GetGroupMembersResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderGetGroupSyncMapping**
> Groupbuilderv3GetGroupSyncMappingResponse groupBuilderGetGroupSyncMapping()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupSyncMappingRequest = {
  // string | Central manager. (optional)
  centralManagerId: "central_manager_id_example",
};

apiInstance.groupBuilderGetGroupSyncMapping(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager. | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetGroupSyncMappingResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderGetGroupTypeMapping**
> Groupbuilderv3GetGroupTypeMappingResponse groupBuilderGetGroupTypeMapping()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:any = {};

apiInstance.groupBuilderGetGroupTypeMapping(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Groupbuilderv3GetGroupTypeMappingResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderGetGroupTypes**
> Groupbuilderv3GetGroupTypesResponse groupBuilderGetGroupTypes()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:any = {};

apiInstance.groupBuilderGetGroupTypes(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Groupbuilderv3GetGroupTypesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderGetGroups**
> Groupbuilderv3GetGroupsResponse groupBuilderGetGroups()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupsRequest = {
  // boolean | Return group names, ID\'s, type ID\'s, nested bool, and tuple count only if the flag is true. (optional)
  doNotIncludeMemberCount: true,
  // boolean | Only return groups that user has full-access to. (optional)
  onlyFullAccess: true,
  // boolean | Only return non-nested groups. (optional)
  nonNested: true,
};

apiInstance.groupBuilderGetGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doNotIncludeMemberCount** | [**boolean**] | Return group names, ID\&#39;s, type ID\&#39;s, nested bool, and tuple count only if the flag is true. | (optional) defaults to undefined
 **onlyFullAccess** | [**boolean**] | Only return groups that user has full-access to. | (optional) defaults to undefined
 **nonNested** | [**boolean**] | Only return non-nested groups. | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetGroupsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderGetImportGroups**
> Groupbuilderv3GetImportGroupsResponse groupBuilderGetImportGroups()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetImportGroupsRequest = {
  // string | Central manager host name. (optional)
  centralManagerId: "central_manager_id_example",
};

apiInstance.groupBuilderGetImportGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager host name. | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetImportGroupsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderImportGroup**
> Groupbuilderv3ImportGroupResponse groupBuilderImportGroup(groupbuilderv3ImportGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderImportGroupRequest = {
  // Groupbuilderv3ImportGroupRequest
  groupbuilderv3ImportGroupRequest: {
    centralManagerId: "centralManagerId_example",
    groups: [
      {
        accessLevel: 1,
        description: "description_example",
        flattenedMemberCount: 1,
        groupId: 1,
        groupTypeId: 1,
        lastSyncDate: new Date('1970-01-01T00:00:00.00Z'),
        ldapConfig: {
          attributes: [
            "attributes_example",
          ],
          bindGroupId: 1,
          bindPassword: "bindPassword_example",
          clearGroup: true,
          filter: "filter_example",
          filterScope: 1,
          importLimit: 1,
          ldapGroupName: "ldapGroupName_example",
          ldapId: "ldapId_example",
          memberPrefix: "memberPrefix_example",
        },
        memberCount: 1,
        members: [
          {
            memberId: "memberId_example",
            name: "name_example",
          },
        ],
        name: "name_example",
        nested: true,
        nestedGroupMembers: [
          {
            groupId: 1,
            name: "name_example",
            nestedMemberId: 1,
          },
        ],
        nextSyncDate: new Date('1970-01-01T00:00:00.00Z'),
        syncInactiveCode: 1,
        syncSource: "syncSource_example",
        synced: true,
        tupleCount: 1,
        tupleParams: [
          "tupleParams_example",
        ],
      },
    ],
    ldapConfig: {
      attributes: [
        "attributes_example",
      ],
      bindGroupId: 1,
      bindPassword: "bindPassword_example",
      clearGroup: true,
      filter: "filter_example",
      filterScope: 1,
      importLimit: 1,
      ldapGroupName: "ldapGroupName_example",
      ldapId: "ldapId_example",
      memberPrefix: "memberPrefix_example",
    },
    oneTime: true,
    preview: true,
  },
};

apiInstance.groupBuilderImportGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3ImportGroupRequest** | **Groupbuilderv3ImportGroupRequest**|  |


### Return type

**Groupbuilderv3ImportGroupResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderRefreshGroups**
> Groupbuilderv3RefreshGroupsResponse groupBuilderRefreshGroups(groupbuilderv3RefreshGroupsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderRefreshGroupsRequest = {
  // Groupbuilderv3RefreshGroupsRequest
  groupbuilderv3RefreshGroupsRequest: {
    groupIds: [
      1,
    ],
  },
};

apiInstance.groupBuilderRefreshGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3RefreshGroupsRequest** | **Groupbuilderv3RefreshGroupsRequest**|  |


### Return type

**Groupbuilderv3RefreshGroupsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderResetGroups**
> Groupbuilderv3ResetGroupsResponse groupBuilderResetGroups(groupbuilderv3ResetGroupsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderResetGroupsRequest = {
  // Groupbuilderv3ResetGroupsRequest
  groupbuilderv3ResetGroupsRequest: {
    groupIds: [
      1,
    ],
  },
};

apiInstance.groupBuilderResetGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3ResetGroupsRequest** | **Groupbuilderv3ResetGroupsRequest**|  |


### Return type

**Groupbuilderv3ResetGroupsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderStoreGroupMembersGdp**
> Groupbuilderv3StoreGroupMembersGdpResponse groupBuilderStoreGroupMembersGdp(groupbuilderv3StoreGroupMembersGdpRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderStoreGroupMembersGdpRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Groupbuilderv3StoreGroupMembersGdpRequest
  groupbuilderv3StoreGroupMembersGdpRequest: {
    centralManagerId: "centralManagerId_example",
    data: "data_example",
  },
};

apiInstance.groupBuilderStoreGroupMembersGdp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3StoreGroupMembersGdpRequest** | **Groupbuilderv3StoreGroupMembersGdpRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Groupbuilderv3StoreGroupMembersGdpResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **groupBuilderStoreGroupsGdp**
> Groupbuilderv3GetGroupsResponseGdp groupBuilderStoreGroupsGdp(groupbuilderv3GetGroupsRequestGdp)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderStoreGroupsGdpRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Groupbuilderv3GetGroupsRequestGdp
  groupbuilderv3GetGroupsRequestGdp: {
    centralManagerId: "centralManagerId_example",
    data: [
      {
        application: "application_example",
        description: "description_example",
        hierarchical: true,
        id: 1,
        memberCount: 1,
        members: "members_example",
        tupleCount: 1,
        tuples: "tuples_example",
        type: "type_example",
        typeId: 1,
      },
    ],
  },
};

apiInstance.groupBuilderStoreGroupsGdp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetGroupsRequestGdp** | **Groupbuilderv3GetGroupsRequestGdp**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Groupbuilderv3GetGroupsResponseGdp**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


