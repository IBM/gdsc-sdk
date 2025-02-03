# Reportsv3VariantRule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_if_type** | [**Reportsv3VariantRuleCondition**](Reportsv3VariantRuleCondition.md) |  | [optional] 
**delimiter** | **str** |  | [optional] 
**extract_value** | **str** |  | [optional] 
**matcher** | **str** |  | [optional] 
**type** | [**Reportsv3VariantRuleType**](Reportsv3VariantRuleType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_variant_rule import Reportsv3VariantRule

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3VariantRule from a JSON string
reportsv3_variant_rule_instance = Reportsv3VariantRule.from_json(json)
# print the JSON string representation of the object
print(Reportsv3VariantRule.to_json())

# convert the object into a dict
reportsv3_variant_rule_dict = reportsv3_variant_rule_instance.to_dict()
# create an instance of Reportsv3VariantRule from a dict
reportsv3_variant_rule_from_dict = Reportsv3VariantRule.from_dict(reportsv3_variant_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


