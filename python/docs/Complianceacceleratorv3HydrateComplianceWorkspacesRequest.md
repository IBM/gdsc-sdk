# Complianceacceleratorv3HydrateComplianceWorkspacesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compliance_id** | **str** | Workspace to be hydrated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_hydrate_compliance_workspaces_request import Complianceacceleratorv3HydrateComplianceWorkspacesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3HydrateComplianceWorkspacesRequest from a JSON string
complianceacceleratorv3_hydrate_compliance_workspaces_request_instance = Complianceacceleratorv3HydrateComplianceWorkspacesRequest.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3HydrateComplianceWorkspacesRequest.to_json())

# convert the object into a dict
complianceacceleratorv3_hydrate_compliance_workspaces_request_dict = complianceacceleratorv3_hydrate_compliance_workspaces_request_instance.to_dict()
# create an instance of Complianceacceleratorv3HydrateComplianceWorkspacesRequest from a dict
complianceacceleratorv3_hydrate_compliance_workspaces_request_from_dict = Complianceacceleratorv3HydrateComplianceWorkspacesRequest.from_dict(complianceacceleratorv3_hydrate_compliance_workspaces_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


