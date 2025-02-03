# Guardiumconnectorv3GetHealthInfoResponse

Returns the health status for a particular Central Manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**List[Guardiumconnectorv3ManagedUnitObject]**](Guardiumconnectorv3ManagedUnitObject.md) | List of Guardium Data Protection systems. | [optional] 
**staps** | [**List[Guardiumconnectorv3StapObject]**](Guardiumconnectorv3StapObject.md) | Details of S-TAPs for the system. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_health_info_response import Guardiumconnectorv3GetHealthInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetHealthInfoResponse from a JSON string
guardiumconnectorv3_get_health_info_response_instance = Guardiumconnectorv3GetHealthInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetHealthInfoResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_health_info_response_dict = guardiumconnectorv3_get_health_info_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetHealthInfoResponse from a dict
guardiumconnectorv3_get_health_info_response_from_dict = Guardiumconnectorv3GetHealthInfoResponse.from_dict(guardiumconnectorv3_get_health_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


