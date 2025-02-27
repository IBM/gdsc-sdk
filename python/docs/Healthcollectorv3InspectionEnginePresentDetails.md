# Healthcollectorv3InspectionEnginePresentDetails

Details if inspection engine are present at start and end.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspection_engine** | **str** | Name of the inspection engine. | [optional] 
**present_at_end** | **bool** | Inspection engine present at end time. | [optional] 
**present_at_start** | **bool** | Inspection engine present at start time. | [optional] 
**protocol** | **str** | Protocol of the ie. | [optional] 
**version** | **str** | Version of the ie. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_inspection_engine_present_details import Healthcollectorv3InspectionEnginePresentDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3InspectionEnginePresentDetails from a JSON string
healthcollectorv3_inspection_engine_present_details_instance = Healthcollectorv3InspectionEnginePresentDetails.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3InspectionEnginePresentDetails.to_json())

# convert the object into a dict
healthcollectorv3_inspection_engine_present_details_dict = healthcollectorv3_inspection_engine_present_details_instance.to_dict()
# create an instance of Healthcollectorv3InspectionEnginePresentDetails from a dict
healthcollectorv3_inspection_engine_present_details_from_dict = Healthcollectorv3InspectionEnginePresentDetails.from_dict(healthcollectorv3_inspection_engine_present_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


