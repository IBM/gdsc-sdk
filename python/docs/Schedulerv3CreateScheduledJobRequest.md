# Schedulerv3CreateScheduledJobRequest

CreateScheduledJobRequest message for Post v3/schedules api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Optional: Description for the scheduledJob. | [optional] 
**enabled** | **bool** | Optional: Enable or disable. | [optional] 
**instructions** | **str** | Optional: The instructions for the recipient. | [optional] 
**internal_audit** | [**Schedulerv3AuditType**](Schedulerv3AuditType.md) |  | [optional] 
**name** | **str** | Name of the schedule. | [optional] 
**notification** | [**Schedulerv3NotificationType**](Schedulerv3NotificationType.md) |  | [optional] 
**origin** | **str** |  | [optional] 
**recipient** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  | [optional] 
**recipients** | [**List[Schedulerv3Recipient]**](Schedulerv3Recipient.md) |  | [optional] 
**retention** | [**Schedulerv3Retention**](Schedulerv3Retention.md) |  | [optional] 
**scheduler** | [**Schedulerv3Scheduler**](Schedulerv3Scheduler.md) |  | [optional] 
**tags** | **List[str]** | Optional: Tags to use. | [optional] 
**tasks** | [**List[Schedulerv3ScheduledTask]**](Schedulerv3ScheduledTask.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_create_scheduled_job_request import Schedulerv3CreateScheduledJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3CreateScheduledJobRequest from a JSON string
schedulerv3_create_scheduled_job_request_instance = Schedulerv3CreateScheduledJobRequest.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3CreateScheduledJobRequest.to_json())

# convert the object into a dict
schedulerv3_create_scheduled_job_request_dict = schedulerv3_create_scheduled_job_request_instance.to_dict()
# create an instance of Schedulerv3CreateScheduledJobRequest from a dict
schedulerv3_create_scheduled_job_request_from_dict = Schedulerv3CreateScheduledJobRequest.from_dict(schedulerv3_create_scheduled_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


