# Notificationsv3PostNotificationRecordRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**origin** | [**Notificationsv3Origin**](Notificationsv3Origin.md) |  | [optional] 
**origin_data** | **str** |  | [optional] 
**target_receivers** | [**List[Schedulerv3Recipient]**](Schedulerv3Recipient.md) |  | [optional] 
**template_data** | **Dict[str, str]** |  | [optional] 
**title** | **str** | Optional:Brief title used to quickly describe the notification. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_post_notification_record_request import Notificationsv3PostNotificationRecordRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3PostNotificationRecordRequest from a JSON string
notificationsv3_post_notification_record_request_instance = Notificationsv3PostNotificationRecordRequest.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3PostNotificationRecordRequest.to_json())

# convert the object into a dict
notificationsv3_post_notification_record_request_dict = notificationsv3_post_notification_record_request_instance.to_dict()
# create an instance of Notificationsv3PostNotificationRecordRequest from a dict
notificationsv3_post_notification_record_request_from_dict = Notificationsv3PostNotificationRecordRequest.from_dict(notificationsv3_post_notification_record_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


