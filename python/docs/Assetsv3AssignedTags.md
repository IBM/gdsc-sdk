# Assetsv3AssignedTags


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **List[str]** | List of Asset IDs. | [optional] 
**domain_id** | **str** | Domain id of the tag. | [optional] 
**grouper_count** | **str** |  | [optional] 
**tag_category** | **str** | Name of the tag. | [optional] 
**tag_id** | **str** |  | [optional] 
**tag_names** | **str** | Concepts for the tag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_assigned_tags import Assetsv3AssignedTags

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssignedTags from a JSON string
assetsv3_assigned_tags_instance = Assetsv3AssignedTags.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssignedTags.to_json())

# convert the object into a dict
assetsv3_assigned_tags_dict = assetsv3_assigned_tags_instance.to_dict()
# create an instance of Assetsv3AssignedTags from a dict
assetsv3_assigned_tags_from_dict = Assetsv3AssignedTags.from_dict(assetsv3_assigned_tags_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


