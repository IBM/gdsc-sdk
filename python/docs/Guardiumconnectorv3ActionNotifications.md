# Guardiumconnectorv3ActionNotifications


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integration_id** | **str** |  | [optional] 
**receivers** | **str** |  | [optional] 
**template_id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_action_notifications import Guardiumconnectorv3ActionNotifications

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ActionNotifications from a JSON string
guardiumconnectorv3_action_notifications_instance = Guardiumconnectorv3ActionNotifications.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ActionNotifications.to_json())

# convert the object into a dict
guardiumconnectorv3_action_notifications_dict = guardiumconnectorv3_action_notifications_instance.to_dict()
# create an instance of Guardiumconnectorv3ActionNotifications from a dict
guardiumconnectorv3_action_notifications_from_dict = Guardiumconnectorv3ActionNotifications.from_dict(guardiumconnectorv3_action_notifications_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


