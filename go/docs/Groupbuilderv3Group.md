# Groupbuilderv3Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessLevel** | **int32** | Group access level. | [optional] [default to null]
**Description** | **string** | Group description. | [optional] [default to null]
**FlattenedMemberCount** | **int32** | Flattened member count for nested groups. | [optional] [default to null]
**GroupId** | **int32** | Group ID. | [optional] [default to null]
**GroupTypeId** | **int32** | Group type ID. | [optional] [default to null]
**LastSyncDate** | [**time.Time**](time.Time.md) | Last synchronization date. | [optional] [default to null]
**LdapConfig** | [***Groupbuilderv3LdapConfig**](groupbuilderv3LdapConfig.md) |  | [optional] [default to null]
**MemberCount** | **int32** | Group members count. | [optional] [default to null]
**Members** | [**[]Groupbuilderv3GroupMember**](groupbuilderv3GroupMember.md) | Array of members. | [optional] [default to null]
**Name** | **string** | Group name. | [optional] [default to null]
**Nested** | **bool** | Nested (hierarchical). | [optional] [default to null]
**NestedGroupMembers** | [**[]Groupbuilderv3NestedGroupMember**](groupbuilderv3NestedGroupMember.md) | Array of nested (hierarchical) members. | [optional] [default to null]
**NextSyncDate** | [**time.Time**](time.Time.md) | Next synchronization date. | [optional] [default to null]
**SyncInactiveCode** | **int32** | Synchronization inactive code. | [optional] [default to null]
**SyncSource** | **string** | Name of Guardium Data Protection central manager synchronized to the group. | [optional] [default to null]
**Synced** | **bool** | Synchronized. | [optional] [default to null]
**TupleCount** | **int32** | Group tuples count. | [optional] [default to null]
**TupleParams** | **[]string** | Tuple parameters. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

