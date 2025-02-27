# Policybuilderv3InsertGdpPolicySyncResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gdp_policies** | [**List[Policybuilderv3GdpPolicySyncRes]**](Policybuilderv3GdpPolicySyncRes.md) |  | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_insert_gdp_policy_sync_response import Policybuilderv3InsertGdpPolicySyncResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3InsertGdpPolicySyncResponse from a JSON string
policybuilderv3_insert_gdp_policy_sync_response_instance = Policybuilderv3InsertGdpPolicySyncResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3InsertGdpPolicySyncResponse.to_json())

# convert the object into a dict
policybuilderv3_insert_gdp_policy_sync_response_dict = policybuilderv3_insert_gdp_policy_sync_response_instance.to_dict()
# create an instance of Policybuilderv3InsertGdpPolicySyncResponse from a dict
policybuilderv3_insert_gdp_policy_sync_response_from_dict = Policybuilderv3InsertGdpPolicySyncResponse.from_dict(policybuilderv3_insert_gdp_policy_sync_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


