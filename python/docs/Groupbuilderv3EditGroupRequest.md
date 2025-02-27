# Groupbuilderv3EditGroupRequest

EditGroupRequest request an update to the group members of a specific group ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clear_group** | **bool** | Clear the group member. | [optional] 
**deleted_members** | **List[str]** | Group member ID to delete. | [optional] 
**description** | **str** | Group description. | [optional] 
**group_id** | **int** | Group ID. | [optional] 
**ldap_config** | [**Groupbuilderv3LdapConfig**](Groupbuilderv3LdapConfig.md) |  | [optional] 
**name** | **str** | Group name. | [optional] 
**new_members** | **List[str]** | New members to add. | [optional] 
**updated_members** | [**List[Groupbuilderv3GroupMember]**](Groupbuilderv3GroupMember.md) | Group members to update. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_edit_group_request import Groupbuilderv3EditGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3EditGroupRequest from a JSON string
groupbuilderv3_edit_group_request_instance = Groupbuilderv3EditGroupRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3EditGroupRequest.to_json())

# convert the object into a dict
groupbuilderv3_edit_group_request_dict = groupbuilderv3_edit_group_request_instance.to_dict()
# create an instance of Groupbuilderv3EditGroupRequest from a dict
groupbuilderv3_edit_group_request_from_dict = Groupbuilderv3EditGroupRequest.from_dict(groupbuilderv3_edit_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


