# Policybuilderv3PolicyGroups


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **str** |  | [optional] 
**policies** | [**List[Policybuilderv3PolicyDetailsForGroups]**](Policybuilderv3PolicyDetailsForGroups.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_policy_groups import Policybuilderv3PolicyGroups

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3PolicyGroups from a JSON string
policybuilderv3_policy_groups_instance = Policybuilderv3PolicyGroups.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3PolicyGroups.to_json())

# convert the object into a dict
policybuilderv3_policy_groups_dict = policybuilderv3_policy_groups_instance.to_dict()
# create an instance of Policybuilderv3PolicyGroups from a dict
policybuilderv3_policy_groups_from_dict = Policybuilderv3PolicyGroups.from_dict(policybuilderv3_policy_groups_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


