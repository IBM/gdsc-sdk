# Reportsrunnerv3RunAuditReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FetchSize** | **int32** | The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters. | [optional] [default to null]
**HeaderName** | **string** | The header name. | [optional] [default to null]
**JobId** | **string** | Unique token identifying the export job. | [optional] [default to null]
**Offset** | **int32** | The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters. | [optional] [default to null]
**OrderBy** | [***Reportsv3OrderBy**](reportsv3OrderBy.md) |  | [optional] [default to null]
**ReportFilters** | [***Reportsv3ReportFilterBrackets**](reportsv3ReportFilterBrackets.md) |  | [optional] [default to null]
**ReportId** | **string** | The ID of the Report we wish to run (e.g. 000000000000000000000905). | [optional] [default to null]
**SchemaName** | **string** | The schema name to organize report task temp tables. | [optional] [default to null]
**TableName** | **string** | The table name to save report task data(task_id). | [optional] [default to null]
**WithoutLimit** | **bool** | Whether or not to limit the results. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

