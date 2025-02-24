# Datamartprocessorv3DatamartInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CurrentTs** | [**time.Time**](time.Time.md) | Timestamp in UTC when the entry was made. | [optional] [default to null]
**DataType** | **string** | Type of datamart. | [optional] [default to null]
**Error_** | **string** | Errors if any. | [optional] [default to null]
**ExportRecordCount** | **int32** | Total records exported from gdp. | [optional] [default to null]
**ExportStatus** | **int32** | Export status of datamart. | [optional] [default to null]
**FailureFileCount** | **int32** | Total failed files in a datamart. | [optional] [default to null]
**Files** | [**[]Datamartprocessorv3DatamartFileInfo**](datamartprocessorv3DatamartFileInfo.md) | File info inside a datamart. | [optional] [default to null]
**GdpHostname** | **string** | GDP hostname. | [optional] [default to null]
**IngestRecordCount** | **int32** | Total numbers of records ingested for this datamart. | [optional] [default to null]
**IngestStatus** | **int32** | Ingest status of datamart. | [optional] [default to null]
**IngestionId** | **string** | Ingestion id. | [optional] [default to null]
**PeriodEnd** | [**time.Time**](time.Time.md) | Wnding time period of data in datamart. | [optional] [default to null]
**PeriodStart** | [**time.Time**](time.Time.md) | Starting time period of data in datamart. | [optional] [default to null]
**SuccessFileCount** | **int32** | Total successful files in a datamart. | [optional] [default to null]
**TotalFileCount** | **int32** | Total file count inside a datamart. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

