

# Tenantuserv3Tenant

Tenant contains id, name, and settings for the specified tenant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationDate** | **OffsetDateTime** | Date tenant was activated. |  [optional] |
|**externalId** | **String** | Extrenal id. |  [optional] |
|**externalMetadata** | [**Map&lt;String, Tenantuserv3ExternalMetadata&gt;**](Tenantuserv3ExternalMetadata.md) | External metadata. |  [optional] |
|**isInactive** | **Boolean** | Whether or not the tenant is disabled. |  [optional] |
|**isReady** | **Boolean** | Boolean is ready. |  [optional] |
|**name** | **String** |  |  [optional] |
|**partNumber** | **String** | Part number. |  [optional] |
|**settings** | **Map&lt;String, String&gt;** | Settings pertaining to all users of this tenant. |  [optional] |
|**status** | **String** |  |  [optional] |
|**tenantCapabilities** | **Map&lt;String, Boolean&gt;** |  |  [optional] |
|**tenantId** | **String** | The unique id for the tenant object. |  [optional] |
|**uid** | **String** | Email. |  [optional] |



