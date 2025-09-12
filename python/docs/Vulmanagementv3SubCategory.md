# Vulmanagementv3SubCategory

SubCategory - Sub Category Data for Manage Vulnerabilities Filter Panel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**children_category** | [**List[Vulmanagementv3ChildCategory]**](Vulmanagementv3ChildCategory.md) | Children category of a particular sub category. | [optional] 
**id** | **str** | Sub category ID. | [optional] 
**name** | **str** | Sub category Name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_sub_category import Vulmanagementv3SubCategory

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3SubCategory from a JSON string
vulmanagementv3_sub_category_instance = Vulmanagementv3SubCategory.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3SubCategory.to_json())

# convert the object into a dict
vulmanagementv3_sub_category_dict = vulmanagementv3_sub_category_instance.to_dict()
# create an instance of Vulmanagementv3SubCategory from a dict
vulmanagementv3_sub_category_from_dict = Vulmanagementv3SubCategory.from_dict(vulmanagementv3_sub_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


