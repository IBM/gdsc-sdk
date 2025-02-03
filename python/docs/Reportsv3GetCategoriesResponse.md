# Reportsv3GetCategoriesResponse

GetCategoriesResponse is the return type which encapsulates a list of categories from the GetCategories() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_list** | [**List[Reportsv3Category]**](Reportsv3Category.md) | List of available report categories. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_categories_response import Reportsv3GetCategoriesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetCategoriesResponse from a JSON string
reportsv3_get_categories_response_instance = Reportsv3GetCategoriesResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetCategoriesResponse.to_json())

# convert the object into a dict
reportsv3_get_categories_response_dict = reportsv3_get_categories_response_instance.to_dict()
# create an instance of Reportsv3GetCategoriesResponse from a dict
reportsv3_get_categories_response_from_dict = Reportsv3GetCategoriesResponse.from_dict(reportsv3_get_categories_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


