

# Schedulerv3ScheduledJob

ScheduledJob holds the configurations for running and delivering a job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationTime** | **OffsetDateTime** | Optional: Timestamp when the scheduled job is created. |  [optional] |
|**description** | **String** | Optional: Description for the scheduledJob. |  [optional] |
|**enabled** | **Boolean** | Enabled or disable the schedule. |  [optional] |
|**expired** | **Boolean** | Optional: If this schedule is expired or continues forever. |  [optional] |
|**instructions** | **String** | Optional: Instructions for the recipient. |  [optional] |
|**internalAudit** | **Schedulerv3AuditType** |  |  [optional] |
|**lastModifiedTime** | **OffsetDateTime** | Optional: Timestamp for the last modified time. |  [optional] |
|**name** | **String** | Schedule name. |  [optional] |
|**nextRun** | **OffsetDateTime** | Optional: Timestamp for the next jobrun. |  [optional] |
|**notification** | **Schedulerv3NotificationType** |  |  [optional] |
|**origin** | **String** | Where does the schedule come from, ie the micro service name , REPORTS or SCHEDULER. |  [optional] |
|**previousRun** | **OffsetDateTime** | Optional: Timestamp for the previous job run. |  [optional] |
|**recipient** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  |  [optional] |
|**recipients** | [**List&lt;Schedulerv3Recipient&gt;**](Schedulerv3Recipient.md) |  |  [optional] |
|**retention** | [**Schedulerv3Retention**](Schedulerv3Retention.md) |  |  [optional] |
|**scheduleId** | **String** | Optional: ID for this record. It is automatically created by the database. |  [optional] |
|**scheduler** | [**Schedulerv3Scheduler**](Schedulerv3Scheduler.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional: Tags to use. |  [optional] |
|**tasks** | [**List&lt;Schedulerv3ScheduledTask&gt;**](Schedulerv3ScheduledTask.md) | What to run. |  [optional] |



