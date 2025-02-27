

# Guardiumconnectorv3RunGDPReportRequest

Runs specified report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**centralManagerId** | **String** | Central Manager ID. |  [optional] |
|**maxFetchSize** | **Integer** | Maximum number of rows to retrieve if not specified will retrieve the maximum number of rows allowed by GDP for CSV export can&#39;t be larger than the configured maximum number of rows for CSV export on specified central manager. |  [optional] |
|**reportName** | **String** | Name of the report. |  [optional] |
|**reportParameters** | [**List&lt;Guardiumconnectorv3GDPReportParameter&gt;**](Guardiumconnectorv3GDPReportParameter.md) | Report parameters. |  [optional] |
|**sortColumn** | **String** | Column to sort on if not specified returns rows in default sort order of the report. |  [optional] |
|**sortOrder** | **RunGDPReportRequestSortOrder** |  |  [optional] |
|**startFrom** | **Integer** | Result row index to retrieve from if not specified returns results from the beginning. |  [optional] |



