# Assetsv3GetFiltersDataResponse

GetFiltersDataResponse - Response message for Manage Asset Filter Panel data api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**List[Assetsv3Category]**](Assetsv3Category.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_get_filters_data_response import Assetsv3GetFiltersDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3GetFiltersDataResponse from a JSON string
assetsv3_get_filters_data_response_instance = Assetsv3GetFiltersDataResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3GetFiltersDataResponse.to_json())

# convert the object into a dict
assetsv3_get_filters_data_response_dict = assetsv3_get_filters_data_response_instance.to_dict()
# create an instance of Assetsv3GetFiltersDataResponse from a dict
assetsv3_get_filters_data_response_from_dict = Assetsv3GetFiltersDataResponse.from_dict(assetsv3_get_filters_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


