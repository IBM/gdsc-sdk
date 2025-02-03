

# Groupbuilderv3ImportGroupRequest

GetGroupsRequest requests to import specific groups from a Guardium Data Protection central manager.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**centralManagerId** | **String** | Central manager host name. |  [optional] |
|**groups** | [**List&lt;Groupbuilderv3Group&gt;**](Groupbuilderv3Group.md) | List of groups to import from the central manager. |  [optional] |
|**ldapConfig** | [**Groupbuilderv3LdapConfig**](Groupbuilderv3LdapConfig.md) |  |  [optional] |
|**oneTime** | **Boolean** | Import without synchronizing. |  [optional] |
|**preview** | **Boolean** | This flag is only valid if ldap_config is specified When set, LDAP import will pull the first 10 members from LDAP based on specified  LDAP config and return to the caller without adding them to the group. |  [optional] |



