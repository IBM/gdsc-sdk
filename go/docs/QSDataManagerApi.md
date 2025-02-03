# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QSDataManagerGetAppDataForProvisionId**](QSDataManagerApi.md#QSDataManagerGetAppDataForProvisionId) | **Get** /api/v3/datamanager/application/{provision_id}/data | Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.
[**QSDataManagerGetMasterData**](QSDataManagerApi.md#QSDataManagerGetMasterData) | **Get** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
[**QSDataManagerGetNetLocDimDataForScanId**](QSDataManagerApi.md#QSDataManagerGetNetLocDimDataForScanId) | **Get** /api/v3/datamanager/network/{scan_id}/data | Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.
[**QSDataManagerInsertAllEntities**](QSDataManagerApi.md#QSDataManagerInsertAllEntities) | **Post** /api/v3/datamanager/all/entities | Summary: Insert Data Description: Insert All Dimension and Fact tables data.
[**QSDataManagerRegisterScan**](QSDataManagerApi.md#QSDataManagerRegisterScan) | **Post** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
[**QSDataManagerRetrieveScan**](QSDataManagerApi.md#QSDataManagerRetrieveScan) | **Get** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
[**QSDataManagerSearchEntityData**](QSDataManagerApi.md#QSDataManagerSearchEntityData) | **Post** /api/v3/datamanager/entity/search | Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters
[**QSDataManagerUpdateNetLocation**](QSDataManagerApi.md#QSDataManagerUpdateNetLocation) | **Put** /api/v3/datamanager/network | Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.

# **QSDataManagerGetAppDataForProvisionId**
> Qspmdatamanagerv3AppDataResponse QSDataManagerGetAppDataForProvisionId(ctx, provisionId)
Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **provisionId** | **string**| Identifier for the provision request | 

### Return type

[**Qspmdatamanagerv3AppDataResponse**](qspmdatamanagerv3AppDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSDataManagerGetMasterData**
> Qspmdatamanagerv3MasterDataResponse QSDataManagerGetMasterData(ctx, )
Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Qspmdatamanagerv3MasterDataResponse**](qspmdatamanagerv3MasterDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSDataManagerGetNetLocDimDataForScanId**
> Qspmdatamanagerv3NetlocDataResponse QSDataManagerGetNetLocDimDataForScanId(ctx, scanId)
Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **scanId** | **string**| Identifier for the scan to retrieve netloc data for | 

### Return type

[**Qspmdatamanagerv3NetlocDataResponse**](qspmdatamanagerv3NetlocDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSDataManagerInsertAllEntities**
> Qspmdatamanagerv3StandardEmptyResponse QSDataManagerInsertAllEntities(ctx, body)
Summary: Insert Data Description: Insert All Dimension and Fact tables data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmdatamanagerv3InsertEntitiesRequest**](Qspmdatamanagerv3InsertEntitiesRequest.md)|  | 

### Return type

[**Qspmdatamanagerv3StandardEmptyResponse**](qspmdatamanagerv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSDataManagerRegisterScan**
> Qspmdatamanagerv3ScanResponse QSDataManagerRegisterScan(ctx, body)
Summary: Insert ScanDetails Description: Register new data into scan dimension table.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmdatamanagerv3ScanRequest**](Qspmdatamanagerv3ScanRequest.md)|  | 

### Return type

[**Qspmdatamanagerv3ScanResponse**](qspmdatamanagerv3ScanResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSDataManagerRetrieveScan**
> Qspmdatamanagerv3ScanResponse QSDataManagerRetrieveScan(ctx, scanId)
Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **scanId** | **string**|  | 

### Return type

[**Qspmdatamanagerv3ScanResponse**](qspmdatamanagerv3ScanResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSDataManagerSearchEntityData**
> Qspmdatamanagerv3SearchEntityDataResponse QSDataManagerSearchEntityData(ctx, body)
Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmdatamanagerv3SearchEntityDataRequest**](Qspmdatamanagerv3SearchEntityDataRequest.md)|  | 

### Return type

[**Qspmdatamanagerv3SearchEntityDataResponse**](qspmdatamanagerv3SearchEntityDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSDataManagerUpdateNetLocation**
> Qspmdatamanagerv3UpdateNetLocResponse QSDataManagerUpdateNetLocation(ctx, body)
Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmdatamanagerv3UpdateNetLocRequest**](Qspmdatamanagerv3UpdateNetLocRequest.md)|  | 

### Return type

[**Qspmdatamanagerv3UpdateNetLocResponse**](qspmdatamanagerv3UpdateNetLocResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

