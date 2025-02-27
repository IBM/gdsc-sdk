# VulnerabilitiesSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criticality_count** | [**List[VulnerabilitiesCriticalityCountInner]**](VulnerabilitiesCriticalityCountInner.md) |  | 
**vulnerability_type_count** | [**List[VulnerabilitiesSummaryVulnerabilityTypeCountInner]**](VulnerabilitiesSummaryVulnerabilityTypeCountInner.md) |  | 
**status_type_count** | [**List[VulnerabilitiesSummaryStatusTypeCountInner]**](VulnerabilitiesSummaryStatusTypeCountInner.md) |  | 
**status_summary** | [**VulnerabilitiesSummaryStatusSummary**](VulnerabilitiesSummaryStatusSummary.md) |  | 
**affected_data_store_summary** | [**VulnerabilitiesSummaryAffectedDataStoreSummary**](VulnerabilitiesSummaryAffectedDataStoreSummary.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulnerabilities_summary import VulnerabilitiesSummary

# TODO update the JSON string below
json = "{}"
# create an instance of VulnerabilitiesSummary from a JSON string
vulnerabilities_summary_instance = VulnerabilitiesSummary.from_json(json)
# print the JSON string representation of the object
print(VulnerabilitiesSummary.to_json())

# convert the object into a dict
vulnerabilities_summary_dict = vulnerabilities_summary_instance.to_dict()
# create an instance of VulnerabilitiesSummary from a dict
vulnerabilities_summary_from_dict = VulnerabilitiesSummary.from_dict(vulnerabilities_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


