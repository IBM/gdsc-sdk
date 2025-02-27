# Assetsv3RuleParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_attribute** | **str** | Attribute type of the rule. | [optional] 
**attribute_enum** | **str** | Enum to indicate attribute type. | [optional] 
**condition** | **str** | Attribute condition. | [optional] 
**condition_category** | **str** | Category of the attribute. | [optional] 
**condition_value** | **str** | Value of the attribute. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_rule_parameter import Assetsv3RuleParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3RuleParameter from a JSON string
assetsv3_rule_parameter_instance = Assetsv3RuleParameter.from_json(json)
# print the JSON string representation of the object
print(Assetsv3RuleParameter.to_json())

# convert the object into a dict
assetsv3_rule_parameter_dict = assetsv3_rule_parameter_instance.to_dict()
# create an instance of Assetsv3RuleParameter from a dict
assetsv3_rule_parameter_from_dict = Assetsv3RuleParameter.from_dict(assetsv3_rule_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


