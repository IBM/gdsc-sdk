# Groupbuilderv3GroupMember

GroupMember gets information about group members.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**member_id** | **str** | Group member ID. | [optional] 
**name** | **str** | Group member name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_group_member import Groupbuilderv3GroupMember

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GroupMember from a JSON string
groupbuilderv3_group_member_instance = Groupbuilderv3GroupMember.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GroupMember.to_json())

# convert the object into a dict
groupbuilderv3_group_member_dict = groupbuilderv3_group_member_instance.to_dict()
# create an instance of Groupbuilderv3GroupMember from a dict
groupbuilderv3_group_member_from_dict = Groupbuilderv3GroupMember.from_dict(groupbuilderv3_group_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


