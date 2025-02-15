# .EdgeSchedulerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**edgeSchedulerServiceGetEdgeQueryStatus**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceGetEdgeQueryStatus) | **GET** /api/v3/edge/query/status | Summary: Get edge query status Description: Get the status of a queued edge query
[**edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery) | **POST** /api/v3/edge/query | Summary: Create workspace Description: monitor edge query pending request
[**edgeSchedulerServiceScheduleEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceScheduleEdgeQuery) | **POST** /api/v3/edge/query/schedule | Summary: Schedule an edge query  Description: Schedule an edge query via db2 queue


# **edgeSchedulerServiceGetEdgeQueryStatus**
> Edgeschedulerv3GetEdgeQueryStatusResponse edgeSchedulerServiceGetEdgeQueryStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EdgeSchedulerServiceApi(configuration);

let body:.EdgeSchedulerServiceApiEdgeSchedulerServiceGetEdgeQueryStatusRequest = {
  // string | the id of the edge. (optional)
  edgeId: "edge_id_example",
  // string | the id of the UC report being queried for. (optional)
  edgeResultReportId: "edge_result_report_id_example",
};

apiInstance.edgeSchedulerServiceGetEdgeQueryStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | [**string**] | the id of the edge. | (optional) defaults to undefined
 **edgeResultReportId** | [**string**] | the id of the UC report being queried for. | (optional) defaults to undefined


### Return type

**Edgeschedulerv3GetEdgeQueryStatusResponse**

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

# **edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**
> StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery(edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EdgeSchedulerServiceApi(configuration);

let body:.EdgeSchedulerServiceApiEdgeSchedulerServiceMonitoringPendingRequestForEdgeQueryRequest = {
  // Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest
  edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest: {
    clientId: "clientId_example",
  },
};

apiInstance.edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest** | **Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest**|  |


### Return type

**StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **edgeSchedulerServiceScheduleEdgeQuery**
> Edgeschedulerv3ScheduleEdgeQueryResponse edgeSchedulerServiceScheduleEdgeQuery(edgeschedulerv3ScheduleEdgeQueryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EdgeSchedulerServiceApi(configuration);

let body:.EdgeSchedulerServiceApiEdgeSchedulerServiceScheduleEdgeQueryRequest = {
  // Edgeschedulerv3ScheduleEdgeQueryRequest
  edgeschedulerv3ScheduleEdgeQueryRequest: {
    edgeQueryEndTime: new Date('1970-01-01T00:00:00.00Z'),
    edgeQueryStartTime: new Date('1970-01-01T00:00:00.00Z'),
    edgeId: "edgeId_example",
    edgeResultReportId: "edgeResultReportId_example",
  },
};

apiInstance.edgeSchedulerServiceScheduleEdgeQuery(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeschedulerv3ScheduleEdgeQueryRequest** | **Edgeschedulerv3ScheduleEdgeQueryRequest**|  |


### Return type

**Edgeschedulerv3ScheduleEdgeQueryResponse**

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


