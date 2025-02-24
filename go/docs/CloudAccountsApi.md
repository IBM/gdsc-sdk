# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddAnalyzedRegion**](CloudAccountsApi.md#AddAnalyzedRegion) | **Post** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
[**AddCloudAccounts**](CloudAccountsApi.md#AddCloudAccounts) | **Post** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to Guardium Insights SaaS DSPM
[**GenerateAtlassianConfluenceAuthUrl**](CloudAccountsApi.md#GenerateAtlassianConfluenceAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
[**GenerateAtlassianJiraAuthUrl**](CloudAccountsApi.md#GenerateAtlassianJiraAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
[**GenerateAzureAuthUrl**](CloudAccountsApi.md#GenerateAzureAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
[**GenerateOffice365AuthUrl**](CloudAccountsApi.md#GenerateOffice365AuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
[**GenerateSalesforceAuthUrl**](CloudAccountsApi.md#GenerateSalesforceAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/salesforce/generateAuthUrl | Generate a Salesforce consent URL
[**GenerateSlackAuthUrl**](CloudAccountsApi.md#GenerateSlackAuthUrl) | **Get** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
[**GetAnalyzedRegionStatus**](CloudAccountsApi.md#GetAnalyzedRegionStatus) | **Get** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
[**GetAzureAdminConsentStatus**](CloudAccountsApi.md#GetAzureAdminConsentStatus) | **Get** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
[**GetCloudAccountInstallationStatus**](CloudAccountsApi.md#GetCloudAccountInstallationStatus) | **Get** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
[**GetCompliances**](CloudAccountsApi.md#GetCompliances) | **Get** /api/v1/dspm/cloudAccounts/compliances | Get a list of selected compliances
[**ListLinkedAccounts**](CloudAccountsApi.md#ListLinkedAccounts) | **Get** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to Guardium Insights SaaS DSPM
[**RemoveAccounts**](CloudAccountsApi.md#RemoveAccounts) | **Delete** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
[**RemoveAccountsInstructions**](CloudAccountsApi.md#RemoveAccountsInstructions) | **Get** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
[**RetrieveServiceAccountId**](CloudAccountsApi.md#RetrieveServiceAccountId) | **Get** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
[**SetCompliances**](CloudAccountsApi.md#SetCompliances) | **Post** /api/v1/dspm/cloudAccounts/compliances | Set a list of selected compliances
[**SubmitGoogleWorkspaceAdminEmail**](CloudAccountsApi.md#SubmitGoogleWorkspaceAdminEmail) | **Post** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
[**SubmitOffice365TenantInfo**](CloudAccountsApi.md#SubmitOffice365TenantInfo) | **Post** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
[**SubmitSalesforceAuthCode**](CloudAccountsApi.md#SubmitSalesforceAuthCode) | **Post** /api/v1/dspm/cloudAccounts/saasApps/salesforce/submitAuthCodeInfo | Submit Salesforce customer information
[**SubmitSlackAuthCode**](CloudAccountsApi.md#SubmitSlackAuthCode) | **Post** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code

# **AddAnalyzedRegion**
> AddAnalyzedRegion200Response AddAnalyzedRegion(ctx, body)
Add a new region for data classification

Install a new analyzer in the specified region to enable data classification in that region.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**AddAnalyzedRegionRequest**](AddAnalyzedRegionRequest.md)|  | 

### Return type

[**AddAnalyzedRegion200Response**](addAnalyzedRegion_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddCloudAccounts**
> AddCloudAccounts200Response AddCloudAccounts(ctx, body)
Add cloud account connections to Guardium Insights SaaS DSPM

You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium Insights SaaS DSPM for data store discovery.<BR>To enable data classification, run the 'Add a new region for data classification' API.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**AddCloudAccountsRequest**](AddCloudAccountsRequest.md)|  | 

### Return type

[**AddCloudAccounts200Response**](addCloudAccounts_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GenerateAtlassianConfluenceAuthUrl**
> AuthUrl GenerateAtlassianConfluenceAuthUrl(ctx, )
Generate a Confluence authentication URL

Generate an Atlassian authentication URL for Confluence integration.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GenerateAtlassianJiraAuthUrl**
> AuthUrl GenerateAtlassianJiraAuthUrl(ctx, )
Generate a JIRA authentication URL

Generate an Atlassian authentication URL for JIRA integration.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GenerateAzureAuthUrl**
> AuthUrl GenerateAzureAuthUrl(ctx, optional)
Generate azure authorization url

Generate azure authorization url.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***CloudAccountsApiGenerateAzureAuthUrlOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CloudAccountsApiGenerateAzureAuthUrlOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **optional.String**| Tenant Id of the new Azure account, GUID format. | 

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GenerateOffice365AuthUrl**
> AuthUrl GenerateOffice365AuthUrl(ctx, )
Generate a Microsoft 365 consent URL

Generate an administrator consent URL for Microsoft 365 integration.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GenerateSalesforceAuthUrl**
> AuthUrl GenerateSalesforceAuthUrl(ctx, )
Generate a Salesforce consent URL

Generate an administrator consent URL for Salesforce integration.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GenerateSlackAuthUrl**
> AuthUrl GenerateSlackAuthUrl(ctx, )
Generate a Slack authentication URL

Generate a Slack authentication URL.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAnalyzedRegionStatus**
> GetAnalyzedRegionStatus200Response GetAnalyzedRegionStatus(ctx, cloudProvider, region)
Get the status of analyzer installation for a region

Get the installation status of Guardium Insights SaaS DSPM for a region.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **cloudProvider** | [**CloudServiceProvider**](.md)| The cloud provider for the cloud account | 
  **region** | **string**| The region code | 

### Return type

[**GetAnalyzedRegionStatus200Response**](getAnalyzedRegionStatus_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAzureAdminConsentStatus**
> bool GetAzureAdminConsentStatus(ctx, )
Get Azure admin consent status

Get Azure admin consent status.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**bool**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCloudAccountInstallationStatus**
> CloudAccountInstallationStatus GetCloudAccountInstallationStatus(ctx, cloudProvider, cloudAccountId)
Get the installation status of a cloud account

Get the installation status of a cloud account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **cloudProvider** | [**CloudServiceProvider**](.md)| The cloud provider of the cloud account | 
  **cloudAccountId** | **string**| The cloud account identifier | 

### Return type

[**CloudAccountInstallationStatus**](CloudAccountInstallationStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCompliances**
> []Compliance GetCompliances(ctx, )
Get a list of selected compliances

List the compliance frameworks selected.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]Compliance**](array.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListLinkedAccounts**
> []LinkedAccounts ListLinkedAccounts(ctx, )
List cloud accounts connected to Guardium Insights SaaS DSPM

Get a list of all the connected cloud accounts monitored by Guardium Insights SaaS DSPM.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]LinkedAccounts**](LinkedAccounts.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RemoveAccounts**
> RemoveAccounts(ctx, accountIds, serviceProvider)
Post cloud account ID connections to be removed

Post cloud account ID connections to be removed from Guardium Insights SaaS DSPM.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accountIds** | [**[]string**](string.md)|  | 
  **serviceProvider** | [**ServiceProvider**](.md)|  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RemoveAccountsInstructions**
> RemoveAccountsInstructions200Response RemoveAccountsInstructions(ctx, accountIds, serviceProvider)
Post cloud account IDs and get instructions to remove the accounts

Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accountIds** | [**[]string**](string.md)|  | 
  **serviceProvider** | [**ServiceProvider**](.md)|  | 

### Return type

[**RemoveAccountsInstructions200Response**](removeAccountsInstructions_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RetrieveServiceAccountId**
> ServiceAccountClientId RetrieveServiceAccountId(ctx, )
Get Google Workspace authentication

Retrieve a service account ID to use it for Google Workspace authentication.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceAccountClientId**](ServiceAccountClientId.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SetCompliances**
> interface{} SetCompliances(ctx, body)
Set a list of selected compliances

Select one or more compliance frameworks.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**[]Compliance**](Compliance.md)|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SubmitGoogleWorkspaceAdminEmail**
> ServiceAccountInstallationStatus SubmitGoogleWorkspaceAdminEmail(ctx, body)
Submit email for service account authorization

Submit admin email for service account authorization and return service-account authorization status.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**SubmitAdminEmailParams**](SubmitAdminEmailParams.md)|  | 

### Return type

[**ServiceAccountInstallationStatus**](ServiceAccountInstallationStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SubmitOffice365TenantInfo**
> Office365TenantInfo SubmitOffice365TenantInfo(ctx, body)
Submit Microsoft 365 customer information

Submit customer information for Microsoft 365 integration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**TenantInfo**](TenantInfo.md)|  | 

### Return type

[**Office365TenantInfo**](Office365TenantInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SubmitSalesforceAuthCode**
> SubmitSalesforceAuthCode(ctx, body)
Submit Salesforce customer information

Submit customer information for Salesforce integration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**AuthCode**](AuthCode.md)|  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SubmitSlackAuthCode**
> interface{} SubmitSlackAuthCode(ctx, body)
Submit a Slack authentication code

Submit a Slack authentication code.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**SubmitAuthCode**](SubmitAuthCode.md)|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

