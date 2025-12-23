# Policybuilderv3PolicyUpdate

Create and update policy request message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_status** | **int** | Activation status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. | [optional] 
**control_flow** | [**Policybuilderv3ControlFlow**](Policybuilderv3ControlFlow.md) |  | [optional] [default to Policybuilderv3ControlFlow.STANDARD]
**deleted_rule_ids** | **List[str]** | The rule ids which are supposed to be deleted on a update policy request. | [optional] 
**installed_flag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] 
**installed_order** | **int** | Variable to indicate the order of the installed policy. | [optional] 
**installed_timestamp** | **str** | Timestamp to indicate when the policy was installed. | [optional] 
**last_edited_timestamp** | **str** | Timestamp to indicate when the policy was last edited. | [optional] 
**log_flat** | **bool** | Flag to indicate whether the policy has log flat enabled or not. | [optional] 
**policy_id** | **str** | Policy Id. | [optional] 
**policy_name** | **str** | Policy Name. | [optional] 
**policy_type** | [**Policybuilderv3PolicyType**](Policybuilderv3PolicyType.md) |  | [optional] [default to Policybuilderv3PolicyType.DATA_POLICY]
**product_id** | [**Policybuilderv3ProductType**](Policybuilderv3ProductType.md) |  | [optional] [default to Policybuilderv3ProductType.NO_PRODUCT]
**rules** | [**List[Policybuilderv3Rule]**](Policybuilderv3Rule.md) |  | [optional] 
**rules_on_flat** | **bool** | Flag to indicate whether the policy has rules on flat enabled or not. | [optional] 
**template** | **bool** | Flag to indicate whether the policy is a template policy or not. | [optional] 
**version** | **int** | Version of the policy. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_policy_update import Policybuilderv3PolicyUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3PolicyUpdate from a JSON string
policybuilderv3_policy_update_instance = Policybuilderv3PolicyUpdate.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3PolicyUpdate.to_json())

# convert the object into a dict
policybuilderv3_policy_update_dict = policybuilderv3_policy_update_instance.to_dict()
# create an instance of Policybuilderv3PolicyUpdate from a dict
policybuilderv3_policy_update_from_dict = Policybuilderv3PolicyUpdate.from_dict(policybuilderv3_policy_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


