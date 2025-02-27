# schedulerv3CreateScheduledJobRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] [default to null]
**enabled** | **boolean** |  | [optional] [default to null]
**instructions** | **string** |  | [optional] [default to null]
**internalUnderscoreaudit** | [**Schedulerv3AuditType**](Schedulerv3AuditType.md) |  | [optional] [default to null]
**name** | **string** |  | [optional] [default to null]
**notification** | [**Schedulerv3NotificationType**](Schedulerv3NotificationType.md) |  | [optional] [default to null]
**origin** | **string** | ONLINE, REPORTS, or SCHEDULER | [optional] [default to null]
**recipient** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  | [optional] [default to null]
**recipients** | [**array[Schedulerv3Recipient]**](Schedulerv3Recipient.md) | Optional: The recipients of the notification when the entire job completes | [optional] [default to null]
**retention** | [**Schedulerv3Retention**](Schedulerv3Retention.md) |  | [optional] [default to null]
**scheduler** | [**Schedulerv3Scheduler**](Schedulerv3Scheduler.md) |  | [optional] [default to null]
**tags** | **array[string]** |  | [optional] [default to null]
**tasks** | [**array[Schedulerv3ScheduledTask]**](Schedulerv3ScheduledTask.md) | Array of sequential jobs to run | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


