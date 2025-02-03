# Reportsrunnerv3GetAuditDataCountRequest

GetReportAuditCountRequest is the argument get audit report task count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** | Unique token identifying the export job. | [optional] 
**report_filters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  | [optional] 
**report_id** | **str** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | [optional] 
**schema_name** | **str** | The schema name to organize report task temp tables. | [optional] 
**table_name** | **str** | The table name to save report task data(task_id). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_audit_data_count_request import Reportsrunnerv3GetAuditDataCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetAuditDataCountRequest from a JSON string
reportsrunnerv3_get_audit_data_count_request_instance = Reportsrunnerv3GetAuditDataCountRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetAuditDataCountRequest.to_json())

# convert the object into a dict
reportsrunnerv3_get_audit_data_count_request_dict = reportsrunnerv3_get_audit_data_count_request_instance.to_dict()
# create an instance of Reportsrunnerv3GetAuditDataCountRequest from a dict
reportsrunnerv3_get_audit_data_count_request_from_dict = Reportsrunnerv3GetAuditDataCountRequest.from_dict(reportsrunnerv3_get_audit_data_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


