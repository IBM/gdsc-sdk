# Notificationsv3NotificationRecordsFilter

NotificationRecordsFilter includes all fields used to filter the set of desired notification records returned. by a GET request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_time** | **datetime** | Return records created before this time (&lt;). | [optional] 
**limit** | **int** | The max amount of rows to return for this single query. | [optional] 
**origin_data** | **str** | Only return record that with the specified origin_data. | [optional] 
**origins** | **List[str]** | Only return record that includes the specified origins. | [optional] 
**start_time** | **datetime** | Return records created at this time or later (&gt;&#x3D;). | [optional] 
**state** | [**NotificationRecordsFilterStateFilter**](NotificationRecordsFilterStateFilter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_notification_records_filter import Notificationsv3NotificationRecordsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3NotificationRecordsFilter from a JSON string
notificationsv3_notification_records_filter_instance = Notificationsv3NotificationRecordsFilter.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3NotificationRecordsFilter.to_json())

# convert the object into a dict
notificationsv3_notification_records_filter_dict = notificationsv3_notification_records_filter_instance.to_dict()
# create an instance of Notificationsv3NotificationRecordsFilter from a dict
notificationsv3_notification_records_filter_from_dict = Notificationsv3NotificationRecordsFilter.from_dict(notificationsv3_notification_records_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


