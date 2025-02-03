

# Schedulerv3Scheduler

Scheduler includes all fields used to schedule a report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beginSchedule** | **OffsetDateTime** | Begin the schedule on. |  [optional] |
|**byDayOfMonth** | **Boolean** | Either by day of month or date of the week of month. |  [optional] |
|**dayOfMonth** | **String** | The day of the month, combined with frequency &#x3D; 4 because there last day of the month the data type is string. |  [optional] |
|**dayOfWeek** | **List&lt;Schedulerv3DayOfWeek&gt;** | What day do you want to run, combined with frequency&#x3D; 3, such as Monday, Tuesday. |  [optional] |
|**dayOrder** | **Schedulerv3DayOrder** |  |  [optional] |
|**dayOrderDayOfWeek** | **Schedulerv3DayOfWeek** |  |  [optional] |
|**endSchedule** | **OffsetDateTime** | End the schedule on, if it is null means never ends. |  [optional] |
|**frequency** | **Schedulerv3Frequency** |  |  [optional] |
|**months** | **List&lt;Schedulerv3Month&gt;** | Month value. |  [optional] |
|**neverEnd** | **Boolean** | Never end schedule or not. |  [optional] |
|**repeat** | **Integer** | Combined with frequency to define how often to run the job. ie, if frequncy &#x3D;1 and repeat &#x3D;3 means run the job every 3 hours. |  [optional] |
|**repeatBegin** | [**Schedulerv3RepeatBegin**](Schedulerv3RepeatBegin.md) |  |  [optional] |
|**repeatEnd** | [**Schedulerv3RepeatEnd**](Schedulerv3RepeatEnd.md) |  |  [optional] |
|**repeatMinutes** | **Integer** | Combined with frequency to define how often to run the job. ie, if frequncy &#x3D;1 and repeat &#x3D;3 and repeat_minutes &#x3D; 4 means run the job every 3 hours within each hour, run every 4 minutes. |  [optional] |
|**runOnceNow** | **Boolean** | Optional: Flag if run once right away. |  [optional] |



