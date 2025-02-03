# AuthServerServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**authServerServiceCreateOauthClient**](AuthServerServiceApi.md#authServerServiceCreateOauthClient) | **POST** /api/v3/oauth/clients | Summary: Create Oauth client
Description: Create/register new Oauth client.
[**authServerServiceDeleteOauthClient**](AuthServerServiceApi.md#authServerServiceDeleteOauthClient) | **DELETE** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client
Description: Delete registered Oauth client by clientId.
[**authServerServiceGetAccessToken**](AuthServerServiceApi.md#authServerServiceGetAccessToken) | **GET** /api/v3/oauth/token | Summary: Get access token
Description: Get access token from passed clientId and secret.
[**authServerServiceGetOauthClient**](AuthServerServiceApi.md#authServerServiceGetOauthClient) | **GET** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client
Description: Get registered Oauth client by clientId.
[**authServerServiceGetUser**](AuthServerServiceApi.md#authServerServiceGetUser) | **GET** /api/v3/auth/user | Summary: Get user
Description: Get user.
[**authServerServiceListOauthClient**](AuthServerServiceApi.md#authServerServiceListOauthClient) | **GET** /api/v3/oauth/clients | Summary: List Oauth client
Description: List all registered Oauth client.



## authServerServiceCreateOauthClient

Summary: Create Oauth client
Description: Create/register new Oauth client.

### Example

```bash
 authServerServiceCreateOauthClient
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authserverCreateOauthClientRequest** | [**AuthserverCreateOauthClientRequest**](AuthserverCreateOauthClientRequest.md) |  |

### Return type

[**AuthserverCreateOauthClientResponse**](AuthserverCreateOauthClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authServerServiceDeleteOauthClient

Summary: Delete Oauth client
Description: Delete registered Oauth client by clientId.

### Example

```bash
 authServerServiceDeleteOauthClient client_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **string** | ClientID of registered OAuth. | [default to null]

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authServerServiceGetAccessToken

Summary: Get access token
Description: Get access token from passed clientId and secret.

### Example

```bash
 authServerServiceGetAccessToken
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthserverGetAccessTokenResponse**](AuthserverGetAccessTokenResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authServerServiceGetOauthClient

Summary: Get Oauth client
Description: Get registered Oauth client by clientId.

### Example

```bash
 authServerServiceGetOauthClient client_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **string** | ClientID of registered OAuth. | [default to null]

### Return type

[**AuthserverGetOauthClientResponse**](AuthserverGetOauthClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authServerServiceGetUser

Summary: Get user
Description: Get user.

### Example

```bash
 authServerServiceGetUser
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthserverGetUserResponse**](AuthserverGetUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authServerServiceListOauthClient

Summary: List Oauth client
Description: List all registered Oauth client.

### Example

```bash
 authServerServiceListOauthClient
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthserverListOauthClientResponse**](AuthserverListOauthClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

