# Complianceacceleratorv3DeleteComplianceWorkspacesResponse

Response message after deleting compliance data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Complianceacceleratorv3StatusResponseBase**](Complianceacceleratorv3StatusResponseBase.md) |  | [optional] 
**workspace_id** | **str** | The id of the workspace. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_delete_compliance_workspaces_response import Complianceacceleratorv3DeleteComplianceWorkspacesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3DeleteComplianceWorkspacesResponse from a JSON string
complianceacceleratorv3_delete_compliance_workspaces_response_instance = Complianceacceleratorv3DeleteComplianceWorkspacesResponse.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3DeleteComplianceWorkspacesResponse.to_json())

# convert the object into a dict
complianceacceleratorv3_delete_compliance_workspaces_response_dict = complianceacceleratorv3_delete_compliance_workspaces_response_instance.to_dict()
# create an instance of Complianceacceleratorv3DeleteComplianceWorkspacesResponse from a dict
complianceacceleratorv3_delete_compliance_workspaces_response_from_dict = Complianceacceleratorv3DeleteComplianceWorkspacesResponse.from_dict(complianceacceleratorv3_delete_compliance_workspaces_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


