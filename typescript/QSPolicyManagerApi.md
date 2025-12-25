# .QSPolicyManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSPolicyManagerBatchStatusUpdate**](QSPolicyManagerApi.md#qSPolicyManagerBatchStatusUpdate) | **PUT** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
[**qSPolicyManagerConfigUpdate**](QSPolicyManagerApi.md#qSPolicyManagerConfigUpdate) | **PATCH** /api/v3/policy_manager/configs | ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
[**qSPolicyManagerCreateTicket**](QSPolicyManagerApi.md#qSPolicyManagerCreateTicket) | **POST** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
[**qSPolicyManagerFetchFilesfromBuckets**](QSPolicyManagerApi.md#qSPolicyManagerFetchFilesfromBuckets) | **GET** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
[**qSPolicyManagerProcessPolicyDimentionRecords**](QSPolicyManagerApi.md#qSPolicyManagerProcessPolicyDimentionRecords) | **POST** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
[**qSPolicyManagerUpdateTicketStatus**](QSPolicyManagerApi.md#qSPolicyManagerUpdateTicketStatus) | **PUT** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .


# **qSPolicyManagerBatchStatusUpdate**
> Qspmpolicymanagerv3StandardEmptyResponse qSPolicyManagerBatchStatusUpdate(body)


### Example


```typescript
import { createConfiguration, QSPolicyManagerApi } from '';
import type { QSPolicyManagerApiQSPolicyManagerBatchStatusUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPolicyManagerApi(configuration);

const request: QSPolicyManagerApiQSPolicyManagerBatchStatusUpdateRequest = {
  
  body: {},
};

const data = await apiInstance.qSPolicyManagerBatchStatusUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**Qspmpolicymanagerv3StandardEmptyResponse**

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

# **qSPolicyManagerConfigUpdate**
> Qspmpolicymanagerv3APIResonse qSPolicyManagerConfigUpdate(qspmpolicymanagerv3UpdateConfigsRequest)


### Example


```typescript
import { createConfiguration, QSPolicyManagerApi } from '';
import type { QSPolicyManagerApiQSPolicyManagerConfigUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPolicyManagerApi(configuration);

const request: QSPolicyManagerApiQSPolicyManagerConfigUpdateRequest = {
  
  qspmpolicymanagerv3UpdateConfigsRequest: {
    id: "id_example",
    options: {
      "key": 3.14,
    },
  },
};

const data = await apiInstance.qSPolicyManagerConfigUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3UpdateConfigsRequest** | **Qspmpolicymanagerv3UpdateConfigsRequest**|  |


### Return type

**Qspmpolicymanagerv3APIResonse**

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

# **qSPolicyManagerCreateTicket**
> Qspmpolicymanagerv3CreateTicketResponse qSPolicyManagerCreateTicket(qspmpolicymanagerv3CreateTicketRequest)


### Example


```typescript
import { createConfiguration, QSPolicyManagerApi } from '';
import type { QSPolicyManagerApiQSPolicyManagerCreateTicketRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPolicyManagerApi(configuration);

const request: QSPolicyManagerApiQSPolicyManagerCreateTicketRequest = {
  
  qspmpolicymanagerv3CreateTicketRequest: {
    policyDatasetId: "policyDatasetId_example",
    policyType: "policyType_example",
    additionalData: {
      "key": "key_example",
    },
    contents: "contents_example",
    integrationId: "integrationId_example",
    severity: "UNDEFINED",
    title: "title_example",
  },
};

const data = await apiInstance.qSPolicyManagerCreateTicket(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3CreateTicketRequest** | **Qspmpolicymanagerv3CreateTicketRequest**|  |


### Return type

**Qspmpolicymanagerv3CreateTicketResponse**

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

# **qSPolicyManagerFetchFilesfromBuckets**
> Qspmpolicymanagerv3FetchObjectStoreFileResponse qSPolicyManagerFetchFilesfromBuckets()


### Example


```typescript
import { createConfiguration, QSPolicyManagerApi } from '';

const configuration = createConfiguration();
const apiInstance = new QSPolicyManagerApi(configuration);

const request = {};

const data = await apiInstance.qSPolicyManagerFetchFilesfromBuckets(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Qspmpolicymanagerv3FetchObjectStoreFileResponse**

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

# **qSPolicyManagerProcessPolicyDimentionRecords**
> Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse qSPolicyManagerProcessPolicyDimentionRecords(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest)


### Example


```typescript
import { createConfiguration, QSPolicyManagerApi } from '';
import type { QSPolicyManagerApiQSPolicyManagerProcessPolicyDimentionRecordsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPolicyManagerApi(configuration);

const request: QSPolicyManagerApiQSPolicyManagerProcessPolicyDimentionRecordsRequest = {
  
  qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest: {
    provisonIdList: [
      "provisonIdList_example",
    ],
    scanIdList: [
      "scanIdList_example",
    ],
  },
};

const data = await apiInstance.qSPolicyManagerProcessPolicyDimentionRecords(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest** | **Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest**|  |


### Return type

**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse**

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

# **qSPolicyManagerUpdateTicketStatus**
> Qspmpolicymanagerv3UpdateTicketStatusResponse qSPolicyManagerUpdateTicketStatus(qspmpolicymanagerv3UpdateTicketStatusRequest)


### Example


```typescript
import { createConfiguration, QSPolicyManagerApi } from '';
import type { QSPolicyManagerApiQSPolicyManagerUpdateTicketStatusRequest } from '';

const configuration = createConfiguration();
const apiInstance = new QSPolicyManagerApi(configuration);

const request: QSPolicyManagerApiQSPolicyManagerUpdateTicketStatusRequest = {
  
  qspmpolicymanagerv3UpdateTicketStatusRequest: {
    policyDatasetId: "policyDatasetId_example",
    policyType: "policyType_example",
  },
};

const data = await apiInstance.qSPolicyManagerUpdateTicketStatus(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3UpdateTicketStatusRequest** | **Qspmpolicymanagerv3UpdateTicketStatusRequest**|  |


### Return type

**Qspmpolicymanagerv3UpdateTicketStatusResponse**

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


