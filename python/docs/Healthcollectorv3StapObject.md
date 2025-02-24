# Healthcollectorv3StapObject

StapObject gets information about monitoring agents.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collector_hostname** | **str** | Host name of Guardium Data Protection system. | [optional] 
**connectivity** | **int** | Connectivity status. | [optional] 
**details** | [**Healthcollectorv3StapDetailsObject**](Healthcollectorv3StapDetailsObject.md) |  | [optional] 
**ie_count** | **int** | Count of inspection engines. | [optional] 
**ie_details** | [**List[Healthcollectorv3InspectionEngineDetails]**](Healthcollectorv3InspectionEngineDetails.md) | Details about inspection engines. | [optional] 
**ktap** | **int** | K-TAP status. | [optional] 
**name** | **str** | Name of the S-TAP. | [optional] 
**os_type** | **str** | Operating system. | [optional] 
**overall_ie_status** | **int** | Overall status of inspection engines. | [optional] 
**revision** | **str** | Revision. | [optional] 
**stap_ip** | **str** | IP address. | [optional] 
**status** | **int** | Overall status. | [optional] 
**traffic** | **int** | Traffic status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_stap_object import Healthcollectorv3StapObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StapObject from a JSON string
healthcollectorv3_stap_object_instance = Healthcollectorv3StapObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StapObject.to_json())

# convert the object into a dict
healthcollectorv3_stap_object_dict = healthcollectorv3_stap_object_instance.to_dict()
# create an instance of Healthcollectorv3StapObject from a dict
healthcollectorv3_stap_object_from_dict = Healthcollectorv3StapObject.from_dict(healthcollectorv3_stap_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


