# Assetsv3Rule

Base Rule object which is used in create and list APIs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[Assetsv3Action]**](Assetsv3Action.md) | Action object of the actions in the rules. | [optional] 
**is_delete** | **int** | Rule isDelete. | [optional] 
**parameters** | [**List[Assetsv3RuleParameter]**](Assetsv3RuleParameter.md) | Parameter object which are used in the rule. | [optional] 
**policy_id** | **str** | Policy ID. | [optional] 
**rule_id** | **str** | Rule ID. | [optional] 
**rule_name** | **str** | Rule Name. | [optional] 
**rule_type** | [**Assetsv3RuleType**](Assetsv3RuleType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_rule import Assetsv3Rule

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3Rule from a JSON string
assetsv3_rule_instance = Assetsv3Rule.from_json(json)
# print the JSON string representation of the object
print(Assetsv3Rule.to_json())

# convert the object into a dict
assetsv3_rule_dict = assetsv3_rule_instance.to_dict()
# create an instance of Assetsv3Rule from a dict
assetsv3_rule_from_dict = Assetsv3Rule.from_dict(assetsv3_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


