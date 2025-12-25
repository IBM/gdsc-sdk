# Notificationsv3SearchNotificationRecordsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Notificationsv3NotificationRecordsFilter]**](Notificationsv3NotificationRecordsFilter.md) |  | [optional] 
**operator** | [**Notificationsv3PipelineQueryOperator**](Notificationsv3PipelineQueryOperator.md) |  | [optional] [default to Notificationsv3PipelineQueryOperator.OPERATOR_AND]

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_search_notification_records_request import Notificationsv3SearchNotificationRecordsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3SearchNotificationRecordsRequest from a JSON string
notificationsv3_search_notification_records_request_instance = Notificationsv3SearchNotificationRecordsRequest.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3SearchNotificationRecordsRequest.to_json())

# convert the object into a dict
notificationsv3_search_notification_records_request_dict = notificationsv3_search_notification_records_request_instance.to_dict()
# create an instance of Notificationsv3SearchNotificationRecordsRequest from a dict
notificationsv3_search_notification_records_request_from_dict = Notificationsv3SearchNotificationRecordsRequest.from_dict(notificationsv3_search_notification_records_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


