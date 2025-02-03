

# Schedulerv3ScheduledJobSummary

ScheduledJobSummary returns enough details for list view.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationTime** | **OffsetDateTime** | Optional: Timestamp when the scheduled job was created. |  [optional] |
|**description** | **String** | Optional: Description for the scheduledJob. |  [optional] |
|**enabled** | **Boolean** | Enabled or disable the schedule. |  [optional] |
|**expired** | **Boolean** | Optional: If this schedule is expired or continues forever. |  [optional] |
|**frequency** | **Schedulerv3Frequency** |  |  [optional] |
|**lastModifiedTime** | **OffsetDateTime** | Optional: Timestamp for the last time the scheduled job was modified. |  [optional] |
|**lastRunDuration** | **Long** | Optional: Duration of the previous run. |  [optional] |
|**lastRunStart** | **OffsetDateTime** | Optional: Timestamp for the previous run. |  [optional] |
|**name** | **String** | Schedule name. |  [optional] |
|**nextRun** | **OffsetDateTime** | Optional: Timestamp for the next jobrun. |  [optional] |
|**recipient** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  |  [optional] |
|**recipients** | [**List&lt;Schedulerv3Recipient&gt;**](Schedulerv3Recipient.md) |  |  [optional] |
|**reportNames** | **List&lt;String&gt;** | Optional: Reports run by this scheduled job. |  [optional] |
|**scheduleId** | **String** | ID for this record. It is automatically created by the database. |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional: Tags to use. |  [optional] |
|**tasks** | [**List&lt;Schedulerv3ScheduledTaskSummary&gt;**](Schedulerv3ScheduledTaskSummary.md) |  |  [optional] |



