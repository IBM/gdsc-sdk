# Guardiumconnectorv3ExtractionProfile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**dms** | [**List[Guardiumconnectorv3Datamarts]**](Guardiumconnectorv3Datamarts.md) |  | [optional] 
**profile_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_extraction_profile import Guardiumconnectorv3ExtractionProfile

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ExtractionProfile from a JSON string
guardiumconnectorv3_extraction_profile_instance = Guardiumconnectorv3ExtractionProfile.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ExtractionProfile.to_json())

# convert the object into a dict
guardiumconnectorv3_extraction_profile_dict = guardiumconnectorv3_extraction_profile_instance.to_dict()
# create an instance of Guardiumconnectorv3ExtractionProfile from a dict
guardiumconnectorv3_extraction_profile_from_dict = Guardiumconnectorv3ExtractionProfile.from_dict(guardiumconnectorv3_extraction_profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


