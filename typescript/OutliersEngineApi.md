# .OutliersEngineApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outliersEngineGetSourceStatistics**](OutliersEngineApi.md#outliersEngineGetSourceStatistics) | **GET** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
[**outliersEngineGetStatistics**](OutliersEngineApi.md#outliersEngineGetStatistics) | **GET** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
[**outliersEngineGetWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineGetWorkingHoursPeriods) | **GET** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods.
[**outliersEngineRunSimulator**](OutliersEngineApi.md#outliersEngineRunSimulator) | **POST** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator.
[**outliersEngineUpdateWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineUpdateWorkingHoursPeriods) | **PUT** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values.
[**outliersEngineUploadAndAnalyzePeriod**](OutliersEngineApi.md#outliersEngineUploadAndAnalyzePeriod) | **POST** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods.
[**outliersEngineUserClustering**](OutliersEngineApi.md#outliersEngineUserClustering) | **POST** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources.


# **outliersEngineGetSourceStatistics**
> Outliersenginev3GetSourceStatisticsResponse outliersEngineGetSourceStatistics()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineGetSourceStatisticsRequest = {
  // string | server ip. (optional)
  sourceServerIp: "source.server_ip_example",
  // string | database name. (optional)
  sourceDatabaseName: "source.database_name_example",
  // string | db user name (optional). (optional)
  sourceDbUser: "source.db_user_example",
  // number | The number of attributes to return for each SourceAttributeType - optional. (optional)
  attributesLimit: 1,
};

apiInstance.outliersEngineGetSourceStatistics(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceServerIp** | [**string**] | server ip. | (optional) defaults to undefined
 **sourceDatabaseName** | [**string**] | database name. | (optional) defaults to undefined
 **sourceDbUser** | [**string**] | db user name (optional). | (optional) defaults to undefined
 **attributesLimit** | [**number**] | The number of attributes to return for each SourceAttributeType - optional. | (optional) defaults to undefined


### Return type

**Outliersenginev3GetSourceStatisticsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **outliersEngineGetStatistics**
> Outliersenginev3StatisticsResponse outliersEngineGetStatistics()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:any = {};

apiInstance.outliersEngineGetStatistics(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Outliersenginev3StatisticsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **outliersEngineGetWorkingHoursPeriods**
> Outliersenginev3GetWorkingHoursPeriodsResponse outliersEngineGetWorkingHoursPeriods()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:any = {};

apiInstance.outliersEngineGetWorkingHoursPeriods(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Outliersenginev3GetWorkingHoursPeriodsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **outliersEngineRunSimulator**
> RpcStatus outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineRunSimulatorRequest = {
  // Outliersenginev3RunSimulatorRequest
  outliersenginev3RunSimulatorRequest: {
    configurationFilePath: "configurationFilePath_example",
    date: "date_example",
    enableDemoMode: true,
    length: 1,
  },
};

apiInstance.outliersEngineRunSimulator(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3RunSimulatorRequest** | **Outliersenginev3RunSimulatorRequest**|  |


### Return type

**RpcStatus**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **outliersEngineUpdateWorkingHoursPeriods**
> Outliersenginev3OutlierResponse outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineUpdateWorkingHoursPeriodsRequest = {
  // Outliersenginev3UpdateWorkingHoursPeriodsRequest
  outliersenginev3UpdateWorkingHoursPeriodsRequest: {
    period: {
      contiguous: true,
      datetimeCodeDescription: "datetimeCodeDescription_example",
      datetimeCodeId: 1,
      hourFrom: "hourFrom_example",
      hourTo: "hourTo_example",
      weekdayFrom: 1,
      weekdayTo: 1,
    },
  },
};

apiInstance.outliersEngineUpdateWorkingHoursPeriods(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3UpdateWorkingHoursPeriodsRequest** | **Outliersenginev3UpdateWorkingHoursPeriodsRequest**|  |


### Return type

**Outliersenginev3OutlierResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **outliersEngineUploadAndAnalyzePeriod**
> RpcStatus outliersEngineUploadAndAnalyzePeriod(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineUploadAndAnalyzePeriodRequest = {
  // any
  body: {},
};

apiInstance.outliersEngineUploadAndAnalyzePeriod(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**RpcStatus**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **outliersEngineUserClustering**
> RpcStatus outliersEngineUserClustering(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineUserClusteringRequest = {
  // any
  body: {},
};

apiInstance.outliersEngineUserClustering(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**RpcStatus**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


