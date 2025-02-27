

# Universalconnectormanagerv3ConnectionSummary

Structure for [Universal connector] Connection response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionAlias** | **String** | Connection configuration nickname, set by dev/user (optional). |  [optional] |
|**connectionChanged** | **OffsetDateTime** | Date changed; used to defer tenant status queries immediately after creation. |  [optional] |
|**connectionConfigId** | **String** | Foreign key to the saved connection configuration by the user. |  [optional] |
|**connectionConfigurationNote** | **String** | Datasource configuration note, by plugin developers, intended for user. |  [optional] |
|**connectionFilterAlias** | **String** | Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;). |  [optional] |
|**connectionId** | **String** | Connection configuration id. |  [optional] |
|**connectionInputAlias** | **String** | Connection input plugin alias, like \&quot;Filebeat\&quot;. |  [optional] |
|**connectionRoute** | [**Universalconnectormanagerv3ConnectionRoute**](Universalconnectormanagerv3ConnectionRoute.md) |  |  [optional] |
|**connectionStatus** | [**Universalconnectormanagerv3ConnectionStatus**](Universalconnectormanagerv3ConnectionStatus.md) |  |  [optional] |
|**user** | [**Universalconnectormanagerv3User**](Universalconnectormanagerv3User.md) |  |  [optional] |



