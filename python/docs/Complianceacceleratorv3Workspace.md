# Complianceacceleratorv3Workspace


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audit_info** | [**Complianceacceleratorv3AuditConfig**](Complianceacceleratorv3AuditConfig.md) |  | [optional] 
**dashboards** | [**List[Complianceacceleratorv3DashboardObject]**](Complianceacceleratorv3DashboardObject.md) |  | [optional] 
**groups** | [**Dict[str, Complianceacceleratorv3Group]**](Complianceacceleratorv3Group.md) | Groups for the policies and reports. | [optional] 
**reports_map** | [**Dict[str, Complianceacceleratorv3Reports]**](Complianceacceleratorv3Reports.md) | List of reports with basic info. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_workspace import Complianceacceleratorv3Workspace

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3Workspace from a JSON string
complianceacceleratorv3_workspace_instance = Complianceacceleratorv3Workspace.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3Workspace.to_json())

# convert the object into a dict
complianceacceleratorv3_workspace_dict = complianceacceleratorv3_workspace_instance.to_dict()
# create an instance of Complianceacceleratorv3Workspace from a dict
complianceacceleratorv3_workspace_from_dict = Complianceacceleratorv3Workspace.from_dict(complianceacceleratorv3_workspace_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


