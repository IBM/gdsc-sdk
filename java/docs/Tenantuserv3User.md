

# Tenantuserv3User

User has information about a single user typically used in listing and editing users.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationDate** | **OffsetDateTime** | Creation date. |  [optional] |
|**directoryId** | **String** | Which directory did this user come from. |  [optional] |
|**disabled** | **Boolean** | User disabled. |  [optional] |
|**displayName** | **String** | LDAP cn. |  [optional] |
|**distinguishedName** | **String** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). |  [optional] |
|**email** | **String** | The email address of the user for communication. |  [optional] |
|**externalId** | **String** | External id of this user. E.g. ISV id. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata will contain all preferences. |  [optional] |
|**roles** | **List&lt;String&gt;** | Roles. |  [optional] |
|**state** | **Tenantuserv3UserState** |  |  [optional] |
|**uid** | **String** | Email. |  [optional] |
|**userId** | **String** | Unique id for user. |  [optional] |



