# Healthcollectorv3StapLiveInfoObject

StapLiveInfoObject gets additional information about S-TAP liveliness.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**has_event** | **bool** | Event flag. | [optional] 
**health_status** | **int** | Health status. | [optional] 
**liveliness_state** | **str** | Liveliness state. | [optional] 
**stap** | **str** | S-TAP host name or IP address. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_stap_live_info_object import Healthcollectorv3StapLiveInfoObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StapLiveInfoObject from a JSON string
healthcollectorv3_stap_live_info_object_instance = Healthcollectorv3StapLiveInfoObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StapLiveInfoObject.to_json())

# convert the object into a dict
healthcollectorv3_stap_live_info_object_dict = healthcollectorv3_stap_live_info_object_instance.to_dict()
# create an instance of Healthcollectorv3StapLiveInfoObject from a dict
healthcollectorv3_stap_live_info_object_from_dict = Healthcollectorv3StapLiveInfoObject.from_dict(healthcollectorv3_stap_live_info_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


