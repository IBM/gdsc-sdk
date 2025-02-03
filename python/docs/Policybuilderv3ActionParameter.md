# Policybuilderv3ActionParameter

Message format for the parameters being used in Actions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_name** | **str** | Name of the parameter. | [optional] 
**parameter_value** | **str** | Value of the parameter. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_action_parameter import Policybuilderv3ActionParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3ActionParameter from a JSON string
policybuilderv3_action_parameter_instance = Policybuilderv3ActionParameter.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3ActionParameter.to_json())

# convert the object into a dict
policybuilderv3_action_parameter_dict = policybuilderv3_action_parameter_instance.to_dict()
# create an instance of Policybuilderv3ActionParameter from a dict
policybuilderv3_action_parameter_from_dict = Policybuilderv3ActionParameter.from_dict(policybuilderv3_action_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


