

# Datamartprocessorv3DatamartFileInfo

File object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **String** | Errors if any. |  [optional] |
|**failedState** | **Boolean** | If the file is in failed state, usually means failed permanently. |  [optional] |
|**fileName** | **String** | Filename. |  [optional] |
|**fileStatus** | **Integer** | Status of the file. |  [optional] |
|**ingestRecordCount** | **Integer** | Total numbers of records ingested for this file in Insights. |  [optional] |
|**retryCount** | **Integer** | Total number of times file has been retried. |  [optional] |
|**retryEndTime** | **OffsetDateTime** | End time of last retry attempt. |  [optional] |
|**retryStartTime** | **OffsetDateTime** | Start time of last retry attempt. |  [optional] |



