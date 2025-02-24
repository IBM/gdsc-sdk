# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#AddVulnerabilityStatusComment) | **Post** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
[**GetVulnerabilitiesSummary**](DataVulnerabilitiesApi.md#GetVulnerabilitiesSummary) | **Get** /api/v1/dspm/vulnerabilities/summary | Get vulnerabilities summary
[**GetVulnerability**](DataVulnerabilitiesApi.md#GetVulnerability) | **Get** /api/v1/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
[**ListVulnerabilities**](DataVulnerabilitiesApi.md#ListVulnerabilities) | **Get** /api/v1/dspm/vulnerabilities | List vulnerabilities based on an applied filter
[**ListVulnerabilitiesByDataStore**](DataVulnerabilitiesApi.md#ListVulnerabilitiesByDataStore) | **Get** /api/v1/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
[**RemoveVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#RemoveVulnerabilityStatusComment) | **Delete** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
[**SetVulnerabilityStatus**](DataVulnerabilitiesApi.md#SetVulnerabilityStatus) | **Post** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
[**UpdateVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#UpdateVulnerabilityStatusComment) | **Put** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status

# **AddVulnerabilityStatusComment**
> VulnerabilityStatus AddVulnerabilityStatusComment(ctx, body, vulnerabilityId, statusId)
Add vulnerability status comment

Add or update the status comment of a vulnerability status to keep track of the workflow progress.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**AddCommentBody**](AddCommentBody.md)|  | 
  **vulnerabilityId** | **string**|  | 
  **statusId** | **string**|  | 

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetVulnerabilitiesSummary**
> VulnerabilitiesSummary GetVulnerabilitiesSummary(ctx, optional)
Get vulnerabilities summary

Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility's type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataVulnerabilitiesApiGetVulnerabilitiesSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataVulnerabilitiesApiGetVulnerabilitiesSummaryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of VulnerabilitiesFilterOptions**](.md)|  | 

### Return type

[**VulnerabilitiesSummary**](VulnerabilitiesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetVulnerability**
> Vulnerability GetVulnerability(ctx, vulnerabilityId)
Get vulnerability details by ID

Get vulnerability details by providing its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **vulnerabilityId** | **string**|  | 

### Return type

[**Vulnerability**](Vulnerability.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListVulnerabilities**
> ListVulnerabilities200Response ListVulnerabilities(ctx, optional)
List vulnerabilities based on an applied filter

Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataVulnerabilitiesApiListVulnerabilitiesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataVulnerabilitiesApiListVulnerabilitiesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of VulnerabilitiesFilterOptions**](.md)|  | 
 **sort** | [**optional.Interface of ListVulnerabilitiesSortParameter**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListVulnerabilities200Response**](listVulnerabilities_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListVulnerabilitiesByDataStore**
> ListVulnerabilitiesByDataStore200Response ListVulnerabilitiesByDataStore(ctx, optional)
List vulnerabilities of data stores

Get a list of all the vulnerabilities of data stores.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DataVulnerabilitiesApiListVulnerabilitiesByDataStoreOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DataVulnerabilitiesApiListVulnerabilitiesByDataStoreOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**optional.Interface of VulnerabilitiesByDataStoreFilterOptions**](.md)|  | 
 **sort** | [**optional.Interface of ListVulnerabilitiesByDataStoreSortParameter**](.md)|  | 
 **pageSize** | **optional.Float64**|  | 
 **nextToken** | [**optional.Interface of string**](.md)|  | 

### Return type

[**ListVulnerabilitiesByDataStore200Response**](listVulnerabilitiesByDataStore_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RemoveVulnerabilityStatusComment**
> RemoveVulnerabilityStatusComment(ctx, vulnerabilityId, statusId, commentId)
Delete vulnerability status comment

Delete a status comment of a vulnerability status.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **vulnerabilityId** | **string**|  | 
  **statusId** | **string**|  | 
  **commentId** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SetVulnerabilityStatus**
> VulnerabilityStatus SetVulnerabilityStatus(ctx, body, vulnerabilityId)
Set status of a vulnerability

Add or update the status of a vulnerability to track its progress.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**SetVulnerabilityStatusRequest**](SetVulnerabilityStatusRequest.md)|  | 
  **vulnerabilityId** | **string**|  | 

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateVulnerabilityStatusComment**
> VulnerabilityStatusComment UpdateVulnerabilityStatusComment(ctx, body, vulnerabilityId, statusId, commentId)
Set vulnerability status

Set a vulnerability status of a vulnerability.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**UpdateCommentBody**](UpdateCommentBody.md)|  | 
  **vulnerabilityId** | **string**|  | 
  **statusId** | **string**|  | 
  **commentId** | **string**|  | 

### Return type

[**VulnerabilityStatusComment**](VulnerabilityStatusComment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

