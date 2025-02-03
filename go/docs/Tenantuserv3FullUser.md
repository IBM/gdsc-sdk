# Tenantuserv3FullUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivationDate** | [**time.Time**](time.Time.md) | Datetime of last access. | [optional] [default to null]
**DirectoryId** | **string** | Which directory did this user come from?. | [optional] [default to null]
**Disabled** | **bool** | Disabled. | [optional] [default to null]
**DisplayName** | **string** | LDAP cn. | [optional] [default to null]
**DistinguishedName** | **string** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). | [optional] [default to null]
**Email** | **string** | The email address of the user for communication. | [optional] [default to null]
**ExternalId** | **string** | External id of this user. E.g. ISV id. | [optional] [default to null]
**Metadata** | **map[string]string** | Metadata will contain all preferences   --&gt; this will contain all user-specific settings, including session time out. | [optional] [default to null]
**Privileges** | **map[string]bool** | Cumulative privileges base on all roles. | [optional] [default to null]
**Roles** | **[]string** | Roles. | [optional] [default to null]
**State** | [***Tenantuserv3UserState**](tenantuserv3UserState.md) |  | [optional] [default to null]
**TenantId** | **string** | Tenant this user belongs to. | [optional] [default to null]
**Uid** | **string** | Email. | [optional] [default to null]
**UserId** | **string** | Unique id for user. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

