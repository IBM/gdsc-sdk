# DataStoreStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resources_count** | **float** |  | [optional] 
**app_flows_count** | **float** |  | [optional] 
**config_flows_count** | **float** |  | [optional] 
**sensitivities_count** | **float** |  | [optional] 
**user_access_count** | **float** | number of users entitled to access the data store | [optional] 
**sensitivities_summary** | [**List[SensitivitySummary]**](SensitivitySummary.md) |  | [optional] 
**vulnerabilities_summary** | [**List[VulnerabilitiesCriticalityCountInner]**](VulnerabilitiesCriticalityCountInner.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.data_store_stats import DataStoreStats

# TODO update the JSON string below
json = "{}"
# create an instance of DataStoreStats from a JSON string
data_store_stats_instance = DataStoreStats.from_json(json)
# print the JSON string representation of the object
print(DataStoreStats.to_json())

# convert the object into a dict
data_store_stats_dict = data_store_stats_instance.to_dict()
# create an instance of DataStoreStats from a dict
data_store_stats_from_dict = DataStoreStats.from_dict(data_store_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


