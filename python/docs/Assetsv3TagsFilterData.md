# Assetsv3TagsFilterData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag_category** | **str** |  | [optional] 
**tag_category_id** | **str** |  | [optional] 
**tags_data** | [**List[Assetsv3TagsData]**](Assetsv3TagsData.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_tags_filter_data import Assetsv3TagsFilterData

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3TagsFilterData from a JSON string
assetsv3_tags_filter_data_instance = Assetsv3TagsFilterData.from_json(json)
# print the JSON string representation of the object
print(Assetsv3TagsFilterData.to_json())

# convert the object into a dict
assetsv3_tags_filter_data_dict = assetsv3_tags_filter_data_instance.to_dict()
# create an instance of Assetsv3TagsFilterData from a dict
assetsv3_tags_filter_data_from_dict = Assetsv3TagsFilterData.from_dict(assetsv3_tags_filter_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


