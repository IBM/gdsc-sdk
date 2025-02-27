# VulnerabilitiesSummaryStatusSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recently_discovered** | **float** |  | 
**open** | **float** |  | 
**fixed** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulnerabilities_summary_status_summary import VulnerabilitiesSummaryStatusSummary

# TODO update the JSON string below
json = "{}"
# create an instance of VulnerabilitiesSummaryStatusSummary from a JSON string
vulnerabilities_summary_status_summary_instance = VulnerabilitiesSummaryStatusSummary.from_json(json)
# print the JSON string representation of the object
print(VulnerabilitiesSummaryStatusSummary.to_json())

# convert the object into a dict
vulnerabilities_summary_status_summary_dict = vulnerabilities_summary_status_summary_instance.to_dict()
# create an instance of VulnerabilitiesSummaryStatusSummary from a dict
vulnerabilities_summary_status_summary_from_dict = VulnerabilitiesSummaryStatusSummary.from_dict(vulnerabilities_summary_status_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


