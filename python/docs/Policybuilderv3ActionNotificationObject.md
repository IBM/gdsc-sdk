# Policybuilderv3ActionNotificationObject

Notification object for action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_id** | **str** | Action id. | [optional] 
**receivers** | [**List[Policybuilderv3TargetReceiver]**](Policybuilderv3TargetReceiver.md) | Receiver object. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_action_notification_object import Policybuilderv3ActionNotificationObject

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3ActionNotificationObject from a JSON string
policybuilderv3_action_notification_object_instance = Policybuilderv3ActionNotificationObject.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3ActionNotificationObject.to_json())

# convert the object into a dict
policybuilderv3_action_notification_object_dict = policybuilderv3_action_notification_object_instance.to_dict()
# create an instance of Policybuilderv3ActionNotificationObject from a dict
policybuilderv3_action_notification_object_from_dict = Policybuilderv3ActionNotificationObject.from_dict(policybuilderv3_action_notification_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


