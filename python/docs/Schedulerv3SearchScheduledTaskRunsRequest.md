# Schedulerv3SearchScheduledTaskRunsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | Optional: the max amount of rows to return for pagination. | [optional] 
**offset** | **int** | Optional: the amount to offset the rows by for pagination. | [optional] 
**scheduled_job_id** | **List[str]** | Optional: specicified ScheduledJobs. | [optional] 
**with_latest** | **bool** | Optional: whether return latest runs for ScheduledJobs. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_search_scheduled_task_runs_request import Schedulerv3SearchScheduledTaskRunsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3SearchScheduledTaskRunsRequest from a JSON string
schedulerv3_search_scheduled_task_runs_request_instance = Schedulerv3SearchScheduledTaskRunsRequest.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3SearchScheduledTaskRunsRequest.to_json())

# convert the object into a dict
schedulerv3_search_scheduled_task_runs_request_dict = schedulerv3_search_scheduled_task_runs_request_instance.to_dict()
# create an instance of Schedulerv3SearchScheduledTaskRunsRequest from a dict
schedulerv3_search_scheduled_task_runs_request_from_dict = Schedulerv3SearchScheduledTaskRunsRequest.from_dict(schedulerv3_search_scheduled_task_runs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


