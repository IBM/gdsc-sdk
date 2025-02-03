# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QSPolicyManagerBatchStatusUpdate**](QSPolicyManagerApi.md#QSPolicyManagerBatchStatusUpdate) | **Put** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
[**QSPolicyManagerCreateTicket**](QSPolicyManagerApi.md#QSPolicyManagerCreateTicket) | **Post** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
[**QSPolicyManagerFetchFilesfromBuckets**](QSPolicyManagerApi.md#QSPolicyManagerFetchFilesfromBuckets) | **Get** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
[**QSPolicyManagerProcessPolicyDimentionRecords**](QSPolicyManagerApi.md#QSPolicyManagerProcessPolicyDimentionRecords) | **Post** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
[**QSPolicyManagerUpdateTicketStatus**](QSPolicyManagerApi.md#QSPolicyManagerUpdateTicketStatus) | **Put** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .

# **QSPolicyManagerBatchStatusUpdate**
> Qspmpolicymanagerv3StandardEmptyResponse QSPolicyManagerBatchStatusUpdate(ctx, body)
BatchStatusUpdate - trigger the batch to update the status of the Ticket .

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpolicymanagerv3StandardEmptyRequest**](Qspmpolicymanagerv3StandardEmptyRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3StandardEmptyResponse**](qspmpolicymanagerv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPolicyManagerCreateTicket**
> Qspmpolicymanagerv3CreateTicketResponse QSPolicyManagerCreateTicket(ctx, body)
CreateTicket - Create a new Incident .

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpolicymanagerv3CreateTicketRequest**](Qspmpolicymanagerv3CreateTicketRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3CreateTicketResponse**](qspmpolicymanagerv3CreateTicketResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPolicyManagerFetchFilesfromBuckets**
> Qspmpolicymanagerv3FetchObjectStoreFileResponse QSPolicyManagerFetchFilesfromBuckets(ctx, )
FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Qspmpolicymanagerv3FetchObjectStoreFileResponse**](qspmpolicymanagerv3FetchObjectStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPolicyManagerProcessPolicyDimentionRecords**
> Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse QSPolicyManagerProcessPolicyDimentionRecords(ctx, body)
ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse**](qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QSPolicyManagerUpdateTicketStatus**
> Qspmpolicymanagerv3UpdateTicketStatusResponse QSPolicyManagerUpdateTicketStatus(ctx, body)
UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Qspmpolicymanagerv3UpdateTicketStatusRequest**](Qspmpolicymanagerv3UpdateTicketStatusRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3UpdateTicketStatusResponse**](qspmpolicymanagerv3UpdateTicketStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

