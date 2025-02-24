# Complianceacceleratorv3CreateWorkspaceRequest

Request message to create compliance workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compliance_info** | [**Complianceacceleratorv3ComplianceInfo**](Complianceacceleratorv3ComplianceInfo.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_create_workspace_request import Complianceacceleratorv3CreateWorkspaceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3CreateWorkspaceRequest from a JSON string
complianceacceleratorv3_create_workspace_request_instance = Complianceacceleratorv3CreateWorkspaceRequest.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3CreateWorkspaceRequest.to_json())

# convert the object into a dict
complianceacceleratorv3_create_workspace_request_dict = complianceacceleratorv3_create_workspace_request_instance.to_dict()
# create an instance of Complianceacceleratorv3CreateWorkspaceRequest from a dict
complianceacceleratorv3_create_workspace_request_from_dict = Complianceacceleratorv3CreateWorkspaceRequest.from_dict(complianceacceleratorv3_create_workspace_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


