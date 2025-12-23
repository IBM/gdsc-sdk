# .HealthCollectorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCollectorGetDataWarehouseUsage**](HealthCollectorApi.md#healthCollectorGetDataWarehouseUsage) | **GET** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage
[**healthCollectorGetGDPHealthInfo**](HealthCollectorApi.md#healthCollectorGetGDPHealthInfo) | **GET** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
[**healthCollectorGetHistoricalHealthInfo**](HealthCollectorApi.md#healthCollectorGetHistoricalHealthInfo) | **GET** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
[**healthCollectorGetObjectStorageUsage**](HealthCollectorApi.md#healthCollectorGetObjectStorageUsage) | **GET** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
[**healthCollectorGetPVCUsage**](HealthCollectorApi.md#healthCollectorGetPVCUsage) | **GET** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
[**healthCollectorGetPodRestarts**](HealthCollectorApi.md#healthCollectorGetPodRestarts) | **GET** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
[**healthCollectorGetStreamsIngestion**](HealthCollectorApi.md#healthCollectorGetStreamsIngestion) | **GET** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
[**healthCollectorGetTopGDPCollectors**](HealthCollectorApi.md#healthCollectorGetTopGDPCollectors) | **GET** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
[**healthCollectorStoreHealthInfo**](HealthCollectorApi.md#healthCollectorStoreHealthInfo) | **POST** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)


# **healthCollectorGetDataWarehouseUsage**
> Healthcollectorv3GetDataWarehouseUsageResponse healthCollectorGetDataWarehouseUsage()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorGetDataWarehouseUsageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorGetDataWarehouseUsageRequest = {
    // The type of metric to retrieve
  type: "type_example",
    // The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

const data = await apiInstance.healthCollectorGetDataWarehouseUsage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetDataWarehouseUsageResponse**

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

# **healthCollectorGetGDPHealthInfo**
> Healthcollectorv3GetGDPHealthInfoResponse healthCollectorGetGDPHealthInfo()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request = {};

const data = await apiInstance.healthCollectorGetGDPHealthInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Healthcollectorv3GetGDPHealthInfoResponse**

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

# **healthCollectorGetHistoricalHealthInfo**
> Healthcollectorv3GetHistoricalHealthInfoResponse healthCollectorGetHistoricalHealthInfo()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorGetHistoricalHealthInfoRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorGetHistoricalHealthInfoRequest = {
    // Type of unit for which data needs to be retrieved. (optional)
  unit: "UNKNOWN_UNIT",
    // Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. (optional)
  cmId: "cm_id_example",
    // The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

const data = await apiInstance.healthCollectorGetHistoricalHealthInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unit** | [**&#39;UNKNOWN_UNIT&#39; | &#39;STAP&#39;**]**Array<&#39;UNKNOWN_UNIT&#39; &#124; &#39;STAP&#39;>** | Type of unit for which data needs to be retrieved. | (optional) defaults to 'UNKNOWN_UNIT'
 **cmId** | [**string**] | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. | (optional) defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetHistoricalHealthInfoResponse**

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

# **healthCollectorGetObjectStorageUsage**
> Healthcollectorv3GetObjectStorageUsageResponse healthCollectorGetObjectStorageUsage()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorGetObjectStorageUsageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorGetObjectStorageUsageRequest = {
    // The type of metric to retrieve
  type: "type_example",
    // The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

const data = await apiInstance.healthCollectorGetObjectStorageUsage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetObjectStorageUsageResponse**

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

# **healthCollectorGetPVCUsage**
> Healthcollectorv3GetPVCUsageResponse healthCollectorGetPVCUsage()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorGetPVCUsageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorGetPVCUsageRequest = {
    // The type of metric to retrieve
  type: "type_example",
    // The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

const data = await apiInstance.healthCollectorGetPVCUsage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetPVCUsageResponse**

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

# **healthCollectorGetPodRestarts**
> Healthcollectorv3GetPodRestartsResponse healthCollectorGetPodRestarts()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorGetPodRestartsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorGetPodRestartsRequest = {
    // The type of metric to retrieve
  type: "type_example",
    // The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

const data = await apiInstance.healthCollectorGetPodRestarts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetPodRestartsResponse**

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

# **healthCollectorGetStreamsIngestion**
> Healthcollectorv3GetStreamsIngestionResponse healthCollectorGetStreamsIngestion()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorGetStreamsIngestionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorGetStreamsIngestionRequest = {
    // The type of metric to retrieve
  type: "type_example",
    // The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

const data = await apiInstance.healthCollectorGetStreamsIngestion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetStreamsIngestionResponse**

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

# **healthCollectorGetTopGDPCollectors**
> Healthcollectorv3GetTopGDPCollectorsResponse healthCollectorGetTopGDPCollectors()


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorGetTopGDPCollectorsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorGetTopGDPCollectorsRequest = {
    // The type of metric to retrieve
  type: "type_example",
    // The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

const data = await apiInstance.healthCollectorGetTopGDPCollectors(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetTopGDPCollectorsResponse**

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

# **healthCollectorStoreHealthInfo**
> Healthcollectorv3StoreHealthInfoResponse healthCollectorStoreHealthInfo(healthcollectorv3StoreHealthInfoRequest)


### Example


```typescript
import { createConfiguration, HealthCollectorApi } from '';
import type { HealthCollectorApiHealthCollectorStoreHealthInfoRequest } from '';

const configuration = createConfiguration();
const apiInstance = new HealthCollectorApi(configuration);

const request: HealthCollectorApiHealthCollectorStoreHealthInfoRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
  
  healthcollectorv3StoreHealthInfoRequest: {
    centralManagerId: "centralManagerId_example",
    data: [
      {
        nodes: [
          {
            aggHealthStatus: 1,
            connectivity: 1,
            details: {
              aggHealthViewList: [
                {
                  aggActionError: "aggActionError_example",
                  aggActionHealthStatus: 1,
                  aggType: "aggType_example",
                  errorCode: 1,
                  unit: "unit_example",
                },
              ],
              connectivityDetails: {
                errMessages: "errMessages_example",
              },
              generalErrMessages: [
                "generalErrMessages_example",
              ],
              utilizationScheme: {
                analyzerQueueValue: 1,
                errorMessagesCode: 1,
                errorMessagesValue: "errorMessagesValue_example",
                freeBuffSpaceValue: 1,
                loggerQueueValue: 1,
                mysqlDiskUsageValue: 1,
                noOfRestartsValue: 1,
                numOfExceptionsValue: 1,
                numOfFlatLogRequestsValue: 1,
                numOfPolicyViolationsValue: 1,
                numOfRequestsValue: 1,
                precMysqlMemValue: 1,
                snifMemoryValue: 1,
                sysVarDiskUsageValue: 1,
                systemCpuLoadValue: 1,
              },
            },
            exportsTo: [
              "exportsTo_example",
            ],
            id: 1,
            importsFrom: [
              "importsFrom_example",
            ],
            musStapsHealthStatus: 1,
            name: "name_example",
            osVersion: "osVersion_example",
            patch: "patch_example",
            status: 1,
            type: "type_example",
            unitHostIp: "unitHostIp_example",
            unitUtilizationHealthStatus: 1,
            version: "version_example",
          },
        ],
        staps: [
          {
            children: [
              {
                ieStatus: 1,
                inspectionEngine: "inspectionEngine_example",
              },
            ],
            collectorHostName: "collectorHostName_example",
            connectivity: 1,
            details: {
              connectivityDetails: {
                errMessages: "errMessages_example",
              },
              generalErrMessages: [
                "generalErrMessages_example",
              ],
              ktapDetails: {
                errMessages: "errMessages_example",
              },
              stapLivelinessInfo: {
                hasEvent: true,
                healthStatus: 1,
                livelinessState: "livelinessState_example",
                stap: "stap_example",
              },
              stapVerInfoList: [
                {
                  ie: "ie_example",
                  port: "port_example",
                  protocol: "protocol_example",
                  stap: "stap_example",
                  verificationHealth: 1,
                  verificationResult: "verificationResult_example",
                  verificationState: "verificationState_example",
                  version: "version_example",
                },
              ],
              trafficDetails: {
                errMessages: "errMessages_example",
              },
            },
            ieStatus: 1,
            inspectionEngine: "inspectionEngine_example",
            ktap: 1,
            name: "name_example",
            osType: "osType_example",
            revision: "revision_example",
            stapIp: "stapIp_example",
            status: 1,
            traffic: 1,
          },
        ],
      },
    ],
  },
};

const data = await apiInstance.healthCollectorStoreHealthInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **healthcollectorv3StoreHealthInfoRequest** | **Healthcollectorv3StoreHealthInfoRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Healthcollectorv3StoreHealthInfoResponse**

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


