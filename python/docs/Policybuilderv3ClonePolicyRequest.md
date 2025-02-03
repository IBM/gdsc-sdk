# Policybuilderv3ClonePolicyRequest

Request message to clone policy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_id** | **str** | Policy id that needs to be cloned. | [optional] 
**policy_name** | **str** | New policy name of the cloned policy. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_clone_policy_request import Policybuilderv3ClonePolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3ClonePolicyRequest from a JSON string
policybuilderv3_clone_policy_request_instance = Policybuilderv3ClonePolicyRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3ClonePolicyRequest.to_json())

# convert the object into a dict
policybuilderv3_clone_policy_request_dict = policybuilderv3_clone_policy_request_instance.to_dict()
# create an instance of Policybuilderv3ClonePolicyRequest from a dict
policybuilderv3_clone_policy_request_from_dict = Policybuilderv3ClonePolicyRequest.from_dict(policybuilderv3_clone_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


