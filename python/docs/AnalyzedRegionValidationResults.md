# AnalyzedRegionValidationResults


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_valid** | **bool** |  | 
**error** | **str** |  | [optional] 
**status_code** | **float** |  | 
**is_warning** | **bool** |  | [optional] 
**warning** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.analyzed_region_validation_results import AnalyzedRegionValidationResults

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzedRegionValidationResults from a JSON string
analyzed_region_validation_results_instance = AnalyzedRegionValidationResults.from_json(json)
# print the JSON string representation of the object
print(AnalyzedRegionValidationResults.to_json())

# convert the object into a dict
analyzed_region_validation_results_dict = analyzed_region_validation_results_instance.to_dict()
# create an instance of AnalyzedRegionValidationResults from a dict
analyzed_region_validation_results_from_dict = AnalyzedRegionValidationResults.from_dict(analyzed_region_validation_results_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


