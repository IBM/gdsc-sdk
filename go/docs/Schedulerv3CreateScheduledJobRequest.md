# Schedulerv3CreateScheduledJobRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** | Optional: Description for the scheduledJob. | [optional] [default to null]
**Enabled** | **bool** | Optional: Enable or disable. | [optional] [default to null]
**Instructions** | **string** | Optional: The instructions for the recipient. | [optional] [default to null]
**InternalAudit** | [***Schedulerv3AuditType**](schedulerv3AuditType.md) |  | [optional] [default to null]
**Name** | **string** | Name of the schedule. | [optional] [default to null]
**Notification** | [***Schedulerv3NotificationType**](schedulerv3NotificationType.md) |  | [optional] [default to null]
**Origin** | **string** |  | [optional] [default to null]
**Recipient** | [***Schedulerv3Recipient**](schedulerv3Recipient.md) |  | [optional] [default to null]
**Recipients** | [**[]Schedulerv3Recipient**](schedulerv3Recipient.md) |  | [optional] [default to null]
**Retention** | [***Schedulerv3Retention**](schedulerv3Retention.md) |  | [optional] [default to null]
**Scheduler** | [***Schedulerv3Scheduler**](schedulerv3Scheduler.md) |  | [optional] [default to null]
**Tags** | **[]string** | Optional: Tags to use. | [optional] [default to null]
**Tasks** | [**[]Schedulerv3ScheduledTask**](schedulerv3ScheduledTask.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

