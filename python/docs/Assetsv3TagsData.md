# Assetsv3TagsData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag_id** | **str** |  | [optional] 
**tag_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_tags_data import Assetsv3TagsData

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3TagsData from a JSON string
assetsv3_tags_data_instance = Assetsv3TagsData.from_json(json)
# print the JSON string representation of the object
print(Assetsv3TagsData.to_json())

# convert the object into a dict
assetsv3_tags_data_dict = assetsv3_tags_data_instance.to_dict()
# create an instance of Assetsv3TagsData from a dict
assetsv3_tags_data_from_dict = Assetsv3TagsData.from_dict(assetsv3_tags_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


