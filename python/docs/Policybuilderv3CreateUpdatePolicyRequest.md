# Policybuilderv3CreateUpdatePolicyRequest

Message Object for creating or updating a policy request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_override_name** | **bool** |  | [optional] 
**policy_object** | [**Policybuilderv3PolicyUpdate**](Policybuilderv3PolicyUpdate.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_create_update_policy_request import Policybuilderv3CreateUpdatePolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3CreateUpdatePolicyRequest from a JSON string
policybuilderv3_create_update_policy_request_instance = Policybuilderv3CreateUpdatePolicyRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3CreateUpdatePolicyRequest.to_json())

# convert the object into a dict
policybuilderv3_create_update_policy_request_dict = policybuilderv3_create_update_policy_request_instance.to_dict()
# create an instance of Policybuilderv3CreateUpdatePolicyRequest from a dict
policybuilderv3_create_update_policy_request_from_dict = Policybuilderv3CreateUpdatePolicyRequest.from_dict(policybuilderv3_create_update_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


