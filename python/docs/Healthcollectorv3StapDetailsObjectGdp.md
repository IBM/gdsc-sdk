# Healthcollectorv3StapDetailsObjectGdp

StapDetailsObject gets additional information about S-TAPs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectivity_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 
**general_err_messages** | **List[str]** | General error messages of the S-TAP. | [optional] 
**ktap_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 
**stap_liveliness_info** | [**Healthcollectorv3StapLiveInfoObject**](Healthcollectorv3StapLiveInfoObject.md) |  | [optional] 
**stap_ver_info_list** | [**List[Healthcollectorv3InspectionEngineDetailsGdp]**](Healthcollectorv3InspectionEngineDetailsGdp.md) | Inspection engine details of the S-TAP. | [optional] 
**traffic_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_stap_details_object_gdp import Healthcollectorv3StapDetailsObjectGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StapDetailsObjectGdp from a JSON string
healthcollectorv3_stap_details_object_gdp_instance = Healthcollectorv3StapDetailsObjectGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StapDetailsObjectGdp.to_json())

# convert the object into a dict
healthcollectorv3_stap_details_object_gdp_dict = healthcollectorv3_stap_details_object_gdp_instance.to_dict()
# create an instance of Healthcollectorv3StapDetailsObjectGdp from a dict
healthcollectorv3_stap_details_object_gdp_from_dict = Healthcollectorv3StapDetailsObjectGdp.from_dict(healthcollectorv3_stap_details_object_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


