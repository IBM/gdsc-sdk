# Policybuilderv3TargetReceiver

Receivers object which would consumed by notification service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integration_id** | **str** | Integration id for policy builder UI to display integration name. | [optional] 
**template_id** | **str** | Template name. | [optional] 
**type** | [**Policybuilderv3RecipientType**](Policybuilderv3RecipientType.md) |  | [optional] 
**value** | **str** | Receiver value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_target_receiver import Policybuilderv3TargetReceiver

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3TargetReceiver from a JSON string
policybuilderv3_target_receiver_instance = Policybuilderv3TargetReceiver.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3TargetReceiver.to_json())

# convert the object into a dict
policybuilderv3_target_receiver_dict = policybuilderv3_target_receiver_instance.to_dict()
# create an instance of Policybuilderv3TargetReceiver from a dict
policybuilderv3_target_receiver_from_dict = Policybuilderv3TargetReceiver.from_dict(policybuilderv3_target_receiver_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


