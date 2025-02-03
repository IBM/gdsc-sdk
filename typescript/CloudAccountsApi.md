# .CloudAccountsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnalyzedRegion**](CloudAccountsApi.md#addAnalyzedRegion) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
[**addCloudAccounts**](CloudAccountsApi.md#addCloudAccounts) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to Guardium Insights SaaS DSPM
[**generateAtlassianConfluenceAuthUrl**](CloudAccountsApi.md#generateAtlassianConfluenceAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
[**generateAtlassianJiraAuthUrl**](CloudAccountsApi.md#generateAtlassianJiraAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
[**generateAzureAuthUrl**](CloudAccountsApi.md#generateAzureAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
[**generateOffice365AuthUrl**](CloudAccountsApi.md#generateOffice365AuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
[**generateSalesforceAuthUrl**](CloudAccountsApi.md#generateSalesforceAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/salesforce/generateAuthUrl | Generate a Salesforce consent URL
[**generateSlackAuthUrl**](CloudAccountsApi.md#generateSlackAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
[**getAnalyzedRegionStatus**](CloudAccountsApi.md#getAnalyzedRegionStatus) | **GET** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
[**getAzureAdminConsentStatus**](CloudAccountsApi.md#getAzureAdminConsentStatus) | **GET** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
[**getCloudAccountInstallationStatus**](CloudAccountsApi.md#getCloudAccountInstallationStatus) | **GET** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
[**getCompliances**](CloudAccountsApi.md#getCompliances) | **GET** /api/v1/dspm/cloudAccounts/compliances | Get a list of selected compliances
[**listLinkedAccounts**](CloudAccountsApi.md#listLinkedAccounts) | **GET** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to Guardium Insights SaaS DSPM
[**removeAccounts**](CloudAccountsApi.md#removeAccounts) | **DELETE** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
[**removeAccountsInstructions**](CloudAccountsApi.md#removeAccountsInstructions) | **GET** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
[**retrieveServiceAccountId**](CloudAccountsApi.md#retrieveServiceAccountId) | **GET** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
[**setCompliances**](CloudAccountsApi.md#setCompliances) | **POST** /api/v1/dspm/cloudAccounts/compliances | Set a list of selected compliances
[**submitGoogleWorkspaceAdminEmail**](CloudAccountsApi.md#submitGoogleWorkspaceAdminEmail) | **POST** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
[**submitOffice365TenantInfo**](CloudAccountsApi.md#submitOffice365TenantInfo) | **POST** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
[**submitSalesforceAuthCode**](CloudAccountsApi.md#submitSalesforceAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/salesforce/submitAuthCodeInfo | Submit Salesforce customer information
[**submitSlackAuthCode**](CloudAccountsApi.md#submitSlackAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code


# **addAnalyzedRegion**
> AddAnalyzedRegion200Response addAnalyzedRegion(addAnalyzedRegionRequest)

Install a new analyzer in the specified region to enable data classification in that region.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiAddAnalyzedRegionRequest = {
  // AddAnalyzedRegionRequest
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

apiInstance.addAnalyzedRegion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium Insights SaaS DSPM for data store discovery.<BR>To enable data classification, run the \'Add a new region for data classification\' API.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiAddCloudAccountsRequest = {
  // AddCloudAccountsRequest
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

apiInstance.addCloudAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateAtlassianConfluenceAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateAtlassianJiraAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGenerateAzureAuthUrlRequest = {
  // string | Tenant Id of the new Azure account, GUID format. (optional)
  tenantId: "tenantId_example",
};

apiInstance.generateAzureAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateOffice365AuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateSalesforceAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateSlackAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **getAnalyzedRegionStatus**
> GetAnalyzedRegionStatus200Response getAnalyzedRegionStatus()

Get the installation status of Guardium Insights SaaS DSPM for a region.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGetAnalyzedRegionStatusRequest = {
  // CloudServiceProvider | The cloud provider for the cloud account
  cloudProvider: "aws",
  // string | The region code
  region: "europe-west1",
};

apiInstance.getAnalyzedRegionStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.getAzureAdminConsentStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGetCloudAccountInstallationStatusRequest = {
  // CloudServiceProvider | The cloud provider of the cloud account
  cloudProvider: "aws",
  // string | The cloud account identifier
  cloudAccountId: "12345678910",
};

apiInstance.getCloudAccountInstallationStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **getCompliances**
> Array<Compliance> getCompliances()

List the compliance frameworks selected.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.getCompliances(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<Compliance>**

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

Get a list of all the connected cloud accounts monitored by Guardium Insights SaaS DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.listLinkedAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

Post cloud account ID connections to be removed from Guardium Insights SaaS DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiRemoveAccountsRequest = {
  // Array<string>
  accountIds: ["1234567891011"],
  // ServiceProvider
  serviceProvider: "aws",
};

apiInstance.removeAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiRemoveAccountsInstructionsRequest = {
  // Array<string>
  accountIds: ["1234567891011"],
  // ServiceProvider
  serviceProvider: "aws",
};

apiInstance.removeAccountsInstructions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.retrieveServiceAccountId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **setCompliances**
> any setCompliances(compliance)

Select one or more compliance frameworks.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSetCompliancesRequest = {
  // Array<Compliance>
  compliance: [
    "CPRA",
  ],
};

apiInstance.setCompliances(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compliance** | **Array<Compliance>**|  |


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

# **submitGoogleWorkspaceAdminEmail**
> ServiceAccountInstallationStatus submitGoogleWorkspaceAdminEmail(submitAdminEmailParams)

Submit admin email for service account authorization and return service-account authorization status.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitGoogleWorkspaceAdminEmailRequest = {
  // SubmitAdminEmailParams
  submitAdminEmailParams: {
    adminEmail: "admin@email.com",
  },
};

apiInstance.submitGoogleWorkspaceAdminEmail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitOffice365TenantInfoRequest = {
  // TenantInfo
  tenantInfo: {
    tenantId: "1234",
  },
};

apiInstance.submitOffice365TenantInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitSalesforceAuthCodeRequest = {
  // AuthCode
  authCode: {
    code: "1234",
  },
};

apiInstance.submitSalesforceAuthCode(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitSlackAuthCodeRequest = {
  // SubmitAuthCode
  submitAuthCode: {
    code: "code_example",
  },
};

apiInstance.submitSlackAuthCode(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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


