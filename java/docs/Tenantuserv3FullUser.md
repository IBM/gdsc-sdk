

# Tenantuserv3FullUser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationDate** | **OffsetDateTime** | Datetime of last access. |  [optional] |
|**directoryId** | **String** | Which directory did this user come from?. |  [optional] |
|**disabled** | **Boolean** | Disabled. |  [optional] |
|**displayName** | **String** | LDAP cn. |  [optional] |
|**distinguishedName** | **String** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). |  [optional] |
|**email** | **String** | The email address of the user for communication. |  [optional] |
|**externalId** | **String** | External id of this user. E.g. ISV id. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata will contain all preferences   --&gt; this will contain all user-specific settings, including session time out. |  [optional] |
|**privileges** | **Map&lt;String, Boolean&gt;** | Cumulative privileges base on all roles. |  [optional] |
|**roles** | **List&lt;String&gt;** | Roles. |  [optional] |
|**state** | **Tenantuserv3UserState** |  |  [optional] |
|**tenantId** | **String** | Tenant this user belongs to. |  [optional] |
|**uid** | **String** | Email. |  [optional] |
|**userId** | **String** | Unique id for user. |  [optional] |



