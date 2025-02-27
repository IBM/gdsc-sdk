# ActualFlowPath


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**flow_id** | **str** |  | 
**source** | [**FlowNode**](FlowNode.md) |  | 
**destination** | [**FlowNode**](FlowNode.md) |  | 
**access_type** | [**AccessType**](AccessType.md) |  | 
**username** | **str** |  | [optional] 
**trustee_id** | **str** |  | [optional] 
**last_seen** | **float** | Epoch timestamp of the last time this path was seen | 
**first_seen** | **float** | Epoch timestamp of the first time this flow was seen | 
**path** | [**List[FlowNode]**](FlowNode.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.actual_flow_path import ActualFlowPath

# TODO update the JSON string below
json = "{}"
# create an instance of ActualFlowPath from a JSON string
actual_flow_path_instance = ActualFlowPath.from_json(json)
# print the JSON string representation of the object
print(ActualFlowPath.to_json())

# convert the object into a dict
actual_flow_path_dict = actual_flow_path_instance.to_dict()
# create an instance of ActualFlowPath from a dict
actual_flow_path_from_dict = ActualFlowPath.from_dict(actual_flow_path_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


