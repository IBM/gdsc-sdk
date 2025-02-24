# VulnerabilitiesByDataStoreFilterOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vulnerability_types** | [**List[VulnerabilityType]**](VulnerabilityType.md) |  | [optional] 
**criticalities** | [**List[VulnerabilityCriticality]**](VulnerabilityCriticality.md) |  | [optional] 
**threats** | **List[str]** |  | [optional] 
**compliance** | [**List[Compliance]**](Compliance.md) |  | [optional] 
**threat_categories** | [**List[VulnerabilityThreatCategory]**](VulnerabilityThreatCategory.md) |  | [optional] 
**affected_data_store** | [**VulnerabilityAffectedDataStoreFilterOptions**](VulnerabilityAffectedDataStoreFilterOptions.md) |  | [optional] 
**status_types** | [**List[VulnerabilityStatusType]**](VulnerabilityStatusType.md) |  | [optional] 
**status_type_families** | [**List[VulnerabilityStatusTypeFamily]**](VulnerabilityStatusTypeFamily.md) |  | [optional] 
**discovered_since** | **float** | as epoch timestamp | [optional] 
**sensitive_tags** | **List[str]** |  | [optional] 
**compliances** | [**List[Compliance]**](Compliance.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulnerabilities_by_data_store_filter_options import VulnerabilitiesByDataStoreFilterOptions

# TODO update the JSON string below
json = "{}"
# create an instance of VulnerabilitiesByDataStoreFilterOptions from a JSON string
vulnerabilities_by_data_store_filter_options_instance = VulnerabilitiesByDataStoreFilterOptions.from_json(json)
# print the JSON string representation of the object
print(VulnerabilitiesByDataStoreFilterOptions.to_json())

# convert the object into a dict
vulnerabilities_by_data_store_filter_options_dict = vulnerabilities_by_data_store_filter_options_instance.to_dict()
# create an instance of VulnerabilitiesByDataStoreFilterOptions from a dict
vulnerabilities_by_data_store_filter_options_from_dict = VulnerabilitiesByDataStoreFilterOptions.from_dict(vulnerabilities_by_data_store_filter_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


