# Policybuilderv3GetPolicyNamesFromRuleIDsResponse

Response message that return the rule id(key) : policy name (value) mapping.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_names** | **Dict[str, str]** | Map where key is the the rule id and value is the policy name that uses that rule id. | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policy_names_from_rule_ids_response import Policybuilderv3GetPolicyNamesFromRuleIDsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPolicyNamesFromRuleIDsResponse from a JSON string
policybuilderv3_get_policy_names_from_rule_ids_response_instance = Policybuilderv3GetPolicyNamesFromRuleIDsResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPolicyNamesFromRuleIDsResponse.to_json())

# convert the object into a dict
policybuilderv3_get_policy_names_from_rule_ids_response_dict = policybuilderv3_get_policy_names_from_rule_ids_response_instance.to_dict()
# create an instance of Policybuilderv3GetPolicyNamesFromRuleIDsResponse from a dict
policybuilderv3_get_policy_names_from_rule_ids_response_from_dict = Policybuilderv3GetPolicyNamesFromRuleIDsResponse.from_dict(policybuilderv3_get_policy_names_from_rule_ids_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


