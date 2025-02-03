# Schedulerv3CreateScheduledJobResponse

CreateScheduledJobResponse message for Put v3/schedules api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | Result is \&quot;\&quot; if an record is persisted, otherwise an error is returned. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_create_scheduled_job_response import Schedulerv3CreateScheduledJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3CreateScheduledJobResponse from a JSON string
schedulerv3_create_scheduled_job_response_instance = Schedulerv3CreateScheduledJobResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3CreateScheduledJobResponse.to_json())

# convert the object into a dict
schedulerv3_create_scheduled_job_response_dict = schedulerv3_create_scheduled_job_response_instance.to_dict()
# create an instance of Schedulerv3CreateScheduledJobResponse from a dict
schedulerv3_create_scheduled_job_response_from_dict = Schedulerv3CreateScheduledJobResponse.from_dict(schedulerv3_create_scheduled_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


