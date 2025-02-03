# FlowNodeSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**types_count** | [**List[TypesCountInner]**](TypesCountInner.md) |  | 
**cloud_accounts_count** | [**List[CloudAccountCountInner]**](CloudAccountCountInner.md) |  | 
**cloud_regions_count** | [**List[CloudRegionCountInner]**](CloudRegionCountInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.flow_node_summary import FlowNodeSummary

# TODO update the JSON string below
json = "{}"
# create an instance of FlowNodeSummary from a JSON string
flow_node_summary_instance = FlowNodeSummary.from_json(json)
# print the JSON string representation of the object
print(FlowNodeSummary.to_json())

# convert the object into a dict
flow_node_summary_dict = flow_node_summary_instance.to_dict()
# create an instance of FlowNodeSummary from a dict
flow_node_summary_from_dict = FlowNodeSummary.from_dict(flow_node_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


