

# Groupbuilderv3Group

Group imports groups from a Guradium Data Protection central manager to Guardium Insights.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessLevel** | **Integer** | Group access level. |  [optional] |
|**description** | **String** | Group description. |  [optional] |
|**flattenedMemberCount** | **Integer** | Flattened member count for nested groups. |  [optional] |
|**groupId** | **Integer** | Group ID. |  [optional] |
|**groupTypeId** | **Integer** | Group type ID. |  [optional] |
|**lastSyncDate** | **OffsetDateTime** | Last synchronization date. |  [optional] |
|**ldapConfig** | [**Groupbuilderv3LdapConfig**](Groupbuilderv3LdapConfig.md) |  |  [optional] |
|**memberCount** | **Integer** | Group members count. |  [optional] |
|**members** | [**List&lt;Groupbuilderv3GroupMember&gt;**](Groupbuilderv3GroupMember.md) | Array of members. |  [optional] |
|**name** | **String** | Group name. |  [optional] |
|**nested** | **Boolean** | Nested (hierarchical). |  [optional] |
|**nestedGroupMembers** | [**List&lt;Groupbuilderv3NestedGroupMember&gt;**](Groupbuilderv3NestedGroupMember.md) | Array of nested (hierarchical) members. |  [optional] |
|**nextSyncDate** | **OffsetDateTime** | Next synchronization date. |  [optional] |
|**syncInactiveCode** | **Integer** | Synchronization inactive code. |  [optional] |
|**syncSource** | **String** | Name of Guardium Data Protection central manager synchronized to the group. |  [optional] |
|**synced** | **Boolean** | Synchronized. |  [optional] |
|**tupleCount** | **Integer** | Group tuples count. |  [optional] |
|**tupleParams** | **List&lt;String&gt;** | Tuple parameters. |  [optional] |



