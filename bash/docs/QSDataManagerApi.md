# QSDataManagerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSDataManagerGetMasterData**](QSDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities
Description: Retrieves All Dimension and Fact tables data.
[**qSDataManagerGetPluginData**](QSDataManagerApi.md#qSDataManagerGetPluginData) | **GET** /api/v3/datamanager/plugin | Summary: Plugins Details
Description: Retrieves All plugins information.
[**qSDataManagerRegisterScan**](QSDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails
Description: Register new data into scan dimension table.
[**qSDataManagerRetrieveScan**](QSDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails
Description: Fetch details from scan dimension table.



## qSDataManagerGetMasterData

Summary: master data for all entities
Description: Retrieves All Dimension and Fact tables data.

### Example

```bash
 qSDataManagerGetMasterData
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Qspmdatamanagerv3MasterDataResponse**](Qspmdatamanagerv3MasterDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSDataManagerGetPluginData

Summary: Plugins Details
Description: Retrieves All plugins information.

### Example

```bash
 qSDataManagerGetPluginData
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Qspmdatamanagerv3PluginDataResponse**](Qspmdatamanagerv3PluginDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSDataManagerRegisterScan

Summary: Insert ScanDetails
Description: Register new data into scan dimension table.

### Example

```bash
 qSDataManagerRegisterScan
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3ScanRequest** | [**Qspmdatamanagerv3ScanRequest**](Qspmdatamanagerv3ScanRequest.md) |  |

### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSDataManagerRetrieveScan

Summary: Fetch ScanDetails
Description: Fetch details from scan dimension table.

### Example

```bash
 qSDataManagerRetrieveScan scan_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scanId** | **string** |  | [default to null]

### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

