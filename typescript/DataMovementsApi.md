# .DataMovementsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActualFlow**](DataMovementsApi.md#getActualFlow) | **GET** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
[**getActualFlowsSummary**](DataMovementsApi.md#getActualFlowsSummary) | **GET** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
[**getPotentialFlow**](DataMovementsApi.md#getPotentialFlow) | **GET** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
[**getPotentialFlowPath**](DataMovementsApi.md#getPotentialFlowPath) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
[**getPotentialFlowsSummary**](DataMovementsApi.md#getPotentialFlowsSummary) | **GET** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
[**listActualFlowPaths**](DataMovementsApi.md#listActualFlowPaths) | **GET** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
[**listActualFlows**](DataMovementsApi.md#listActualFlows) | **GET** /api/v1/dspm/dataMovements/actualFlows | List actual flows
[**listPotentialFlows**](DataMovementsApi.md#listPotentialFlows) | **GET** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
[**listPotentialFlowsPaths**](DataMovementsApi.md#listPotentialFlowsPaths) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths


# **getActualFlow**
> ActualFlow getActualFlow()

Get a detailed information about an actual flow by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetActualFlowRequest = {
  // string
  id: "id_example",
};

apiInstance.getActualFlow(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] |  | defaults to undefined


### Return type

**ActualFlow**

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

# **getActualFlowsSummary**
> ActualFlowsSummary getActualFlowsSummary()

Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetActualFlowsSummaryRequest = {
  // ListActualFlowsFilterParameter (optional)
  filter: null,
};

apiInstance.getActualFlowsSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListActualFlowsFilterParameter** |  | (optional) defaults to undefined


### Return type

**ActualFlowsSummary**

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

# **getPotentialFlow**
> PotentialFlow getPotentialFlow()

Get a detailed information about a potential flow by providing the flow ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetPotentialFlowRequest = {
  // string
  flowId: "ff2b4abe-89f4-62b8-061e-1232456789",
};

apiInstance.getPotentialFlow(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | [**string**] |  | defaults to undefined


### Return type

**PotentialFlow**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**404** | potential flow not found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getPotentialFlowPath**
> PotentialFlowPath getPotentialFlowPath()

Get details of a specific potential flow of data by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetPotentialFlowPathRequest = {
  // string
  flowPathId: "ff2b4abe-89f4-62b8-061e-12345678910",
};

apiInstance.getPotentialFlowPath(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowPathId** | [**string**] |  | defaults to undefined


### Return type

**PotentialFlowPath**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**404** | potential flow path not found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getPotentialFlowsSummary**
> PotentialFlowsSummary getPotentialFlowsSummary()

Get a summary of all the potential flows based on a filter applied.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetPotentialFlowsSummaryRequest = {
  // PotentialFlowsFilterOptions (optional)
  filter: null,
};

apiInstance.getPotentialFlowsSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **PotentialFlowsFilterOptions** |  | (optional) defaults to undefined


### Return type

**PotentialFlowsSummary**

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

# **listActualFlowPaths**
> ListActualFlowPaths200Response listActualFlowPaths()

Get detailed information about the actual flows according to the filter applied.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListActualFlowPathsRequest = {
  // ListActualFlowPathsSortParameter (optional)
  sort: {
    sortBy: "lastSeen",
    sortOrder: 1,
  },
  // ListActualFlowPathsFilterParameter (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listActualFlowPaths(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **ListActualFlowPathsSortParameter** |  | (optional) defaults to undefined
 **filter** | **ListActualFlowPathsFilterParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListActualFlowPaths200Response**

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

# **listActualFlows**
> ListActualFlows200Response listActualFlows()

List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListActualFlowsRequest = {
  // ListActualFlowsSortParameter (optional)
  sort: {
    sortBy: "lastSeen",
    sortOrder: 1,
  },
  // ListActualFlowsFilterParameter (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listActualFlows(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **ListActualFlowsSortParameter** |  | (optional) defaults to undefined
 **filter** | **ListActualFlowsFilterParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListActualFlows200Response**

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

# **listPotentialFlows**
> ListPotentialFlows200Response listPotentialFlows()

List all the potential flows of users and services across your entire cloud accounts and SaaS applications.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListPotentialFlowsRequest = {
  // PotentialFlowsFilterOptions (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listPotentialFlows(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **PotentialFlowsFilterOptions** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListPotentialFlows200Response**

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

# **listPotentialFlowsPaths**
> ListPotentialFlowsPaths200Response listPotentialFlowsPaths()

List all the potential flow paths based on an applied filter.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListPotentialFlowsPathsRequest = {
  // PotentialFlowsPathsFilterOptions (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listPotentialFlowsPaths(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **PotentialFlowsPathsFilterOptions** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListPotentialFlowsPaths200Response**

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


