# Guardiumconnectorv3GroupMember

Return the members of one or more groups indentified by group IDs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Group member name. | [optional] 
**member_id** | **int** | Group member ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_group_member import Guardiumconnectorv3GroupMember

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GroupMember from a JSON string
guardiumconnectorv3_group_member_instance = Guardiumconnectorv3GroupMember.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GroupMember.to_json())

# convert the object into a dict
guardiumconnectorv3_group_member_dict = guardiumconnectorv3_group_member_instance.to_dict()
# create an instance of Guardiumconnectorv3GroupMember from a dict
guardiumconnectorv3_group_member_from_dict = Guardiumconnectorv3GroupMember.from_dict(guardiumconnectorv3_group_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


