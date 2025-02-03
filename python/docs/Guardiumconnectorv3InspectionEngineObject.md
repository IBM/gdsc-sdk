# Guardiumconnectorv3InspectionEngineObject

Information for an inspection engine object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ie_status** | **int** | Inspection engine status. | [optional] 
**inspection_engine** | **str** | Inspection engine name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_inspection_engine_object import Guardiumconnectorv3InspectionEngineObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3InspectionEngineObject from a JSON string
guardiumconnectorv3_inspection_engine_object_instance = Guardiumconnectorv3InspectionEngineObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3InspectionEngineObject.to_json())

# convert the object into a dict
guardiumconnectorv3_inspection_engine_object_dict = guardiumconnectorv3_inspection_engine_object_instance.to_dict()
# create an instance of Guardiumconnectorv3InspectionEngineObject from a dict
guardiumconnectorv3_inspection_engine_object_from_dict = Guardiumconnectorv3InspectionEngineObject.from_dict(guardiumconnectorv3_inspection_engine_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


