# notificationsv3PostNotificationRecordRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**origin** | [**Notificationsv3Origin**](Notificationsv3Origin.md) |  | [optional] [default to null]
**originUnderscoredata** | **string** | Optional: context:${context_id} of the data such as &quot;Report:${report_id}&quot; or &quot;RiskEvent:${risk_id}&quot; | [optional] [default to null]
**targetUnderscorereceivers** | [**array[Schedulerv3Recipient]**](Schedulerv3Recipient.md) | Optional: notification recipient | [optional] [default to null]
**templateUnderscoredata** | **map[String, string]** | Use a flattened structure for now | [optional] [default to null]
**title** | **string** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


