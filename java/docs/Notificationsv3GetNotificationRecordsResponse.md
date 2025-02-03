

# Notificationsv3GetNotificationRecordsResponse

Returns the notifications that match the specified filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**List&lt;Notificationsv3FilterField&gt;**](Notificationsv3FilterField.md) | Filter counts associated with the search. |  [optional] |
|**recordCount** | **Long** | Total number of records associated with the filter (ignoring Limit &amp; Offset). |  [optional] |
|**records** | [**List&lt;Notificationsv3NotificationRecord&gt;**](Notificationsv3NotificationRecord.md) | Records associated with the specified filter. |  [optional] |
|**status** | [**RpcStatus**](RpcStatus.md) |  |  [optional] |



