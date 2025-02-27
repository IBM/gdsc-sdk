# CloudAccountsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnalyzedRegion**](CloudAccountsApi.md#addAnalyzedRegion) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
[**addCloudAccounts**](CloudAccountsApi.md#addCloudAccounts) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to DSPM
[**generateAtlassianConfluenceAuthUrl**](CloudAccountsApi.md#generateAtlassianConfluenceAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
[**generateAtlassianJiraAuthUrl**](CloudAccountsApi.md#generateAtlassianJiraAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
[**generateAzureAuthUrl**](CloudAccountsApi.md#generateAzureAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
[**generateOffice365AuthUrl**](CloudAccountsApi.md#generateOffice365AuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
[**generateSlackAuthUrl**](CloudAccountsApi.md#generateSlackAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
[**generateSnowflakeAuthUrl**](CloudAccountsApi.md#generateSnowflakeAuthUrl) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/generateAuthUrl | Validate and Generate a Snowflake OAuth URL
[**getAnalyzedRegionStatus**](CloudAccountsApi.md#getAnalyzedRegionStatus) | **GET** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
[**getAzureAdminConsentStatus**](CloudAccountsApi.md#getAzureAdminConsentStatus) | **GET** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
[**getCloudAccountInstallationStatus**](CloudAccountsApi.md#getCloudAccountInstallationStatus) | **GET** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
[**getRefreshTokenExpiry**](CloudAccountsApi.md#getRefreshTokenExpiry) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/getRefreshTokenExpiry/{providerId} | Get Snowflake Refresh Token Expiry date
[**listLinkedAccounts**](CloudAccountsApi.md#listLinkedAccounts) | **GET** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to DSPM
[**removeAccounts**](CloudAccountsApi.md#removeAccounts) | **DELETE** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
[**removeAccountsInstructions**](CloudAccountsApi.md#removeAccountsInstructions) | **GET** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
[**retrieveServiceAccountId**](CloudAccountsApi.md#retrieveServiceAccountId) | **GET** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
[**snowflakeIntegrationScript**](CloudAccountsApi.md#snowflakeIntegrationScript) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/snowflakeIntegrationScript | Generate Snowflake Integration Script
[**submitGoogleWorkspaceAdminEmail**](CloudAccountsApi.md#submitGoogleWorkspaceAdminEmail) | **POST** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
[**submitOffice365TenantInfo**](CloudAccountsApi.md#submitOffice365TenantInfo) | **POST** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
[**submitSlackAuthCode**](CloudAccountsApi.md#submitSlackAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code
[**submitSnowflakeAuthCode**](CloudAccountsApi.md#submitSnowflakeAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/submitAuthCode | Submit Snowflake oAuth code



## addAnalyzedRegion

Add a new region for data classification

Install a new analyzer in the specified region to enable data classification in that region.

### Example

```bash
 addAnalyzedRegion
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## addCloudAccounts

Add cloud account connections to DSPM

You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the 'Add a new region for data classification' API.

### Example

```bash
 addCloudAccounts
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateAtlassianConfluenceAuthUrl

Generate a Confluence authentication URL

Generate an Atlassian authentication URL for Confluence integration.

### Example

```bash
 generateAtlassianConfluenceAuthUrl
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateAtlassianJiraAuthUrl

Generate a JIRA authentication URL

Generate an Atlassian authentication URL for JIRA integration.

### Example

```bash
 generateAtlassianJiraAuthUrl
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateAzureAuthUrl

Generate azure authorization url

Generate azure authorization url.

### Example

```bash
 generateAzureAuthUrl  tenantId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant Id of the new Azure account, GUID format. | [optional] [default to null]

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateOffice365AuthUrl

Generate a Microsoft 365 consent URL

Generate an administrator consent URL for Microsoft 365 integration.

### Example

```bash
 generateOffice365AuthUrl
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateSlackAuthUrl

Generate a Slack authentication URL

Generate a Slack authentication URL.

### Example

```bash
 generateSlackAuthUrl
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateSnowflakeAuthUrl

Validate and Generate a Snowflake OAuth URL

Generate an administrator consent URL for Snowflake integration.

### Example

```bash
 generateSnowflakeAuthUrl
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientInfo** | [**ClientInfo**](ClientInfo.md) |  |

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAnalyzedRegionStatus

Get the status of analyzer installation for a region

Get the installation status of Guardium DSPM for a region.

### Example

```bash
 getAnalyzedRegionStatus  cloudProvider=value  region=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProvider** | [**CloudServiceProvider**](.md) | The cloud provider for the cloud account | [default to null]
 **region** | **string** | The region code | [default to null]

### Return type

[**GetAnalyzedRegionStatus200Response**](GetAnalyzedRegionStatus200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAzureAdminConsentStatus

Get Azure admin consent status

Get Azure admin consent status.

### Example

```bash
 getAzureAdminConsentStatus
```

### Parameters

This endpoint does not need any parameter.

### Return type

**boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCloudAccountInstallationStatus

Get the installation status of a cloud account

Get the installation status of a cloud account.

### Example

```bash
 getCloudAccountInstallationStatus cloudProvider=value cloudAccountId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProvider** | [**CloudServiceProvider**](.md) | The cloud provider of the cloud account | [default to null]
 **cloudAccountId** | **string** | The cloud account identifier | [default to null]

### Return type

[**CloudAccountInstallationStatus**](CloudAccountInstallationStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getRefreshTokenExpiry

Get Snowflake Refresh Token Expiry date

Get Snowflake Refresh Token Expiry date.

### Example

```bash
 getRefreshTokenExpiry providerId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **string** | The ID of the provider | [default to null]

### Return type

[**TokenExpiryInfo**](TokenExpiryInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listLinkedAccounts

List cloud accounts connected to DSPM

Get a list of all the connected cloud accounts monitored by Guardium DSPM.

### Example

```bash
 listLinkedAccounts
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**array[LinkedAccounts]**](LinkedAccounts.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## removeAccounts

Post cloud account ID connections to be removed

Post cloud account ID connections to be removed from Guardium DSPM.

### Example

```bash
 removeAccounts  Specify as:  accountIds=value1 accountIds=value2 accountIds=...  serviceProvider=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | [**array[string]**](string.md) |  | [default to null]
 **serviceProvider** | [**ServiceProvider**](.md) |  | [default to null]

### Return type

(empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## removeAccountsInstructions

Post cloud account IDs and get instructions to remove the accounts

Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.

### Example

```bash
 removeAccountsInstructions  Specify as:  accountIds=value1 accountIds=value2 accountIds=...  serviceProvider=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | [**array[string]**](string.md) |  | [default to null]
 **serviceProvider** | [**ServiceProvider**](.md) |  | [default to null]

### Return type

[**RemoveAccountsInstructions200Response**](RemoveAccountsInstructions200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieveServiceAccountId

Get Google Workspace authentication

Retrieve a service account ID to use it for Google Workspace authentication.

### Example

```bash
 retrieveServiceAccountId
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServiceAccountClientId**](ServiceAccountClientId.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## snowflakeIntegrationScript

Generate Snowflake Integration Script

Generate Snowflake integration Script.

### Example

```bash
 snowflakeIntegrationScript
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Script**](Script.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## submitGoogleWorkspaceAdminEmail

Submit email for service account authorization

Submit admin email for service account authorization and return service-account authorization status.

### Example

```bash
 submitGoogleWorkspaceAdminEmail
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## submitOffice365TenantInfo

Submit Microsoft 365 customer information

Submit customer information for Microsoft 365 integration.

### Example

```bash
 submitOffice365TenantInfo
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## submitSlackAuthCode

Submit a Slack authentication code

Submit a Slack authentication code.

### Example

```bash
 submitSlackAuthCode
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitAuthCode** | [**SubmitAuthCode**](SubmitAuthCode.md) |  |

### Return type

**map**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## submitSnowflakeAuthCode

Submit Snowflake oAuth code

Storing code that is returned from Snowflake oAuth.

### Example

```bash
 submitSnowflakeAuthCode
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authInfo** | [**AuthInfo**](AuthInfo.md) |  |

### Return type

(empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

