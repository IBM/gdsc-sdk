# FlowNode


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**name** | **str** |  | [optional] 
**type** | **str** |  | 
**cloud_account_id** | **str** |  | 
**cloud_region** | **str** |  | [optional] 
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 
**resource** | [**FlowNodeResource**](FlowNodeResource.md) |  | [optional] 
**vendor_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.flow_node import FlowNode

# TODO update the JSON string below
json = "{}"
# create an instance of FlowNode from a JSON string
flow_node_instance = FlowNode.from_json(json)
# print the JSON string representation of the object
print(FlowNode.to_json())

# convert the object into a dict
flow_node_dict = flow_node_instance.to_dict()
# create an instance of FlowNode from a dict
flow_node_from_dict = FlowNode.from_dict(flow_node_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


