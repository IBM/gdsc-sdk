# Complianceacceleratorv3CreateWorkspaceResponse

Response message to create compliance workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Complianceacceleratorv3WorkspaceCreationStatus**](Complianceacceleratorv3WorkspaceCreationStatus.md) |  | [optional] 
**title** | **str** | More info of the step. | [optional] 
**workspace_id** | **str** | The id of the workspace. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_create_workspace_response import Complianceacceleratorv3CreateWorkspaceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3CreateWorkspaceResponse from a JSON string
complianceacceleratorv3_create_workspace_response_instance = Complianceacceleratorv3CreateWorkspaceResponse.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3CreateWorkspaceResponse.to_json())

# convert the object into a dict
complianceacceleratorv3_create_workspace_response_dict = complianceacceleratorv3_create_workspace_response_instance.to_dict()
# create an instance of Complianceacceleratorv3CreateWorkspaceResponse from a dict
complianceacceleratorv3_create_workspace_response_from_dict = Complianceacceleratorv3CreateWorkspaceResponse.from_dict(complianceacceleratorv3_create_workspace_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


