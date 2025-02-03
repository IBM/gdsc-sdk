# Groupbuilderv3LdapConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | **[]string** | LDAP object attribute used to convert to member data. | [optional] [default to null]
**BindGroupId** | **int32** | ID of the group whose members are used as bind values for parameterize filter. | [optional] [default to null]
**BindPassword** | **string** | Password for binding to LDAP if bind ID is set for ICP LDAP definition. | [optional] [default to null]
**ClearGroup** | **bool** | Flag indicating whether new data is replacing old data or is appended to it. | [optional] [default to null]
**Filter** | **string** | LDAP search query to use to find objects. | [optional] [default to null]
**FilterScope** | **int32** | Scope of LDAP search:  sub-tree vs immediate base DN children. | [optional] [default to null]
**ImportLimit** | **int32** | Maximum number of objects to import. | [optional] [default to null]
**LdapGroupName** | **string** | DN name of the LDAP group to get members from.  Alternative to explicit filter. | [optional] [default to null]
**LdapId** | **string** | ID of the ICP LDAP definition from which to import. | [optional] [default to null]
**MemberPrefix** | **string** | Prefix that will be added to each imported member. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

