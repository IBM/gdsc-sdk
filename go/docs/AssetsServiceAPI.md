# \AssetsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssetsServiceAssetIngestion**](AssetsServiceAPI.md#AssetsServiceAssetIngestion) | **Post** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
[**AssetsServiceAssetIngestionManualTrigger**](AssetsServiceAPI.md#AssetsServiceAssetIngestionManualTrigger) | **Post** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
[**AssetsServiceClonePolicy**](AssetsServiceAPI.md#AssetsServiceClonePolicy) | **Post** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
[**AssetsServiceCreateUpdatePolicy**](AssetsServiceAPI.md#AssetsServiceCreateUpdatePolicy) | **Post** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy.
[**AssetsServiceDeleteFilterTemplateForAssets**](AssetsServiceAPI.md#AssetsServiceDeleteFilterTemplateForAssets) | **Delete** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
[**AssetsServiceDeletePolicies**](AssetsServiceAPI.md#AssetsServiceDeletePolicies) | **Delete** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message.
[**AssetsServiceFetchAssetChangeLog**](AssetsServiceAPI.md#AssetsServiceFetchAssetChangeLog) | **Post** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
[**AssetsServiceFetchAssetDashboard**](AssetsServiceAPI.md#AssetsServiceFetchAssetDashboard) | **Get** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
[**AssetsServiceFetchAssetList**](AssetsServiceAPI.md#AssetsServiceFetchAssetList) | **Post** /api/v3/assets | FetchAssetList - Asset Fetch Api .
[**AssetsServiceFetchAssetsForMergeSplit**](AssetsServiceAPI.md#AssetsServiceFetchAssetsForMergeSplit) | **Get** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
[**AssetsServiceFindAssetName**](AssetsServiceAPI.md#AssetsServiceFindAssetName) | **Get** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
[**AssetsServiceGetAssetOverview**](AssetsServiceAPI.md#AssetsServiceGetAssetOverview) | **Get** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset.
[**AssetsServiceGetAssetTopology**](AssetsServiceAPI.md#AssetsServiceGetAssetTopology) | **Post** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset.
[**AssetsServiceGetFilterTemplateForAssets**](AssetsServiceAPI.md#AssetsServiceGetFilterTemplateForAssets) | **Get** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
[**AssetsServiceGetFiltersForAssets**](AssetsServiceAPI.md#AssetsServiceGetFiltersForAssets) | **Get** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data.
[**AssetsServiceListPolicy**](AssetsServiceAPI.md#AssetsServiceListPolicy) | **Get** /api/v3/assets/policies | ListPolicy - List all policies.
[**AssetsServiceListRule**](AssetsServiceAPI.md#AssetsServiceListRule) | **Get** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy.
[**AssetsServiceListTagDomains**](AssetsServiceAPI.md#AssetsServiceListTagDomains) | **Get** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters .
[**AssetsServiceListTags**](AssetsServiceAPI.md#AssetsServiceListTags) | **Get** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen .
[**AssetsServiceMergeOrSplitAssets**](AssetsServiceAPI.md#AssetsServiceMergeOrSplitAssets) | **Post** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets.
[**AssetsServiceSaveAssignedTags**](AssetsServiceAPI.md#AssetsServiceSaveAssignedTags) | **Post** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
[**AssetsServiceSaveTagConceptData**](AssetsServiceAPI.md#AssetsServiceSaveTagConceptData) | **Post** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag
[**AssetsServiceSaveTagDomainData**](AssetsServiceAPI.md#AssetsServiceSaveTagDomainData) | **Post** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag
[**AssetsServiceSaveUpdateFilterTemplateForAssets**](AssetsServiceAPI.md#AssetsServiceSaveUpdateFilterTemplateForAssets) | **Post** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
[**AssetsServiceSetBannerState**](AssetsServiceAPI.md#AssetsServiceSetBannerState) | **Put** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page.
[**AssetsServiceUpdateAssetName**](AssetsServiceAPI.md#AssetsServiceUpdateAssetName) | **Put** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user.
[**AssetsServiceUpdatePolicy**](AssetsServiceAPI.md#AssetsServiceUpdatePolicy) | **Put** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status.



## AssetsServiceAssetIngestion

> Assetsv3AssetIngestionResponse AssetsServiceAssetIngestion(ctx).Assetsv3AssetIngestionRequest(assetsv3AssetIngestionRequest).Execute()

AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.

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
	assetsv3AssetIngestionRequest := *openapiclient.NewAssetsv3AssetIngestionRequest() // Assetsv3AssetIngestionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceAssetIngestion(context.Background()).Assetsv3AssetIngestionRequest(assetsv3AssetIngestionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceAssetIngestion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceAssetIngestion`: Assetsv3AssetIngestionResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceAssetIngestion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceAssetIngestionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3AssetIngestionRequest** | [**Assetsv3AssetIngestionRequest**](Assetsv3AssetIngestionRequest.md) |  | 

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceAssetIngestionManualTrigger

> Assetsv3AssetIngestionResponse AssetsServiceAssetIngestionManualTrigger(ctx).Body(body).Execute()

AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.

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
	body := map[string]interface{}{ ... } // map[string]interface{} | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceAssetIngestionManualTrigger(context.Background()).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceAssetIngestionManualTrigger``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceAssetIngestionManualTrigger`: Assetsv3AssetIngestionResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceAssetIngestionManualTrigger`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceAssetIngestionManualTriggerRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map[string]interface{}** |  | 

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceClonePolicy

> map[string]interface{} AssetsServiceClonePolicy(ctx, policyId).Assetsv3ClonePolicyRequest(assetsv3ClonePolicyRequest).Execute()

ClonePolicy - Clone a policy.

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
	assetsv3ClonePolicyRequest := *openapiclient.NewAssetsv3ClonePolicyRequest() // Assetsv3ClonePolicyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceClonePolicy(context.Background(), policyId).Assetsv3ClonePolicyRequest(assetsv3ClonePolicyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceClonePolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceClonePolicy`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceClonePolicy`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**policyId** | **string** | Policy id that needs to be cloned. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceClonePolicyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **assetsv3ClonePolicyRequest** | [**Assetsv3ClonePolicyRequest**](Assetsv3ClonePolicyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceCreateUpdatePolicy

> Assetsv3CreateUpdatePolicyResponse AssetsServiceCreateUpdatePolicy(ctx).Assetsv3CreateUpdatePolicyRequest(assetsv3CreateUpdatePolicyRequest).Execute()

CreateUpdatePolicy - Create/update new Policy.

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
	assetsv3CreateUpdatePolicyRequest := *openapiclient.NewAssetsv3CreateUpdatePolicyRequest() // Assetsv3CreateUpdatePolicyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceCreateUpdatePolicy(context.Background()).Assetsv3CreateUpdatePolicyRequest(assetsv3CreateUpdatePolicyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceCreateUpdatePolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceCreateUpdatePolicy`: Assetsv3CreateUpdatePolicyResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceCreateUpdatePolicy`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceCreateUpdatePolicyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3CreateUpdatePolicyRequest** | [**Assetsv3CreateUpdatePolicyRequest**](Assetsv3CreateUpdatePolicyRequest.md) |  | 

### Return type

[**Assetsv3CreateUpdatePolicyResponse**](Assetsv3CreateUpdatePolicyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceDeleteFilterTemplateForAssets

> map[string]interface{} AssetsServiceDeleteFilterTemplateForAssets(ctx, templateId).Assetsv3AssetFilterTemplateRequest(assetsv3AssetFilterTemplateRequest).Execute()

DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.

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
	templateId := "templateId_example" // string | template id to be deleted
	assetsv3AssetFilterTemplateRequest := *openapiclient.NewAssetsv3AssetFilterTemplateRequest() // Assetsv3AssetFilterTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceDeleteFilterTemplateForAssets(context.Background(), templateId).Assetsv3AssetFilterTemplateRequest(assetsv3AssetFilterTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceDeleteFilterTemplateForAssets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceDeleteFilterTemplateForAssets`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceDeleteFilterTemplateForAssets`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**templateId** | **string** | template id to be deleted | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceDeleteFilterTemplateForAssetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **assetsv3AssetFilterTemplateRequest** | [**Assetsv3AssetFilterTemplateRequest**](Assetsv3AssetFilterTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceDeletePolicies

> map[string]interface{} AssetsServiceDeletePolicies(ctx).PolicyIds(policyIds).Execute()

DeletePolicies - Delete Policy returns response code and message.

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
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceDeletePolicies(context.Background()).PolicyIds(policyIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceDeletePolicies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceDeletePolicies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceDeletePolicies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceDeletePoliciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | **[]string** | Policy ids. | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceFetchAssetChangeLog

> Assetsv3FetchAssetChangeLogResponse AssetsServiceFetchAssetChangeLog(ctx).Assetsv3FetchAssetChangeLogRequest(assetsv3FetchAssetChangeLogRequest).Execute()

FetchAssetChangeLog - Fetch the logs for any actions performed on assets.

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
	assetsv3FetchAssetChangeLogRequest := *openapiclient.NewAssetsv3FetchAssetChangeLogRequest() // Assetsv3FetchAssetChangeLogRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceFetchAssetChangeLog(context.Background()).Assetsv3FetchAssetChangeLogRequest(assetsv3FetchAssetChangeLogRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceFetchAssetChangeLog``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceFetchAssetChangeLog`: Assetsv3FetchAssetChangeLogResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceFetchAssetChangeLog`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceFetchAssetChangeLogRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3FetchAssetChangeLogRequest** | [**Assetsv3FetchAssetChangeLogRequest**](Assetsv3FetchAssetChangeLogRequest.md) |  | 

### Return type

[**Assetsv3FetchAssetChangeLogResponse**](Assetsv3FetchAssetChangeLogResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceFetchAssetDashboard

> Assetsv3FetchAssetDashboardResponse AssetsServiceFetchAssetDashboard(ctx, widgetType).DateRangeStart(dateRangeStart).DateRangeEnd(dateRangeEnd).DateRangeType(dateRangeType).DateRangeKey(dateRangeKey).DateRangeError(dateRangeError).DateRangeStartNumber(dateRangeStartNumber).DateRangeStartUnit(dateRangeStartUnit).DateRangeEndNumber(dateRangeEndNumber).DateRangeEndUnit(dateRangeEndUnit).TimelineValueSelected(timelineValueSelected).TagId(tagId).Execute()

FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.

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
	widgetType := "widgetType_example" // string | ID of the Dashboard Widget
	dateRangeStart := "dateRangeStart_example" // string | start of date range for ui widget. (optional)
	dateRangeEnd := "dateRangeEnd_example" // string | end of date range for ui widget. (optional)
	dateRangeType := "dateRangeType_example" // string | type of date range for ui widget. (optional)
	dateRangeKey := "dateRangeKey_example" // string | key for ui widget. (optional)
	dateRangeError := "dateRangeError_example" // string | error for ui widget. (optional)
	dateRangeStartNumber := int32(56) // int32 | start_number for ui widget. (optional)
	dateRangeStartUnit := "dateRangeStartUnit_example" // string | start of date range for ui widget. (optional)
	dateRangeEndNumber := int32(56) // int32 | start of date range for ui widget. (optional)
	dateRangeEndUnit := "dateRangeEndUnit_example" // string | start of date range for ui widget. (optional)
	timelineValueSelected := "timelineValueSelected_example" // string | Name of the timeline value selected from drop down. (optional)
	tagId := "tagId_example" // string | Tag ID. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceFetchAssetDashboard(context.Background(), widgetType).DateRangeStart(dateRangeStart).DateRangeEnd(dateRangeEnd).DateRangeType(dateRangeType).DateRangeKey(dateRangeKey).DateRangeError(dateRangeError).DateRangeStartNumber(dateRangeStartNumber).DateRangeStartUnit(dateRangeStartUnit).DateRangeEndNumber(dateRangeEndNumber).DateRangeEndUnit(dateRangeEndUnit).TimelineValueSelected(timelineValueSelected).TagId(tagId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceFetchAssetDashboard``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceFetchAssetDashboard`: Assetsv3FetchAssetDashboardResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceFetchAssetDashboard`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**widgetType** | **string** | ID of the Dashboard Widget | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceFetchAssetDashboardRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **dateRangeStart** | **string** | start of date range for ui widget. | 
 **dateRangeEnd** | **string** | end of date range for ui widget. | 
 **dateRangeType** | **string** | type of date range for ui widget. | 
 **dateRangeKey** | **string** | key for ui widget. | 
 **dateRangeError** | **string** | error for ui widget. | 
 **dateRangeStartNumber** | **int32** | start_number for ui widget. | 
 **dateRangeStartUnit** | **string** | start of date range for ui widget. | 
 **dateRangeEndNumber** | **int32** | start of date range for ui widget. | 
 **dateRangeEndUnit** | **string** | start of date range for ui widget. | 
 **timelineValueSelected** | **string** | Name of the timeline value selected from drop down. | 
 **tagId** | **string** | Tag ID. | 

### Return type

[**Assetsv3FetchAssetDashboardResponse**](Assetsv3FetchAssetDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceFetchAssetList

> Assetsv3FetchAssetListResponse AssetsServiceFetchAssetList(ctx).Assetsv3FetchAssetListRequest(assetsv3FetchAssetListRequest).Execute()

FetchAssetList - Asset Fetch Api .

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
	assetsv3FetchAssetListRequest := *openapiclient.NewAssetsv3FetchAssetListRequest() // Assetsv3FetchAssetListRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceFetchAssetList(context.Background()).Assetsv3FetchAssetListRequest(assetsv3FetchAssetListRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceFetchAssetList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceFetchAssetList`: Assetsv3FetchAssetListResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceFetchAssetList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceFetchAssetListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3FetchAssetListRequest** | [**Assetsv3FetchAssetListRequest**](Assetsv3FetchAssetListRequest.md) |  | 

### Return type

[**Assetsv3FetchAssetListResponse**](Assetsv3FetchAssetListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceFetchAssetsForMergeSplit

> Assetsv3FetchAssetsForMergeSplitResponse AssetsServiceFetchAssetsForMergeSplit(ctx).AssetId(assetId).PageNumber(pageNumber).PageSize(pageSize).Action(action).SearchKey(searchKey).Execute()

FetchAssetsForMergeSplit : Fetch assets for Merge and Split.

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
	assetId := "assetId_example" // string | Asset grouper Id. (optional)
	pageNumber := int32(56) // int32 | Page number. (optional)
	pageSize := int32(56) // int32 | Page size. (optional)
	action := "action_example" // string | Action : merge or split. (optional)
	searchKey := "searchKey_example" // string | Search from the list based on asset name, database name, ip or host. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceFetchAssetsForMergeSplit(context.Background()).AssetId(assetId).PageNumber(pageNumber).PageSize(pageSize).Action(action).SearchKey(searchKey).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceFetchAssetsForMergeSplit``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceFetchAssetsForMergeSplit`: Assetsv3FetchAssetsForMergeSplitResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceFetchAssetsForMergeSplit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceFetchAssetsForMergeSplitRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **string** | Asset grouper Id. | 
 **pageNumber** | **int32** | Page number. | 
 **pageSize** | **int32** | Page size. | 
 **action** | **string** | Action : merge or split. | 
 **searchKey** | **string** | Search from the list based on asset name, database name, ip or host. | 

### Return type

[**Assetsv3FetchAssetsForMergeSplitResponse**](Assetsv3FetchAssetsForMergeSplitResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceFindAssetName

> Assetsv3FindAssetNameResponse AssetsServiceFindAssetName(ctx).AssetName(assetName).Execute()

FindAssetName - Checks if the given Asset Name has already been assigned to an asset.

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
	assetName := "assetName_example" // string | Name of asset. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceFindAssetName(context.Background()).AssetName(assetName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceFindAssetName``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceFindAssetName`: Assetsv3FindAssetNameResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceFindAssetName`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceFindAssetNameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetName** | **string** | Name of asset. | 

### Return type

[**Assetsv3FindAssetNameResponse**](Assetsv3FindAssetNameResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceGetAssetOverview

> Assetsv3AssetOverviewResponse AssetsServiceGetAssetOverview(ctx).AssetId(assetId).PageNumber(pageNumber).Size(size).Widget(widget).Ip(ip).Host(host).Database(database).AssetEntityType(assetEntityType).Execute()

GetAssetOverview - Get asset overview widgets data for a particular asset.

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
	assetId := "assetId_example" // string | Asset grouper Id. (optional)
	pageNumber := int32(56) // int32 | Page number. (optional)
	size := int32(56) // int32 | Page size. (optional)
	widget := "widget_example" // string | Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. (optional) (default to "ALL")
	ip := "ip_example" // string | Asset IP. (optional)
	host := "host_example" // string | Asset Host. (optional)
	database := "database_example" // string | Database Name. (optional)
	assetEntityType := "assetEntityType_example" // string | asset ntity type. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceGetAssetOverview(context.Background()).AssetId(assetId).PageNumber(pageNumber).Size(size).Widget(widget).Ip(ip).Host(host).Database(database).AssetEntityType(assetEntityType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceGetAssetOverview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceGetAssetOverview`: Assetsv3AssetOverviewResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceGetAssetOverview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceGetAssetOverviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **string** | Asset grouper Id. | 
 **pageNumber** | **int32** | Page number. | 
 **size** | **int32** | Page size. | 
 **widget** | **string** | Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. | [default to &quot;ALL&quot;]
 **ip** | **string** | Asset IP. | 
 **host** | **string** | Asset Host. | 
 **database** | **string** | Database Name. | 
 **assetEntityType** | **string** | asset ntity type. | 

### Return type

[**Assetsv3AssetOverviewResponse**](Assetsv3AssetOverviewResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceGetAssetTopology

> Assetsv3GetAssetTopologyResponse AssetsServiceGetAssetTopology(ctx).Assetsv3GetAssetTopologyRequest(assetsv3GetAssetTopologyRequest).Execute()

GetAssetTopology- Get list of topology for a parent asset.

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
	assetsv3GetAssetTopologyRequest := *openapiclient.NewAssetsv3GetAssetTopologyRequest() // Assetsv3GetAssetTopologyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceGetAssetTopology(context.Background()).Assetsv3GetAssetTopologyRequest(assetsv3GetAssetTopologyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceGetAssetTopology``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceGetAssetTopology`: Assetsv3GetAssetTopologyResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceGetAssetTopology`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceGetAssetTopologyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3GetAssetTopologyRequest** | [**Assetsv3GetAssetTopologyRequest**](Assetsv3GetAssetTopologyRequest.md) |  | 

### Return type

[**Assetsv3GetAssetTopologyResponse**](Assetsv3GetAssetTopologyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceGetFilterTemplateForAssets

> Assetsv3GetFilterTemplateResponse AssetsServiceGetFilterTemplateForAssets(ctx).TemplateId(templateId).Execute()

GetFilterTemplateForAssets - Get list of filters query templates for manage assets.

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
	templateId := "templateId_example" // string | template id to be deleted. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceGetFilterTemplateForAssets(context.Background()).TemplateId(templateId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceGetFilterTemplateForAssets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceGetFilterTemplateForAssets`: Assetsv3GetFilterTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceGetFilterTemplateForAssets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceGetFilterTemplateForAssetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string** | template id to be deleted. | 

### Return type

[**Assetsv3GetFilterTemplateResponse**](Assetsv3GetFilterTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceGetFiltersForAssets

> Assetsv3GetFiltersDataResponse AssetsServiceGetFiltersForAssets(ctx).Execute()

GetFiltersForAssets - Get a list of filters category and sub category with all data.

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
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceGetFiltersForAssets(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceGetFiltersForAssets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceGetFiltersForAssets`: Assetsv3GetFiltersDataResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceGetFiltersForAssets`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceGetFiltersForAssetsRequest struct via the builder pattern


### Return type

[**Assetsv3GetFiltersDataResponse**](Assetsv3GetFiltersDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceListPolicy

> Assetsv3ListPolicyResponse AssetsServiceListPolicy(ctx).Execute()

ListPolicy - List all policies.

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
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceListPolicy(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceListPolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceListPolicy`: Assetsv3ListPolicyResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceListPolicy`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceListPolicyRequest struct via the builder pattern


### Return type

[**Assetsv3ListPolicyResponse**](Assetsv3ListPolicyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceListRule

> Assetsv3ListRuleResponse AssetsServiceListRule(ctx, policyId).Execute()

ListRule - List all rules for a policy.

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
	policyId := "policyId_example" // string | Policy ID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceListRule(context.Background(), policyId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceListRule``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceListRule`: Assetsv3ListRuleResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceListRule`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**policyId** | **string** | Policy ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceListRuleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Assetsv3ListRuleResponse**](Assetsv3ListRuleResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceListTagDomains

> Assetsv3ListTagDomainsResponse AssetsServiceListTagDomains(ctx).DomGrouper(domGrouper).Purpose(purpose).NeedTag(needTag).Execute()

ListTagDomains - Get Tag categories by request parameters .

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
	domGrouper := "domGrouper_example" // string | Optional: dom_grouper required if we want to fetch domains based on the group. (optional)
	purpose := "purpose_example" // string | Optional: purpose required if we want to fetch domains based on the purpose. (optional)
	needTag := true // bool | Optional: If we need Tag  based on the Domains. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceListTagDomains(context.Background()).DomGrouper(domGrouper).Purpose(purpose).NeedTag(needTag).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceListTagDomains``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceListTagDomains`: Assetsv3ListTagDomainsResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceListTagDomains`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceListTagDomainsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domGrouper** | **string** | Optional: dom_grouper required if we want to fetch domains based on the group. | 
 **purpose** | **string** | Optional: purpose required if we want to fetch domains based on the purpose. | 
 **needTag** | **bool** | Optional: If we need Tag  based on the Domains. | 

### Return type

[**Assetsv3ListTagDomainsResponse**](Assetsv3ListTagDomainsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceListTags

> Assetsv3ListTagsResponse AssetsServiceListTags(ctx).AssetId(assetId).Execute()

ListTags - Get Tags for Manage Tags listing screen .

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
	assetId := []string{"Inner_example"} // []string | asset id - Asset ID. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceListTags(context.Background()).AssetId(assetId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceListTags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceListTags`: Assetsv3ListTagsResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceListTags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceListTagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **[]string** | asset id - Asset ID. | 

### Return type

[**Assetsv3ListTagsResponse**](Assetsv3ListTagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceMergeOrSplitAssets

> map[string]interface{} AssetsServiceMergeOrSplitAssets(ctx).Assetsv3MergeOrSplitAssetsRequest(assetsv3MergeOrSplitAssetsRequest).Execute()

MergeOrSplitAssets - Merge or split the selected assets.

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
	assetsv3MergeOrSplitAssetsRequest := *openapiclient.NewAssetsv3MergeOrSplitAssetsRequest() // Assetsv3MergeOrSplitAssetsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceMergeOrSplitAssets(context.Background()).Assetsv3MergeOrSplitAssetsRequest(assetsv3MergeOrSplitAssetsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceMergeOrSplitAssets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceMergeOrSplitAssets`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceMergeOrSplitAssets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceMergeOrSplitAssetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3MergeOrSplitAssetsRequest** | [**Assetsv3MergeOrSplitAssetsRequest**](Assetsv3MergeOrSplitAssetsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceSaveAssignedTags

> map[string]interface{} AssetsServiceSaveAssignedTags(ctx).Assetsv3SaveAssignedTagsRequest(assetsv3SaveAssignedTagsRequest).Execute()

SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.

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
	assetsv3SaveAssignedTagsRequest := *openapiclient.NewAssetsv3SaveAssignedTagsRequest() // Assetsv3SaveAssignedTagsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceSaveAssignedTags(context.Background()).Assetsv3SaveAssignedTagsRequest(assetsv3SaveAssignedTagsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceSaveAssignedTags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceSaveAssignedTags`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceSaveAssignedTags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceSaveAssignedTagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveAssignedTagsRequest** | [**Assetsv3SaveAssignedTagsRequest**](Assetsv3SaveAssignedTagsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceSaveTagConceptData

> map[string]interface{} AssetsServiceSaveTagConceptData(ctx).Assetsv3SaveTagConceptDataRequest(assetsv3SaveTagConceptDataRequest).Execute()

SaveTagConceptData - creates a custom tag

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
	assetsv3SaveTagConceptDataRequest := *openapiclient.NewAssetsv3SaveTagConceptDataRequest() // Assetsv3SaveTagConceptDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceSaveTagConceptData(context.Background()).Assetsv3SaveTagConceptDataRequest(assetsv3SaveTagConceptDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceSaveTagConceptData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceSaveTagConceptData`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceSaveTagConceptData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceSaveTagConceptDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveTagConceptDataRequest** | [**Assetsv3SaveTagConceptDataRequest**](Assetsv3SaveTagConceptDataRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceSaveTagDomainData

> map[string]interface{} AssetsServiceSaveTagDomainData(ctx).Assetsv3SaveTagDomainDataRequest(assetsv3SaveTagDomainDataRequest).Execute()

SaveTagDomainData - creates a custom category to be assigned to a tag

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
	assetsv3SaveTagDomainDataRequest := *openapiclient.NewAssetsv3SaveTagDomainDataRequest() // Assetsv3SaveTagDomainDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceSaveTagDomainData(context.Background()).Assetsv3SaveTagDomainDataRequest(assetsv3SaveTagDomainDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceSaveTagDomainData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceSaveTagDomainData`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceSaveTagDomainData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceSaveTagDomainDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveTagDomainDataRequest** | [**Assetsv3SaveTagDomainDataRequest**](Assetsv3SaveTagDomainDataRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceSaveUpdateFilterTemplateForAssets

> Assetsv3SaveUpdateFilterTemplateResponse AssetsServiceSaveUpdateFilterTemplateForAssets(ctx).Assetsv3SaveUpdateFilterTemplateRequest(assetsv3SaveUpdateFilterTemplateRequest).Execute()

SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.

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
	assetsv3SaveUpdateFilterTemplateRequest := *openapiclient.NewAssetsv3SaveUpdateFilterTemplateRequest() // Assetsv3SaveUpdateFilterTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceSaveUpdateFilterTemplateForAssets(context.Background()).Assetsv3SaveUpdateFilterTemplateRequest(assetsv3SaveUpdateFilterTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceSaveUpdateFilterTemplateForAssets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceSaveUpdateFilterTemplateForAssets`: Assetsv3SaveUpdateFilterTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceSaveUpdateFilterTemplateForAssets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceSaveUpdateFilterTemplateForAssetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveUpdateFilterTemplateRequest** | [**Assetsv3SaveUpdateFilterTemplateRequest**](Assetsv3SaveUpdateFilterTemplateRequest.md) |  | 

### Return type

[**Assetsv3SaveUpdateFilterTemplateResponse**](Assetsv3SaveUpdateFilterTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceSetBannerState

> map[string]interface{} AssetsServiceSetBannerState(ctx).Assetsv3SetBannerStateRequest(assetsv3SetBannerStateRequest).Execute()

SetBannerState - Set banner state for asset inventory page.

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
	assetsv3SetBannerStateRequest := *openapiclient.NewAssetsv3SetBannerStateRequest() // Assetsv3SetBannerStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceSetBannerState(context.Background()).Assetsv3SetBannerStateRequest(assetsv3SetBannerStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceSetBannerState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceSetBannerState`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceSetBannerState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceSetBannerStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SetBannerStateRequest** | [**Assetsv3SetBannerStateRequest**](Assetsv3SetBannerStateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceUpdateAssetName

> map[string]interface{} AssetsServiceUpdateAssetName(ctx).Assetsv3UpdateAssetNameRequest(assetsv3UpdateAssetNameRequest).Execute()

UpdateAssetName - Udates the name of the asset as given by the user.

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
	assetsv3UpdateAssetNameRequest := *openapiclient.NewAssetsv3UpdateAssetNameRequest() // Assetsv3UpdateAssetNameRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceUpdateAssetName(context.Background()).Assetsv3UpdateAssetNameRequest(assetsv3UpdateAssetNameRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceUpdateAssetName``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceUpdateAssetName`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceUpdateAssetName`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceUpdateAssetNameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3UpdateAssetNameRequest** | [**Assetsv3UpdateAssetNameRequest**](Assetsv3UpdateAssetNameRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetsServiceUpdatePolicy

> map[string]interface{} AssetsServiceUpdatePolicy(ctx).Assetsv3UpdatePolicyRequest(assetsv3UpdatePolicyRequest).Execute()

UpdatePolicy - Update existing Policy status.

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
	assetsv3UpdatePolicyRequest := *openapiclient.NewAssetsv3UpdatePolicyRequest() // Assetsv3UpdatePolicyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AssetsServiceAPI.AssetsServiceUpdatePolicy(context.Background()).Assetsv3UpdatePolicyRequest(assetsv3UpdatePolicyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AssetsServiceAPI.AssetsServiceUpdatePolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetsServiceUpdatePolicy`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AssetsServiceAPI.AssetsServiceUpdatePolicy`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAssetsServiceUpdatePolicyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3UpdatePolicyRequest** | [**Assetsv3UpdatePolicyRequest**](Assetsv3UpdatePolicyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

