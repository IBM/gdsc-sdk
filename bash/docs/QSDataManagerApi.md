# QSDataManagerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSDataManagerGetAppDataForProvisionId**](QSDataManagerApi.md#qSDataManagerGetAppDataForProvisionId) | **GET** /api/v3/datamanager/application/{provision_id}/data | Summary: Fetch Application Provisoning Details
Description: Fetch details from app dimension entity for given provision id.
[**qSDataManagerGetMasterData**](QSDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities
Description: Retrieves All Dimension and Fact tables data.
[**qSDataManagerGetNetLocDimDataForScanId**](QSDataManagerApi.md#qSDataManagerGetNetLocDimDataForScanId) | **GET** /api/v3/datamanager/network/{scan_id}/data | Summary: Fetch Netlocation Details
Description: Fetch details from netloc dimension entity for a given scanid.
[**qSDataManagerInsertAllEntities**](QSDataManagerApi.md#qSDataManagerInsertAllEntities) | **POST** /api/v3/datamanager/all/entities | Summary: Insert Data
Description: Insert All Dimension and Fact tables data.
[**qSDataManagerRegisterScan**](QSDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails
Description: Register new data into scan dimension table.
[**qSDataManagerRetrieveScan**](QSDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails
Description: Fetch details from scan dimension table.
[**qSDataManagerSearchEntityData**](QSDataManagerApi.md#qSDataManagerSearchEntityData) | **POST** /api/v3/datamanager/entity/search | Summary: Retrieve Entity Data
Description:Retrieve Entity data for given parameters
[**qSDataManagerUpdateNetLocation**](QSDataManagerApi.md#qSDataManagerUpdateNetLocation) | **PUT** /api/v3/datamanager/network | Summary: Update Netlocation Details
Description: Update netloc dimension entity for agiven scanid.



## qSDataManagerGetAppDataForProvisionId

Summary: Fetch Application Provisoning Details
Description: Fetch details from app dimension entity for given provision id.

### Example

```bash
 qSDataManagerGetAppDataForProvisionId provision_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provisionId** | **string** | Identifier for the provision request | [default to null]

### Return type

[**Qspmdatamanagerv3AppDataResponse**](Qspmdatamanagerv3AppDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


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


## qSDataManagerGetNetLocDimDataForScanId

Summary: Fetch Netlocation Details
Description: Fetch details from netloc dimension entity for a given scanid.

### Example

```bash
 qSDataManagerGetNetLocDimDataForScanId scan_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scanId** | **string** | Identifier for the scan to retrieve netloc data for | [default to null]

### Return type

[**Qspmdatamanagerv3NetlocDataResponse**](Qspmdatamanagerv3NetlocDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSDataManagerInsertAllEntities

Summary: Insert Data
Description: Insert All Dimension and Fact tables data.

### Example

```bash
 qSDataManagerInsertAllEntities
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3InsertEntitiesRequest** | [**Qspmdatamanagerv3InsertEntitiesRequest**](Qspmdatamanagerv3InsertEntitiesRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
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


## qSDataManagerSearchEntityData

Summary: Retrieve Entity Data
Description:Retrieve Entity data for given parameters

### Example

```bash
 qSDataManagerSearchEntityData
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3SearchEntityDataRequest** | [**Qspmdatamanagerv3SearchEntityDataRequest**](Qspmdatamanagerv3SearchEntityDataRequest.md) |  |

### Return type

[**Qspmdatamanagerv3SearchEntityDataResponse**](Qspmdatamanagerv3SearchEntityDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSDataManagerUpdateNetLocation

Summary: Update Netlocation Details
Description: Update netloc dimension entity for agiven scanid.

### Example

```bash
 qSDataManagerUpdateNetLocation
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3UpdateNetLocRequest** | [**Qspmdatamanagerv3UpdateNetLocRequest**](Qspmdatamanagerv3UpdateNetLocRequest.md) |  |

### Return type

[**Qspmdatamanagerv3UpdateNetLocResponse**](Qspmdatamanagerv3UpdateNetLocResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

