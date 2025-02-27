# Assetsv3ListTagsResponse

Response for listing tags.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assigned** | [**List[Assetsv3AssignedTags]**](Assetsv3AssignedTags.md) |  | [optional] 
**suggestions** | [**List[Assetsv3SuggestionsTags]**](Assetsv3SuggestionsTags.md) |  | [optional] 
**unassigned** | [**List[Assetsv3UnassignedTags]**](Assetsv3UnassignedTags.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_list_tags_response import Assetsv3ListTagsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ListTagsResponse from a JSON string
assetsv3_list_tags_response_instance = Assetsv3ListTagsResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ListTagsResponse.to_json())

# convert the object into a dict
assetsv3_list_tags_response_dict = assetsv3_list_tags_response_instance.to_dict()
# create an instance of Assetsv3ListTagsResponse from a dict
assetsv3_list_tags_response_from_dict = Assetsv3ListTagsResponse.from_dict(assetsv3_list_tags_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


