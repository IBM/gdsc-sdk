# Assetsv3TagsAssigned


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** |  | [optional] 
**tag_id** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_tags_assigned import Assetsv3TagsAssigned

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3TagsAssigned from a JSON string
assetsv3_tags_assigned_instance = Assetsv3TagsAssigned.from_json(json)
# print the JSON string representation of the object
print(Assetsv3TagsAssigned.to_json())

# convert the object into a dict
assetsv3_tags_assigned_dict = assetsv3_tags_assigned_instance.to_dict()
# create an instance of Assetsv3TagsAssigned from a dict
assetsv3_tags_assigned_from_dict = Assetsv3TagsAssigned.from_dict(assetsv3_tags_assigned_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


