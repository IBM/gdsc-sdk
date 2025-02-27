

# Universalconnectormanagerv3ConnectorSummary

Part of GetConnectors response. Contains details about a Universal connector connection configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**combinedConfiguration** | **String** | Connector configuration parameters. A union of Input and Filter parameters. |  [optional] |
|**combinedConfigurationStrings** | **String** | Connector configuration parameters strings, for UI. |  [optional] |
|**connectorName** | **String** | ID of connector. |  [optional] |
|**developer** | **String** | The developer who developed the manifest. |  [optional] |
|**filterPlugin** | [**Universalconnectormanagerv3PluginDefinition**](Universalconnectormanagerv3PluginDefinition.md) |  |  [optional] |
|**filterPluginName** | **String** | ID of filter plugin. |  [optional] |
|**inputPlugin** | [**Universalconnectormanagerv3PluginDefinition**](Universalconnectormanagerv3PluginDefinition.md) |  |  [optional] |
|**inputPluginName** | **String** | ID of input plugin. |  [optional] |
|**supportedDatasources** | [**List&lt;Universalconnectormanagerv3DatasourceType&gt;**](Universalconnectormanagerv3DatasourceType.md) | Supported data source types, according to the Filter plugin. |  [optional] |
|**supportedPlatforms** | **List&lt;String&gt;** | Array of supported platforms/environments. Examples: \&quot;on-premise\&quot;, \&quot;AWS\&quot;, \&quot;Azure\&quot;, \&quot;GCP\&quot;. |  [optional] |
|**uploadDate** | **OffsetDateTime** | Date connector manifest was uploaded. |  [optional] |
|**uploadUser** | **String** | User who uploaded the manifest. |  [optional] |



