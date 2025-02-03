# Complianceacceleratorv3Action

A policy alert action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notification_type** | [**Complianceacceleratorv3RecipientType**](Complianceacceleratorv3RecipientType.md) |  | [optional] 
**user_ids** | **List[str]** | The emails for the action. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_action import Complianceacceleratorv3Action

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3Action from a JSON string
complianceacceleratorv3_action_instance = Complianceacceleratorv3Action.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3Action.to_json())

# convert the object into a dict
complianceacceleratorv3_action_dict = complianceacceleratorv3_action_instance.to_dict()
# create an instance of Complianceacceleratorv3Action from a dict
complianceacceleratorv3_action_from_dict = Complianceacceleratorv3Action.from_dict(complianceacceleratorv3_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


