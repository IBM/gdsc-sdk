# Policybuilderv3InstallPoliciesRequest

Install Policies Request object for policy installation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**perform_installation** | **bool** | Flag which will indicate whether its just ui sequence reordering or installation and sequence ordering. | [optional] 
**policy_list** | [**List[Policybuilderv3InstallationAndSequenceObject]**](Policybuilderv3InstallationAndSequenceObject.md) | Policy Ids that would be installed. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_install_policies_request import Policybuilderv3InstallPoliciesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3InstallPoliciesRequest from a JSON string
policybuilderv3_install_policies_request_instance = Policybuilderv3InstallPoliciesRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3InstallPoliciesRequest.to_json())

# convert the object into a dict
policybuilderv3_install_policies_request_dict = policybuilderv3_install_policies_request_instance.to_dict()
# create an instance of Policybuilderv3InstallPoliciesRequest from a dict
policybuilderv3_install_policies_request_from_dict = Policybuilderv3InstallPoliciesRequest.from_dict(policybuilderv3_install_policies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


