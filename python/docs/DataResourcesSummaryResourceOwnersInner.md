# DataResourcesSummaryResourceOwnersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource_owner** | **str** |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.data_resources_summary_resource_owners_inner import DataResourcesSummaryResourceOwnersInner

# TODO update the JSON string below
json = "{}"
# create an instance of DataResourcesSummaryResourceOwnersInner from a JSON string
data_resources_summary_resource_owners_inner_instance = DataResourcesSummaryResourceOwnersInner.from_json(json)
# print the JSON string representation of the object
print(DataResourcesSummaryResourceOwnersInner.to_json())

# convert the object into a dict
data_resources_summary_resource_owners_inner_dict = data_resources_summary_resource_owners_inner_instance.to_dict()
# create an instance of DataResourcesSummaryResourceOwnersInner from a dict
data_resources_summary_resource_owners_inner_from_dict = DataResourcesSummaryResourceOwnersInner.from_dict(data_resources_summary_resource_owners_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


