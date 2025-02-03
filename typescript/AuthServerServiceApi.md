# .AuthServerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authServerServiceCreateOauthClient**](AuthServerServiceApi.md#authServerServiceCreateOauthClient) | **POST** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client.
[**authServerServiceDeleteOauthClient**](AuthServerServiceApi.md#authServerServiceDeleteOauthClient) | **DELETE** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
[**authServerServiceGetAccessToken**](AuthServerServiceApi.md#authServerServiceGetAccessToken) | **GET** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret.
[**authServerServiceGetOauthClient**](AuthServerServiceApi.md#authServerServiceGetOauthClient) | **GET** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId.
[**authServerServiceGetUser**](AuthServerServiceApi.md#authServerServiceGetUser) | **GET** /api/v3/auth/user | Summary: Get user Description: Get user.
[**authServerServiceListOauthClient**](AuthServerServiceApi.md#authServerServiceListOauthClient) | **GET** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client.


# **authServerServiceCreateOauthClient**
> AuthserverCreateOauthClientResponse authServerServiceCreateOauthClient(authserverCreateOauthClientRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:.AuthServerServiceApiAuthServerServiceCreateOauthClientRequest = {
  // AuthserverCreateOauthClientRequest
  authserverCreateOauthClientRequest: {
    description: "description_example",
    name: "name_example",
  },
};

apiInstance.authServerServiceCreateOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authserverCreateOauthClientRequest** | **AuthserverCreateOauthClientRequest**|  |


### Return type

**AuthserverCreateOauthClientResponse**

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

# **authServerServiceDeleteOauthClient**
> any authServerServiceDeleteOauthClient()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:.AuthServerServiceApiAuthServerServiceDeleteOauthClientRequest = {
  // string | ClientID of registered OAuth.
  clientId: "client_id_example",
};

apiInstance.authServerServiceDeleteOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**string**] | ClientID of registered OAuth. | defaults to undefined


### Return type

**any**

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

# **authServerServiceGetAccessToken**
> AuthserverGetAccessTokenResponse authServerServiceGetAccessToken()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:any = {};

apiInstance.authServerServiceGetAccessToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthserverGetAccessTokenResponse**

### Authorization

[BasicAuth](README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **authServerServiceGetOauthClient**
> AuthserverGetOauthClientResponse authServerServiceGetOauthClient()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:.AuthServerServiceApiAuthServerServiceGetOauthClientRequest = {
  // string | ClientID of registered OAuth.
  clientId: "client_id_example",
};

apiInstance.authServerServiceGetOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**string**] | ClientID of registered OAuth. | defaults to undefined


### Return type

**AuthserverGetOauthClientResponse**

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

# **authServerServiceGetUser**
> AuthserverGetUserResponse authServerServiceGetUser()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:any = {};

apiInstance.authServerServiceGetUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthserverGetUserResponse**

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

# **authServerServiceListOauthClient**
> AuthserverListOauthClientResponse authServerServiceListOauthClient()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:any = {};

apiInstance.authServerServiceListOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthserverListOauthClientResponse**

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


