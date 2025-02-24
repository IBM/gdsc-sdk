# ActualFlow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**source** | [**FlowNode**](FlowNode.md) |  | 
**destination** | [**FlowNode**](FlowNode.md) |  | 
**access_types** | [**List[AccessType]**](AccessType.md) |  | 
**last_seen** | **float** | Epoch timestamp of the last time this flow was seen | 
**first_seen** | **float** | Epoch timestamp of the first time this flow was seen | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.actual_flow import ActualFlow

# TODO update the JSON string below
json = "{}"
# create an instance of ActualFlow from a JSON string
actual_flow_instance = ActualFlow.from_json(json)
# print the JSON string representation of the object
print(ActualFlow.to_json())

# convert the object into a dict
actual_flow_dict = actual_flow_instance.to_dict()
# create an instance of ActualFlow from a dict
actual_flow_from_dict = ActualFlow.from_dict(actual_flow_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


