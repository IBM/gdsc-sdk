# Healthcollectorv3InspectionEngineDetailsGdp

InspectionEngineDetails gets additional information about inspection engines.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ie** | **str** | Inspection engine name. | [optional] 
**port** | **str** | Port of the inspection engine. | [optional] 
**protocol** | **str** | Protocol being used. | [optional] 
**stap** | **str** | S-TAP of the inspection engine. | [optional] 
**verification_health** | **int** | Status of inspection engine. | [optional] 
**verification_result** | **str** | Verification result of the inspection engine. | [optional] 
**verification_state** | **str** | Verification state of the inspection engine. | [optional] 
**version** | **str** | Version of the inspection engine. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_inspection_engine_details_gdp import Healthcollectorv3InspectionEngineDetailsGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3InspectionEngineDetailsGdp from a JSON string
healthcollectorv3_inspection_engine_details_gdp_instance = Healthcollectorv3InspectionEngineDetailsGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3InspectionEngineDetailsGdp.to_json())

# convert the object into a dict
healthcollectorv3_inspection_engine_details_gdp_dict = healthcollectorv3_inspection_engine_details_gdp_instance.to_dict()
# create an instance of Healthcollectorv3InspectionEngineDetailsGdp from a dict
healthcollectorv3_inspection_engine_details_gdp_from_dict = Healthcollectorv3InspectionEngineDetailsGdp.from_dict(healthcollectorv3_inspection_engine_details_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


