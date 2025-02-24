# Policybuilderv3Policy

Policy object for creating/storing the policy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_status** | **int** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. | [optional] 
**contains_rule_types** | [**List[Policybuilderv3RuleType]**](Policybuilderv3RuleType.md) | Indicates different type of rule types contained by the policy. | [optional] 
**control_flow** | [**Policybuilderv3ControlFlow**](Policybuilderv3ControlFlow.md) |  | [optional] 
**edge_activation_info** | [**List[Policybuilderv3EdgeActivationObject]**](Policybuilderv3EdgeActivationObject.md) |  | [optional] 
**installed_flag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] 
**installed_order** | **int** | Variable to indicate the order of the installed policy. | [optional] 
**installed_timestamp** | **str** | Timestamp to indicate when the policy was installed. | [optional] 
**last_edited_timestamp** | **str** | Timestamp to indicate when the policy was last edited. | [optional] 
**log_flat** | **bool** | Flag to indicate whether the policy has log flat enabled or not. | [optional] 
**no_of_rules** | **int** | Indicates number of rules in the policy. | [optional] 
**policy_id** | **str** | Policy Id. | [optional] 
**policy_import_issue** | [**Policybuilderv3ImportIssue**](Policybuilderv3ImportIssue.md) |  | [optional] 
**policy_import_state** | [**Policybuilderv3ImportState**](Policybuilderv3ImportState.md) |  | [optional] 
**policy_name** | **str** | Policy Name. | [optional] 
**policy_type** | [**Policybuilderv3PolicyType**](Policybuilderv3PolicyType.md) |  | [optional] 
**rules_on_flat** | **bool** | Flag to indicate whether the policy has rules on flat enabled or not. | [optional] 
**template** | **bool** | Flag to indicate whether the policy is a template policy or not. | [optional] 
**ui_sequence** | **int** | Sequence in which the policy will be displayed in the UI. | [optional] 
**version** | **int** | Policy version for different versions of the policy. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_policy import Policybuilderv3Policy

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3Policy from a JSON string
policybuilderv3_policy_instance = Policybuilderv3Policy.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3Policy.to_json())

# convert the object into a dict
policybuilderv3_policy_dict = policybuilderv3_policy_instance.to_dict()
# create an instance of Policybuilderv3Policy from a dict
policybuilderv3_policy_from_dict = Policybuilderv3Policy.from_dict(policybuilderv3_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


