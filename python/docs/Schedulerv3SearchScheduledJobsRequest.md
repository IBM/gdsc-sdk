# Schedulerv3SearchScheduledJobsRequest

SearchScheduledJobsRequest message for Post v3/schedules/search api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | Optional: the max amount of rows to return for pagination. | [optional] 
**offset** | **int** | Optional: the amount to offset the rows by for pagination. | [optional] 
**filter** | [**Schedulerv3ScheduledJobsFilter**](Schedulerv3ScheduledJobsFilter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_search_scheduled_jobs_request import Schedulerv3SearchScheduledJobsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3SearchScheduledJobsRequest from a JSON string
schedulerv3_search_scheduled_jobs_request_instance = Schedulerv3SearchScheduledJobsRequest.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3SearchScheduledJobsRequest.to_json())

# convert the object into a dict
schedulerv3_search_scheduled_jobs_request_dict = schedulerv3_search_scheduled_jobs_request_instance.to_dict()
# create an instance of Schedulerv3SearchScheduledJobsRequest from a dict
schedulerv3_search_scheduled_jobs_request_from_dict = Schedulerv3SearchScheduledJobsRequest.from_dict(schedulerv3_search_scheduled_jobs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


