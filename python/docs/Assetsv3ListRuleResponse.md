# Assetsv3ListRuleResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_status** | **int** |  | [optional] 
**policy_id** | **str** |  | [optional] 
**policy_name** | **str** |  | [optional] 
**policy_sequence** | **int** |  | [optional] 
**rule_list** | [**List[Assetsv3Rule]**](Assetsv3Rule.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_list_rule_response import Assetsv3ListRuleResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ListRuleResponse from a JSON string
assetsv3_list_rule_response_instance = Assetsv3ListRuleResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ListRuleResponse.to_json())

# convert the object into a dict
assetsv3_list_rule_response_dict = assetsv3_list_rule_response_instance.to_dict()
# create an instance of Assetsv3ListRuleResponse from a dict
assetsv3_list_rule_response_from_dict = Assetsv3ListRuleResponse.from_dict(assetsv3_list_rule_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


