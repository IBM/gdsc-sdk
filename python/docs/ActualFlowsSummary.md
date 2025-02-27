# ActualFlowsSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flows_count** | **float** |  | 
**sources_summary** | [**FlowNodeSummary**](FlowNodeSummary.md) |  | 
**destinations_summary** | [**FlowNodeSummary**](FlowNodeSummary.md) |  | 
**access_types_count** | [**List[AccessTypeCountInner]**](AccessTypeCountInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.actual_flows_summary import ActualFlowsSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ActualFlowsSummary from a JSON string
actual_flows_summary_instance = ActualFlowsSummary.from_json(json)
# print the JSON string representation of the object
print(ActualFlowsSummary.to_json())

# convert the object into a dict
actual_flows_summary_dict = actual_flows_summary_instance.to_dict()
# create an instance of ActualFlowsSummary from a dict
actual_flows_summary_from_dict = ActualFlowsSummary.from_dict(actual_flows_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


