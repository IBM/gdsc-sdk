# .QSDataManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSDataManagerGetAppDataForProvisionId**](QSDataManagerApi.md#qSDataManagerGetAppDataForProvisionId) | **GET** /api/v3/datamanager/application/{provision_id}/data | Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.
[**qSDataManagerGetMasterData**](QSDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
[**qSDataManagerGetNetLocDimDataForScanId**](QSDataManagerApi.md#qSDataManagerGetNetLocDimDataForScanId) | **GET** /api/v3/datamanager/network/{scan_id}/data | Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.
[**qSDataManagerInsertAllEntities**](QSDataManagerApi.md#qSDataManagerInsertAllEntities) | **POST** /api/v3/datamanager/all/entities | Summary: Insert Data Description: Insert All Dimension and Fact tables data.
[**qSDataManagerRegisterScan**](QSDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
[**qSDataManagerRetrieveScan**](QSDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
[**qSDataManagerSearchEntityData**](QSDataManagerApi.md#qSDataManagerSearchEntityData) | **POST** /api/v3/datamanager/entity/search | Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters
[**qSDataManagerUpdateNetLocation**](QSDataManagerApi.md#qSDataManagerUpdateNetLocation) | **PUT** /api/v3/datamanager/network | Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.


# **qSDataManagerGetAppDataForProvisionId**
> Qspmdatamanagerv3AppDataResponse qSDataManagerGetAppDataForProvisionId()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerGetAppDataForProvisionIdRequest = {
  // string | Identifier for the provision request
  provisionId: "provision_id_example",
};

apiInstance.qSDataManagerGetAppDataForProvisionId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provisionId** | [**string**] | Identifier for the provision request | defaults to undefined


### Return type

**Qspmdatamanagerv3AppDataResponse**

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

# **qSDataManagerGetNetLocDimDataForScanId**
> Qspmdatamanagerv3NetlocDataResponse qSDataManagerGetNetLocDimDataForScanId()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerGetNetLocDimDataForScanIdRequest = {
  // string | Identifier for the scan to retrieve netloc data for
  scanId: "scan_id_example",
};

apiInstance.qSDataManagerGetNetLocDimDataForScanId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scanId** | [**string**] | Identifier for the scan to retrieve netloc data for | defaults to undefined


### Return type

**Qspmdatamanagerv3NetlocDataResponse**

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

# **qSDataManagerInsertAllEntities**
> any qSDataManagerInsertAllEntities(qspmdatamanagerv3InsertEntitiesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerInsertAllEntitiesRequest = {
  // Qspmdatamanagerv3InsertEntitiesRequest
  qspmdatamanagerv3InsertEntitiesRequest: {
    dims: [
      {},
    ],
    facts: [
      {},
    ],
    policysqls: [
      "policysqls_example",
    ],
    scanId: "scanId_example",
  },
};

apiInstance.qSDataManagerInsertAllEntities(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3InsertEntitiesRequest** | **Qspmdatamanagerv3InsertEntitiesRequest**|  |


### Return type

**any**

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
    scanType: "scanType_example",
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

# **qSDataManagerSearchEntityData**
> Qspmdatamanagerv3SearchEntityDataResponse qSDataManagerSearchEntityData(qspmdatamanagerv3SearchEntityDataRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerSearchEntityDataRequest = {
  // Qspmdatamanagerv3SearchEntityDataRequest
  qspmdatamanagerv3SearchEntityDataRequest: {
    columns: [
      "columns_example",
    ],
    filter: "filter_example",
    limit: "limit_example",
    tableName: "tableName_example",
  },
};

apiInstance.qSDataManagerSearchEntityData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3SearchEntityDataRequest** | **Qspmdatamanagerv3SearchEntityDataRequest**|  |


### Return type

**Qspmdatamanagerv3SearchEntityDataResponse**

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

# **qSDataManagerUpdateNetLocation**
> Qspmdatamanagerv3UpdateNetLocResponse qSDataManagerUpdateNetLocation(qspmdatamanagerv3UpdateNetLocRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerUpdateNetLocationRequest = {
  // Qspmdatamanagerv3UpdateNetLocRequest
  qspmdatamanagerv3UpdateNetLocRequest: {
    netlocCity: "netlocCity_example",
    netlocCountry: "netlocCountry_example",
    netlocDataCenter: "netlocDataCenter_example",
    netlocRegion: "netlocRegion_example",
    netlocStateProv: "netlocStateProv_example",
    netlocUuid: "netlocUuid_example",
  },
};

apiInstance.qSDataManagerUpdateNetLocation(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3UpdateNetLocRequest** | **Qspmdatamanagerv3UpdateNetLocRequest**|  |


### Return type

**Qspmdatamanagerv3UpdateNetLocResponse**

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


