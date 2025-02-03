# Schedulerv3UpdateScheduledJobResponse

UpdateScheduledJobResponse message for Put v3/schedules/ api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | Result is \&quot;\&quot; if record is persisted, otherwise an error is returned. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_update_scheduled_job_response import Schedulerv3UpdateScheduledJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3UpdateScheduledJobResponse from a JSON string
schedulerv3_update_scheduled_job_response_instance = Schedulerv3UpdateScheduledJobResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3UpdateScheduledJobResponse.to_json())

# convert the object into a dict
schedulerv3_update_scheduled_job_response_dict = schedulerv3_update_scheduled_job_response_instance.to_dict()
# create an instance of Schedulerv3UpdateScheduledJobResponse from a dict
schedulerv3_update_scheduled_job_response_from_dict = Schedulerv3UpdateScheduledJobResponse.from_dict(schedulerv3_update_scheduled_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


