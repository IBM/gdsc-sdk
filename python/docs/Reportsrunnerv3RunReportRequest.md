# Reportsrunnerv3RunReportRequest

RunReportRequest is the argument of RunReport API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculate_facets** | **bool** | Whether or not to calculate facets. | [optional] 
**date_range** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**default_chart_expanded** | **bool** | Optional: if report has chart -send  default_chart_expanded be saved in user settings collection per report and user. | [optional] 
**fetch_size** | **int** | The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters. | [optional] 
**job_type** | [**Reportsrunnerv3JobType**](Reportsrunnerv3JobType.md) |  | [optional] 
**model_type** | [**Reportsv3ModelType**](Reportsv3ModelType.md) |  | [optional] 
**offset** | **int** | The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters. | [optional] 
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 
**report_id** | **str** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | [optional] 
**runtime_parameter_list** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | List of runtime parameter if needed. | [optional] 
**time_zone** | **str** | Optional: time zone. | [optional] 
**use_quick_facets** | **bool** | Whether or not to calculate count. | [optional] 
**without_limit** | **bool** | Whether or not to limit the results. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_run_report_request import Reportsrunnerv3RunReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3RunReportRequest from a JSON string
reportsrunnerv3_run_report_request_instance = Reportsrunnerv3RunReportRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3RunReportRequest.to_json())

# convert the object into a dict
reportsrunnerv3_run_report_request_dict = reportsrunnerv3_run_report_request_instance.to_dict()
# create an instance of Reportsrunnerv3RunReportRequest from a dict
reportsrunnerv3_run_report_request_from_dict = Reportsrunnerv3RunReportRequest.from_dict(reportsrunnerv3_run_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


