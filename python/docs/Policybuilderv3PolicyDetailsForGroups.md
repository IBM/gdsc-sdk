# Policybuilderv3PolicyDetailsForGroups

Policy Details for groups being used in policies.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_id** | **str** | Policy id. | [optional] 
**policy_name** | **str** | Policy name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_policy_details_for_groups import Policybuilderv3PolicyDetailsForGroups

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3PolicyDetailsForGroups from a JSON string
policybuilderv3_policy_details_for_groups_instance = Policybuilderv3PolicyDetailsForGroups.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3PolicyDetailsForGroups.to_json())

# convert the object into a dict
policybuilderv3_policy_details_for_groups_dict = policybuilderv3_policy_details_for_groups_instance.to_dict()
# create an instance of Policybuilderv3PolicyDetailsForGroups from a dict
policybuilderv3_policy_details_for_groups_from_dict = Policybuilderv3PolicyDetailsForGroups.from_dict(policybuilderv3_policy_details_for_groups_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


