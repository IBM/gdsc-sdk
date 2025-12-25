# .DataStoresApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataStore**](DataStoresApi.md#getDataStore) | **GET** /api/v2/dspm/dataStores/{dataStoreId} | Get a data store by its ID
[**getDataStoresSummary**](DataStoresApi.md#getDataStoresSummary) | **GET** /api/v2/dspm/dataStores/summary | Get summary of data stores
[**listAllDataStoresLabels**](DataStoresApi.md#listAllDataStoresLabels) | **GET** /api/v2/dspm/dataStores/labels | List labels of data stores.
[**listDataStores**](DataStoresApi.md#listDataStores) | **GET** /api/v2/dspm/dataStores | List data stores
[**listDataStoresCloudTagsKeys**](DataStoresApi.md#listDataStoresCloudTagsKeys) | **GET** /api/v2/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
[**listDataStoresCloudTagsValues**](DataStoresApi.md#listDataStoresCloudTagsValues) | **GET** /api/v2/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
[**listDataStoresNames**](DataStoresApi.md#listDataStoresNames) | **GET** /api/v2/dspm/dataStores/filters/name | List name of filterable data stores
[**rescanDataStore**](DataStoresApi.md#rescanDataStore) | **POST** /api/v2/dspm/dataStores/rescan | Post data store rescan request
[**setDataStoreLabel**](DataStoresApi.md#setDataStoreLabel) | **PUT** /api/v2/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
[**updateDatastoreCustodian**](DataStoresApi.md#updateDatastoreCustodian) | **POST** /api/v2/dspm/dataStores/custodian | Update the name of a Data store custodian


# **getDataStore**
> DataStore getDataStore()

Get details of a specific data store by its ID.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiGetDataStoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiGetDataStoreRequest = {
    // ID of the data store
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
};

const data = await apiInstance.getDataStore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | [**string**] | ID of the data store | defaults to undefined


### Return type

**DataStore**

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

# **getDataStoresSummary**
> DataStoresSummary getDataStoresSummary()

Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiGetDataStoresSummaryRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiGetDataStoresSummaryRequest = {
  
  filter: {
    storeTypesFamily: ["CLOUD"],
    storeNames: [
      "["polar-security-corplex"]",
    ],
    storeTypes: ["S3","RDS"],
    serviceProviders: [
      "aws",
    ],
    cloudAccountIds: [12345678910,12345678911],
    cloudRegions: ["us-east-1","us-central1"],
    labels: ["test1, test"],
    classificationStatuses: [
      "CLASSIFIED",
    ],
    sensitivityTags: ["EMAIL","PASSWORD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    compliances: [
      "CPRA",
    ],
    cloudTags: ["Component"],
    encryptionStatuses: [
      "CLOUD_PROVIDER",
    ],
    storePartialName: "storePartialName_example",
  },
};

const data = await apiInstance.getDataStoresSummary(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListDataStoresFilterParameter** |  | (optional) defaults to undefined


### Return type

**DataStoresSummary**

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

# **listAllDataStoresLabels**
> Array<string> listAllDataStoresLabels()

Get a list of all the labels of custom data stores.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiListAllDataStoresLabelsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiListAllDataStoresLabelsRequest = {
    // Prefix of data store label (optional)
  prefix: "test",
  
  maxResults: 10,
};

const data = await apiInstance.listAllDataStoresLabels(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of data store label | (optional) defaults to undefined
 **maxResults** | [**number**] |  | (optional) defaults to undefined


### Return type

**Array<string>**

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

# **listDataStores**
> ListDataStores200Response listDataStores()

List all data stores discovered by Guardium DSPM.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiListDataStoresRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiListDataStoresRequest = {
  
  filter: {
    storeTypesFamily: ["CLOUD"],
    storeNames: [
      "["polar-security-corplex"]",
    ],
    storeTypes: ["S3","RDS"],
    serviceProviders: [
      "aws",
    ],
    cloudAccountIds: [12345678910,12345678911],
    cloudRegions: ["us-east-1","us-central1"],
    labels: ["test1, test"],
    classificationStatuses: [
      "CLASSIFIED",
    ],
    sensitivityTags: ["EMAIL","PASSWORD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    compliances: [
      "CPRA",
    ],
    cloudTags: ["Component"],
    encryptionStatuses: [
      "CLOUD_PROVIDER",
    ],
    storePartialName: "storePartialName_example",
  },
  
  sort: {
    sortBy: "name",
    sortOrder: 1,
  },
  
  pageSize: 3.14,
  
  nextToken: "nextToken_example",
};

const data = await apiInstance.listDataStores(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListDataStoresFilterParameter** |  | (optional) defaults to undefined
 **sort** | **ListDataStoresSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListDataStores200Response**

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

# **listDataStoresCloudTagsKeys**
> Array<string> listDataStoresCloudTagsKeys()

Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiListDataStoresCloudTagsKeysRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiListDataStoresCloudTagsKeysRequest = {
    // Prefix of cloud tag key
  prefix: "environment",
  
  maxResults: 10,
};

const data = await apiInstance.listDataStoresCloudTagsKeys(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of cloud tag key | defaults to undefined
 **maxResults** | [**number**] |  | (optional) defaults to undefined


### Return type

**Array<string>**

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

# **listDataStoresCloudTagsValues**
> Array<string> listDataStoresCloudTagsValues()

Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiListDataStoresCloudTagsValuesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiListDataStoresCloudTagsValuesRequest = {
    // Prefix of cloud tag value
  prefix: "comp",
  
  tagKey: "Production",
  
  maxResults: 10,
};

const data = await apiInstance.listDataStoresCloudTagsValues(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of cloud tag value | defaults to undefined
 **tagKey** | [**string**] |  | defaults to undefined
 **maxResults** | [**number**] |  | (optional) defaults to undefined


### Return type

**Array<string>**

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

# **listDataStoresNames**
> Array<string> listDataStoresNames()

Lists the data stores that can be filtered or classified.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiListDataStoresNamesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiListDataStoresNamesRequest = {
    // Prefix of data store name
  prefix: "polar",
};

const data = await apiInstance.listDataStoresNames(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of data store name | defaults to undefined


### Return type

**Array<string>**

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

# **rescanDataStore**
> void rescanDataStore(rescanDataStoreRequest)

Post the request for a data store rescan.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiRescanDataStoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiRescanDataStoreRequest = {
  
  rescanDataStoreRequest: {
    dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  },
};

const data = await apiInstance.rescanDataStore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rescanDataStoreRequest** | **RescanDataStoreRequest**|  |


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **setDataStoreLabel**
> void setDataStoreLabel(setDataStoreLabelRequest)

Add or update a custom label for a data store.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiSetDataStoreLabelRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiSetDataStoreLabelRequest = {
    // Data store ID
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  
  setDataStoreLabelRequest: {
    label: "BI Team",
  },
};

const data = await apiInstance.setDataStoreLabel(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setDataStoreLabelRequest** | **SetDataStoreLabelRequest**|  |
 **dataStoreId** | [**string**] | Data store ID | defaults to undefined


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateDatastoreCustodian**
> UpdateDatastoreCustodian200Response updateDatastoreCustodian(updateCustodianBody)

Add or update the name of a specific data store.

### Example


```typescript
import { createConfiguration, DataStoresApi } from '';
import type { DataStoresApiUpdateDatastoreCustodianRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataStoresApi(configuration);

const request: DataStoresApiUpdateDatastoreCustodianRequest = {
  
  updateCustodianBody: {
    dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
    custodian: "Avi",
  },
};

const data = await apiInstance.updateDatastoreCustodian(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustodianBody** | **UpdateCustodianBody**|  |


### Return type

**UpdateDatastoreCustodian200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


