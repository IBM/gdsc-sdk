# Complianceacceleratorv3ComplianceInfo

Compliance data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**options** | [**Complianceacceleratorv3Options**](Complianceacceleratorv3Options.md) |  | [optional] 
**workspaces** | [**Dict[str, Complianceacceleratorv3Workspace]**](Complianceacceleratorv3Workspace.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_compliance_info import Complianceacceleratorv3ComplianceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3ComplianceInfo from a JSON string
complianceacceleratorv3_compliance_info_instance = Complianceacceleratorv3ComplianceInfo.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3ComplianceInfo.to_json())

# convert the object into a dict
complianceacceleratorv3_compliance_info_dict = complianceacceleratorv3_compliance_info_instance.to_dict()
# create an instance of Complianceacceleratorv3ComplianceInfo from a dict
complianceacceleratorv3_compliance_info_from_dict = Complianceacceleratorv3ComplianceInfo.from_dict(complianceacceleratorv3_compliance_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


