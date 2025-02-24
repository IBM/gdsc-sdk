# Guardiumconnectorv3InspectionEngineDetails

Additional information for an inspection engine.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ie** | **str** | Inspection engine. | [optional] 
**port** | **str** | Port. | [optional] 
**protocol** | **str** | Protocol. | [optional] 
**stap** | **str** | S -TAP name. | [optional] 
**verification_health** | **int** | Verfication health. | [optional] 
**verification_result** | **str** | Verfication results. | [optional] 
**verification_state** | **str** | Verfication state. | [optional] 
**version** | **str** | Version. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_inspection_engine_details import Guardiumconnectorv3InspectionEngineDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3InspectionEngineDetails from a JSON string
guardiumconnectorv3_inspection_engine_details_instance = Guardiumconnectorv3InspectionEngineDetails.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3InspectionEngineDetails.to_json())

# convert the object into a dict
guardiumconnectorv3_inspection_engine_details_dict = guardiumconnectorv3_inspection_engine_details_instance.to_dict()
# create an instance of Guardiumconnectorv3InspectionEngineDetails from a dict
guardiumconnectorv3_inspection_engine_details_from_dict = Guardiumconnectorv3InspectionEngineDetails.from_dict(guardiumconnectorv3_inspection_engine_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


