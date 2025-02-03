# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLinkedVendor**](ThirdPartyVendorsApi.md#GetLinkedVendor) | **Get** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
[**GetSingleLinkedVendor**](ThirdPartyVendorsApi.md#GetSingleLinkedVendor) | **Get** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
[**ListLinkedVendorDataStores**](ThirdPartyVendorsApi.md#ListLinkedVendorDataStores) | **Get** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
[**ListLinkedVendors**](ThirdPartyVendorsApi.md#ListLinkedVendors) | **Get** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
[**ListTrustedAssets**](ThirdPartyVendorsApi.md#ListTrustedAssets) | **Get** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets

# **GetLinkedVendor**
> []VendorSummary GetLinkedVendor(ctx, vendorId)
Get additional details of a specific third party vendor

Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **vendorId** | **string**| The third party vendor&#x27;s account ID | 

### Return type

[**[]VendorSummary**](VendorSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSingleLinkedVendor**
> LinkedVendor GetSingleLinkedVendor(ctx, vendorId)
Get the third party vendors list

Get details about a third party vendor.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **vendorId** | **string**| vendor id | 

### Return type

[**LinkedVendor**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListLinkedVendorDataStores**
> ListLinkedVendorDataStores200Response ListLinkedVendorDataStores(ctx, vendorId, optional)
Get the data stores associated with a third party vendor

Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **vendorId** | **string**| The third party vendor&#x27;s account ID | 
 **optional** | ***ThirdPartyVendorsApiListLinkedVendorDataStoresOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ThirdPartyVendorsApiListLinkedVendorDataStoresOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **filter** | [**optional.Interface of ListVendorDataStoresFilterParameter**](.md)|  | 
 **sort** | [**optional.Interface of ListLinkedVendorDataStoresSortParameter**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListLinkedVendorDataStores200Response**](listLinkedVendorDataStores_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListLinkedVendors**
> []LinkedVendor ListLinkedVendors(ctx, )
Get the summary of a third party vendor

Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium Insights SaaS DSPM only).

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]LinkedVendor**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListTrustedAssets**
> []Trustee ListTrustedAssets(ctx, optional)
Get a list of all the actual trusted assets

Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium Insights SaaS DSPM.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ThirdPartyVendorsApiListTrustedAssetsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ThirdPartyVendorsApiListTrustedAssetsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of ListTrusteesFilterParameter**](.md)|  | 

### Return type

[**[]Trustee**](Trustee.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

