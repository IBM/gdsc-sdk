# ListActualFlowPathsSortParameter

Descending order by default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_by** | **str** |  | 
**sort_order** | [**SortOrder**](SortOrder.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.list_actual_flow_paths_sort_parameter import ListActualFlowPathsSortParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListActualFlowPathsSortParameter from a JSON string
list_actual_flow_paths_sort_parameter_instance = ListActualFlowPathsSortParameter.from_json(json)
# print the JSON string representation of the object
print(ListActualFlowPathsSortParameter.to_json())

# convert the object into a dict
list_actual_flow_paths_sort_parameter_dict = list_actual_flow_paths_sort_parameter_instance.to_dict()
# create an instance of ListActualFlowPathsSortParameter from a dict
list_actual_flow_paths_sort_parameter_from_dict = ListActualFlowPathsSortParameter.from_dict(list_actual_flow_paths_sort_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


