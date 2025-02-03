# PotentialFlowPath


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**potential_flow_id** | **str** |  | 
**type** | **str** |  | 
**source** | [**FlowNode**](FlowNode.md) |  | 
**destination** | [**FlowNode**](FlowNode.md) |  | 
**access_types** | [**List[AccessType]**](AccessType.md) |  | 
**path** | [**List[FlowNode]**](FlowNode.md) |  | 
**permitted_operations** | **List[str]** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.potential_flow_path import PotentialFlowPath

# TODO update the JSON string below
json = "{}"
# create an instance of PotentialFlowPath from a JSON string
potential_flow_path_instance = PotentialFlowPath.from_json(json)
# print the JSON string representation of the object
print(PotentialFlowPath.to_json())

# convert the object into a dict
potential_flow_path_dict = potential_flow_path_instance.to_dict()
# create an instance of PotentialFlowPath from a dict
potential_flow_path_from_dict = PotentialFlowPath.from_dict(potential_flow_path_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


