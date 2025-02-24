# Assetsv3RuleLog


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rule_id** | **str** |  | [optional] 
**rule_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_rule_log import Assetsv3RuleLog

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3RuleLog from a JSON string
assetsv3_rule_log_instance = Assetsv3RuleLog.from_json(json)
# print the JSON string representation of the object
print(Assetsv3RuleLog.to_json())

# convert the object into a dict
assetsv3_rule_log_dict = assetsv3_rule_log_instance.to_dict()
# create an instance of Assetsv3RuleLog from a dict
assetsv3_rule_log_from_dict = Assetsv3RuleLog.from_dict(assetsv3_rule_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


