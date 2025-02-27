# AddAnalyzedRegionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 
**region** | **str** |  | [optional] 
**regions** | **List[str]** |  | [optional] 
**customer_tags** | [**List[Tags]**](Tags.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.add_analyzed_region_request import AddAnalyzedRegionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddAnalyzedRegionRequest from a JSON string
add_analyzed_region_request_instance = AddAnalyzedRegionRequest.from_json(json)
# print the JSON string representation of the object
print(AddAnalyzedRegionRequest.to_json())

# convert the object into a dict
add_analyzed_region_request_dict = add_analyzed_region_request_instance.to_dict()
# create an instance of AddAnalyzedRegionRequest from a dict
add_analyzed_region_request_from_dict = AddAnalyzedRegionRequest.from_dict(add_analyzed_region_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


