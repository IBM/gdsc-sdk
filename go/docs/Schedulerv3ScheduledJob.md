# Schedulerv3ScheduledJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreationTime** | [**time.Time**](time.Time.md) | Optional: Timestamp when the scheduled job is created. | [optional] [default to null]
**Description** | **string** | Optional: Description for the scheduledJob. | [optional] [default to null]
**Enabled** | **bool** | Enabled or disable the schedule. | [optional] [default to null]
**Expired** | **bool** | Optional: If this schedule is expired or continues forever. | [optional] [default to null]
**Instructions** | **string** | Optional: Instructions for the recipient. | [optional] [default to null]
**InternalAudit** | [***Schedulerv3AuditType**](schedulerv3AuditType.md) |  | [optional] [default to null]
**LastModifiedTime** | [**time.Time**](time.Time.md) | Optional: Timestamp for the last modified time. | [optional] [default to null]
**Name** | **string** | Schedule name. | [optional] [default to null]
**NextRun** | [**time.Time**](time.Time.md) | Optional: Timestamp for the next jobrun. | [optional] [default to null]
**Notification** | [***Schedulerv3NotificationType**](schedulerv3NotificationType.md) |  | [optional] [default to null]
**Origin** | **string** | Where does the schedule come from, ie the micro service name , REPORTS or SCHEDULER. | [optional] [default to null]
**PreviousRun** | [**time.Time**](time.Time.md) | Optional: Timestamp for the previous job run. | [optional] [default to null]
**Recipient** | [***Schedulerv3Recipient**](schedulerv3Recipient.md) |  | [optional] [default to null]
**Recipients** | [**[]Schedulerv3Recipient**](schedulerv3Recipient.md) |  | [optional] [default to null]
**Retention** | [***Schedulerv3Retention**](schedulerv3Retention.md) |  | [optional] [default to null]
**ScheduleId** | **string** | Optional: ID for this record. It is automatically created by the database. | [optional] [default to null]
**Scheduler** | [***Schedulerv3Scheduler**](schedulerv3Scheduler.md) |  | [optional] [default to null]
**Tags** | **[]string** | Optional: Tags to use. | [optional] [default to null]
**Tasks** | [**[]Schedulerv3ScheduledTask**](schedulerv3ScheduledTask.md) | What to run. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

