# Universalconnectormanagerv3ConnectorSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CombinedConfiguration** | **string** | Connector configuration parameters. A union of Input and Filter parameters. | [optional] [default to null]
**CombinedConfigurationStrings** | **string** | Connector configuration parameters strings, for UI. | [optional] [default to null]
**ConnectorName** | **string** | ID of connector. | [optional] [default to null]
**Developer** | **string** | The developer who developed the manifest. | [optional] [default to null]
**FilterPlugin** | [***Universalconnectormanagerv3PluginDefinition**](universalconnectormanagerv3PluginDefinition.md) |  | [optional] [default to null]
**FilterPluginName** | **string** | ID of filter plugin. | [optional] [default to null]
**InputPlugin** | [***Universalconnectormanagerv3PluginDefinition**](universalconnectormanagerv3PluginDefinition.md) |  | [optional] [default to null]
**InputPluginName** | **string** | ID of input plugin. | [optional] [default to null]
**SupportedDatasources** | [**[]Universalconnectormanagerv3DatasourceType**](universalconnectormanagerv3DatasourceType.md) | Supported data source types, according to the Filter plugin. | [optional] [default to null]
**SupportedPlatforms** | **[]string** | Array of supported platforms/environments. Examples: \&quot;on-premise\&quot;, \&quot;AWS\&quot;, \&quot;Azure\&quot;, \&quot;GCP\&quot;. | [optional] [default to null]
**UploadDate** | [**time.Time**](time.Time.md) | Date connector manifest was uploaded. | [optional] [default to null]
**UploadUser** | **string** | User who uploaded the manifest. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

