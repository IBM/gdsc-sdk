# ListDataResourcesFilterParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_reviewed** | **bool** |  | [optional] 
**resource_owners** | **List[str]** |  | [optional] 
**resource_names** | **List[str]** |  | [optional] 
**resource_types** | **List[str]** |  | [optional] 
**sensitivity_tags** | **List[str]** |  | [optional] 
**sensitivity_categories** | [**List[SensitivityCategory]**](SensitivityCategory.md) |  | [optional] 
**resource_partial_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.list_data_resources_filter_parameter import ListDataResourcesFilterParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListDataResourcesFilterParameter from a JSON string
list_data_resources_filter_parameter_instance = ListDataResourcesFilterParameter.from_json(json)
# print the JSON string representation of the object
print(ListDataResourcesFilterParameter.to_json())

# convert the object into a dict
list_data_resources_filter_parameter_dict = list_data_resources_filter_parameter_instance.to_dict()
# create an instance of ListDataResourcesFilterParameter from a dict
list_data_resources_filter_parameter_from_dict = ListDataResourcesFilterParameter.from_dict(list_data_resources_filter_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


