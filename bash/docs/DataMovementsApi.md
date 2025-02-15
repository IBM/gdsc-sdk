# DataMovementsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActualFlow**](DataMovementsApi.md#getActualFlow) | **GET** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
[**getActualFlowsSummary**](DataMovementsApi.md#getActualFlowsSummary) | **GET** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
[**getPotentialFlow**](DataMovementsApi.md#getPotentialFlow) | **GET** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
[**getPotentialFlowPath**](DataMovementsApi.md#getPotentialFlowPath) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
[**getPotentialFlowsSummary**](DataMovementsApi.md#getPotentialFlowsSummary) | **GET** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
[**listActualFlowPaths**](DataMovementsApi.md#listActualFlowPaths) | **GET** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
[**listActualFlows**](DataMovementsApi.md#listActualFlows) | **GET** /api/v1/dspm/dataMovements/actualFlows | List actual flows
[**listPotentialFlows**](DataMovementsApi.md#listPotentialFlows) | **GET** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
[**listPotentialFlowsPaths**](DataMovementsApi.md#listPotentialFlowsPaths) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths



## getActualFlow

Get actual flow by providing its ID

Get a detailed information about an actual flow by providing its ID.

### Example

```bash
 getActualFlow id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | [default to null]

### Return type

[**ActualFlow**](ActualFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getActualFlowsSummary

Get summary of actual flows

Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.

### Example

```bash
 getActualFlowsSummary  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListActualFlowsFilterParameter**](.md) |  | [optional] [default to null]

### Return type

[**ActualFlowsSummary**](ActualFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPotentialFlow

Get potential flow by providing its ID

Get a detailed information about a potential flow by providing the flow ID.

### Example

```bash
 getPotentialFlow flowId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **string** |  | [default to null]

### Return type

[**PotentialFlow**](PotentialFlow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPotentialFlowPath

Get potential flow path by providing its ID

Get details of a specific potential flow of data by providing its ID.

### Example

```bash
 getPotentialFlowPath flowPathId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowPathId** | **string** |  | [default to null]

### Return type

[**PotentialFlowPath**](PotentialFlowPath.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPotentialFlowsSummary

Get summary of potential flows according to the filter applied

Get a summary of all the potential flows based on a filter applied.

### Example

```bash
 getPotentialFlowsSummary  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsFilterOptions**](.md) |  | [optional] [default to null]

### Return type

[**PotentialFlowsSummary**](PotentialFlowsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listActualFlowPaths

Get summary of actual flows according to the filter applied

Get detailed information about the actual flows according to the filter applied.

### Example

```bash
 listActualFlowPaths  sort=value  filter=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**ListActualFlowPathsSortParameter**](.md) |  | [optional] [default to null]
 **filter** | [**ListActualFlowPathsFilterParameter**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListActualFlowPaths200Response**](ListActualFlowPaths200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listActualFlows

List actual flows

List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.

### Example

```bash
 listActualFlows  sort=value  filter=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | [**ListActualFlowsSortParameter**](.md) |  | [optional] [default to null]
 **filter** | [**ListActualFlowsFilterParameter**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListActualFlows200Response**](ListActualFlows200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listPotentialFlows

List potential flows

List all the potential flows of users and services across your entire cloud accounts and SaaS applications.

### Example

```bash
 listPotentialFlows  filter=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsFilterOptions**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListPotentialFlows200Response**](ListPotentialFlows200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listPotentialFlowsPaths

List potential flow paths

List all the potential flow paths based on an applied filter.

### Example

```bash
 listPotentialFlowsPaths  filter=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**PotentialFlowsPathsFilterOptions**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListPotentialFlowsPaths200Response**](ListPotentialFlowsPaths200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

