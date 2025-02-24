# Guardiumconnectorv3Action


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_code** | **int** |  | [optional] 
**action_name** | **str** |  | [optional] 
**notifications** | [**List[Guardiumconnectorv3ActionNotifications]**](Guardiumconnectorv3ActionNotifications.md) |  | [optional] 
**parameters** | [**List[Guardiumconnectorv3ActionParameter]**](Guardiumconnectorv3ActionParameter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_action import Guardiumconnectorv3Action

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3Action from a JSON string
guardiumconnectorv3_action_instance = Guardiumconnectorv3Action.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3Action.to_json())

# convert the object into a dict
guardiumconnectorv3_action_dict = guardiumconnectorv3_action_instance.to_dict()
# create an instance of Guardiumconnectorv3Action from a dict
guardiumconnectorv3_action_from_dict = Guardiumconnectorv3Action.from_dict(guardiumconnectorv3_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


