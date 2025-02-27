# Schedulerv3ScheduledJobSummaryResponse

ScheduledJobSummaryResponse message for Get v3/schedules or v3/schedules/search api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**record_count** | **int** | Total number of the scheduled jobs. | [optional] 
**report_names** | [**List[Schedulerv3ReportArray]**](Schedulerv3ReportArray.md) | Array of report name for each scheduledJobSummary. | [optional] 
**scheduled_job** | [**List[Schedulerv3ScheduledJobSummary]**](Schedulerv3ScheduledJobSummary.md) | The requested scheduled job data. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_job_summary_response import Schedulerv3ScheduledJobSummaryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ScheduledJobSummaryResponse from a JSON string
schedulerv3_scheduled_job_summary_response_instance = Schedulerv3ScheduledJobSummaryResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ScheduledJobSummaryResponse.to_json())

# convert the object into a dict
schedulerv3_scheduled_job_summary_response_dict = schedulerv3_scheduled_job_summary_response_instance.to_dict()
# create an instance of Schedulerv3ScheduledJobSummaryResponse from a dict
schedulerv3_scheduled_job_summary_response_from_dict = Schedulerv3ScheduledJobSummaryResponse.from_dict(schedulerv3_scheduled_job_summary_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


