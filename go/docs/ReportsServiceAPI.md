# \ReportsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportsServiceCreateCategory**](ReportsServiceAPI.md#ReportsServiceCreateCategory) | **Post** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
[**ReportsServiceCreateChart**](ReportsServiceAPI.md#ReportsServiceCreateChart) | **Post** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
[**ReportsServiceCreateChartTemplatev2**](ReportsServiceAPI.md#ReportsServiceCreateChartTemplatev2) | **Post** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
[**ReportsServiceCreateChartv2**](ReportsServiceAPI.md#ReportsServiceCreateChartv2) | **Post** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
[**ReportsServiceCreateFieldsByCategory**](ReportsServiceAPI.md#ReportsServiceCreateFieldsByCategory) | **Post** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
[**ReportsServiceCreateJoin**](ReportsServiceAPI.md#ReportsServiceCreateJoin) | **Post** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
[**ReportsServiceCreateReport**](ReportsServiceAPI.md#ReportsServiceCreateReport) | **Post** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
[**ReportsServiceCreateVariant**](ReportsServiceAPI.md#ReportsServiceCreateVariant) | **Post** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
[**ReportsServiceDeleteCategory**](ReportsServiceAPI.md#ReportsServiceDeleteCategory) | **Delete** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
[**ReportsServiceDeleteChart**](ReportsServiceAPI.md#ReportsServiceDeleteChart) | **Delete** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
[**ReportsServiceDeleteChartTemplatev2**](ReportsServiceAPI.md#ReportsServiceDeleteChartTemplatev2) | **Delete** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
[**ReportsServiceDeleteChartv2**](ReportsServiceAPI.md#ReportsServiceDeleteChartv2) | **Delete** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
[**ReportsServiceDeleteFieldsByCategory**](ReportsServiceAPI.md#ReportsServiceDeleteFieldsByCategory) | **Delete** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
[**ReportsServiceDeleteJoin**](ReportsServiceAPI.md#ReportsServiceDeleteJoin) | **Delete** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
[**ReportsServiceDeleteReport**](ReportsServiceAPI.md#ReportsServiceDeleteReport) | **Delete** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
[**ReportsServiceDeleteVariant**](ReportsServiceAPI.md#ReportsServiceDeleteVariant) | **Delete** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
[**ReportsServiceGetCategories**](ReportsServiceAPI.md#ReportsServiceGetCategories) | **Get** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
[**ReportsServiceGetChartSettings**](ReportsServiceAPI.md#ReportsServiceGetChartSettings) | **Get** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
[**ReportsServiceGetChartSettingsv2**](ReportsServiceAPI.md#ReportsServiceGetChartSettingsv2) | **Get** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
[**ReportsServiceGetChartTemplatesv2**](ReportsServiceAPI.md#ReportsServiceGetChartTemplatesv2) | **Get** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
[**ReportsServiceGetFieldsByCategories**](ReportsServiceAPI.md#ReportsServiceGetFieldsByCategories) | **Get** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
[**ReportsServiceGetFieldsByCategory**](ReportsServiceAPI.md#ReportsServiceGetFieldsByCategory) | **Get** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
[**ReportsServiceGetJoins**](ReportsServiceAPI.md#ReportsServiceGetJoins) | **Get** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
[**ReportsServiceGetQueryByReportDefinition**](ReportsServiceAPI.md#ReportsServiceGetQueryByReportDefinition) | **Post** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
[**ReportsServiceGetQueryByReportID**](ReportsServiceAPI.md#ReportsServiceGetQueryByReportID) | **Post** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
[**ReportsServiceGetReportDefinition**](ReportsServiceAPI.md#ReportsServiceGetReportDefinition) | **Get** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
[**ReportsServiceGetReportGroups**](ReportsServiceAPI.md#ReportsServiceGetReportGroups) | **Get** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
[**ReportsServiceGetReportSynopsis**](ReportsServiceAPI.md#ReportsServiceGetReportSynopsis) | **Get** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
[**ReportsServiceGetReportTimestampHeader**](ReportsServiceAPI.md#ReportsServiceGetReportTimestampHeader) | **Get** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
[**ReportsServiceGetReports**](ReportsServiceAPI.md#ReportsServiceGetReports) | **Get** /api/v3/reports | Summary: Get reports Description: Get reports list.
[**ReportsServiceGetReportsForJoin**](ReportsServiceAPI.md#ReportsServiceGetReportsForJoin) | **Get** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
[**ReportsServiceGetReportsTags**](ReportsServiceAPI.md#ReportsServiceGetReportsTags) | **Get** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
[**ReportsServiceGetVariant**](ReportsServiceAPI.md#ReportsServiceGetVariant) | **Get** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
[**ReportsServiceGetVariants**](ReportsServiceAPI.md#ReportsServiceGetVariants) | **Get** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
[**ReportsServicePartialChartUpdate**](ReportsServiceAPI.md#ReportsServicePartialChartUpdate) | **Patch** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
[**ReportsServicePartialReportUpdate**](ReportsServiceAPI.md#ReportsServicePartialReportUpdate) | **Patch** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
[**ReportsServiceRunVariantOperation**](ReportsServiceAPI.md#ReportsServiceRunVariantOperation) | **Post** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
[**ReportsServiceTranspose**](ReportsServiceAPI.md#ReportsServiceTranspose) | **Post** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
[**ReportsServiceUpdateChart**](ReportsServiceAPI.md#ReportsServiceUpdateChart) | **Put** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
[**ReportsServiceUpdateChartv2**](ReportsServiceAPI.md#ReportsServiceUpdateChartv2) | **Put** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
[**ReportsServiceUpdateJoin**](ReportsServiceAPI.md#ReportsServiceUpdateJoin) | **Put** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
[**ReportsServiceUpdateReport**](ReportsServiceAPI.md#ReportsServiceUpdateReport) | **Put** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
[**ReportsServiceUpdateVariantOverride**](ReportsServiceAPI.md#ReportsServiceUpdateVariantOverride) | **Put** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override



## ReportsServiceCreateCategory

> Reportsv3CreateCategoryResponse ReportsServiceCreateCategory(ctx).Reportsv3CreateCategoryRequest(reportsv3CreateCategoryRequest).Execute()

Summary: Create a category Description: Create a report category

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
	reportsv3CreateCategoryRequest := *openapiclient.NewReportsv3CreateCategoryRequest() // Reportsv3CreateCategoryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateCategory(context.Background()).Reportsv3CreateCategoryRequest(reportsv3CreateCategoryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateCategory`: Reportsv3CreateCategoryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateCategoryRequest** | [**Reportsv3CreateCategoryRequest**](Reportsv3CreateCategoryRequest.md) |  | 

### Return type

[**Reportsv3CreateCategoryResponse**](Reportsv3CreateCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceCreateChart

> Reportsv3CreateChartResponse ReportsServiceCreateChart(ctx).Reportsv3CreateChartRequest(reportsv3CreateChartRequest).Execute()

Summary: Create chart Description: Create custom chart based on provided properties.

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
	reportsv3CreateChartRequest := *openapiclient.NewReportsv3CreateChartRequest() // Reportsv3CreateChartRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateChart(context.Background()).Reportsv3CreateChartRequest(reportsv3CreateChartRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateChart``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateChart`: Reportsv3CreateChartResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateChart`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateChartRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartRequest** | [**Reportsv3CreateChartRequest**](Reportsv3CreateChartRequest.md) |  | 

### Return type

[**Reportsv3CreateChartResponse**](Reportsv3CreateChartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceCreateChartTemplatev2

> Reportsv3CreateChartTemplatev2Response ReportsServiceCreateChartTemplatev2(ctx).Reportsv3CreateChartTemplatev2Request(reportsv3CreateChartTemplatev2Request).Execute()

Summary: Create chart template v2 Description: Create custom VEGA chart template.

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
	reportsv3CreateChartTemplatev2Request := *openapiclient.NewReportsv3CreateChartTemplatev2Request() // Reportsv3CreateChartTemplatev2Request | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateChartTemplatev2(context.Background()).Reportsv3CreateChartTemplatev2Request(reportsv3CreateChartTemplatev2Request).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateChartTemplatev2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateChartTemplatev2`: Reportsv3CreateChartTemplatev2Response
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateChartTemplatev2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateChartTemplatev2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartTemplatev2Request** | [**Reportsv3CreateChartTemplatev2Request**](Reportsv3CreateChartTemplatev2Request.md) |  | 

### Return type

[**Reportsv3CreateChartTemplatev2Response**](Reportsv3CreateChartTemplatev2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceCreateChartv2

> Reportsv3CreateChartv2Response ReportsServiceCreateChartv2(ctx).Reportsv3CreateChartv2Request(reportsv3CreateChartv2Request).Execute()

Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.

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
	reportsv3CreateChartv2Request := *openapiclient.NewReportsv3CreateChartv2Request() // Reportsv3CreateChartv2Request | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateChartv2(context.Background()).Reportsv3CreateChartv2Request(reportsv3CreateChartv2Request).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateChartv2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateChartv2`: Reportsv3CreateChartv2Response
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateChartv2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateChartv2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartv2Request** | [**Reportsv3CreateChartv2Request**](Reportsv3CreateChartv2Request.md) |  | 

### Return type

[**Reportsv3CreateChartv2Response**](Reportsv3CreateChartv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceCreateFieldsByCategory

> Reportsv3CreateFieldsByCategoryResponse ReportsServiceCreateFieldsByCategory(ctx).Reportsv3CreateFieldsByCategoryRequest(reportsv3CreateFieldsByCategoryRequest).Execute()

Summary - Create fields by category Description: Cteate category fields based on provided properties.

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
	reportsv3CreateFieldsByCategoryRequest := *openapiclient.NewReportsv3CreateFieldsByCategoryRequest() // Reportsv3CreateFieldsByCategoryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateFieldsByCategory(context.Background()).Reportsv3CreateFieldsByCategoryRequest(reportsv3CreateFieldsByCategoryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateFieldsByCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateFieldsByCategory`: Reportsv3CreateFieldsByCategoryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateFieldsByCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateFieldsByCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateFieldsByCategoryRequest** | [**Reportsv3CreateFieldsByCategoryRequest**](Reportsv3CreateFieldsByCategoryRequest.md) |  | 

### Return type

[**Reportsv3CreateFieldsByCategoryResponse**](Reportsv3CreateFieldsByCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceCreateJoin

> Reportsv3CreateJoinResponse ReportsServiceCreateJoin(ctx).Reportsv3CreateJoinRequest(reportsv3CreateJoinRequest).Execute()

Summary: Create a join Description: Create a custom report join

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
	reportsv3CreateJoinRequest := *openapiclient.NewReportsv3CreateJoinRequest() // Reportsv3CreateJoinRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateJoin(context.Background()).Reportsv3CreateJoinRequest(reportsv3CreateJoinRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateJoin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateJoin`: Reportsv3CreateJoinResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateJoin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateJoinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateJoinRequest** | [**Reportsv3CreateJoinRequest**](Reportsv3CreateJoinRequest.md) |  | 

### Return type

[**Reportsv3CreateJoinResponse**](Reportsv3CreateJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceCreateReport

> Reportsv3CreateReportResponse ReportsServiceCreateReport(ctx).Reportsv3CreateReportRequest(reportsv3CreateReportRequest).Execute()

Summary: Create report Description: Create custom report based on provided properties.

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
	reportsv3CreateReportRequest := *openapiclient.NewReportsv3CreateReportRequest() // Reportsv3CreateReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateReport(context.Background()).Reportsv3CreateReportRequest(reportsv3CreateReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateReport`: Reportsv3CreateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateReportRequest** | [**Reportsv3CreateReportRequest**](Reportsv3CreateReportRequest.md) |  | 

### Return type

[**Reportsv3CreateReportResponse**](Reportsv3CreateReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceCreateVariant

> Reportsv3CreateVariantResponse ReportsServiceCreateVariant(ctx).Reportsv3CreateVariantRequest(reportsv3CreateVariantRequest).Execute()

Summary: Create a variant Description: Create a variant for reports

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
	reportsv3CreateVariantRequest := *openapiclient.NewReportsv3CreateVariantRequest() // Reportsv3CreateVariantRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceCreateVariant(context.Background()).Reportsv3CreateVariantRequest(reportsv3CreateVariantRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceCreateVariant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceCreateVariant`: Reportsv3CreateVariantResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceCreateVariant`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceCreateVariantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateVariantRequest** | [**Reportsv3CreateVariantRequest**](Reportsv3CreateVariantRequest.md) |  | 

### Return type

[**Reportsv3CreateVariantResponse**](Reportsv3CreateVariantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteCategory

> Reportsv3DeleteCategoryResponse ReportsServiceDeleteCategory(ctx).CategoryId(categoryId).TableName(tableName).Execute()

Summary: Delete a category Description: Delete a report category

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
	categoryId := "categoryId_example" // string | category id. (optional)
	tableName := "tableName_example" // string | table name. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteCategory(context.Background()).CategoryId(categoryId).TableName(tableName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteCategory`: Reportsv3DeleteCategoryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | category id. | 
 **tableName** | **string** | table name. | 

### Return type

[**Reportsv3DeleteCategoryResponse**](Reportsv3DeleteCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteChart

> Reportsv3DeleteChartResponse ReportsServiceDeleteChart(ctx, chartId).Execute()

Summary: Delete chart Description: Delete a custom chart.

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
	chartId := "chartId_example" // string | The id of the chart to be deleted.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteChart(context.Background(), chartId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteChart``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteChart`: Reportsv3DeleteChartResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteChart`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**chartId** | **string** | The id of the chart to be deleted. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteChartRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3DeleteChartResponse**](Reportsv3DeleteChartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteChartTemplatev2

> Reportsv3DeleteChartTemplatev2Response ReportsServiceDeleteChartTemplatev2(ctx, templateId).Execute()

Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.

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
	templateId := "templateId_example" // string | Unique template ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteChartTemplatev2(context.Background(), templateId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteChartTemplatev2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteChartTemplatev2`: Reportsv3DeleteChartTemplatev2Response
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteChartTemplatev2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**templateId** | **string** | Unique template ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteChartTemplatev2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3DeleteChartTemplatev2Response**](Reportsv3DeleteChartTemplatev2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteChartv2

> Reportsv3DeleteChartv2Response ReportsServiceDeleteChartv2(ctx, chartId).Execute()

Summary: Delete chart v2 Description: Delete a custom VEGA chart.

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
	chartId := "chartId_example" // string | The ID of the chart for deletion.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteChartv2(context.Background(), chartId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteChartv2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteChartv2`: Reportsv3DeleteChartv2Response
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteChartv2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**chartId** | **string** | The ID of the chart for deletion. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteChartv2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3DeleteChartv2Response**](Reportsv3DeleteChartv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteFieldsByCategory

> Reportsv3DeleteFieldsByCategoryResponse ReportsServiceDeleteFieldsByCategory(ctx).HeaderIds(headerIds).TableName(tableName).Execute()

Summary - Delete fields by category Description: Delete category fields based on provided properties.

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
	headerIds := []string{"Inner_example"} // []string | Header ids. (optional)
	tableName := "tableName_example" // string | table name. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteFieldsByCategory(context.Background()).HeaderIds(headerIds).TableName(tableName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteFieldsByCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteFieldsByCategory`: Reportsv3DeleteFieldsByCategoryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteFieldsByCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteFieldsByCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headerIds** | **[]string** | Header ids. | 
 **tableName** | **string** | table name. | 

### Return type

[**Reportsv3DeleteFieldsByCategoryResponse**](Reportsv3DeleteFieldsByCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteJoin

> Reportsv3DeleteJoinResponse ReportsServiceDeleteJoin(ctx, joinId).Execute()

Summary: Delete a join Description: Delete a custom join

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
	joinId := "joinId_example" // string | The id of the join to be deleted.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteJoin(context.Background(), joinId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteJoin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteJoin`: Reportsv3DeleteJoinResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteJoin`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**joinId** | **string** | The id of the join to be deleted. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteJoinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3DeleteJoinResponse**](Reportsv3DeleteJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteReport

> Reportsv3DeleteReportResponse ReportsServiceDeleteReport(ctx, reportId).Execute()

Summary: Delete report Description: Delete a custom report.

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
	reportId := "reportId_example" // string | The id of the Report to be deleted.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteReport(context.Background(), reportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteReport`: Reportsv3DeleteReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteReport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | The id of the Report to be deleted. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3DeleteReportResponse**](Reportsv3DeleteReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceDeleteVariant

> Reportsv3DeleteVariantResponse ReportsServiceDeleteVariant(ctx, variantId).Execute()

Summary: Delete a variant Description: Delete a variant

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
	variantId := "variantId_example" // string | The id of the variant to delete

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceDeleteVariant(context.Background(), variantId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceDeleteVariant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceDeleteVariant`: Reportsv3DeleteVariantResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceDeleteVariant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**variantId** | **string** | The id of the variant to delete | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceDeleteVariantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3DeleteVariantResponse**](Reportsv3DeleteVariantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetCategories

> Reportsv3GetCategoriesResponse ReportsServiceGetCategories(ctx).ReportId(reportId).Execute()

Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.

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
	reportId := "reportId_example" // string | Report ID. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetCategories(context.Background()).ReportId(reportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetCategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetCategories`: Reportsv3GetCategoriesResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetCategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetCategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Report ID. | 

### Return type

[**Reportsv3GetCategoriesResponse**](Reportsv3GetCategoriesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetChartSettings

> Reportsv3GetChartSettingsResponse ReportsServiceGetChartSettings(ctx).ChartId(chartId).ReportId(reportId).Execute()

Summary: Get chart settings Description: Get a custom chart based on provided report id.

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
	chartId := "chartId_example" // string | Unique Chart ID. (optional)
	reportId := "reportId_example" // string | Unique Report ID. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetChartSettings(context.Background()).ChartId(chartId).ReportId(reportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetChartSettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetChartSettings`: Reportsv3GetChartSettingsResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetChartSettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetChartSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | Unique Chart ID. | 
 **reportId** | **string** | Unique Report ID. | 

### Return type

[**Reportsv3GetChartSettingsResponse**](Reportsv3GetChartSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetChartSettingsv2

> Reportsv3GetChartSettingsv2Response ReportsServiceGetChartSettingsv2(ctx).ChartId(chartId).ReportId(reportId).Execute()

Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.

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
	chartId := "chartId_example" // string | Unique Chart ID. (optional)
	reportId := "reportId_example" // string | Unique Report ID. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetChartSettingsv2(context.Background()).ChartId(chartId).ReportId(reportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetChartSettingsv2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetChartSettingsv2`: Reportsv3GetChartSettingsv2Response
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetChartSettingsv2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetChartSettingsv2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | Unique Chart ID. | 
 **reportId** | **string** | Unique Report ID. | 

### Return type

[**Reportsv3GetChartSettingsv2Response**](Reportsv3GetChartSettingsv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetChartTemplatesv2

> Reportsv3GetChartTemplatesv2Response ReportsServiceGetChartTemplatesv2(ctx).Execute()

Summary: Get chart template v2 Description: Get all custom VEGA chart templates.

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
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetChartTemplatesv2(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetChartTemplatesv2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetChartTemplatesv2`: Reportsv3GetChartTemplatesv2Response
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetChartTemplatesv2`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetChartTemplatesv2Request struct via the builder pattern


### Return type

[**Reportsv3GetChartTemplatesv2Response**](Reportsv3GetChartTemplatesv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetFieldsByCategories

> Reportsv3GetFieldsByCategoriesResponse ReportsServiceGetFieldsByCategories(ctx).CategoryIds(categoryIds).Execute()

Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.

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
	categoryIds := []string{"Inner_example"} // []string | Category IDs. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetFieldsByCategories(context.Background()).CategoryIds(categoryIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetFieldsByCategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetFieldsByCategories`: Reportsv3GetFieldsByCategoriesResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetFieldsByCategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetFieldsByCategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryIds** | **[]string** | Category IDs. | 

### Return type

[**Reportsv3GetFieldsByCategoriesResponse**](Reportsv3GetFieldsByCategoriesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetFieldsByCategory

> Reportsv3GetFieldsByCategoryResponse ReportsServiceGetFieldsByCategory(ctx).CategoryId(categoryId).ReportId(reportId).TableName(tableName).Execute()

Summary: Get fields by category Description: Get all category related fields or all possible fields.

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
	categoryId := "categoryId_example" // string | Category ID. (optional)
	reportId := "reportId_example" // string | Report ID. (optional)
	tableName := "tableName_example" // string | optional table name parameter. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetFieldsByCategory(context.Background()).CategoryId(categoryId).ReportId(reportId).TableName(tableName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetFieldsByCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetFieldsByCategory`: Reportsv3GetFieldsByCategoryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetFieldsByCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetFieldsByCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Category ID. | 
 **reportId** | **string** | Report ID. | 
 **tableName** | **string** | optional table name parameter. | 

### Return type

[**Reportsv3GetFieldsByCategoryResponse**](Reportsv3GetFieldsByCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetJoins

> Reportsv3GetJoinsResponse ReportsServiceGetJoins(ctx).CategoryId(categoryId).Execute()

Summary: Get all joins Description: Get all custom joins.

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
	categoryId := "categoryId_example" // string | Category ID (Optional). (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetJoins(context.Background()).CategoryId(categoryId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetJoins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetJoins`: Reportsv3GetJoinsResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetJoins`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetJoinsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Category ID (Optional). | 

### Return type

[**Reportsv3GetJoinsResponse**](Reportsv3GetJoinsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetQueryByReportDefinition

> Reportsv3GetReportQueryResponse ReportsServiceGetQueryByReportDefinition(ctx).Reportsv3GetQueryByReportDefinitionRequest(reportsv3GetQueryByReportDefinitionRequest).Execute()

Summary: Get query by report definition Description: Get query by report definition.

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
	reportsv3GetQueryByReportDefinitionRequest := *openapiclient.NewReportsv3GetQueryByReportDefinitionRequest() // Reportsv3GetQueryByReportDefinitionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetQueryByReportDefinition(context.Background()).Reportsv3GetQueryByReportDefinitionRequest(reportsv3GetQueryByReportDefinitionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetQueryByReportDefinition``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetQueryByReportDefinition`: Reportsv3GetReportQueryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetQueryByReportDefinition`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetQueryByReportDefinitionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportDefinitionRequest** | [**Reportsv3GetQueryByReportDefinitionRequest**](Reportsv3GetQueryByReportDefinitionRequest.md) |  | 

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetQueryByReportID

> Reportsv3GetReportQueryResponse ReportsServiceGetQueryByReportID(ctx).Reportsv3GetQueryByReportIDRequest(reportsv3GetQueryByReportIDRequest).Execute()

Summary: Get query by report ID Description: Get query by report ID.

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
	reportsv3GetQueryByReportIDRequest := *openapiclient.NewReportsv3GetQueryByReportIDRequest() // Reportsv3GetQueryByReportIDRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetQueryByReportID(context.Background()).Reportsv3GetQueryByReportIDRequest(reportsv3GetQueryByReportIDRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetQueryByReportID``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetQueryByReportID`: Reportsv3GetReportQueryResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetQueryByReportID`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetQueryByReportIDRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportIDRequest** | [**Reportsv3GetQueryByReportIDRequest**](Reportsv3GetQueryByReportIDRequest.md) |  | 

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetReportDefinition

> Reportsv3GetReportDefinitionResponse ReportsServiceGetReportDefinition(ctx, reportId).Execute()

Summary: Get report definition Description: Get report definition.

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
	reportId := "reportId_example" // string | Unique Report ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetReportDefinition(context.Background(), reportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetReportDefinition``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetReportDefinition`: Reportsv3GetReportDefinitionResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetReportDefinition`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | Unique Report ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetReportDefinitionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3GetReportDefinitionResponse**](Reportsv3GetReportDefinitionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetReportGroups

> Reportsv3GetReportGroupsResponse ReportsServiceGetReportGroups(ctx).Groups(groups).Execute()

Summary: Get report groups Description: Get reports used by the provided groups.

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
	groups := []string{"Inner_example"} // []string | List of group IDs that should be checked for usage in each report. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetReportGroups(context.Background()).Groups(groups).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetReportGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetReportGroups`: Reportsv3GetReportGroupsResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetReportGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetReportGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groups** | **[]string** | List of group IDs that should be checked for usage in each report. | 

### Return type

[**Reportsv3GetReportGroupsResponse**](Reportsv3GetReportGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetReportSynopsis

> Reportsv3GetReportSynopsisResponse ReportsServiceGetReportSynopsis(ctx, reportId).Execute()

Summary: Get report synopsis Description: Return BriefReport.

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
	reportId := "reportId_example" // string | Unique Report ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetReportSynopsis(context.Background(), reportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetReportSynopsis``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetReportSynopsis`: Reportsv3GetReportSynopsisResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetReportSynopsis`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | Unique Report ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetReportSynopsisRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3GetReportSynopsisResponse**](Reportsv3GetReportSynopsisResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetReportTimestampHeader

> Reportsv3GetReportTimestampHeaderResponse ReportsServiceGetReportTimestampHeader(ctx).CategoryId(categoryId).TableNames(tableNames).Execute()

Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.

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
	categoryId := "categoryId_example" // string | Category ID parameter. (optional)
	tableNames := []string{"Inner_example"} // []string | List of all header tables. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetReportTimestampHeader(context.Background()).CategoryId(categoryId).TableNames(tableNames).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetReportTimestampHeader``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetReportTimestampHeader`: Reportsv3GetReportTimestampHeaderResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetReportTimestampHeader`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetReportTimestampHeaderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Category ID parameter. | 
 **tableNames** | **[]string** | List of all header tables. | 

### Return type

[**Reportsv3GetReportTimestampHeaderResponse**](Reportsv3GetReportTimestampHeaderResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetReports

> Reportsv3GetReportsResponse ReportsServiceGetReports(ctx).CategoryId(categoryId).TableName(tableName).Execute()

Summary: Get reports Description: Get reports list.

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
	categoryId := "categoryId_example" // string | Optional Category ID parameter. (optional)
	tableName := "tableName_example" // string | Optional table name parameter. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetReports(context.Background()).CategoryId(categoryId).TableName(tableName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetReports``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetReports`: Reportsv3GetReportsResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetReports`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetReportsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Optional Category ID parameter. | 
 **tableName** | **string** | Optional table name parameter. | 

### Return type

[**Reportsv3GetReportsResponse**](Reportsv3GetReportsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetReportsForJoin

> Reportsv3GetReportsForJoinResponse ReportsServiceGetReportsForJoin(ctx, joinId).Execute()

Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join

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
	joinId := "joinId_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetReportsForJoin(context.Background(), joinId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetReportsForJoin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetReportsForJoin`: Reportsv3GetReportsForJoinResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetReportsForJoin`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**joinId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetReportsForJoinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3GetReportsForJoinResponse**](Reportsv3GetReportsForJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetReportsTags

> Reportsv3GetReportsTagsResponse ReportsServiceGetReportsTags(ctx).Execute()

Summary: Get reports tags Description: Get all report distinct tags.

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
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetReportsTags(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetReportsTags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetReportsTags`: Reportsv3GetReportsTagsResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetReportsTags`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetReportsTagsRequest struct via the builder pattern


### Return type

[**Reportsv3GetReportsTagsResponse**](Reportsv3GetReportsTagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetVariant

> Reportsv3GetVariantResponse ReportsServiceGetVariant(ctx, variantId).Execute()

Summary: Get a variant Description: Get a given variant

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
	variantId := "variantId_example" // string | The variant id

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetVariant(context.Background(), variantId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetVariant``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetVariant`: Reportsv3GetVariantResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetVariant`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**variantId** | **string** | The variant id | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetVariantRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Reportsv3GetVariantResponse**](Reportsv3GetVariantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceGetVariants

> Reportsv3GetVariantsResponse ReportsServiceGetVariants(ctx).Execute()

Summary: Get all variants Description: Get all variants in reports

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
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceGetVariants(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceGetVariants``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceGetVariants`: Reportsv3GetVariantsResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceGetVariants`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceGetVariantsRequest struct via the builder pattern


### Return type

[**Reportsv3GetVariantsResponse**](Reportsv3GetVariantsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServicePartialChartUpdate

> Reportsv3PartialChartUpdateResponse ReportsServicePartialChartUpdate(ctx, chartId).Reportsv3PartialChartUpdateRequest(reportsv3PartialChartUpdateRequest).Execute()

Summary: Partial chart update Description: Update a custom chart with partial information.

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
	chartId := "chartId_example" // string | Unique chart ID.
	reportsv3PartialChartUpdateRequest := *openapiclient.NewReportsv3PartialChartUpdateRequest() // Reportsv3PartialChartUpdateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServicePartialChartUpdate(context.Background(), chartId).Reportsv3PartialChartUpdateRequest(reportsv3PartialChartUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServicePartialChartUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServicePartialChartUpdate`: Reportsv3PartialChartUpdateResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServicePartialChartUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**chartId** | **string** | Unique chart ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServicePartialChartUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsv3PartialChartUpdateRequest** | [**Reportsv3PartialChartUpdateRequest**](Reportsv3PartialChartUpdateRequest.md) |  | 

### Return type

[**Reportsv3PartialChartUpdateResponse**](Reportsv3PartialChartUpdateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServicePartialReportUpdate

> Reportsv3PartialReportUpdateResponse ReportsServicePartialReportUpdate(ctx, reportId).Reportsv3PartialReportUpdateRequest(reportsv3PartialReportUpdateRequest).Execute()

Summary: Partial report update Description: Update a custom report with partial information.

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
	reportId := "reportId_example" // string | Unique Report ID.
	reportsv3PartialReportUpdateRequest := *openapiclient.NewReportsv3PartialReportUpdateRequest() // Reportsv3PartialReportUpdateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServicePartialReportUpdate(context.Background(), reportId).Reportsv3PartialReportUpdateRequest(reportsv3PartialReportUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServicePartialReportUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServicePartialReportUpdate`: Reportsv3PartialReportUpdateResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServicePartialReportUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | Unique Report ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServicePartialReportUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsv3PartialReportUpdateRequest** | [**Reportsv3PartialReportUpdateRequest**](Reportsv3PartialReportUpdateRequest.md) |  | 

### Return type

[**Reportsv3PartialReportUpdateResponse**](Reportsv3PartialReportUpdateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceRunVariantOperation

> Reportsv3RunVariantOperationResponse ReportsServiceRunVariantOperation(ctx).Reportsv3RunVariantOperationRequest(reportsv3RunVariantOperationRequest).Execute()

Summary: Run a variant Description: Run the operations in a variant

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
	reportsv3RunVariantOperationRequest := *openapiclient.NewReportsv3RunVariantOperationRequest() // Reportsv3RunVariantOperationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceRunVariantOperation(context.Background()).Reportsv3RunVariantOperationRequest(reportsv3RunVariantOperationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceRunVariantOperation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceRunVariantOperation`: Reportsv3RunVariantOperationResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceRunVariantOperation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceRunVariantOperationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3RunVariantOperationRequest** | [**Reportsv3RunVariantOperationRequest**](Reportsv3RunVariantOperationRequest.md) |  | 

### Return type

[**Reportsv3RunVariantOperationResponse**](Reportsv3RunVariantOperationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceTranspose

> Reportsv3RunReportResponse ReportsServiceTranspose(ctx).Reportsv3TransposeRequest(reportsv3TransposeRequest).Execute()

Summary: Transpose Description: Return the corresponding full sql data.

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
	reportsv3TransposeRequest := *openapiclient.NewReportsv3TransposeRequest() // Reportsv3TransposeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceTranspose(context.Background()).Reportsv3TransposeRequest(reportsv3TransposeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceTranspose``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceTranspose`: Reportsv3RunReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceTranspose`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceTransposeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3TransposeRequest** | [**Reportsv3TransposeRequest**](Reportsv3TransposeRequest.md) |  | 

### Return type

[**Reportsv3RunReportResponse**](Reportsv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceUpdateChart

> Reportsv3UpdateChartResponse ReportsServiceUpdateChart(ctx, chartId).Reportsv3UpdateChartRequest(reportsv3UpdateChartRequest).Execute()

Summary: Update chart Description: Update a custom chart.

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
	chartId := "chartId_example" // string | Unique chart ID.
	reportsv3UpdateChartRequest := *openapiclient.NewReportsv3UpdateChartRequest() // Reportsv3UpdateChartRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceUpdateChart(context.Background(), chartId).Reportsv3UpdateChartRequest(reportsv3UpdateChartRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceUpdateChart``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceUpdateChart`: Reportsv3UpdateChartResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceUpdateChart`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**chartId** | **string** | Unique chart ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceUpdateChartRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsv3UpdateChartRequest** | [**Reportsv3UpdateChartRequest**](Reportsv3UpdateChartRequest.md) |  | 

### Return type

[**Reportsv3UpdateChartResponse**](Reportsv3UpdateChartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceUpdateChartv2

> Reportsv3UpdateChartv2Response ReportsServiceUpdateChartv2(ctx, chartId).Reportsv3UpdateChartv2Request(reportsv3UpdateChartv2Request).Execute()

Summary: Update chart v2 Description: Update a custom VEGA chart.

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
	chartId := "chartId_example" // string | Unique chart ID.
	reportsv3UpdateChartv2Request := *openapiclient.NewReportsv3UpdateChartv2Request() // Reportsv3UpdateChartv2Request | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceUpdateChartv2(context.Background(), chartId).Reportsv3UpdateChartv2Request(reportsv3UpdateChartv2Request).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceUpdateChartv2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceUpdateChartv2`: Reportsv3UpdateChartv2Response
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceUpdateChartv2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**chartId** | **string** | Unique chart ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceUpdateChartv2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsv3UpdateChartv2Request** | [**Reportsv3UpdateChartv2Request**](Reportsv3UpdateChartv2Request.md) |  | 

### Return type

[**Reportsv3UpdateChartv2Response**](Reportsv3UpdateChartv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceUpdateJoin

> Reportsv3UpdateJoinResponse ReportsServiceUpdateJoin(ctx, joinId).Reportsv3UpdateJoinRequest(reportsv3UpdateJoinRequest).Execute()

Summary: Update a join Description: Update a custom join

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
	joinId := "joinId_example" // string | Unique join ID.
	reportsv3UpdateJoinRequest := *openapiclient.NewReportsv3UpdateJoinRequest() // Reportsv3UpdateJoinRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceUpdateJoin(context.Background(), joinId).Reportsv3UpdateJoinRequest(reportsv3UpdateJoinRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceUpdateJoin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceUpdateJoin`: Reportsv3UpdateJoinResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceUpdateJoin`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**joinId** | **string** | Unique join ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceUpdateJoinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsv3UpdateJoinRequest** | [**Reportsv3UpdateJoinRequest**](Reportsv3UpdateJoinRequest.md) |  | 

### Return type

[**Reportsv3UpdateJoinResponse**](Reportsv3UpdateJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceUpdateReport

> Reportsv3UpdateReportResponse ReportsServiceUpdateReport(ctx, reportId).Reportsv3UpdateReportRequest(reportsv3UpdateReportRequest).Execute()

Summary: Update report Description: Update a custom report.

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
	reportId := "reportId_example" // string | Unique Report ID.
	reportsv3UpdateReportRequest := *openapiclient.NewReportsv3UpdateReportRequest() // Reportsv3UpdateReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceUpdateReport(context.Background(), reportId).Reportsv3UpdateReportRequest(reportsv3UpdateReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceUpdateReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceUpdateReport`: Reportsv3UpdateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceUpdateReport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | Unique Report ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceUpdateReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsv3UpdateReportRequest** | [**Reportsv3UpdateReportRequest**](Reportsv3UpdateReportRequest.md) |  | 

### Return type

[**Reportsv3UpdateReportResponse**](Reportsv3UpdateReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsServiceUpdateVariantOverride

> Reportsv3UpdateVariantOverrideResponse ReportsServiceUpdateVariantOverride(ctx, variantId).Reportsv3UpdateVariantOverrideRequest(reportsv3UpdateVariantOverrideRequest).Execute()

Summary: Update a variant Description: Update a variant with a custom override

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
	variantId := "variantId_example" // string | The variant id
	reportsv3UpdateVariantOverrideRequest := *openapiclient.NewReportsv3UpdateVariantOverrideRequest() // Reportsv3UpdateVariantOverrideRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ReportsServiceAPI.ReportsServiceUpdateVariantOverride(context.Background(), variantId).Reportsv3UpdateVariantOverrideRequest(reportsv3UpdateVariantOverrideRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ReportsServiceAPI.ReportsServiceUpdateVariantOverride``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsServiceUpdateVariantOverride`: Reportsv3UpdateVariantOverrideResponse
	fmt.Fprintf(os.Stdout, "Response from `ReportsServiceAPI.ReportsServiceUpdateVariantOverride`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**variantId** | **string** | The variant id | 

### Other Parameters

Other parameters are passed through a pointer to a apiReportsServiceUpdateVariantOverrideRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **reportsv3UpdateVariantOverrideRequest** | [**Reportsv3UpdateVariantOverrideRequest**](Reportsv3UpdateVariantOverrideRequest.md) |  | 

### Return type

[**Reportsv3UpdateVariantOverrideResponse**](Reportsv3UpdateVariantOverrideResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

