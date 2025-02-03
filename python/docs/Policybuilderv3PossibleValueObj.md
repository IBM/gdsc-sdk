# Policybuilderv3PossibleValueObj

Possible value objects for parameters which supports predefined values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**descrption** | **str** | Description used to describe the value. Primarily being used for tooltip. | [optional] 
**value** | **str** | Value of the parameter. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_possible_value_obj import Policybuilderv3PossibleValueObj

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3PossibleValueObj from a JSON string
policybuilderv3_possible_value_obj_instance = Policybuilderv3PossibleValueObj.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3PossibleValueObj.to_json())

# convert the object into a dict
policybuilderv3_possible_value_obj_dict = policybuilderv3_possible_value_obj_instance.to_dict()
# create an instance of Policybuilderv3PossibleValueObj from a dict
policybuilderv3_possible_value_obj_from_dict = Policybuilderv3PossibleValueObj.from_dict(policybuilderv3_possible_value_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


