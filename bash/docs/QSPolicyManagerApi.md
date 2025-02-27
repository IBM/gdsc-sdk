# QSPolicyManagerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSPolicyManagerBatchStatusUpdate**](QSPolicyManagerApi.md#qSPolicyManagerBatchStatusUpdate) | **PUT** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
[**qSPolicyManagerConfigUpdate**](QSPolicyManagerApi.md#qSPolicyManagerConfigUpdate) | **PATCH** /api/v3/policy_manager/configs | ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
[**qSPolicyManagerCreateTicket**](QSPolicyManagerApi.md#qSPolicyManagerCreateTicket) | **POST** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
[**qSPolicyManagerFetchFilesfromBuckets**](QSPolicyManagerApi.md#qSPolicyManagerFetchFilesfromBuckets) | **GET** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
[**qSPolicyManagerProcessPolicyDimentionRecords**](QSPolicyManagerApi.md#qSPolicyManagerProcessPolicyDimentionRecords) | **POST** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
[**qSPolicyManagerUpdateTicketStatus**](QSPolicyManagerApi.md#qSPolicyManagerUpdateTicketStatus) | **PUT** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .



## qSPolicyManagerBatchStatusUpdate

BatchStatusUpdate - trigger the batch to update the status of the Ticket .

### Example

```bash
 qSPolicyManagerBatchStatusUpdate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map** |  |

### Return type

[**Qspmpolicymanagerv3StandardEmptyResponse**](Qspmpolicymanagerv3StandardEmptyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPolicyManagerConfigUpdate

ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.

### Example

```bash
 qSPolicyManagerConfigUpdate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3UpdateConfigsRequest** | [**Qspmpolicymanagerv3UpdateConfigsRequest**](Qspmpolicymanagerv3UpdateConfigsRequest.md) |  |

### Return type

[**Qspmpolicymanagerv3APIResonse**](Qspmpolicymanagerv3APIResonse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPolicyManagerCreateTicket

CreateTicket - Create a new Incident .

### Example

```bash
 qSPolicyManagerCreateTicket
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3CreateTicketRequest** | [**Qspmpolicymanagerv3CreateTicketRequest**](Qspmpolicymanagerv3CreateTicketRequest.md) |  |

### Return type

[**Qspmpolicymanagerv3CreateTicketResponse**](Qspmpolicymanagerv3CreateTicketResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPolicyManagerFetchFilesfromBuckets

FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage

### Example

```bash
 qSPolicyManagerFetchFilesfromBuckets
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Qspmpolicymanagerv3FetchObjectStoreFileResponse**](Qspmpolicymanagerv3FetchObjectStoreFileResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPolicyManagerProcessPolicyDimentionRecords

ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table

### Example

```bash
 qSPolicyManagerProcessPolicyDimentionRecords
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest** | [**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.md) |  |

### Return type

[**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qSPolicyManagerUpdateTicketStatus

UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .

### Example

```bash
 qSPolicyManagerUpdateTicketStatus
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3UpdateTicketStatusRequest** | [**Qspmpolicymanagerv3UpdateTicketStatusRequest**](Qspmpolicymanagerv3UpdateTicketStatusRequest.md) |  |

### Return type

[**Qspmpolicymanagerv3UpdateTicketStatusResponse**](Qspmpolicymanagerv3UpdateTicketStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

