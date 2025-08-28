# Vulmanagementv3VulnerabilitiesStatsDataResponse

VulnerabilitiesStatsDataResponse - Calculates and returns various vulnerabilities stats data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**severity_critical_count** | **str** | Number of critical vulnerabilities. | [optional] 
**severity_high_count** | **str** | Number of high vulnerabilities. | [optional] 
**severity_low_count** | **str** | Number of low vulnerabilities. | [optional] 
**severity_medium_count** | **str** | Number of medium vulnerabilities. | [optional] 
**severity_unknown_count** | **str** | Number of unknown severities vulnerabilities. | [optional] 
**status_exception_count** | **str** | Number of exception vulnerabilities. | [optional] 
**status_fixed_count** | **str** | Number of fixed vulnerabilities. | [optional] 
**status_inprogress_count** | **str** | Number of vulnerabilities in progress. | [optional] 
**status_open_count** | **str** | Number of open vulnerabilities. | [optional] 
**status_unknown_count** | **str** | Number of unknown statuses vulnerabilities. | [optional] 
**total_count** | **str** | Total count of vulnerabilities. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_vulnerabilities_stats_data_response import Vulmanagementv3VulnerabilitiesStatsDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3VulnerabilitiesStatsDataResponse from a JSON string
vulmanagementv3_vulnerabilities_stats_data_response_instance = Vulmanagementv3VulnerabilitiesStatsDataResponse.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3VulnerabilitiesStatsDataResponse.to_json())

# convert the object into a dict
vulmanagementv3_vulnerabilities_stats_data_response_dict = vulmanagementv3_vulnerabilities_stats_data_response_instance.to_dict()
# create an instance of Vulmanagementv3VulnerabilitiesStatsDataResponse from a dict
vulmanagementv3_vulnerabilities_stats_data_response_from_dict = Vulmanagementv3VulnerabilitiesStatsDataResponse.from_dict(vulmanagementv3_vulnerabilities_stats_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


