# Guardiumconnectorv3StapDetailsObject

Additional information for an S-TAP.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectivity_details** | [**Guardiumconnectorv3GeneralDetailsObject**](Guardiumconnectorv3GeneralDetailsObject.md) |  | [optional] 
**general_err_messages** | **List[str]** | General error messages. | [optional] 
**ktap_details** | [**Guardiumconnectorv3GeneralDetailsObject**](Guardiumconnectorv3GeneralDetailsObject.md) |  | [optional] 
**stap_liveliness_info** | [**Guardiumconnectorv3StapLiveInfoObject**](Guardiumconnectorv3StapLiveInfoObject.md) |  | [optional] 
**stap_ver_info_list** | [**List[Guardiumconnectorv3InspectionEngineDetails]**](Guardiumconnectorv3InspectionEngineDetails.md) | Inspection engine details. | [optional] 
**traffic_details** | [**Guardiumconnectorv3GeneralDetailsObject**](Guardiumconnectorv3GeneralDetailsObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_stap_details_object import Guardiumconnectorv3StapDetailsObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3StapDetailsObject from a JSON string
guardiumconnectorv3_stap_details_object_instance = Guardiumconnectorv3StapDetailsObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3StapDetailsObject.to_json())

# convert the object into a dict
guardiumconnectorv3_stap_details_object_dict = guardiumconnectorv3_stap_details_object_instance.to_dict()
# create an instance of Guardiumconnectorv3StapDetailsObject from a dict
guardiumconnectorv3_stap_details_object_from_dict = Guardiumconnectorv3StapDetailsObject.from_dict(guardiumconnectorv3_stap_details_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


