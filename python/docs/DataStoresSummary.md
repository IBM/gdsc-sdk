# DataStoresSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_stores** | **float** |  | 
**store_types** | [**List[DataStoresSummaryStoreTypesInner]**](DataStoresSummaryStoreTypesInner.md) |  | 
**cloud_locations** | [**List[DataStoresSummaryCloudLocationsInner]**](DataStoresSummaryCloudLocationsInner.md) |  | 
**service_providers** | [**List[DataStoresSummaryServiceProvidersInner]**](DataStoresSummaryServiceProvidersInner.md) |  | 
**total_sensitivities** | **float** |  | 
**sensitivities** | [**List[SensitivitiesItemsInner]**](SensitivitiesItemsInner.md) |  | 
**total_potential_flows** | **float** |  | 
**total_actual_flows** | **float** |  | 
**total_sensitive_stores** | **float** |  | 
**accounts_ids** | **List[str]** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.data_stores_summary import DataStoresSummary

# TODO update the JSON string below
json = "{}"
# create an instance of DataStoresSummary from a JSON string
data_stores_summary_instance = DataStoresSummary.from_json(json)
# print the JSON string representation of the object
print(DataStoresSummary.to_json())

# convert the object into a dict
data_stores_summary_dict = data_stores_summary_instance.to_dict()
# create an instance of DataStoresSummary from a dict
data_stores_summary_from_dict = DataStoresSummary.from_dict(data_stores_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


