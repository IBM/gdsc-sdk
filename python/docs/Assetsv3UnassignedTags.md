# Assetsv3UnassignedTags


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain_id** | **str** |  | [optional] 
**tag_category** | **str** | Name of the tag. | [optional] 
**tag_id** | **str** |  | [optional] 
**tag_names** | **str** | Concepts for the tag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_unassigned_tags import Assetsv3UnassignedTags

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3UnassignedTags from a JSON string
assetsv3_unassigned_tags_instance = Assetsv3UnassignedTags.from_json(json)
# print the JSON string representation of the object
print(Assetsv3UnassignedTags.to_json())

# convert the object into a dict
assetsv3_unassigned_tags_dict = assetsv3_unassigned_tags_instance.to_dict()
# create an instance of Assetsv3UnassignedTags from a dict
assetsv3_unassigned_tags_from_dict = Assetsv3UnassignedTags.from_dict(assetsv3_unassigned_tags_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


