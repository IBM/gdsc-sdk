# SnifAssistServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**snifAssistServiceGetSnifConfig**](SnifAssistServiceApi.md#snifAssistServiceGetSnifConfig) | **GET** /api/v3/snif/config | Summary: Get sniffer configuration parameters
Description: Get edge sniffer configuration parameters from GI-mothership.
[**snifAssistServiceGetSnifPolicy**](SnifAssistServiceApi.md#snifAssistServiceGetSnifPolicy) | **GET** /api/v3/snif/policy | Summary: Get sniffer policy
Description: Get edge sniffer policy from GI-mothership.
[**snifAssistServicePostSnifFeedback**](SnifAssistServiceApi.md#snifAssistServicePostSnifFeedback) | **POST** /api/v3/snif/feedback | Summary: Post sniffer feedback
Description: Post policy installation feedback to policy-builder service.
[**snifAssistServiceTestRegex**](SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex
Description: Match a text string with a regular expression using the same sniffer 
code used in production to match a regex.



## snifAssistServiceGetSnifConfig

Summary: Get sniffer configuration parameters
Description: Get edge sniffer configuration parameters from GI-mothership.

### Example

```bash
 snifAssistServiceGetSnifConfig  tenant_id=value  edge_id=value  config_type=value  config_id=value  configuration_parameters_crc=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Provide tenant_id. | [optional] [default to null]
 **edgeId** | **string** | Provide edge_id. | [optional] [default to null]
 **configType** | **string** | Provide configuration type. | [optional] [default to null]
 **configId** | **string** | Specify config_id provided by configuration service. | [optional] [default to null]
 **configurationParametersCrc** | **integer** | Provide CRC value of configuration parameters that sniffer is currently using. | [optional] [default to null]

### Return type

[**Snifassistv3GetSnifConfigResponse**](Snifassistv3GetSnifConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## snifAssistServiceGetSnifPolicy

Summary: Get sniffer policy
Description: Get edge sniffer policy from GI-mothership.

### Example

```bash
 snifAssistServiceGetSnifPolicy  tenant_id=value  edge_id=value  policy_crc=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Specify tenant_id. | [optional] [default to null]
 **edgeId** | **string** | Specify edge_id if known. | [optional] [default to null]
 **policyCrc** | **integer** | Provide CRC value of installed policy that sniffer is currently using. | [optional] [default to null]

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## snifAssistServicePostSnifFeedback

Summary: Post sniffer feedback
Description: Post policy installation feedback to policy-builder service.

### Example

```bash
 snifAssistServicePostSnifFeedback
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3PostSnifFeedbackRequest** | [**Snifassistv3PostSnifFeedbackRequest**](Snifassistv3PostSnifFeedbackRequest.md) |  |

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## snifAssistServiceTestRegex

Summary: Test regex
Description: Match a text string with a regular expression using the same sniffer 
code used in production to match a regex.

### Example

```bash
 snifAssistServiceTestRegex
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3TestRegexRequest** | [**Snifassistv3TestRegexRequest**](Snifassistv3TestRegexRequest.md) |  |

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

