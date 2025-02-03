# AddAnalyzedRegion200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** |  | [optional] 
**user_data** | **str** |  | [optional] 
**image_id** | **str** |  | [optional] 
**subnet_id** | **str** |  | [optional] 
**vpc_id** | **str** |  | [optional] 
**availability_zone** | **str** |  | [optional] 
**installation_script** | **str** |  | [optional] 
**validation_results** | [**AnalyzedRegionValidationResults**](AnalyzedRegionValidationResults.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.add_analyzed_region200_response import AddAnalyzedRegion200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AddAnalyzedRegion200Response from a JSON string
add_analyzed_region200_response_instance = AddAnalyzedRegion200Response.from_json(json)
# print the JSON string representation of the object
print(AddAnalyzedRegion200Response.to_json())

# convert the object into a dict
add_analyzed_region200_response_dict = add_analyzed_region200_response_instance.to_dict()
# create an instance of AddAnalyzedRegion200Response from a dict
add_analyzed_region200_response_from_dict = AddAnalyzedRegion200Response.from_dict(add_analyzed_region200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


