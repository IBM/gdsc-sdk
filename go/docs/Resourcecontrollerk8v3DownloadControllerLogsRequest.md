# Resourcecontrollerk8v3DownloadControllerLogsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ControllerId** | **string** | The ID of the controller to download logs for. | [optional] [default to null]
**EndDate** | **string** | The end date (ms since epoch) to limit logs to. | [optional] [default to null]
**Identifier** | **string** | An optional identifier to use for the request. This will set a cookie named download-logs-&lt;identifier&gt; with a value containing the result of the download request. Valid values are failed, timeout, success. | [optional] [default to null]
**Previous** | **bool** | True if the logs for the previous container instance should be retrieved, false otherwise. | [optional] [default to null]
**StartDate** | **string** | The start date (ms since epoch) to limit logs to. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

