# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuthServerServiceCreateOauthClient**](AuthServerServiceApi.md#AuthServerServiceCreateOauthClient) | **Post** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client.
[**AuthServerServiceDeleteOauthClient**](AuthServerServiceApi.md#AuthServerServiceDeleteOauthClient) | **Delete** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
[**AuthServerServiceGetAccessToken**](AuthServerServiceApi.md#AuthServerServiceGetAccessToken) | **Get** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret.
[**AuthServerServiceGetOauthClient**](AuthServerServiceApi.md#AuthServerServiceGetOauthClient) | **Get** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId.
[**AuthServerServiceGetUser**](AuthServerServiceApi.md#AuthServerServiceGetUser) | **Get** /api/v3/auth/user | Summary: Get user Description: Get user.
[**AuthServerServiceListOauthClient**](AuthServerServiceApi.md#AuthServerServiceListOauthClient) | **Get** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client.

# **AuthServerServiceCreateOauthClient**
> AuthserverCreateOauthClientResponse AuthServerServiceCreateOauthClient(ctx, body)
Summary: Create Oauth client Description: Create/register new Oauth client.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**AuthserverCreateOauthClientRequest**](AuthserverCreateOauthClientRequest.md)|  | 

### Return type

[**AuthserverCreateOauthClientResponse**](authserverCreateOauthClientResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AuthServerServiceDeleteOauthClient**
> AuthserverDeleteOauthClientResponse AuthServerServiceDeleteOauthClient(ctx, clientId)
Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **clientId** | **string**| ClientID of registered OAuth. | 

### Return type

[**AuthserverDeleteOauthClientResponse**](authserverDeleteOauthClientResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AuthServerServiceGetAccessToken**
> AuthserverGetAccessTokenResponse AuthServerServiceGetAccessToken(ctx, )
Summary: Get access token Description: Get access token from passed clientId and secret.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthserverGetAccessTokenResponse**](authserverGetAccessTokenResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AuthServerServiceGetOauthClient**
> AuthserverGetOauthClientResponse AuthServerServiceGetOauthClient(ctx, clientId)
Summary: Get Oauth client Description: Get registered Oauth client by clientId.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **clientId** | **string**| ClientID of registered OAuth. | 

### Return type

[**AuthserverGetOauthClientResponse**](authserverGetOauthClientResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AuthServerServiceGetUser**
> AuthserverGetUserResponse AuthServerServiceGetUser(ctx, )
Summary: Get user Description: Get user.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthserverGetUserResponse**](authserverGetUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AuthServerServiceListOauthClient**
> AuthserverListOauthClientResponse AuthServerServiceListOauthClient(ctx, )
Summary: List Oauth client Description: List all registered Oauth client.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**AuthserverListOauthClientResponse**](authserverListOauthClientResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

