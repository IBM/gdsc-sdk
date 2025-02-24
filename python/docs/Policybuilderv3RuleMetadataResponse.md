# Policybuilderv3RuleMetadataResponse

Rule Metadata Response message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_metadata** | [**List[Policybuilderv3ActionMetadata]**](Policybuilderv3ActionMetadata.md) | Actions metadata object. | [optional] 
**parameter_metadata** | [**List[Policybuilderv3RuleParameterMetadata]**](Policybuilderv3RuleParameterMetadata.md) | Rule Parameters Metadata object. | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 
**tags** | **List[str]** | List of existing tags. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_rule_metadata_response import Policybuilderv3RuleMetadataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3RuleMetadataResponse from a JSON string
policybuilderv3_rule_metadata_response_instance = Policybuilderv3RuleMetadataResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3RuleMetadataResponse.to_json())

# convert the object into a dict
policybuilderv3_rule_metadata_response_dict = policybuilderv3_rule_metadata_response_instance.to_dict()
# create an instance of Policybuilderv3RuleMetadataResponse from a dict
policybuilderv3_rule_metadata_response_from_dict = Policybuilderv3RuleMetadataResponse.from_dict(policybuilderv3_rule_metadata_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


