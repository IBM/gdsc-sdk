# Vulmanagementv3FilterCategory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **str** | ID of the filter category. | [optional] 
**sub_category_ids** | **List[str]** | List of subcategory. | [optional] 
**sub_category_values** | **List[str]** | List of subcategory values. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_filter_category import Vulmanagementv3FilterCategory

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3FilterCategory from a JSON string
vulmanagementv3_filter_category_instance = Vulmanagementv3FilterCategory.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3FilterCategory.to_json())

# convert the object into a dict
vulmanagementv3_filter_category_dict = vulmanagementv3_filter_category_instance.to_dict()
# create an instance of Vulmanagementv3FilterCategory from a dict
vulmanagementv3_filter_category_from_dict = Vulmanagementv3FilterCategory.from_dict(vulmanagementv3_filter_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


