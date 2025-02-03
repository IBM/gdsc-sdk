# Healthcollectorv3ManagedUnitObject

ManagedUnitObject gets information about managed units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_health_status** | **int** | Aggregation health status. | [optional] 
**connectivity** | **int** | Connectivity status. | [optional] 
**details** | [**Healthcollectorv3MUDetailsObj**](Healthcollectorv3MUDetailsObj.md) |  | [optional] 
**exports_to** | **List[str]** | Aggregator the collector exports data to. | [optional] 
**imports_from** | **List[str]** | Collectors the aggregator imports data from. | [optional] 
**os_version** | **str** | Operating system version. | [optional] 
**overall_stap_status_for_mu** | **int** | Overall status of S-TAPs for the system. | [optional] 
**overall_status** | **int** | Overall system status. | [optional] 
**patch** | **str** | Patch number. | [optional] 
**staps** | [**List[Healthcollectorv3StapObject]**](Healthcollectorv3StapObject.md) | Details of S-TAPs for the system. | [optional] 
**type** | **str** | Unit type. | [optional] 
**unit_hostname** | **str** | Name of the Guardium Data Protection system. | [optional] 
**unit_ip** | **str** | IP address. | [optional] 
**unit_utilization_health_status** | **int** | Unit utilization status. | [optional] 
**version** | **str** | Guardium Data Protection version. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_managed_unit_object import Healthcollectorv3ManagedUnitObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3ManagedUnitObject from a JSON string
healthcollectorv3_managed_unit_object_instance = Healthcollectorv3ManagedUnitObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3ManagedUnitObject.to_json())

# convert the object into a dict
healthcollectorv3_managed_unit_object_dict = healthcollectorv3_managed_unit_object_instance.to_dict()
# create an instance of Healthcollectorv3ManagedUnitObject from a dict
healthcollectorv3_managed_unit_object_from_dict = Healthcollectorv3ManagedUnitObject.from_dict(healthcollectorv3_managed_unit_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


