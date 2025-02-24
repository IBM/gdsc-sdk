# Reportsrunnerv3StopExportReportJobResponse

StopExportReportJobResponse is the return type of StopExportReportJob API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_file_name** | **str** | Export file name. | [optional] 
**job_id** | **str** | Token that identifies the export job. | [optional] 
**job_status** | [**Reportsrunnerv3ExportJobStatus**](Reportsrunnerv3ExportJobStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_stop_export_report_job_response import Reportsrunnerv3StopExportReportJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3StopExportReportJobResponse from a JSON string
reportsrunnerv3_stop_export_report_job_response_instance = Reportsrunnerv3StopExportReportJobResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3StopExportReportJobResponse.to_json())

# convert the object into a dict
reportsrunnerv3_stop_export_report_job_response_dict = reportsrunnerv3_stop_export_report_job_response_instance.to_dict()
# create an instance of Reportsrunnerv3StopExportReportJobResponse from a dict
reportsrunnerv3_stop_export_report_job_response_from_dict = Reportsrunnerv3StopExportReportJobResponse.from_dict(reportsrunnerv3_stop_export_report_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


