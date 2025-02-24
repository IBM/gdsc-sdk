# Guardiumconnectorv3RuleParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **int** |  | [optional] 
**parameter_name** | **str** |  | [optional] 
**parameter_operator** | **str** |  | [optional] 
**parameter_value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_rule_parameter import Guardiumconnectorv3RuleParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3RuleParameter from a JSON string
guardiumconnectorv3_rule_parameter_instance = Guardiumconnectorv3RuleParameter.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3RuleParameter.to_json())

# convert the object into a dict
guardiumconnectorv3_rule_parameter_dict = guardiumconnectorv3_rule_parameter_instance.to_dict()
# create an instance of Guardiumconnectorv3RuleParameter from a dict
guardiumconnectorv3_rule_parameter_from_dict = Guardiumconnectorv3RuleParameter.from_dict(guardiumconnectorv3_rule_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


