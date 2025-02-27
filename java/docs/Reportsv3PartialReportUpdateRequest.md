

# Reportsv3PartialReportUpdateRequest

UpdatePartialReportRequest is the argument type used to update a report with partial information using the UpdatePartialReport() api.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultChartExpanded** | **Boolean** | The default_chart_expanded is a flag taken from the user settings collection per report and user. |  [optional] |
|**isHidden** | **Boolean** | Flag to determine weather the report is hidden or not. |  [optional] |
|**isPinned** | **Boolean** | Flag to determine weather the report is pinned or not. |  [optional] |
|**reportDescription** | **String** | The report description. |  [optional] |
|**reportId** | **String** | Unique Report ID. |  [optional] |
|**reportName** | **String** | The report name. |  [optional] |
|**reportTags** | [**List&lt;Reportsv3ReportTag&gt;**](Reportsv3ReportTag.md) | The report tags. |  [optional] |
|**updateMask** | [**ProtobufFieldMask**](ProtobufFieldMask.md) |  |  [optional] |



