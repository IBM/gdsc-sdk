# Schedulerv3GetScheduledJobResponse

GetScheduledJobResponse message for Get v3/schedules or v3/schedules/{scheduled_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduled_job** | [**Schedulerv3ScheduledJob**](Schedulerv3ScheduledJob.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_get_scheduled_job_response import Schedulerv3GetScheduledJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3GetScheduledJobResponse from a JSON string
schedulerv3_get_scheduled_job_response_instance = Schedulerv3GetScheduledJobResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3GetScheduledJobResponse.to_json())

# convert the object into a dict
schedulerv3_get_scheduled_job_response_dict = schedulerv3_get_scheduled_job_response_instance.to_dict()
# create an instance of Schedulerv3GetScheduledJobResponse from a dict
schedulerv3_get_scheduled_job_response_from_dict = Schedulerv3GetScheduledJobResponse.from_dict(schedulerv3_get_scheduled_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


