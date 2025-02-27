# Policybuilderv3InstallationAndSequenceObject

Object indicating Installation and UI Sequence of the policies.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edge_identifier** | **str** |  | [optional] 
**installation_sequence** | **int** | Sequence in which the policy is to be installed. | [optional] 
**policy_id** | **str** | Policy id to perform sequencing on. | [optional] 
**ui_sequence** | **int** | Sequence of the policy in UI. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_installation_and_sequence_object import Policybuilderv3InstallationAndSequenceObject

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3InstallationAndSequenceObject from a JSON string
policybuilderv3_installation_and_sequence_object_instance = Policybuilderv3InstallationAndSequenceObject.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3InstallationAndSequenceObject.to_json())

# convert the object into a dict
policybuilderv3_installation_and_sequence_object_dict = policybuilderv3_installation_and_sequence_object_instance.to_dict()
# create an instance of Policybuilderv3InstallationAndSequenceObject from a dict
policybuilderv3_installation_and_sequence_object_from_dict = Policybuilderv3InstallationAndSequenceObject.from_dict(policybuilderv3_installation_and_sequence_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


