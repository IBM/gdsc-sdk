# PotentialFlowListItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**type** | **str** |  | 
**source** | [**FlowNode**](FlowNode.md) |  | 
**destination** | [**FlowNode**](FlowNode.md) |  | 
**access_types** | [**List[AccessType]**](AccessType.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.potential_flow_list_item import PotentialFlowListItem

# TODO update the JSON string below
json = "{}"
# create an instance of PotentialFlowListItem from a JSON string
potential_flow_list_item_instance = PotentialFlowListItem.from_json(json)
# print the JSON string representation of the object
print(PotentialFlowListItem.to_json())

# convert the object into a dict
potential_flow_list_item_dict = potential_flow_list_item_instance.to_dict()
# create an instance of PotentialFlowListItem from a dict
potential_flow_list_item_from_dict = PotentialFlowListItem.from_dict(potential_flow_list_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


