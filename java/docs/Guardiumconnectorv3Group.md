

# Guardiumconnectorv3Group

Return details about the groups defined on a Guardium system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**application** | **String** | Application associated with the group. |  [optional] |
|**description** | **String** | Group name. |  [optional] |
|**groupId** | **Integer** | Group ID. |  [optional] |
|**groupTypeId** | **Integer** | Group type ID. |  [optional] |
|**hierarchical** | **Boolean** | Group is nested (hierarchical). |  [optional] |
|**memberCount** | **Integer** | Number of members in group. |  [optional] |
|**members** | [**List&lt;Guardiumconnectorv3GroupMember&gt;**](Guardiumconnectorv3GroupMember.md) | List of group members. |  [optional] |
|**nestedGroupMembers** | [**List&lt;Guardiumconnectorv3NestedGroupMember&gt;**](Guardiumconnectorv3NestedGroupMember.md) | Array of group members. |  [optional] |
|**tupleCount** | **Integer** | Number of tuples in group. |  [optional] |
|**tuples** | **String** | Name of tuples in group type. |  [optional] |
|**type** | **Integer** | Group type. |  [optional] |



