# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StreamsServiceCheckAWSCredentials**](StreamsServiceApi.md#StreamsServiceCheckAWSCredentials) | **Post** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials.
[**StreamsServiceCheckAzureEventHub**](StreamsServiceApi.md#StreamsServiceCheckAzureEventHub) | **Post** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub.
[**StreamsServiceCheckAzureStorageString**](StreamsServiceApi.md#StreamsServiceCheckAzureStorageString) | **Post** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection.
[**StreamsServiceGetAWSRegions**](StreamsServiceApi.md#StreamsServiceGetAWSRegions) | **Get** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions.
[**StreamsServiceListAWSStreams**](StreamsServiceApi.md#StreamsServiceListAWSStreams) | **Post** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams.

# **StreamsServiceCheckAWSCredentials**
> Streamsv3CheckAwsCredentialsResponse StreamsServiceCheckAWSCredentials(ctx, body)
Summary: Check AWS credentials Description: Service to verify AWS credentials.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Streamsv3CheckAwsCredentialsRequest**](Streamsv3CheckAwsCredentialsRequest.md)|  | 

### Return type

[**Streamsv3CheckAwsCredentialsResponse**](streamsv3CheckAWSCredentialsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsServiceCheckAzureEventHub**
> Streamsv3CheckAzureEventHubResponse StreamsServiceCheckAzureEventHub(ctx, body)
Summary: Check Azure event hub Description: Service to check Azure event hub.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Streamsv3CheckAzureEventHubRequest**](Streamsv3CheckAzureEventHubRequest.md)|  | 

### Return type

[**Streamsv3CheckAzureEventHubResponse**](streamsv3CheckAzureEventHubResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsServiceCheckAzureStorageString**
> Streamsv3CheckAzureStorageStringResponse StreamsServiceCheckAzureStorageString(ctx, body)
Summary: Check Azure storage string Description: Service to verify Azure storage connection.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Streamsv3CheckAzureStorageStringRequest**](Streamsv3CheckAzureStorageStringRequest.md)|  | 

### Return type

[**Streamsv3CheckAzureStorageStringResponse**](streamsv3CheckAzureStorageStringResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsServiceGetAWSRegions**
> Streamsv3GetAwsRegionsResponse StreamsServiceGetAWSRegions(ctx, )
Summary: Get AWS regions Description: Service to get AWS regions.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Streamsv3GetAwsRegionsResponse**](streamsv3GetAWSRegionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsServiceListAWSStreams**
> Streamsv3ListAwsStreamsResponse StreamsServiceListAWSStreams(ctx, body)
Summary: List AWS streams Description: Service to list AWS Kinesis streams.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Streamsv3ListAwsStreamsRequest**](Streamsv3ListAwsStreamsRequest.md)|  | 

### Return type

[**Streamsv3ListAwsStreamsResponse**](streamsv3ListAWSStreamsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

