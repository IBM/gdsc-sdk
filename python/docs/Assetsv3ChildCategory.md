# Assetsv3ChildCategory

ChildCategory - Child Category Data of Sub Category for Manage Asset Filter Panel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**child_id** | **str** |  | [optional] 
**child_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_child_category import Assetsv3ChildCategory

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ChildCategory from a JSON string
assetsv3_child_category_instance = Assetsv3ChildCategory.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ChildCategory.to_json())

# convert the object into a dict
assetsv3_child_category_dict = assetsv3_child_category_instance.to_dict()
# create an instance of Assetsv3ChildCategory from a dict
assetsv3_child_category_from_dict = Assetsv3ChildCategory.from_dict(assetsv3_child_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


