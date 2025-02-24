# Assetsv3Action


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dest_category** | **str** | Category of the action. | [optional] 
**dest_type** | **str** | Action type for the rule. | [optional] 
**dest_value** | **str** | Value of the action. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_action import Assetsv3Action

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3Action from a JSON string
assetsv3_action_instance = Assetsv3Action.from_json(json)
# print the JSON string representation of the object
print(Assetsv3Action.to_json())

# convert the object into a dict
assetsv3_action_dict = assetsv3_action_instance.to_dict()
# create an instance of Assetsv3Action from a dict
assetsv3_action_from_dict = Assetsv3Action.from_dict(assetsv3_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


