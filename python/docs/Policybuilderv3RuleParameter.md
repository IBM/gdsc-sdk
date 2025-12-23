# Policybuilderv3RuleParameter

Message format for rule parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_name** | **str** | Parameter Name. | [optional] 
**parameter_operator** | [**Policybuilderv3ParameterOperator**](Policybuilderv3ParameterOperator.md) |  | [optional] [default to Policybuilderv3ParameterOperator.UNKNOWN_OPERATOR]
**parameter_type** | **str** | Type of the parameter. | [optional] 
**parameter_value** | **str** | The operator of the parameter. | [optional] 
**parameter_value_label** | **str** | Label of the value if the original value is some id referencing to external entity. | [optional] 
**ui_label** | **str** | Display label for UI for this parameter. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_rule_parameter import Policybuilderv3RuleParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3RuleParameter from a JSON string
policybuilderv3_rule_parameter_instance = Policybuilderv3RuleParameter.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3RuleParameter.to_json())

# convert the object into a dict
policybuilderv3_rule_parameter_dict = policybuilderv3_rule_parameter_instance.to_dict()
# create an instance of Policybuilderv3RuleParameter from a dict
policybuilderv3_rule_parameter_from_dict = Policybuilderv3RuleParameter.from_dict(policybuilderv3_rule_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


