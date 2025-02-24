# .QSDataLoaderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSDataLoaderQSfileValidator**](QSDataLoaderApi.md#qSDataLoaderQSfileValidator) | **POST** /api/v3/data/validation | QSfileValidator - validate the files before insert happend .
[**qSDataLoaderUploadSyntheticDataLoader**](QSDataLoaderApi.md#qSDataLoaderUploadSyntheticDataLoader) | **POST** /api/v3/data/synthetic | UploadSyntheticDataLoader - Insert data into Db after read from .sql file .


# **qSDataLoaderQSfileValidator**
> Qsdataloaderv3QSfileValidatorResonse qSDataLoaderQSfileValidator(qsdataloaderv3QSfileValidatorRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataLoaderApi(configuration);

let body:.QSDataLoaderApiQSDataLoaderQSfileValidatorRequest = {
  // Qsdataloaderv3QSfileValidatorRequest
  qsdataloaderv3QSfileValidatorRequest: {
    externalParam: {
      applicationFileName: "applicationFileName_example",
      bucketName: "bucketName_example",
      explorerFileName: "explorerFileName_example",
      folderName: "folderName_example",
      networkFileName: "networkFileName_example",
      policyFileName: "policyFileName_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSDataLoaderQSfileValidator(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qsdataloaderv3QSfileValidatorRequest** | **Qsdataloaderv3QSfileValidatorRequest**|  |


### Return type

**Qsdataloaderv3QSfileValidatorResonse**

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

# **qSDataLoaderUploadSyntheticDataLoader**
> Qsdataloaderv3QSyntheticDataLoaderResonse qSDataLoaderUploadSyntheticDataLoader(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataLoaderApi(configuration);

let body:.QSDataLoaderApiQSDataLoaderUploadSyntheticDataLoaderRequest = {
  // any
  body: {},
};

apiInstance.qSDataLoaderUploadSyntheticDataLoader(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**Qsdataloaderv3QSyntheticDataLoaderResonse**

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


