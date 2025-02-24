# Jumpboxv3User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivationDate** | [**time.Time**](time.Time.md) | Creation date. | [optional] [default to null]
**DirectoryId** | **string** | Which directory did this user come from. | [optional] [default to null]
**Disabled** | **bool** | User disabled. | [optional] [default to null]
**DisplayName** | **string** | LDAP cn. | [optional] [default to null]
**DistinguishedName** | **string** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). | [optional] [default to null]
**Email** | **string** | Email address of the user. | [optional] [default to null]
**ExternalId** | **string** | External id of the user. | [optional] [default to null]
**Metadata** | **map[string]string** | Metadata will contain all preferences. | [optional] [default to null]
**Roles** | **[]string** | Roles. | [optional] [default to null]
**State** | [***Jumpboxv3UserState**](jumpboxv3UserState.md) |  | [optional] [default to null]
**Uid** | **string** | Email. | [optional] [default to null]
**UserId** | **string** | Unique id for user. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

