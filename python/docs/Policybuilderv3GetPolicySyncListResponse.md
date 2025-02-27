# Policybuilderv3GetPolicySyncListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List[Policybuilderv3GdpPolicySyncRes]**](Policybuilderv3GdpPolicySyncRes.md) |  | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_policy_sync_list_response import Policybuilderv3GetPolicySyncListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetPolicySyncListResponse from a JSON string
policybuilderv3_get_policy_sync_list_response_instance = Policybuilderv3GetPolicySyncListResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetPolicySyncListResponse.to_json())

# convert the object into a dict
policybuilderv3_get_policy_sync_list_response_dict = policybuilderv3_get_policy_sync_list_response_instance.to_dict()
# create an instance of Policybuilderv3GetPolicySyncListResponse from a dict
policybuilderv3_get_policy_sync_list_response_from_dict = Policybuilderv3GetPolicySyncListResponse.from_dict(policybuilderv3_get_policy_sync_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


