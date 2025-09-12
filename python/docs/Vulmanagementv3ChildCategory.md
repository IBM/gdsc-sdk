# Vulmanagementv3ChildCategory

Child Category data of Sub Category for Manage Vulnerabilities Filter Panel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**child_id** | **str** | Child category ID. | [optional] 
**child_name** | **str** | Child category Name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_child_category import Vulmanagementv3ChildCategory

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3ChildCategory from a JSON string
vulmanagementv3_child_category_instance = Vulmanagementv3ChildCategory.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3ChildCategory.to_json())

# convert the object into a dict
vulmanagementv3_child_category_dict = vulmanagementv3_child_category_instance.to_dict()
# create an instance of Vulmanagementv3ChildCategory from a dict
vulmanagementv3_child_category_from_dict = Vulmanagementv3ChildCategory.from_dict(vulmanagementv3_child_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


