# Policybuilderv3Rule

Message format for rule object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[Policybuilderv3Action]**](Policybuilderv3Action.md) | Action object of the actions in the rules. | [optional] 
**continue_to_next_rule** | **bool** | Flag indicating whether continue to next rule is on/off. | [optional] 
**empty_groups** | **List[int]** | Variable that contains group ids being used by the rule that contains 0 members. | [optional] 
**invalid_actions** | [**List[Policybuilderv3Action]**](Policybuilderv3Action.md) |  | [optional] 
**invalid_parameters** | [**List[Policybuilderv3RuleParameter]**](Policybuilderv3RuleParameter.md) |  | [optional] 
**parameters** | [**List[Policybuilderv3RuleParameter]**](Policybuilderv3RuleParameter.md) | Parameter object which are used in the rule. | [optional] 
**policy_id** | **str** | Policy Id. | [optional] 
**rule_id** | **str** | Rule id. | [optional] 
**rule_key** | **str** |  | [optional] 
**rule_name** | **str** | Rule name. | [optional] 
**rule_order** | **int** | Integer to indicate the order of the rule in the policy. | [optional] 
**rule_type** | [**Policybuilderv3RuleType**](Policybuilderv3RuleType.md) |  | [optional] [default to Policybuilderv3RuleType.ACCESS]
**severity** | [**Policybuilderv3RuleSeverity**](Policybuilderv3RuleSeverity.md) |  | [optional] [default to Policybuilderv3RuleSeverity.INFO]
**tags** | **List[str]** | Variable that contains tags assosicated with the rule. | [optional] 
**template** | **bool** | Flag to indicate if the rule is a template rule. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_rule import Policybuilderv3Rule

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3Rule from a JSON string
policybuilderv3_rule_instance = Policybuilderv3Rule.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3Rule.to_json())

# convert the object into a dict
policybuilderv3_rule_dict = policybuilderv3_rule_instance.to_dict()
# create an instance of Policybuilderv3Rule from a dict
policybuilderv3_rule_from_dict = Policybuilderv3Rule.from_dict(policybuilderv3_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


