# Groupbuilderv3Group

Group imports groups from a Guradium Data Protection central manager to Guardium.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_level** | **int** | Group access level. | [optional] 
**description** | **str** | Group description. | [optional] 
**flattened_member_count** | **int** | Flattened member count for nested groups. | [optional] 
**group_id** | **int** | Group ID. | [optional] 
**group_type_id** | **int** | Group type ID. | [optional] 
**last_sync_date** | **datetime** | Last synchronization date. | [optional] 
**ldap_config** | [**Groupbuilderv3LdapConfig**](Groupbuilderv3LdapConfig.md) |  | [optional] 
**member_count** | **int** | Group members count. | [optional] 
**members** | [**List[Groupbuilderv3GroupMember]**](Groupbuilderv3GroupMember.md) | Array of members. | [optional] 
**name** | **str** | Group name. | [optional] 
**nested** | **bool** | Nested (hierarchical). | [optional] 
**nested_group_members** | [**List[Groupbuilderv3NestedGroupMember]**](Groupbuilderv3NestedGroupMember.md) | Array of nested (hierarchical) members. | [optional] 
**next_sync_date** | **datetime** | Next synchronization date. | [optional] 
**sync_inactive_code** | **int** | Synchronization inactive code. | [optional] 
**sync_source** | **str** | Name of Guardium Data Protection central manager synchronized to the group. | [optional] 
**synced** | **bool** | Synchronized. | [optional] 
**tuple_count** | **int** | Group tuples count. | [optional] 
**tuple_params** | **List[str]** | Tuple parameters. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_group import Groupbuilderv3Group

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3Group from a JSON string
groupbuilderv3_group_instance = Groupbuilderv3Group.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3Group.to_json())

# convert the object into a dict
groupbuilderv3_group_dict = groupbuilderv3_group_instance.to_dict()
# create an instance of Groupbuilderv3Group from a dict
groupbuilderv3_group_from_dict = Groupbuilderv3Group.from_dict(groupbuilderv3_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


