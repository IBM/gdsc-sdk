# Policybuilderv3GdpPolicySyncRes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager** | **str** |  | [optional] 
**created_policy_id** | **str** |  | [optional] 
**gdp_synced_id** | **str** | Sync id of the created or updated sync policy. | [optional] 
**import_name** | **str** | Name for imported GDP policy. | [optional] 
**last_state_change** | **str** |  | [optional] 
**policy_import_issue** | [**Policybuilderv3ImportIssue**](Policybuilderv3ImportIssue.md) |  | [optional] [default to Policybuilderv3ImportIssue.NO_IMPORT_ISSUE]
**policy_import_state** | [**Policybuilderv3ImportState**](Policybuilderv3ImportState.md) |  | [optional] [default to Policybuilderv3ImportState.NO_IMPORT_STATUS]
**policy_name** | **str** | Policy Name for the created or updated sync policy. | [optional] 
**sync_status** | [**Policybuilderv3SyncStatusType**](Policybuilderv3SyncStatusType.md) |  | [optional] [default to Policybuilderv3SyncStatusType.NO_SYNC_STATUS]

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_gdp_policy_sync_res import Policybuilderv3GdpPolicySyncRes

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GdpPolicySyncRes from a JSON string
policybuilderv3_gdp_policy_sync_res_instance = Policybuilderv3GdpPolicySyncRes.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GdpPolicySyncRes.to_json())

# convert the object into a dict
policybuilderv3_gdp_policy_sync_res_dict = policybuilderv3_gdp_policy_sync_res_instance.to_dict()
# create an instance of Policybuilderv3GdpPolicySyncRes from a dict
policybuilderv3_gdp_policy_sync_res_from_dict = Policybuilderv3GdpPolicySyncRes.from_dict(policybuilderv3_gdp_policy_sync_res_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


