# Notificationsv3NotificationRecordsFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndTime** | [**time.Time**](time.Time.md) | Return records created before this time (&lt;). | [optional] [default to null]
**OriginData** | **string** | Only return record that with the specified origin_data. | [optional] [default to null]
**Origins** | **[]string** | Only return record that includes the specified origins. | [optional] [default to null]
**StartTime** | [**time.Time**](time.Time.md) | Return records created at this time or later (&gt;&#x3D;). | [optional] [default to null]
**State** | [***NotificationRecordsFilterStateFilter**](NotificationRecordsFilterStateFilter.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

