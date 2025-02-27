# Notificationsv3UpdateNotificationRecordRequest

A request to update a specific notification with the specified fields. The ID field is required, all other fields are optional. Specified fields will be used to included in the persisted NotificationRecord.  If no fields are specified then the  notification record update is not performed.  If the ID is not specified an error is returned.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notification_id** | **List[str]** | Unique IDs for notifications; required for update. | [optional] 
**severity** | [**Notificationsv3NotificationSeverity**](Notificationsv3NotificationSeverity.md) |  | [optional] 
**state** | [**Notificationsv3NotificationState**](Notificationsv3NotificationState.md) |  | [optional] 
**template_data** | [**List[Notificationsv3TemplateProperty]**](Notificationsv3TemplateProperty.md) | Not required for update. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_update_notification_record_request import Notificationsv3UpdateNotificationRecordRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3UpdateNotificationRecordRequest from a JSON string
notificationsv3_update_notification_record_request_instance = Notificationsv3UpdateNotificationRecordRequest.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3UpdateNotificationRecordRequest.to_json())

# convert the object into a dict
notificationsv3_update_notification_record_request_dict = notificationsv3_update_notification_record_request_instance.to_dict()
# create an instance of Notificationsv3UpdateNotificationRecordRequest from a dict
notificationsv3_update_notification_record_request_from_dict = Notificationsv3UpdateNotificationRecordRequest.from_dict(notificationsv3_update_notification_record_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


