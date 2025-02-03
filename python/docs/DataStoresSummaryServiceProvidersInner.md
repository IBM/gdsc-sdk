# DataStoresSummaryServiceProvidersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_provider** | [**ServiceProvider**](ServiceProvider.md) |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.data_stores_summary_service_providers_inner import DataStoresSummaryServiceProvidersInner

# TODO update the JSON string below
json = "{}"
# create an instance of DataStoresSummaryServiceProvidersInner from a JSON string
data_stores_summary_service_providers_inner_instance = DataStoresSummaryServiceProvidersInner.from_json(json)
# print the JSON string representation of the object
print(DataStoresSummaryServiceProvidersInner.to_json())

# convert the object into a dict
data_stores_summary_service_providers_inner_dict = data_stores_summary_service_providers_inner_instance.to_dict()
# create an instance of DataStoresSummaryServiceProvidersInner from a dict
data_stores_summary_service_providers_inner_from_dict = DataStoresSummaryServiceProvidersInner.from_dict(data_stores_summary_service_providers_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


