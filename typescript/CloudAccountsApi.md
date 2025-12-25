# .CloudAccountsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnalyzedRegion**](CloudAccountsApi.md#addAnalyzedRegion) | **POST** /api/v2/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
[**addCloudAccounts**](CloudAccountsApi.md#addCloudAccounts) | **POST** /api/v2/dspm/cloudAccounts/cloudProviders | Add cloud account connections to DSPM
[**generateAtlassianConfluenceAuthUrl**](CloudAccountsApi.md#generateAtlassianConfluenceAuthUrl) | **GET** /api/v2/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
[**generateAtlassianJiraAuthUrl**](CloudAccountsApi.md#generateAtlassianJiraAuthUrl) | **GET** /api/v2/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
[**generateAzureAuthUrl**](CloudAccountsApi.md#generateAzureAuthUrl) | **GET** /api/v2/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
[**generateOffice365AuthUrl**](CloudAccountsApi.md#generateOffice365AuthUrl) | **GET** /api/v2/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
[**generateSalesforceAuthUrl**](CloudAccountsApi.md#generateSalesforceAuthUrl) | **GET** /api/v2/dspm/cloudAccounts/saasApps/salesforce/generateAuthUrl | Generate a Salesforce consent URL
[**generateSlackAuthUrl**](CloudAccountsApi.md#generateSlackAuthUrl) | **GET** /api/v2/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
[**generateSnowflakeAuthUrl**](CloudAccountsApi.md#generateSnowflakeAuthUrl) | **POST** /api/v2/dspm/cloudAccounts/saasApps/snowflake/generateAuthUrl | Validate and Generate a Snowflake OAuth URL
[**getAnalyzedRegionStatus**](CloudAccountsApi.md#getAnalyzedRegionStatus) | **GET** /api/v2/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
[**getAzureAdminConsentStatus**](CloudAccountsApi.md#getAzureAdminConsentStatus) | **GET** /api/v2/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
[**getCloudAccountInstallationStatus**](CloudAccountsApi.md#getCloudAccountInstallationStatus) | **GET** /api/v2/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
[**getDatabaseMetadata**](CloudAccountsApi.md#getDatabaseMetadata) | **POST** /api/v2/dspm/cloudAccounts/saasApps/snowflake/getDatabaseMetadata | Get the metadata details of snowflake database.
[**getRefreshTokenExpiry**](CloudAccountsApi.md#getRefreshTokenExpiry) | **GET** /api/v2/dspm/cloudAccounts/saasApps/snowflake/getRefreshTokenExpiry/{providerId} | Get Snowflake Refresh Token Expiry date
[**listLinkedAccounts**](CloudAccountsApi.md#listLinkedAccounts) | **GET** /api/v2/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to DSPM
[**removeAccounts**](CloudAccountsApi.md#removeAccounts) | **DELETE** /api/v2/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
[**removeAccountsInstructions**](CloudAccountsApi.md#removeAccountsInstructions) | **GET** /api/v2/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
[**retrieveServiceAccountId**](CloudAccountsApi.md#retrieveServiceAccountId) | **GET** /api/v2/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
[**snowflakeIntegrationScript**](CloudAccountsApi.md#snowflakeIntegrationScript) | **GET** /api/v2/dspm/cloudAccounts/saasApps/snowflake/snowflakeIntegrationScript | Generate Snowflake Integration Script
[**submitGoogleWorkspaceAdminEmail**](CloudAccountsApi.md#submitGoogleWorkspaceAdminEmail) | **POST** /api/v2/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
[**submitOffice365TenantInfo**](CloudAccountsApi.md#submitOffice365TenantInfo) | **POST** /api/v2/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
[**submitSalesforceAuthCode**](CloudAccountsApi.md#submitSalesforceAuthCode) | **POST** /api/v2/dspm/cloudAccounts/saasApps/salesforce/submitAuthCodeInfo | Submit Salesforce customer information
[**submitSlackAuthCode**](CloudAccountsApi.md#submitSlackAuthCode) | **POST** /api/v2/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code
[**submitSnowflakeAuthCode**](CloudAccountsApi.md#submitSnowflakeAuthCode) | **POST** /api/v2/dspm/cloudAccounts/saasApps/snowflake/submitAuthCode | Submit Snowflake oAuth code


# **addAnalyzedRegion**
> AddAnalyzedRegion200Response addAnalyzedRegion(addAnalyzedRegionRequest)

Install a new analyzer in the specified region to enable data classification in that region.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiAddAnalyzedRegionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiAddAnalyzedRegionRequest = {
  
  addAnalyzedRegionRequest: {
    cloudProvider: "aws",
    region: "europe-west1",
    regions: [
      "regions_example",
    ],
    customerTags: [
      {
        key: "Owner",
        value: "polarsec",
      },
    ],
  },
};

const data = await apiInstance.addAnalyzedRegion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addAnalyzedRegionRequest** | **AddAnalyzedRegionRequest**|  |


### Return type

**AddAnalyzedRegion200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **addCloudAccounts**
> AddCloudAccounts200Response addCloudAccounts(addCloudAccountsRequest)

You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the \'Add a new region for data classification\' API.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiAddCloudAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiAddCloudAccountsRequest = {
  
  addCloudAccountsRequest: {
    cloudProvider: "aws",
    cloudAccounts: [
      {
        cloudAccountId: "123456789101",
        cloudAccountName: "my cloud account name",
        environment: "development",
      },
    ],
    mainAccountId: "mainAccountId_example",
  },
};

const data = await apiInstance.addCloudAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addCloudAccountsRequest** | **AddCloudAccountsRequest**|  |


### Return type

**AddCloudAccounts200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateAtlassianConfluenceAuthUrl**
> AuthUrl generateAtlassianConfluenceAuthUrl()

Generate an Atlassian authentication URL for Confluence integration.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.generateAtlassianConfluenceAuthUrl(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateAtlassianJiraAuthUrl**
> AuthUrl generateAtlassianJiraAuthUrl()

Generate an Atlassian authentication URL for JIRA integration.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.generateAtlassianJiraAuthUrl(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateAzureAuthUrl**
> AuthUrl generateAzureAuthUrl()

Generate azure authorization url.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiGenerateAzureAuthUrlRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiGenerateAzureAuthUrlRequest = {
    // Tenant Id of the new Azure account, GUID format. (optional)
  tenantId: "tenantId_example",
};

const data = await apiInstance.generateAzureAuthUrl(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant Id of the new Azure account, GUID format. | (optional) defaults to undefined


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateOffice365AuthUrl**
> AuthUrl generateOffice365AuthUrl()

Generate an administrator consent URL for Microsoft 365 integration.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.generateOffice365AuthUrl(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateSalesforceAuthUrl**
> AuthUrl generateSalesforceAuthUrl()

Generate an administrator consent URL for Salesforce integration.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.generateSalesforceAuthUrl(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateSlackAuthUrl**
> AuthUrl generateSlackAuthUrl()

Generate a Slack authentication URL.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.generateSlackAuthUrl(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateSnowflakeAuthUrl**
> AuthUrl generateSnowflakeAuthUrl(clientInfo)

Generate an administrator consent URL for Snowflake integration.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiGenerateSnowflakeAuthUrlRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiGenerateSnowflakeAuthUrlRequest = {
  
  clientInfo: {
    clientId: "clientId_example",
    clientSecret: "clientSecret_example",
    authEndpoint: "authEndpoint_example",
  },
};

const data = await apiInstance.generateSnowflakeAuthUrl(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientInfo** | **ClientInfo**|  |


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getAnalyzedRegionStatus**
> GetAnalyzedRegionStatus200Response getAnalyzedRegionStatus()

Get the installation status of Guardium DSPM for a region.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiGetAnalyzedRegionStatusRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiGetAnalyzedRegionStatusRequest = {
    // The cloud provider for the cloud account
  cloudProvider: "aws",
    // The region code
  region: "europe-west1",
};

const data = await apiInstance.getAnalyzedRegionStatus(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProvider** | **CloudServiceProvider** | The cloud provider for the cloud account | defaults to undefined
 **region** | [**string**] | The region code | defaults to undefined


### Return type

**GetAnalyzedRegionStatus200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getAzureAdminConsentStatus**
> boolean getAzureAdminConsentStatus()

Get Azure admin consent status.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.getAzureAdminConsentStatus(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**boolean**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | true if the customer has granted admin permissions, false otherwise |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getCloudAccountInstallationStatus**
> CloudAccountInstallationStatus getCloudAccountInstallationStatus()

Get the installation status of a cloud account.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiGetCloudAccountInstallationStatusRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiGetCloudAccountInstallationStatusRequest = {
    // The cloud provider of the cloud account
  cloudProvider: "aws",
    // The cloud account identifier
  cloudAccountId: "12345678910",
};

const data = await apiInstance.getCloudAccountInstallationStatus(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProvider** | **CloudServiceProvider** | The cloud provider of the cloud account | defaults to undefined
 **cloudAccountId** | [**string**] | The cloud account identifier | defaults to undefined


### Return type

**CloudAccountInstallationStatus**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getDatabaseMetadata**
> DBMetadataInfo getDatabaseMetadata(dbInfo)

Get the metadata details of snowflake database from saas-asset-store.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiGetDatabaseMetadataRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiGetDatabaseMetadataRequest = {
  
  dbInfo: {
    dataStoreId: "dataStoreId_example",
  },
};

const data = await apiInstance.getDatabaseMetadata(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbInfo** | **DbInfo**|  |


### Return type

**DBMetadataInfo**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getRefreshTokenExpiry**
> TokenExpiryInfo getRefreshTokenExpiry()

Get Snowflake Refresh Token Expiry date.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiGetRefreshTokenExpiryRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiGetRefreshTokenExpiryRequest = {
    // The ID of the provider
  providerId: "providerId_example",
};

const data = await apiInstance.getRefreshTokenExpiry(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | [**string**] | The ID of the provider | defaults to undefined


### Return type

**TokenExpiryInfo**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listLinkedAccounts**
> Array<LinkedAccounts> listLinkedAccounts()

Get a list of all the connected cloud accounts monitored by Guardium DSPM.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.listLinkedAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<LinkedAccounts>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **removeAccounts**
> void removeAccounts()

Post cloud account ID connections to be removed from Guardium DSPM.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiRemoveAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiRemoveAccountsRequest = {
  
  accountIds: ["1234567891011"],
  
  serviceProvider: "aws",
};

const data = await apiInstance.removeAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | **Array&lt;string&gt;** |  | defaults to undefined
 **serviceProvider** | **ServiceProvider** |  | defaults to undefined


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **removeAccountsInstructions**
> RemoveAccountsInstructions200Response removeAccountsInstructions()

Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiRemoveAccountsInstructionsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiRemoveAccountsInstructionsRequest = {
  
  accountIds: ["1234567891011"],
  
  serviceProvider: "aws",
};

const data = await apiInstance.removeAccountsInstructions(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | **Array&lt;string&gt;** |  | defaults to undefined
 **serviceProvider** | **ServiceProvider** |  | defaults to undefined


### Return type

**RemoveAccountsInstructions200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | string |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveServiceAccountId**
> ServiceAccountClientId retrieveServiceAccountId()

Retrieve a service account ID to use it for Google Workspace authentication.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.retrieveServiceAccountId(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ServiceAccountClientId**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **snowflakeIntegrationScript**
> Script snowflakeIntegrationScript()

Generate Snowflake integration Script.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request = {};

const data = await apiInstance.snowflakeIntegrationScript(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Script**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitGoogleWorkspaceAdminEmail**
> ServiceAccountInstallationStatus submitGoogleWorkspaceAdminEmail(submitAdminEmailParams)

Submit admin email for service account authorization and return service-account authorization status.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiSubmitGoogleWorkspaceAdminEmailRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiSubmitGoogleWorkspaceAdminEmailRequest = {
  
  submitAdminEmailParams: {
    adminEmail: "admin@email.com",
  },
};

const data = await apiInstance.submitGoogleWorkspaceAdminEmail(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitAdminEmailParams** | **SubmitAdminEmailParams**|  |


### Return type

**ServiceAccountInstallationStatus**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitOffice365TenantInfo**
> Office365TenantInfo submitOffice365TenantInfo(tenantInfo)

Submit customer information for Microsoft 365 integration.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiSubmitOffice365TenantInfoRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiSubmitOffice365TenantInfoRequest = {
  
  tenantInfo: {
    tenantId: "1234",
  },
};

const data = await apiInstance.submitOffice365TenantInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantInfo** | **TenantInfo**|  |


### Return type

**Office365TenantInfo**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitSalesforceAuthCode**
> void submitSalesforceAuthCode(authCode)

Submit customer information for Salesforce integration.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiSubmitSalesforceAuthCodeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiSubmitSalesforceAuthCodeRequest = {
  
  authCode: {
    code: "1234",
  },
};

const data = await apiInstance.submitSalesforceAuthCode(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authCode** | **AuthCode**|  |


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitSlackAuthCode**
> any submitSlackAuthCode(submitAuthCode)

Submit a Slack authentication code.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiSubmitSlackAuthCodeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiSubmitSlackAuthCodeRequest = {
  
  submitAuthCode: {
    code: "code_example",
  },
};

const data = await apiInstance.submitSlackAuthCode(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitAuthCode** | **SubmitAuthCode**|  |


### Return type

**any**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitSnowflakeAuthCode**
> void submitSnowflakeAuthCode(authInfo)

Storing code that is returned from Snowflake oAuth.

### Example


```typescript
import { createConfiguration, CloudAccountsApi } from '';
import type { CloudAccountsApiSubmitSnowflakeAuthCodeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CloudAccountsApi(configuration);

const request: CloudAccountsApiSubmitSnowflakeAuthCodeRequest = {
  
  authInfo: {
    code: "1234",
    providerId: "1234",
  },
};

const data = await apiInstance.submitSnowflakeAuthCode(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authInfo** | **AuthInfo**|  |


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


