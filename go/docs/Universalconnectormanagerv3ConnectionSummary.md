# Universalconnectormanagerv3ConnectionSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConnectionAlias** | **string** | Connection configuration nickname, set by dev/user (optional). | [optional] [default to null]
**ConnectionChanged** | [**time.Time**](time.Time.md) | Date changed; used to defer tenant status queries immediately after creation. | [optional] [default to null]
**ConnectionConfigId** | **string** | Foreign key to the saved connection configuration by the user. | [optional] [default to null]
**ConnectionConfigurationNote** | **string** | Datasource configuration note, by plugin developers, intended for user. | [optional] [default to null]
**ConnectionFilterAlias** | **string** | Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;). | [optional] [default to null]
**ConnectionId** | **string** | Connection configuration id. | [optional] [default to null]
**ConnectionInputAlias** | **string** | Connection input plugin alias, like \&quot;Filebeat\&quot;. | [optional] [default to null]
**ConnectionRoute** | [***Universalconnectormanagerv3ConnectionRoute**](universalconnectormanagerv3ConnectionRoute.md) |  | [optional] [default to null]
**ConnectionStatus** | [***Universalconnectormanagerv3ConnectionStatus**](universalconnectormanagerv3ConnectionStatus.md) |  | [optional] [default to null]
**User** | [***Universalconnectormanagerv3User**](universalconnectormanagerv3User.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

