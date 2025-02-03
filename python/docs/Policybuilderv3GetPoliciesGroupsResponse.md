# Policybuilderv3GetPoliciesGroupsResponse

Response message for groups being used in policies.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[Policybuilderv3PolicyGroups]**](Policybuilderv3PolicyGroups.md) | Message containing group and policy details. | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_get_policies_groups_response import Policybuilderv3GetPoliciesGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPoliciesGroupsResponse from a JSON string
policybuilderv3_get_policies_groups_response_instance = Policybuilderv3GetPoliciesGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPoliciesGroupsResponse.to_json())

# convert the object into a dict
policybuilderv3_get_policies_groups_response_dict = policybuilderv3_get_policies_groups_response_instance.to_dict()
# create an instance of Policybuilderv3GetPoliciesGroupsResponse from a dict
policybuilderv3_get_policies_groups_response_from_dict = Policybuilderv3GetPoliciesGroupsResponse.from_dict(policybuilderv3_get_policies_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


