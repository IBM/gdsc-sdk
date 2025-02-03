# Schedulerv3ScheduledJobSummary

ScheduledJobSummary returns enough details for list view.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **datetime** | Optional: Timestamp when the scheduled job was created. | [optional] 
**description** | **str** | Optional: Description for the scheduledJob. | [optional] 
**enabled** | **bool** | Enabled or disable the schedule. | [optional] 
**expired** | **bool** | Optional: If this schedule is expired or continues forever. | [optional] 
**frequency** | [**Schedulerv3Frequency**](Schedulerv3Frequency.md) |  | [optional] 
**last_modified_time** | **datetime** | Optional: Timestamp for the last time the scheduled job was modified. | [optional] 
**last_run_duration** | **int** | Optional: Duration of the previous run. | [optional] 
**last_run_start** | **datetime** | Optional: Timestamp for the previous run. | [optional] 
**name** | **str** | Schedule name. | [optional] 
**next_run** | **datetime** | Optional: Timestamp for the next jobrun. | [optional] 
**recipient** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  | [optional] 
**recipients** | [**List[Schedulerv3Recipient]**](Schedulerv3Recipient.md) |  | [optional] 
**report_names** | **List[str]** | Optional: Reports run by this scheduled job. | [optional] 
**schedule_id** | **str** | ID for this record. It is automatically created by the database. | [optional] 
**tags** | **List[str]** | Optional: Tags to use. | [optional] 
**tasks** | [**List[Schedulerv3ScheduledTaskSummary]**](Schedulerv3ScheduledTaskSummary.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_scheduled_job_summary import Schedulerv3ScheduledJobSummary

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ScheduledJobSummary from a JSON string
schedulerv3_scheduled_job_summary_instance = Schedulerv3ScheduledJobSummary.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ScheduledJobSummary.to_json())

# convert the object into a dict
schedulerv3_scheduled_job_summary_dict = schedulerv3_scheduled_job_summary_instance.to_dict()
# create an instance of Schedulerv3ScheduledJobSummary from a dict
schedulerv3_scheduled_job_summary_from_dict = Schedulerv3ScheduledJobSummary.from_dict(schedulerv3_scheduled_job_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


