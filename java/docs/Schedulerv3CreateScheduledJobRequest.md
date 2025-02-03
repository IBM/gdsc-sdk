

# Schedulerv3CreateScheduledJobRequest

CreateScheduledJobRequest message for Post v3/schedules api.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Optional: Description for the scheduledJob. |  [optional] |
|**enabled** | **Boolean** | Optional: Enable or disable. |  [optional] |
|**instructions** | **String** | Optional: The instructions for the recipient. |  [optional] |
|**internalAudit** | **Schedulerv3AuditType** |  |  [optional] |
|**name** | **String** | Name of the schedule. |  [optional] |
|**notification** | **Schedulerv3NotificationType** |  |  [optional] |
|**origin** | **String** |  |  [optional] |
|**recipient** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  |  [optional] |
|**recipients** | [**List&lt;Schedulerv3Recipient&gt;**](Schedulerv3Recipient.md) |  |  [optional] |
|**retention** | [**Schedulerv3Retention**](Schedulerv3Retention.md) |  |  [optional] |
|**scheduler** | [**Schedulerv3Scheduler**](Schedulerv3Scheduler.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional: Tags to use. |  [optional] |
|**tasks** | [**List&lt;Schedulerv3ScheduledTask&gt;**](Schedulerv3ScheduledTask.md) |  |  [optional] |



