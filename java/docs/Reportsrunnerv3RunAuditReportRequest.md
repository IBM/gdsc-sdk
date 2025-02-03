

# Reportsrunnerv3RunAuditReportRequest

RunAuditReportRequest is the argument of RunAuditReport API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fetchSize** | **Integer** | The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters. |  [optional] |
|**headerName** | **String** | The header name. |  [optional] |
|**jobId** | **String** | Unique token identifying the export job. |  [optional] |
|**offset** | **Integer** | The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters. |  [optional] |
|**orderBy** | **Reportsv3OrderBy** |  |  [optional] |
|**reportFilters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  |  [optional] |
|**reportId** | **String** | The ID of the Report we wish to run (e.g. 000000000000000000000905). |  [optional] |
|**schemaName** | **String** | The schema name to organize report task temp tables. |  [optional] |
|**tableName** | **String** | The table name to save report task data(task_id). |  [optional] |
|**withoutLimit** | **Boolean** | Whether or not to limit the results. |  [optional] |



