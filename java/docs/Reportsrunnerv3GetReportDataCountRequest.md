

# Reportsrunnerv3GetReportDataCountRequest

GetReportDataCountRequest is the argument get count.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateRange** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  |  [optional] |
|**modelType** | **Reportsv3ModelType** |  |  [optional] |
|**queryId** | **String** | Optional: query_id is used to uniquely identify a query. It can be later used to stop the same query. |  [optional] |
|**reportDefinition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  |  [optional] |
|**reportId** | **String** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). |  [optional] |
|**runtimeParameterList** | [**List&lt;Reportsv3RunTimeParameter&gt;**](Reportsv3RunTimeParameter.md) | List of runtime parameter if needed. |  [optional] |
|**timeZone** | **String** | Optional: time zone. |  [optional] |



