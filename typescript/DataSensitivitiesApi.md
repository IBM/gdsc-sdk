# .DataSensitivitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensitivitiesSummary**](DataSensitivitiesApi.md#getSensitivitiesSummary) | **GET** /api/v2/dspm/sensitivities/summary | Get the summary of sensitivities
[**getSensitivity**](DataSensitivitiesApi.md#getSensitivity) | **GET** /api/v2/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
[**listSensitivities**](DataSensitivitiesApi.md#listSensitivities) | **GET** /api/v2/dspm/sensitivities | List sensitivities


# **getSensitivitiesSummary**
> SensitivitiesSummary getSensitivitiesSummary()

Get a summarised information about all sensitivities classified by Guardium DSPM.

### Example


```typescript
import { createConfiguration, DataSensitivitiesApi } from '';
import type { DataSensitivitiesApiGetSensitivitiesSummaryRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataSensitivitiesApi(configuration);

const request: DataSensitivitiesApiGetSensitivitiesSummaryRequest = {
  
  filter: {
    resourceId: "arn:aws:s3::123456789101:polar-bucket_excel_sheet.xlsx",
    dataStoreId: "arn:aws:s3::123456789101:polar-bucket",
    sensitiveTag: "Business Email Address",
    sensitivityCategories: [
      "SECRETS",
    ],
    hash: "hash_example",
  },
};

const data = await apiInstance.getSensitivitiesSummary(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListSensitivitiesFilterParameter** |  | (optional) defaults to undefined


### Return type

**SensitivitiesSummary**

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

# **getSensitivity**
> Sensitivity getSensitivity()

Get details of a sensitivity by providing its ID.

### Example


```typescript
import { createConfiguration, DataSensitivitiesApi } from '';
import type { DataSensitivitiesApiGetSensitivityRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataSensitivitiesApi(configuration);

const request: DataSensitivitiesApiGetSensitivityRequest = {
  
  sensitivityId: "sensitivityId_example",
};

const data = await apiInstance.getSensitivity(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivityId** | [**string**] |  | defaults to undefined


### Return type

**Sensitivity**

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

# **listSensitivities**
> ListSensitivities200Response listSensitivities()

Get a list of all the sensitivities based on an applied filter.

### Example


```typescript
import { createConfiguration, DataSensitivitiesApi } from '';
import type { DataSensitivitiesApiListSensitivitiesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DataSensitivitiesApi(configuration);

const request: DataSensitivitiesApiListSensitivitiesRequest = {
  
  filter: {
    resourceId: "arn:aws:s3::123456789101:polar-bucket_excel_sheet.xlsx",
    dataStoreId: "arn:aws:s3::123456789101:polar-bucket",
    sensitiveTag: "Business Email Address",
    sensitivityCategories: [
      "SECRETS",
    ],
    hash: "hash_example",
  },
  
  sort: {
    sortBy: "lastSeen",
    sortOrder: 1,
  },
  
  pageSize: 3.14,
  
  nextToken: "nextToken_example",
};

const data = await apiInstance.listSensitivities(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListSensitivitiesFilterParameter** |  | (optional) defaults to undefined
 **sort** | **LastSeenSortSchema** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListSensitivities200Response**

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


