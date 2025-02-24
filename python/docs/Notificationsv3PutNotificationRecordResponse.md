# Notificationsv3PutNotificationRecordResponse

Response from creating a notifications record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | result is \&quot;\&quot; if an Notification record has been created, otherwise an error is returned. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_put_notification_record_response import Notificationsv3PutNotificationRecordResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3PutNotificationRecordResponse from a JSON string
notificationsv3_put_notification_record_response_instance = Notificationsv3PutNotificationRecordResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3PutNotificationRecordResponse.to_json())

# convert the object into a dict
notificationsv3_put_notification_record_response_dict = notificationsv3_put_notification_record_response_instance.to_dict()
# create an instance of Notificationsv3PutNotificationRecordResponse from a dict
notificationsv3_put_notification_record_response_from_dict = Notificationsv3PutNotificationRecordResponse.from_dict(notificationsv3_put_notification_record_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


