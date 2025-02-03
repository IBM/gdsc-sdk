# VulnerabilitiesCriticalityCountInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criticality** | [**VulnerabilityCriticality**](VulnerabilityCriticality.md) |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.vulnerabilities_criticality_count_inner import VulnerabilitiesCriticalityCountInner

# TODO update the JSON string below
json = "{}"
# create an instance of VulnerabilitiesCriticalityCountInner from a JSON string
vulnerabilities_criticality_count_inner_instance = VulnerabilitiesCriticalityCountInner.from_json(json)
# print the JSON string representation of the object
print(VulnerabilitiesCriticalityCountInner.to_json())

# convert the object into a dict
vulnerabilities_criticality_count_inner_dict = vulnerabilities_criticality_count_inner_instance.to_dict()
# create an instance of VulnerabilitiesCriticalityCountInner from a dict
vulnerabilities_criticality_count_inner_from_dict = VulnerabilitiesCriticalityCountInner.from_dict(vulnerabilities_criticality_count_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


