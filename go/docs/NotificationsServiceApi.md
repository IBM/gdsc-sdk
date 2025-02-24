# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NotificationsServiceCreateTicket**](NotificationsServiceApi.md#NotificationsServiceCreateTicket) | **Post** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in.
[**NotificationsServiceGetFolders**](NotificationsServiceApi.md#NotificationsServiceGetFolders) | **Post** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided.
[**NotificationsServiceGetNotificationFilename**](NotificationsServiceApi.md#NotificationsServiceGetNotificationFilename) | **Get** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
[**NotificationsServiceGetNotificationRecord**](NotificationsServiceApi.md#NotificationsServiceGetNotificationRecord) | **Get** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID.
[**NotificationsServiceGetNotificationRecords**](NotificationsServiceApi.md#NotificationsServiceGetNotificationRecords) | **Get** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter.
[**NotificationsServiceGetTicketStatus**](NotificationsServiceApi.md#NotificationsServiceGetTicketStatus) | **Get** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket
[**NotificationsServiceTestIntegration**](NotificationsServiceApi.md#NotificationsServiceTestIntegration) | **Post** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
[**NotificationsServiceUpdateNotificationRecord**](NotificationsServiceApi.md#NotificationsServiceUpdateNotificationRecord) | **Post** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.

# **NotificationsServiceCreateTicket**
> Notificationsv3CreateTicketResponse NotificationsServiceCreateTicket(ctx, body)
Summary: Create ticket Description: Create ticket based on information passed in.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Notificationsv3CreateTicketRequest**](Notificationsv3CreateTicketRequest.md)|  | 

### Return type

[**Notificationsv3CreateTicketResponse**](notificationsv3CreateTicketResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NotificationsServiceGetFolders**
> Notificationsv3GetFoldersResponse NotificationsServiceGetFolders(ctx, body)
Summary: Get folders Description: Get folder for the integration connection provided.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Notificationsv3GetFoldersRequest**](Notificationsv3GetFoldersRequest.md)|  | 

### Return type

[**Notificationsv3GetFoldersResponse**](notificationsv3GetFoldersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NotificationsServiceGetNotificationFilename**
> Notificationsv3GetNotificationFilenameResponse NotificationsServiceGetNotificationFilename(ctx, optional)
Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***NotificationsServiceApiNotificationsServiceGetNotificationFilenameOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a NotificationsServiceApiNotificationsServiceGetNotificationFilenameOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **optional.String**| Params are located in the requests context (tenant id, user email, notification id). | 

### Return type

[**Notificationsv3GetNotificationFilenameResponse**](notificationsv3GetNotificationFilenameResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NotificationsServiceGetNotificationRecord**
> Notificationsv3GetNotificationRecordResponse NotificationsServiceGetNotificationRecord(ctx, notificationId)
Summary: Get notification record Description: Return notifications record with the specified ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **notificationId** | **string**| ID for the record to return. | 

### Return type

[**Notificationsv3GetNotificationRecordResponse**](notificationsv3GetNotificationRecordResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NotificationsServiceGetNotificationRecords**
> Notificationsv3GetNotificationRecordsResponse NotificationsServiceGetNotificationRecords(ctx, optional)
Summary: Get notification records Description: Return notifications records that match the specified filter.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***NotificationsServiceApiNotificationsServiceGetNotificationRecordsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a NotificationsServiceApiNotificationsServiceGetNotificationRecordsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | **optional.Time**| Return records created at this time or later (&gt;&#x3D;). | 
 **filterEndTime** | **optional.Time**| Return records created before this time (&lt;). | 
 **filterState** | **optional.String**| Only return record that include the specified state. | [default to INCLUDE_ALL]
 **filterOrigins** | [**optional.Interface of []string**](string.md)| Only return record that includes the specified origins. | 
 **filterOriginData** | **optional.String**| Only return record that with the specified origin_data. | 
 **offset** | **optional.Int64**| The amount to offset the rows by for pagination. | 
 **limit** | **optional.Int64**| The max amount of rows to return for pagination. | 
 **includeFilterCounts** | **optional.Bool**| Computing the filter counts is relatively expensive, only compute when needed. | 

### Return type

[**Notificationsv3GetNotificationRecordsResponse**](notificationsv3GetNotificationRecordsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NotificationsServiceGetTicketStatus**
> Notificationsv3GetTicketStatusResponse NotificationsServiceGetTicketStatus(ctx, optional)
Summary: Get ticket status Description: Get the status of the given ticket

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***NotificationsServiceApiNotificationsServiceGetTicketStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a NotificationsServiceApiNotificationsServiceGetTicketStatusOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | **optional.String**| The ID of the ticket to fetch. | 
 **integrationId** | **optional.String**| The ID of the ticketing integration. | 

### Return type

[**Notificationsv3GetTicketStatusResponse**](notificationsv3GetTicketStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NotificationsServiceTestIntegration**
> Notificationsv3TestIntegrationResponse NotificationsServiceTestIntegration(ctx, body)
Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Notificationsv3TestIntegrationRequest**](Notificationsv3TestIntegrationRequest.md)|  | 

### Return type

[**Notificationsv3TestIntegrationResponse**](notificationsv3TestIntegrationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **NotificationsServiceUpdateNotificationRecord**
> Notificationsv3UpdateNotificationRecordResponse NotificationsServiceUpdateNotificationRecord(ctx, body)
Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Notificationsv3UpdateNotificationRecordRequest**](Notificationsv3UpdateNotificationRecordRequest.md)|  | 

### Return type

[**Notificationsv3UpdateNotificationRecordResponse**](notificationsv3UpdateNotificationRecordResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

