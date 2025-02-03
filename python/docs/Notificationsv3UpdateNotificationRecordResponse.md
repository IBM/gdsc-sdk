# Notificationsv3UpdateNotificationRecordResponse

Contains the result of a request to update a notification record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | Result is \&quot;\&quot; if an Notification record is persisted, otherwise an error is returned. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.notificationsv3_update_notification_record_response import Notificationsv3UpdateNotificationRecordResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3UpdateNotificationRecordResponse from a JSON string
notificationsv3_update_notification_record_response_instance = Notificationsv3UpdateNotificationRecordResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3UpdateNotificationRecordResponse.to_json())

# convert the object into a dict
notificationsv3_update_notification_record_response_dict = notificationsv3_update_notification_record_response_instance.to_dict()
# create an instance of Notificationsv3UpdateNotificationRecordResponse from a dict
notificationsv3_update_notification_record_response_from_dict = Notificationsv3UpdateNotificationRecordResponse.from_dict(notificationsv3_update_notification_record_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


