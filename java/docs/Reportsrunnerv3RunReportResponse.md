

# Reportsrunnerv3RunReportResponse

RunReportResponse is the return type of RunReport API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;Reportsrunnerv3DataRow&gt;**](Reportsrunnerv3DataRow.md) | Report data. |  [optional] |
|**facets** | [**List&lt;Reportsrunnerv3FilterHeaders&gt;**](Reportsrunnerv3FilterHeaders.md) | Facets. |  [optional] |
|**finalResult** | **Boolean** | Final Result - signifies that the total count&amp;facts are final. When set to false, it means that the results are partial, there are more records but they were not read yet, or the limit was reached. |  [optional] |
|**limitReached** | **Boolean** | limit_reached - signifies if the query limit reached. When set to true, it means that the limit was reached and there are more records on DB which were not read yet. |  [optional] |
|**reportLayout** | [**Reportsv3ReportDisplayLayout**](Reportsv3ReportDisplayLayout.md) |  |  [optional] |
|**totalNumberOfRows** | **Integer** | Total Rows Count. |  [optional] |



