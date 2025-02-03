# .ThirdPartyVendorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLinkedVendor**](ThirdPartyVendorsApi.md#getLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
[**getSingleLinkedVendor**](ThirdPartyVendorsApi.md#getSingleLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
[**listLinkedVendorDataStores**](ThirdPartyVendorsApi.md#listLinkedVendorDataStores) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
[**listLinkedVendors**](ThirdPartyVendorsApi.md#listLinkedVendors) | **GET** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
[**listTrustedAssets**](ThirdPartyVendorsApi.md#listTrustedAssets) | **GET** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets


# **getLinkedVendor**
> Array<VendorSummary> getLinkedVendor()

Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiGetLinkedVendorRequest = {
  // string | The third party vendor\'s account ID
  vendorId: "123456789101",
};

apiInstance.getLinkedVendor(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | [**string**] | The third party vendor\&#39;s account ID | defaults to undefined


### Return type

**Array<VendorSummary>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSingleLinkedVendor**
> LinkedVendor getSingleLinkedVendor()

Get details about a third party vendor.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiGetSingleLinkedVendorRequest = {
  // string | vendor id
  vendorId: "123456789101",
};

apiInstance.getSingleLinkedVendor(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | [**string**] | vendor id | defaults to undefined


### Return type

**LinkedVendor**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listLinkedVendorDataStores**
> ListLinkedVendorDataStores200Response listLinkedVendorDataStores()

Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiListLinkedVendorDataStoresRequest = {
  // string | The third party vendor\'s account ID
  vendorId: "123456789101",
  // ListVendorDataStoresFilterParameter (optional)
  filter: {
    cloudAccountId: "cloudAccountId_example",
    dataStoreId: "dataStoreId_example",
    dataStoreType: "dataStoreType_example",
    dataStoreName: "dataStoreName_example",
    cloudRegion: "cloudRegion_example",
    cloudProvider: "aws",
  },
  // ListLinkedVendorDataStoresSortParameter (optional)
  sort: {
    sortBy: "dataStoreId",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listLinkedVendorDataStores(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | [**string**] | The third party vendor\&#39;s account ID | defaults to undefined
 **filter** | **ListVendorDataStoresFilterParameter** |  | (optional) defaults to undefined
 **sort** | **ListLinkedVendorDataStoresSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListLinkedVendorDataStores200Response**

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

# **listLinkedVendors**
> Array<LinkedVendor> listLinkedVendors()

Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium Insights SaaS DSPM only).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:any = {};

apiInstance.listLinkedVendors(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<LinkedVendor>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listTrustedAssets**
> Array<Trustee> listTrustedAssets()

Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium Insights SaaS DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiListTrustedAssetsRequest = {
  // ListTrusteesFilterParameter (optional)
  filter: {
    vendorId: "123456789101",
    dataStoreId: "123456789101",
    cloudAccountId: "123456789101",
  },
};

apiInstance.listTrustedAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListTrusteesFilterParameter** |  | (optional) defaults to undefined


### Return type

**Array<Trustee>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


