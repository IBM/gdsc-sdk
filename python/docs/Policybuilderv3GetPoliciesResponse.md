# Policybuilderv3GetPoliciesResponse

GetPoliciesResponse is the response message which will have all the policies in GI.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List[Policybuilderv3Policy]**](Policybuilderv3Policy.md) | List of policies returned by GetPolcies(). | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_policies_response import Policybuilderv3GetPoliciesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPoliciesResponse from a JSON string
policybuilderv3_get_policies_response_instance = Policybuilderv3GetPoliciesResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPoliciesResponse.to_json())

# convert the object into a dict
policybuilderv3_get_policies_response_dict = policybuilderv3_get_policies_response_instance.to_dict()
# create an instance of Policybuilderv3GetPoliciesResponse from a dict
policybuilderv3_get_policies_response_from_dict = Policybuilderv3GetPoliciesResponse.from_dict(policybuilderv3_get_policies_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


