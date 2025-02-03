# Assetsv3Category

Category - Main Category Data for Manage Asset Filter Panel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**show_timeline_filter** | **bool** |  | [optional] 
**sub_category** | [**List[Assetsv3SubCategory]**](Assetsv3SubCategory.md) |  | [optional] 
**timeline_display_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_category import Assetsv3Category

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3Category from a JSON string
assetsv3_category_instance = Assetsv3Category.from_json(json)
# print the JSON string representation of the object
print(Assetsv3Category.to_json())

# convert the object into a dict
assetsv3_category_dict = assetsv3_category_instance.to_dict()
# create an instance of Assetsv3Category from a dict
assetsv3_category_from_dict = Assetsv3Category.from_dict(assetsv3_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


