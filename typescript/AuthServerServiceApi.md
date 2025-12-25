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
import { createConfiguration, AuthServerServiceApi } from '';
import type { AuthServerServiceApiAuthServerServiceCreateOauthClientRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AuthServerServiceApi(configuration);

const request: AuthServerServiceApiAuthServerServiceCreateOauthClientRequest = {
  
  authserverCreateOauthClientRequest: {
    description: "description_example",
    name: "name_example",
  },
};

const data = await apiInstance.authServerServiceCreateOauthClient(request);
console.log('API called successfully. Returned data:', data);
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
import { createConfiguration, AuthServerServiceApi } from '';
import type { AuthServerServiceApiAuthServerServiceDeleteOauthClientRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AuthServerServiceApi(configuration);

const request: AuthServerServiceApiAuthServerServiceDeleteOauthClientRequest = {
    // ClientID of registered OAuth.
  clientId: "client_id_example",
};

const data = await apiInstance.authServerServiceDeleteOauthClient(request);
console.log('API called successfully. Returned data:', data);
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
import { createConfiguration, AuthServerServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new AuthServerServiceApi(configuration);

const request = {};

const data = await apiInstance.authServerServiceGetAccessToken(request);
console.log('API called successfully. Returned data:', data);
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
import { createConfiguration, AuthServerServiceApi } from '';
import type { AuthServerServiceApiAuthServerServiceGetOauthClientRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AuthServerServiceApi(configuration);

const request: AuthServerServiceApiAuthServerServiceGetOauthClientRequest = {
    // ClientID of registered OAuth.
  clientId: "client_id_example",
};

const data = await apiInstance.authServerServiceGetOauthClient(request);
console.log('API called successfully. Returned data:', data);
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
import { createConfiguration, AuthServerServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new AuthServerServiceApi(configuration);

const request = {};

const data = await apiInstance.authServerServiceGetUser(request);
console.log('API called successfully. Returned data:', data);
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
import { createConfiguration, AuthServerServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new AuthServerServiceApi(configuration);

const request = {};

const data = await apiInstance.authServerServiceListOauthClient(request);
console.log('API called successfully. Returned data:', data);
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


