# Reportsv3GetFieldsByCategoriesResponse

GetFieldsByCategoriesResponse is the return type of the GetFieldsByCategories() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | [**List[Reportsv3Header]**](Reportsv3Header.md) | Category fields. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_fields_by_categories_response import Reportsv3GetFieldsByCategoriesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetFieldsByCategoriesResponse from a JSON string
reportsv3_get_fields_by_categories_response_instance = Reportsv3GetFieldsByCategoriesResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetFieldsByCategoriesResponse.to_json())

# convert the object into a dict
reportsv3_get_fields_by_categories_response_dict = reportsv3_get_fields_by_categories_response_instance.to_dict()
# create an instance of Reportsv3GetFieldsByCategoriesResponse from a dict
reportsv3_get_fields_by_categories_response_from_dict = Reportsv3GetFieldsByCategoriesResponse.from_dict(reportsv3_get_fields_by_categories_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


