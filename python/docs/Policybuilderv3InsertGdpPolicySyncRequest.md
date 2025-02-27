# Policybuilderv3InsertGdpPolicySyncRequest

Request object containing a list of objects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gdp_policies** | [**List[Policybuilderv3GDPSyncEntry]**](Policybuilderv3GDPSyncEntry.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_insert_gdp_policy_sync_request import Policybuilderv3InsertGdpPolicySyncRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3InsertGdpPolicySyncRequest from a JSON string
policybuilderv3_insert_gdp_policy_sync_request_instance = Policybuilderv3InsertGdpPolicySyncRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3InsertGdpPolicySyncRequest.to_json())

# convert the object into a dict
policybuilderv3_insert_gdp_policy_sync_request_dict = policybuilderv3_insert_gdp_policy_sync_request_instance.to_dict()
# create an instance of Policybuilderv3InsertGdpPolicySyncRequest from a dict
policybuilderv3_insert_gdp_policy_sync_request_from_dict = Policybuilderv3InsertGdpPolicySyncRequest.from_dict(policybuilderv3_insert_gdp_policy_sync_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


