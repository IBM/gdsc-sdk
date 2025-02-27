# Reportsv3RunReportResponse

RunReportResponse is the return type of the RunReportByID(), RunImmediateReport() and Transpose() apis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[Reportsv3ReportResult]**](Reportsv3ReportResult.md) | Report data. | [optional] 
**facets** | [**List[Reportsv3FilterHeaders]**](Reportsv3FilterHeaders.md) | Facets. | [optional] 
**report_layout** | [**Reportsv3ReportDisplayLayout**](Reportsv3ReportDisplayLayout.md) |  | [optional] 
**total_number_of_rows** | **int** | Total Rows Count. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_run_report_response import Reportsv3RunReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3RunReportResponse from a JSON string
reportsv3_run_report_response_instance = Reportsv3RunReportResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3RunReportResponse.to_json())

# convert the object into a dict
reportsv3_run_report_response_dict = reportsv3_run_report_response_instance.to_dict()
# create an instance of Reportsv3RunReportResponse from a dict
reportsv3_run_report_response_from_dict = Reportsv3RunReportResponse.from_dict(reportsv3_run_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


