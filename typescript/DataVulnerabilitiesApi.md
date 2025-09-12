# .DataVulnerabilitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#addVulnerabilityStatusComment) | **POST** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
[**getVulnerabilitiesSummary**](DataVulnerabilitiesApi.md#getVulnerabilitiesSummary) | **GET** /api/v2/dspm/vulnerabilities/summary | Get vulnerabilities summary
[**getVulnerability**](DataVulnerabilitiesApi.md#getVulnerability) | **GET** /api/v2/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
[**listVulnerabilities**](DataVulnerabilitiesApi.md#listVulnerabilities) | **GET** /api/v2/dspm/vulnerabilities | List vulnerabilities based on an applied filter
[**listVulnerabilitiesByDataStore**](DataVulnerabilitiesApi.md#listVulnerabilitiesByDataStore) | **GET** /api/v2/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
[**removeVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#removeVulnerabilityStatusComment) | **DELETE** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
[**setVulnerabilityStatus**](DataVulnerabilitiesApi.md#setVulnerabilityStatus) | **POST** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
[**updateVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#updateVulnerabilityStatusComment) | **PUT** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status


# **addVulnerabilityStatusComment**
> VulnerabilityStatus addVulnerabilityStatusComment(addCommentBody)

Add or update the status comment of a vulnerability status to keep track of the workflow progress.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiAddVulnerabilityStatusCommentRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
  // string
  statusId: "statusId_example",
  // AddCommentBody
  addCommentBody: {
    comment: "comment_example",
  },
};

apiInstance.addVulnerabilityStatusComment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addCommentBody** | **AddCommentBody**|  |
 **vulnerabilityId** | [**string**] |  | defaults to undefined
 **statusId** | [**string**] |  | defaults to undefined


### Return type

**VulnerabilityStatus**

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

# **getVulnerabilitiesSummary**
> VulnerabilitiesSummary getVulnerabilitiesSummary()

Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility\'s type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiGetVulnerabilitiesSummaryRequest = {
  // VulnerabilitiesFilterOptions (optional)
  filter: null,
};

apiInstance.getVulnerabilitiesSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **VulnerabilitiesFilterOptions** |  | (optional) defaults to undefined


### Return type

**VulnerabilitiesSummary**

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

# **getVulnerability**
> Vulnerability getVulnerability()

Get vulnerability details by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiGetVulnerabilityRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
};

apiInstance.getVulnerability(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | [**string**] |  | defaults to undefined


### Return type

**Vulnerability**

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

# **listVulnerabilities**
> ListVulnerabilities200Response listVulnerabilities()

Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiListVulnerabilitiesRequest = {
  // VulnerabilitiesFilterOptions (optional)
  filter: null,
  // ListVulnerabilitiesSortParameter (optional)
  sort: {
    sortBy: "criticality",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listVulnerabilities(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **VulnerabilitiesFilterOptions** |  | (optional) defaults to undefined
 **sort** | **ListVulnerabilitiesSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListVulnerabilities200Response**

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

# **listVulnerabilitiesByDataStore**
> ListVulnerabilitiesByDataStore200Response listVulnerabilitiesByDataStore()

Get a list of all the vulnerabilities of data stores.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiListVulnerabilitiesByDataStoreRequest = {
  // VulnerabilitiesByDataStoreFilterOptions (optional)
  filter: null,
  // ListVulnerabilitiesByDataStoreSortParameter (optional)
  sort: {
    sortBy: "vulnerabilitiesCount",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listVulnerabilitiesByDataStore(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **VulnerabilitiesByDataStoreFilterOptions** |  | (optional) defaults to undefined
 **sort** | **ListVulnerabilitiesByDataStoreSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListVulnerabilitiesByDataStore200Response**

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

# **removeVulnerabilityStatusComment**
> void removeVulnerabilityStatusComment()

Delete a status comment of a vulnerability status.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiRemoveVulnerabilityStatusCommentRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
  // string
  statusId: "statusId_example",
  // string
  commentId: "commentId_example",
};

apiInstance.removeVulnerabilityStatusComment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | [**string**] |  | defaults to undefined
 **statusId** | [**string**] |  | defaults to undefined
 **commentId** | [**string**] |  | defaults to undefined


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
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **setVulnerabilityStatus**
> VulnerabilityStatus setVulnerabilityStatus(setVulnerabilityStatusRequest)

Add or update the status of a vulnerability to track its progress.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiSetVulnerabilityStatusRequest = {
  // string
  vulnerabilityId: "vulnerabilityId_example",
  // SetVulnerabilityStatusRequest
  setVulnerabilityStatusRequest: {
    status: "review",
  },
};

apiInstance.setVulnerabilityStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setVulnerabilityStatusRequest** | **SetVulnerabilityStatusRequest**|  |
 **vulnerabilityId** | [**string**] |  | defaults to undefined


### Return type

**VulnerabilityStatus**

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

# **updateVulnerabilityStatusComment**
> VulnerabilityStatusComment updateVulnerabilityStatusComment(updateCommentBody)

Set a vulnerability status of a vulnerability.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiUpdateVulnerabilityStatusCommentRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
  // string
  statusId: "statusId_example",
  // string
  commentId: "commentId_example",
  // UpdateCommentBody
  updateCommentBody: {
    comment: "comment_example",
  },
};

apiInstance.updateVulnerabilityStatusComment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCommentBody** | **UpdateCommentBody**|  |
 **vulnerabilityId** | [**string**] |  | defaults to undefined
 **statusId** | [**string**] |  | defaults to undefined
 **commentId** | [**string**] |  | defaults to undefined


### Return type

**VulnerabilityStatusComment**

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


