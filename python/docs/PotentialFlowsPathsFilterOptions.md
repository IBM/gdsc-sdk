# PotentialFlowsPathsFilterOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **List[str]** |  | [optional] 
**potential_flows_ids** | **List[str]** |  | [optional] 
**types** | **List[str]** |  | [optional] 
**source_types** | **List[str]** |  | [optional] 
**cloud_accounts** | **List[str]** |  | [optional] 
**cloud_regions** | **List[str]** |  | [optional] 
**source_ids** | **List[str]** |  | [optional] 
**destination_ids** | **List[str]** |  | [optional] 
**access_types** | [**List[AccessType]**](AccessType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.potential_flows_paths_filter_options import PotentialFlowsPathsFilterOptions

# TODO update the JSON string below
json = "{}"
# create an instance of PotentialFlowsPathsFilterOptions from a JSON string
potential_flows_paths_filter_options_instance = PotentialFlowsPathsFilterOptions.from_json(json)
# print the JSON string representation of the object
print(PotentialFlowsPathsFilterOptions.to_json())

# convert the object into a dict
potential_flows_paths_filter_options_dict = potential_flows_paths_filter_options_instance.to_dict()
# create an instance of PotentialFlowsPathsFilterOptions from a dict
potential_flows_paths_filter_options_from_dict = PotentialFlowsPathsFilterOptions.from_dict(potential_flows_paths_filter_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


