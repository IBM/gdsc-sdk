# Schedulerv3SearchScheduledTaskRunsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**record_count** | **int** | Total number of the scheduled job runs. | [optional] 
**runs** | [**List[Schedulerv3ScheduledJobRun]**](Schedulerv3ScheduledJobRun.md) | The requested scheduled job data. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_search_scheduled_task_runs_response import Schedulerv3SearchScheduledTaskRunsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3SearchScheduledTaskRunsResponse from a JSON string
schedulerv3_search_scheduled_task_runs_response_instance = Schedulerv3SearchScheduledTaskRunsResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3SearchScheduledTaskRunsResponse.to_json())

# convert the object into a dict
schedulerv3_search_scheduled_task_runs_response_dict = schedulerv3_search_scheduled_task_runs_response_instance.to_dict()
# create an instance of Schedulerv3SearchScheduledTaskRunsResponse from a dict
schedulerv3_search_scheduled_task_runs_response_from_dict = Schedulerv3SearchScheduledTaskRunsResponse.from_dict(schedulerv3_search_scheduled_task_runs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


