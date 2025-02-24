# DataResourcesSummaryResourceTypesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource_type** | **str** |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.data_resources_summary_resource_types_inner import DataResourcesSummaryResourceTypesInner

# TODO update the JSON string below
json = "{}"
# create an instance of DataResourcesSummaryResourceTypesInner from a JSON string
data_resources_summary_resource_types_inner_instance = DataResourcesSummaryResourceTypesInner.from_json(json)
# print the JSON string representation of the object
print(DataResourcesSummaryResourceTypesInner.to_json())

# convert the object into a dict
data_resources_summary_resource_types_inner_dict = data_resources_summary_resource_types_inner_instance.to_dict()
# create an instance of DataResourcesSummaryResourceTypesInner from a dict
data_resources_summary_resource_types_inner_from_dict = DataResourcesSummaryResourceTypesInner.from_dict(data_resources_summary_resource_types_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


