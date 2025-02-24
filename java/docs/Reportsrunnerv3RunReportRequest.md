

# Reportsrunnerv3RunReportRequest

RunReportRequest is the argument of RunReport API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calculateFacets** | **Boolean** | Whether or not to calculate facets. |  [optional] |
|**dateRange** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  |  [optional] |
|**defaultChartExpanded** | **Boolean** | Optional: if report has chart -send  default_chart_expanded be saved in user settings collection per report and user. |  [optional] |
|**fetchSize** | **Integer** | The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters. |  [optional] |
|**jobType** | **Reportsrunnerv3JobType** |  |  [optional] |
|**modelType** | **Reportsv3ModelType** |  |  [optional] |
|**offset** | **Integer** | The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters. |  [optional] |
|**queryId** | **String** | Optional: query_id is used to uniquely identify a query. It can be later used to stop the same query. |  [optional] |
|**reportDefinition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  |  [optional] |
|**reportId** | **String** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). |  [optional] |
|**runtimeParameterList** | [**List&lt;Reportsv3RunTimeParameter&gt;**](Reportsv3RunTimeParameter.md) | List of runtime parameter if needed. |  [optional] |
|**timeZone** | **String** | Optional: time zone. |  [optional] |
|**useQuickFacets** | **Boolean** | Whether or not to calculate count. |  [optional] |
|**withoutLimit** | **Boolean** | Whether or not to limit the results. |  [optional] |



