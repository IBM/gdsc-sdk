# DataResourcesSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reviewed_resources** | **float** |  | 
**total_resources** | **float** |  | 
**resource_types** | [**List[DataResourcesSummaryResourceTypesInner]**](DataResourcesSummaryResourceTypesInner.md) |  | 
**resource_owners** | [**List[DataResourcesSummaryResourceOwnersInner]**](DataResourcesSummaryResourceOwnersInner.md) |  | [optional] 
**total_sensitivities** | **float** |  | [optional] 
**sensitivities** | [**List[SensitivitiesItemsInner]**](SensitivitiesItemsInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.data_resources_summary import DataResourcesSummary

# TODO update the JSON string below
json = "{}"
# create an instance of DataResourcesSummary from a JSON string
data_resources_summary_instance = DataResourcesSummary.from_json(json)
# print the JSON string representation of the object
print(DataResourcesSummary.to_json())

# convert the object into a dict
data_resources_summary_dict = data_resources_summary_instance.to_dict()
# create an instance of DataResourcesSummary from a dict
data_resources_summary_from_dict = DataResourcesSummary.from_dict(data_resources_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


