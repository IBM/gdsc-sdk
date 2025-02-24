# Schedulerv3UpdateScheduledJobRequest

UpdateScheduledJobRequest message for Put v3/schedules/ api.  The both fields are required, all other fields are optional.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **Dict[str, str]** | Optional: Update field name and value. | [optional] 
**schedule_id** | **str** | Unique ID, required for update. | [optional] 
**scheduled_job** | [**Schedulerv3CreateScheduledJobRequest**](Schedulerv3CreateScheduledJobRequest.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_update_scheduled_job_request import Schedulerv3UpdateScheduledJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3UpdateScheduledJobRequest from a JSON string
schedulerv3_update_scheduled_job_request_instance = Schedulerv3UpdateScheduledJobRequest.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3UpdateScheduledJobRequest.to_json())

# convert the object into a dict
schedulerv3_update_scheduled_job_request_dict = schedulerv3_update_scheduled_job_request_instance.to_dict()
# create an instance of Schedulerv3UpdateScheduledJobRequest from a dict
schedulerv3_update_scheduled_job_request_from_dict = Schedulerv3UpdateScheduledJobRequest.from_dict(schedulerv3_update_scheduled_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


