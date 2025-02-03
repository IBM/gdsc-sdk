# Guardiumconnectorv3Rule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[Guardiumconnectorv3Action]**](Guardiumconnectorv3Action.md) |  | [optional] 
**continue_to_next_rule** | **bool** |  | [optional] 
**parameters** | [**List[Guardiumconnectorv3RuleParameter]**](Guardiumconnectorv3RuleParameter.md) |  | [optional] 
**rule_level** | **int** |  | [optional] 
**rule_name** | **str** |  | [optional] 
**rule_type** | **str** |  | [optional] 
**severity** | **str** |  | [optional] 
**tags** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_rule import Guardiumconnectorv3Rule

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3Rule from a JSON string
guardiumconnectorv3_rule_instance = Guardiumconnectorv3Rule.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3Rule.to_json())

# convert the object into a dict
guardiumconnectorv3_rule_dict = guardiumconnectorv3_rule_instance.to_dict()
# create an instance of Guardiumconnectorv3Rule from a dict
guardiumconnectorv3_rule_from_dict = Guardiumconnectorv3Rule.from_dict(guardiumconnectorv3_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


