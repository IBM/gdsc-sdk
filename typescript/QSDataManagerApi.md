# .QSDataManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSDataManagerGetMasterData**](QSDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
[**qSDataManagerGetPluginData**](QSDataManagerApi.md#qSDataManagerGetPluginData) | **GET** /api/v3/datamanager/plugin | Summary: Plugins Details Description: Retrieves All plugins information.
[**qSDataManagerRegisterScan**](QSDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
[**qSDataManagerRetrieveScan**](QSDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.


# **qSDataManagerGetMasterData**
> Qspmdatamanagerv3MasterDataResponse qSDataManagerGetMasterData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:any = {};

apiInstance.qSDataManagerGetMasterData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Qspmdatamanagerv3MasterDataResponse**

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

# **qSDataManagerGetPluginData**
> Qspmdatamanagerv3PluginDataResponse qSDataManagerGetPluginData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:any = {};

apiInstance.qSDataManagerGetPluginData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Qspmdatamanagerv3PluginDataResponse**

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

# **qSDataManagerRegisterScan**
> Qspmdatamanagerv3ScanResponse qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerRegisterScanRequest = {
  // Qspmdatamanagerv3ScanRequest
  qspmdatamanagerv3ScanRequest: {
    pluginId: "pluginId_example",
    scanCbomId: "scanCbomId_example",
    scanDataTs: new Date('1970-01-01T00:00:00.00Z'),
    scanDataUpdateTs: new Date('1970-01-01T00:00:00.00Z'),
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanStatus: "scanStatus_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSDataManagerRegisterScan(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3ScanRequest** | **Qspmdatamanagerv3ScanRequest**|  |


### Return type

**Qspmdatamanagerv3ScanResponse**

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

# **qSDataManagerRetrieveScan**
> Qspmdatamanagerv3ScanResponse qSDataManagerRetrieveScan()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerRetrieveScanRequest = {
  // string
  scanId: "scan_id_example",
};

apiInstance.qSDataManagerRetrieveScan(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scanId** | [**string**] |  | defaults to undefined


### Return type

**Qspmdatamanagerv3ScanResponse**

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


