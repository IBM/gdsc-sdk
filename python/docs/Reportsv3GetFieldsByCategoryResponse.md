# Reportsv3GetFieldsByCategoryResponse

GetFieldsByCategoryResponse is the return type of the GetFieldsByCategory() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | [**List[Reportsv3Header]**](Reportsv3Header.md) | Category fields. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_fields_by_category_response import Reportsv3GetFieldsByCategoryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetFieldsByCategoryResponse from a JSON string
reportsv3_get_fields_by_category_response_instance = Reportsv3GetFieldsByCategoryResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetFieldsByCategoryResponse.to_json())

# convert the object into a dict
reportsv3_get_fields_by_category_response_dict = reportsv3_get_fields_by_category_response_instance.to_dict()
# create an instance of Reportsv3GetFieldsByCategoryResponse from a dict
reportsv3_get_fields_by_category_response_from_dict = Reportsv3GetFieldsByCategoryResponse.from_dict(reportsv3_get_fields_by_category_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


