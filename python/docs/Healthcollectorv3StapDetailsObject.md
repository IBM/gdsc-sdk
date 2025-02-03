# Healthcollectorv3StapDetailsObject

StapDetailsObject gets additional information about S-TAPs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectivity_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 
**general_err_messages** | **List[str]** | General error messages. | [optional] 
**ktap_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 
**stap_liveliness_information** | [**Healthcollectorv3StapLiveInfoObject**](Healthcollectorv3StapLiveInfoObject.md) |  | [optional] 
**traffic_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_stap_details_object import Healthcollectorv3StapDetailsObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StapDetailsObject from a JSON string
healthcollectorv3_stap_details_object_instance = Healthcollectorv3StapDetailsObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StapDetailsObject.to_json())

# convert the object into a dict
healthcollectorv3_stap_details_object_dict = healthcollectorv3_stap_details_object_instance.to_dict()
# create an instance of Healthcollectorv3StapDetailsObject from a dict
healthcollectorv3_stap_details_object_from_dict = Healthcollectorv3StapDetailsObject.from_dict(healthcollectorv3_stap_details_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


