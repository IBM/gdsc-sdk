# Policybuilderv3RuleParameterMetadata

Message format for RuleParameter Metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_value** | **str** | Default value. | [optional] 
**description** | **str** |  | [optional] 
**group_type_id** | **int** | Group type id. | [optional] 
**has_every** | **str** | Indicating and populating parameter name if it supports every operator. | [optional] 
**has_group** | **str** | Indicating and populating parameter name if it supports group. | [optional] 
**has_not** | **str** | Indicating and populating parameter name if it supports a not operator. | [optional] 
**label** | **str** | UI label for parameter. | [optional] 
**mandatory** | **bool** | Flag to indicate if the parameter is mandatory or not. | [optional] 
**parameter_name** | **str** | Parameter name. | [optional] 
**possible_values** | [**List[Policybuilderv3PossibleValueObj]**](Policybuilderv3PossibleValueObj.md) | Possible value length of the rule parameter. | [optional] 
**relationships** | [**List[Policybuilderv3ParameterRelationShip]**](Policybuilderv3ParameterRelationShip.md) | Parameter relationship object. | [optional] 
**rule_category** | **str** | Category of the rule. | [optional] 
**rule_type** | [**Policybuilderv3RuleType**](Policybuilderv3RuleType.md) |  | [optional] [default to Policybuilderv3RuleType.ACCESS]
**standalone_parameter** | **bool** | If the parameter is standalone. | [optional] 
**supported_db_types** | **List[str]** | Stores all the supported db types. | [optional] 
**type** | **str** | Type of parameter. | [optional] 
**value_length** | **int** | Maximum value of the parameter value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_rule_parameter_metadata import Policybuilderv3RuleParameterMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3RuleParameterMetadata from a JSON string
policybuilderv3_rule_parameter_metadata_instance = Policybuilderv3RuleParameterMetadata.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3RuleParameterMetadata.to_json())

# convert the object into a dict
policybuilderv3_rule_parameter_metadata_dict = policybuilderv3_rule_parameter_metadata_instance.to_dict()
# create an instance of Policybuilderv3RuleParameterMetadata from a dict
policybuilderv3_rule_parameter_metadata_from_dict = Policybuilderv3RuleParameterMetadata.from_dict(policybuilderv3_rule_parameter_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


