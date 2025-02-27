# NotificationsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationsServiceCreateTicket**](NotificationsServiceApi.md#notificationsServiceCreateTicket) | **POST** /api/v3/integrations/ticket | Summary: Create ticket
Description: Create ticket based on information passed in.
[**notificationsServiceGetFolders**](NotificationsServiceApi.md#notificationsServiceGetFolders) | **POST** /api/v3/integrations/folders | Summary: Get folders
Description: Get folder for the integration connection provided.
[**notificationsServiceGetNotificationFilename**](NotificationsServiceApi.md#notificationsServiceGetNotificationFilename) | **GET** /api/v3/notifications/filename | Summary: Get notification filename
Description: Return filename associated with the notifications record referenced in the associated context record.
The notification id is required but may be set in the associated authentication token or explicitly in the request.
[**notificationsServiceGetNotificationRecord**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecord) | **GET** /api/v3/notifications/details/{notification_id} | Summary: Get notification record
Description: Return notifications record with the specified ID.
[**notificationsServiceGetNotificationRecords**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecords) | **GET** /api/v3/notifications | Summary: Get notification records
Description: Return notifications records that match the specified filter.
[**notificationsServiceGetTicketStatus**](NotificationsServiceApi.md#notificationsServiceGetTicketStatus) | **GET** /api/v3/integrations/ticket/status | Summary: Get ticket status
Description: Get the status of the given ticket
[**notificationsServicePostNotificationRecord**](NotificationsServiceApi.md#notificationsServicePostNotificationRecord) | **POST** /api/v3/notifications | Summary: For PostNotificationRecord notification only
Description: Sends notification with recipients and returns a status
[**notificationsServiceSearchNotificationRecords**](NotificationsServiceApi.md#notificationsServiceSearchNotificationRecords) | **POST** /api/v3/notifications/search | Summary: Search notification records
Description: Return notification records using pipeline of filters
[**notificationsServiceTestIntegration**](NotificationsServiceApi.md#notificationsServiceTestIntegration) | **POST** /api/v3/integrations/test | Summary: Test integration
Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible
a test message is sent to the integration to ensure it is functional.
[**notificationsServiceUpdateNotificationRecord**](NotificationsServiceApi.md#notificationsServiceUpdateNotificationRecord) | **PUT** /api/v3/notifications | Summary: Update notification record
Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification.
All fields other than the ID are optional.
Creation timestamp, user and other administrative fields can not updated.



## notificationsServiceCreateTicket

Summary: Create ticket
Description: Create ticket based on information passed in.

### Example

```bash
 notificationsServiceCreateTicket
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3CreateTicketRequest** | [**Notificationsv3CreateTicketRequest**](Notificationsv3CreateTicketRequest.md) |  |

### Return type

[**Notificationsv3CreateTicketResponse**](Notificationsv3CreateTicketResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceGetFolders

Summary: Get folders
Description: Get folder for the integration connection provided.

### Example

```bash
 notificationsServiceGetFolders
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3GetFoldersRequest** | [**Notificationsv3GetFoldersRequest**](Notificationsv3GetFoldersRequest.md) |  |

### Return type

[**Notificationsv3GetFoldersResponse**](Notificationsv3GetFoldersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceGetNotificationFilename

Summary: Get notification filename
Description: Return filename associated with the notifications record referenced in the associated context record.
The notification id is required but may be set in the associated authentication token or explicitly in the request.

### Example

```bash
 notificationsServiceGetNotificationFilename  notification_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **string** | Params are located in the requests context (tenant id, user email, notification id). | [optional] [default to null]

### Return type

[**Notificationsv3GetNotificationFilenameResponse**](Notificationsv3GetNotificationFilenameResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceGetNotificationRecord

Summary: Get notification record
Description: Return notifications record with the specified ID.

### Example

```bash
 notificationsServiceGetNotificationRecord notification_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **string** | ID for the record to return. | [default to null]

### Return type

[**Notificationsv3GetNotificationRecordResponse**](Notificationsv3GetNotificationRecordResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceGetNotificationRecords

Summary: Get notification records
Description: Return notifications records that match the specified filter.

### Example

```bash
 notificationsServiceGetNotificationRecords  filter.start_time=value  filter.end_time=value  filter.state=value  Specify as:  filter.origins=value1 filter.origins=value2 filter.origins=...  filter.origin_data=value  filter.limit=value  offset=value  limit=value  include_filter_counts=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterPeriodstartTime** | **string** | Return records created at this time or later (>=). | [optional] [default to null]
 **filterPeriodendTime** | **string** | Return records created before this time (<). | [optional] [default to null]
 **filterPeriodstate** | **string** | Only return record that include the specified state. | [optional] [default to INCLUDE_ALL]
 **filterPeriodorigins** | [**array[string]**](string.md) | Only return record that includes the specified origins. | [optional] [default to null]
 **filterPeriodoriginData** | **string** | Only return record that with the specified origin_data. | [optional] [default to null]
 **filterPeriodlimit** | **integer** | The max amount of rows to return for this single query. | [optional] [default to null]
 **offset** | **integer** | The amount to offset the rows by for pagination. | [optional] [default to null]
 **limit** | **integer** | The max amount of rows to return for pagination. | [optional] [default to null]
 **includeFilterCounts** | **boolean** | Computing the filter counts is relatively expensive, only compute when needed. | [optional] [default to null]

### Return type

[**Notificationsv3GetNotificationRecordsResponse**](Notificationsv3GetNotificationRecordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceGetTicketStatus

Summary: Get ticket status
Description: Get the status of the given ticket

### Example

```bash
 notificationsServiceGetTicketStatus  ticket_id=value  integration_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | **string** | The ID of the ticket to fetch. | [optional] [default to null]
 **integrationId** | **string** | The ID of the ticketing integration. | [optional] [default to null]

### Return type

[**Notificationsv3GetTicketStatusResponse**](Notificationsv3GetTicketStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServicePostNotificationRecord

Summary: For PostNotificationRecord notification only
Description: Sends notification with recipients and returns a status

### Example

```bash
 notificationsServicePostNotificationRecord
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3PostNotificationRecordRequest** | [**Notificationsv3PostNotificationRecordRequest**](Notificationsv3PostNotificationRecordRequest.md) |  |

### Return type

[**Notificationsv3PostNotificationRecordResponse**](Notificationsv3PostNotificationRecordResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceSearchNotificationRecords

Summary: Search notification records
Description: Return notification records using pipeline of filters

### Example

```bash
 notificationsServiceSearchNotificationRecords
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3SearchNotificationRecordsRequest** | [**Notificationsv3SearchNotificationRecordsRequest**](Notificationsv3SearchNotificationRecordsRequest.md) |  |

### Return type

[**Notificationsv3SearchNotificationRecordsResponse**](Notificationsv3SearchNotificationRecordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceTestIntegration

Summary: Test integration
Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible
a test message is sent to the integration to ensure it is functional.

### Example

```bash
 notificationsServiceTestIntegration
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3TestIntegrationRequest** | [**Notificationsv3TestIntegrationRequest**](Notificationsv3TestIntegrationRequest.md) |  |

### Return type

[**Notificationsv3TestIntegrationResponse**](Notificationsv3TestIntegrationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsServiceUpdateNotificationRecord

Summary: Update notification record
Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification.
All fields other than the ID are optional.
Creation timestamp, user and other administrative fields can not updated.

### Example

```bash
 notificationsServiceUpdateNotificationRecord
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3UpdateNotificationRecordRequest** | [**Notificationsv3UpdateNotificationRecordRequest**](Notificationsv3UpdateNotificationRecordRequest.md) |  |

### Return type

[**Notificationsv3UpdateNotificationRecordResponse**](Notificationsv3UpdateNotificationRecordResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

