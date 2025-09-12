# .DataResourcesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataResource**](DataResourcesApi.md#getDataResource) | **GET** /api/v2/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
[**getDataResourcesSummary**](DataResourcesApi.md#getDataResourcesSummary) | **GET** /api/v2/dspm/dataResources/summary | Data resources summary
[**listDataResources**](DataResourcesApi.md#listDataResources) | **GET** /api/v2/dspm/dataResources | List data resources that match a given filter
[**listDataResourcesNames**](DataResourcesApi.md#listDataResourcesNames) | **GET** /api/v2/dspm/dataResources/names | List names of data resources
[**removeResource**](DataResourcesApi.md#removeResource) | **DELETE** /api/v2/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from DSPM
[**updateResourceReviewStatus**](DataResourcesApi.md#updateResourceReviewStatus) | **PUT** /api/v2/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource


# **getDataResource**
> DataResource getDataResource()

Get additional details on a specific data resource by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiGetDataResourceRequest = {
  // string | Data resource ID
  dataResourceId: "arn:aws:s3::12345678910:polar-security-corplex.xlsx",
};

apiInstance.getDataResource(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataResourceId** | [**string**] | Data resource ID | defaults to undefined


### Return type

**DataResource**

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

# **getDataResourcesSummary**
> DataResourcesSummary getDataResourcesSummary()

Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiGetDataResourcesSummaryRequest = {
  // string | Data store id (optional)
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  // ListDataResourcesFilterParameter (optional)
  filter: {
    isReviewed: true,
    resourceOwners: ["Avi"],
    resourceNames: ["myFile.txt","myExcel.xlsx"],
    resourceTypes: ["File","Table"],
    sensitivityTags: ["BUSINESS_EMAIL_ADDRESS","CREDIT_CARD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    resourcePartialName: "resourcePartialName_example",
  },
};

apiInstance.getDataResourcesSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | [**string**] | Data store id | (optional) defaults to undefined
 **filter** | **ListDataResourcesFilterParameter** |  | (optional) defaults to undefined


### Return type

**DataResourcesSummary**

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

# **listDataResources**
> ListDataResources200Response listDataResources()

Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiListDataResourcesRequest = {
  // string (optional)
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  // ListDataResourcesFilterParameter (optional)
  filter: {
    isReviewed: true,
    resourceOwners: ["Avi"],
    resourceNames: ["myFile.txt","myExcel.xlsx"],
    resourceTypes: ["File","Table"],
    sensitivityTags: ["BUSINESS_EMAIL_ADDRESS","CREDIT_CARD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    resourcePartialName: "resourcePartialName_example",
  },
  // ListDataResourcesSortParameter (optional)
  sort: {
    sortBy: "creationTime",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listDataResources(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | [**string**] |  | (optional) defaults to undefined
 **filter** | **ListDataResourcesFilterParameter** |  | (optional) defaults to undefined
 **sort** | **ListDataResourcesSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListDataResources200Response**

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

# **listDataResourcesNames**
> Array<string> listDataResourcesNames()

List and filter data resources by their names

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiListDataResourcesNamesRequest = {
  // string | Prefix of data resource name
  prefix: "check",
  // string (optional)
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
};

apiInstance.listDataResourcesNames(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of data resource name | defaults to undefined
 **dataStoreId** | [**string**] |  | (optional) defaults to undefined


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

# **removeResource**
> RemoveResource200Response removeResource()

Removes a resource, with all its sensitivities, from Guardium DSPM dashboard. This action does not remove the resource from the resource\'s source environment.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiRemoveResourceRequest = {
  // string | Data resource ID
  dataResourceId: "arn:aws:s3::12345678910:polar-security-corplex.xlsx",
  // string | Data store ID
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
};

apiInstance.removeResource(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataResourceId** | [**string**] | Data resource ID | defaults to undefined
 **dataStoreId** | [**string**] | Data store ID | defaults to undefined


### Return type

**RemoveResource200Response**

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

# **updateResourceReviewStatus**
> UpdateResourceReviewStatus200Response updateResourceReviewStatus(updateResourceReviewBody)

Set the review status of a specific data resource in a specific data store.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiUpdateResourceReviewStatusRequest = {
  // string | Data resource id
  dataResourceId: "dataResourceId_example",
  // UpdateResourceReviewBody
  updateResourceReviewBody: {
    isReviewed: true,
  },
};

apiInstance.updateResourceReviewStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateResourceReviewBody** | **UpdateResourceReviewBody**|  |
 **dataResourceId** | [**string**] | Data resource id | defaults to undefined


### Return type

**UpdateResourceReviewStatus200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


