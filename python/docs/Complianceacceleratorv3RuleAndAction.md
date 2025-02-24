# Complianceacceleratorv3RuleAndAction

Policy rule and action for alerts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**Dict[str, Complianceacceleratorv3Action]**](Complianceacceleratorv3Action.md) | Action name. | [optional] 
**rule_id** | **str** | Rule id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_rule_and_action import Complianceacceleratorv3RuleAndAction

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3RuleAndAction from a JSON string
complianceacceleratorv3_rule_and_action_instance = Complianceacceleratorv3RuleAndAction.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3RuleAndAction.to_json())

# convert the object into a dict
complianceacceleratorv3_rule_and_action_dict = complianceacceleratorv3_rule_and_action_instance.to_dict()
# create an instance of Complianceacceleratorv3RuleAndAction from a dict
complianceacceleratorv3_rule_and_action_from_dict = Complianceacceleratorv3RuleAndAction.from_dict(complianceacceleratorv3_rule_and_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


