# ListPotentialFlows200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[PotentialFlowListItem]**](PotentialFlowListItem.md) |  | 
**next_token** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.list_potential_flows200_response import ListPotentialFlows200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListPotentialFlows200Response from a JSON string
list_potential_flows200_response_instance = ListPotentialFlows200Response.from_json(json)
# print the JSON string representation of the object
print(ListPotentialFlows200Response.to_json())

# convert the object into a dict
list_potential_flows200_response_dict = list_potential_flows200_response_instance.to_dict()
# create an instance of ListPotentialFlows200Response from a dict
list_potential_flows200_response_from_dict = ListPotentialFlows200Response.from_dict(list_potential_flows200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


