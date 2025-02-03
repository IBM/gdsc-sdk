# PotentialFlow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**type** | **str** |  | 
**source** | [**FlowNode**](FlowNode.md) |  | 
**destination** | [**FlowNode**](FlowNode.md) |  | 
**access_types** | [**List[AccessType]**](AccessType.md) |  | 
**paths_count** | **float** |  | 
**permitted_operations** | **List[str]** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.potential_flow import PotentialFlow

# TODO update the JSON string below
json = "{}"
# create an instance of PotentialFlow from a JSON string
potential_flow_instance = PotentialFlow.from_json(json)
# print the JSON string representation of the object
print(PotentialFlow.to_json())

# convert the object into a dict
potential_flow_dict = potential_flow_instance.to_dict()
# create an instance of PotentialFlow from a dict
potential_flow_from_dict = PotentialFlow.from_dict(potential_flow_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


