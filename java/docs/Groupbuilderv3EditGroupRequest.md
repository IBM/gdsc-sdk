

# Groupbuilderv3EditGroupRequest

EditGroupRequest request an update to the group members of a specific group ID.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clearGroup** | **Boolean** | Clear the group member. |  [optional] |
|**deletedMembers** | **List&lt;String&gt;** | Group member ID to delete. |  [optional] |
|**description** | **String** | Group description. |  [optional] |
|**groupId** | **Integer** | Group ID. |  [optional] |
|**ldapConfig** | [**Groupbuilderv3LdapConfig**](Groupbuilderv3LdapConfig.md) |  |  [optional] |
|**name** | **String** | Group name. |  [optional] |
|**newMembers** | **List&lt;String&gt;** | New members to add. |  [optional] |
|**updatedMembers** | [**List&lt;Groupbuilderv3GroupMember&gt;**](Groupbuilderv3GroupMember.md) | Group members to update. |  [optional] |



