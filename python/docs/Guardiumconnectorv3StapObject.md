# Guardiumconnectorv3StapObject

Information about monitoring agents.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collector_hostname** | **str** | Host name of Guardium Data Protection system. | [optional] 
**connectivity** | **int** | Connectivity status. | [optional] 
**details** | [**Guardiumconnectorv3StapDetailsObject**](Guardiumconnectorv3StapDetailsObject.md) |  | [optional] 
**ie_status** | **int** | Overall status of inspection engines. | [optional] 
**ie_list** | [**List[Guardiumconnectorv3InspectionEngineObject]**](Guardiumconnectorv3InspectionEngineObject.md) | List of inspection engines. | [optional] 
**inspectionengine** | **int** | Count of inspection engines. | [optional] 
**ktap** | **int** | K-TAP status. | [optional] 
**name** | **str** | Name of the S-TAP. | [optional] 
**os_type** | **str** | Operating system. | [optional] 
**revision** | **str** | Revision. | [optional] 
**stap_ip** | **str** | IP address. | [optional] 
**status** | **int** | Overall status. | [optional] 
**traffic** | **int** | Traffic status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_stap_object import Guardiumconnectorv3StapObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3StapObject from a JSON string
guardiumconnectorv3_stap_object_instance = Guardiumconnectorv3StapObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3StapObject.to_json())

# convert the object into a dict
guardiumconnectorv3_stap_object_dict = guardiumconnectorv3_stap_object_instance.to_dict()
# create an instance of Guardiumconnectorv3StapObject from a dict
guardiumconnectorv3_stap_object_from_dict = Guardiumconnectorv3StapObject.from_dict(guardiumconnectorv3_stap_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


