

# Notificationsv3NotificationRecord

A notifications record indicates who, what, when, where, and why something happened and presents it  to the user in a meaningful way.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationTime** | **OffsetDateTime** | The time the notification record was created (when). |  [optional] |
|**eventEndTime** | **OffsetDateTime** | The time the associated event(s) completed. |  [optional] |
|**eventStartTime** | **OffsetDateTime** | The time the associated event(s) were initiated. |  [optional] |
|**href** | **String** | URL for details of the notification. |  [optional] |
|**id** | **String** | Unique ID for notification, \&quot;\&quot; for new records, required for update. |  [optional] |
|**origin** | **String** | Source of the notification (Predictive Analytics, Outlier Analytics, Analytic Preferences Changed, User Administration, etc). |  [optional] |
|**originData** | **String** | Data specifically related to the origin (an ID or description needed for further action). |  [optional] |
|**severity** | **Notificationsv3NotificationSeverity** |  |  [optional] |
|**state** | **Notificationsv3NotificationState** |  |  [optional] |
|**style** | **String** | For future use: \&quot;\&quot;, info, error, criticalAnalysis, normalAnalysis, infoAnalysis. |  [optional] |
|**tenantId** | **String** | The unique id for the Tenant the notification is associated with. |  [optional] |
|**text** | **String** | Detailed description of the notification in HTML format (to be embedded in HTML container). |  [optional] |
|**title** | **String** | Brief title used to quickly describe the notification. |  [optional] |
|**transactionId** | **String** | For future use: batches of events that are related to each other may be grouped together when shown to the user. |  [optional] |
|**type** | **String** | For future use: type will be used to determine how and when a user is notified of an event. |  [optional] |
|**userId** | **String** | The user unique ID in tenant user db of the user that requested the operation (who). |  [optional] |



