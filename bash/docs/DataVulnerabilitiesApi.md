# DataVulnerabilitiesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#addVulnerabilityStatusComment) | **POST** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
[**getVulnerabilitiesSummary**](DataVulnerabilitiesApi.md#getVulnerabilitiesSummary) | **GET** /api/v2/dspm/vulnerabilities/summary | Get vulnerabilities summary
[**getVulnerability**](DataVulnerabilitiesApi.md#getVulnerability) | **GET** /api/v2/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
[**listVulnerabilities**](DataVulnerabilitiesApi.md#listVulnerabilities) | **GET** /api/v2/dspm/vulnerabilities | List vulnerabilities based on an applied filter
[**listVulnerabilitiesByDataStore**](DataVulnerabilitiesApi.md#listVulnerabilitiesByDataStore) | **GET** /api/v2/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
[**removeVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#removeVulnerabilityStatusComment) | **DELETE** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
[**setVulnerabilityStatus**](DataVulnerabilitiesApi.md#setVulnerabilityStatus) | **POST** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
[**updateVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#updateVulnerabilityStatusComment) | **PUT** /api/v2/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status



## addVulnerabilityStatusComment

Add vulnerability status comment

Add or update the status comment of a vulnerability status to keep track of the workflow progress.

### Example

```bash
 addVulnerabilityStatusComment vulnerabilityId=value statusId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | **string** |  | [default to null]
 **statusId** | **string** |  | [default to null]
 **addCommentBody** | [**AddCommentBody**](AddCommentBody.md) |  |

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getVulnerabilitiesSummary

Get vulnerabilities summary

Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility's type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.

### Example

```bash
 getVulnerabilitiesSummary  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesFilterOptions**](.md) |  | [optional] [default to null]

### Return type

[**VulnerabilitiesSummary**](VulnerabilitiesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getVulnerability

Get vulnerability details by ID

Get vulnerability details by providing its ID.

### Example

```bash
 getVulnerability vulnerabilityId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | **string** |  | [default to null]

### Return type

[**Vulnerability**](Vulnerability.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listVulnerabilities

List vulnerabilities based on an applied filter

Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example

```bash
 listVulnerabilities  filter=value  sort=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesFilterOptions**](.md) |  | [optional] [default to null]
 **sort** | [**ListVulnerabilitiesSortParameter**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListVulnerabilities200Response**](ListVulnerabilities200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listVulnerabilitiesByDataStore

List vulnerabilities of data stores

Get a list of all the vulnerabilities of data stores.

### Example

```bash
 listVulnerabilitiesByDataStore  filter=value  sort=value  pageSize=value  nextToken=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**VulnerabilitiesByDataStoreFilterOptions**](.md) |  | [optional] [default to null]
 **sort** | [**ListVulnerabilitiesByDataStoreSortParameter**](.md) |  | [optional] [default to null]
 **pageSize** | **integer** |  | [optional] [default to null]
 **nextToken** | **string** |  | [optional] [default to null]

### Return type

[**ListVulnerabilitiesByDataStore200Response**](ListVulnerabilitiesByDataStore200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## removeVulnerabilityStatusComment

Delete vulnerability status comment

Delete a status comment of a vulnerability status.

### Example

```bash
 removeVulnerabilityStatusComment vulnerabilityId=value statusId=value commentId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | **string** |  | [default to null]
 **statusId** | **string** |  | [default to null]
 **commentId** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setVulnerabilityStatus

Set status of a vulnerability

Add or update the status of a vulnerability to track its progress.

### Example

```bash
 setVulnerabilityStatus vulnerabilityId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | **string** |  | [default to null]
 **setVulnerabilityStatusRequest** | [**SetVulnerabilityStatusRequest**](SetVulnerabilityStatusRequest.md) |  |

### Return type

[**VulnerabilityStatus**](VulnerabilityStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateVulnerabilityStatusComment

Set vulnerability status

Set a vulnerability status of a vulnerability.

### Example

```bash
 updateVulnerabilityStatusComment vulnerabilityId=value statusId=value commentId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | **string** |  | [default to null]
 **statusId** | **string** |  | [default to null]
 **commentId** | **string** |  | [default to null]
 **updateCommentBody** | [**UpdateCommentBody**](UpdateCommentBody.md) |  |

### Return type

[**VulnerabilityStatusComment**](VulnerabilityStatusComment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

