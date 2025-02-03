# SnifAssistServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**snifAssistServiceTestRegex**](SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex
Description: Match a text string with a regular expression using the same sniffer 
code used in production to match a regex.



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

