# Notificationsv3GetNotificationFilenameResponse

Returns the download file name associated with the specified notification or an empty string if there is no download. file name associated with the specified notification.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** |  | [optional] 
**result** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_get_notification_filename_response import Notificationsv3GetNotificationFilenameResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3GetNotificationFilenameResponse from a JSON string
notificationsv3_get_notification_filename_response_instance = Notificationsv3GetNotificationFilenameResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3GetNotificationFilenameResponse.to_json())

# convert the object into a dict
notificationsv3_get_notification_filename_response_dict = notificationsv3_get_notification_filename_response_instance.to_dict()
# create an instance of Notificationsv3GetNotificationFilenameResponse from a dict
notificationsv3_get_notification_filename_response_from_dict = Notificationsv3GetNotificationFilenameResponse.from_dict(notificationsv3_get_notification_filename_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


