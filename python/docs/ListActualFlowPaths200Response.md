# ListActualFlowPaths200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[ActualFlowPath]**](ActualFlowPath.md) |  | 
**next_token** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.list_actual_flow_paths200_response import ListActualFlowPaths200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListActualFlowPaths200Response from a JSON string
list_actual_flow_paths200_response_instance = ListActualFlowPaths200Response.from_json(json)
# print the JSON string representation of the object
print(ListActualFlowPaths200Response.to_json())

# convert the object into a dict
list_actual_flow_paths200_response_dict = list_actual_flow_paths200_response_instance.to_dict()
# create an instance of ListActualFlowPaths200Response from a dict
list_actual_flow_paths200_response_from_dict = ListActualFlowPaths200Response.from_dict(list_actual_flow_paths200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


