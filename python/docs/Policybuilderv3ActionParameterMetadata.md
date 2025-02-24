# Policybuilderv3ActionParameterMetadata

Action parameter metadata object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_value** | **str** | Default value of the parameter. | [optional] 
**mandatory** | **bool** | Flag indicating if the parameter is manadatory or not. | [optional] 
**name** | **str** | Name of the parameter. | [optional] 
**possible_values** | **List[str]** | Possible values of the parameter. | [optional] 
**sequence** | **int** | Sequence of the parameter. | [optional] 
**type** | **str** | TYpe of the Parameter like String, Number, Reg and so on. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_action_parameter_metadata import Policybuilderv3ActionParameterMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3ActionParameterMetadata from a JSON string
policybuilderv3_action_parameter_metadata_instance = Policybuilderv3ActionParameterMetadata.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3ActionParameterMetadata.to_json())

# convert the object into a dict
policybuilderv3_action_parameter_metadata_dict = policybuilderv3_action_parameter_metadata_instance.to_dict()
# create an instance of Policybuilderv3ActionParameterMetadata from a dict
policybuilderv3_action_parameter_metadata_from_dict = Policybuilderv3ActionParameterMetadata.from_dict(policybuilderv3_action_parameter_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


