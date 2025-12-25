# Complianceacceleratorv3AuditScheduler

Audit scheduler.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**begin_schedule** | **datetime** | Begin the schedule on. | [optional] 
**by_day_of_month** | **bool** | Either by day of month or date of the week of month. | [optional] 
**day_of_month** | **str** | The day of the month, combined with frequency &#x3D; 4 because there last day of the month the data type is string. | [optional] 
**day_of_week** | [**List[Schedulerv3DayOfWeek]**](Schedulerv3DayOfWeek.md) | What day do you want to run , combined with frequency&#x3D; 3, such as Monday, Tuesday. | [optional] 
**day_order** | [**Schedulerv3DayOrder**](Schedulerv3DayOrder.md) |  | [optional] [default to Schedulerv3DayOrder.UNDEFINED_ORDER]
**day_order_day_of_week** | [**Schedulerv3DayOfWeek**](Schedulerv3DayOfWeek.md) |  | [optional] [default to Schedulerv3DayOfWeek.UNDEFINED_DAY]
**end_schedule** | **datetime** | End the schedule on , if it is null means never ends. | [optional] 
**frequency** | [**Schedulerv3Frequency**](Schedulerv3Frequency.md) |  | [optional] [default to Schedulerv3Frequency.UNDEFINED_FREQUENCY]
**months** | [**List[Schedulerv3Month]**](Schedulerv3Month.md) | Month value. | [optional] 
**never_end** | **bool** | Never end schedule or not. | [optional] 
**repeat** | **int** | Combined with frequency to define how often to run the job. ie, if frequncy &#x3D;1 and repeat &#x3D;3 means run the job every 3 hours. | [optional] 
**repeat_begin** | [**Schedulerv3RepeatBegin**](Schedulerv3RepeatBegin.md) |  | [optional] 
**repeat_end** | [**Schedulerv3RepeatEnd**](Schedulerv3RepeatEnd.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_audit_scheduler import Complianceacceleratorv3AuditScheduler

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3AuditScheduler from a JSON string
complianceacceleratorv3_audit_scheduler_instance = Complianceacceleratorv3AuditScheduler.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3AuditScheduler.to_json())

# convert the object into a dict
complianceacceleratorv3_audit_scheduler_dict = complianceacceleratorv3_audit_scheduler_instance.to_dict()
# create an instance of Complianceacceleratorv3AuditScheduler from a dict
complianceacceleratorv3_audit_scheduler_from_dict = Complianceacceleratorv3AuditScheduler.from_dict(complianceacceleratorv3_audit_scheduler_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


