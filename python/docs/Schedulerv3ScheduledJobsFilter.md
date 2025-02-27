# Schedulerv3ScheduledJobsFilter

ScheduledJobsFilter includes all fields used to filter the set of desired scheduled jobs returned.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **str** | Optional: Enabled or not. | [optional] 
**end_time** | **datetime** | Optional: Return records ending time. | [optional] 
**ignore_acl** | **bool** |  | [optional] 
**name_filter** | **List[str]** | Optional: Filter by report name. | [optional] 
**start_time** | **datetime** | Optional: Return records starting at this time (&gt;&#x3D;). | [optional] 
**status_filter** | [**List[Schedulerv3ExecutionStatus]**](Schedulerv3ExecutionStatus.md) | Optional: Filter by status. | [optional] 
**tag_filter** | **str** | Optional: Filter by tags. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_jobs_filter import Schedulerv3ScheduledJobsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ScheduledJobsFilter from a JSON string
schedulerv3_scheduled_jobs_filter_instance = Schedulerv3ScheduledJobsFilter.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ScheduledJobsFilter.to_json())

# convert the object into a dict
schedulerv3_scheduled_jobs_filter_dict = schedulerv3_scheduled_jobs_filter_instance.to_dict()
# create an instance of Schedulerv3ScheduledJobsFilter from a dict
schedulerv3_scheduled_jobs_filter_from_dict = Schedulerv3ScheduledJobsFilter.from_dict(schedulerv3_scheduled_jobs_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


