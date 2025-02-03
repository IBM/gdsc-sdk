# Jumpboxv3DirectoryEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DirectoryId** | **string** | Which directory did this user come from. | [optional] [default to null]
**DisplayName** | **string** | LDAP cn. | [optional] [default to null]
**DistinguishedName** | **string** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). | [optional] [default to null]
**Metadata** | **map[string]string** | Metadata will contain extra attributes returned from LDAP search. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

