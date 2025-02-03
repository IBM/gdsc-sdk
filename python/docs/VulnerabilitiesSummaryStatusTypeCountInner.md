# VulnerabilitiesSummaryStatusTypeCountInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status_type** | [**VulnerabilityStatusType**](VulnerabilityStatusType.md) |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.vulnerabilities_summary_status_type_count_inner import VulnerabilitiesSummaryStatusTypeCountInner

# TODO update the JSON string below
json = "{}"
# create an instance of VulnerabilitiesSummaryStatusTypeCountInner from a JSON string
vulnerabilities_summary_status_type_count_inner_instance = VulnerabilitiesSummaryStatusTypeCountInner.from_json(json)
# print the JSON string representation of the object
print(VulnerabilitiesSummaryStatusTypeCountInner.to_json())

# convert the object into a dict
vulnerabilities_summary_status_type_count_inner_dict = vulnerabilities_summary_status_type_count_inner_instance.to_dict()
# create an instance of VulnerabilitiesSummaryStatusTypeCountInner from a dict
vulnerabilities_summary_status_type_count_inner_from_dict = VulnerabilitiesSummaryStatusTypeCountInner.from_dict(vulnerabilities_summary_status_type_count_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


