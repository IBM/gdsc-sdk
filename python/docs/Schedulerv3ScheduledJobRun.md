# Schedulerv3ScheduledJobRun


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collection_id** | **str** |  | [optional] 
**end_time** | **datetime** |  | [optional] 
**job_id** | **str** |  | [optional] 
**previous_job_id** | **str** |  | [optional] 
**query_from** | **str** |  | [optional] 
**query_to** | **str** |  | [optional] 
**queue_time** | **datetime** |  | [optional] 
**run_detail** | **str** |  | [optional] 
**schedule_id** | **str** |  | [optional] 
**start_time** | **datetime** |  | [optional] 
**status** | [**Schedulerv3ExecutionStatus**](Schedulerv3ExecutionStatus.md) |  | [optional] 
**task_id** | **str** |  | [optional] 
**task_name** | **str** |  | [optional] 
**task_type** | [**Schedulerv3TaskType**](Schedulerv3TaskType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_scheduled_job_run import Schedulerv3ScheduledJobRun

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ScheduledJobRun from a JSON string
schedulerv3_scheduled_job_run_instance = Schedulerv3ScheduledJobRun.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ScheduledJobRun.to_json())

# convert the object into a dict
schedulerv3_scheduled_job_run_dict = schedulerv3_scheduled_job_run_instance.to_dict()
# create an instance of Schedulerv3ScheduledJobRun from a dict
schedulerv3_scheduled_job_run_from_dict = Schedulerv3ScheduledJobRun.from_dict(schedulerv3_scheduled_job_run_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


