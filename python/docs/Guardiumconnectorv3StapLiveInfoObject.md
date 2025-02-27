# Guardiumconnectorv3StapLiveInfoObject

Additional information about S-TAP liveliness.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**has_event** | **bool** | Event flag. | [optional] 
**health_status** | **int** | Health status. | [optional] 
**liveliness_state** | **str** | Liveliness state. | [optional] 
**stap** | **str** | S-TAP host name or IP address. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_stap_live_info_object import Guardiumconnectorv3StapLiveInfoObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3StapLiveInfoObject from a JSON string
guardiumconnectorv3_stap_live_info_object_instance = Guardiumconnectorv3StapLiveInfoObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3StapLiveInfoObject.to_json())

# convert the object into a dict
guardiumconnectorv3_stap_live_info_object_dict = guardiumconnectorv3_stap_live_info_object_instance.to_dict()
# create an instance of Guardiumconnectorv3StapLiveInfoObject from a dict
guardiumconnectorv3_stap_live_info_object_from_dict = Guardiumconnectorv3StapLiveInfoObject.from_dict(guardiumconnectorv3_stap_live_info_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


