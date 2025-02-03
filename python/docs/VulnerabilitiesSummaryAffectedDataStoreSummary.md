# VulnerabilitiesSummaryAffectedDataStoreSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_account_ids_count** | [**List[VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner]**](VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner.md) |  | 
**cloud_regions_count** | [**List[VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner]**](VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.md) |  | 
**data_store_types** | [**List[VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner]**](VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.vulnerabilities_summary_affected_data_store_summary import VulnerabilitiesSummaryAffectedDataStoreSummary

# TODO update the JSON string below
json = "{}"
# create an instance of VulnerabilitiesSummaryAffectedDataStoreSummary from a JSON string
vulnerabilities_summary_affected_data_store_summary_instance = VulnerabilitiesSummaryAffectedDataStoreSummary.from_json(json)
# print the JSON string representation of the object
print(VulnerabilitiesSummaryAffectedDataStoreSummary.to_json())

# convert the object into a dict
vulnerabilities_summary_affected_data_store_summary_dict = vulnerabilities_summary_affected_data_store_summary_instance.to_dict()
# create an instance of VulnerabilitiesSummaryAffectedDataStoreSummary from a dict
vulnerabilities_summary_affected_data_store_summary_from_dict = VulnerabilitiesSummaryAffectedDataStoreSummary.from_dict(vulnerabilities_summary_affected_data_store_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


