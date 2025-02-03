# .StreamsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamsServiceCheckAWSCredentials**](StreamsServiceApi.md#streamsServiceCheckAWSCredentials) | **POST** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials.
[**streamsServiceCheckAzureEventHub**](StreamsServiceApi.md#streamsServiceCheckAzureEventHub) | **POST** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub.
[**streamsServiceCheckAzureStorageString**](StreamsServiceApi.md#streamsServiceCheckAzureStorageString) | **POST** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection.
[**streamsServiceGetAWSRegions**](StreamsServiceApi.md#streamsServiceGetAWSRegions) | **GET** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions.
[**streamsServiceListAWSStreams**](StreamsServiceApi.md#streamsServiceListAWSStreams) | **POST** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams.


# **streamsServiceCheckAWSCredentials**
> Streamsv3CheckAWSCredentialsResponse streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceCheckAWSCredentialsRequest = {
  // Streamsv3CheckAWSCredentialsRequest
  streamsv3CheckAWSCredentialsRequest: {
    accessKeyId: "accessKeyId_example",
    authType: "SECURITY_CREDENTIALS",
    id: "id_example",
    region: "region_example",
    roleArn: "roleArn_example",
    secretKeyId: "secretKeyId_example",
    streamName: "streamName_example",
    streamType: "AWS_KINESIS",
  },
};

apiInstance.streamsServiceCheckAWSCredentials(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAWSCredentialsRequest** | **Streamsv3CheckAWSCredentialsRequest**|  |


### Return type

**Streamsv3CheckAWSCredentialsResponse**

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

# **streamsServiceCheckAzureEventHub**
> Streamsv3CheckAzureEventHubResponse streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceCheckAzureEventHubRequest = {
  // Streamsv3CheckAzureEventHubRequest
  streamsv3CheckAzureEventHubRequest: {
    accessKeyId: "accessKeyId_example",
    id: "id_example",
    namespace: "namespace_example",
    secretKeyId: "secretKeyId_example",
    streamName: "streamName_example",
    streamType: "AWS_KINESIS",
  },
};

apiInstance.streamsServiceCheckAzureEventHub(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureEventHubRequest** | **Streamsv3CheckAzureEventHubRequest**|  |


### Return type

**Streamsv3CheckAzureEventHubResponse**

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

# **streamsServiceCheckAzureStorageString**
> Streamsv3CheckAzureStorageStringResponse streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceCheckAzureStorageStringRequest = {
  // Streamsv3CheckAzureStorageStringRequest
  streamsv3CheckAzureStorageStringRequest: {
    connectionString: "connectionString_example",
  },
};

apiInstance.streamsServiceCheckAzureStorageString(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureStorageStringRequest** | **Streamsv3CheckAzureStorageStringRequest**|  |


### Return type

**Streamsv3CheckAzureStorageStringResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **streamsServiceGetAWSRegions**
> Streamsv3GetAWSRegionsResponse streamsServiceGetAWSRegions()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:any = {};

apiInstance.streamsServiceGetAWSRegions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Streamsv3GetAWSRegionsResponse**

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

# **streamsServiceListAWSStreams**
> Streamsv3ListAWSStreamsResponse streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceListAWSStreamsRequest = {
  // Streamsv3ListAWSStreamsRequest
  streamsv3ListAWSStreamsRequest: {
    accessKeyId: "accessKeyId_example",
    authType: "SECURITY_CREDENTIALS",
    id: "id_example",
    region: [
      "region_example",
    ],
    roleArn: "roleArn_example",
    secretKeyId: "secretKeyId_example",
    streamType: "AWS_KINESIS",
  },
};

apiInstance.streamsServiceListAWSStreams(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3ListAWSStreamsRequest** | **Streamsv3ListAWSStreamsRequest**|  |


### Return type

**Streamsv3ListAWSStreamsResponse**

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


