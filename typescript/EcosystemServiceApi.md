# .EcosystemServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ecosystemServiceCreateDataset**](EcosystemServiceApi.md#ecosystemServiceCreateDataset) | **POST** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database.
[**ecosystemServiceDataInsert**](EcosystemServiceApi.md#ecosystemServiceDataInsert) | **POST** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert.
[**ecosystemServiceDeleteDatasets**](EcosystemServiceApi.md#ecosystemServiceDeleteDatasets) | **DELETE** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets.
[**ecosystemServiceGetDatasetData**](EcosystemServiceApi.md#ecosystemServiceGetDatasetData) | **GET** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset.
[**ecosystemServiceGetDatasetDetail**](EcosystemServiceApi.md#ecosystemServiceGetDatasetDetail) | **GET** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition.
[**ecosystemServiceGetDatasets**](EcosystemServiceApi.md#ecosystemServiceGetDatasets) | **GET** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter.
[**ecosystemServiceGetPurgableRows**](EcosystemServiceApi.md#ecosystemServiceGetPurgableRows) | **POST** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged.
[**ecosystemServicePurgeData**](EcosystemServiceApi.md#ecosystemServicePurgeData) | **DELETE** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data.
[**ecosystemServiceTestIntegration**](EcosystemServiceApi.md#ecosystemServiceTestIntegration) | **POST** /api/v3/integrations/setup/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional. Currently this API only supports API_IMPORT type integrations


# **ecosystemServiceCreateDataset**
> Ecosystemv3CreateDatasetResponse ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceCreateDatasetRequest = {
  // Ecosystemv3CreateDatasetRequest
  ecosystemv3CreateDatasetRequest: {
    detail: {
      columns: [
        {
          allowNull: true,
          columnId: 1,
          columnName: "columnName_example",
          columnSize: "columnSize_example",
          columnType: "UNDEFINED_DATA_TYPE",
          unique: true,
        },
      ],
      dataCount: 1,
      datasetName: "datasetName_example",
      description: "description_example",
      editable: true,
    },
    isNew: true,
  },
};

apiInstance.ecosystemServiceCreateDataset(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3CreateDatasetRequest** | **Ecosystemv3CreateDatasetRequest**|  |


### Return type

**Ecosystemv3CreateDatasetResponse**

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

# **ecosystemServiceDataInsert**
> Ecosystemv3DataInsertResponse ecosystemServiceDataInsert(ecosystemv3DataInsertRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceDataInsertRequest = {
  // string | Data set target name.
  datasetName: "dataset_name_example",
  // Ecosystemv3DataInsertRequest
  ecosystemv3DataInsertRequest: {
    datasetName: "datasetName_example",
    entries: [
      {
        entry: {
          "key": "key_example",
        },
      },
    ],
  },
};

apiInstance.ecosystemServiceDataInsert(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3DataInsertRequest** | **Ecosystemv3DataInsertRequest**|  |
 **datasetName** | [**string**] | Data set target name. | defaults to undefined


### Return type

**Ecosystemv3DataInsertResponse**

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

# **ecosystemServiceDeleteDatasets**
> Ecosystemv3DeleteDatasetsResponse ecosystemServiceDeleteDatasets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceDeleteDatasetsRequest = {
  // Array<string> | Name of the dataset, required field. (optional)
  datasetNames: [
    "dataset_names_example",
  ],
};

apiInstance.ecosystemServiceDeleteDatasets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | **Array&lt;string&gt;** | Name of the dataset, required field. | (optional) defaults to undefined


### Return type

**Ecosystemv3DeleteDatasetsResponse**

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

# **ecosystemServiceGetDatasetData**
> Ecosystemv3GetDatasetDataResponse ecosystemServiceGetDatasetData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetDatasetDataRequest = {
  // string | Name of the dataset.
  datasetName: "dataset_name_example",
  // number | The amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | The max amount of rows to return for pagination. (optional)
  limit: 1,
  // boolean | If needs to return header information. It is for pagination. The first page needs header, the rest doesn\'t need. (optional)
  returnHeader: true,
  // string | Search field. (optional)
  field: "field_example",
  // string | Search value. (optional)
  value: "value_example",
  // string | Field to sort. (optional)
  sortField: "sort_field_example",
  // 'NONE' | 'ASC' | 'DESC' | Sort order. (optional)
  sortOrder: "NONE",
};

apiInstance.ecosystemServiceGetDatasetData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetName** | [**string**] | Name of the dataset. | defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **returnHeader** | [**boolean**] | If needs to return header information. It is for pagination. The first page needs header, the rest doesn\&#39;t need. | (optional) defaults to undefined
 **field** | [**string**] | Search field. | (optional) defaults to undefined
 **value** | [**string**] | Search value. | (optional) defaults to undefined
 **sortField** | [**string**] | Field to sort. | (optional) defaults to undefined
 **sortOrder** | [**&#39;NONE&#39; | &#39;ASC&#39; | &#39;DESC&#39;**]**Array<&#39;NONE&#39; &#124; &#39;ASC&#39; &#124; &#39;DESC&#39;>** | Sort order. | (optional) defaults to 'NONE'


### Return type

**Ecosystemv3GetDatasetDataResponse**

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

# **ecosystemServiceGetDatasetDetail**
> Ecosystemv3GetDatasetDetailResponse ecosystemServiceGetDatasetDetail()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetDatasetDetailRequest = {
  // string | Name of the dataset.
  datasetName: "dataset_name_example",
};

apiInstance.ecosystemServiceGetDatasetDetail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetName** | [**string**] | Name of the dataset. | defaults to undefined


### Return type

**Ecosystemv3GetDatasetDetailResponse**

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

# **ecosystemServiceGetDatasets**
> Ecosystemv3GetDatasetsResponse ecosystemServiceGetDatasets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetDatasetsRequest = {
  // Date | Return datasets created at this time or later (>=). (optional)
  filterStartTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | Return datasets created before this time (<). (optional)
  filterEndTime: new Date('1970-01-01T00:00:00.00Z'),
  // Array<string> | The state filter groups commonly paired states. Only returns records that include the specified names. (optional)
  filterDatasetNames: [
    "filter.dataset_names_example",
  ],
  // number | The amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | The max amount of rows to return for pagination. (optional)
  limit: 1,
  // boolean | Computing the filter counts is relatively expensive, only compute when needed. (optional)
  includeFilterCounts: true,
};

apiInstance.ecosystemServiceGetDatasets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | [**Date**] | Return datasets created at this time or later (&gt;&#x3D;). | (optional) defaults to undefined
 **filterEndTime** | [**Date**] | Return datasets created before this time (&lt;). | (optional) defaults to undefined
 **filterDatasetNames** | **Array&lt;string&gt;** | The state filter groups commonly paired states. Only returns records that include the specified names. | (optional) defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **includeFilterCounts** | [**boolean**] | Computing the filter counts is relatively expensive, only compute when needed. | (optional) defaults to undefined


### Return type

**Ecosystemv3GetDatasetsResponse**

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

# **ecosystemServiceGetPurgableRows**
> Ecosystemv3GetPurgableRowsResponse ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetPurgableRowsRequest = {
  // Ecosystemv3GetPurgableRowsRequest
  ecosystemv3GetPurgableRowsRequest: {
    hotRetentionPeriod: "hotRetentionPeriod_example",
    hotRetentionPeriodUnit: "hotRetentionPeriodUnit_example",
  },
};

apiInstance.ecosystemServiceGetPurgableRows(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3GetPurgableRowsRequest** | **Ecosystemv3GetPurgableRowsRequest**|  |


### Return type

**Ecosystemv3GetPurgableRowsResponse**

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

# **ecosystemServicePurgeData**
> Ecosystemv3PurgeDataResponse ecosystemServicePurgeData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServicePurgeDataRequest = {
  // Array<string> | Name of the datasets, required field. (optional)
  datasetNames: [
    "dataset_names_example",
  ],
};

apiInstance.ecosystemServicePurgeData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | **Array&lt;string&gt;** | Name of the datasets, required field. | (optional) defaults to undefined


### Return type

**Ecosystemv3PurgeDataResponse**

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

# **ecosystemServiceTestIntegration**
> Ecosystemv3TestIntegrationResponse ecosystemServiceTestIntegration(ecosystemv3TestIntegrationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceTestIntegrationRequest = {
  // Ecosystemv3TestIntegrationRequest
  ecosystemv3TestIntegrationRequest: {
    integrationType: "integrationType_example",
    options: {
      "key": "key_example",
    },
  },
};

apiInstance.ecosystemServiceTestIntegration(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3TestIntegrationRequest** | **Ecosystemv3TestIntegrationRequest**|  |


### Return type

**Ecosystemv3TestIntegrationResponse**

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


