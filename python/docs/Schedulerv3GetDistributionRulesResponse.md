# Schedulerv3GetDistributionRulesResponse

GetDistributionRulesResponse returns all the distribution rule IDs in the scheduler collection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**distribution_rule_ids** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_get_distribution_rules_response import Schedulerv3GetDistributionRulesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3GetDistributionRulesResponse from a JSON string
schedulerv3_get_distribution_rules_response_instance = Schedulerv3GetDistributionRulesResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3GetDistributionRulesResponse.to_json())

# convert the object into a dict
schedulerv3_get_distribution_rules_response_dict = schedulerv3_get_distribution_rules_response_instance.to_dict()
# create an instance of Schedulerv3GetDistributionRulesResponse from a dict
schedulerv3_get_distribution_rules_response_from_dict = Schedulerv3GetDistributionRulesResponse.from_dict(schedulerv3_get_distribution_rules_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


