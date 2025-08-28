# Policybuilderv3GetPolicyVersionsInfoResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 
**versions_info** | [**List[Policybuilderv3VersionInfo]**](Policybuilderv3VersionInfo.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_policy_versions_info_response import Policybuilderv3GetPolicyVersionsInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPolicyVersionsInfoResponse from a JSON string
policybuilderv3_get_policy_versions_info_response_instance = Policybuilderv3GetPolicyVersionsInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPolicyVersionsInfoResponse.to_json())

# convert the object into a dict
policybuilderv3_get_policy_versions_info_response_dict = policybuilderv3_get_policy_versions_info_response_instance.to_dict()
# create an instance of Policybuilderv3GetPolicyVersionsInfoResponse from a dict
policybuilderv3_get_policy_versions_info_response_from_dict = Policybuilderv3GetPolicyVersionsInfoResponse.from_dict(policybuilderv3_get_policy_versions_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


