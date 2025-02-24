# Riskanalyticsmlclassificationv3RuleSetList

RuleSetList message for the response of GetClassificationModel api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rule_set_list** | [**List[Riskanalyticsmlclassificationv3RuleSet]**](Riskanalyticsmlclassificationv3RuleSet.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsmlclassificationv3_rule_set_list import Riskanalyticsmlclassificationv3RuleSetList

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsmlclassificationv3RuleSetList from a JSON string
riskanalyticsmlclassificationv3_rule_set_list_instance = Riskanalyticsmlclassificationv3RuleSetList.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsmlclassificationv3RuleSetList.to_json())

# convert the object into a dict
riskanalyticsmlclassificationv3_rule_set_list_dict = riskanalyticsmlclassificationv3_rule_set_list_instance.to_dict()
# create an instance of Riskanalyticsmlclassificationv3RuleSetList from a dict
riskanalyticsmlclassificationv3_rule_set_list_from_dict = Riskanalyticsmlclassificationv3RuleSetList.from_dict(riskanalyticsmlclassificationv3_rule_set_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


