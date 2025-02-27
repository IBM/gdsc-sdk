# PotentialFlowsSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **float** |  | 
**types_count** | [**List[TypesCountInner]**](TypesCountInner.md) |  | 
**cloud_account_count** | [**List[CloudAccountCountInner]**](CloudAccountCountInner.md) |  | 
**cloud_region_count** | [**List[CloudRegionCountInner]**](CloudRegionCountInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.potential_flows_summary import PotentialFlowsSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PotentialFlowsSummary from a JSON string
potential_flows_summary_instance = PotentialFlowsSummary.from_json(json)
# print the JSON string representation of the object
print(PotentialFlowsSummary.to_json())

# convert the object into a dict
potential_flows_summary_dict = potential_flows_summary_instance.to_dict()
# create an instance of PotentialFlowsSummary from a dict
potential_flows_summary_from_dict = PotentialFlowsSummary.from_dict(potential_flows_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


