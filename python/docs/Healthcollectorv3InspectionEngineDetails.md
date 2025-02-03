# Healthcollectorv3InspectionEngineDetails

InspectionEngineDetails gets additional information about inspection engines.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ie** | **str** | Inspection engine. | [optional] 
**port** | **str** | Port. | [optional] 
**protocol** | **str** | Protocol. | [optional] 
**stap** | **str** | S-TAP of the inspection engine. | [optional] 
**status** | **int** | Status of inspection engine. | [optional] 
**verification_result** | **str** | Verification result. | [optional] 
**verification_state** | **str** | Verification state. | [optional] 
**version** | **str** | Version. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_inspection_engine_details import Healthcollectorv3InspectionEngineDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3InspectionEngineDetails from a JSON string
healthcollectorv3_inspection_engine_details_instance = Healthcollectorv3InspectionEngineDetails.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3InspectionEngineDetails.to_json())

# convert the object into a dict
healthcollectorv3_inspection_engine_details_dict = healthcollectorv3_inspection_engine_details_instance.to_dict()
# create an instance of Healthcollectorv3InspectionEngineDetails from a dict
healthcollectorv3_inspection_engine_details_from_dict = Healthcollectorv3InspectionEngineDetails.from_dict(healthcollectorv3_inspection_engine_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


