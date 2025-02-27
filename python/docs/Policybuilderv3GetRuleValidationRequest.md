# Policybuilderv3GetRuleValidationRequest

Request message to validate rule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rule** | [**Policybuilderv3Rule**](Policybuilderv3Rule.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_rule_validation_request import Policybuilderv3GetRuleValidationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetRuleValidationRequest from a JSON string
policybuilderv3_get_rule_validation_request_instance = Policybuilderv3GetRuleValidationRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetRuleValidationRequest.to_json())

# convert the object into a dict
policybuilderv3_get_rule_validation_request_dict = policybuilderv3_get_rule_validation_request_instance.to_dict()
# create an instance of Policybuilderv3GetRuleValidationRequest from a dict
policybuilderv3_get_rule_validation_request_from_dict = Policybuilderv3GetRuleValidationRequest.from_dict(policybuilderv3_get_rule_validation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


