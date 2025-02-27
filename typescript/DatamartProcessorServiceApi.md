# .DatamartProcessorServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**datamartProcessorServiceGetDatamartInfo**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamartInfo) | **GET** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
[**datamartProcessorServiceGetDatamarts**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamarts) | **GET** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
[**datamartProcessorServiceGetEarliestStartTime**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetEarliestStartTime) | **GET** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
[**datamartProcessorServiceSendAllCompleteFilesToQueue**](DatamartProcessorServiceApi.md#datamartProcessorServiceSendAllCompleteFilesToQueue) | **POST** /api/v3/datamarts/repush_files | 
[**datamartProcessorServiceStoreExtractionLogs**](DatamartProcessorServiceApi.md#datamartProcessorServiceStoreExtractionLogs) | **POST** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
[**uploadDatamart**](DatamartProcessorServiceApi.md#uploadDatamart) | **POST** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion.


# **datamartProcessorServiceGetDatamartInfo**
> Datamartprocessorv3GetDatamartInfoResponse datamartProcessorServiceGetDatamartInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartInfoRequest = {
  // string | Ingestion id. (optional)
  ingestionId: "ingestion_id_example",
};

apiInstance.datamartProcessorServiceGetDatamartInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestionId** | [**string**] | Ingestion id. | (optional) defaults to undefined


### Return type

**Datamartprocessorv3GetDatamartInfoResponse**

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

# **datamartProcessorServiceGetDatamarts**
> Datamartprocessorv3GetDatamartResponse datamartProcessorServiceGetDatamarts()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartsRequest = {
  // Date | Data starting time period in UTC. (optional)
  periodStart: new Date('1970-01-01T00:00:00.00Z'),
  // Date | Data ending time period in UTC. (optional)
  periodEnd: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.datamartProcessorServiceGetDatamarts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **periodStart** | [**Date**] | Data starting time period in UTC. | (optional) defaults to undefined
 **periodEnd** | [**Date**] | Data ending time period in UTC. | (optional) defaults to undefined


### Return type

**Datamartprocessorv3GetDatamartResponse**

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

# **datamartProcessorServiceGetEarliestStartTime**
> Datamartprocessorv3GetEarliestStartTimeResponse datamartProcessorServiceGetEarliestStartTime()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:any = {};

apiInstance.datamartProcessorServiceGetEarliestStartTime(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Datamartprocessorv3GetEarliestStartTimeResponse**

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

# **datamartProcessorServiceSendAllCompleteFilesToQueue**
> Datamartprocessorv3StatusResponseBase datamartProcessorServiceSendAllCompleteFilesToQueue(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceSendAllCompleteFilesToQueueRequest = {
  // any
  body: {},
};

apiInstance.datamartProcessorServiceSendAllCompleteFilesToQueue(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**Datamartprocessorv3StatusResponseBase**

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

# **datamartProcessorServiceStoreExtractionLogs**
> Datamartprocessorv3DMExtractionLogsResponse datamartProcessorServiceStoreExtractionLogs(datamartprocessorv3DMExtractionLogsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceStoreExtractionLogsRequest = {
  // string | Request id which co-relates to request.
  requestId: "request_id_example",
  // Datamartprocessorv3DMExtractionLogsRequest
  datamartprocessorv3DMExtractionLogsRequest: {
    data: "data_example",
    requestId: "requestId_example",
  },
};

apiInstance.datamartProcessorServiceStoreExtractionLogs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamartprocessorv3DMExtractionLogsRequest** | **Datamartprocessorv3DMExtractionLogsRequest**|  |
 **requestId** | [**string**] | Request id which co-relates to request. | defaults to undefined


### Return type

**Datamartprocessorv3DMExtractionLogsResponse**

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

# **uploadDatamart**
> void uploadDatamart()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiUploadDatamartRequest = {
  // HttpFile | The file to upload.
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

apiInstance.uploadDatamart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**HttpFile**] | The file to upload. | defaults to undefined


### Return type

**void**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


