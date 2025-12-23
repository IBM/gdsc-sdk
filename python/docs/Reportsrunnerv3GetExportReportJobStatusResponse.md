# Reportsrunnerv3GetExportReportJobStatusResponse

GetExportReportJobStatusResponse is the return type of GetExportReportStatus API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**call_status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**file_name** | **str** | File name. | [optional] 
**job_duration** | **int** | Duration of the export job in minutes. | [optional] 
**job_id** | **str** | Token that identifies the export job. | [optional] 
**job_start_time** | **str** | The start time of the export job. | [optional] 
**job_status** | [**Reportsrunnerv3ExportJobStatus**](Reportsrunnerv3ExportJobStatus.md) |  | [optional] [default to Reportsrunnerv3ExportJobStatus.UNDEFINED_JOB_STATUS]
**message** | **str** | An error message in case of failure while retriving the export job status. | [optional] 
**result_size** | **int** | The size of the exported file in MB. | [optional] 
**tenant_id** | **str** | The unique tenant ID that the executing job is running against. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_export_report_job_status_response import Reportsrunnerv3GetExportReportJobStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetExportReportJobStatusResponse from a JSON string
reportsrunnerv3_get_export_report_job_status_response_instance = Reportsrunnerv3GetExportReportJobStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetExportReportJobStatusResponse.to_json())

# convert the object into a dict
reportsrunnerv3_get_export_report_job_status_response_dict = reportsrunnerv3_get_export_report_job_status_response_instance.to_dict()
# create an instance of Reportsrunnerv3GetExportReportJobStatusResponse from a dict
reportsrunnerv3_get_export_report_job_status_response_from_dict = Reportsrunnerv3GetExportReportJobStatusResponse.from_dict(reportsrunnerv3_get_export_report_job_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


