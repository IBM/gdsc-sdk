# PotentialFlowPathListItem


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

## Example

```python
from ibm_gdsc_sdk_saas.models.potential_flow_path_list_item import PotentialFlowPathListItem

# TODO update the JSON string below
json = "{}"
# create an instance of PotentialFlowPathListItem from a JSON string
potential_flow_path_list_item_instance = PotentialFlowPathListItem.from_json(json)
# print the JSON string representation of the object
print(PotentialFlowPathListItem.to_json())

# convert the object into a dict
potential_flow_path_list_item_dict = potential_flow_path_list_item_instance.to_dict()
# create an instance of PotentialFlowPathListItem from a dict
potential_flow_path_list_item_from_dict = PotentialFlowPathListItem.from_dict(potential_flow_path_list_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


