# ListActualFlowsFilterParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_ids** | **List[str]** |  | [optional] 
**source_types** | **List[str]** |  | [optional] 
**source_cloud_account_ids** | **List[str]** |  | [optional] 
**source_cloud_regions** | **List[str]** |  | [optional] 
**source_cloud_providers** | [**List[CloudServiceProvider]**](CloudServiceProvider.md) |  | [optional] 
**destination_ids** | **List[str]** |  | [optional] 
**destination_types** | **List[str]** |  | [optional] 
**destination_cloud_account_ids** | **List[str]** |  | [optional] 
**destination_cloud_regions** | **List[str]** |  | [optional] 
**destination_cloud_providers** | [**List[CloudServiceProvider]**](CloudServiceProvider.md) |  | [optional] 
**access_types** | [**List[AccessType]**](AccessType.md) |  | [optional] 
**last_seen** | [**Comparator**](Comparator.md) |  | [optional] 
**first_seen** | [**Comparator**](Comparator.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_actual_flows_filter_parameter import ListActualFlowsFilterParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListActualFlowsFilterParameter from a JSON string
list_actual_flows_filter_parameter_instance = ListActualFlowsFilterParameter.from_json(json)
# print the JSON string representation of the object
print(ListActualFlowsFilterParameter.to_json())

# convert the object into a dict
list_actual_flows_filter_parameter_dict = list_actual_flows_filter_parameter_instance.to_dict()
# create an instance of ListActualFlowsFilterParameter from a dict
list_actual_flows_filter_parameter_from_dict = ListActualFlowsFilterParameter.from_dict(list_actual_flows_filter_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


