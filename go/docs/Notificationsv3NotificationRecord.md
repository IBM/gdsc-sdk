# Notificationsv3NotificationRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreationTime** | [**time.Time**](time.Time.md) | The time the notification record was created (when). | [optional] [default to null]
**EventEndTime** | [**time.Time**](time.Time.md) | The time the associated event(s) completed. | [optional] [default to null]
**EventStartTime** | [**time.Time**](time.Time.md) | The time the associated event(s) were initiated. | [optional] [default to null]
**Href** | **string** | URL for details of the notification. | [optional] [default to null]
**Id** | **string** | Unique ID for notification, \&quot;\&quot; for new records, required for update. | [optional] [default to null]
**Origin** | **string** | Source of the notification (Predictive Analytics, Outlier Analytics, Analytic Preferences Changed, User Administration, etc). | [optional] [default to null]
**OriginData** | **string** | Data specifically related to the origin (an ID or description needed for further action). | [optional] [default to null]
**Severity** | [***Notificationsv3NotificationSeverity**](notificationsv3NotificationSeverity.md) |  | [optional] [default to null]
**State** | [***Notificationsv3NotificationState**](notificationsv3NotificationState.md) |  | [optional] [default to null]
**Style** | **string** | For future use: \&quot;\&quot;, info, error, criticalAnalysis, normalAnalysis, infoAnalysis. | [optional] [default to null]
**TenantId** | **string** | The unique id for the Tenant the notification is associated with. | [optional] [default to null]
**Text** | **string** | Detailed description of the notification in HTML format (to be embedded in HTML container). | [optional] [default to null]
**Title** | **string** | Brief title used to quickly describe the notification. | [optional] [default to null]
**TransactionId** | **string** | For future use: batches of events that are related to each other may be grouped together when shown to the user. | [optional] [default to null]
**Type_** | **string** | For future use: type will be used to determine how and when a user is notified of an event. | [optional] [default to null]
**UserId** | **string** | The user unique ID in tenant user db of the user that requested the operation (who). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

