# Schedulerv3Scheduler

Scheduler includes all fields used to schedule a report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**begin_schedule** | **datetime** | Begin the schedule on. | [optional] 
**by_day_of_month** | **bool** | Either by day of month or date of the week of month. | [optional] 
**day_of_month** | **str** | The day of the month, combined with frequency &#x3D; 4 because there last day of the month the data type is string. | [optional] 
**day_of_week** | [**List[Schedulerv3DayOfWeek]**](Schedulerv3DayOfWeek.md) | What day do you want to run, combined with frequency&#x3D; 3, such as Monday, Tuesday. | [optional] 
**day_order** | [**Schedulerv3DayOrder**](Schedulerv3DayOrder.md) |  | [optional] 
**day_order_day_of_week** | [**Schedulerv3DayOfWeek**](Schedulerv3DayOfWeek.md) |  | [optional] 
**end_schedule** | **datetime** | End the schedule on, if it is null means never ends. | [optional] 
**frequency** | [**Schedulerv3Frequency**](Schedulerv3Frequency.md) |  | [optional] 
**months** | [**List[Schedulerv3Month]**](Schedulerv3Month.md) | Month value. | [optional] 
**never_end** | **bool** | Never end schedule or not. | [optional] 
**repeat** | **int** | Combined with frequency to define how often to run the job. ie, if frequncy &#x3D;1 and repeat &#x3D;3 means run the job every 3 hours. | [optional] 
**repeat_begin** | [**Schedulerv3RepeatBegin**](Schedulerv3RepeatBegin.md) |  | [optional] 
**repeat_end** | [**Schedulerv3RepeatEnd**](Schedulerv3RepeatEnd.md) |  | [optional] 
**repeat_minutes** | **int** | Combined with frequency to define how often to run the job. ie, if frequncy &#x3D;1 and repeat &#x3D;3 and repeat_minutes &#x3D; 4 means run the job every 3 hours within each hour, run every 4 minutes. | [optional] 
**run_once_now** | **bool** | Optional: Flag if run once right away. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_scheduler import Schedulerv3Scheduler

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3Scheduler from a JSON string
schedulerv3_scheduler_instance = Schedulerv3Scheduler.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3Scheduler.to_json())

# convert the object into a dict
schedulerv3_scheduler_dict = schedulerv3_scheduler_instance.to_dict()
# create an instance of Schedulerv3Scheduler from a dict
schedulerv3_scheduler_from_dict = Schedulerv3Scheduler.from_dict(schedulerv3_scheduler_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


