# Connectionsv3UcConnectionSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alias** | **string** | Connection configuration nickname, set by dev/user (optional). | [optional] [default to null]
**ConfigId** | **string** | Foreign key to the saved connection configuration by the user. | [optional] [default to null]
**DatasourceType** | **string** | Datasource type. | [optional] [default to null]
**EdgeDeploymentServer** | [***Connectionsv3EdgeDeploymentServer**](connectionsv3EdgeDeploymentServer.md) |  | [optional] [default to null]
**FilterAlias** | **string** | Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;). | [optional] [default to null]
**Host** | **string** | URI where related Universal connector service is running/listening. | [optional] [default to null]
**InputAlias** | **string** | Connection input plugin alias, like \&quot;Filebeat\&quot;. | [optional] [default to null]
**LastResponse** | **string** | The heartbeat. | [optional] [default to null]
**Port** | **string** | Port where the related Universal connector service is running/listening. | [optional] [default to null]
**Status** | [***Connectionsv3Status**](connectionsv3Status.md) |  | [optional] [default to null]
**StatusText** | **string** | If status is not OK, details what&#x27;s wrong (non-localized). | [optional] [default to null]
**UcConnectionId** | **string** | UC connection id. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

