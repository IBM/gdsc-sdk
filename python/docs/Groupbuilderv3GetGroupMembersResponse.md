# Groupbuilderv3GetGroupMembersResponse

Get Group members response returns all the group members of the specified group ids.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[Groupbuilderv3Group]**](Groupbuilderv3Group.md) | List of group objects with members. | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_members_response import Groupbuilderv3GetGroupMembersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupMembersResponse from a JSON string
groupbuilderv3_get_group_members_response_instance = Groupbuilderv3GetGroupMembersResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupMembersResponse.to_json())

# convert the object into a dict
groupbuilderv3_get_group_members_response_dict = groupbuilderv3_get_group_members_response_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupMembersResponse from a dict
groupbuilderv3_get_group_members_response_from_dict = Groupbuilderv3GetGroupMembersResponse.from_dict(groupbuilderv3_get_group_members_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


