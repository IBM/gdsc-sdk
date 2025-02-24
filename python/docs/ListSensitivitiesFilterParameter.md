# ListSensitivitiesFilterParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource_id** | **str** |  | [optional] 
**data_store_id** | **str** |  | [optional] 
**sensitive_tag** | **str** |  | [optional] 
**sensitivity_categories** | [**List[SensitivityCategory]**](SensitivityCategory.md) |  | [optional] 
**hash** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_sensitivities_filter_parameter import ListSensitivitiesFilterParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListSensitivitiesFilterParameter from a JSON string
list_sensitivities_filter_parameter_instance = ListSensitivitiesFilterParameter.from_json(json)
# print the JSON string representation of the object
print(ListSensitivitiesFilterParameter.to_json())

# convert the object into a dict
list_sensitivities_filter_parameter_dict = list_sensitivities_filter_parameter_instance.to_dict()
# create an instance of ListSensitivitiesFilterParameter from a dict
list_sensitivities_filter_parameter_from_dict = ListSensitivitiesFilterParameter.from_dict(list_sensitivities_filter_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


