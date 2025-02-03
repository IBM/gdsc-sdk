# Policybuilderv3ParameterRelationShip

Relationship object between 2 rule parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_name** | **str** | Name of the parameter the relationship is. | [optional] 
**relationship** | **str** | Relationship name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_parameter_relation_ship import Policybuilderv3ParameterRelationShip

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3ParameterRelationShip from a JSON string
policybuilderv3_parameter_relation_ship_instance = Policybuilderv3ParameterRelationShip.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3ParameterRelationShip.to_json())

# convert the object into a dict
policybuilderv3_parameter_relation_ship_dict = policybuilderv3_parameter_relation_ship_instance.to_dict()
# create an instance of Policybuilderv3ParameterRelationShip from a dict
policybuilderv3_parameter_relation_ship_from_dict = Policybuilderv3ParameterRelationShip.from_dict(policybuilderv3_parameter_relation_ship_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


