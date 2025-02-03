# Reportsrunnerv3RunReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CalculateFacets** | **bool** | Whether or not to calculate facets. | [optional] [default to null]
**DateRange** | [***Reportsv3DateRange**](reportsv3DateRange.md) |  | [optional] [default to null]
**DefaultChartExpanded** | **bool** | Optional: if report has chart -send  default_chart_expanded be saved in user settings collection per report and user. | [optional] [default to null]
**FetchSize** | **int32** | The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters. | [optional] [default to null]
**JobType** | [***Reportsrunnerv3JobType**](reportsrunnerv3JobType.md) |  | [optional] [default to null]
**ModelType** | [***Reportsv3ModelType**](reportsv3ModelType.md) |  | [optional] [default to null]
**Offset** | **int32** | The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters. | [optional] [default to null]
**ReportDefinition** | [***Reportsv3ReportDefinition**](reportsv3ReportDefinition.md) |  | [optional] [default to null]
**ReportId** | **string** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | [optional] [default to null]
**RuntimeParameterList** | [**[]Reportsv3RunTimeParameter**](reportsv3RunTimeParameter.md) | List of runtime parameter if needed. | [optional] [default to null]
**TimeZone** | **string** | Optional: time zone. | [optional] [default to null]
**UseQuickFacets** | **bool** | Whether or not to calculate count. | [optional] [default to null]
**WithoutLimit** | **bool** | Whether or not to limit the results. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

