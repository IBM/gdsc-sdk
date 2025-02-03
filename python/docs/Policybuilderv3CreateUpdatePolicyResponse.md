# Policybuilderv3CreateUpdatePolicyResponse

Return object for creating or updating a policy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_status** | **int** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. | [optional] 
**installed_flag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] 
**policy_id** | **str** | Policy id of the created or updated policy. | [optional] 
**policy_name** | **str** | Policy Name for the created or updated policy. | [optional] 
**rules** | [**List[Policybuilderv3Rule]**](Policybuilderv3Rule.md) | Rules contained by the policy. | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_create_update_policy_response import Policybuilderv3CreateUpdatePolicyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3CreateUpdatePolicyResponse from a JSON string
policybuilderv3_create_update_policy_response_instance = Policybuilderv3CreateUpdatePolicyResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3CreateUpdatePolicyResponse.to_json())

# convert the object into a dict
policybuilderv3_create_update_policy_response_dict = policybuilderv3_create_update_policy_response_instance.to_dict()
# create an instance of Policybuilderv3CreateUpdatePolicyResponse from a dict
policybuilderv3_create_update_policy_response_from_dict = Policybuilderv3CreateUpdatePolicyResponse.from_dict(policybuilderv3_create_update_policy_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


