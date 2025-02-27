

# Reportsv3ReportDefinition

ReportDefinition encapsulates all data necessary for a report object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categoryId** | **String** | Unique category ID. |  [optional] |
|**creationTime** | **OffsetDateTime** | The report&#39;s cration time in format YYYY-MM-DDTHH:mm:ss.sssZ. |  [optional] |
|**creatorUserId** | **String** | An identifier for the creator of the report. |  [optional] |
|**dateRange** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  |  [optional] |
|**defaultTimestampHeaderId** | **String** | The default timestamp header id. |  [optional] |
|**isAuditable** | **Boolean** | If a report is auditable. |  [optional] |
|**isHidden** | **Boolean** | The is hidden true when report should be showed to the user. |  [optional] |
|**isPinned** | **Boolean** | Is pinned report. |  [optional] |
|**isPredefined** | **Boolean** | If a report is predefined. |  [optional] |
|**refreshRate** | **Integer** | Report refresh rate. |  [optional] |
|**reportDescription** | **String** | Report description. |  [optional] |
|**reportFilters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  |  [optional] |
|**reportHeaders** | [**List&lt;Reportsv3ReportHeader&gt;**](Reportsv3ReportHeader.md) | Selected headers for the report. |  [optional] |
|**reportId** | **String** | The report ID. |  [optional] |
|**reportName** | **String** | Report name. |  [optional] |
|**reportTags** | [**List&lt;Reportsv3ReportTag&gt;**](Reportsv3ReportTag.md) | Report tags. |  [optional] |
|**runtimeParameters** | [**List&lt;Reportsv3RunTimeParameter&gt;**](Reportsv3RunTimeParameter.md) | Report runtime parameters. |  [optional] |
|**selectedTimestampHeaderId** | **String** | The selected timestamp header id- in case the user override the default. |  [optional] |
|**shouldAddCount** | **Boolean** | Add \&quot;count\&quot; statement or not. |  [optional] |
|**shouldAddDistinct** | **Boolean** | Add \&quot;distinct\&quot; statement or not. |  [optional] |
|**sqlLastVersion** | **String** | SQL Last Version -  Last version of GI when the query was generated. |  [optional] |
|**tableJoinOptimization** | **String** | optional : table join optimization - optimized the join operation to enhance the performance. the value can be empty, false or true. if the value is empty then the global setting will be used. |  [optional] |
|**usePipelineQueries** | **String** | Optional: disable or enable the pipeline queries the value can be empty, false or true. if the value is empty then the global setting will be used. |  [optional] |



