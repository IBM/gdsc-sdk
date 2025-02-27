# ListActualFlowsSortParameter

If none specified, descending order by default

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_by** | **str** |  | 
**sort_order** | [**SortOrder**](SortOrder.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_actual_flows_sort_parameter import ListActualFlowsSortParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListActualFlowsSortParameter from a JSON string
list_actual_flows_sort_parameter_instance = ListActualFlowsSortParameter.from_json(json)
# print the JSON string representation of the object
print(ListActualFlowsSortParameter.to_json())

# convert the object into a dict
list_actual_flows_sort_parameter_dict = list_actual_flows_sort_parameter_instance.to_dict()
# create an instance of ListActualFlowsSortParameter from a dict
list_actual_flows_sort_parameter_from_dict = ListActualFlowsSortParameter.from_dict(list_actual_flows_sort_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


