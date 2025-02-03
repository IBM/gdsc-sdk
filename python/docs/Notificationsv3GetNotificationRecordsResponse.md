# Notificationsv3GetNotificationRecordsResponse

Returns the notifications that match the specified filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Notificationsv3FilterField]**](Notificationsv3FilterField.md) | Filter counts associated with the search. | [optional] 
**record_count** | **int** | Total number of records associated with the filter (ignoring Limit &amp; Offset). | [optional] 
**records** | [**List[Notificationsv3NotificationRecord]**](Notificationsv3NotificationRecord.md) | Records associated with the specified filter. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.notificationsv3_get_notification_records_response import Notificationsv3GetNotificationRecordsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3GetNotificationRecordsResponse from a JSON string
notificationsv3_get_notification_records_response_instance = Notificationsv3GetNotificationRecordsResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3GetNotificationRecordsResponse.to_json())

# convert the object into a dict
notificationsv3_get_notification_records_response_dict = notificationsv3_get_notification_records_response_instance.to_dict()
# create an instance of Notificationsv3GetNotificationRecordsResponse from a dict
notificationsv3_get_notification_records_response_from_dict = Notificationsv3GetNotificationRecordsResponse.from_dict(notificationsv3_get_notification_records_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


