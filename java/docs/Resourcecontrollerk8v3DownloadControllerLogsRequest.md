

# Resourcecontrollerk8v3DownloadControllerLogsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**controllerId** | **String** | The ID of the controller to download logs for. |  [optional] |
|**endDate** | **String** | The end date (ms since epoch) to limit logs to. |  [optional] |
|**identifier** | **String** | An optional identifier to use for the request. This will set a cookie named download-logs-&lt;identifier&gt; with a value containing the result of the download request. Valid values are failed, timeout, success. |  [optional] |
|**previous** | **Boolean** | True if the logs for the previous container instance should be retrieved, false otherwise. |  [optional] |
|**startDate** | **String** | The start date (ms since epoch) to limit logs to. |  [optional] |



