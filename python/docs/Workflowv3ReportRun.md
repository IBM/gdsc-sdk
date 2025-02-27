# Workflowv3ReportRun

Information about the report run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_end** | **datetime** | When the job finished. | [optional] 
**date_start** | **datetime** | When the job started. | [optional] 
**detail** | **str** | Job status detail. | [optional] 
**query_from** | **str** | Absolute value of the runtime parameter for time period (time from). | [optional] 
**query_to** | **str** | Absolute value of the runtime parameter for time period (time to). | [optional] 
**report_filters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  | [optional] 
**report_id** | **str** | Report ID. | [optional] 
**report_name** | **str** | Report name. | [optional] 
**report_result_file_name** | **str** | The report result file name. | [optional] 
**run_id** | **str** | The identifier of the run. | [optional] 
**scheduled_job_id** | **str** | The ScheduledJob identifier. | [optional] 
**scheduled_job_name** | **str** | The ScheduledJob name identifier. | [optional] 
**scheduled_task_id** | **str** | The task within the ScheduledJob. | [optional] 
**scheduled_task_type** | [**Schedulerv3TaskType**](Schedulerv3TaskType.md) |  | [optional] 
**status** | **int** | Job status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_report_run import Workflowv3ReportRun

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3ReportRun from a JSON string
workflowv3_report_run_instance = Workflowv3ReportRun.from_json(json)
# print the JSON string representation of the object
print(Workflowv3ReportRun.to_json())

# convert the object into a dict
workflowv3_report_run_dict = workflowv3_report_run_instance.to_dict()
# create an instance of Workflowv3ReportRun from a dict
workflowv3_report_run_from_dict = Workflowv3ReportRun.from_dict(workflowv3_report_run_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


