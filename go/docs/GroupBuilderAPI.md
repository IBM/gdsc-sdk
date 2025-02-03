# \GroupBuilderAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GroupBuilderCancelImportGroup**](GroupBuilderAPI.md#GroupBuilderCancelImportGroup) | **Delete** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups.
[**GroupBuilderCreateGroup**](GroupBuilderAPI.md#GroupBuilderCreateGroup) | **Post** /api/v3/groups | Summary: Create group Description: Create new groups.
[**GroupBuilderDeleteGroup**](GroupBuilderAPI.md#GroupBuilderDeleteGroup) | **Delete** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
[**GroupBuilderEditGroup**](GroupBuilderAPI.md#GroupBuilderEditGroup) | **Patch** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members.
[**GroupBuilderExportGroup**](GroupBuilderAPI.md#GroupBuilderExportGroup) | **Post** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID.
[**GroupBuilderGetGroupDetails**](GroupBuilderAPI.md#GroupBuilderGetGroupDetails) | **Get** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID.
[**GroupBuilderGetGroupMembers**](GroupBuilderAPI.md#GroupBuilderGetGroupMembers) | **Post** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
[**GroupBuilderGetGroupSyncMapping**](GroupBuilderAPI.md#GroupBuilderGetGroupSyncMapping) | **Get** /api/v3/groups/mappings/sync | Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
[**GroupBuilderGetGroupTypeMapping**](GroupBuilderAPI.md#GroupBuilderGetGroupTypeMapping) | **Get** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get insights to gdp group types mapping.
[**GroupBuilderGetGroupTypes**](GroupBuilderAPI.md#GroupBuilderGetGroupTypes) | **Get** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types.
[**GroupBuilderGetGroups**](GroupBuilderAPI.md#GroupBuilderGetGroups) | **Get** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members.
[**GroupBuilderGetImportGroups**](GroupBuilderAPI.md#GroupBuilderGetImportGroups) | **Get** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager.
[**GroupBuilderImportGroup**](GroupBuilderAPI.md#GroupBuilderImportGroup) | **Post** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
[**GroupBuilderRefreshGroups**](GroupBuilderAPI.md#GroupBuilderRefreshGroups) | **Post** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups.
[**GroupBuilderResetGroups**](GroupBuilderAPI.md#GroupBuilderResetGroups) | **Post** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups.
[**GroupBuilderStoreGroupMembersGdp**](GroupBuilderAPI.md#GroupBuilderStoreGroupMembersGdp) | **Post** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
[**GroupBuilderStoreGroupsGdp**](GroupBuilderAPI.md#GroupBuilderStoreGroupsGdp) | **Post** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)



## GroupBuilderCancelImportGroup

> Groupbuilderv3CancelGroupImportResponse GroupBuilderCancelImportGroup(ctx).GroupIds(groupIds).Execute()

Summary: Cancel import group Description: Cancel import refresh for selected groups.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupIds := []int32{int32(123)} // []int32 | Group IDs to delete. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderCancelImportGroup(context.Background()).GroupIds(groupIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderCancelImportGroup``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderCancelImportGroup`: Groupbuilderv3CancelGroupImportResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderCancelImportGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderCancelImportGroupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **[]int32** | Group IDs to delete. | 

### Return type

[**Groupbuilderv3CancelGroupImportResponse**](Groupbuilderv3CancelGroupImportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderCreateGroup

> Groupbuilderv3CreateGroupResponse GroupBuilderCreateGroup(ctx).Groupbuilderv3CreateGroupRequest(groupbuilderv3CreateGroupRequest).Execute()

Summary: Create group Description: Create new groups.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupbuilderv3CreateGroupRequest := *openapiclient.NewGroupbuilderv3CreateGroupRequest() // Groupbuilderv3CreateGroupRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderCreateGroup(context.Background()).Groupbuilderv3CreateGroupRequest(groupbuilderv3CreateGroupRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderCreateGroup``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderCreateGroup`: Groupbuilderv3CreateGroupResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderCreateGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderCreateGroupRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderDeleteGroup

> Groupbuilderv3DeleteGroupResponse GroupBuilderDeleteGroup(ctx).GroupIds(groupIds).Execute()

Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupIds := []int32{int32(123)} // []int32 | Group IDs to delete. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderDeleteGroup(context.Background()).GroupIds(groupIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderDeleteGroup``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderDeleteGroup`: Groupbuilderv3DeleteGroupResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderDeleteGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderDeleteGroupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **[]int32** | Group IDs to delete. | 

### Return type

[**Groupbuilderv3DeleteGroupResponse**](Groupbuilderv3DeleteGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderEditGroup

> Groupbuilderv3EditGroupResponse GroupBuilderEditGroup(ctx, groupId).Groupbuilderv3EditGroupRequest(groupbuilderv3EditGroupRequest).Execute()

Summary: Edit group Description: Add or delete group members.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupId := int32(56) // int32 | Group ID.
	groupbuilderv3EditGroupRequest := *openapiclient.NewGroupbuilderv3EditGroupRequest() // Groupbuilderv3EditGroupRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderEditGroup(context.Background(), groupId).Groupbuilderv3EditGroupRequest(groupbuilderv3EditGroupRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderEditGroup``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderEditGroup`: Groupbuilderv3EditGroupResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderEditGroup`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**groupId** | **int32** | Group ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderEditGroupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupbuilderv3EditGroupRequest** | [**Groupbuilderv3EditGroupRequest**](Groupbuilderv3EditGroupRequest.md) |  | 

### Return type

[**Groupbuilderv3EditGroupResponse**](Groupbuilderv3EditGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderExportGroup

> Groupbuilderv3GetExportGroupResponse GroupBuilderExportGroup(ctx).Groupbuilderv3GetExportGroupRequest(groupbuilderv3GetExportGroupRequest).Execute()

Summary: Export group Description: Export group content to a file based on a group ID.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupbuilderv3GetExportGroupRequest := *openapiclient.NewGroupbuilderv3GetExportGroupRequest() // Groupbuilderv3GetExportGroupRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderExportGroup(context.Background()).Groupbuilderv3GetExportGroupRequest(groupbuilderv3GetExportGroupRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderExportGroup``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderExportGroup`: Groupbuilderv3GetExportGroupResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderExportGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderExportGroupRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderGetGroupDetails

> Groupbuilderv3GetGroupDetailResponse GroupBuilderGetGroupDetails(ctx, groupId).Filter(filter).Order(order).Execute()

Summary: Get group details Description: Get details of group specified by group ID.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupId := int32(56) // int32 | Group ID.
	filter := "filter_example" // string | Filter by group member name. (optional)
	order := "order_example" // string | Order by ascending (ASC) or descending (DESC). (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderGetGroupDetails(context.Background(), groupId).Filter(filter).Order(order).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderGetGroupDetails``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderGetGroupDetails`: Groupbuilderv3GetGroupDetailResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderGetGroupDetails`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**groupId** | **int32** | Group ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderGetGroupDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **filter** | **string** | Filter by group member name. | 
 **order** | **string** | Order by ascending (ASC) or descending (DESC). | 

### Return type

[**Groupbuilderv3GetGroupDetailResponse**](Groupbuilderv3GetGroupDetailResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderGetGroupMembers

> Groupbuilderv3GetGroupMembersResponse GroupBuilderGetGroupMembers(ctx).Groupbuilderv3GetGroupMembersRequest(groupbuilderv3GetGroupMembersRequest).Execute()

Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupbuilderv3GetGroupMembersRequest := *openapiclient.NewGroupbuilderv3GetGroupMembersRequest() // Groupbuilderv3GetGroupMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderGetGroupMembers(context.Background()).Groupbuilderv3GetGroupMembersRequest(groupbuilderv3GetGroupMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderGetGroupMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderGetGroupMembers`: Groupbuilderv3GetGroupMembersResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderGetGroupMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderGetGroupMembersRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderGetGroupSyncMapping

> Groupbuilderv3GetGroupSyncMappingResponse GroupBuilderGetGroupSyncMapping(ctx).CentralManagerId(centralManagerId).Execute()

Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central manager. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderGetGroupSyncMapping(context.Background()).CentralManagerId(centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderGetGroupSyncMapping``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderGetGroupSyncMapping`: Groupbuilderv3GetGroupSyncMappingResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderGetGroupSyncMapping`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderGetGroupSyncMappingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central manager. | 

### Return type

[**Groupbuilderv3GetGroupSyncMappingResponse**](Groupbuilderv3GetGroupSyncMappingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderGetGroupTypeMapping

> Groupbuilderv3GetGroupTypeMappingResponse GroupBuilderGetGroupTypeMapping(ctx).Execute()

Summary: Get group type mapping Description: Get insights to gdp group types mapping.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderGetGroupTypeMapping(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderGetGroupTypeMapping``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderGetGroupTypeMapping`: Groupbuilderv3GetGroupTypeMappingResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderGetGroupTypeMapping`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderGetGroupTypeMappingRequest struct via the builder pattern


### Return type

[**Groupbuilderv3GetGroupTypeMappingResponse**](Groupbuilderv3GetGroupTypeMappingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderGetGroupTypes

> Groupbuilderv3GetGroupTypesResponse GroupBuilderGetGroupTypes(ctx).Execute()

Summary: Get group types Description: Get a list of available group types.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderGetGroupTypes(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderGetGroupTypes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderGetGroupTypes`: Groupbuilderv3GetGroupTypesResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderGetGroupTypes`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderGetGroupTypesRequest struct via the builder pattern


### Return type

[**Groupbuilderv3GetGroupTypesResponse**](Groupbuilderv3GetGroupTypesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderGetGroups

> Groupbuilderv3GetGroupsResponse GroupBuilderGetGroups(ctx).DoNotIncludeMemberCount(doNotIncludeMemberCount).OnlyFullAccess(onlyFullAccess).NonNested(nonNested).Execute()

Summary: Get groups Description: Get a list of imported group members.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	doNotIncludeMemberCount := true // bool | Return group names, ID's, type ID's, nested bool, and tuple count only if the flag is true. (optional)
	onlyFullAccess := true // bool | Only return groups that user has full-access to. (optional)
	nonNested := true // bool | Only return non-nested groups. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderGetGroups(context.Background()).DoNotIncludeMemberCount(doNotIncludeMemberCount).OnlyFullAccess(onlyFullAccess).NonNested(nonNested).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderGetGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderGetGroups`: Groupbuilderv3GetGroupsResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderGetGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderGetGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doNotIncludeMemberCount** | **bool** | Return group names, ID&#39;s, type ID&#39;s, nested bool, and tuple count only if the flag is true. | 
 **onlyFullAccess** | **bool** | Only return groups that user has full-access to. | 
 **nonNested** | **bool** | Only return non-nested groups. | 

### Return type

[**Groupbuilderv3GetGroupsResponse**](Groupbuilderv3GetGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderGetImportGroups

> Groupbuilderv3GetImportGroupsResponse GroupBuilderGetImportGroups(ctx).CentralManagerId(centralManagerId).Execute()

Summary: Get import groups Description: Get unsynchronized groups from a central manager.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central manager host name. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderGetImportGroups(context.Background()).CentralManagerId(centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderGetImportGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderGetImportGroups`: Groupbuilderv3GetImportGroupsResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderGetImportGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderGetImportGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central manager host name. | 

### Return type

[**Groupbuilderv3GetImportGroupsResponse**](Groupbuilderv3GetImportGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderImportGroup

> Groupbuilderv3ImportGroupResponse GroupBuilderImportGroup(ctx).Groupbuilderv3ImportGroupRequest(groupbuilderv3ImportGroupRequest).Execute()

Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupbuilderv3ImportGroupRequest := *openapiclient.NewGroupbuilderv3ImportGroupRequest() // Groupbuilderv3ImportGroupRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderImportGroup(context.Background()).Groupbuilderv3ImportGroupRequest(groupbuilderv3ImportGroupRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderImportGroup``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderImportGroup`: Groupbuilderv3ImportGroupResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderImportGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderImportGroupRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderRefreshGroups

> Groupbuilderv3RefreshGroupsResponse GroupBuilderRefreshGroups(ctx).Groupbuilderv3RefreshGroupsRequest(groupbuilderv3RefreshGroupsRequest).Execute()

Summary: Refresh groups Description: Refresh tenants selected imported groups.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupbuilderv3RefreshGroupsRequest := *openapiclient.NewGroupbuilderv3RefreshGroupsRequest() // Groupbuilderv3RefreshGroupsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderRefreshGroups(context.Background()).Groupbuilderv3RefreshGroupsRequest(groupbuilderv3RefreshGroupsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderRefreshGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderRefreshGroups`: Groupbuilderv3RefreshGroupsResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderRefreshGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderRefreshGroupsRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderResetGroups

> Groupbuilderv3ResetGroupsResponse GroupBuilderResetGroups(ctx).Groupbuilderv3ResetGroupsRequest(groupbuilderv3ResetGroupsRequest).Execute()

Summary: Reset groups Description: Resets tenants selected predefined groups.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	groupbuilderv3ResetGroupsRequest := *openapiclient.NewGroupbuilderv3ResetGroupsRequest() // Groupbuilderv3ResetGroupsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderResetGroups(context.Background()).Groupbuilderv3ResetGroupsRequest(groupbuilderv3ResetGroupsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderResetGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderResetGroups`: Groupbuilderv3ResetGroupsResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderResetGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderResetGroupsRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderStoreGroupMembersGdp

> Groupbuilderv3StoreGroupMembersGdpResponse GroupBuilderStoreGroupMembersGdp(ctx, centralManagerId).Groupbuilderv3StoreGroupMembersGdpRequest(groupbuilderv3StoreGroupMembersGdpRequest).Execute()

Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	groupbuilderv3StoreGroupMembersGdpRequest := *openapiclient.NewGroupbuilderv3StoreGroupMembersGdpRequest() // Groupbuilderv3StoreGroupMembersGdpRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderStoreGroupMembersGdp(context.Background(), centralManagerId).Groupbuilderv3StoreGroupMembersGdpRequest(groupbuilderv3StoreGroupMembersGdpRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderStoreGroupMembersGdp``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderStoreGroupMembersGdp`: Groupbuilderv3StoreGroupMembersGdpResponse
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderStoreGroupMembersGdp`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderStoreGroupMembersGdpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupbuilderv3StoreGroupMembersGdpRequest** | [**Groupbuilderv3StoreGroupMembersGdpRequest**](Groupbuilderv3StoreGroupMembersGdpRequest.md) |  | 

### Return type

[**Groupbuilderv3StoreGroupMembersGdpResponse**](Groupbuilderv3StoreGroupMembersGdpResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GroupBuilderStoreGroupsGdp

> Groupbuilderv3GetGroupsResponseGdp GroupBuilderStoreGroupsGdp(ctx, centralManagerId).Groupbuilderv3GetGroupsRequestGdp(groupbuilderv3GetGroupsRequestGdp).Execute()

Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	groupbuilderv3GetGroupsRequestGdp := *openapiclient.NewGroupbuilderv3GetGroupsRequestGdp() // Groupbuilderv3GetGroupsRequestGdp | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GroupBuilderAPI.GroupBuilderStoreGroupsGdp(context.Background(), centralManagerId).Groupbuilderv3GetGroupsRequestGdp(groupbuilderv3GetGroupsRequestGdp).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GroupBuilderAPI.GroupBuilderStoreGroupsGdp``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GroupBuilderStoreGroupsGdp`: Groupbuilderv3GetGroupsResponseGdp
	fmt.Fprintf(os.Stdout, "Response from `GroupBuilderAPI.GroupBuilderStoreGroupsGdp`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGroupBuilderStoreGroupsGdpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupbuilderv3GetGroupsRequestGdp** | [**Groupbuilderv3GetGroupsRequestGdp**](Groupbuilderv3GetGroupsRequestGdp.md) |  | 

### Return type

[**Groupbuilderv3GetGroupsResponseGdp**](Groupbuilderv3GetGroupsResponseGdp.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

