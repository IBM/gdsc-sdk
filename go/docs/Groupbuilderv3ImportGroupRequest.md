# Groupbuilderv3ImportGroupRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CentralManagerId** | **string** | Central manager host name. | [optional] [default to null]
**Groups** | [**[]Groupbuilderv3Group**](groupbuilderv3Group.md) | List of groups to import from the central manager. | [optional] [default to null]
**LdapConfig** | [***Groupbuilderv3LdapConfig**](groupbuilderv3LdapConfig.md) |  | [optional] [default to null]
**OneTime** | **bool** | Import without synchronizing. | [optional] [default to null]
**Preview** | **bool** | This flag is only valid if ldap_config is specified When set, LDAP import will pull the first 10 members from LDAP based on specified  LDAP config and return to the caller without adding them to the group. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

