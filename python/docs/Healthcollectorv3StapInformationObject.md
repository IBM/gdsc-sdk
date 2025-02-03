# Healthcollectorv3StapInformationObject

S-tap related information object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspection_engine_details** | [**List[Healthcollectorv3InspectionEnginePresentDetails]**](Healthcollectorv3InspectionEnginePresentDetails.md) | Details of inspection engines present at start and end. | [optional] 
**inspection_engine_details_change** | **int** | Difference of inspection engines present at start and end. | [optional] 
**present_at_end** | **bool** | Indicates whether the s-tap was present at end. | [optional] 
**present_at_start** | **bool** | Indicates whether the s-tap was present at start. | [optional] 
**stap** | [**Healthcollectorv3StapObject**](Healthcollectorv3StapObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_stap_information_object import Healthcollectorv3StapInformationObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StapInformationObject from a JSON string
healthcollectorv3_stap_information_object_instance = Healthcollectorv3StapInformationObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StapInformationObject.to_json())

# convert the object into a dict
healthcollectorv3_stap_information_object_dict = healthcollectorv3_stap_information_object_instance.to_dict()
# create an instance of Healthcollectorv3StapInformationObject from a dict
healthcollectorv3_stap_information_object_from_dict = Healthcollectorv3StapInformationObject.from_dict(healthcollectorv3_stap_information_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


