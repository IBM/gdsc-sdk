# Complianceacceleratorv3AuditScheduler

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BeginSchedule** | [**time.Time**](time.Time.md) | Begin the schedule on. | [optional] [default to null]
**ByDayOfMonth** | **bool** | Either by day of month or date of the week of month. | [optional] [default to null]
**DayOfMonth** | **string** | The day of the month, combined with frequency &#x3D; 4 because there last day of the month the data type is string. | [optional] [default to null]
**DayOfWeek** | [**[]Schedulerv3DayOfWeek**](schedulerv3DayOfWeek.md) | What day do you want to run , combined with frequency&#x3D; 3, such as Monday, Tuesday. | [optional] [default to null]
**DayOrder** | [***Schedulerv3DayOrder**](schedulerv3DayOrder.md) |  | [optional] [default to null]
**DayOrderDayOfWeek** | [***Schedulerv3DayOfWeek**](schedulerv3DayOfWeek.md) |  | [optional] [default to null]
**EndSchedule** | [**time.Time**](time.Time.md) | End the schedule on , if it is null means never ends. | [optional] [default to null]
**Frequency** | [***Schedulerv3Frequency**](schedulerv3Frequency.md) |  | [optional] [default to null]
**Months** | [**[]Schedulerv3Month**](schedulerv3Month.md) | Month value. | [optional] [default to null]
**NeverEnd** | **bool** | Never end schedule or not. | [optional] [default to null]
**Repeat** | **int32** | Combined with frequency to define how often to run the job. ie, if frequncy &#x3D;1 and repeat &#x3D;3 means run the job every 3 hours. | [optional] [default to null]
**RepeatBegin** | [***Schedulerv3RepeatBegin**](schedulerv3RepeatBegin.md) |  | [optional] [default to null]
**RepeatEnd** | [***Schedulerv3RepeatEnd**](schedulerv3RepeatEnd.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

