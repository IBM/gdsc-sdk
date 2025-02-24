# Guardiumconnectorv3ManagedUnitObject

Information about managed units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agg_health_status** | **int** | Aggregation health status. | [optional] 
**connectivity** | **int** | Connectivity status. | [optional] 
**details** | [**Guardiumconnectorv3MUDetailsObj**](Guardiumconnectorv3MUDetailsObj.md) |  | [optional] 
**exports_to** | **List[str]** | Aggregator the Managed Unit exports data to. | [optional] 
**id** | **int** | ID. | [optional] 
**imports_from** | **List[str]** | Managed Units the aggregator imports data from. | [optional] 
**mus_staps_health_status** | **int** | Monitoring agent health status. | [optional] 
**os_version** | **str** | Operating system version. | [optional] 
**patch** | **str** | Patch number. | [optional] 
**status** | **int** | Overall status. | [optional] 
**type** | **str** | Unit type. | [optional] 
**unit_hostname** | **str** | Name of the Guardium Data Protection system. | [optional] 
**unit_ip** | **str** | IP address. | [optional] 
**unit_utilization_health_status** | **int** | Unit utilization status. | [optional] 
**version** | **str** | Guardium Data Protection version. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_managed_unit_object import Guardiumconnectorv3ManagedUnitObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ManagedUnitObject from a JSON string
guardiumconnectorv3_managed_unit_object_instance = Guardiumconnectorv3ManagedUnitObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ManagedUnitObject.to_json())

# convert the object into a dict
guardiumconnectorv3_managed_unit_object_dict = guardiumconnectorv3_managed_unit_object_instance.to_dict()
# create an instance of Guardiumconnectorv3ManagedUnitObject from a dict
guardiumconnectorv3_managed_unit_object_from_dict = Guardiumconnectorv3ManagedUnitObject.from_dict(guardiumconnectorv3_managed_unit_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


