# Policybuilderv3Action

Message format for actions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_name** | **str** | Name of the action. | [optional] 
**notifications** | [**List[Policybuilderv3TargetReceiver]**](Policybuilderv3TargetReceiver.md) | Notification object if for alert action. | [optional] 
**order** | **int** | Order of the action being used in the rules. | [optional] 
**parameters** | [**List[Policybuilderv3ActionParameter]**](Policybuilderv3ActionParameter.md) | Action parameters. | [optional] 
**qr_defintion_id** | **int** | Query rewrite definition id. | [optional] 
**type** | [**Policybuilderv3ActionType**](Policybuilderv3ActionType.md) |  | [optional] 
**ui_label** | **str** | Ui label for the action. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_action import Policybuilderv3Action

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3Action from a JSON string
policybuilderv3_action_instance = Policybuilderv3Action.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3Action.to_json())

# convert the object into a dict
policybuilderv3_action_dict = policybuilderv3_action_instance.to_dict()
# create an instance of Policybuilderv3Action from a dict
policybuilderv3_action_from_dict = Policybuilderv3Action.from_dict(policybuilderv3_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


