# Guardiumconnectorv3ActionParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_value** | **int** |  | [optional] 
**parameter_name** | **str** |  | [optional] 
**parameter_type** | **str** |  | [optional] 
**parameter_value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_action_parameter import Guardiumconnectorv3ActionParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ActionParameter from a JSON string
guardiumconnectorv3_action_parameter_instance = Guardiumconnectorv3ActionParameter.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ActionParameter.to_json())

# convert the object into a dict
guardiumconnectorv3_action_parameter_dict = guardiumconnectorv3_action_parameter_instance.to_dict()
# create an instance of Guardiumconnectorv3ActionParameter from a dict
guardiumconnectorv3_action_parameter_from_dict = Guardiumconnectorv3ActionParameter.from_dict(guardiumconnectorv3_action_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


