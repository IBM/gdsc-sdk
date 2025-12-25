# DataSensitivitiesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensitivitiesSummary**](DataSensitivitiesApi.md#getSensitivitiesSummary) | **GET** /api/v2/dspm/sensitivities/summary | Get the summary of sensitivities
[**getSensitivity**](DataSensitivitiesApi.md#getSensitivity) | **GET** /api/v2/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
[**listSensitivities**](DataSensitivitiesApi.md#listSensitivities) | **GET** /api/v2/dspm/sensitivities | List sensitivities



## getSensitivitiesSummary

Get the summary of sensitivities

Get a summarised information about all sensitivities classified by Guardium DSPM.

### Example

```bash
 getSensitivitiesSummary  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListSensitivitiesFilterParameter**](.md) |  | [optional] [default to null]

### Return type

[**SensitivitiesSummary**](SensitivitiesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSensitivity

Get sensitivity details by providing its ID

Get details of a sensitivity by providing its ID.

### Example

```bash
 getSensitivity sensitivityId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivityId** | **string** |  | [default to null]

### Return type

[**Sensitivity**](Sensitivity.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listSensitivities

List sensitivities

Get a list of all the sensitivities based on an applied filter.

### Example

```bash
 listSensitivities  filter=value  sort=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListSensitivitiesFilterParameter**](.md) |  | [optional] [default to null]
 **sort** | [**LastSeenSortSchema**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListSensitivities200Response**](ListSensitivities200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

