# Guardiumconnectorv3RunGdpReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CentralManagerId** | **string** | Central Manager ID. | [optional] [default to null]
**MaxFetchSize** | **int32** | Maximum number of rows to retrieve if not specified will retrieve the maximum number of rows allowed by GDP for CSV export can&#x27;t be larger than the configured maximum number of rows for CSV export on specified central manager. | [optional] [default to null]
**ReportName** | **string** | Name of the report. | [optional] [default to null]
**ReportParameters** | [**[]Guardiumconnectorv3GdpReportParameter**](guardiumconnectorv3GDPReportParameter.md) | Report parameters. | [optional] [default to null]
**SortColumn** | **string** | Column to sort on if not specified returns rows in default sort order of the report. | [optional] [default to null]
**SortOrder** | [***RunGdpReportRequestSortOrder**](RunGDPReportRequestSortOrder.md) |  | [optional] [default to null]
**StartFrom** | **int32** | Result row index to retrieve from if not specified returns results from the beginning. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

