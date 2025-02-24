# Schedulerv3ScheduledJob

ScheduledJob holds the configurations for running and delivering a job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **datetime** | Optional: Timestamp when the scheduled job is created. | [optional] 
**description** | **str** | Optional: Description for the scheduledJob. | [optional] 
**enabled** | **bool** | Enabled or disable the schedule. | [optional] 
**expired** | **bool** | Optional: If this schedule is expired or continues forever. | [optional] 
**instructions** | **str** | Optional: Instructions for the recipient. | [optional] 
**internal_audit** | [**Schedulerv3AuditType**](Schedulerv3AuditType.md) |  | [optional] 
**last_modified_time** | **datetime** | Optional: Timestamp for the last modified time. | [optional] 
**name** | **str** | Schedule name. | [optional] 
**next_run** | **datetime** | Optional: Timestamp for the next jobrun. | [optional] 
**notification** | [**Schedulerv3NotificationType**](Schedulerv3NotificationType.md) |  | [optional] 
**origin** | **str** | Where does the schedule come from, ie the micro service name , REPORTS or SCHEDULER. | [optional] 
**previous_run** | **datetime** | Optional: Timestamp for the previous job run. | [optional] 
**recipient** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  | [optional] 
**recipients** | [**List[Schedulerv3Recipient]**](Schedulerv3Recipient.md) |  | [optional] 
**retention** | [**Schedulerv3Retention**](Schedulerv3Retention.md) |  | [optional] 
**schedule_id** | **str** | Optional: ID for this record. It is automatically created by the database. | [optional] 
**scheduler** | [**Schedulerv3Scheduler**](Schedulerv3Scheduler.md) |  | [optional] 
**tags** | **List[str]** | Optional: Tags to use. | [optional] 
**tasks** | [**List[Schedulerv3ScheduledTask]**](Schedulerv3ScheduledTask.md) | What to run. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_job import Schedulerv3ScheduledJob

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ScheduledJob from a JSON string
schedulerv3_scheduled_job_instance = Schedulerv3ScheduledJob.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ScheduledJob.to_json())

# convert the object into a dict
schedulerv3_scheduled_job_dict = schedulerv3_scheduled_job_instance.to_dict()
# create an instance of Schedulerv3ScheduledJob from a dict
schedulerv3_scheduled_job_from_dict = Schedulerv3ScheduledJob.from_dict(schedulerv3_scheduled_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


