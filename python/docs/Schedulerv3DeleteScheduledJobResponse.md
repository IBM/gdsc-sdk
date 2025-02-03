# Schedulerv3DeleteScheduledJobResponse

DeleteScheduledJobResponse message for delete v3/schedules/{schedule_id}.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_delete_scheduled_job_response import Schedulerv3DeleteScheduledJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3DeleteScheduledJobResponse from a JSON string
schedulerv3_delete_scheduled_job_response_instance = Schedulerv3DeleteScheduledJobResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3DeleteScheduledJobResponse.to_json())

# convert the object into a dict
schedulerv3_delete_scheduled_job_response_dict = schedulerv3_delete_scheduled_job_response_instance.to_dict()
# create an instance of Schedulerv3DeleteScheduledJobResponse from a dict
schedulerv3_delete_scheduled_job_response_from_dict = Schedulerv3DeleteScheduledJobResponse.from_dict(schedulerv3_delete_scheduled_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


