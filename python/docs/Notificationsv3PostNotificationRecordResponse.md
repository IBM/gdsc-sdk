# Notificationsv3PostNotificationRecordResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_post_notification_record_response import Notificationsv3PostNotificationRecordResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3PostNotificationRecordResponse from a JSON string
notificationsv3_post_notification_record_response_instance = Notificationsv3PostNotificationRecordResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3PostNotificationRecordResponse.to_json())

# convert the object into a dict
notificationsv3_post_notification_record_response_dict = notificationsv3_post_notification_record_response_instance.to_dict()
# create an instance of Notificationsv3PostNotificationRecordResponse from a dict
notificationsv3_post_notification_record_response_from_dict = Notificationsv3PostNotificationRecordResponse.from_dict(notificationsv3_post_notification_record_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


