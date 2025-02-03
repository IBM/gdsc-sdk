# Healthcollectorv3InspectionEngineObjectGdp

InspectionEngineDetails gets additional information about inspection engines.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ie_status** | **int** | The status of inspection engine. | [optional] 
**inspection_engine** | **str** | Name of the inspection engine. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_inspection_engine_object_gdp import Healthcollectorv3InspectionEngineObjectGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3InspectionEngineObjectGdp from a JSON string
healthcollectorv3_inspection_engine_object_gdp_instance = Healthcollectorv3InspectionEngineObjectGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3InspectionEngineObjectGdp.to_json())

# convert the object into a dict
healthcollectorv3_inspection_engine_object_gdp_dict = healthcollectorv3_inspection_engine_object_gdp_instance.to_dict()
# create an instance of Healthcollectorv3InspectionEngineObjectGdp from a dict
healthcollectorv3_inspection_engine_object_gdp_from_dict = Healthcollectorv3InspectionEngineObjectGdp.from_dict(healthcollectorv3_inspection_engine_object_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


