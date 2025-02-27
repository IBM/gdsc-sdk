# Assetsv3SubCategory

SubCategory - Sub Category Data for Manage Asset Filter Panel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**children_category** | [**List[Assetsv3ChildCategory]**](Assetsv3ChildCategory.md) |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_sub_category import Assetsv3SubCategory

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SubCategory from a JSON string
assetsv3_sub_category_instance = Assetsv3SubCategory.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SubCategory.to_json())

# convert the object into a dict
assetsv3_sub_category_dict = assetsv3_sub_category_instance.to_dict()
# create an instance of Assetsv3SubCategory from a dict
assetsv3_sub_category_from_dict = Assetsv3SubCategory.from_dict(assetsv3_sub_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


