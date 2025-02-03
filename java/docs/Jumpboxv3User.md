

# Jumpboxv3User

User has information about a single user typically used in listing and editing users.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationDate** | **OffsetDateTime** | Creation date. |  [optional] |
|**directoryId** | **String** | Which directory did this user come from. |  [optional] |
|**disabled** | **Boolean** | User disabled. |  [optional] |
|**displayName** | **String** | LDAP cn. |  [optional] |
|**distinguishedName** | **String** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). |  [optional] |
|**email** | **String** | Email address of the user. |  [optional] |
|**externalId** | **String** | External id of the user. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata will contain all preferences. |  [optional] |
|**roles** | **List&lt;String&gt;** | Roles. |  [optional] |
|**state** | **Jumpboxv3UserState** |  |  [optional] |
|**uid** | **String** | Email. |  [optional] |
|**userId** | **String** | Unique id for user. |  [optional] |



