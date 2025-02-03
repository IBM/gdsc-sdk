# Reportsrunnerv3RunReportResponse

RunReportResponse is the return type of RunReport API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[Reportsrunnerv3DataRow]**](Reportsrunnerv3DataRow.md) | Report data. | [optional] 
**facets** | [**List[Reportsrunnerv3FilterHeaders]**](Reportsrunnerv3FilterHeaders.md) | Facets. | [optional] 
**final_result** | **bool** | Final Result - signifies that the total count&amp;facts are final. When set to false, it means that the results are partial, there are more records but they were not read yet, or the limit was reached. | [optional] 
**limit_reached** | **bool** | limit_reached - signifies if the query limit reached. When set to true, it means that the limit was reached and there are more records on DB which were not read yet. | [optional] 
**report_layout** | [**Reportsv3ReportDisplayLayout**](Reportsv3ReportDisplayLayout.md) |  | [optional] 
**total_number_of_rows** | **int** | Total Rows Count. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_run_report_response import Reportsrunnerv3RunReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3RunReportResponse from a JSON string
reportsrunnerv3_run_report_response_instance = Reportsrunnerv3RunReportResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3RunReportResponse.to_json())

# convert the object into a dict
reportsrunnerv3_run_report_response_dict = reportsrunnerv3_run_report_response_instance.to_dict()
# create an instance of Reportsrunnerv3RunReportResponse from a dict
reportsrunnerv3_run_report_response_from_dict = Reportsrunnerv3RunReportResponse.from_dict(reportsrunnerv3_run_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


