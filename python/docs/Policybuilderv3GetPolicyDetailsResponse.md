# Policybuilderv3GetPolicyDetailsResponse

Policy details response message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_status** | **int** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. | [optional] 
**control_flow** | [**Policybuilderv3ControlFlow**](Policybuilderv3ControlFlow.md) |  | [optional] 
**installed_flag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] 
**policy_import_issue** | [**Policybuilderv3ImportIssue**](Policybuilderv3ImportIssue.md) |  | [optional] 
**policy_import_state** | [**Policybuilderv3ImportState**](Policybuilderv3ImportState.md) |  | [optional] 
**policy_info** | [**Policybuilderv3Policy**](Policybuilderv3Policy.md) |  | [optional] 
**policy_name** | **str** |  | [optional] 
**rules** | [**List[Policybuilderv3Rule]**](Policybuilderv3Rule.md) | Rules contained by the policy. | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_policy_details_response import Policybuilderv3GetPolicyDetailsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPolicyDetailsResponse from a JSON string
policybuilderv3_get_policy_details_response_instance = Policybuilderv3GetPolicyDetailsResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPolicyDetailsResponse.to_json())

# convert the object into a dict
policybuilderv3_get_policy_details_response_dict = policybuilderv3_get_policy_details_response_instance.to_dict()
# create an instance of Policybuilderv3GetPolicyDetailsResponse from a dict
policybuilderv3_get_policy_details_response_from_dict = Policybuilderv3GetPolicyDetailsResponse.from_dict(policybuilderv3_get_policy_details_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


