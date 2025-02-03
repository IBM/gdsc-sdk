# AnalyticsEventsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsEventsServiceDeleteCacheKey**](AnalyticsEventsServiceApi.md#analyticsEventsServiceDeleteCacheKey) | **DELETE** /api/v3/eventscache/{cache_key} | Summary: Delete cache key
Description: Return delete key result message.
[**analyticsEventsServicePostQSAdvisorRisk**](AnalyticsEventsServiceApi.md#analyticsEventsServicePostQSAdvisorRisk) | **POST** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only
Description: Sends QS Advisor risk notification with recipients and returns a status



## analyticsEventsServiceDeleteCacheKey

Summary: Delete cache key
Description: Return delete key result message.

### Example

```bash
 analyticsEventsServiceDeleteCacheKey cache_key=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cacheKey** | **string** | The cache key to delete. | [default to null]
 **analyticseventsv3DeleteCacheKeyRequest** | [**Analyticseventsv3DeleteCacheKeyRequest**](Analyticseventsv3DeleteCacheKeyRequest.md) |  |

### Return type

[**Analyticseventsv3DeleteCacheKeyResponse**](Analyticseventsv3DeleteCacheKeyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsEventsServicePostQSAdvisorRisk

Summary: For QS Advisor risk notification only
Description: Sends QS Advisor risk notification with recipients and returns a status

### Example

```bash
 analyticsEventsServicePostQSAdvisorRisk
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticseventsv3PostQSAdvisorRiskRequest** | [**Analyticseventsv3PostQSAdvisorRiskRequest**](Analyticseventsv3PostQSAdvisorRiskRequest.md) |  |

### Return type

[**Analyticseventsv3PostQSAdvisorRiskResponse**](Analyticseventsv3PostQSAdvisorRiskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

