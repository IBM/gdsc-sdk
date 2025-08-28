# Vulmanagementv3Category

Category - Main Category Data for Manage Vulnerabilities Filter Panel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **str** | Group - Tags. | [optional] 
**id** | **str** | Category ID. | [optional] 
**name** | **str** | Category Name. | [optional] 
**sub_category** | [**List[Vulmanagementv3SubCategory]**](Vulmanagementv3SubCategory.md) | List of sub categories. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_category import Vulmanagementv3Category

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3Category from a JSON string
vulmanagementv3_category_instance = Vulmanagementv3Category.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3Category.to_json())

# convert the object into a dict
vulmanagementv3_category_dict = vulmanagementv3_category_instance.to_dict()
# create an instance of Vulmanagementv3Category from a dict
vulmanagementv3_category_from_dict = Vulmanagementv3Category.from_dict(vulmanagementv3_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


