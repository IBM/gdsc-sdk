# Policybuilderv3GetPolicyVersionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | [**Policybuilderv3Policy**](Policybuilderv3Policy.md) |  | [optional] 
**rules** | [**List[Policybuilderv3Rule]**](Policybuilderv3Rule.md) |  | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_policy_version_response import Policybuilderv3GetPolicyVersionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPolicyVersionResponse from a JSON string
policybuilderv3_get_policy_version_response_instance = Policybuilderv3GetPolicyVersionResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPolicyVersionResponse.to_json())

# convert the object into a dict
policybuilderv3_get_policy_version_response_dict = policybuilderv3_get_policy_version_response_instance.to_dict()
# create an instance of Policybuilderv3GetPolicyVersionResponse from a dict
policybuilderv3_get_policy_version_response_from_dict = Policybuilderv3GetPolicyVersionResponse.from_dict(policybuilderv3_get_policy_version_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


