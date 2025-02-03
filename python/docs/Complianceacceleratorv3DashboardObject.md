# Complianceacceleratorv3DashboardObject

Dashboard object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of dashboards. | [optional] 
**type** | [**Complianceacceleratorv3DashboardType**](Complianceacceleratorv3DashboardType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_dashboard_object import Complianceacceleratorv3DashboardObject

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3DashboardObject from a JSON string
complianceacceleratorv3_dashboard_object_instance = Complianceacceleratorv3DashboardObject.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3DashboardObject.to_json())

# convert the object into a dict
complianceacceleratorv3_dashboard_object_dict = complianceacceleratorv3_dashboard_object_instance.to_dict()
# create an instance of Complianceacceleratorv3DashboardObject from a dict
complianceacceleratorv3_dashboard_object_from_dict = Complianceacceleratorv3DashboardObject.from_dict(complianceacceleratorv3_dashboard_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


