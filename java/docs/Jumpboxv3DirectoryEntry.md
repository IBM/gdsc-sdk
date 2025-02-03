

# Jumpboxv3DirectoryEntry

DirectoryEntry message for ICP directory search result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directoryId** | **String** | Which directory did this user come from. |  [optional] |
|**displayName** | **String** | LDAP cn. |  [optional] |
|**distinguishedName** | **String** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata will contain extra attributes returned from LDAP search. |  [optional] |



