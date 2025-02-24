# Notificationsv3SearchNotificationRecordsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**record_count** | **int** | Total number of records associated with the filter. | [optional] 
**records** | [**List[Notificationsv3NotificationRecord]**](Notificationsv3NotificationRecord.md) | Records associated with pipeline. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_search_notification_records_response import Notificationsv3SearchNotificationRecordsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3SearchNotificationRecordsResponse from a JSON string
notificationsv3_search_notification_records_response_instance = Notificationsv3SearchNotificationRecordsResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3SearchNotificationRecordsResponse.to_json())

# convert the object into a dict
notificationsv3_search_notification_records_response_dict = notificationsv3_search_notification_records_response_instance.to_dict()
# create an instance of Notificationsv3SearchNotificationRecordsResponse from a dict
notificationsv3_search_notification_records_response_from_dict = Notificationsv3SearchNotificationRecordsResponse.from_dict(notificationsv3_search_notification_records_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


