# Reportsrunnerv3RunReportResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]Reportsrunnerv3DataRow**](reportsrunnerv3DataRow.md) | Report data. | [optional] [default to null]
**Facets** | [**[]Reportsrunnerv3FilterHeaders**](reportsrunnerv3FilterHeaders.md) | Facets. | [optional] [default to null]
**FinalResult** | **bool** | Final Result - signifies that the total count&amp;facts are final. When set to false, it means that the results are partial, there are more records but they were not read yet, or the limit was reached. | [optional] [default to null]
**LimitReached** | **bool** | limit_reached - signifies if the query limit reached. When set to true, it means that the limit was reached and there are more records on DB which were not read yet. | [optional] [default to null]
**ReportLayout** | [***Reportsv3ReportDisplayLayout**](reportsv3ReportDisplayLayout.md) |  | [optional] [default to null]
**TotalNumberOfRows** | **int32** | Total Rows Count. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

