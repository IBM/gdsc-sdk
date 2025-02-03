# ThirdPartyVendorsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLinkedVendor**](ThirdPartyVendorsApi.md#getLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
[**getSingleLinkedVendor**](ThirdPartyVendorsApi.md#getSingleLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
[**listLinkedVendorDataStores**](ThirdPartyVendorsApi.md#listLinkedVendorDataStores) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
[**listLinkedVendors**](ThirdPartyVendorsApi.md#listLinkedVendors) | **GET** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
[**listTrustedAssets**](ThirdPartyVendorsApi.md#listTrustedAssets) | **GET** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets



## getLinkedVendor

Get additional details of a specific third party vendor

Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.

### Example

```bash
 getLinkedVendor vendorId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **string** | The third party vendor's account ID | [default to null]

### Return type

[**array[VendorSummary]**](VendorSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSingleLinkedVendor

Get the third party vendors list

Get details about a third party vendor.

### Example

```bash
 getSingleLinkedVendor vendorId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **string** | vendor id | [default to null]

### Return type

[**LinkedVendor**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listLinkedVendorDataStores

Get the data stores associated with a third party vendor

Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.

### Example

```bash
 listLinkedVendorDataStores vendorId=value  filter=value  sort=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **string** | The third party vendor's account ID | [default to null]
 **filter** | [**ListVendorDataStoresFilterParameter**](.md) |  | [optional] [default to null]
 **sort** | [**ListLinkedVendorDataStoresSortParameter**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListLinkedVendorDataStores200Response**](ListLinkedVendorDataStores200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listLinkedVendors

Get the summary of a third party vendor

Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium Insights SaaS DSPM only).

### Example

```bash
 listLinkedVendors
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**array[LinkedVendor]**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listTrustedAssets

Get a list of all the actual trusted assets

Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium Insights SaaS DSPM.

### Example

```bash
 listTrustedAssets  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**ListTrusteesFilterParameter**](.md) |  | [optional] [default to null]

### Return type

[**array[Trustee]**](Trustee.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

