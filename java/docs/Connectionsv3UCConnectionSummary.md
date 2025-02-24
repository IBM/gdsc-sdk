

# Connectionsv3UCConnectionSummary

Structure for [Universal connector] Connection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alias** | **String** | Connection configuration nickname, set by dev/user (optional). |  [optional] |
|**configId** | **String** | Foreign key to the saved connection configuration by the user. |  [optional] |
|**datasourceType** | **String** | Datasource type. |  [optional] |
|**edgeDeploymentServer** | [**Connectionsv3EdgeDeploymentServer**](Connectionsv3EdgeDeploymentServer.md) |  |  [optional] |
|**filterAlias** | **String** | Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;). |  [optional] |
|**host** | **String** | URI where related Universal connector service is running/listening. |  [optional] |
|**inputAlias** | **String** | Connection input plugin alias, like \&quot;Filebeat\&quot;. |  [optional] |
|**lastResponse** | **String** | The heartbeat. |  [optional] |
|**port** | **String** | Port where the related Universal connector service is running/listening. |  [optional] |
|**status** | **Connectionsv3Status** |  |  [optional] |
|**statusText** | **String** | If status is not OK, details what&#39;s wrong (non-localized). |  [optional] |
|**ucConnectionId** | **String** | UC connection id. |  [optional] |



