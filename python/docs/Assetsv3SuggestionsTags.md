# Assetsv3SuggestionsTags


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain_id** | **str** |  | [optional] 
**tag_category** | **str** | Name of the tag. | [optional] 
**tag_id** | **str** |  | [optional] 
**tag_names** | **str** | Concepts for the tag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_suggestions_tags import Assetsv3SuggestionsTags

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SuggestionsTags from a JSON string
assetsv3_suggestions_tags_instance = Assetsv3SuggestionsTags.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SuggestionsTags.to_json())

# convert the object into a dict
assetsv3_suggestions_tags_dict = assetsv3_suggestions_tags_instance.to_dict()
# create an instance of Assetsv3SuggestionsTags from a dict
assetsv3_suggestions_tags_from_dict = Assetsv3SuggestionsTags.from_dict(assetsv3_suggestions_tags_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


