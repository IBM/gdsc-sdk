# QSDataLoaderApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSDataLoaderQSfileValidator**](QSDataLoaderApi.md#qSDataLoaderQSfileValidator) | **POST** /api/v3/data/validation | QSfileValidator - validate the files before insert happend .
[**qSDataLoaderUploadSyntheticDataLoader**](QSDataLoaderApi.md#qSDataLoaderUploadSyntheticDataLoader) | **POST** /api/v3/data/synthetic | UploadSyntheticDataLoader - Insert data into Db after read from .sql file .



## qSDataLoaderQSfileValidator

QSfileValidator - validate the files before insert happend .

### Example

```bash
 qSDataLoaderQSfileValidator
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qsdataloaderv3QSfileValidatorRequest** | [**Qsdataloaderv3QSfileValidatorRequest**](Qsdataloaderv3QSfileValidatorRequest.md) |  |

### Return type

[**Qsdataloaderv3QSfileValidatorResonse**](Qsdataloaderv3QSfileValidatorResonse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSDataLoaderUploadSyntheticDataLoader

UploadSyntheticDataLoader - Insert data into Db after read from .sql file .

### Example

```bash
 qSDataLoaderUploadSyntheticDataLoader
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map** |  |

### Return type

[**Qsdataloaderv3QSyntheticDataLoaderResonse**](Qsdataloaderv3QSyntheticDataLoaderResonse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

