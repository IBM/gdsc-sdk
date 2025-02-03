# Healthcollectorv3ManagedUnitObjectGdp

Guardium Data Protection systems.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agg_health_status** | **int** | Aggregation health status. | [optional] 
**connectivity** | **int** | Connectivity status. | [optional] 
**details** | [**Healthcollectorv3MUDetailsObjGdp**](Healthcollectorv3MUDetailsObjGdp.md) |  | [optional] 
**exports_to** | **List[str]** | Aggregator the collector exports data to. | [optional] 
**id** | **int** | Id of the managed unit. | [optional] 
**imports_from** | **List[str]** | Collectors the aggregator imports data from. | [optional] 
**mus_staps_health_status** | **int** | Overall status of S-TAPs for the system. | [optional] 
**name** | **str** | Name of the Guardium Data Protection system. | [optional] 
**os_version** | **str** | Operating system version. | [optional] 
**patch** | **str** | Patch number. | [optional] 
**status** | **int** | Overall system status. | [optional] 
**type** | **str** | Unit type. | [optional] 
**unit_host_ip** | **str** | IP address. | [optional] 
**unit_utilization_health_status** | **int** | Unit utilization status. | [optional] 
**version** | **str** | Guardium Data Protection version. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_managed_unit_object_gdp import Healthcollectorv3ManagedUnitObjectGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3ManagedUnitObjectGdp from a JSON string
healthcollectorv3_managed_unit_object_gdp_instance = Healthcollectorv3ManagedUnitObjectGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3ManagedUnitObjectGdp.to_json())

# convert the object into a dict
healthcollectorv3_managed_unit_object_gdp_dict = healthcollectorv3_managed_unit_object_gdp_instance.to_dict()
# create an instance of Healthcollectorv3ManagedUnitObjectGdp from a dict
healthcollectorv3_managed_unit_object_gdp_from_dict = Healthcollectorv3ManagedUnitObjectGdp.from_dict(healthcollectorv3_managed_unit_object_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


