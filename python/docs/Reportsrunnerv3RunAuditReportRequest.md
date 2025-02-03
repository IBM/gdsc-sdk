# Reportsrunnerv3RunAuditReportRequest

RunAuditReportRequest is the argument of RunAuditReport API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fetch_size** | **int** | The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters. | [optional] 
**header_name** | **str** | The header name. | [optional] 
**job_id** | **str** | Unique token identifying the export job. | [optional] 
**offset** | **int** | The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters. | [optional] 
**order_by** | [**Reportsv3OrderBy**](Reportsv3OrderBy.md) |  | [optional] 
**report_filters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  | [optional] 
**report_id** | **str** | The ID of the Report we wish to run (e.g. 000000000000000000000905). | [optional] 
**schema_name** | **str** | The schema name to organize report task temp tables. | [optional] 
**table_name** | **str** | The table name to save report task data(task_id). | [optional] 
**without_limit** | **bool** | Whether or not to limit the results. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_run_audit_report_request import Reportsrunnerv3RunAuditReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3RunAuditReportRequest from a JSON string
reportsrunnerv3_run_audit_report_request_instance = Reportsrunnerv3RunAuditReportRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3RunAuditReportRequest.to_json())

# convert the object into a dict
reportsrunnerv3_run_audit_report_request_dict = reportsrunnerv3_run_audit_report_request_instance.to_dict()
# create an instance of Reportsrunnerv3RunAuditReportRequest from a dict
reportsrunnerv3_run_audit_report_request_from_dict = Reportsrunnerv3RunAuditReportRequest.from_dict(reportsrunnerv3_run_audit_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


