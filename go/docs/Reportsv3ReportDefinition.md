# Reportsv3ReportDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | **string** | Unique category ID. | [optional] [default to null]
**CreationTime** | [**time.Time**](time.Time.md) | The report&#x27;s cration time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] [default to null]
**CreatorUserId** | **string** | An identifier for the creator of the report. | [optional] [default to null]
**DateRange** | [***Reportsv3DateRange**](reportsv3DateRange.md) |  | [optional] [default to null]
**DefaultTimestampHeaderId** | **string** | The default timestamp header id. | [optional] [default to null]
**IsAuditable** | **bool** | If a report is auditable. | [optional] [default to null]
**IsHidden** | **bool** | The is hidden true when report should be showed to the user. | [optional] [default to null]
**IsPinned** | **bool** | Is pinned report. | [optional] [default to null]
**IsPredefined** | **bool** | If a report is predefined. | [optional] [default to null]
**RefreshRate** | **int32** | Report refresh rate. | [optional] [default to null]
**ReportDescription** | **string** | Report description. | [optional] [default to null]
**ReportFilters** | [***Reportsv3ReportFilterBrackets**](reportsv3ReportFilterBrackets.md) |  | [optional] [default to null]
**ReportHeaders** | [**[]Reportsv3ReportHeader**](reportsv3ReportHeader.md) | Selected headers for the report. | [optional] [default to null]
**ReportId** | **string** | The report ID. | [optional] [default to null]
**ReportName** | **string** | Report name. | [optional] [default to null]
**ReportTags** | [**[]Reportsv3ReportTag**](reportsv3ReportTag.md) | Report tags. | [optional] [default to null]
**RuntimeParameters** | [**[]Reportsv3RunTimeParameter**](reportsv3RunTimeParameter.md) | Report runtime parameters. | [optional] [default to null]
**SelectedTimestampHeaderId** | **string** | The selected timestamp header id- in case the user override the default. | [optional] [default to null]
**ShouldAddCount** | **bool** | Add \&quot;count\&quot; statement or not. | [optional] [default to null]
**ShouldAddDistinct** | **bool** | Add \&quot;distinct\&quot; statement or not. | [optional] [default to null]
**SqlLastVersion** | **string** | SQL Last Version -  Last version of GI when the query was generated. | [optional] [default to null]
**TableJoinOptimization** | **string** | optional : table join optimization - optimized the join operation to enhance the performance. the value can be empty, false or true. if the value is empty then the global setting will be used. | [optional] [default to null]
**UsePipelineQueries** | **string** | Optional: disable or enable the pipeline queries the value can be empty, false or true. if the value is empty then the global setting will be used. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

