# DataResourceStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sensitivities_count** | **float** |  | [optional] 
**sensitivities_summary** | [**List[SensitivitySummary]**](SensitivitySummary.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.data_resource_stats import DataResourceStats

# TODO update the JSON string below
json = "{}"
# create an instance of DataResourceStats from a JSON string
data_resource_stats_instance = DataResourceStats.from_json(json)
# print the JSON string representation of the object
print(DataResourceStats.to_json())

# convert the object into a dict
data_resource_stats_dict = data_resource_stats_instance.to_dict()
# create an instance of DataResourceStats from a dict
data_resource_stats_from_dict = DataResourceStats.from_dict(data_resource_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


