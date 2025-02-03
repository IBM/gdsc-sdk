# Policybuilderv3ActionMetadata

Action metadata object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_name** | **str** | Name of the action. | [optional] 
**label** | **str** | Ui label for the action. | [optional] 
**parameters** | [**List[Policybuilderv3ActionParameterMetadata]**](Policybuilderv3ActionParameterMetadata.md) | Action parameters. | [optional] 
**rule_type** | [**List[Policybuilderv3RuleType]**](Policybuilderv3RuleType.md) | Rule type for the action. | [optional] 
**type** | [**Policybuilderv3ActionType**](Policybuilderv3ActionType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_action_metadata import Policybuilderv3ActionMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3ActionMetadata from a JSON string
policybuilderv3_action_metadata_instance = Policybuilderv3ActionMetadata.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3ActionMetadata.to_json())

# convert the object into a dict
policybuilderv3_action_metadata_dict = policybuilderv3_action_metadata_instance.to_dict()
# create an instance of Policybuilderv3ActionMetadata from a dict
policybuilderv3_action_metadata_from_dict = Policybuilderv3ActionMetadata.from_dict(policybuilderv3_action_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


