# Notificationsv3NotificationRecord

A notifications record indicates who, what, when, where, and why something happened and presents it  to the user in a meaningful way.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **datetime** | The time the notification record was created (when). | [optional] 
**event_end_time** | **datetime** | The time the associated event(s) completed. | [optional] 
**event_start_time** | **datetime** | The time the associated event(s) were initiated. | [optional] 
**href** | **str** | URL for details of the notification. | [optional] 
**id** | **str** | Unique ID for notification, \&quot;\&quot; for new records, required for update. | [optional] 
**origin** | **str** | Source of the notification (Predictive Analytics, Outlier Analytics, Analytic Preferences Changed, User Administration, etc). | [optional] 
**origin_data** | **str** | Data specifically related to the origin (an ID or description needed for further action). | [optional] 
**severity** | [**Notificationsv3NotificationSeverity**](Notificationsv3NotificationSeverity.md) |  | [optional] 
**state** | [**Notificationsv3NotificationState**](Notificationsv3NotificationState.md) |  | [optional] 
**style** | **str** | For future use: \&quot;\&quot;, info, error, criticalAnalysis, normalAnalysis, infoAnalysis. | [optional] 
**tenant_id** | **str** | The unique id for the Tenant the notification is associated with. | [optional] 
**text** | **str** | Detailed description of the notification in HTML format (to be embedded in HTML container). | [optional] 
**title** | **str** | Brief title used to quickly describe the notification. | [optional] 
**transaction_id** | **str** | For future use: batches of events that are related to each other may be grouped together when shown to the user. | [optional] 
**type** | **str** | For future use: type will be used to determine how and when a user is notified of an event. | [optional] 
**user_id** | **str** | The user unique ID in tenant user db of the user that requested the operation (who). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_notification_record import Notificationsv3NotificationRecord

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3NotificationRecord from a JSON string
notificationsv3_notification_record_instance = Notificationsv3NotificationRecord.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3NotificationRecord.to_json())

# convert the object into a dict
notificationsv3_notification_record_dict = notificationsv3_notification_record_instance.to_dict()
# create an instance of Notificationsv3NotificationRecord from a dict
notificationsv3_notification_record_from_dict = Notificationsv3NotificationRecord.from_dict(notificationsv3_notification_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


