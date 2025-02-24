# Policybuilderv3GetPolicyNamesFromRuleIDsRequest

Request object containing a list of rule ids.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rule_ids_list** | **List[str]** | Rule Ids to get which policy is using them. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_policy_names_from_rule_ids_request import Policybuilderv3GetPolicyNamesFromRuleIDsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPolicyNamesFromRuleIDsRequest from a JSON string
policybuilderv3_get_policy_names_from_rule_ids_request_instance = Policybuilderv3GetPolicyNamesFromRuleIDsRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPolicyNamesFromRuleIDsRequest.to_json())

# convert the object into a dict
policybuilderv3_get_policy_names_from_rule_ids_request_dict = policybuilderv3_get_policy_names_from_rule_ids_request_instance.to_dict()
# create an instance of Policybuilderv3GetPolicyNamesFromRuleIDsRequest from a dict
policybuilderv3_get_policy_names_from_rule_ids_request_from_dict = Policybuilderv3GetPolicyNamesFromRuleIDsRequest.from_dict(policybuilderv3_get_policy_names_from_rule_ids_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


