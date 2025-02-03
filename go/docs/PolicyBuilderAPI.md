# \PolicyBuilderAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PolicyBuilderClonePolicy**](PolicyBuilderAPI.md#PolicyBuilderClonePolicy) | **Post** /api/v3/policies/clone/{policy_id} | Summary: Clone policy Description: Clone a policy.
[**PolicyBuilderCreatePolicy**](PolicyBuilderAPI.md#PolicyBuilderCreatePolicy) | **Post** /api/v3/policies | Summary: Create policy Description: Create Policy returns response code and message.
[**PolicyBuilderDeleteGdpSyncEntry**](PolicyBuilderAPI.md#PolicyBuilderDeleteGdpSyncEntry) | **Delete** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
[**PolicyBuilderDeletePolicies**](PolicyBuilderAPI.md#PolicyBuilderDeletePolicies) | **Delete** /api/v3/policies | Summary: Delete policies Description: Delete Policy returns response code and message.
[**PolicyBuilderGetGdpPolicyMetaData**](PolicyBuilderAPI.md#PolicyBuilderGetGdpPolicyMetaData) | **Get** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information Description: Get GDP&#39;s CM&#39;s policy summary from mogodb
[**PolicyBuilderGetPolicies**](PolicyBuilderAPI.md#PolicyBuilderGetPolicies) | **Get** /api/v3/policies | Summary: Get policies Description: Return a list of policies to the caller.
[**PolicyBuilderGetPolicyDetails**](PolicyBuilderAPI.md#PolicyBuilderGetPolicyDetails) | **Get** /api/v3/policies/{policy_id}/details | Summary: Get policy details Description: Return a list of rules inside the policy.
[**PolicyBuilderGetPolicyNamesFromRuleIDs**](PolicyBuilderAPI.md#PolicyBuilderGetPolicyNamesFromRuleIDs) | **Post** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
[**PolicyBuilderGetPolicySyncList**](PolicyBuilderAPI.md#PolicyBuilderGetPolicySyncList) | **Get** /api/v3/policies/sync_list | Summary: Get list of synced polices Description: Returns the list and status of sync entries
[**PolicyBuilderGetReceivers**](PolicyBuilderAPI.md#PolicyBuilderGetReceivers) | **Get** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions.
[**PolicyBuilderGetRuleMetadata**](PolicyBuilderAPI.md#PolicyBuilderGetRuleMetadata) | **Get** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
[**PolicyBuilderInsertGdpPolicy**](PolicyBuilderAPI.md#PolicyBuilderInsertGdpPolicy) | **Post** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#39;s name into sync collection
[**PolicyBuilderInsertGdpPolicyMetaData**](PolicyBuilderAPI.md#PolicyBuilderInsertGdpPolicyMetaData) | **Post** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert gdp policy summaries Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only)
[**PolicyBuilderInstallPolicies**](PolicyBuilderAPI.md#PolicyBuilderInstallPolicies) | **Put** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations.
[**PolicyBuilderIntegrationCheck**](PolicyBuilderAPI.md#PolicyBuilderIntegrationCheck) | **Get** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies.
[**PolicyBuilderPoliciesGroups**](PolicyBuilderAPI.md#PolicyBuilderPoliciesGroups) | **Get** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups.
[**PolicyBuilderRuleValidation**](PolicyBuilderAPI.md#PolicyBuilderRuleValidation) | **Post** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions.
[**PolicyBuilderStorePoliciesGdp**](PolicyBuilderAPI.md#PolicyBuilderStorePoliciesGdp) | **Post** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)



## PolicyBuilderClonePolicy

> Policybuilderv3StandardCRUDResponse PolicyBuilderClonePolicy(ctx, policyId).Policybuilderv3ClonePolicyRequest(policybuilderv3ClonePolicyRequest).Execute()

Summary: Clone policy Description: Clone a policy.

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
	policyId := "policyId_example" // string | Policy id that needs to be cloned.
	policybuilderv3ClonePolicyRequest := *openapiclient.NewPolicybuilderv3ClonePolicyRequest() // Policybuilderv3ClonePolicyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderClonePolicy(context.Background(), policyId).Policybuilderv3ClonePolicyRequest(policybuilderv3ClonePolicyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderClonePolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderClonePolicy`: Policybuilderv3StandardCRUDResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderClonePolicy`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**policyId** | **string** | Policy id that needs to be cloned. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderClonePolicyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **policybuilderv3ClonePolicyRequest** | [**Policybuilderv3ClonePolicyRequest**](Policybuilderv3ClonePolicyRequest.md) |  | 

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderCreatePolicy

> Policybuilderv3CreateUpdatePolicyResponse PolicyBuilderCreatePolicy(ctx).Policybuilderv3CreateUpdatePolicyRequest(policybuilderv3CreateUpdatePolicyRequest).Execute()

Summary: Create policy Description: Create Policy returns response code and message.

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
	policybuilderv3CreateUpdatePolicyRequest := *openapiclient.NewPolicybuilderv3CreateUpdatePolicyRequest() // Policybuilderv3CreateUpdatePolicyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderCreatePolicy(context.Background()).Policybuilderv3CreateUpdatePolicyRequest(policybuilderv3CreateUpdatePolicyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderCreatePolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderCreatePolicy`: Policybuilderv3CreateUpdatePolicyResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderCreatePolicy`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderCreatePolicyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3CreateUpdatePolicyRequest** | [**Policybuilderv3CreateUpdatePolicyRequest**](Policybuilderv3CreateUpdatePolicyRequest.md) |  | 

### Return type

[**Policybuilderv3CreateUpdatePolicyResponse**](Policybuilderv3CreateUpdatePolicyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderDeleteGdpSyncEntry

> Policybuilderv3DeleteGdpPolicySyncResponse PolicyBuilderDeleteGdpSyncEntry(ctx).SyncIds(syncIds).Execute()

Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection

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
	syncIds := []string{"Inner_example"} // []string | Policy sync entry id to delete from sync. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderDeleteGdpSyncEntry(context.Background()).SyncIds(syncIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderDeleteGdpSyncEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderDeleteGdpSyncEntry`: Policybuilderv3DeleteGdpPolicySyncResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderDeleteGdpSyncEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderDeleteGdpSyncEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncIds** | **[]string** | Policy sync entry id to delete from sync. | 

### Return type

[**Policybuilderv3DeleteGdpPolicySyncResponse**](Policybuilderv3DeleteGdpPolicySyncResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderDeletePolicies

> Policybuilderv3StandardCRUDResponse PolicyBuilderDeletePolicies(ctx).PolicyIds(policyIds).Execute()

Summary: Delete policies Description: Delete Policy returns response code and message.

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
	policyIds := []string{"Inner_example"} // []string | Policy ids. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderDeletePolicies(context.Background()).PolicyIds(policyIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderDeletePolicies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderDeletePolicies`: Policybuilderv3StandardCRUDResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderDeletePolicies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderDeletePoliciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | **[]string** | Policy ids. | 

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderGetGdpPolicyMetaData

> Policybuilderv3GetGdpPolicyMetaDataResponse PolicyBuilderGetGdpPolicyMetaData(ctx).Execute()

Summary: Get GDP policy summary information Description: Get GDP's CM's policy summary from mogodb

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
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderGetGdpPolicyMetaData(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderGetGdpPolicyMetaData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderGetGdpPolicyMetaData`: Policybuilderv3GetGdpPolicyMetaDataResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderGetGdpPolicyMetaData`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderGetGdpPolicyMetaDataRequest struct via the builder pattern


### Return type

[**Policybuilderv3GetGdpPolicyMetaDataResponse**](Policybuilderv3GetGdpPolicyMetaDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderGetPolicies

> Policybuilderv3GetPoliciesResponse PolicyBuilderGetPolicies(ctx).Execute()

Summary: Get policies Description: Return a list of policies to the caller.

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
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderGetPolicies(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderGetPolicies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderGetPolicies`: Policybuilderv3GetPoliciesResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderGetPolicies`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderGetPoliciesRequest struct via the builder pattern


### Return type

[**Policybuilderv3GetPoliciesResponse**](Policybuilderv3GetPoliciesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderGetPolicyDetails

> Policybuilderv3GetPolicyDetailsResponse PolicyBuilderGetPolicyDetails(ctx, policyId).Execute()

Summary: Get policy details Description: Return a list of rules inside the policy.

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
	policyId := "policyId_example" // string | Policy id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderGetPolicyDetails(context.Background(), policyId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderGetPolicyDetails``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderGetPolicyDetails`: Policybuilderv3GetPolicyDetailsResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderGetPolicyDetails`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**policyId** | **string** | Policy id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderGetPolicyDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Policybuilderv3GetPolicyDetailsResponse**](Policybuilderv3GetPolicyDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderGetPolicyNamesFromRuleIDs

> Policybuilderv3GetPolicyNamesFromRuleIDsResponse PolicyBuilderGetPolicyNamesFromRuleIDs(ctx).Policybuilderv3GetPolicyNamesFromRuleIDsRequest(policybuilderv3GetPolicyNamesFromRuleIDsRequest).Execute()

Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.

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
	policybuilderv3GetPolicyNamesFromRuleIDsRequest := *openapiclient.NewPolicybuilderv3GetPolicyNamesFromRuleIDsRequest() // Policybuilderv3GetPolicyNamesFromRuleIDsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderGetPolicyNamesFromRuleIDs(context.Background()).Policybuilderv3GetPolicyNamesFromRuleIDsRequest(policybuilderv3GetPolicyNamesFromRuleIDsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderGetPolicyNamesFromRuleIDs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderGetPolicyNamesFromRuleIDs`: Policybuilderv3GetPolicyNamesFromRuleIDsResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderGetPolicyNamesFromRuleIDs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderGetPolicyNamesFromRuleIDsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3GetPolicyNamesFromRuleIDsRequest** | [**Policybuilderv3GetPolicyNamesFromRuleIDsRequest**](Policybuilderv3GetPolicyNamesFromRuleIDsRequest.md) |  | 

### Return type

[**Policybuilderv3GetPolicyNamesFromRuleIDsResponse**](Policybuilderv3GetPolicyNamesFromRuleIDsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderGetPolicySyncList

> Policybuilderv3GetPolicySyncListResponse PolicyBuilderGetPolicySyncList(ctx).Execute()

Summary: Get list of synced polices Description: Returns the list and status of sync entries

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
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderGetPolicySyncList(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderGetPolicySyncList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderGetPolicySyncList`: Policybuilderv3GetPolicySyncListResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderGetPolicySyncList`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderGetPolicySyncListRequest struct via the builder pattern


### Return type

[**Policybuilderv3GetPolicySyncListResponse**](Policybuilderv3GetPolicySyncListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderGetReceivers

> Policybuilderv3GetReceiversResponse PolicyBuilderGetReceivers(ctx).ActionId(actionId).ValidateCache(validateCache).Execute()

Summary: Get receivers Description: Get all the receivers associated with actions.

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
	actionId := []string{"Inner_example"} // []string | Action id. (optional)
	validateCache := true // bool | Flag that indicates if cache needs to be validated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderGetReceivers(context.Background()).ActionId(actionId).ValidateCache(validateCache).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderGetReceivers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderGetReceivers`: Policybuilderv3GetReceiversResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderGetReceivers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderGetReceiversRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionId** | **[]string** | Action id. | 
 **validateCache** | **bool** | Flag that indicates if cache needs to be validated. | 

### Return type

[**Policybuilderv3GetReceiversResponse**](Policybuilderv3GetReceiversResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderGetRuleMetadata

> Policybuilderv3RuleMetadataResponse PolicyBuilderGetRuleMetadata(ctx).RuleType(ruleType).Execute()

Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.

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
	ruleType := "ruleType_example" // string | Rule type integer to indicate rule type. (optional) (default to "ACCESS")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderGetRuleMetadata(context.Background()).RuleType(ruleType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderGetRuleMetadata``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderGetRuleMetadata`: Policybuilderv3RuleMetadataResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderGetRuleMetadata`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderGetRuleMetadataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleType** | **string** | Rule type integer to indicate rule type. | [default to &quot;ACCESS&quot;]

### Return type

[**Policybuilderv3RuleMetadataResponse**](Policybuilderv3RuleMetadataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderInsertGdpPolicy

> Policybuilderv3InsertGdpPolicySyncResponse PolicyBuilderInsertGdpPolicy(ctx).Policybuilderv3InsertGdpPolicySyncRequest(policybuilderv3InsertGdpPolicySyncRequest).Execute()

Summary: Insert GDP policy sync entry Description: Inserts GDP policy's name into sync collection

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
	policybuilderv3InsertGdpPolicySyncRequest := *openapiclient.NewPolicybuilderv3InsertGdpPolicySyncRequest() // Policybuilderv3InsertGdpPolicySyncRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderInsertGdpPolicy(context.Background()).Policybuilderv3InsertGdpPolicySyncRequest(policybuilderv3InsertGdpPolicySyncRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderInsertGdpPolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderInsertGdpPolicy`: Policybuilderv3InsertGdpPolicySyncResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderInsertGdpPolicy`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderInsertGdpPolicyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3InsertGdpPolicySyncRequest** | [**Policybuilderv3InsertGdpPolicySyncRequest**](Policybuilderv3InsertGdpPolicySyncRequest.md) |  | 

### Return type

[**Policybuilderv3InsertGdpPolicySyncResponse**](Policybuilderv3InsertGdpPolicySyncResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderInsertGdpPolicyMetaData

> Policybuilderv3InsertGdpPolicyMetaDataResponse PolicyBuilderInsertGdpPolicyMetaData(ctx, centralManagerId).Policybuilderv3InsertGdpPolicyMetaDataRequest(policybuilderv3InsertGdpPolicyMetaDataRequest).Execute()

Summary: Insert gdp policy summaries Description: Inserts GDP's CM's policy summary information into mogodb. (This API is called from GDP only)

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
	policybuilderv3InsertGdpPolicyMetaDataRequest := *openapiclient.NewPolicybuilderv3InsertGdpPolicyMetaDataRequest() // Policybuilderv3InsertGdpPolicyMetaDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderInsertGdpPolicyMetaData(context.Background(), centralManagerId).Policybuilderv3InsertGdpPolicyMetaDataRequest(policybuilderv3InsertGdpPolicyMetaDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderInsertGdpPolicyMetaData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderInsertGdpPolicyMetaData`: Policybuilderv3InsertGdpPolicyMetaDataResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderInsertGdpPolicyMetaData`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderInsertGdpPolicyMetaDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **policybuilderv3InsertGdpPolicyMetaDataRequest** | [**Policybuilderv3InsertGdpPolicyMetaDataRequest**](Policybuilderv3InsertGdpPolicyMetaDataRequest.md) |  | 

### Return type

[**Policybuilderv3InsertGdpPolicyMetaDataResponse**](Policybuilderv3InsertGdpPolicyMetaDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderInstallPolicies

> Policybuilderv3StatusResponseBase PolicyBuilderInstallPolicies(ctx).Policybuilderv3InstallPoliciesRequest(policybuilderv3InstallPoliciesRequest).Execute()

Summary: Install policies Description: Activate Policies request performs activations.

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
	policybuilderv3InstallPoliciesRequest := *openapiclient.NewPolicybuilderv3InstallPoliciesRequest() // Policybuilderv3InstallPoliciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderInstallPolicies(context.Background()).Policybuilderv3InstallPoliciesRequest(policybuilderv3InstallPoliciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderInstallPolicies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderInstallPolicies`: Policybuilderv3StatusResponseBase
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderInstallPolicies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderInstallPoliciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3InstallPoliciesRequest** | [**Policybuilderv3InstallPoliciesRequest**](Policybuilderv3InstallPoliciesRequest.md) |  | 

### Return type

[**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderIntegrationCheck

> Policybuilderv3GetIntegrationCheckResponse PolicyBuilderIntegrationCheck(ctx, integrationId).TemplateId(templateId).Execute()

Summary: Integration check Description: Check if integration id is being used in policies.

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
	integrationId := "integrationId_example" // string | Integration Id to check if it is being used in policies.
	templateId := "templateId_example" // string | Template Id to check if it is being used in policies. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderIntegrationCheck(context.Background(), integrationId).TemplateId(templateId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderIntegrationCheck``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderIntegrationCheck`: Policybuilderv3GetIntegrationCheckResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderIntegrationCheck`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**integrationId** | **string** | Integration Id to check if it is being used in policies. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderIntegrationCheckRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **templateId** | **string** | Template Id to check if it is being used in policies. | 

### Return type

[**Policybuilderv3GetIntegrationCheckResponse**](Policybuilderv3GetIntegrationCheckResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderPoliciesGroups

> Policybuilderv3GetPoliciesGroupsResponse PolicyBuilderPoliciesGroups(ctx).GroupIds(groupIds).Execute()

Summary: Policies groups Description: Get policy groups.

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
	groupIds := []string{"Inner_example"} // []string | Group ids to check if they are being used in policies. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderPoliciesGroups(context.Background()).GroupIds(groupIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderPoliciesGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderPoliciesGroups`: Policybuilderv3GetPoliciesGroupsResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderPoliciesGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderPoliciesGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **[]string** | Group ids to check if they are being used in policies. | 

### Return type

[**Policybuilderv3GetPoliciesGroupsResponse**](Policybuilderv3GetPoliciesGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderRuleValidation

> Policybuilderv3StandardCRUDResponse PolicyBuilderRuleValidation(ctx).Policybuilderv3GetRuleValidationRequest(policybuilderv3GetRuleValidationRequest).Execute()

Summary: Rule validation Description: Validate a rule parameters and actions.

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
	policybuilderv3GetRuleValidationRequest := *openapiclient.NewPolicybuilderv3GetRuleValidationRequest() // Policybuilderv3GetRuleValidationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderRuleValidation(context.Background()).Policybuilderv3GetRuleValidationRequest(policybuilderv3GetRuleValidationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderRuleValidation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderRuleValidation`: Policybuilderv3StandardCRUDResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderRuleValidation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderRuleValidationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3GetRuleValidationRequest** | [**Policybuilderv3GetRuleValidationRequest**](Policybuilderv3GetRuleValidationRequest.md) |  | 

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PolicyBuilderStorePoliciesGdp

> Policybuilderv3StorePolicyGdpResponse PolicyBuilderStorePoliciesGdp(ctx, centralManagerId).Policybuilderv3StorePolicyGdpRequest(policybuilderv3StorePolicyGdpRequest).Execute()

Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)

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
	policybuilderv3StorePolicyGdpRequest := *openapiclient.NewPolicybuilderv3StorePolicyGdpRequest() // Policybuilderv3StorePolicyGdpRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PolicyBuilderAPI.PolicyBuilderStorePoliciesGdp(context.Background(), centralManagerId).Policybuilderv3StorePolicyGdpRequest(policybuilderv3StorePolicyGdpRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PolicyBuilderAPI.PolicyBuilderStorePoliciesGdp``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PolicyBuilderStorePoliciesGdp`: Policybuilderv3StorePolicyGdpResponse
	fmt.Fprintf(os.Stdout, "Response from `PolicyBuilderAPI.PolicyBuilderStorePoliciesGdp`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPolicyBuilderStorePoliciesGdpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **policybuilderv3StorePolicyGdpRequest** | [**Policybuilderv3StorePolicyGdpRequest**](Policybuilderv3StorePolicyGdpRequest.md) |  | 

### Return type

[**Policybuilderv3StorePolicyGdpResponse**](Policybuilderv3StorePolicyGdpResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

