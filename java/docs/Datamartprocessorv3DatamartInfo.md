

# Datamartprocessorv3DatamartInfo

DatamartInfo is the object containing all info of a datamart.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentTs** | **OffsetDateTime** | Timestamp in UTC when the entry was made. |  [optional] |
|**dataType** | **String** | Type of datamart. |  [optional] |
|**error** | **String** | Errors if any. |  [optional] |
|**exportRecordCount** | **Integer** | Total records exported from GDP. |  [optional] |
|**exportStatus** | **Integer** | Export status of datamart. |  [optional] |
|**failureFileCount** | **Integer** | Total failed files in a datamart. |  [optional] |
|**files** | [**List&lt;Datamartprocessorv3DatamartFileInfo&gt;**](Datamartprocessorv3DatamartFileInfo.md) | File info inside a datamart. |  [optional] |
|**gdpHostname** | **String** | GDP hostname. |  [optional] |
|**ingestRecordCount** | **Integer** | Total numbers of records ingested for this datamart. |  [optional] |
|**ingestStatus** | **Integer** | Ingest status of datamart. |  [optional] |
|**ingestionId** | **String** | Ingestion id. |  [optional] |
|**periodEnd** | **OffsetDateTime** | Wnding time period of data in datamart. |  [optional] |
|**periodStart** | **OffsetDateTime** | Starting time period of data in datamart. |  [optional] |
|**successFileCount** | **Integer** | Total successful files in a datamart. |  [optional] |
|**totalFileCount** | **Integer** | Total file count inside a datamart. |  [optional] |



