# Assetsv3PolicyUpdate

Create and update policy request message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_status** | **int** | Activation status identifier. | [optional] 
**deleted_rule_ids** | **List[str]** | The rule ids which are supposed to be deleted on a update policy request. | [optional] 
**installed_flag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] 
**installed_timestamp** | **str** | Timestamp to indicate when the policy was installed. | [optional] 
**last_edited_timestamp** | **str** | Timestamp to indicate when the policy was last edited. | [optional] 
**policy_id** | **str** | Policy ID. | [optional] 
**policy_name** | **str** | Policy Name. | [optional] 
**policy_sequence** | **int** |  | [optional] 
**rules** | [**List[Assetsv3Rule]**](Assetsv3Rule.md) |  | [optional] 
**updated_rule_ids** | **List[str]** | The rule ids which have been updated on a update policy request. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_policy_update import Assetsv3PolicyUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3PolicyUpdate from a JSON string
assetsv3_policy_update_instance = Assetsv3PolicyUpdate.from_json(json)
# print the JSON string representation of the object
print(Assetsv3PolicyUpdate.to_json())

# convert the object into a dict
assetsv3_policy_update_dict = assetsv3_policy_update_instance.to_dict()
# create an instance of Assetsv3PolicyUpdate from a dict
assetsv3_policy_update_from_dict = Assetsv3PolicyUpdate.from_dict(assetsv3_policy_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


