# \CloudAccountsAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddAnalyzedRegion**](CloudAccountsAPI.md#AddAnalyzedRegion) | **Post** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
[**AddCloudAccounts**](CloudAccountsAPI.md#AddCloudAccounts) | **Post** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to Guardium Insights SaaS DSPM
[**GenerateAtlassianConfluenceAuthUrl**](CloudAccountsAPI.md#GenerateAtlassianConfluenceAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
[**GenerateAtlassianJiraAuthUrl**](CloudAccountsAPI.md#GenerateAtlassianJiraAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
[**GenerateAzureAuthUrl**](CloudAccountsAPI.md#GenerateAzureAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
[**GenerateOffice365AuthUrl**](CloudAccountsAPI.md#GenerateOffice365AuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
[**GenerateSalesforceAuthUrl**](CloudAccountsAPI.md#GenerateSalesforceAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/salesforce/generateAuthUrl | Generate a Salesforce consent URL
[**GenerateSlackAuthUrl**](CloudAccountsAPI.md#GenerateSlackAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
[**GetAnalyzedRegionStatus**](CloudAccountsAPI.md#GetAnalyzedRegionStatus) | **Get** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
[**GetAzureAdminConsentStatus**](CloudAccountsAPI.md#GetAzureAdminConsentStatus) | **Get** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
[**GetCloudAccountInstallationStatus**](CloudAccountsAPI.md#GetCloudAccountInstallationStatus) | **Get** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
[**GetCompliances**](CloudAccountsAPI.md#GetCompliances) | **Get** /api/v1/dspm/cloudAccounts/compliances | Get a list of selected compliances
[**ListLinkedAccounts**](CloudAccountsAPI.md#ListLinkedAccounts) | **Get** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to Guardium Insights SaaS DSPM
[**RemoveAccounts**](CloudAccountsAPI.md#RemoveAccounts) | **Delete** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
[**RemoveAccountsInstructions**](CloudAccountsAPI.md#RemoveAccountsInstructions) | **Get** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
[**RetrieveServiceAccountId**](CloudAccountsAPI.md#RetrieveServiceAccountId) | **Get** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
[**SetCompliances**](CloudAccountsAPI.md#SetCompliances) | **Post** /api/v1/dspm/cloudAccounts/compliances | Set a list of selected compliances
[**SubmitGoogleWorkspaceAdminEmail**](CloudAccountsAPI.md#SubmitGoogleWorkspaceAdminEmail) | **Post** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
[**SubmitOffice365TenantInfo**](CloudAccountsAPI.md#SubmitOffice365TenantInfo) | **Post** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
[**SubmitSalesforceAuthCode**](CloudAccountsAPI.md#SubmitSalesforceAuthCode) | **Post** /api/v1/dspm/cloudAccounts/saasApps/salesforce/submitAuthCodeInfo | Submit Salesforce customer information
[**SubmitSlackAuthCode**](CloudAccountsAPI.md#SubmitSlackAuthCode) | **Post** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code



## AddAnalyzedRegion

> AddAnalyzedRegion200Response AddAnalyzedRegion(ctx).AddAnalyzedRegionRequest(addAnalyzedRegionRequest).Execute()

Add a new region for data classification



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
	addAnalyzedRegionRequest := *openapiclient.NewAddAnalyzedRegionRequest(openapiclient.CloudServiceProvider("aws")) // AddAnalyzedRegionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.AddAnalyzedRegion(context.Background()).AddAnalyzedRegionRequest(addAnalyzedRegionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.AddAnalyzedRegion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddAnalyzedRegion`: AddAnalyzedRegion200Response
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.AddAnalyzedRegion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAddAnalyzedRegionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addAnalyzedRegionRequest** | [**AddAnalyzedRegionRequest**](AddAnalyzedRegionRequest.md) |  | 

### Return type

[**AddAnalyzedRegion200Response**](AddAnalyzedRegion200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AddCloudAccounts

> AddCloudAccounts200Response AddCloudAccounts(ctx).AddCloudAccountsRequest(addCloudAccountsRequest).Execute()

Add cloud account connections to Guardium Insights SaaS DSPM



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
	addCloudAccountsRequest := *openapiclient.NewAddCloudAccountsRequest(openapiclient.CloudServiceProvider("aws"), []openapiclient.AddCloudAccountsRequestCloudAccountsInner{*openapiclient.NewAddCloudAccountsRequestCloudAccountsInner("123456789101", "my cloud account name")}) // AddCloudAccountsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.AddCloudAccounts(context.Background()).AddCloudAccountsRequest(addCloudAccountsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.AddCloudAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddCloudAccounts`: AddCloudAccounts200Response
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.AddCloudAccounts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAddCloudAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addCloudAccountsRequest** | [**AddCloudAccountsRequest**](AddCloudAccountsRequest.md) |  | 

### Return type

[**AddCloudAccounts200Response**](AddCloudAccounts200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateAtlassianConfluenceAuthUrl

> AuthUrl GenerateAtlassianConfluenceAuthUrl(ctx).Execute()

Generate a Confluence authentication URL



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
	resp, r, err := apiClient.CloudAccountsAPI.GenerateAtlassianConfluenceAuthUrl(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GenerateAtlassianConfluenceAuthUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateAtlassianConfluenceAuthUrl`: AuthUrl
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GenerateAtlassianConfluenceAuthUrl`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGenerateAtlassianConfluenceAuthUrlRequest struct via the builder pattern


### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateAtlassianJiraAuthUrl

> AuthUrl GenerateAtlassianJiraAuthUrl(ctx).Execute()

Generate a JIRA authentication URL



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
	resp, r, err := apiClient.CloudAccountsAPI.GenerateAtlassianJiraAuthUrl(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GenerateAtlassianJiraAuthUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateAtlassianJiraAuthUrl`: AuthUrl
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GenerateAtlassianJiraAuthUrl`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGenerateAtlassianJiraAuthUrlRequest struct via the builder pattern


### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateAzureAuthUrl

> AuthUrl GenerateAzureAuthUrl(ctx).TenantId(tenantId).Execute()

Generate azure authorization url



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
	tenantId := "tenantId_example" // string | Tenant Id of the new Azure account, GUID format. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.GenerateAzureAuthUrl(context.Background()).TenantId(tenantId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GenerateAzureAuthUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateAzureAuthUrl`: AuthUrl
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GenerateAzureAuthUrl`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateAzureAuthUrlRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant Id of the new Azure account, GUID format. | 

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateOffice365AuthUrl

> AuthUrl GenerateOffice365AuthUrl(ctx).Execute()

Generate a Microsoft 365 consent URL



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
	resp, r, err := apiClient.CloudAccountsAPI.GenerateOffice365AuthUrl(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GenerateOffice365AuthUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateOffice365AuthUrl`: AuthUrl
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GenerateOffice365AuthUrl`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGenerateOffice365AuthUrlRequest struct via the builder pattern


### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateSalesforceAuthUrl

> AuthUrl GenerateSalesforceAuthUrl(ctx).Execute()

Generate a Salesforce consent URL



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
	resp, r, err := apiClient.CloudAccountsAPI.GenerateSalesforceAuthUrl(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GenerateSalesforceAuthUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateSalesforceAuthUrl`: AuthUrl
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GenerateSalesforceAuthUrl`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGenerateSalesforceAuthUrlRequest struct via the builder pattern


### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateSlackAuthUrl

> AuthUrl GenerateSlackAuthUrl(ctx).Execute()

Generate a Slack authentication URL



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
	resp, r, err := apiClient.CloudAccountsAPI.GenerateSlackAuthUrl(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GenerateSlackAuthUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateSlackAuthUrl`: AuthUrl
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GenerateSlackAuthUrl`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGenerateSlackAuthUrlRequest struct via the builder pattern


### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAnalyzedRegionStatus

> GetAnalyzedRegionStatus200Response GetAnalyzedRegionStatus(ctx).CloudProvider(cloudProvider).Region(region).Execute()

Get the status of analyzer installation for a region



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
	cloudProvider := openapiclient.CloudServiceProvider("aws") // CloudServiceProvider | The cloud provider for the cloud account
	region := "europe-west1" // string | The region code

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.GetAnalyzedRegionStatus(context.Background()).CloudProvider(cloudProvider).Region(region).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GetAnalyzedRegionStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAnalyzedRegionStatus`: GetAnalyzedRegionStatus200Response
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GetAnalyzedRegionStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAnalyzedRegionStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProvider** | [**CloudServiceProvider**](CloudServiceProvider.md) | The cloud provider for the cloud account | 
 **region** | **string** | The region code | 

### Return type

[**GetAnalyzedRegionStatus200Response**](GetAnalyzedRegionStatus200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAzureAdminConsentStatus

> bool GetAzureAdminConsentStatus(ctx).Execute()

Get Azure admin consent status



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
	resp, r, err := apiClient.CloudAccountsAPI.GetAzureAdminConsentStatus(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GetAzureAdminConsentStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAzureAdminConsentStatus`: bool
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GetAzureAdminConsentStatus`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetAzureAdminConsentStatusRequest struct via the builder pattern


### Return type

**bool**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCloudAccountInstallationStatus

> CloudAccountInstallationStatus GetCloudAccountInstallationStatus(ctx, cloudProvider, cloudAccountId).Execute()

Get the installation status of a cloud account



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
	cloudProvider := openapiclient.CloudServiceProvider("aws") // CloudServiceProvider | The cloud provider of the cloud account
	cloudAccountId := "12345678910" // string | The cloud account identifier

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.GetCloudAccountInstallationStatus(context.Background(), cloudProvider, cloudAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GetCloudAccountInstallationStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCloudAccountInstallationStatus`: CloudAccountInstallationStatus
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GetCloudAccountInstallationStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**cloudProvider** | [**CloudServiceProvider**](.md) | The cloud provider of the cloud account | 
**cloudAccountId** | **string** | The cloud account identifier | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCloudAccountInstallationStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**CloudAccountInstallationStatus**](CloudAccountInstallationStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCompliances

> []Compliance GetCompliances(ctx).Execute()

Get a list of selected compliances



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
	resp, r, err := apiClient.CloudAccountsAPI.GetCompliances(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.GetCompliances``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCompliances`: []Compliance
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.GetCompliances`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetCompliancesRequest struct via the builder pattern


### Return type

[**[]Compliance**](Compliance.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListLinkedAccounts

> []LinkedAccounts ListLinkedAccounts(ctx).Execute()

List cloud accounts connected to Guardium Insights SaaS DSPM



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
	resp, r, err := apiClient.CloudAccountsAPI.ListLinkedAccounts(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.ListLinkedAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListLinkedAccounts`: []LinkedAccounts
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.ListLinkedAccounts`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListLinkedAccountsRequest struct via the builder pattern


### Return type

[**[]LinkedAccounts**](LinkedAccounts.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemoveAccounts

> RemoveAccounts(ctx).AccountIds(accountIds).ServiceProvider(serviceProvider).Execute()

Post cloud account ID connections to be removed



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
	accountIds := []string{"Inner_example"} // []string | 
	serviceProvider := openapiclient.ServiceProvider("aws") // ServiceProvider | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CloudAccountsAPI.RemoveAccounts(context.Background()).AccountIds(accountIds).ServiceProvider(serviceProvider).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.RemoveAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRemoveAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | **[]string** |  | 
 **serviceProvider** | [**ServiceProvider**](ServiceProvider.md) |  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemoveAccountsInstructions

> RemoveAccountsInstructions200Response RemoveAccountsInstructions(ctx).AccountIds(accountIds).ServiceProvider(serviceProvider).Execute()

Post cloud account IDs and get instructions to remove the accounts



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
	accountIds := []string{"Inner_example"} // []string | 
	serviceProvider := openapiclient.ServiceProvider("aws") // ServiceProvider | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.RemoveAccountsInstructions(context.Background()).AccountIds(accountIds).ServiceProvider(serviceProvider).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.RemoveAccountsInstructions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RemoveAccountsInstructions`: RemoveAccountsInstructions200Response
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.RemoveAccountsInstructions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRemoveAccountsInstructionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | **[]string** |  | 
 **serviceProvider** | [**ServiceProvider**](ServiceProvider.md) |  | 

### Return type

[**RemoveAccountsInstructions200Response**](RemoveAccountsInstructions200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveServiceAccountId

> ServiceAccountClientId RetrieveServiceAccountId(ctx).Execute()

Get Google Workspace authentication



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
	resp, r, err := apiClient.CloudAccountsAPI.RetrieveServiceAccountId(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.RetrieveServiceAccountId``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveServiceAccountId`: ServiceAccountClientId
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.RetrieveServiceAccountId`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveServiceAccountIdRequest struct via the builder pattern


### Return type

[**ServiceAccountClientId**](ServiceAccountClientId.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetCompliances

> map[string]interface{} SetCompliances(ctx).Compliance(compliance).Execute()

Set a list of selected compliances



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
	compliance := []openapiclient.Compliance{openapiclient.Compliance("CPRA")} // []Compliance | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.SetCompliances(context.Background()).Compliance(compliance).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.SetCompliances``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetCompliances`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.SetCompliances`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSetCompliancesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compliance** | [**[]Compliance**](Compliance.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SubmitGoogleWorkspaceAdminEmail

> ServiceAccountInstallationStatus SubmitGoogleWorkspaceAdminEmail(ctx).SubmitAdminEmailParams(submitAdminEmailParams).Execute()

Submit email for service account authorization



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
	submitAdminEmailParams := *openapiclient.NewSubmitAdminEmailParams("admin@email.com") // SubmitAdminEmailParams | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.SubmitGoogleWorkspaceAdminEmail(context.Background()).SubmitAdminEmailParams(submitAdminEmailParams).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.SubmitGoogleWorkspaceAdminEmail``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SubmitGoogleWorkspaceAdminEmail`: ServiceAccountInstallationStatus
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.SubmitGoogleWorkspaceAdminEmail`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSubmitGoogleWorkspaceAdminEmailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitAdminEmailParams** | [**SubmitAdminEmailParams**](SubmitAdminEmailParams.md) |  | 

### Return type

[**ServiceAccountInstallationStatus**](ServiceAccountInstallationStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SubmitOffice365TenantInfo

> Office365TenantInfo SubmitOffice365TenantInfo(ctx).TenantInfo(tenantInfo).Execute()

Submit Microsoft 365 customer information



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
	tenantInfo := *openapiclient.NewTenantInfo("1234") // TenantInfo | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.SubmitOffice365TenantInfo(context.Background()).TenantInfo(tenantInfo).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.SubmitOffice365TenantInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SubmitOffice365TenantInfo`: Office365TenantInfo
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.SubmitOffice365TenantInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSubmitOffice365TenantInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantInfo** | [**TenantInfo**](TenantInfo.md) |  | 

### Return type

[**Office365TenantInfo**](Office365TenantInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SubmitSalesforceAuthCode

> SubmitSalesforceAuthCode(ctx).AuthCode(authCode).Execute()

Submit Salesforce customer information



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
	authCode := *openapiclient.NewAuthCode("1234") // AuthCode | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CloudAccountsAPI.SubmitSalesforceAuthCode(context.Background()).AuthCode(authCode).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.SubmitSalesforceAuthCode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSubmitSalesforceAuthCodeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authCode** | [**AuthCode**](AuthCode.md) |  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SubmitSlackAuthCode

> map[string]interface{} SubmitSlackAuthCode(ctx).SubmitAuthCode(submitAuthCode).Execute()

Submit a Slack authentication code



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
	submitAuthCode := *openapiclient.NewSubmitAuthCode("Code_example") // SubmitAuthCode | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CloudAccountsAPI.SubmitSlackAuthCode(context.Background()).SubmitAuthCode(submitAuthCode).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CloudAccountsAPI.SubmitSlackAuthCode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SubmitSlackAuthCode`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `CloudAccountsAPI.SubmitSlackAuthCode`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSubmitSlackAuthCodeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitAuthCode** | [**SubmitAuthCode**](SubmitAuthCode.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

