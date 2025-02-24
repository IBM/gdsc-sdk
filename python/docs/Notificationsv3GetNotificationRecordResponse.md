# Notificationsv3GetNotificationRecordResponse

GetNotificationRecordResponse returns the requested notification record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**record** | [**Notificationsv3NotificationRecord**](Notificationsv3NotificationRecord.md) |  | [optional] 
**result** | **str** | Result is \&quot;\&quot; if an Notification record is returned, otherwise an error is returned. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_get_notification_record_response import Notificationsv3GetNotificationRecordResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3GetNotificationRecordResponse from a JSON string
notificationsv3_get_notification_record_response_instance = Notificationsv3GetNotificationRecordResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3GetNotificationRecordResponse.to_json())

# convert the object into a dict
notificationsv3_get_notification_record_response_dict = notificationsv3_get_notification_record_response_instance.to_dict()
# create an instance of Notificationsv3GetNotificationRecordResponse from a dict
notificationsv3_get_notification_record_response_from_dict = Notificationsv3GetNotificationRecordResponse.from_dict(notificationsv3_get_notification_record_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


