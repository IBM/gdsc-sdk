

# Notificationsv3UpdateNotificationRecordRequest

A request to update a specific notification with the specified fields. The ID field is required, all other fields are optional. Specified fields will be used to included in the persisted NotificationRecord.  If no fields are specified then the  notification record update is not performed.  If the ID is not specified an error is returned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notificationId** | **List&lt;String&gt;** | Unique IDs for notifications; required for update. |  [optional] |
|**severity** | **Notificationsv3NotificationSeverity** |  |  [optional] |
|**state** | **Notificationsv3NotificationState** |  |  [optional] |
|**templateData** | [**List&lt;Notificationsv3TemplateProperty&gt;**](Notificationsv3TemplateProperty.md) | Not required for update. |  [optional] |



