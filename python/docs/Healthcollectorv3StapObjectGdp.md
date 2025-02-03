# Healthcollectorv3StapObjectGdp

StapObject gets information about monitoring agents.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**children** | [**List[Healthcollectorv3InspectionEngineObjectGdp]**](Healthcollectorv3InspectionEngineObjectGdp.md) | Details about inspection engines. | [optional] 
**collector_host_name** | **str** | Host name of Guardium Data Protection system. | [optional] 
**connectivity** | **int** | Connectivity status of the S-TAP. | [optional] 
**details** | [**Healthcollectorv3StapDetailsObjectGdp**](Healthcollectorv3StapDetailsObjectGdp.md) |  | [optional] 
**ie_status** | **int** | Overall status of inspection engines. | [optional] 
**inspection_engine** | **str** | Name of inspection engine. | [optional] 
**ktap** | **int** | Status of the K-TAP. | [optional] 
**name** | **str** | Name of the S-TAP. | [optional] 
**os_type** | **str** | Operating system of the S-TAP. | [optional] 
**revision** | **str** | The OS revision of the S-TAP. | [optional] 
**stap_ip** | **str** | IP address of the S-TAP. | [optional] 
**status** | **int** | Overall status of the S-TAP. | [optional] 
**traffic** | **int** | Traffic status from inspection engine for the S-TAP. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_stap_object_gdp import Healthcollectorv3StapObjectGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StapObjectGdp from a JSON string
healthcollectorv3_stap_object_gdp_instance = Healthcollectorv3StapObjectGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StapObjectGdp.to_json())

# convert the object into a dict
healthcollectorv3_stap_object_gdp_dict = healthcollectorv3_stap_object_gdp_instance.to_dict()
# create an instance of Healthcollectorv3StapObjectGdp from a dict
healthcollectorv3_stap_object_gdp_from_dict = Healthcollectorv3StapObjectGdp.from_dict(healthcollectorv3_stap_object_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


