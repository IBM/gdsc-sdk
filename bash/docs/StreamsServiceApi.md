# StreamsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamsServiceCheckAWSCredentials**](StreamsServiceApi.md#streamsServiceCheckAWSCredentials) | **POST** /api/v3/streams/credentials | Summary: Check AWS credentials
Description: Service to verify AWS credentials.
[**streamsServiceCheckAzureEventHub**](StreamsServiceApi.md#streamsServiceCheckAzureEventHub) | **POST** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub
Description: Service to check Azure event hub.
[**streamsServiceCheckAzureStorageString**](StreamsServiceApi.md#streamsServiceCheckAzureStorageString) | **POST** /api/v3/streams/azure_storage | Summary: Check Azure storage string
Description: Service to verify Azure storage connection.
[**streamsServiceGetAWSRegions**](StreamsServiceApi.md#streamsServiceGetAWSRegions) | **GET** /api/v3/streams/regions | Summary: Get AWS regions
Description: Service to get AWS regions.
[**streamsServiceListAWSStreams**](StreamsServiceApi.md#streamsServiceListAWSStreams) | **POST** /api/v3/streams | Summary: List AWS streams
Description: Service to list AWS Kinesis streams.



## streamsServiceCheckAWSCredentials

Summary: Check AWS credentials
Description: Service to verify AWS credentials.

### Example

```bash
 streamsServiceCheckAWSCredentials
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAWSCredentialsRequest** | [**Streamsv3CheckAWSCredentialsRequest**](Streamsv3CheckAWSCredentialsRequest.md) |  |

### Return type

[**Streamsv3CheckAWSCredentialsResponse**](Streamsv3CheckAWSCredentialsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## streamsServiceCheckAzureEventHub

Summary: Check Azure event hub
Description: Service to check Azure event hub.

### Example

```bash
 streamsServiceCheckAzureEventHub
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureEventHubRequest** | [**Streamsv3CheckAzureEventHubRequest**](Streamsv3CheckAzureEventHubRequest.md) |  |

### Return type

[**Streamsv3CheckAzureEventHubResponse**](Streamsv3CheckAzureEventHubResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## streamsServiceCheckAzureStorageString

Summary: Check Azure storage string
Description: Service to verify Azure storage connection.

### Example

```bash
 streamsServiceCheckAzureStorageString
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureStorageStringRequest** | [**Streamsv3CheckAzureStorageStringRequest**](Streamsv3CheckAzureStorageStringRequest.md) |  |

### Return type

[**Streamsv3CheckAzureStorageStringResponse**](Streamsv3CheckAzureStorageStringResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## streamsServiceGetAWSRegions

Summary: Get AWS regions
Description: Service to get AWS regions.

### Example

```bash
 streamsServiceGetAWSRegions
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Streamsv3GetAWSRegionsResponse**](Streamsv3GetAWSRegionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## streamsServiceListAWSStreams

Summary: List AWS streams
Description: Service to list AWS Kinesis streams.

### Example

```bash
 streamsServiceListAWSStreams
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3ListAWSStreamsRequest** | [**Streamsv3ListAWSStreamsRequest**](Streamsv3ListAWSStreamsRequest.md) |  |

### Return type

[**Streamsv3ListAWSStreamsResponse**](Streamsv3ListAWSStreamsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

