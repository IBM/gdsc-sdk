# Vulmanagementv3GetFiltersDataResponse

GetFiltersDataResponse - Response message for Manage Vulnerabilities Filter Panel data api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**List[Vulmanagementv3Category]**](Vulmanagementv3Category.md) | List of all catagories of filter. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_get_filters_data_response import Vulmanagementv3GetFiltersDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3GetFiltersDataResponse from a JSON string
vulmanagementv3_get_filters_data_response_instance = Vulmanagementv3GetFiltersDataResponse.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3GetFiltersDataResponse.to_json())

# convert the object into a dict
vulmanagementv3_get_filters_data_response_dict = vulmanagementv3_get_filters_data_response_instance.to_dict()
# create an instance of Vulmanagementv3GetFiltersDataResponse from a dict
vulmanagementv3_get_filters_data_response_from_dict = Vulmanagementv3GetFiltersDataResponse.from_dict(vulmanagementv3_get_filters_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


